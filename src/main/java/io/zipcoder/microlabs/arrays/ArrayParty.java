package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray){
        String output = "*** Output ***";
        for(String string : inputArray){
            output += "\n"+string;
        }
        return output;
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
        String output = "*** Output ***";
        for(int i = inputArray.length-1;i>=0;i--){
            output += "\n"+inputArray[i];
        }
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
        int num = -1;
        for(int i : inputArray){
            if(i!=num){
                output += "\n: "+i;
                num = i;
            }
        }
        return output;
    }


    public String pack(char[] inputArray){
        String output = "*** Output ***\n: ";
        char save = inputArray[0];
        for(char c : inputArray){
            if(c == save){
                output += c;
            }else{
                output += ", "+c;
                save = c;
            }
        }
        return output;
    }



}
