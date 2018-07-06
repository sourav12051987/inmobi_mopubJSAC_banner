package com.inmobi.mopubmed_banner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.mobileads.MoPubView;

public class MainActivity extends AppCompatActivity implements MoPubView.BannerAdListener {

    private MoPubView moPubView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moPubView = (MoPubView) findViewById(R.id.adview);
        moPubView.setAdUnitId("c97dca89e2b148639bdf05c4b75c0f31");
        moPubView.setBannerAdListener(this);

    }

    public  void loadAd(View v){

        moPubView.loadAd();

    }

    @Override
    public void onBannerLoaded(MoPubView banner) {


    }

    @Override
    public void onBannerFailed(MoPubView banner, MoPubErrorCode errorCode) {


    }

    @Override
    public void onBannerClicked(MoPubView banner) {


    }

    @Override
    public void onBannerExpanded(MoPubView banner) {


    }

    @Override
    public void onBannerCollapsed(MoPubView banner) {


    }
}
