package edu.up.cs301threadslab;

public class ThreadAnimationView extends Thread{

    AnimationView av;

    public ThreadAnimationView(AnimationView view) {
        av = view;
    }
    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            av.invalidate();
        }
    }

}
