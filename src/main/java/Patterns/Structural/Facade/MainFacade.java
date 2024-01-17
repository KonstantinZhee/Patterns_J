package Patterns.Structural.Facade;

import Patterns.Structural.Facade.SubSystem.Mather;
import Patterns.Structural.Facade.SubSystem.Proz;
import Patterns.Structural.Facade.SubSystem.Video_Card;

public class MainFacade {
    public static void main(String[] args) {
        Video_Card video_card = new Video_Card();
        Proz proz = new Proz();
        Mather mather = new Mather();
        ComputerFacade computerFacade = new ComputerFacade(video_card, proz, mather);
        computerFacade.computerOn();
        computerFacade.computerOff();
    }
}
