//import java.util.Scanner;

public class Program {

    // public static void Invitation() {
    //         System.out.println("\nЧто вы хотите сделать?\n1. Создать новую задачу\n2. Удалить задачу\n3. Вывести список задач\n4. Выйти из программы");
    // }
    // public static void Choice() {
    //     System.out.println("\nВыберете приоритет задачи:\n1. Высокий\n2. Средний\n3. Низкий");
    // }

    public static void main(String[] args) {

        Interface<HighPriority> hp = new Interface<>();
        hp.addTask(new HighPriority("task 1"));
        hp.addTask(new HighPriority("task 2"));
        hp.addTask(new HighPriority("task 3"));

        Interface<MediumPriority> mp = new Interface<>();
        mp.addTask(new MediumPriority("task 1"));
        mp.addTask(new MediumPriority("task 2"));
        mp.addTask(new MediumPriority("task 3"));

        Interface<LowPriority> lp = new Interface<>();
        lp.addTask(new LowPriority("task 1"));
        lp.addTask(new LowPriority("task 1"));
        lp.addTask(new LowPriority("task 1"));

        hp.count();
        lp.PrintTaskList();

        // Interface<HighPriority> hp = new Interface<>();
        // Interface<MediumPriority> mp = new Interface<>();
        // Interface<LowPriority> lp = new Interface<>();

        // Scanner input = new Scanner(System.in);
        // Invitation();
        // int choice = input.nextInt();
        // if (choice == 1) {
        //     Choice();
        //     choice = input.nextInt();
        //     if (choice == 1) {
        //         Scanner priority = new Scanner(System.in);
        //         System.out.println("Введите задачу:");
        //         String task = priority.nextLine();
        //         hp.addTask(new HighPriority(task));
        //         hp.get(1);
        //         priority.close();
        //         Invitation();
        //     }
        // } 
        // if (choice == 2) {
        //     System.out.println("fgurj");
        // }
        // else {
        //     Invitation();
        // }
        // input.close();
 
    }
}
