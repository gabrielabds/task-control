import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManagerTask manager = new ManagerTask();
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("TASK CONTROL");
            System.out.println("0. Logout");
            System.out.println("1. Add task");
            System.out.println("2. List task");
            System.out.println("3. Complete task");
            System.out.println("4. Delete task ");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 0 -> {
                    System.out.print("Tem certeza que quer sair? (s/n): ");
                    String resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("s")) {
                        System.out.println("\n👋 Até logo!");
                        sc.close();
                        rodando = false;
                    }
                }
                case 1 -> {
                    System.out.print("Nome da tarefa: ");
                    String nameTask = sc.nextLine();
                    System.out.print("Prioridade: ");
                    String priority = sc.nextLine();
                    manager.addTask(nameTask, priority, false);
                }
                case 2 -> {
                    manager.listTask();
                }
                case 3 -> {
                    manager.listTask();
                    System.out.println("Informe o id da tarefa que deseja concluir:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    manager.completeTask(id);
                }
            }


        }
    }
}
