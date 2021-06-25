package edu.cnm.deepdive;

/*

Given an array of ints, return true if the value 3 appears in the array exactly 3 times,
and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 */

public class CodingBatHaveThreeThrees {

  private static int[] one = {3, 1, 3, 1, 3};
  private static int[] two = {3, 1, 3, 3};
  private static int[] three = {3, 4, 3, 3, 4};


  public static void main(String[] args) {
    System.out.println("Given the array [3, 1, 3, 1, 3], the outcome is " + haveThree(one) + ".");
    System.out.println("Given the array [3, 1, 3, 3], the outcome is " + haveThree(two) + ".");
    System.out.println("Given the array [3, 4, 3, 3, 4], the outcome is " + haveThree(three) + ".");
  }

  public static boolean haveThree(int[] nums) {
    int count3 = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 3) {
        count3++;
        i++;
      }
    }
    return (count3 == 3);
  }

}
