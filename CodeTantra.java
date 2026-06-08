public class CodeTantra {
    String name;
    String role;
    int salary;
}

class Trainer extends CodeTantra {
    void Displaydetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
    }
}

class Intern extends CodeTantra {
    void Displaydetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
    }
}

class Probabtionary extends CodeTantra {
    void Displaydetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
    }

}

class Main {
    public static void main(String[] args){
        Trainer t1=new Trainer();
        t1.name="navya";
        t1.role="Trainer";
        t1.salary=50000;
        t1.Displaydetails();

        Intern i1=new Intern();
        i1.name="manu";
        i1.role="Intern";
        i1.salary=30000;
        i1.Displaydetails();

        Probabtionary p1=new Probabtionary();
        p1.name="laya";
        p1.role="Probabtionary";
        p1.salary=40000;
        p1.Displaydetails();
    }
}
