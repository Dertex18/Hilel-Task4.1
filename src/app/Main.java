package app;

public class Main {
        public static void main(String[] args) {
            Customer customer = getCustomer(getData());
            String output = String.format("Customer name: %s, phone number: %s",
                    customer.getName(), customer.getPhone());
            getOutput(output);
        }

        public static String[] getData() {
            return new String[]{"Alex", "+23030234"};
        }

        public static Customer getCustomer(String[] data) {
            return new Customer(data[0], data[1]);
        }

        public static void getOutput(String output) {
            System.out.println(output);
        }

}
