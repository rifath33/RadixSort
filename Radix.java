public class Radix{

  public static int nth(int n, int col){

    int workingNum = (int) (n / Math.pow(10, col));
    workingNum = workingNum%10;

    return workingNum;

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

  public static void merge( SortableLinkedList original, SortableLinkedList[]buckets){
    for(int i = 0; i < buckets.length; i++){
        original.extend(buckets[i]);
    }
  }

  // no negative values
  // just a radix sort algorithm

  public static void radixSortSimple(SortableLinkedList data){
    //Try to calculate the largest number on your least significant digit pass.
    //This tells your method how many passes are needed.
    int maximumDataLength = 0;

    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int i = 0; i < buckets.length; i ++){
        buckets[i] = new SortableLinkedList();
    }

    maximumDataLength = 1;

    for(int i = 0; i < maximumDataLength; i++){

        while(data.size() > 0){
            if( i == 0 && length(data.get(0)) > maximumDataLength)
            maximumDataLength = length(data.get(0));
            int integerValue = nth(data.get(0),i);
            buckets[integerValue].add(data.get(0));
            data.remove(0);
        }

        Radix.merge(data, buckets);

    }

  }

  public static void radixSort(SortableLinkedList data){
    // give up
  }

}
