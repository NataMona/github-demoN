# java-basics-hw04

This is a homework for the Java OOP Part II

## IntelliJ IDEA project configuration
1. Clone this project to your local environment

    ```git clone https://github.com/kermek/java-basics-hw04.git``` 
2. Import in IntelliJ IDEA using `File -> New -> Project from Existing Sources...`.
3. Select the directory that you cloned to.
4. Go through the `Import Project` wizard by clicking `Next`.
5. On `Please select project SDK` point it to your Java 1.8 JDK.
6. Press `Ctrl+Alt+Shift+S` and check that in your `Project Structure`.
    value of `Project language level` is set to `8 - Lambdas, type annotations et.`.
7. Open test class, put your cursor on `@Test` annotation, press `Alt+Enter` 
    and choose `Add 'testng' to classpath`.  
8. Set the value to `org.testng:testng:6.14.3` and mark checkbox `Download to`.
9. Complete all TODO tasks. Do not change test class.
10. After you finished assignment compilation should be without any errors (`Ctrl+F9`). 


## Employee assignment

Create an interface to the method calculatePay(), the base class Employee.
Employee class implements the above interface. 
Create two classes SalariedEmployee and ContractEmployee, which are inherited from the base class. 
Describe hourly paid workers in the relevant classes (one of the children), 
and fixed paid workers (second child). 
Describe the string variable socialSecurityNumber in the class SalariedEmployee.
Include a description of federalTaxId in the class of contractEmployee.
The calculation formula for the "time-worker“ is:
`the average monthly salary = hourly rate * number of hours worked`
For employees with a fixed payment the formula is:
`the average monthly salary = fixed monthly payment`
Test will create an array of employees and add the employees with different form of payment.
Test check the output: employee ID, name, and the average monthly wage for all elements.

## Unit testing
There are number of different ways to run your unit tests, e.g.:
* In test class put your cursor on its definition, right click and choose `Run ...`
* Right click on a little green triangle near the class definition and choose `Run ...`
* In test class put your cursor on its definition and press `Ctrl+Shift+F10`
* Once you executed your test you could re-run it again by pressing `Shift+F10`
