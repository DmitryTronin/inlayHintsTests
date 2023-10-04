using System;

class Example {
    void ExampleMethod(string name, int age) {
        // ...
    }

    static void Main() {
        var example = new Example();

        // Inlay parameter hints here should show 'name' and 'age'
        example.ExampleMethod("Diana", 31);
    }
}
