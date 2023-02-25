package creational.prototype;

public class prototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        // first costly constructor
        Item item = new Item("name1",3);
        System.out.println(item);
        System.out.println(item.getName());
        System.out.println(item.getCount());


       try {
           Item item2 =(Item) item.clone();
           item2.setName("test");
           System.out.println(item2);
           System.out.println(item2.getName());
           System.out.println(item2.getCount());
       }catch (Exception e){

       }
    }
}
