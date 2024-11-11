package colecoesjava.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }    
    
    
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao) {
        // Criando uma nova lista e iterando para capturar descrições repetidas
        List<Tarefa> removerTarefa = new ArrayList<>();
        for(Tarefa t: tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                removerTarefa.add(t);
            }
        }
        // Removendo todas as listas com as descrições especificadas
        tarefaList.remove(removerTarefa);
    }
    
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }
    
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
}
