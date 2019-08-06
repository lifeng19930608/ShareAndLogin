package com.share.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mob.listener.MobActionListener;
import com.mob.login.LoginView;
import com.mob.share.ShareBottomDialog;

public class MainActivity extends AppCompatActivity {

    private LoginView loginView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShareBottomDialog shareBottomDialog = new ShareBottomDialog(MainActivity.this);
                shareBottomDialog.show();
                // 外层如需处理其它业务逻辑
                shareBottomDialog.setMobActionListener(new MobActionListener() {
                    @Override
                    public void onComplete() {
                        Log.i("=========分享", "2222222222");
                    }

                    @Override
                    public void onError() {
                        Log.i("=========分享", "33333333333");
                    }

                    @Override
                    public void onCancel() {
                        Log.i("=========分享", "11111111111");
                    }
                });
            }
        });
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginView.setVisibility(View.VISIBLE);

            }
        });
        loginView = findViewById(R.id.login_view);

        // 外层如需处理其它业务逻辑
        loginView.setMobActionListener(new MobActionListener() {
            @Override
            public void onComplete() {
                Log.i("=========登陆", "2222222222");
            }

            @Override
            public void onError() {
                Log.i("=========登陆", "33333333333");
            }

            @Override
            public void onCancel() {
                Log.i("=========登陆", "11111111111");
            }

        });
    }
}
