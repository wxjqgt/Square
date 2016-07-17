package com.weibo.square;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.greendao.DaoMaster;
import com.example.greendao.DaoSession;
import com.example.greendao.Note;
import java.util.Date;

import rx.Subscription;

/**
 * Created by Administrator on 2016/7/4.
 */
public class GreenDAOactivity extends AppCompatActivity {

    private DaoSession session;

    private Button finish;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        finish = (Button) findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RxBus.getDefault().send("我是大帅哥！");
                startActivity(new Intent(GreenDAOactivity.this,MainActivity.class));
                finish();
            }
        });

        /*init();
        session.insert(new Note( "aaa", "这是一个大帅哥写的", new Date(System.currentTimeMillis())));
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(session.loadAll(Note.class).toString());*/

    }

    private void init() {
        DaoMaster.OpenHelper helper = new DaoMaster.DevOpenHelper(this, "user.db", null);
        DaoMaster master = new DaoMaster(helper.getWritableDatabase());
        session = master.newSession();
    }

}
