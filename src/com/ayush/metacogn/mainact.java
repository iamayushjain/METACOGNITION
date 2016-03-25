package com.ayush.metacogn;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;
import android.view.WindowManager;

public class mainact extends Activity{
	MyCount counter = new MyCount(3000,100);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	    WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    setContentView(R.layout.startpage);	 
	    counter.start();
	}

public class MyCount extends CountDownTimer{

    public MyCount(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
    }

    @Override
    public void onFinish() {
    	// TODO Auto-generated method stub
		Intent i=new Intent(mainact.this,MyMainActivity.class);
		startActivity(i);
		finish();
	
        
    }

    @Override
    public void onTick(long millisUntilFinished) {
    }
}

}