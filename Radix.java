public class Radix{
  
  public static int nth(int n, int col){
    String number = n + "";
    /// consider + or -
    String thing = number.charAt(col) + "";
    return Integer.parseInt(thing);
    
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
