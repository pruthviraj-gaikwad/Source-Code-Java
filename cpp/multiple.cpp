#include <iostream>
using namespace std;
// Base class 1
class Animal
{
public:
    void eat()
    {
        cout << "Animal is eating." << endl;
    }
};

// Base class 2
class Bird
{
public:
    void fly()
    {
        cout << "Bird is flying." << endl;
    }
};

// Derived class inheriting from both Animal and Bird
class Eagle : public Animal, public Bird
{
public:
    void hunt()
    {
        cout << "Eagle is hunting." << endl;
    }
};

int main()
{
    Eagle eagle;

    // Accessing methods from both base classes
    eagle.eat(); // Calls Animal's eat()
    eagle.fly(); // Calls Bird's fly()

    // Calling the derived class method
    eagle.hunt(); // Calls Eagle's hunt()

    return 0;
}
