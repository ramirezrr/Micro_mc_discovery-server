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

## Perfil del Proyecto
Este proyecto contiene una instancia del servidor **Eureka**, cada una configurada con un perfil diferente (`discovery-server-1`).

## Dependencias
Este proyecto utiliza las siguientes dependencias principales:
- **spring-cloud-starter-netflix-eureka-server**: Proporciona la implementación del servidor Eureka.
- **spring-cloud-starter-bootstrap**: Configuración avanzada para el manejo de perfiles y propiedades.
- **spring-boot-starter-test**: Incluye dependencias para pruebas unitarias.

> [IMPORTANT]
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


# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.3/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.3/gradle-plugin/packaging-oci-image.html)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)

### Guides

The following guides illustrate how to use some features concretely:

* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

