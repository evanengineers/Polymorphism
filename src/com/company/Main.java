package com.company;
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people.";
    }
}

class IndependanceDay extends Movie {

    public IndependanceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attemp to take over planet earth";
    }
}


class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class ForgettableMovie extends Movie {

    public ForgettableMovie() {
        super("Forgettable");
    }
    //No plot Method

}


public class Main {

    public static void main(String[] args) {
            for (int i = 0; i < 11; i++) {
                Movie movie = random();
                System.out.println("Movie #" + i +
                        " : " + movie.getName() + "\n" +
                        "Plot: " + movie.plot() + "\n");
            }


    }

    public static Movie random() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Number generated was: " +randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependanceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new ForgettableMovie();
        }
        return null;
    }

}


























