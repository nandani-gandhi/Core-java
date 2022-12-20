package array;

public class SingleDimensionalArray {
    void  PrintArray(String arr[])
    {
        for(String name:arr)
        {
            System.out.println(name);
        }
    }
    public int max(int [] array) {
        int max = 0;

        for(int i : array ) {
            if(i>max) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int a[]={33,3,4,5};
        for(int i : a) {
            System.out.println(i);
        }
        SingleDimensionalArray singleDimensionalArray = new SingleDimensionalArray();
        System.out.println("Max number is:-"+singleDimensionalArray.max(a));
        singleDimensionalArray.PrintArray(new String[]{"Nandani","Hasti"});
    }
}
