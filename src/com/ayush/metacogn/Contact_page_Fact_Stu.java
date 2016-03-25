package com.ayush.metacogn;





import java.lang.reflect.Field;


import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
//import android.app.Fragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Contact_page_Fact_Stu extends Fragment{
	 public static Contact_page_Fact_Stu newInstance() {
			return new Contact_page_Fact_Stu();
		}
		
	 View view1;
	   ImageButton b1,b2,b3,b4,b5;
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
	    	//setContentView(R.layout.activity_my_main);
		view1 = inflater.inflate(R.layout.imagelayoutofcontact, container, false);
		view1.setBackgroundColor(Color.BLACK);
		b1=(ImageButton) view1.findViewById(R.id.imageButton2);
		b2=(ImageButton) view1.findViewById(R.id.imageButton3);
		b3=(ImageButton) view1.findViewById(R.id.imageButton1);
		b4=(ImageButton) view1.findViewById(R.id.imageButton4);
		b5=(ImageButton) view1.findViewById(R.id.imageButton5);
		b1.setBackgroundColor(Color.TRANSPARENT);
		b2.setBackgroundColor(Color.TRANSPARENT);
		b3.setBackgroundColor(Color.TRANSPARENT);
		b4.setBackgroundColor(Color.TRANSPARENT);
		b5.setBackgroundColor(Color.TRANSPARENT);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String mydata2="tel:"+ "7210765835";
				Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
				startActivity(myActivity2);
			
			}
		});
b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String mydata2="tel:"+ "8800574200";
				Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
				startActivity(myActivity2);
			
			}
		});
b3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String mydata2="tel:"+ "8800844282";
		Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
		startActivity(myActivity2);
	
	}
});
b4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String mydata2="tel:"+ "7053754338";
		Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
		startActivity(myActivity2);
	
	}
});

b5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String mydata2="tel:"+ "7417489505";
		Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
		startActivity(myActivity2);
	
	}
});
		//b1=(ImageButton) view1.findViewById(R.id.imageButton);//
  return view1;
	}
}