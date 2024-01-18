package Patterns.Structural.Proxy.Example.Protection_proxy.Account.Users;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Proxy
public class Owner implements InvocationHandler {

  private IUser user;

  public Owner(IUser user) {
    this.user = user;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws RuntimeException {
      if (method.getName().startsWith("get") || method.getName().startsWith("set") ||
              method.getName().equals("toString")) {
          try {
              return method.invoke(user, args);
          } catch (IllegalAccessException | InvocationTargetException e) {
              throw new RuntimeException("InvocationTargetException", e);
          }
      } else if (method.getName().equals("upRang")) {
        throw new RuntimeException("You can't up rang");
      }
    //When we invoke another method, do nothing
    return null;
  }
}

