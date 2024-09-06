package ch01;

import java.util.*;

public class sec1_test {

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum2(10));

        System.out.println(new PhoneNumber("010-1234-5678"));
        System.out.println(new PhoneNumber("010 1234 5678"));
        System.out.println(new PhoneNumber("01012345678"));

        Person person = new Person("홍길동");
        person.addPhoneNumber(new PhoneNumber("010-1234-5678"));
        // person.addPhoneNumber(new PhoneNumber("010 1234 5678"));
        // person.addPhoneNumber(new PhoneNumber("01012345678"));
        System.out.println(person);
        System.out.println(person.hasPhoneNumber(new PhoneNumber("01012345678")));

        // addPhoneNumber 테스트
        Person person1 = new Person("홍길동");
        person1.addPhoneNumber(new PhoneNumber("010-1234-5678"));
        person1.addPhoneNumber(new PhoneNumber("010-2345-6789"));
        Person person2 = new Person("김철수");
        person2.addPhoneNumber(new PhoneNumber("010-2468-0246"));
        Person person3 = new Person("이영희");
        person3.addPhoneNumber(new PhoneNumber("010-1357-9135"));

        // addPerson 테스트
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson(person1);
        phoneBook.addPerson(person2);
        phoneBook.addPerson(person3);
        System.out.println(phoneBook);

        // HashSet으로 중복 제거
        // phoneBook = new PhoneBook();
        // phoneBook.addPerson(person);
        // phoneBook.addPerson(person);
        // System.out.println(phoneBook);

        // search
        System.out.println(phoneBook.search(new PhoneNumber("010-1357-9135")));
    }

    private static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    // loop 문을 도는 것보다 효율적
    private static int sum2(int n) {
        return n * (n + 1) / 2;
    }

    private static class PhoneNumber {
        public final String phoneNumber;

        private PhoneNumber(String rawPhoneNumber) {
            this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]", "");
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PhoneNumber number = (PhoneNumber) o;
            return Objects.equals(phoneNumber, number.phoneNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(phoneNumber);
        }

        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    }

    private static class Person {
        public final String name;
        private final List<PhoneNumber> numbers;

        private Person(String name) {
            this.name = name;
            this.numbers = new ArrayList<>();
        }

        public boolean addPhoneNumber(PhoneNumber number) {
            for (char c: number.getPhoneNumber().toCharArray()) {
                if (!Character.isDigit(c)) return false;
            }
            numbers.add(number);
            return true;
        }

        // equals 추가
        public boolean hasPhoneNumber(PhoneNumber number) {
            return numbers.contains(number);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", numbers=" + numbers +
                    '}';
        }
    }

    private static class PhoneBook {
        private final Set<Person> people;

        private PhoneBook() {
            this.people = new HashSet<>();
        }

        public void addPerson(Person person) {
            people.add(person);
        }

        public Person search(PhoneNumber number) {
            return people.stream()
                    .filter(p -> p.hasPhoneNumber(number))
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public String toString() {
            return "PhoneBook{" +
                    "people=" + people +
                    '}';
        }
    }
}
