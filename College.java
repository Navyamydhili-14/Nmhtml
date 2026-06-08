import java.util.Scanner;

class College {
    int memberid;
    String name;
    Static String Collegename="vits";

    College(int memberid, String name) {
        this.name = name;
        this.memberid = memberid;
    }

    void display() {
        System.out.println(memberid + name);
        System.out.println(College.Collegename);

    }

    public static void main(String[] args) {
        College c = new College(1092, navya);
        String College = c.next();
        c.display();

    }
}