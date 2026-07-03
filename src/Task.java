public class Task {

    private int id;
    private String nameTask;
    private String priority;
    private boolean completed;

    public Task(int id, String nameTask, String priority, boolean completed) {
        this.id = id;
        this.nameTask = nameTask;
        this.priority = priority;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String toString() {
        String status = completed ? "✓ Concluida" : "○ Pendente";
        return "[" + id + "] Tarefa: " + nameTask + " | Prioridade: " + priority + " | Status: " + status;
    }
}
