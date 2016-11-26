package com.vaildinput;

import android.widget.TextView;

/**
 * Created by HP on 11/26/2016.
 */

public class ValidInput implements Validate{

    TextView textView ;

    public ValidInput(TextView textView) {
        this.textView = textView;
    }

    @Override
    public boolean build() {
        if (textView == null) {
            throw new NullPointerException( "NullReference Exception" );
        }
        return textView.getText().toString().length()>0;
    }
}
