package genericspractice;

public class NonGenericsExample {
    private Object val;

    public NonGenericsExample(Object val) {
        this.val = val;
    }

    public Object get() {
        return val;
    }

    public static void main(String[] args) {
        NonGenericsExample instance = new NonGenericsExample("Hello");
        Integer s =(Integer)instance.get();

    }
}
