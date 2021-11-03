package revital.ironsource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ironsource.mediationsdk.IronSource;

public class MainActivity extends IonSourceListeners {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        IronSource.setRewardedVideoListener(mRewardedVideoListener);
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


    public void toast(View view) {
        Toast.makeText(getApplicationContext(),"Hello World",Toast.LENGTH_SHORT).show();
    }
}