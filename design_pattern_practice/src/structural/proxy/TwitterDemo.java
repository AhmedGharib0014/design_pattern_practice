package structural.proxy;

public class TwitterDemo {

    public static void main(String[] args) {
        // proxy that wrap twitter service impl
        TwitterService service= (TwitterService)  SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeLine("ahmed"));

        service.postToTimeLine("test","shouldn't be printed");

    }
}
