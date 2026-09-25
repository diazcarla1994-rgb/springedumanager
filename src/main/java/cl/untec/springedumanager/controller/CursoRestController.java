package cl.untec.springedumanager.controller;

import cl.untec.springedumanager.model.Curso;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoRestController {

    private static List<Curso> listaCursos = new ArrayList<>();
    private static Long contadorId = 1L;

    // Obtener todos los cursos (GET)
    @GetMapping
    public List<Curso> obtenerTodos() {
        return listaCursos;
    }

    // Crear un nuevo curso (POST)
    @PostMapping
    public ResponseEntity<Curso> crearCurso(@RequestBody Curso curso) {
        curso.setId(contadorId++);
        listaCursos.add(curso);
        return new ResponseEntity<>(curso, HttpStatus.CREATED);
    }
}