package app;

public class Customer {


        // Виправте декларацію змінних класу
        private final String name;
        private final String phone;

        // Виправте визначення конструктора
        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return this.name;
        }

        public String getPhone() {
            return this.phone;
        }
}
