package io.zipcoder.microlabs.arrays;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayParty {

    public String printArray(String[] inputArray){
        String output = "*** Output ***\n";

        return output + String.join("\n",Arrays.stream(inputArray).collect(Collectors.toList()));

//        for(String string : inputArray){
//            output += "\n"+string;
//        }
//        return output;
    }

    public String lastElement(String[] inputArray){
        String output = "*** Output ***";
        return output+= "\n"+ inputArray[inputArray.length-1];
    }

    public String lastButOne(String[] inputArray){
        String output = "*** Output ***";
        return output+= "\n"+ inputArray[inputArray.length-2];
    }

    public String reverse(String[] inputArray){
        String output = "*** Output ***\n";
        List<String> List = Arrays.stream(inputArray).collect(Collectors.toList())
        Collections.reverse(List);
        return output + String.join("\n",List);
//        for(int i = inputArray.length-1;i>=0;i--){
//            output += "\n"+inputArray[i];
//        }
        return output;
    }


    public String isPalindrome(String[] inputArray){
        for(int i = 0 ; i<inputArray.length/2;i++){
            if(!inputArray[i].equals(inputArray[inputArray.length-1-i])){
                return "False";
            }
        }
        return "True";
    }


    public String compress(int[] inputArray){
        String output = "*** Output ***";
        int nums;
        int num = -1;
        //                output += "\n: "+i;
//                num = i;
        long count = 0L;
        for (int i : inputArray) {
            if (i != num) {
                count++;
                num = 1;
            }
        }
        nums = (int) count;


        //output += Arrays.stream(inputArray).filter(n -> n == num).collect(Collectors.toList());
        return output;
    }


    public String pack(char[] inputArray){
        String output = "*** Output ***\n: ";
        char save = inputArray[0];
        for(char c : inputArray){
            if(c == save){
                output += c;
            }
            else{
                output += ", "+c;
                save = c;
            }
        }
        return output;
    }

    private static String withPre(String[] array,String pre){
        String count = String.join("\n",Arrays.stream(array).filter(str -> str.startsWith(pre)).collect(Collectors.toList()));

        return count;
    }

}
