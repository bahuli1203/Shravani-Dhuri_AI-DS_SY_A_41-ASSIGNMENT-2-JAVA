class Calculator {
// Private variable (Encapsulation)
private double result;
// Method Overloading for Addition
public double add(int a, int b) {
result = a + b;
return result;
}
public double add(double a, double b) {
result = a + b;
return result;
}
public double add(int a, int b, int c) {
result = a + b + c;
return result;
}
// Method Overloading for Subtraction
public double subtract(int a, int b) {

result = a - b;
return result;
}
public double subtract(double a, double b) {
result = a - b;
return result;
}
// Multiplication
public double multiply(double a, double b) {
result = a * b;
return result;
}
// Division with safety check
public double divide(double a, double b) {
if (b == 0) {
System.out.println(&quot;Error: Cannot divide by zero.&quot;);
return 0;
}
result = a / b;
return result;
}
// Getter method
public double getResult() {
return result;
}
}
public class Main {
public static void main(String[] args) {
Calculator calc = new Calculator();
System.out.println(&quot;Addition (int): &quot; + calc.add(10, 20));
System.out.println(&quot;Addition (double): &quot; + calc.add(10.5, 20.5));
System.out.println(&quot;Addition (3 numbers): &quot; + calc.add(10, 20, 30));
System.out.println(&quot;Subtraction: &quot; + calc.subtract(50, 20));
System.out.println(&quot;Multiplication: &quot; + calc.multiply(5, 4));
System.out.println(&quot;Division: &quot; + calc.divide(20, 4));

System.out.println(&quot;Last Result: &quot; + calc.getResult());
}
}
