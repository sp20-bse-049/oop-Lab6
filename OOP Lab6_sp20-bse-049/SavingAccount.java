
package lab6;


public class SavingAccount {
    static double annualInterestrate;
    static private double savingbalance;
    public SavingAccount(){
      annualInterestrate = 3;
      savingbalance = 2000;
    }
    public SavingAccount(double x, double y){
     annualInterestrate = x;
     savingbalance = y;
    }
 
    public void setanulalIrate(int x){
     annualInterestrate = x;
    }
    public double getanulalIrate(){
     return annualInterestrate;
    }
    public void setsavingbalance(int y){
     savingbalance = y;
    }
    public double getsavingbalance(){
     return savingbalance;
    }
    public double CalMonthlyIntrest(){
     double interest = (savingbalance*annualInterestrate/12);
     savingbalance += interest;
     String a = String.format("%.2f" , interest);
     System.out.println("interest is = "+ a);
     
     System.out.println("new balance is = " + savingbalance);
     return interest;
     
 }   
    
}
