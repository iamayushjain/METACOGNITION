package com.ayush.metacogn;





import java.lang.reflect.Field;


import android.app.ActionBar.LayoutParams;
import android.app.Activity;
//import android.app.Fragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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

public class Events extends Fragment{
	 String[] contacts={"QUIZ","LITERARY","DESIGN","FRAG","INNOVATE","BRAIN BOGGLER","CODING/DECODING","ROBOTICS"};
	 Integer[] imageId = {
		      R.drawable.meta1,R.drawable.meta2,R.drawable.meta3,R.drawable.meta4,R.drawable.meta5,R.drawable.meta6,R.drawable.meta7,R.drawable.meta8
		      };
	 public static Events newInstance() {
			return new Events();
		}
		
	    
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
	    	//setContentView(R.layout.activity_my_main);
		View view1;
  	   view1 = inflater.inflate(R.layout.activity_my_main, container, false);
  ListView view=(ListView)view1.findViewById(R.id.listView1);
	       view.setBackgroundColor(Color.BLACK
	    		   );
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
		String info = arg2+"";//((TextView) arg1).getText().toString();
	 	listview3 cdd1=new listview3(info,getActivity());
	 	Bundle arg=new Bundle();
		arg.putString("Menu",info);
		
		cdd1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#40000000")));
		cdd1.show();
		Window window = cdd1.getWindow();
		window.setLayout(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
  
		
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
