public class Runner {

    public static void Runner(String[] args)
    {
        Team7SortCompetition team7 = new Team7SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team7.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;

        System.out.println("Challenge One Time Taken: " + time * 0.001 + " seconds.");
        System.out.println("Median Equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);

    }

    public static void printArr(int[]arr){
        for (int i:arr)
            System.out.print(i+" ");
    }
    public static void printArr(String[]arr){
        for (String i:arr)
            System.out.print(i+" ");
    }
}
