package com.example.button1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener 
{

	Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		setContentView(btn, null);
		btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(this);
		// Some stuff to commit
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	//@Override
	public void onClick(View v)
	{
		TextView textBox = (TextView) findViewById(R.id.textView1);
		textBox.setText("foobar");
	}
}
