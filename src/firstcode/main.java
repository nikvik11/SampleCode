package firstcode;

class main{
    public static void main(String[] args){

        int n = 5; //number of values in array foo
        int[] foo = {0,1,2,3,4};

        int m = 100;
        int[] bar = new int[m];

        //assigns numbers to array bar from 0 to 99
        for(int i = 0; i<m; i++){
            bar[i] = i;
        }

        System.out.println("The total number of even numbers in foo are: " + countEvenNum(foo,n));
        System.out.println("The total number of even numbers in bar are: " + countEvenNum(bar,m));
    }

    public static int countEvenNum(int[] arr,int size){

        int countEvenNum = 0;

        for(int i = 0; i < size; i++){
            if(arr[i]%2 == 0){
                countEvenNum++;
            }
        }

        return countEvenNum;
    }
}
