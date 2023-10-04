package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa removerTarefa = null;

        for (Tarefa t : tarefas) {

            if (t.getDescription() == descricao) {
                removerTarefa = t;
            }
        }

        tarefas.remove(removerTarefa);
    }

    public void exibirTarefas() {
        System.out.println(tarefas);
    }

    public void contarTarefas() {
        System.out.println(tarefas.size());
    }

    public void obterTarefasConcluidas() {

        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : tarefas) {
            if (t.getStatus()) {
                tarefasConcluidas.add(t);
            }
        }

        System.out.println(tarefasConcluidas);
    }

    public void obterTarefasPendentes() {

        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : tarefas) {
            if (!t.getStatus()) {
                tarefasPendentes.add(t);
            }
        }

        System.out.println(tarefasPendentes);
    }

    public void marcarTarefaConcluida(String descricao) {

        for (Tarefa t: tarefas) {
            if (t.getDescription() == descricao) {
                t.changeStatus(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {

        for (Tarefa t: tarefas) {
            if (t.getDescription() == descricao) {
                t.changeStatus(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefas.removeAll(tarefas);
    }

    public static void main(String args[]) {

        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("tarefa 1");
        lista.adicionarTarefa("tarefa 2");
        lista.adicionarTarefa("tarefa 3");
        lista.adicionarTarefa("tarefa 4");

        lista.exibirTarefas();

        lista.removerTarefa("tarefa 1");

        lista.exibirTarefas();

        lista.contarTarefas();

        lista.marcarTarefaConcluida("tarefa 3");
        lista.marcarTarefaConcluida("tarefa 4");

        lista.obterTarefasConcluidas();

        lista.obterTarefasPendentes();

        lista.marcarTarefaPendente("tarefa 4");

        lista.exibirTarefas();

        lista.limparListaTarefas();

        lista.exibirTarefas();
    }
}
