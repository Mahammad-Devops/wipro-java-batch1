package javaprep;

public class bubblesort {
	 public static void main(String[] args) {
	        int[] array = {72, 84, 55, 92, 32, 15, 100};

	        System.out.println("Array before sorting:");
	        printArray(array);

	        bubbleSort(array);

	        System.out.println("\nArray after sorting:");
	        printArray(array);
	    }

	    public static void bubbleSort(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    // Swap array[j] and array[j+1]
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }

	    static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}


