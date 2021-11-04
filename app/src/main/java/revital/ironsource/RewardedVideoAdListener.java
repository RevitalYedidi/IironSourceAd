package revital.ironsource;
import android.util.Log;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;

public class RewardedVideoAdListener implements RewardedVideoListener {
    @Override
    public void onRewardedVideoAdOpened() {
        Log.i("1","1");
    }

    @Override
    public void onRewardedVideoAdClosed() {

    }

    @Override
    public void onRewardedVideoAvailabilityChanged(boolean b) {

    }

    @Override
    public void onRewardedVideoAdStarted() {

    }

    @Override
    public void onRewardedVideoAdEnded() {

    }

    @Override
    public void onRewardedVideoAdRewarded(Placement placement) {

    }

    @Override
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {

    }

    @Override
    public void onRewardedVideoAdClicked(Placement placement) {

    }
}
