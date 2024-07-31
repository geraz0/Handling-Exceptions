public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Gabbi", 24);
            System.out.println("Created person: " + person.getName() + ", Age: " + person.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            int result = Calculator.factorial(10);
            System.out.println("Factorial: " + result);
            result = Calculator.binomialCoefficient(8, 2);
            System.out.println("Binomial Coefficient: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name is invalid");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age is out of range");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Calculator {
    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must not be negative");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("Invalid values for n or k");
        }
        int numerator = factorial(n);
        int denominator = factorial(k) * factorial(n - k);
        return numerator / denominator;
    }
}
