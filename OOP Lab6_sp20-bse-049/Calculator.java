
package lab6;


public class Calculator {
    int  val1;
    int  val2;
    public Calculator(){
        val1 = 12;
        val2 = 4;
    }
    
    public Calculator(int x, int y){
        val1 = x;
        val2 = y;
    }
    
    public static void sum(int a, int b){
        int s = a+b;
        System.out.println("sum is = " + s);
    }
    
    public static void Multiply(int a, int b){
        int mul = a*b;
        System.out.println("product is = " + mul);
    }
    
    public static void Devide(int a, int b){
        int div = a/b;
        System.out.println("division is = " + div);
    }
    
     public static void Mod(int a){
         if(a<0){
             int  f = a * -1;
             System.out.println("modulus is = " +f);
             
         }
         else{
             System.out.println("Modulus is = " +a);
         }
   
     }
     
     public static double Sin(double x){
         double a = Math.toRadians(x);
         System.out.println("sin is = "+Math.sin(a));
         return a;
         
     }
     
      public static double Cos(double x){
         double a = Math.toRadians(x);
         System.out.println("cos is = "+Math.cos(a));
         return a;
      }
      
      
      public static void Tan(double x){
          double a = Math.toRadians(x);
          System.out.println("tan is = " +Math.tan(a));
         
          
      }
}
