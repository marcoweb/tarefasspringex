package tarefasspring.models;

import org.springframework.data.repository.CrudRepository;
import tarefasspring.models.Tarefa;

public interface TarefaRepository extends CrudRepository<Tarefa, Integer>  {
    
}