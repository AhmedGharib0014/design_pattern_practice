package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {

    private  Object obj;

    private SecurityProxy(Object obj){
        this.obj=obj;
    }

    // this build a proxy around the class
    public static Object newInstance(Object object){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),new SecurityProxy(object));
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       Object result;
       try {
           if(method.getName().contains("post")) throw new Exception("illegal access exception");
           result= method.invoke(obj,args);
       }catch (Exception e){
           throw  new RuntimeException("unexpected"+ e.getMessage());
       }
       return result;
    }


}
