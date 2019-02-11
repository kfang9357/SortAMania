public class Runner {

    public static void main(String[] args)
    {
        Team7SortCompetition team7 = new Team7SortCompetition();
        int[] randIntArr = SortingUtilities.randomIntsArr(10000);
        String[] randStringArr = SortingUtilities.randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team7.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;

        System.out.println("Challenge One Time Taken: " + time * 0.001 + " seconds.");
        System.out.println("Median Equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);

        team7.challengeTwo(randStringArr, "Helloo");
        printArr(randStringArr);

    }

    public static void printArr(int[]arr){
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void printArr(String[]arr){
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
