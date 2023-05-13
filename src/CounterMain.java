public class CounterMain {
    public static void main(String[] args) {
        // Create a Counter object with start value 5
        Counter counter1 = new Counter(1);

        // Use the 'value' method to get the current value of the counter
        System.out.println("Counter 1 value: " + counter1.value());

        // Use the 'increase' method to increase the counter's value by 1
        counter1.increase();
        System.out.println("Counter 1 value after increasing by 1: " + counter1.value());

        // Use the 'decrease' method to decrease the counter's value by 1
        counter1.decrease();
        System.out.println("Counter 1 value after decreasing by 1: " + counter1.value());

        // Use the overloaded 'increase' method to increase the counter's value by 1
        counter1.increase(1);
        System.out.println("Counter 1 value after increasing by 1: " + counter1.value());

        // Use the overloaded 'decrease' method to decrease the counter's value by 1
        counter1.decrease(1);
        System.out.println("Counter 1 value after decreasing by 1: " + counter1.value());

        // Create a Counter object with default start value of 0
        Counter counter2 = new Counter();

        // Use the 'value' method to get the current value of the counter
        System.out.println("Counter 2 value: " + counter2.value());

        // Use the 'increase' method to increase the counter's value by 1
        counter2.increase();
        System.out.println("Counter 2 value after increasing by 1: " + counter2.value());
    }
}
