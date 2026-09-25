package cl.untec.springedumanager.controller;

import cl.untec.springedumanager.model.Curso;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cursos")
public class CursoController {

    private static List<Curso> listaCursos = new ArrayList<>();
    private static Long contadorId = 1L;

    @GetMapping
    public String listarCursos(Model model) {
        model.addAttribute("cursos", listaCursos);
        model.addAttribute("curso", new Curso());
        return "cursos";
    }

    @PostMapping("/guardar")
    public String guardarCurso(@ModelAttribute Curso curso) {
        curso.setId(contadorId++);
        listaCursos.add(curso);
        return "redirect:/cursos";
    }
}