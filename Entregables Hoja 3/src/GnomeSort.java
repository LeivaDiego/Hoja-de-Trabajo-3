public class GnomeSort extends Sort{

    public void gnomeSort(int[] unsortednNums, int size){
        int index = 0;

        while (index < size) {
            if (index == 0)
                index++;
            if (unsortednNums[index] >= unsortednNums[index - 1])
                index++;
            else {
                int temp = 0;
                temp = unsortednNums[index];
                unsortednNums[index] = unsortednNums[index - 1];
                unsortednNums[index - 1] = temp;
                index--;
            }
        }
    }
}
