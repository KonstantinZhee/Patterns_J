package Patterns.Behavioral.Chain_of_Responsibility.Example;

import Patterns.Behavioral.Chain_of_Responsibility.Example.Steps.Authentication;
import Patterns.Behavioral.Chain_of_Responsibility.Example.Steps.Authorization;
import Patterns.Behavioral.Chain_of_Responsibility.Example.Steps.Registration;
import Patterns.Behavioral.Chain_of_Responsibility.Example.Steps.SpellCheck;
import Patterns.Behavioral.Chain_of_Responsibility.Example.Steps.Step;

public class Ex {

  public static void main(String[] args) {
    Step spellCheck = new SpellCheck();
    Step registration = new Registration();
    Step authorization = new Authorization(registration);
    Step authentification = new Authentication();

    // First we check on accepted symbols,
    spellCheck.setNextStep(authorization);
    // then going to checking if we have this name in DB,
    authorization.setNextStep(authentification);
    // if we haven't, we go to registration,
    registration.setNextStep(authentification);
    // we can add addPrevStep (Deque)

    //After all steps we are checking password + name
    authentification.setNextStep(null);

    System.out.println("Dimasdasd + 112");
    spellCheck.check("Dimasdasd", 112);//wrong all
    System.out.println("Dima + 1");
    spellCheck.check("Dima", 12222); //wrong pass
    System.out.println("Admin + 0");
    spellCheck.check("Admin", 0); //all good
  }

}
