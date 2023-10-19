

public class hope {
    public static void main(String[] args) {
        h obj = new h();
        obj.setName("Muskan Bharti");
        System.out.println(obj.getName());
        obj.setName("akshay Kashyap");
        System.out.println(obj.getName());
        obj.setName("atya kshyap");
        obj.setAge(21);
        System.out.println("i am "+obj.getAge()+" years old");

    }
}

class h{
    private String name;  // private is acesss modifier
    private int age;     // private is acesss modifier

    public void setName(String s){
        this.name =s;
    }
    public String getName(){
        return name;

    }

    public void setAge(int a){
        this.age =a;
    }
    public int getAge(){
        return age;
    }

}