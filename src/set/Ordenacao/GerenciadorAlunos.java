package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        listaAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {

        Aluno removeAluno = null;

        for (Aluno aluno : listaAlunos) {

            if (aluno.getMatricula() == matricula) {
                removeAluno = aluno;
            } else {
                System.out.println("Matricula não encontrada");
            }
        }

        listaAlunos.remove(removeAluno);
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);

        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());

        alunosPorNota.addAll(listaAlunos);

        System.out.println(alunosPorNota);
    }

    public void exibirAlunos() {
        System.out.println(listaAlunos);
    }

    public static void main (String args[]) {

        GerenciadorAlunos lista = new GerenciadorAlunos();

        lista.adicionarAluno("c", 3222123L, 5.0);
        lista.adicionarAluno("d", 1113123L, 7.0);
        lista.adicionarAluno("a", 3213123L, 6.0);
        lista.adicionarAluno("b", 32133323L, 8.0);
        
        lista.exibirAlunos();
        lista.exibirAlunosPorNome();
        lista.exibirAlunosPorNota();

    }

}
