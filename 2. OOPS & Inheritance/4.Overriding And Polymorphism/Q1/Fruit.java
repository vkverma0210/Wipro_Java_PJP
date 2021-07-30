/**
 * Fruit
 */
public class Fruit {
    String name, taste;
    int size;

    Fruit()
    {
        name = "";
        taste = "";
        size = 0;
    }

    void eat()
    {
        System.out.println(name + " : " + taste);
    }    
}