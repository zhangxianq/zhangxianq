import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Runnable runnable = () -> {System.out.println(LocalDate.now().toString());System.out.println(LocalDate.now().toString());
        };
        new Thread(runnable).start();
    }
}
