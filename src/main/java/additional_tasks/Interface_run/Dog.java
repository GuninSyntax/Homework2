package additional_tasks.Interface_run;

public class Dog implements Runnable {
    @Override
    public void run() {
        System.out.println("Я побежал");
    }
}
