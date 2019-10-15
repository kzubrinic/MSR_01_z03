package hr.unidu.kz.msr_zadatak_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pregled();
    }

    public void pregled() {
        Intent intent = new Intent(this, PregledActivity.class);
        startActivity(intent);
    }

}
