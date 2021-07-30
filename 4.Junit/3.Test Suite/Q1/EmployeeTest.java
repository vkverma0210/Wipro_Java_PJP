import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {
    Employee e = new Employee();

    ArrayList<String> list = new ArrayList<>();
    {
        list.add("Vinay");
        list.add("Ram");
        list.add("Abhishek");
        list.add("Akash");
    }

    @Test

    public void testFindName() {
        System.out.println(list);
        assertEquals("FOUND", e.findName(list, "Ram"));
        System.out.println("Test Complete");
    }
}
