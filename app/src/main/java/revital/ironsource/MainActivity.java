package revital.ironsource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ironsource.mediationsdk.IronSource;

public class MainActivity extends AppCompatActivity {

    private RewardedVideoAdListener mRewardedVideoListener= new RewardedVideoAdListener();
    private InterstitialAdListener mInterstitialListener= new InterstitialAdListener();
    private OfferwallAdListener mOfferwallListener= new OfferwallAdListener();
    private final String appKey = "11cff1055";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IronSource.setRewardedVideoListener(mRewardedVideoListener);
        IronSource.setInterstitialListener(mInterstitialListener);
        IronSource.setOfferwallListener(mOfferwallListener);

        //Rewarded Video
        IronSource.init(this,appKey, IronSource.AD_UNIT.REWARDED_VIDEO);
        //Init Interstitial
        IronSource.init(this, appKey, IronSource.AD_UNIT.INTERSTITIAL);
        //Init Offerwall
        IronSource.init(this, appKey, IronSource.AD_UNIT.OFFERWALL);
        //Init Banner
        IronSource.init(this, appKey,IronSource.AD_UNIT.BANNER);
    }


    public void showInterstitialAd(View view) {
        /*
          onClick button function
          load interstitial ad on the screen
         */
        IronSource.loadInterstitial();
    }

    @Override
    protected void onResume() {
        super.onResume();
        IronSource.onResume(this);
    }
    @Override
    protected void onPause() {
        super.onPause();
        IronSource.onPause(this);
    }

}