package com.fuzhouxiu.treertmp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* stun.ekiga.net
    *stun.fwdnet.net
    * stun.ideasip.com
    * stun01.sipphone.com (no DNS SRV record)
            * stun.softjoys.com (no DNS SRV record)
            * stun.voipbuster.com (no DNS SRV record)
            * stun.voxgratia.org (no DNS SRV record)
            * stun.xten.com
    * stunserver.org see their usage policy
    * stun.sipgate.net:10000
    */
}
