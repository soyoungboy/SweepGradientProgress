package com.soyoungboy.sweepgradientprogress;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private SweepGradientCircleProgressBar progress;
	private Button resetBtn;
	// 最大100
	private int max = 100;
	private int myProgress = 0;
	private Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			switch (msg.what) {
			case 1:
				startAddProgress();
				break;

			default:
				break;
			}
		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		progress = (SweepGradientCircleProgressBar) findViewById(R.id.progress);
		resetBtn = (Button) findViewById(R.id.resetBtn);
		resetBtn.setOnClickListener(this);
		startAddProgress();
	}

	private void startAddProgress() {
		myProgress = myProgress + 10;
		progress.setProgress(myProgress);
		
		int[] arcColors = new int[]{
				Color.parseColor("#99cccc"),
				Color.parseColor("#ccffff"),
				Color.parseColor("#ffcccc"),
				Color.parseColor("#6699cc"),
				Color.parseColor("#99ccff"),
				Color.parseColor("#6699cc"),
				Color.parseColor("#cc6699"),
				Color.parseColor("#ffff00")
		};
		progress.setArcColors(arcColors );
		handler.sendEmptyMessageDelayed(1, 1000);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.resetBtn:
			//重置操作
			myProgress = 0;
			progress.reset();
			break;

		default:
			break;
		}
	}
}
