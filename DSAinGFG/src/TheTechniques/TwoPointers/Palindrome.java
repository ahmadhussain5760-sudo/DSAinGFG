package TheTechniques.TwoPointers;

public class Palindrome {

    static boolean naive_approach(String s){
        StringBuilder s1=new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                s1.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        StringBuilder s2=new StringBuilder(s1);
        s2.reverse();


        return s1.toString().equals(s2.toString());
    }



    static boolean towPointer_technique(String s){

        int i=0,j=s.length()-1;
        while (i<j){
            char right=s.charAt(j),left=s.charAt(i);
            right=Character.toLowerCase(right);
            left=Character.toLowerCase(left);

           if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else if (right!=left) {
               return false;
           }
            else {
                i++;
                j--;
           }
        }
return true;
    }


    public static void main(String[] args) {
String s1="Too hot to hoot.";
        System.out.println(naive_approach(s1));
    }
}
