public class or {
    public static void main(String[] args) {
nati ob = new nati();
        ob.name();
        ob.sirname();
        ob.h();

    }
}
class bap{
    public void name(){
        System.out.println("My name is Chanchal");
    }
    public void sirname(){
        System.out.println("My sirname is bharti thakur");
    }
}


class beti extends  bap{
    public void name(){
        System.out.println("My name is Muskan");
    }
    public void h(){
        System.out.println("My height is 5.7");
    }
}

class nati  extends  beti{
    public void name(){
        System.out.println("My name is aru");
    }


}