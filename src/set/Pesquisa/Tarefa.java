package set.Pesquisa;

public class Tarefa {
    
    private String description;
    private boolean concluida;

    public Tarefa(String description, boolean concluida) {

        this.description = description;
        this.concluida = concluida;
    }

    public String getDescription() {
        return description;
    }

    public boolean getStatus() {
        return concluida;
    }

    public void changeStatus(boolean newStatus) {
        this.concluida = newStatus;
    }

    @Override
	public String toString() {
		return "{ " + "descrição: " + description + " concluida: " + concluida + "}";
	}
}
