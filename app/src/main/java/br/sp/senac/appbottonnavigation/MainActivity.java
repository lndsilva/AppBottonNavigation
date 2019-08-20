package br.sp.senac.appbottonnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.idBottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.mFavorito:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em Favorito",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mLocation:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em Location",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mRecente:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em Recente",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

    }
}
