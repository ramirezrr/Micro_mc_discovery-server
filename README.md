# Micro_mc_discovery-server

- **Título**: `Micro_mc_discovery-server`
- **Versión**: `1.0.0`
- **Autor**: `Rodrigo R.`
- **Curso**: `Mitocode`

## Descripción
Este proyecto es una implementación de **Eureka Server** utilizando **Spring Boot** y **Spring Cloud Netflix**. Actúa como un servidor de descubrimiento de servicios, donde las aplicaciones microservicios pueden registrarse y descubrir otros servicios en un entorno distribuido. El proyecto incluye tres instancias del servidor Eureka, cada una ejecutándose en diferentes puertos y configurada para trabajar en conjunto como parte de un clúster.

## Requisitos
- **Java 21**: Este proyecto utiliza la versión 21 de Java. Asegúrate de tenerla instalada antes de ejecutar la aplicación.
- **Maven 3.6+**: Se utiliza Maven como herramienta de construcción.
- **Spring Boot 3.3.1** y **Spring Cloud 2023.0.3**: Versiones de las librerías principales utilizadas en el proyecto.

## Estructura del Proyecto
Este proyecto contiene tres instancias del servidor **Eureka**, cada una configurada con un perfil diferente (`discovery-server-1`, `discovery-server-2`, `discovery-server-3`). Cada instancia está conectada a las otras dos mediante las URLs de `serviceUrl` en un entorno distribuido.

## Dependencias
Este proyecto utiliza las siguientes dependencias principales:
- **spring-cloud-starter-netflix-eureka-server**: Proporciona la implementación del servidor Eureka.
- **spring-cloud-starter-bootstrap**: Configuración avanzada para el manejo de perfiles y propiedades.
- **spring-boot-starter-test**: Incluye dependencias para pruebas unitarias.

> [!IMPORTANT]
# Configuración Adicional
## Editar el archivo `/etc/hosts`
Para que las instancias de Eureka Server se reconozcan entre sí, es necesario editar el archivo `/etc/hosts` de tu sistema y agregar las siguientes entradas:
```bash
127.0.0.1       discovery1
127.0.0.1       discovery2
127.0.0.1       discovery3
```

## Compilación y Ejecución
### Compilar el proyecto
Para compilar el proyecto, utiliza el siguiente comando Maven:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=<perfil>
```
