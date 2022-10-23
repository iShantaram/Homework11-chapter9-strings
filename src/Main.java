public class Main {
    public static void main(String[] args) {
        // HW11
        // Task1
        System.out.println("\nTask 1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Task2
        System.out.println("\nTask 2:");

        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperCaseFullName);

        // Task3
        System.out.println("\nTask 3:");
        fullName = "Иванов Семён Семёнович";
        String notYoFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + notYoFullName);

    }
}