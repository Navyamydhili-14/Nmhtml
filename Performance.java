class Performance {
    public static void main(String[] args) {
        int avg = 85;
        System.out.println("avg="+avg);
        if (avg > 90 && avg < 100) {
            System.out.println("excellent performance");
        } else if (avg > 80 && avg <= 90) {
            System.out.println("good performance");

        } else if (avg > 70 && avg <= 80) {
            System.out.println("medium performance");
        } else if (avg > 60 && avg <= 70) {
            System.out.println("need to improve");
        } else {
            System.out.println("fail");
        }
    }
}
