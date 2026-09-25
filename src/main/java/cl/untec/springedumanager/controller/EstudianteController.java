package cl.untec.springedumanager.controller;

import cl.untec.springedumanager.model.Estudiante;
import cl.untec.springedumanager.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public String listarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteService.listarTodos());
        model.addAttribute("estudiante", new Estudiante());
        return "estudiantes";
    }

    @PostMapping("/guardar")
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudianteService.guardar(estudiante);
        return "redirect:/estudiantes";
    }
}