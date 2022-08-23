// import java.util.Calendar;
// import java.util.Date;
// import java.util.GregorianCalendar;

/**
 * Task
 */
public abstract class Task {
    
    //protected int id;
    protected String task;

    public Task(String task) {
        //this.id = id;
        this.task = task;
    }

    @Override
    public String toString() {
        return task;
    }
    // public Date DateOfCreation() {
    //     Calendar calendar = new GregorianCalendar();
    //     Date taskCreationTime = calendar.getTime();
    //     return taskCreationTime; 
    // }

    // public abstract Date DueTo();

    


    
}