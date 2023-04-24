package tarefasspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TarefasController {
    @RequestMapping("/")
    public String list() {
        return "tarefas.jsp"; 
    }
}
