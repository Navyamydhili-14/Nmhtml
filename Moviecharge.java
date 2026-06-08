class Moviecharge {
    public static void main(String[] args) {
        int age=65;
        if (age < 13) {
            System.out.println("The ticket price is 80");
        } else if (age >= 13 && age <= 59) {
            System.out.println("The ticket price is 100");
        } else {
            System.out.println("The ticket price is 150");
        }
    }
}