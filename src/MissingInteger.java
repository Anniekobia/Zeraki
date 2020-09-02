
import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MissingInteger{

    public static int missingInt;

    //Function to get array size and elements from user input
    public static Integer[] getArrayInput(){
        int arraySize;
        Scanner s = new Scanner(System.in);
        System.out.println("What is your array size?");
        arraySize = s.nextInt();
        Integer array[] = new Integer[arraySize];
        System.out.println("Enter all elements in the array:");
        for(int i = 0; i < arraySize; i++)
        {
            array[i] = s.nextInt();
        }
        return array;
    }

    //Function to take arraylist and return missing integer
    public static int missingInt(ArrayList<Integer> array){
        for(int i=1;i<=array.size()+1;i++){
            if(array.contains(i)){
                System.out.println(String.valueOf(i)+"not missing");
            }else {
                missingInt = i;
            }
        }
        return missingInt;
    }

    public static void main(String []args){
        Integer array[] = getArrayInput();
        int missingInteger = missingInt(new ArrayList<Integer>(Arrays.asList(array)));
        System.out.println("\nThe missing integer is: "+String.valueOf(missingInteger));
    }
}
