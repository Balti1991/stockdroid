package org.kofeina.stockdroid;

import android.app.Activity;
import android.os.Bundle;

public class StockDroid extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);
    }
}