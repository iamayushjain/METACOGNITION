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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Contact_page extends Fragment{
	 String[] contacts={"Meta Team","Students team"};
	 Integer[] imageId = {
		      R.drawable.building_a_team,R.drawable.hotdocs
		      };
	 public static Contact_page newInstance() {
			return new Contact_page();
		}
		
	 View view1;
	   
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
	    	//setContentView(R.layout.activity_my_main);
		view1 = inflater.inflate(R.layout.activity_my_main, container, false);
  ListView view=(ListView)view1.findViewById(R.id.listView1);
	       view.setBackgroundColor(Color.BLACK
	    		   );
	       view1.setBackgroundColor(Color.BLACK);
	     imagecustom adapter = new
    	        imagecustom(getActivity(), contacts, imageId);
    	/* final imagecustom adapter1 = new
    	        imagecustom(raceingpart.this, contacts3, imageId);
    	*/
		view.setAdapter(adapter);
		view.setSelector(android.R.color.black);
    	registerForContextMenu(view);
    	view.setOnItemClickListener(clickb);
    	
	return view1;
	}
	OnItemClickListener clickb = new OnItemClickListener() 
	{
	public void onItemClick(android.widget.AdapterView<?> arg0, View arg1, int arg2, long arg3) 
	{
		if(arg2==0)
		{	int ab=-2;
			Intent i=new Intent(getActivity(),MyMainActivity2.class);
			i.putExtra("User",ab+"");
			startActivity(i);
			//Toast.makeText(c, c.getLocalClassName(), 3000).show();
			String cl_main="MyMainActivity";
			
			 if(cl_main.equals("MyMainActivity"))
			 {
				 
			 }
			 else
			 {
				 getActivity().finish();
			 }
		    
		}
		else if(arg2==1)
		{
			int ab=-3;
			Intent i=new Intent(getActivity(),MyMainActivity2.class);
			i.putExtra("User",ab+"");
			startActivity(i);
			//Toast.makeText(c, c.getLocalClassName(), 3000).show();
			String cl_main="MyMainActivity";
			
			 if(cl_main.equals("MyMainActivity"))
			 {
				 
			 }
			 else
			 {
				 getActivity().finish();
			 }
		}
		
 	//Toast.makeText(getApplicationContext(), info, 3000).show();
 	
}
	};
	
	public void descCall(int info)
	{
		
		Bundle args=new Bundle();
		args.putInt("POSI",info);
		Schedule tb1=new Schedule();
		//tb1.setArguments(args);
		getChildFragmentManager()
		.beginTransaction()
			.replace(R.id.content_frame,tb1,Schedule.TAG ).commit();
		//getParentFragment().startActivityForResult(intent, requestCode)
		
	}
	}
