package com.example.fady.movienanoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

import com.example.fady.movienanoapp.Fragment.MainActivityFragment;

public class MainActivity extends AppCompatActivity {
    Toast toast;

    @Override
    protected void onStart() {
        super.onStart();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new MainActivityFragment()).commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
    }

//
//    @Override
//    public void itemSelected(Movie movie) {
////        if (toast != null) {
////            toast.cancel();
////        }
////        toast = Toast.makeText(this, movie.getOverview().toString(), Toast.LENGTH_SHORT);
////        toast.show();
//        Detailaed_fragment detailaed_fragment=new Detailaed_fragment();
//        Bundle bundle=new Bundle();
//        bundle.putParcelable("Movie_Details",movie);
//        detailaed_fragment.setArguments(bundle);
//        getSupportFragmentManager().beginTransaction().addToBackStack("afa").replace(R.id.frame,detailaed_fragment).commit();
//    }
}
