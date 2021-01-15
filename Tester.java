public class Tester{
  public static void main(String[] args){
    
    SortableLinkedList rifath = new SortableLinkedList();
    rifath.add(-4);
    rifath.add(-5);
    rifath.add(-2);
    rifath.add(-1);
    rifath.add(-3);
        
    System.out.println(
         rifath.toString()
    );
        
    Radix.radixSortSimple(rifath);
    
    System.out.println(
         rifath.toString()
    );
    
  }
}
