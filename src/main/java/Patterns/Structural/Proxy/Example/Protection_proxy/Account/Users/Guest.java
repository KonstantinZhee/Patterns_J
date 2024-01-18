package Patterns.Structural.Proxy.Example.Protection_proxy.Account.Users;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Proxy
public class Guest implements InvocationHandler {

  private IUser user;

  public Guest(IUser user) {
    this.user = user;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws RuntimeException {
      if (method.getName().startsWith("get") || method.getName().equals("upRang") || method
        .getName().equals("toString")) {
          try {
              return method.invoke(user, args);
          } catch (InvocationTargetException | IllegalAccessException e) {
              throw new RuntimeException("InvocationTargetException", e);
          }
      } else if (method.getName().startsWith("set")) {
        throw new RuntimeException("You can't change not your's info");
      }
    //When we invoke another method, do nothing
    return null;
  }
}

