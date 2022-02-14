package nl.saxion.oop.week1;

public class Video {
    private String video_id;
    private String title;
    private String channel_title;
    private int views;
    private int likes;
    private int dislikes;
    private boolean watched;

    public Video(String _video_id, String _title, String _channel_title, int _views, int _likes, int _dislikes, boolean _watched){
        video_id = _video_id;
        title = _title;
        channel_title = _channel_title;
        views = _views;
        likes = _likes;
        dislikes = _dislikes;
        watched = _watched;
    }

    public String getVideo_id() {
        return video_id;
    }

    public String getTitle() {
        return title;
    }

    public String getChannel_title() {
        return channel_title;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean _watched){
        watched = _watched;
    }
}
