public class SortingUtilities
{
    public int[] randomIntsArr(int count)
    {
        int[]arr = new int[count];
        for (int i = 0; i < count; i++)
        {
            arr[i] = (int) Math.random()*1001;
        }

        return arr;
    }

    public String[] randomStringArr(int num, int length)
    {
        String[] arr = new String [num];
        while (num > 0)
        {
            int i = 0;
            String s = "";
            while (i<length) {
                char c = (char) (Math.random() * 26 + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static void swap (int[]arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap2 (String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isUnsorted(String[] arr)
    {
        int len = arr.length - 1;
        for (int pos = 0; pos < len; pos++)
        {
            if ((arr[pos].compareTo(arr[pos+1]))> 0)
            {
                return true;
            }
        }
        return false;
    }

    public static int[] copyIntArray(int[] arr)
    {
        int[] newArray = new int[arr.length];
        for (int i = 0; i<arr.length; i++)
        {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public static double[] copyDoubleArray(double[] arr)
    {
        double[] newArray = new double[arr.length];
        for (int i = 0; i<arr.length; i++)
        {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public static boolean checkSum(int[] before, int[] after){
        int sum1 = 0;
        for (int i = 0; i< before.length; i++)
        {
            sum1 = sum1 + before[i];
        }
        int sum2 = 0;
        for (int i = 0; i<after.length; i++)
        {
            sum2 = sum2 + after[i];
        }

        if (sum1 == sum2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean checkSum2(double[] before, double[] after){
        double sum1 = 0;
        for (int i = 0; i< before.length; i++)
        {
            sum1 = sum1 + before[i];
        }
        double sum2 = 0;
        for (int i = 0; i<after.length; i++)
        {
            sum2 = sum2 + after[i];
        }

        if (sum1 == sum2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}