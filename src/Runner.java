public class Runner {
        public static void main(String[]args){
            SortCompetition team7 = new Team7SortCompetition();
            int[] randIntArr = randomIntsArr(10000);
            String[] randStringArr=randomStringArr(10000,5);

            System.out.println("Unsorted");
            printArr(randIntArr);

            long time = System.currentTimeMillis();
            int median = team7.challengeOne(randIntArr);
            time = System.currentTimeMillis()-time;
            System.out.println("Challenge One Time Taken: " + time * 0.001 +" Seconds");
            System.out.println("Median equals: " + median);

            System.out.println("Sorted");
            printArr(randIntArr);

        }
}