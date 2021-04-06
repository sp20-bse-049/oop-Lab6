
package lab6;


public class Lab6_act1_runner {
    public static void main(String[]args){
       SavingAccount A1 = new SavingAccount();
       SavingAccount A2 = new SavingAccount();
       
       A1.CalMonthlyIntrest();
       A1.setanulalIrate(4);
       A1.CalMonthlyIntrest();
      
       A2.setsavingbalance(3000);
       A2.CalMonthlyIntrest();
       A2.setanulalIrate(4);
       A2.CalMonthlyIntrest();
       
        
    }
    
    
}
