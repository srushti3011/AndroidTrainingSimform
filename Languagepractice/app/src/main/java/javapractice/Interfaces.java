package javapractice;

interface Actable {
    public void makeScript();
    public void practiceScript();
    void startActing();
}

interface ActandSingable extends Actable {
    public void composeSong();
    public void singSong();
}

class Actor implements Actable {
    public void makeScript() {
        System.out.println("Making scripts");
    }
    public void practiceScript() {
        System.out.println("Practicing the script");
    }
    public void startActing() {
        System.out.println("Starting Acting");
    }
}

class Artist implements ActandSingable {
    @Override
    public void composeSong() {
        System.out.println("composing the song");
    }
    @Override
    public void singSong() {
        System.out.println("singing a song");
    }
    @Override
    public void makeScript() {
        System.out.println("making script");
    }
    @Override
    public void practiceScript() {
        System.out.println("practicing script");
    }
    @Override
    public void startActing() {
        System.out.println("starting to act");
    }
}

interface iOne {
    default void display() {
        System.out.println("iOne display");
    }
}
interface  iTwo {
    default void display() {
        System.out.println("iTwo display");
    }
}
class ImplementMultiple implements iTwo, iOne {
    @Override
    public void display() {
        System.out.println("Display inside implementMultiple class");
    }
}
class Interfaces {
    public static void main(String[] args) {
        Actor personOne = new Actor();
        personOne.makeScript();
        personOne.practiceScript();
        personOne.startActing();
        System.out.println("Actor 1 completed acting");
        Artist artistOne = new Artist();
        artistOne.composeSong();
        artistOne.makeScript();
        System.out.println("Artist 1 made script and composed song");

        ImplementMultiple instanceOne = new ImplementMultiple();
        instanceOne.display();
    }
}
