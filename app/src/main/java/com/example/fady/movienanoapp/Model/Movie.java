package com.example.fady.movienanoapp.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Fady on 2017-03-04.
 */

public class Movie implements Parcelable {

    int id;
    String title;
    String overview;
    String poster_path;
    String release_date;
    String vote_average;

    public Movie() {
    }

    public Movie(String title, String overview, String poster_path, String release_date, String vote_average) {
        this.title = title;
        this.overview = overview;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.vote_average = vote_average;
    }



    protected Movie(Parcel in) {
        id = in.readInt();
        title = in.readString();
        overview = in.readString();
        poster_path = in.readString();
        release_date = in.readString();
        vote_average = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getVote_average() {
        return vote_average;
    }

    public int getId() {
        return id;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(overview);
        dest.writeString(poster_path);
        dest.writeString(release_date);
        dest.writeString(vote_average);
    }
}
