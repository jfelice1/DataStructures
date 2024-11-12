import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      ArrayList<Integer> insertionSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(insertionSortedList);

      System.out.println("Insertion duration:" + insertionDuration);
      System.out.println("Bubble duration:" + bubbleDuration);
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    long insertionStartTime = System.nanoTime();

    for(int i = 1; i < integerList.length; i++) {
     int currentElement = integerList[i];
     int k;
     for(k = i - 1; k >= 0 && integerList[k] > currentElement; k--) {
      list[k + 1] = integerList[k];
     }
     integerList[k + 1] = currentElement;
    }
    return integerList;

    long insertionEndTime = System.nanoTime();
    long insertionDuration = (insertionEndTime - insertionStartTime);
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    long bubbleStartTime = System.nanoTime();

    boolean needNextPass = true;
    for(int k = 1; k < integerList.length && needNextPass; k++) {
      for(int i = 0; i < integerList.length - k; i++) {
        if(list[i] > list[i + 1]) {
          int temp = integerList[i];
          integerList[i] = integerList[i + 1];
          integerList[i + 1] = temp;

          needNextPass = true;
        }
      }
    }
    return integerList;

    long bubbleEndTime = System.nanoTime();
    long bubbleDuration = (bubbleEndTime - bubbleStartTime);
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}


/* Questions
1. Insertion sort since I understand it best right now. 
2. There was a difference. It took bubble more time to run which makes since. Bubble is a more complex algorithm and has more swaps to do.
3. I hade an easier time with the insertion algorithm. */