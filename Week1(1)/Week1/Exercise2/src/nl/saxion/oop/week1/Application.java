package nl.saxion.oop.week1;

import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1200, 600);
    }
    ArrayList<Video> Videos;

    public void run() {
        // TODO: Load videos from csv file.
        Videos = readVideos();

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show watchlist ");
            SaxionApp.printLine("* 2) Watch video");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                // TODO: Your implementation here
                showWatchlist();
                SaxionApp.pause();
            } else if (menuInput == 2) {
                // TODO: Your implementation here
                watchVideo();
                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
            }

        } while (menuInput != 0);
    }

    public void showWatchlist(){
        int index = 1;
        SaxionApp.printLine();
        for(Video video: Videos){
            SaxionApp.print(index + ") " + video.getTitle() + " - "
                    + video.getChannel_title() + " - " + video.getVideo_id() + " ("
                    + video.getViews() + " views) ");
            if(!video.isWatched()){
                SaxionApp.printLine("[NOT WATCHED]", Color.RED);
            }else{
                SaxionApp.printLine("[WATCHED]", Color.GREEN);
            }
            index++;
        }
    }

    public void watchVideo(){
        showWatchlist();
        SaxionApp.printLine();
        SaxionApp.print("Please enter a video to watch: ");
        int index = SaxionApp.readInt() - 1;
        SaxionApp.printLine();
        SaxionApp.printLine("You have watched:");
        Video video = Videos.get(index);
        SaxionApp.printLine(video.getTitle() + " - "
                + video.getChannel_title() + " - " + video.getVideo_id() + " ("
                + video.getViews() + " views) ");
        video.setWatched(true);
    }

    private ArrayList<Video> readVideos() {
        ArrayList<Video> temp = new ArrayList<>();

        CsvReader reader = new CsvReader("Exercise2/youtubevideos.csv");
        reader.skipRow();

        while(reader.loadRow()){
            String video_id = reader.getString(0);
            String title = reader.getString(1);
            String channel_title = reader.getString(2);
            int views = reader.getInt(3);
            int likes = reader.getInt(4);
            int dislikes = reader.getInt(5);

            Video v = new Video(video_id, title, channel_title, views, likes, dislikes, false);
            temp.add(v);
        }

        return temp;
    }

}
