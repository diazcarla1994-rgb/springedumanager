# 🎓 SpringEduManager - Sistema de Gestión Educativa

Proyecto desarrollado para el Bootcamp de Desarrollo Web Full Stack Java (SENCE / Instituto ISEG).

Este sistema web monolítico con arquitectura Spring MVC y exposición de API RESTful permite la gestión de estudiantes y cursos con persistencia de datos en memoria y control de acceso basado en roles.

---

## 🚀 Tecnologías Utilizadas

- **Java 21**
- **Spring Boot 3.x**
  - Spring Data JPA
  - Spring Security
  - Spring Web MVC
- **Base de Datos:** H2 Database (En Memoria)
- **Motor de Plantillas:** Thymeleaf
- **Estilos:** Bootstrap 5
- **Herramienta de Construcción:** Maven

---

## 🛠️ Características y Módulos

1. **Gestión de Estudiantes y Cursos (MVC + JPA):**
   - Vistas web dinámicas integradas con Thymeleaf y Bootstrap.
   - Creación y visualización de registros almacenados en H2 Database.

2. **Seguridad (Spring Security):**
   - Autenticación con formulario de Login personalizado.
   - Control de roles (`USER` y `ADMIN`).
   - Acceso permitido a recursos estáticos, consola H2 y endpoints REST.

3. **Servicios Web RESTful (API JSON):**
   - Endpoints para el consumo e interoperabilidad de datos en formato JSON:
     - `GET /api/estudiantes` - Listar todos los estudiantes.
     - `GET /api/estudiantes/{id}` - Obtener estudiante por ID.
     - `POST /api/estudiantes` - Crear nuevo estudiante.
     - `DELETE /api/estudiantes/{id}` - Eliminar estudiante.
     - `GET /api/cursos` - Listar todos los cursos.

---

## 🔑 Credenciales de Acceso

| Usuario | Contraseña | Rol |
| :--- | :--- | :--- |
| `user` | `user123` | `USER` |
| `admin` | `admin123` | `ADMIN` |

---

## ⚙️ Instrucciones de Ejecución

1. Clonar o descomprimir el proyecto.
2. Importar en Eclipse / Spring Tool Suite como **Existing Maven Project**.
3. Ejecutar la clase principal `SpringedumanagerApplication.java` como **Java Application**.
4. Acceder en el navegador a:
   - **Aplicación Web:** `http://localhost:8080/estudiantes`
   - **API REST (JSON):** `http://localhost:8080/api/estudiantes`
   - **Consola H2:** `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:edudb`)