public class inhtce {
    public static void main(String[] args) {
        animal obj = new animal();
        obj.animal();
        obj.eye();
        obj.ear();
//        obj.cat(); --> this wil throw the error because animal is parent class it cannot use its child class property
        cat ob = new cat();

        ob.cat();
        ob.cat(2);
        ob.cat("eh");
        ob.animal();

    }
}


class animal{
    public void animal(){
        System.out.println("animals are innocent");
    }
    public void eye(){
        System.out.println("They have two eyes");
    }
    
    public void ear(){
        System.out.println("they have two ears");
    }
}





class cat extends animal{
    public void cat(){
        System.out.println("Now days animals are better than a human");
    }
    
    
    public void cat(int a){
        System.out.println("Cat is an animal it is a pet ");
    }
    
    
    public void cat(String b){
        System.out.println("The cat has  two eyes");
    }
    
}
