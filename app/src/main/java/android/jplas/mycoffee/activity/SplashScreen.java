package android.jplas.mycoffee.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.jplas.mycoffee.R;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
                finish();
            }
        }).start();
    }

    private void doWork(){
        for (int progress = 0; progress<100; progress+=20){
            try{
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (Exception e){
                e.printStackTrace();
                e.getMessage();
            }
        }
    }

    private void startApp(){
        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
    }
}
