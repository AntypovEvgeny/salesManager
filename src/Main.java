import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{500, 600, 200});

        System.out.println(salesManager.max());
    }
}
