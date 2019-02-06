public class challenge extends SortCompetition {


    public int challengeOne(int[] arr){
        /** Data Set - an array of 10,000 random integers between 0-10000
         Task: Sort the list and return the median **/
        Sorts.insertionSort(arr);
        return SortingUtilities.median(arr);
    }

   public int challengeTwo(String[] arr, String query) {
       /** Data Set - an array of 10,000 random strings (strings will be of length 5)
        Task: Sort the list and determine if it contains a given string, return the index of the first instance of that string, or -1 if not found **/
       Sorts.bubbleSort(arr);
   }

    public int challengeThree(int[] arr){
        /** Data Set - a mostly sorted array of 100,000 integers (>75% of elements are in the correct order)
         Task: Sort the list and return the median **/
        Sorts.insertionSort(arr);
        return SortingUtilities.median(arr);
         }

    public int challengeFour(int[][] arr){
        /** Data Set - a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000
         Task: Sort each sub-array and then sort the arrays by their median value
         Return the median of the median array **/

         }
    public int challengeFive(Comparable[] arr, Comparable query){
        /** Data Set - an array of 10,000 objects that implement the comparable interface
         Task: Sort the array by the compareTo method, and determine if it contains the element given. Return the position of the object, or -1 if not found.
         Hint: You must use a stable sort for this challenge, equivalent objects should stay in the same order. **/
         }
    public String greeting(){
        return "x";

    }
}
