
import java.util.ArrayList;
import java.util.List;

public class ManagerTask {

    private List<Task> tasks;
    private int nextId = 1;

    public ManagerTask() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String nameTask, String priority, boolean completed) {
        Task newTask = new Task(nextId, nameTask, priority, completed);
        tasks.add(newTask);
        nextId++;
        System.out.println("✓ Tarefa adicionada com sucesso! \n");
    }

    public void listTask() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.\n");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t);
        }
        System.out.println();
    }

    public void completeTask(int id) {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.\n");
            return;
        }
        for (Task t : tasks) {
            if (id == t.getId()) {
                t.setCompleted(true);
                return;
            }
        }
        System.out.println("Tarefa não encontrada!");
    }

    public void deleteTask(int id) {
        Task saveTask = null;
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (Task t : tasks) {
            if (id == t.getId()) {
                saveTask = t;
                break;
            }
        }
        if (saveTask != null){
            tasks.remove(saveTask);
            System.out.println("✓ Tarefa removida");
        }else{
            System.out.println("Tarefa não encontrada!");
        }


    }
}


