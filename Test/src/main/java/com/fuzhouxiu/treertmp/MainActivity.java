package com.fuzhouxiu.treertmp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fuzhouxiu.coretransfer.net.core.IpAddress;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTestTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTestTextView = (TextView) findViewById(R.id.TextView_test);
        findViewById(R.id.Button_test).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.Button_test) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    IpAddress.setLocalIpAddress();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mTestTextView.setText(IpAddress.localIpAddress);
                        }
                    });
                }
            }).start();
        }
    }
}
