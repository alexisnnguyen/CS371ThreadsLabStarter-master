package edu.up.cs301threadslab;

import static edu.up.cs301threadslab.Animation.rand;

public class ThreadStarAnimation extends Thread{

    StarAnimation star;

    public ThreadStarAnimation(StarAnimation starAnimation) {
        star = starAnimation;
    }
    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int x = rand.nextInt(2);
            if (x == 0) {
                star.addStar();
            } else {
                star.removeStar();
            }
        }
    }

}
