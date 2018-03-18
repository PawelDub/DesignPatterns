package sortAlgorithms;

public class SortMethods {

    private static void quickSort(int table[], int leftIndex, int rightIndex) {
        int temp;
        int firstIndex = leftIndex;
        int lastIndex = rightIndex;
        int tableCenter = table[leftIndex + ((rightIndex - leftIndex) / 2)];

        while (firstIndex <= lastIndex) {
            if (leftIndex >= rightIndex) return;
            
            while (table[firstIndex] < tableCenter)
                firstIndex++;
            
            while (table[lastIndex] > tableCenter)
                lastIndex--;
            
            if (firstIndex <= lastIndex) {
                swap(table, firstIndex, lastIndex);
                firstIndex++;
                lastIndex--;
            }
        }

        if (firstIndex < rightIndex)
            quickSort(table, firstIndex, rightIndex);
        
        if (lastIndex > leftIndex)
            quickSort(table, leftIndex, lastIndex);
    }

    public static void bubblesSort(int[] table){
        int tableSize = table.length -1;
        while (tableSize > 0){
            int last = 0;
            for(int i = 0; i < tableSize; i++){
                if(table[i] > table[i+1]){
                    swap(table, i, i+1);
                    last = i;
                }
            }
            tableSize = last;
        }
    }

    public static void swap(int[] table, int first, int second){
        int temp      = table[first];
        table[first]  = table[second];
        table[second] = temp;
    }

    public static void insertionSort(int[] table) {
        int klucz, j;

        for (int i = 1; i < table.length; i++) {
            j = i;
            klucz = table[i];

            while (j > 0 && table[j - 1] > klucz) {
                table[j] = table[j - 1];
                j--;
            }
            table[j] = klucz;
        }
    }

    public static void countingSort(int[] table){
        int[] helpTable = new int[table.length];

        for( int i = 0; i < table.length; i++){
            helpTable[table[i]]++;
        }
        int c = 0;
        for (int i = 0; i < helpTable.length; i++){
            if(helpTable[i] > 0) {
                for(int k = 0; k < helpTable[i]; k++){
                    table[c] = i;
                    c++;
                }
            }
        }
    }
}
