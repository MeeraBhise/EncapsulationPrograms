package EncapsulationPractise;

public class StudentExample {
    private String name;
    private int id;
  /*  public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name=newName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public StudentExample(String name,int id)
    {
        this.name=name;
        this.id=id;
    }*/

   public StudentExample(String name, int id) {
        this.name = name;
        this.id = id;
    }
   public static void main(String[] args) {
       StudentExample s1 = new StudentExample("meera", 108);
      /* System.out.println(s1.getName());
       System.out.println(s1.getId()); */
       System.out.println(s1.name);
       System.out.println(s1.id);
   }
}
