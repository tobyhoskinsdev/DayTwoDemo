package examples.aaronhoskins.com.daytwodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String MAIN_TAG = "tag_main";
    private static final String TAG = "tag_main_autogen";
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.tvDisplay);
        //tvDisplay.setText("HELLO ANDROID PEOPLE");
        String hello = getResources().getString(R.string.hello);
        Log.d(MAIN_TAG, "onCreate: WE ARE IN ON CREATE LIFECYCLE " + hello);
        System.out.println("Hello");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: WE ARE IN ON START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: WE ARE IN ON RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: WE ARE IN ON PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: WE ARE IN ON STOP");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: WE ARE IN ON RESTART");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: WE ARE IN ON DESTROY");
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
