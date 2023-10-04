class Person:
    """
    Represents a person with a name and age.
    """
    def __init__(self, name, age):
        self.name = name  # inlay hint: str
        self.age = age    # inlay hint: int

    def greet(self, other_person):
        """
        Greet another person.

        Args:
            other_person (Person): The person to greet.
        """
        print(f"Hello, {other_person.name}!")

class Student(Person):
    """
    Represents a student who inherits from Person and has a student ID.
    """
    def __init__(self, name, age, student_id):
        super().__init__(name, age)
        self.student_id = student_id  # inlay hint: str

    def study(self, subject):
        """
        Study a subject.

        Args:
            subject (str): The subject to study.
        """
        print(f"{self.name} is studying {subject}.")

def main():
    # should show name and age
    person1 = Person("Alice", 30)
    # should show name, age and studend_id
    student1 = Student("Bob", 20, "12345")

    person1.greet(student1)
    student1.study("Math")

if __name__ == "__main__":
    main()
    
    