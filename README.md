# CompiladoresAntlrSpring

# Proyecto de Inventario con Spring Boot y ANTLR

Este proyecto es una API REST para gestionar un inventario de productos. Permite añadir, eliminar, actualizar y consultar elementos en el inventario, así como mantener un historial de cambios en los elementos. Está construido con **Spring Boot** y utiliza **ANTLR** para el análisis y procesamiento de cadenas de texto (en este caso, el modelo ANTLR ya está importado en el proyecto).

## Tabla de Contenidos
- [Tecnologías](#tecnologías)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Modelos de Datos](#modelos-de-datos)
- [Servicios](#servicios)
- [Controladores](#controladores)
- [Endpoints de la API](#endpoints-de-la-api)
- [Instalación y Ejecución](#instalación-y-ejecución)
- [Pruebas de la API](#pruebas-de-la-api)
- [Dockerización y Despliegue](#dockerización-y-despliegue)

## Tecnologías

- **Java 11+**
- **Spring Boot**
- **ANTLR 4** - Utilizado para análisis de cadenas de texto
- **Maven** - Gestión de dependencias
- **Insomnia** o **Postman** - Herramienta de prueba para la API REST

## Estructura del Proyecto

El proyecto sigue la estructura estándar de Spring Boot, con carpetas para modelos, servicios y controladores bajo `src/main/com/inventory/antlr`

```txt
src/ 
└── main/ 
    └── java/com/inventory/antlr/ 
        ├── model/ 
            │ 
            ├── Change.java 
            │ 
            └── Item.java 
        ├── service/ 
            │ 
            └── InventoryService.java 
        └── controller/    
            │ 
            └── InventoryController.java
```

## Modelos de Datos

- **Item**: Representa un elemento en el inventario.
  - **name**: Nombre del elemento.
  - **quantity**: Cantidad en stock.
  - **description**: Descripción del elemento.
  - **category**: Categoría a la que pertenece el elemento.

- **Change**: Registra cada acción realizada en el inventario.
  - **action**: Tipo de acción (`ADD`, `REMOVE`, `UPDATE`, `UPDATE_DESC`).
  - **name**: Nombre del elemento afectado.
  - **quantity**: Cantidad modificada.
  - **description**: Descripción actual del elemento.
  - **category**: Categoría actual del elemento.
  - **timestamp**: Fecha y hora del cambio.

## Servicios

- **InventoryService**: Proporciona la lógica de negocio para gestionar el inventario.
  - `addItem`: Agrega un elemento al inventario.
  - `removeItem`: Elimina un elemento del inventario.
  - `updateItemQuantity`: Actualiza la cantidad de un elemento.
  - `updateItemDescription`: Actualiza la descripción de un elemento.
  - `updateItemCategory`: Actualiza la categoría de un elemento.
  - `showInventory`: Devuelve la lista actual de elementos en el inventario.
  - `showHistory`: Muestra el historial de cambios.
  - `searchByCategory`: Busca elementos por categoría.
  - `searchByDescription`: Busca elementos por descripcion.
  - `searchByName`: Busca elementos por nombre.

## Controladores

- **InventoryController**: Expone los endpoints de la API REST para interactuar con el inventario.

## Endpoints de la API

| Método | Endpoint                         | Descripción                                     |
|--------|----------------------------------|-------------------------------------------------|
| POST   | `/inventory/add`                 | Agrega un nuevo elemento al inventario          |
| DELETE | `/inventory/remove`              | Elimina un elemento del inventario              |
| PUT    | `/inventory/updateQuantity`      | Actualiza la cantidad de un elemento            |
| PUT    | `/inventory/updateDescription`   | Actualiza la descripción de un elemento         |
| PUT    | `/inventory/updateCategory`      | Actualiza la categoría de un elemento           |
| GET    | `/inventory/show`                | Muestra todos los elementos del inventario      |
| GET    | `/inventory/history`             | Muestra el historial de cambios                 |
| GET    | `/inventory/searchByCategory`    | Busca elementos por categoría                   |
| GET    | `/inventory/searchByDescription` | Busca elementos por descripción                 |
| GET    | `/inventory/searchByName`        | Busca elementos por nombre                      |



### Ejemplo de Pruebas en Insomnia/Endpoints

- **Agregar un Elemento**  
  - URL: `http://localhost:8080/inventory/add`
  - Método: `POST`
  - Parámetros de Consulta: `http://localhost:8080/inventory/add?name=Item1&quantity=10&description=Descripción1&category=Categoría1`

- **Eliminar un Elemento**  
  - URL: `http://localhost:8080/inventory/remove`
  - Método: `DELETE`
  - Parámetros de Consulta: `http://localhost:8080/inventory/remove?name=Item1`

- **Actualizar Cantidad de un Elemento**  
  - URL: `http://localhost:8080/inventory/updateQuantity`
  - Método: `PUT`
  - Parámetros de Consulta: `http://localhost:8080/inventory/updateQuantity?name=Item1&quantity=20`

- **Actualizar Descripción de un Elemento**  
  - URL: `http://localhost:8080/inventory/updateDescription`
  - Método: `PUT`
  - Parámetros de Consulta: `http://localhost:8080/inventory/updateDescription?name=Item1&newDescription=NuevaDescripción`

- **Actualizar Categoría de un Elemento**  
  - URL: `http://localhost:8080/inventory/updateCategory`
  - Método: `PUT`
  - Parámetros de Consulta: `http://localhost:8080/inventory/updateCategory?name=Item1&newCategory=NuevaCategoría`

- **Buscar Elemento por Categoría**  
  - URL: `http://localhost:8080/inventory/searchByCategory`
  - Método: `GET`
  - Parámetros de Consulta: `http://localhost:8080/inventory/searchByCategory?category=Categoría1`

- **Buscar Elemento por Descripción**  
  - URL: `http://localhost:8080/inventory/searchByDescription`
  - Método: `GET`
  - Parámetros de Consulta: `http://localhost:8080/inventory/searchByDescription?description=Descripción1`

- **Buscar Elemento por Nombre**   
  - URL: `http://localhost:8080/inventory/searchByName`
  - Método: `GET`
  - Parámetros de Consulta: `http://localhost:8080/inventory/searchByName?name=Nombre1`

- **Mostrar Inventario**  
  - URL: `http://localhost:8080/inventory/show`
  - Método: `GET`

- **Mostrar Historial**  
  - URL: `http://localhost:8080/inventory/history`
  - Método: `GET`

## Instalación y Ejecución

### Prerrequisitos
- Java 11+
- Maven

### Ejecución Local

1. Clona el repositorio y navega a la raíz del proyecto.
2. Ejecuta el siguiente comando para compilar y ejecutar el proyecto:

   ```bash
   ./mvnw spring-boot:run
   ```

## Dockerización y Publicación en Docker Hub
- **Construir imagen de docker**
```txt
docker build -t nombre_usuario/inventory-app .

(ejemplo: 
docker build -t nombre_usuario/inventory-app .)
```

- **Crear y ejecutar contenedor**
```txt
docker run -p 8080:8080 --name <nombre-contenedor> <nombre-de-imagen>

(ejemplo: 
docker run -p 8080:8080 --name inventory-container nombre_usuario/inventory-app)
```

- **Acceder al contenedor en ejecución**
```txt
docker exec -it <nombre-contenedor> /bin/bash
```

- **Etiquetar y Publicar la imagen en DockerHub**
```txt
docker login
docker tag <nombre-de-imagen> <usuario-dockerhub>/<nombre-de-imagen>:latest
docker push <usuario-dockerhub>/<nombre-de-imagen>:latest

(ejemplo:
docker tag nombre_usuario/inventory-app nombre_usuario/inventory-app:latest
docker push nombre_usuario/inventory-app:latest)
```

### Otros Comandos Útiles

- **Iniciar un contenedor detenido**
```txt
docker start <nombre-contenedor>
```
- **Detener un contenedor en ejecución**
```txt
docker stop <nombre-contenedor>
```

