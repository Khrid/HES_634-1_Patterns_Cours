package lab1.ex2.clock;

import lab1.ex2.observer.Observer;
import lab1.ex2.timer.ClockTimer;

public class AnalogTimer implements Observer {
    public AnalogTimer(ClockTimer clockTimer) {
        clockTimer.registerObserver(this);
    }

    @Override
    public void update(int h, int m, int s) {
        System.out.println("[" + h + ":" + m + ":" + s + "] Tic toc, second hand moving forward!");
    }
}
