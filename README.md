# Api-Rest-Intermedian (Gestión de Inventarios de Tienda)

| API REST |  SpringBoot | Spring JPA | Hibernate | Oracle SQL | Swagger | Docker |

![api-swagger-reportes (1)](https://github.com/Julian1699/Api-Easy-Shop/assets/114323630/3df819a6-57cb-409b-a247-9136c67a390f)

# Configuración de la Base de Datos:

Antes de ejecutar la API sin inconvenientes, es crucial configurar la base de datos. En este proyecto, hemos utilizado SQL Developer como gestor de base de datos. No obstante, el diseño del proyecto permite la conexión con otras bases de datos como MySQL y PostgreSQL, gracias a que las dependencias necesarias se encuentran definidas en el archivo pom.xml.

![image](https://github.com/Julian1699/Api-Easy-Shop/assets/114323630/9ab005f3-c640-49de-b983-e64dbbe4a8e3)

# Datos de prueba:

Se incluye un archivo .sql que contiene scripts para insertar datos en la base de datos una vez que la API esté en funcionamiento.

![image](https://github.com/Julian1699/Api-Easy-Shop/assets/114323630/cb1a38b9-f772-4901-be0b-085b38016365)

# Tecnologías Utilizadas:

- API REST con SpringBoot
- Spring JPA y Hibernate
- Oracle SQL como gestor de base de datos (compatible con PostgreSQL, MySQL y Oracle SQL)
- Swagger para documentación
- Generación de reportes en PDF y Excel

# Características Principales:

API diseñada para gestionar el inventario de productos de una tienda.
Incluye funcionalidades para crear, leer, actualizar, eliminar y buscar productos.

# Endpoints:

- GET /api/v1/product/all: Obtiene todos los productos.
- POST /api/v1/product/post: Agrega un nuevo producto.
- PUT /api/v1/product/put/{id}: Actualiza un producto existente.
- DELETE /api/v1/product/delete/{id}: Elimina un producto.
- GET /api/v1/product/id/{id}: Obtiene un producto por su ID.
- GET /api/v1/product/search/{search}: Busca productos por nombre, referencia o categoría.
- GET /api/v1/product/export/pdf: Genera un reporte en formato PDF de todos los productos.
- GET /api/v1/product/export/excel: Genera un reporte en formato Excel de todos los productos.
  
# Documentación y Pruebas:

- Disponible en Swagger: http://localhost:8080/swagger-ui/index.html#/
- La API está diseñada para ser intuitiva y fácil de usar para desarrolladores.
  
# Comentarios Adicionales:

- La API está construida con Java 17 y Spring Boot 3.0.10.
- Utiliza Spring Data JPA para simplificar el acceso y la gestión de bases de datos.
- Incluye Hibernate Validator para la validación de datos.
- Utiliza Lombok para reducir el código repetitivo.
- Implementa Cross-Origin Resource Sharing (CORS) para permitir solicitudes entre dominios.

# Documentación

La documentación de la API está disponible en Swagger: http://localhost:8080/swagger-ui/index.html#/

![image](https://github.com/Julian1699/Api-Rest-Intermedian/assets/114323630/2cfe3ae7-b943-49fa-8749-b208f9501bf5)

# Endpoints

Los endpoints de la API son los siguientes:

- PUT /api/v1/product/put/{id}: Actualiza un producto existente.
- POST /api/v1/product/post: Agrega un nuevo producto.
- GET /api/v1/product/search/{search}: Busca productos por nombre, referencia o categoría.
- GET /api/v1/product/id/{id}: Obtiene un producto por ID.
- GET /api/v1/product/all: Obtiene todos los productos.
- DELETE /api/v1/product/delete/{id}: Elimina un producto existente.
