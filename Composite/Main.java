package Composite;

/*
 * @author Shyam Makwana
 */

public class Main {
    public static void main(String[] args) {
   
      Employee CEO = new Employee("Shyam","CEO", 50000);

      Employee headFD = new Employee("Dhruvil","Head of Frontend Dev", 45000);

      Employee headBD = new Employee("Mahesh","Head of Backend Dev", 30000);

      Employee backend1 = new Employee("Mihir","Backend Dev", 20000);
      Employee backend2 = new Employee("Kiran","Backend Dev", 20000);

      Employee frontend1 = new Employee("Jenish","Frontend Dev", 40000);
      Employee frontend2 = new Employee("harsh","Frontend Dev", 40000);

      CEO.add(headFD);
      CEO.add(headBD);

      headFD.add(frontend1);
      headFD.add(frontend2);

      headBD.add(backend1);
      headBD.add(backend2);

      System.out.println(CEO); 
      
      for (Employee headEmployee : CEO.getSubordinates()) {
         System.out.println(headEmployee);
         
         for (Employee employee : headEmployee.getSubordinates()) {
            System.out.println(employee);
         }
      }		
   }
}
