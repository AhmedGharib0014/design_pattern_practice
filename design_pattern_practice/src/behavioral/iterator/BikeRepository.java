package behavioral.iterator;

import java.util.Iterator;


public class BikeRepository implements Iterable<String> {

    private String[]  bikes;
    private int index;

    public BikeRepository() {
        this.bikes = new String[10];
        this.index = index;
    }

    public void addBike(String bike){
        if(index >= bikes.length){
            String[] newStringArr = new String[bike.length()+5];
            System.arraycopy(bikes,0,newStringArr,0,bikes.length);
            bikes = newStringArr;
        }

        bikes[index]= bike;
        index++;
    }


    @Override
    public Iterator<String> iterator() {
       Iterator<String> it= new Iterator<String>() {
           private int iteratorIndex=0;

           @Override
           public boolean hasNext() {
               return iteratorIndex < bikes.length && bikes[iteratorIndex] != null;
           }

           @Override
           public String next() {
               return bikes[iteratorIndex++];
           }
        };

        return it;
    }
}
