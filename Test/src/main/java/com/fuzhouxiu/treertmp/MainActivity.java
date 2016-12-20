package com.fuzhouxiu.treertmp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private byte[] adjustVolume(byte[] audioSamples, float volume) {    //0-1
        if (volume >= 1)
            volume = 1;
        if (volume <= 0)
            volume = 0;
        byte[] array = new byte[audioSamples.length];
        for (int i = 0; i < array.length; i += 2) {
            // convert byte pair to int
            int audioSample = (int) ((audioSamples[i + 1] & 0xff) << 8) | (audioSamples[i] & 0xff);

            audioSample = (int) (audioSample * volume);

            // convert back
            array[i] = (byte) audioSample;
            array[i + 1] = (byte) (audioSample >> 8);

        }
        return array;
    }
}
