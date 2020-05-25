package kr.co.tjoeun.lifecycle_20200525;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupEvents();
        setValues();

        Log.d("생명주기확인", "onCreate실행");
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
