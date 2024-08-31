package arrays;

public class ArrayProblem {
    public static void main(String[] args) {
//        sum of array-elements in array
        int numbers[] = {1, 2, 3, 4, 5, 6};
        /*int sum = 0;
        for (int i:numbers) {
            sum = sum+ i;
        }
        System.out.println("Sum= "+sum);*/

/*//        find min from array
        int min=Integer.MAX_VALUE;
        for (int i : numbers){
            if (i<min){
                min = i;
            }
        }
        System.out.println("Minimum is: "+min);*/

//        Multidimentional array - subject marks of student
         /*marks[0][0]=12;
        marks[0][1]=98;
        marks[0][2]=32;

        marks[1][0]=12;
        marks[1][1]=67;
        marks[1][2]=87;

        marks[2][0]=12;
        marks[2][1]=98;
        marks[2][2]=32;

        marks[3][0]=12;
        marks[3][1]=67;
        marks[3][2]=87;*/

        //to optimize it
        int marks[][]= {
                {12, 98, 34},
                {12, 67, 87},
                {12, 98, 23}
        };
        System.out.println(marks[0][1]);
        System.out.println(marks[0][2]);


    }
}
