public class Radix{
  
  public static int nth(int n, int col){
    String number = n + "";
    String result = "";
    /// consider + or -
    if(number.charAt(0)==('-') || number.charAt(0)==('+'))
    result = number.charAt(col+1) + "";
    else result = number.charAt(col) + "";
    return Integer.parseInt(result);
    
  }
  
  public static int length(int n){
    String number = n + "";
    return number.length();
  }
  
  public static void merge(MyLinkedList original, MyLinkedList[] buckets){
    
    for(int i = 0; i < buckets.length; i++){
        original.extend(buckets[i]);
    }
    
  }
  
   
  
}
