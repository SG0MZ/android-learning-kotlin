package basics;

class Main {
    public static void main(String[] args) {
        canThrowAnException();
    }

    static void canThrowAnException() {
        throw new IllegalStateException();
    }
}