package tarefasspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import tarefasspring.models.TarefaRepository;
import tarefasspring.models.Tarefa;

@Controller
@RequestMapping("/")
public class TarefasController {
    @Autowired
    private TarefaRepository repo;

    @RequestMapping("")
    public String list(Model model) {
        model.addAttribute("tarefas", repo.findAll());
        return "WEB-INF/tarefas.jsp"; 
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public String insert(@RequestParam("descricao") String descricao) {
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao(descricao);
        repo.save(tarefa);

        return "redirect:/";
    }
}
