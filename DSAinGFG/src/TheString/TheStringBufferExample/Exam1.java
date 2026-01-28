package TheString.TheStringBufferExample;

public class Exam1 {
    public static void main(String[] args) {
        StringBuffer s =new StringBuffer();

        s.append("ahmad");
        s.append(" ");
        s.append("hussain");

        String str=s.toString();
        System.out.println(str);

        StringBuffer a =new StringBuffer();

        //here we will use appended method
        a.append("this cors in gfg");
        System.out.println(a);

        //here we will use insert method
        a.insert(0,"ahmad is study ");
        System.out.println(a);

        //here we will use replace method
        a.replace(0,5,"mohamed");
        System.out.println(a);

        //here we will use delete method
        a.delete(0,5);
        System.out.println(a);

        //here we will use reverse method
        a.reverse();
        System.out.println(a);

        //here we will use capacity method this return the size of the string buffer in the memory
        System.out.println(a.capacity());

        //here we will use length method this return how many char in my string buffer
        System.out.println(a.length());


    }
}
