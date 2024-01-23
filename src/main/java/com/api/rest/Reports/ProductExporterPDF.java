package com.api.rest.Reports;

import com.api.rest.Domain.Product;
import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.*;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class ProductExporterPDF {

    private List<Product> listProducts;

    public ProductExporterPDF(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    private void writeTableHeader(PdfPTable table){
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.blue);
        cell.setPadding(5);

        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);

        cell.setPhrase(new Phrase("id", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("name", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("reference", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("price", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("weigth", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("category", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("stock", font));
        table.addCell(cell);

    }

    private void writeTableData(PdfPTable table) {
        for (Product product : listProducts) {
            table.addCell(String.valueOf(product.getId()));
            table.addCell(product.getName());
            table.addCell(product.getReference());
            table.addCell(String.valueOf(product.getPrice()));
            table.addCell(String.valueOf(product.getWeight()));
            table.addCell(product.getCategory());
            table.addCell(String.valueOf(product.getStock()));
        }
    }
    public void  export(HttpServletResponse response) throws IOException {

        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();

        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(Color.blue);

        Paragraph p = new Paragraph("List of products", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);

        document.add(p);

        PdfPTable table = new PdfPTable(7);
        table.setWidthPercentage(100f);
        table.setWidths(new float[]{3f,3f,3f,3f,3f,3f,3f});
        table.setSpacingBefore(10);

        writeTableHeader(table);
        writeTableData(table);

        document.add(table);

        document.close();

    }
}
