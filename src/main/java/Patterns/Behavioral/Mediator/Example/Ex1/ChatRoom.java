package Patterns.Behavioral.Mediator.Example.Ex1;

import Patterns.Behavioral.Mediator.Example.Ex1.Users.Admin;
import Patterns.Behavioral.Mediator.Example.Ex1.Users.User;

import java.util.HashSet;
import java.util.Set;

public class ChatRoom {

  private Set<User> users = new HashSet<>();

  public void addUser(User user) {
    users.add(user);
  }

  public void showMessage(User user, String mess) {
    if (user instanceof Admin) {
      mess = "ADMIN: " + user.getName() + " is send " + mess;
    } else {
      mess = user.getName() + " is send " + mess;
    }

    String finalMess = mess;

    users.forEach(x -> System.out.println(finalMess + " TO " + x.getName()));

  }
}
