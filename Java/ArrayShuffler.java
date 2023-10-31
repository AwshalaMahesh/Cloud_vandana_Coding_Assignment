package test;

import java.util.Random;

public class ArrayShuffler {

	public static void main(String[] args) {
		int[] originalArray = {1,2,3,4,5,6,7};
		int[] shuffledArray = shuffleArray(originalArray);
		
		System.out.print("Original Array: ");
        printArray(originalArray);
        
        System.out.print("Shuffled Array: ");
        printArray(shuffledArray);

	}
	public static int[] shuffleArray(int[] array) {
        int[] shuffledArray = array.clone();
        Random random = new Random();

        for (int i = shuffledArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap elements at i and j
            int temp = shuffledArray[i];
            shuffledArray[i] = shuffledArray[j];
            shuffledArray[j] = temp;
        }

        return shuffledArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
