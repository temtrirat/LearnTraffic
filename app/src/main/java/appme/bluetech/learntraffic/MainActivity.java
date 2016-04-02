package appme.bluetech.learntraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Explicit การประกาศตัวแปร เพื่อบ่งบอกว่ามือถือมีแรมพอไหม?
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget คือการผูกความสัมพันธ์ของตัวแปร (Variable and Widget)
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        //การเก็บเหตุการณ์ จากการคลิกปุ่ม
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.cow);
                mediaPlayer.start();
            } // onClick
        });

    }   // Main Method นี่คือ เมธอด

}   // Main Class นี่คือคลาสหลัก
