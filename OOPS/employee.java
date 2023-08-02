package OOPS;

public class employee {
    private String name = "Hilal";
    private String address = "Lolab Kalaroos";
    private String qualification = "BCA";
    private int id = 0101;

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    String getQualification() {
        return qualification;
    }

    void setName(String name) {
        this.name = name;
    }

    void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
