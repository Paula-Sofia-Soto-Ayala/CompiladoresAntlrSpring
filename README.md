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
  - `showInventory`: Devuelve la lista actual de elementos en el inventario.
  - `showHistory`: Muestra el historial de cambios.
  - `searchByCategory`: Busca elementos por categoría.

## Controladores

- **InventoryController**: Expone los endpoints de la API REST para interactuar con el inventario.

## Endpoints de la API

| Método | Endpoint                         | Descripción                                     |
|--------|----------------------------------|-------------------------------------------------|
| POST   | `/inventory/add`                 | Agrega un nuevo elemento al inventario          |
| DELETE | `/inventory/remove`              | Elimina un elemento del inventario              |
| PUT    | `/inventory/updateQuantity`      | Actualiza la cantidad de un elemento            |
| PUT    | `/inventory/updateDescription`   | Actualiza la descripción de un elemento         |
| GET    | `/inventory/show`                | Muestra todos los elementos del inventario      |
| GET    | `/inventory/history`             | Muestra el historial de cambios                 |
| GET    | `/inventory/searchByCategory`    | Busca elementos por categoría                   |

### Ejemplo de Pruebas en Insomnia

- **Agregar un Elemento**  
  - URL: `http://localhost:8080/inventory/add`
  - Método: `POST`
  - Parámetros de Consulta: `name=Item1&quantity=10&description=Descripción1&category=Categoría1`

- **Mostrar Inventario**  
  - URL: `http://localhost:8080/inventory/show`
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

