public class SortingUtil{
    //This is self explanatory, if the checkList is false, swap the indices.
    public static void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //This checks if two target indices are in order, and returns true or false.
    public static boolean checkList (int[] arr)
    {
        int len = arr.length - 1;
        for (int pos = 0; pos < len; pos++)
        {
            if (arr[pos] > arr[pos+1])
            {
                return true;
            }
        }
        return false;
    }

    public static int findSmallIndex(int[] arr, int start) {
        int smallestNumber = arr[start];
        int i = start;
        while (i < arr.length) {
            if (smallestNumber > arr[i]) {
                smallestNumber = arr[i];
            }
            i++;
        }
        i = start;
        //This checks against the array for the smallestNumber and returns the index of it.
        while (i < arr.length)
        {
            if(arr[i] == smallestNumber)
            {
                return i;
            }
            i++;
        }
        return start;
    }

    public static int[] copyIntArray(int[] arr)
    {
        int[] arr2 = new int[arr.length];
        for(int num : arr)
        {
            arr2[num] = arr[num];
        }
        return arr2;
    }

    public static int[] randomIntArr(int count)
    {
        int[]arr = new int[count];
        for (int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random() * 1001);
        }

        return arr;
    }



}