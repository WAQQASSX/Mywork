package JavaProjects;

/**
 * JavaStrings
 */
public class JavaStrings {

    public static void main(String[] args ){
        String em = "" ;
        String b = " ";
        String  str1 = "  Hello World  ";
        int res =str1.length(); // the length of the  string 
        boolean res2 = str1.equals("hello"); // is equal to 
        boolean res3 = str1.equalsIgnoreCase("hello world"); // is equal with ignoring the cases 
        String res4 = str1.trim(); // remove the spaces 
        String res5 = str1.replace("o", "e"); // raplace any thing with any thing 
        int res6 = str1.indexOf("r"); // find where is this letter 
        String res7 = str1.toLowerCase();// make them lower cases 
        String res8 = str1.toUpperCase(); // make them upper cases 
        boolean res9=em.isEmpty();// cheak if the vriable is empty 
        boolean res10=b.isBlank();//check if it's black 
        char res11= str1.charAt(4);// find what is in the 4 index 
        System.out.println(res); 
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
        System.out.println(res7);
        System.out.println(res8);
        System.out.println(res9);
        System.out.println(res10);
        System.out.println(res11);
    }
}