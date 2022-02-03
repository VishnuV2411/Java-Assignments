package assignment.assignment6;

class VampireNumber{
    boolean flag = false;

    public int[] breakingNumber(int number){
        int index = 0;
        int length = (int) (Math.log10(number)+1);
        int[] array = new int[length];
        while(number != 0){
            int remainder = number % 10;
            array[index] = remainder;
            number = number / 10;
            index++;
        }
        return array;
    }

    boolean isVampire(int[] arr, int number){
        int firstPart = 0;
        int secondPart = 0;
        for (int index = 0; index < (arr.length) / 2; index++){
            firstPart += arr[index] * Math.pow(10, (double)(arr.length) / 2 - index -1);
        }

        for (int index = (arr.length) / 2; index < arr.length; index++){
            secondPart += arr[index] * Math.pow(10, (arr.length - index - 1));
        }

        return firstPart * secondPart == number;
    }

    void permutationFinder(int[] arr, int index, int number){
        if(index >= arr.length - 1){
            if(this.isVampire(arr, number)){
                flag = true;
            }
        }

        for (int i = index; i < arr.length; i++){
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            permutationFinder(arr, index + 1, number);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }
    }
}

public class Assignment6Q1 {
    public static void main(String[] args) {
        VampireNumber vampire = new VampireNumber();
        int number = 1001;
        int counter = 0;
        while(counter < 100){
            if(((int) (Math.log10(number) + 1)) % 2 == 0){
                int[] array = vampire.breakingNumber(number);
                vampire.permutationFinder(array,0,number);
                if(vampire.flag){
                    System.out.println(number);
                    counter++;
                    vampire.flag = false;
                }
            }
        }
    }
}
