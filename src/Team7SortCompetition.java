public class Team7SortCompetition extends SortCompetition {

        @Override
        public int challengeOne(int[] arr) {
            int length = arr.length;

            for (int index = 0; index < arr.length ; index ++)
            {
                for (int j = index; j > 0; j-- )
                {
                    if (arr[j]<arr[j-1])
                    {
                        swap2(arr, j,j-1);
                    }
                }
            }


            int median = arr[length/2];
            return median;
        }

        @Override
        public int challengeTwo(String[] arr) {

            {
                int len = arr.length;

                while (isUnsorted(arr)) {
                    for (int i = 0; i < len - 1; i++) {
                        if ((arr[i].compareTo(arr[i + 1])) > 0) {
                            swap(arr, i, i + 1);
                        }

                    }
                }
            }
        }

        @Override
        public int challengeThree(int[] arr) {
            return 0;
        }

        @Override
        public int challengeFour(int[][] arr) {
            return 0;
        }

        @Override
        public int challengeFive(Comparable[] arr, Comparable query) {
            return 0;
        }

        @Override
        public String greeting() {
            return null;
        }

        private static void mergeSortHelper(int[] elements,
                                            int from, int to, int[] temp)
        {
            if (from < to)
            {
                int middle = (from + to) / 2;
                mergeSortHelper(elements, from, middle, temp);
                mergeSortHelper(elements, middle + 1, to, temp);
                merge(elements, from, middle, to, temp);
            }
        }

        private static void merge(int[] elements, int from, int mid, int to, int[] temp) {
            int i = from;
            int j = mid + 1;
            int k = from;

            while (i <= mid && j <= to) {
                if (elements[i] < elements[j]) {
                    temp[k] = elements[i];
                    i++;
                } else {
                    temp[k] = elements[j];
                    j++;
                }
                k++;
            }

            while (i <= mid) {
                temp[k] = elements[i];
                i++;
                k++;
            }
            while (j <= to) {
                temp[k] = elements[j];
                j++;
                k++;
            }
            for (k = from; k <= to; k++) {
                elements[k] = temp[k];
            }
        }

        public int[] randIntsArr(int count) {
            int[] list= new int[count];
            for (int i=0; i<list.length; i++)
            {
                list[i]=(int) (Math.random() *10001);
            }
            return list;
        }

        public String[] randomStringArr(int count, int length) {
            String[] arr = new String[count];

            while (count > 0) {
                int i = 0;
                String s = "";

                while(i < length) {
                    char c = (char)((Math.random()*26) + 97);
                    s = s + c;
                    i++;
                }

                count--;
                arr[count] = s;
            }

            return arr;
        }
        public static void swap(String[] array, int x, int y)
        {
            String temp = array[x];
            array[x] = array[y];
            array[y] = temp;
        }
        public static void swap2(int[] array, int x, int y)
        {
            int temp = array[x];
            array[x] = array[y];
            array[y] = temp;
        }
        public static void printIntArr(int [] arr) {
            //prints array
        }
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


}
