package com.fengzheng.heartview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.fengzheng.heartview.view.HeartLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

	@BindView(R.id.member_send_good)
	TextView memberSendGood;
	@BindView(R.id.heart_layout)
	HeartLayout heartLayout;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);

	}

	@OnClick(R.id.member_send_good)
	public void onClick() {
		heartLayout.addFavor();
	}
}
