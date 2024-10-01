//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Jenna Felice
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};
    
    System.out.println("Output Array in Order: ");
    int o = 0;
    while(o < nums.length) {
      System.out.print(nums[o] + " ");
      o++;
    }

    System.out.println('\n' + "Output Array in Reverse: ");
    for(int r = nums.length - 1; r >= 0; r--) {
      System.out.print(nums[r] + " ");
    }


    int firstValue = nums[0];
    int lastValue = nums[nums.length - 1];
    System.out.println('\n' + "First Value: " + firstValue);
    System.out.println("Last Value: " + lastValue);

    Lab1 maximum = new Lab1();
    System.out.println("If Statement to Return Maximum Value: " + maximum.max(11, 1));

    Lab1 minimum = new Lab1();
    System.out.println("If Statement to Return Minimum Value: " + minimum.min(11, 1));

    Lab1 add = new Lab1();
    System.out.println("Sum of Array: " + add.sum(nums));

    Lab1 mean = new Lab1();
    System.out.println("Average of Array: " + mean.average(nums));

    Lab1 big = new Lab1();
    System.out.println("Max Value of Array: " + big.max(nums));

    Lab1 small = new Lab1();
    System.out.println("Min Value of Array: " + small.min(nums));
  }
}     




// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    if ( a > b) {
      return a;
    } else {
      return b;
    }
  }

  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  public int sum(int[] nums) {
    int sum = 0;
    for(int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    return sum;
  }

  public double average(int[] nums) {
    double avg = 0;
    for(int a = 0; a < nums.length; a++) {
      avg = avg + nums[a];
    }
    double average = avg / (double)nums.length;
    return average;
  }

  public int max(int[] nums) {
    int l;
    int max = nums[0];
    for(l = 1; l < nums.length; l++)
      if(nums[l] > max)
      max = nums[l];
    
      return max;
  }

  public int min(int[] nums) {
    int s;
    int min = nums[0];
    for(s = 1; s < nums.length; s++)
    if (nums[s] < min)
    min = nums[s];

    return min;
  }
}