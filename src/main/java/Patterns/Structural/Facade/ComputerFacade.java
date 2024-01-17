package Patterns.Structural.Facade;

import Patterns.Structural.Facade.SubSystem.Mather;
import Patterns.Structural.Facade.SubSystem.Proz;
import Patterns.Structural.Facade.SubSystem.Video_Card;

public class ComputerFacade {
    private final Video_Card video_card;
    private final Proz proz;
    private final Mather mather;

    public ComputerFacade(final Video_Card video_card, final Proz proz, final Mather mather) {
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
