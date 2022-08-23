import java.util.ArrayList;
import java.util.List;

public class Repository<T extends Task> {
    List<T> tl;

    private String name;

    public Repository(String name) {
        this.tl = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    /**
     * Метод для добавления задачи
     * @param task - новая задача
     */
    public void addTask(T task) {
        tl.add(task);
    }

    /**
     * Метод для удаления задачи
     * @param task - задача для удаления
     */
    public void removeTask(Task task) {
        tl.remove(task);
    }

    /**
     * Подсчет задач в Планировщике
     * @return
     */
    public int count() {
        return tl.size();
    }

    /**
     * Метод для вывода имеющихся в Планировщике задач
     * @param index
     * @return
     */
    public T get(Integer index) {
        return tl.get(index);
    }

    // public void add(String string) {
    // }

    // public void add(HighPriority highPriority) {
    // }
}
