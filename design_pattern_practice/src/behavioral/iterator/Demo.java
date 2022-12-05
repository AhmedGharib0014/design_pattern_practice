package behavioral.iterator;

import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {

        BikeRepository bikeRepository= new BikeRepository();

        bikeRepository.addBike("bike1");
        bikeRepository.addBike("bike2");
        bikeRepository.addBike("bike3");


        Iterator it = bikeRepository.iterator();


        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
