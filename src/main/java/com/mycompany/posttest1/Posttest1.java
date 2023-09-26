package com.mycompany.posttest1;
import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args) {
       
        ArrayList<Game> games = new ArrayList<>();

        games.add(new Game("The Elder Scrolls V: Skyrim", 2011, "RPG"));
        games.add(new Game("Grand Theft Auto V", 2013, "Action-Adventure"));
        games.add(new Game("The Outlast Trial", 2023, "Horror"));
        games.add(new Game("Fifa 23", 2022, "Sport"));
        games.add(new Game("Fallout New Vegas", 2010, "RPG"));
        games.add(new Game("God Of War", 2018, "Action-Adventure"));

        
        for (Game game : games) {
            System.out.println("Informasi Game:");
            System.out.println("Judul Game: " + game.gameTitle);
            System.out.println("Tahun Rilis: " + game.tahunRilis);
            System.out.println("Genre: " + game.genre);
        }
    }
}


