# About the app
The Employee Management System project is a software application that allows users to manage
employees in a company. It uses various design patterns such as the Composite pattern for
creating employee hierarchies, the Decorator pattern for adding additional functionality
to employee objects, the Facade pattern for providing a simplified interface to the system,
and the Flyweight pattern for reducing memory usage by sharing common data between objects.
The system allows users to add, remove, and update employee data, perform performance reviews,
and pay employees.

## Objectives
    1. Study and understand the Structural Design Patterns.
    2. As a continuation of the previous laboratory work, 
    think about the functionalities that your system will need to provide to the user.
    3. Implement some additional functionalities, or create a new project 
    using structural design patterns.

## Used Design patterns
    1.Composite
    2.Decorator
    3.Facade
    4.Flyweight

## The app structure

![img.png](img.png)

## Implementation
### Composite
Composite design pattern is implemented in two classes: Employee and Manager.
The Employee interface defines the base component of the composite pattern. It specifies the basic methods that all employees must implement, such as getName(), getSalary(), getId(), setName(), and setSalary(). These methods are common to all types of employees, whether they are individual contributors or managers with subordinates.
The Manager class implements the composite pattern as a composite node. It extends the Employee interface and adds methods to manage its subordinates, such as add(), remove(), and getSubordinates(). The Manager class also has a list of subordinates, which are other Employee objects, either individual contributors or other managers.
Together, the Employee interface and the Manager class allow for the creation of a hierarchical tree structure of employees, with managers at the higher levels and individual contributors at the lower levels. This allows for easy management of employees, whether it is calculating the total salary of all employees, giving raises to all employees, or adding performance reviews to individual employees. The composite pattern also allows for the addition or removal of employees from the tree structure without affecting the overall structure of the organization.

![img_1.png](img_1.png)
![img_2.png](img_2.png)

### Decorator

The PerformanceReviewDecorator class is a concrete decorator that extends the Employee interface and adds additional behavior, namely the ability to set and get an employee's performance review. The PerformanceReviewDecorator wraps an instance of an Employee and delegates all method calls to that employee, while adding the additional behavior of performance review management. This allows for the dynamic addition of behavior to an Employee object at runtime, without changing the behavior of other Employee objects in the system.
The EmployeeDecorator interface defines the behavior that all decorators must implement. It extends the Employee interface and adds methods for setting and getting performance reviews.
Overall, the Decorator pattern is used to add behavior to Employee objects at runtime, by wrapping them in concrete decorator classes. This allows for the creation of new Employee behaviors without changing the behavior of existing Employee objects. In this way, the Decorator pattern promotes flexibility and modularity in the system's design.

![img_3.png](img_3.png)

### Facade

Facade pattern is implemented in the EmployeeManagementSystem class.
The EmployeeManagementSystem class acts as a Facade for the EmployeeRepository, PayrollSystem, and PerformanceReviewSystem classes. It provides a simple, high-level interface for managing employees, while hiding the complexity of the underlying systems from the user.
The EmployeeManagementSystem class has methods for getting all employees, getting an employee by id, adding and removing employees, paying employees, adding performance reviews for employees, and giving raises to employees. These methods delegate the actual work to the EmployeeRepository, PayrollSystem, and PerformanceReviewSystem classes, but provide a simpler interface for the user to work with.
By encapsulating the complexity of the underlying systems behind a simplified interface, the EmployeeManagementSystem class promotes ease of use and maintainability, and also provides a layer of abstraction that can shield the user from changes to the underlying systems.

![img_4.png](img_4.png)

### Flyweight

Flyweight pattern is implemented in the DepartmentCache class.
The DepartmentCache class acts as a flyweight factory for creating Department objects. It maintains a cache of Department objects that have already been created, and returns them when requested instead of creating new objects.
When a new Department object is requested, the DepartmentCache class first checks if a Department with the same name already exists in the cache. If it does, that Department object is returned. If not, a new Department object is created and added to the cache.
By caching Department objects in this way, the DepartmentCache class reduces memory usage by eliminating the need to create a new Department object every time one is requested. Instead, the same Department object can be reused multiple times.
Overall, the Flyweight pattern is used to optimize memory usage and improve performance by sharing objects that have identical intrinsic state. In this case, the Department objects have a name and description that remain constant, so they can be cached and reused, rather than creating new objects every time they are needed.

![img_5.png](img_5.png)
![img_6.png](img_6.png)

### Result after execution
![img_7.png](img_7.png)

### Conclusion
The Employee Management System project is an example of how various 
design patterns can be used to create a robust, scalable, 
and maintainable software application for managing employees in a 
company. The project demonstrates the use of the Composite pattern for
creating employee hierarchies, the Decorator pattern for adding
additional functionality to employee objects, the Facade pattern for 
providing a simplified interface to the system, and the Flyweight 
pattern for reducing memory usage by sharing common data between 
objects. These patterns help to improve the overall design of the 
system, making it more flexible, extensible, and easier to maintain.