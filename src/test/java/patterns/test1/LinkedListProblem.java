package patterns.test1;

import java.util.LinkedList;

public class LinkedListProblem {

    LinkedList<String> firstEven = new LinkedList<>();
    LinkedList<String> firstOdd = new LinkedList<>();

    public int getMiddleListIndex(LinkedList<String> listConsumer){
        int middle = 0;
        for(int i = 0; i <listConsumer.size(); i++){
            int length = listConsumer.indexOf(listConsumer.getLast());
            if(listConsumer.indexOf(listConsumer.get(i)) == (int)Math.round(length / 2)){
                middle = (int) Math.round(length / 2);
            }

        }
        return middle;
    }

}
