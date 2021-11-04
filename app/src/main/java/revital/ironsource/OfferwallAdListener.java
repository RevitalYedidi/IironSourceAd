package revital.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.OfferwallListener;

public class OfferwallAdListener implements OfferwallListener {

    @Override
    public void onOfferwallAvailable(boolean b) {

    }

    @Override
    public void onOfferwallOpened() {

    }

    @Override
    public void onOfferwallShowFailed(IronSourceError ironSourceError) {

    }

    @Override
    public boolean onOfferwallAdCredited(int i, int i1, boolean b) {
        return false;
    }

    @Override
    public void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {

    }

    @Override
    public void onOfferwallClosed() {

    }
}
