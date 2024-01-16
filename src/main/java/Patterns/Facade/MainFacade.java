package Patterns.Facade;

import Patterns.Facade.SubSystem.Mather;
import Patterns.Facade.SubSystem.Proz;
import Patterns.Facade.SubSystem.Video_Card;

public class MainFacade {
    public static void main(String[] args) {
        // Init components
        Video_Card video_card = new Video_Card();
        Proz proz = new Proz();
        Mather mather = new Mather();

        ComputerFacade computerFacade = new ComputerFacade(video_card, proz, mather);
        computerFacade.computerOn();

        //some work
        computerFacade.computerOff();
    }
}
