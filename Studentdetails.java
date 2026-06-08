class Studentdetails {
    String name, email;
    long phonenumber;

    Studentdetails(String name, String email, long phonenumber) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    void name() {
        System.out.println(this.name);
    }

    void email() {
        System.out.println(this.email);
    }

    void phonenumber() {
        System.out.println(this.phonenumber);
    }

    public static void main(String[] args) {

        Studentdetails sd = new Studentdetails(
                "navya",
                "mydhili@gmail.com",
                8309200194L);

        sd.name();
        sd.email();
        sd.phonenumber();
    }
}