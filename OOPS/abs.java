package OOPS;

public class abs {
    public static void main(String[] args) {

        employee emp1 = new employee();
        System.out.println(emp1.getName());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getQualification());

        emp1.setName("Hilal Ahmad Ganie");
        System.out.println(emp1.getName());

        emp1.setQualification("Bachlor of Computer Applications");
        System.out.println(emp1.getQualification());

    }
}
