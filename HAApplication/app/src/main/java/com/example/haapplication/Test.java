package com.example.haapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Test extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void abhi(final View view)
	{
		System.out.println("hey");
	}
}