import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManagerTask manager = new ManagerTask();
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println(" ====== CONTROLE DE TAREFAS ======");
            System.out.println(" | 0. Sair                       |");
            System.out.println(" | 1. Adicionar tarefa           |");
            System.out.println(" | 2. Listar tarefa              |");
            System.out.println(" | 3. Completar tarefa           |");
            System.out.println(" | 4. Deletar tarefa             |");
            System.out.println(" ================================");
            System.out.print("Escolha uma opção: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 0 -> {
                    System.out.print("Tem certeza que deseja sair? (s/n): ");
                    String resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("s")) {
                        System.out.println("\n👋 Até logo!");
                        sc.close();
                        rodando = false;
                    }
                }
                case 1 -> {
                    System.out.println("\n--- CADASTRAR TAREFA ---");
                    System.out.print("Nome da tarefa: ");
                    String nameTask = sc.nextLine();
                    System.out.print("Prioridade: ");
                    String priority = sc.nextLine();
                    manager.addTask(nameTask, priority, false);
                }
                case 2 -> {
                    System.out.println("\n--- LISTA DE TAREFAS ---");
                    manager.listTask();
                }
                case 3 -> {
                    System.out.println("\n--- CONCLUIR TAREFA ---");
                    manager.listTask();
                    System.out.println("Informe o id da tarefa que deseja concluir:");
                    int id = sc.nextInt();

                    manager.completeTask(id);
                }
                case 4 -> {
                    System.out.println("\n--- EXCLUIR TAREFA ---");
                    manager.listTask();
                    System.out.println("Informe o id da tarefa que deseja excluir:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    manager.deleteTask(id);
                }

            }


        }
    }
}
