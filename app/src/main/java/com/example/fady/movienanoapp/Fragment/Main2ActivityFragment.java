package com.example.fady.movienanoapp.Fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fady.movienanoapp.Main2Activity;
import com.example.fady.movienanoapp.MainActivity;
import com.example.fady.movienanoapp.Model.Movie;
import com.example.fady.movienanoapp.R;
import com.squareup.picasso.Picasso;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main2ActivityFragment extends Fragment {

    public Main2ActivityFragment() {
    }


    ImageView Poster;
    TextView RDate, OverView, Vote;
    Movie movie;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_main2, container, false);
        Poster = (ImageView) root.findViewById(R.id.Movie_Poster);
        RDate = (TextView) root.findViewById(R.id.released_date);
        Vote = (TextView) root.findViewById(R.id.vote);
        OverView = (TextView) root.findViewById(R.id.overView);
        movie = getActivity().getIntent().getExtras().getParcelable("Movie_Details");
        ((Main2Activity) getActivity()).setTitle(movie.getTitle());

        String baseUrl = "http://image.tmdb.org/t/p/w185/";
        Picasso.with(getContext()).load(baseUrl + movie.getPoster_path()).placeholder(R.drawable.loading_image).into(Poster);
        RDate.setText(movie.getRelease_date());
        OverView.setText(movie.getOverview());
        Vote.setText(movie.getVote_average());
        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ((Main2Activity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(canback);
//        ((Main2Activity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
