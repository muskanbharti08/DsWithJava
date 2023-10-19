public class over_Loading {
    public static void main(String[] args) {
        jmn obj = new jmn();

    }
}
class jmn {
    public jmn(){
        System.out.println("hellow");
    }
    public jmn(int a){
        System.out.println("sdgshf");
    }
    public jmn(String a){
        System.out.println("String");
    }
}