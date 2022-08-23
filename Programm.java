public class Programm {
    public static void main(String[] args) {
        Repository<HighPriority> hp = new Repository<>("Важные задачи");
        hp.addTask(new HighPriority("task 1"));
        hp.addTask(new HighPriority("task 2"));
        hp.addTask(new HighPriority("task 3"));

        for (int i = 0; i < hp.count(); i++) {
            System.out.printf("\n>> %s", hp.get(i));
        }

        System.out.println(hp.count());
    }
}
