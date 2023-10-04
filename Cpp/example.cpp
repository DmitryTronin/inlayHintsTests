#include <iostream>

void exampleFunction(std::string name, int age) {
  // ...
}

int main() {
  // Inlay parameter hints here should show 'name' and 'age'
  exampleFunction("Grace", 29);
  return 0;
}
