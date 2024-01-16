package Patterns.Facade;

import Patterns.Facade.SubSystem.Mather;
import Patterns.Facade.SubSystem.Proz;
import Patterns.Facade.SubSystem.Video_Card;

public class ComputerFacade {
    private Video_Card video_card;
    private Proz proz;
    private Mather mather;

    public ComputerFacade(Video_Card video_card, Proz proz, Mather mather) {
        this.video_card = video_card;
        this.proz = proz;
        this.mather = mather;
    }

    public void computerOn() {
        mather.powerOn();
        proz.powerOn();
        video_card.powerOn();
        video_card.showPicture();
    }

    public void computerOff() {
        mather.powerOff();
        proz.powerOff();
        video_card.powerOff();
    }
}
