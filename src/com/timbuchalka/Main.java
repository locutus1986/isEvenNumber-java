package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    int x = 4;
	    int finishNumber = 20;

	    while(x <= finishNumber){
	        x++;
	        if(!isEvenNumber(x)){
	            continue;
            }
            System.out.println("Even number " + x);
        }
    }

    public static boolean isEvenNumber(int x){
        boolean result = false;

        if(x%2 == 0){
            result = true;
        }

        return result;
    }
}
