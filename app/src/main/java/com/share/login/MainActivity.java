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
                shareBottomDialog.setText("测试分享内容");
                shareBottomDialog.setTitle("测试标题");
                shareBottomDialog.setUrl("http://www.baidu.com");
                shareBottomDialog.setImageUrl("https://www.baidu.com/link?url=JawS5dWaFZWqH0SIzuR8Tx7Bxg4LuGaZeopZ0ZyX01R9tevhLz-d5Plx9OLYvlk5Whc33DY08j_yXGf6K3ukqMbmJyM3hoXct1vuz-lIVXoTMwvFcCnVLkUB81p5NTHMIqvrNDWyo4FaQxy0b2J7aY291yapfyh90aTXEmVZA9om04m8Vj3xgUasvBFE8hIHACdFVZONHpkTihJ8HExrLQmhBnOlWOzvSqAAnUUcK7SDKJN_yPro3tA6z6oiYQWUS6g1P4N9w_9DUzTsp2jtPeJJruu6nQuV4PkXB4KgRACANJTxDSiZD_oVjyEOjimp4eSTFYVbVohv6sLQiLvhU0m4Y7iIFye_4VdFg49BoU6UUFCmKxqg-YtXkc_vvA-w5EhLtt0fN26_-c2vWmjlzVsZHJSJgvhQ3owPNye76Gb3Yfr2nacgZ9SjQpQzfuU6b_2EM1gk394PzrhNgdT4CaJkJ7b18dsXnYTy_lsiwivxTM3ygNxSEDQuEgmrahePe80cpf1t7RyETn6t3BruYkN5n97r7_LOnrM9HzEAAVAkH5WdzCjSCu5FkFl_PQQIOX4j2dVUHfPu_lDOWEk-MOYT8AHdRne_0jGAxcOhKE5vvzgMA-oLR072t1RwY7X0&wd=&eqid=8aa9fb5c0012bfa8000000045d491a0d");
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
