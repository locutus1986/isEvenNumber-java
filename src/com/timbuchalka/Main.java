package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    int x = 4;
	    int counter = 0;
	    int finishNumber = 20;

	    while(x <= finishNumber){
	        x++;
	        if(!isEvenNumber(x)){
	            continue;
            }
            counter++;
            System.out.println("Even number " + x);
            if(counter >= 5){
                break;
            }
        }
        System.out.println(counter + " even numbers were found");
    }

    public static boolean isEvenNumber(int x){
        boolean result = false;

        if(x%2 == 0){
            result = true;
        }

        return result;
    }
}
