package EncapsulationPractise;

public class encapsulationtest {
    private int id;
    private String address;
    public String companyname ="tcs";

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        encapsulationtest s=new  encapsulationtest();
        s.setId(101);
        s.setAddress("pune");
        System.out.println(s.getId());
        System.out.println(s.getAddress());
        System.out.println(s.companyname);
    }
}




