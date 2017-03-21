package org.neosoft.com.d4challenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import static org.neosoft.com.d4challenge.R.id.seekBar;

public class MainActivity extends AppCompatActivity {
    int progressVal = 0;
    TextView display;
    SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.txtDisplay);
        seekbar = (SeekBar)findViewById(seekBar);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressVal = progress;
                String val = String.valueOf(progressVal);

                if((40<=progressVal)&&(progressVal<=45)){
                    display.setText("Inside 40-45 range");
                }else{
                    display.setText("");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar sBar) {
                Toast.makeText(getApplicationContext(), String.valueOf(progressVal), Toast.LENGTH_SHORT).show();
            }
        });


    }


}
