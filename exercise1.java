public class App {
    
    static boolean iwillBehave = true;
    static boolean iwillGraduate = true;
    
    public static void main(String[] args) throws Exception {
       
        assert iwillBehave == true : "Ende man ako behave";

        College();


        assert iwillGraduate == true : "baka ibang course";
    }




    static void College () {

        iwillGraduate = false;
        System.out.println("eyyy");

    }

}
