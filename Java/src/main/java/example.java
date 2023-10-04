public class Example {
    public void exampleMethod(String firstName, int age) {
        // ...
    }

    public static void main(String[] args) {
        Example example = new Example();

        // Inlay parameter hints here should show 'name' and 'age'
        example.exampleMethod("John", 30);
        
    }
}
