package za.ac.cput.gitadp3;

public class System {

    /**
     *  This returns the length of the string
     *
     */
    public int lengthOfString(String str){
        if(str == null || str.isEmpty()) return 0;
        return str.length();
    }

    public static void main(String[] args) {
        System.out.println("GIT baby");
    }
}
