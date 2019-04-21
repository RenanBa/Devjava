## Payroll System using Polymorphism
Create an application that calculates different employee types earnings

*Topics:*
1. Inheritance
2. Polymorphism
  - polymorphic Processing, Operator instanceof and Downcasting (PayrollSystemTest)
    - downcast Employee reference to BasePlusCommissionEmployee reference
3. Abstract classes and methods (Employee)
4. Concrete subclasses
5. Indirect concrete subclass (BasePlusCommissionEmployee)

Employee Payroll application UML:
![alt text](https://github.com/RenanBa/Devjava/blob/master/Images/employeeDiagram.png)

### Creating and using Interfaces (implementing)

1. Using an Interface (communicating via interface)
2. Relating disparate types
3. implementing
4. Processing Invoices and Employees Polymorphically
Making method getPaymentAmount into general-purpose version of method earnings of the Employee hierarchy
 * Method earnings calculates a payment amount specifically for an Employee, while
 getPaymentAmount can be applied to a broad range of unrelated objects.

 * In addition to calculating the earnings that must be paid to each employee, the application must also
 calculate the payment due on each of several invoice (i.e., bills for good purchased)

 Interface Payable UML:
 ![alt text](https://github.com/RenanBa/Devjava/blob/master/Images/employeeDiagram1.png)
