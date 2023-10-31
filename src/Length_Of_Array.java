public class Length_Of_Array {
    public static void main(String[] args) {
        String st1 = "Deatils";
        String st2 = "Door";
        System.out.println(check_equal(st1,st2));
        length(st1,st2);
    }

    public static boolean check_equal(String s1, String s2){
        if(s1.equals(s2)){
            return  true;
        }
            return false;
    }


    public static void length(String str1,String str2){
        System.out.println("The length of String  is "+str1.length());
        System.out.println(str2.length());
    }

}
