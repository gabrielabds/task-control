// Arquivo: GerenciadorTarefas.java

import java.util.ArrayList;
import java.util.List;

public class ManagerTask {

    private List<Task> tasks;
    private int nextId = 1;

    // CONSTRUTOR
    public ManagerTask() {
        this.tasks = new ArrayList<>();
    }

    // MÉTODO - adicionar tarefa
    public void addTask(String nameTask, String priority, boolean completed) {
        Task newTask  = new Task(nextId, nameTask, priority, completed);
        tasks.add(newTask );
        nextId++;
        System.out.println("✓ Tarefa adicionada com sucesso! \n");
    }

    // MÉTODO - listar tarefa
    public void listTask() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        for (Task t : tasks) {
            System.out.println("[" + t.getId() + "] " + t);
        }
        System.out.println();

    }


}