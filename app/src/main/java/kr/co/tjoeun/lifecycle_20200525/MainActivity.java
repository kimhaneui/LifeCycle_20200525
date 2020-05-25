package kr.co.tjoeun.lifecycle_20200525;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import kr.co.tjoeun.lifecycle_20200525.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();

        Log.d("생명주기확인", "onCreate실행");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("생명주기확인","onDestroy실행");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("생명주기확인", "onResume실행");
    }

    @Override
    public void setupEvents() {

        binding.moveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(mContext, SecondActivity.class);
                startActivity(myIntent);

            }
        });

    }

    @Override
    public void setValues() {

    }

    protected void  onPause() {
        super.onPause();
        Log.d("생명주기확인", "onPause실행");

    }
}
