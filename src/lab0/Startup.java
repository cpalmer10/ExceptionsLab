package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) {

        Employee emp = new Employee("Jim","","3333333333",28);
        
        // Think about this code. It wouldn't work if lastName was null
            // NullPointerException
        String fullNameInCaps = "";
        try{
            fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        } catch(NullPointerException ne){
            System.out.println("Either first name or last name are  null.");
        }
        
        
        System.out.println(fullNameInCaps);
    }
}
