package io.zipcoder.microlabs.arrays;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayParty {

    public String printArray(String[] inputArray){
        return "*** Output ***\n"+ String.join("\n",Arrays.stream(inputArray).collect(Collectors.toList()));
    }

    public String lastElement(String[] inputArray){
        return "*** Output ***\n"+ inputArray[inputArray.length-1];
    }

    public String lastButOne(String[] inputArray){
        return "*** Output ***\n"+ inputArray[inputArray.length-2];
    }

    public String reverse(String[] inputArray){
        List<String> list = Arrays.stream(inputArray).collect(Collectors.toList());
        Collections.reverse(list);
        return "*** Output ***\n" + String.join("\n",list);
    }


    public boolean isPalindrome(String[] inputArray){

        //Arrays.stream(inputArray).;

        for(int i = 0 ; i<inputArray.length/2;i++){
            if(!inputArray[i].equals(inputArray[inputArray.length-1-i])){
                return false;//"False";
            }
        }
        return true;//"True";
    }


    public String compress(int[] inputArray){
        List<Integer> inputList = Arrays.stream(inputArray).boxed().collect(Collectors.toList());
        List<Integer> newList = IntStream.range(0,inputArray.length)
                .filter(n -> ((n<inputList.size()-1 && !inputList.get(n).equals(inputList.get(n+1))) || n == inputList.size()-1))
                .mapToObj(n -> inputList.get(n)).collect(Collectors.toList());
        List<String> newStirngList = newList.stream().map(Object::toString).collect(Collectors.toList());
        return "*** Output ***\n"+String.join("\n",newStirngList);
    }


    public String pack(char[] inputArray){
        String output = "*** Output ***\n: ";

        Arrays.stream(String.valueOf(inputArray).split("")).forEach(letter -> {});


        Stream<String> letters = Stream.of("Hello");

        //letters.collect(Collectors.toList()).toString());
        //Stream<Character> cStream  = Arrays.stream(inputArray);



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


}
