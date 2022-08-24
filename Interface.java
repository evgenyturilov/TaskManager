import java.util.ArrayList;
import java.util.List;

public class Interface<T extends Task> {
    List<T> db;

    public Interface() {
        this.db = new ArrayList<>();
    }

    /**
     * Метод для добавления задачи
     * @param task - новая задача
     */
    public void addTask(T task) {
        db.add(task);
        //System.out.println("\n>> Task added\n");
    }

    /**
     * Метод для удаления задачи
     * @param index - номер задачи для удаления 
     */
    public void removeTask(int index) {
        db.remove(index - 1);
    }

    /**
     * Подсчет задач в Планировщике
     * @return
     */
    public int count() {
        return db.size();
    }

    /**
     * Метод для вывода имеющихся в Планировщике задач
     * @param index - номер задачи в Планировщике (начиная с 1)
     * @return
     */
    public T get(int index) {
        return db.get(index - 1);
    }
    /**
     * Метод вывода в консоль списка задач
     */
    public void PrintTaskList() {
        for (int i = 0; i < db.size(); i++) {
            System.out.printf("Номер: %d, %s", (i + 1), db.get(i));
        }
    }
}
