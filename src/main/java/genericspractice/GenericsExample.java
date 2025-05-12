package genericspractice;

public class GenericsExample<T> {
    public T getT() {
        return t;
    }

    public void setT(T t) {
    }

    private T t;

    public GenericsExample(T t) {
        this.t = t;
    }

    static class myclass{
        public static void main(String[] args) {
            GenericsExample<Integer> t=new GenericsExample<Integer>(10);
        }
    }

}
