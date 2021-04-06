
package lab6;

public class NumObj {
   static int count = 0;
   static int counttotal = 0;
   static int Numofobject ;
    
  public NumObj(int x){
      Numofobject = x;
      if(this == null){
          counttotal++;
      }
      else{
          count++;
      }
      
      
      
  }
  public void Display(){
      System.out.println("we have created "+count++ +" objects");
      System.out.println("Number of destroyed objects are "+counttotal++);
  }

    
}
