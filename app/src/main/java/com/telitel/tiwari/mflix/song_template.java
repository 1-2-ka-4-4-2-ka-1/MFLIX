package com.telitel.tiwari.mflix;

import android.os.Parcel;
import android.os.Parcelable;

public class song_template implements Parcelable {



    private Long songId;
    private String songTitle;
    private String songArtist;
    private String songGener;
    private String isFavourite;
    private Long songAlbumId;
    private String songAlbum;
    private String songAlbumArtPath;
    private String  songArtPath;
    private String songPath;

    public song_template(){

    }

    public song_template(  Long song_id,String song_title,String song_artist,String song_genere,String is_favourite,Long song_album_id, String song_album,String song_album_art_path,String song_art_path
            ,String song_path){

        songId=song_id;
        songTitle=song_title;
        songArtist=song_artist;
        songGener=song_genere;
        isFavourite=is_favourite;
        songAlbumId=song_album_id;
        songAlbumArtPath=song_album_art_path;
        songAlbum=song_album;
        songArtPath=song_art_path;
        songPath=song_path;


    }



    // GETTER

    protected song_template(Parcel in) {

        if (in.readByte() == 0) {
            songId = null;
        } else {
            songId = in.readLong();
        }


        songTitle = in.readString();

        songArtist = in.readString();

        songGener= in.readString();

        isFavourite= in.readString();

        if (in.readByte() == 0) {
            songAlbumId = null;
        } else {
            songAlbumId = in.readLong();
        }

        songAlbum = in.readString();

        songAlbumArtPath = in.readString();

        songArtPath = in.readString();

        songPath = in.readString();
    }



    public static final Creator<song_template> CREATOR = new Creator<song_template>() {
        @Override
        public song_template createFromParcel(Parcel in) {
            return new song_template(in);
        }

        @Override
        public song_template[] newArray(int size) {
            return new song_template[size];
        }
    };



    public Long getSongId() {
        return songId;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public Long getSongAlbumId() {
        return songAlbumId;
    }

    public String getSongAlbum() {
        return songAlbum;
    }

    public String getSongAlbumArtPath() {
        return songAlbumArtPath;
    }

    public String getSongArtPath() {
        return songArtPath;
    }

    public String getSongPath() {
        return songPath;
    }

    // SETTER


    public void setSongId(long songId) {
        this.songId = songId;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public void setSongAlbumId(Long songAlbumId) {
        this.songAlbumId = songAlbumId;
    }

    public void setSongAlbum(String songAlbum) {
        this.songAlbum = songAlbum;
    }

    public void setSongAlbumArtPath(String songAlbumArtPath) {
        this.songAlbumArtPath = songAlbumArtPath;
    }


    public void setSongArtPath(String  songArtPath) {
        this.songArtPath = songArtPath;
    }

    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (songId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(songId);
        }
        dest.writeString(songTitle);
        dest.writeString(songArtist);
        if (songAlbumId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(songAlbumId);
        }
        dest.writeString(songAlbum);
        dest.writeString(songAlbumArtPath);
        dest.writeString(songArtPath);
        dest.writeString(songPath);
    }

}