package nl.rug.arrays;

import java.util.Arrays;

public class Assignment {

    public static void main(String[] args) {

        int[] numbers = {33,22,11,55,66};

        Arrays.sort(numbers);

        System.out.println(numbers);

        for(int element: numbers) {
            System.out.println(element);
        }


        Song[] songs = new Song[3];

        Song first = new Song();
        first.setDuration(3.54);
        Song second = new Song();
        second.setDuration(3);
        Song third = new Song();
        third.setDuration(5);


        songs[0] =  first;
        songs[1]= second;
        songs[2] = third;

//        songs = {first, second, third};

        for(Song song: songs) {
            System.out.println(song);
        }


    }

}

class Song {

    private long id;
    private String name;
    private double duration;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}