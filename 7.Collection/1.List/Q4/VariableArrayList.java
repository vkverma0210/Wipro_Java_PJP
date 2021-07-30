import java.util.ArrayList;

class MyArrayList<E> extends ArrayList<E> {
    @Override
    public boolean add(E e) {
        if (e instanceof Integer || e instanceof Float || e instanceof Double) {
            super.add(e);
            return true;
        } else {
            throw new ClassCastException("Only Integer, Float and Double are supported.");
        }
    }
}

public class VariableArrayList {

    public static void main(String[] args) {
        ArrayList<Object> list = new MyArrayList<>();

        try {
            list.add(02);
            list.add(26.06F);
            list.add(6.45323D);
            list.add("string");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(list);
    }
}