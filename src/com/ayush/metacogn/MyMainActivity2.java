package com.ayush.metacogn;

import java.io.IOException;




import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder.DeathRecipient;
import android.provider.SyncStateContract.Helpers;
import android.app.Activity;
import android.app.AlertDialog;
//import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.hardware.camera2.TotalCaptureResult;
//import android.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;

import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MyMainActivity2 extends FragmentActivity {
	   /*  String[] menu;
	     DrawerLayout dLayout;
	     ListView dList;
	     ArrayAdapter<String> adapter;
	     private ActionBarDrawerToggle mDrawerToggle;
	     String s,p,ck;
	     ProgressDialog mProgressDialog;
	     private static final String TAG = MyMainActivity2.class.getSimpleName();
	       Integer[] imageId = {
	    		   R.drawable.newspaper92,R.drawable.listing12,R.drawable.election,R.drawable.calendar532,R.drawable.send42,R.drawable.send42
		  		      };
	       int hello1=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		   setContentView(R.layout.activity_main);
		   getActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLACK));
	         
		   Bundle bund=getIntent().getExtras();
			String s=""+bund.getString("User");
			 hello1=Integer.parseInt(s);
			Toast.makeText(getApplicationContext(), hello1+"",3000).show();
	     	menu = new String[]{"NewsFeed","Events","Schedule","Register","Contact Us","Rules"};
	        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
	        
	        dList = (ListView) findViewById(R.id.left_drawer);

	       // adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
	        imagecustom2 adapter = new
	    	        imagecustom2(MyMainActivity2.this, menu, imageId);
	    	
			  dList.setAdapter(adapter);
	      //  dLayout.openDrawer(Gravity.START);
	        dList.setSelector(android.R.color.holo_blue_dark);
			dList.setBackgroundColor(Color.BLACK);	
			
	        dList.setOnItemClickListener(new OnItemClickListener(){

				@Override
				public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
							
					Toast.makeText(getApplicationContext(), menu[position], 3000).show();
					navigateTo(position);
					
				}
	        	
	        });
	        getActionBar().setDisplayHomeAsUpEnabled(true);
	        getActionBar().setHomeButtonEnabled(true);
	 
	        mDrawerToggle = new ActionBarDrawerToggle(this, dLayout,
	                R.drawable.ic_drawer, //nav menu toggle icon
	                R.string.app_name, // nav drawer open - description for accessibility
	                R.string.app_name // nav drawer close - description for accessibility
	        ){
	            public void onDrawerClosed(View view) {
	                getActionBar().setTitle("METACOGNITION");
	                // calling onPrepareOptionsMenu() to show action bar icons
	                invalidateOptionsMenu();
	            }
	 
	            public void onDrawerOpened(View drawerView) {
	                getActionBar().setTitle("Options");
	                // calling onPrepareOptionsMenu() to hide action bar icons
	                invalidateOptionsMenu();
	            }
	        };
	        dLayout.setDrawerListener(mDrawerToggle);
	        getActionBar().setDisplayHomeAsUpEnabled(true);
	        getActionBar().setHomeButtonEnabled(true);
	        mDrawerToggle.syncState();
	       //dLayout.setDrawerListener(mDrawerToggle);
	 
	        if (savedInstanceState == null) {
	            // on first time display view for first nav item
	        //    displayView();
	        if(Integer.parseInt(s)>=0)
	        	{
	        	navigateTo(-1);
	        	}
	        else if(Integer.parseInt(s)==-2)
	        {
	        	navigateTo(-2);
	        }
	        else
	        {
	        	navigateTo(-3);
	        }
	        	
	        }
	}
	        private void navigateTo(int position) {
//	    		Log.v(TAG, "List View Item: " + position);
	    	//	Fragment detail =new DetailFragment();
	    		Log.v(TAG, "List View Item: " + position);
	    		dLayout.closeDrawers();			
    			
	    	//	Fragment tbb =new TabbedActivity();
	    		//Bundle args = new Bundle();
	    		switch(position) {
	    		

	    		case -3:
	    			Contact_page_Fact_Stu tb13=new Contact_page_Fact_Stu();
	    			//tb12.setArguments(args);
	    			getSupportFragmentManager()
	    			.beginTransaction()
	    				.replace(R.id.content_frame,tb13,Schedule.TAG ).commit();
	    			
	    			
	    			break; 
	    		case -2:
	    			Contact_page_Fact tb12=new Contact_page_Fact();
	    			//tb12.setArguments(args);
	    			getSupportFragmentManager()
	    			.beginTransaction()
	    				.replace(R.id.content_frame,tb12,Schedule.TAG ).commit();
	    			
	    			
	    			break; 
	    		case -1:
	    			Description_page tb11=new Description_page();
	    			Bundle args=new Bundle();
	    			args.putInt("POSI",hello1);
	    			tb11.setArguments(args);
	    			getSupportFragmentManager()
	    			.beginTransaction()
	    				.replace(R.id.content_frame,tb11,Schedule.TAG ).commit();
	    			
	    			case 0:
	    			break;
	    		case 1:
	    			
	    		//dLayout.closeDrawers();
	    		Events ev=Events.newInstance();
	    		
	    		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.content_frame,ev).commit();
			
	    			break;
	    		case 2:
	    		//dLayout.closeDrawers();
	    			Schedule tb1=new Schedule();
	    			//tb1.setArguments("a");
	    			getSupportFragmentManager()
	    				.beginTransaction()
	    				.replace(R.id.content_frame,tb1,Schedule.TAG ).commit();
	    		
	    		break;
	    			
	    		}
	    	
	}
	        
@Override
	        public boolean onOptionsItemSelected(MenuItem item) {
	            // Pass the event to ActionBarDrawerToggle, if it returns
	            // true, then it has handled the app icon touch event
	    		//Toast.makeText(getApplicationContext(),"CLick",3000).show();
	            if (mDrawerToggle.onOptionsItemSelected(item)) {
	              return true;
	            }
	            return super.onOptionsItemSelected(item);
	            
	        }
	        */
			     String[] menu;
		     DrawerLayout dLayout;
		     ListView dList;
		     ArrayAdapter<String> adapter;
		     private ActionBarDrawerToggle mDrawerToggle;
		     String s,p,ck;
		     ProgressDialog mProgressDialog;
		     private static final String TAG = MyMainActivity2.class.getSimpleName();
		       Integer[] imageId = {
		  		      R.drawable.listing12,R.drawable.election,R.drawable.calendar532,R.drawable.facebook3,R.drawable.call40,R.drawable.code2,R.drawable.location73
		  		      };
		       int hello1=0;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			   setContentView(R.layout.activity_main);
			
			   getActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLACK));
	           
			   Bundle bund=getIntent().getExtras();
				 s=""+bund.getString("User");
				 hello1=Integer.parseInt(s);
				//	Toast.makeText(getApplicationContext(), hello1+"",3000).show();
				    menu = new String[]{"Events","Schedule","Register","FB Page","Contact Us","Developer","Locate Us"};
		        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		        
		        dList = (ListView) findViewById(R.id.left_drawer);
		        
		       // adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
		        imagecustom2 adapter = new
		    	        imagecustom2(MyMainActivity2.this, menu, imageId);
		    	
				  dList.setAdapter(adapter);
		        //dLayout.openDrawer(Gravity.START);
		       // dList.setSelector(android.R.color.holo_blue_dark);
				dList.setBackgroundColor(Color.BLACK);	
				
		        dList.setOnItemClickListener(new OnItemClickListener(){

					@Override
					public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
								
						//Toast.makeText(getApplicationContext(), menu[position], 3000).show();
						navigateTo(position);
						
					}
		        	
		        });
		        getActionBar().setDisplayHomeAsUpEnabled(true);
		        getActionBar().setHomeButtonEnabled(true);
		 
		        mDrawerToggle = new ActionBarDrawerToggle(this, dLayout,
		                R.drawable.text1566, //nav menu toggle icon
		                R.string.app_name, // nav drawer open - description for accessibility
		                R.string.app_name // nav drawer close - description for accessibility
		        ){
		            public void onDrawerClosed(View view) {
		                getActionBar().setTitle("METACOGNITION");
		                // calling onPrepareOptionsMenu() to show action bar icons
		                  invalidateOptionsMenu();
		            }
		 
		            public void onDrawerOpened(View drawerView) {
		                getActionBar().setTitle("OPTIONS");
		                // calling onPrepareOptionsMenu() to hide action bar icons
		                invalidateOptionsMenu();
		            }
		        };
		        dLayout.setDrawerListener(mDrawerToggle);
		        getActionBar().setDisplayHomeAsUpEnabled(true);
		        getActionBar().setHomeButtonEnabled(true);
		        mDrawerToggle.syncState();
	    	     //dLayout.setDrawerListener(mDrawerToggle);
		 
		        if (savedInstanceState == null) {
		            // on first time display view for first nav item
		        //    displayView();
		        	//navigateTo(0);
		        	 if(Integer.parseInt(s)>=0)
			        	{
			        	navigateTo(-1);
			        	}
			        else if(Integer.parseInt(s)==-2)
			        {
			        	navigateTo(-2);
			        }
			        else
			        {
			        	navigateTo(-3);
			        }
			       
		        	
		        }
		}
		        private void navigateTo(int position) {
//		    		Log.v(TAG, "List View Item: " + position);
		    	//	Fragment detail =new DetailFragment();
		    		Log.v(TAG, "List View Item: " + position);
		    		dLayout.closeDrawers();			
	    			
		    	//	Fragment tbb =new TabbedActivity();
		    		//Bundle args = new Bundle();
		    		switch(position) {
		    		case -3:
		    			Contact_page_Fact_Stu tb13=new Contact_page_Fact_Stu();
		    			//tb12.setArguments(args);
		    			getSupportFragmentManager()
		    			.beginTransaction()
		    				.replace(R.id.content_frame,tb13,Schedule.TAG ).commit();
		    			
		    			
		    			break; 
		    		case -2:
		    			Contact_page_Fact tb12=new Contact_page_Fact();
		    			//tb12.setArguments(args);
		    			getSupportFragmentManager()
		    			.beginTransaction()
		    				.replace(R.id.content_frame,tb12,Schedule.TAG ).commit();
		    			
		    			
		    			break; 
		    		case -1:
		    			Description_page tb11=new Description_page();
		    			Bundle args=new Bundle();
		    			args.putInt("POSI",hello1);
		    			tb11.setArguments(args);
		    			getSupportFragmentManager()
		    			.beginTransaction()
		    				.replace(R.id.content_frame,tb11,Schedule.TAG ).commit();
		    			break;
		    		
		    		case 0:
		    			
		    		//dLayout.closeDrawers();
		    		Events ev=Events.newInstance();
		    		
		    		getSupportFragmentManager()
					.beginTransaction()
					.replace(R.id.content_frame,ev).commit();
				
		    			break;
		    		case 1:
		    		//dLayout.closeDrawers();
		    			Schedule tb1=new Schedule();
		    			//tb1.setArguments("a");
		    			getSupportFragmentManager()
		    				.beginTransaction()
		    				.replace(R.id.content_frame,tb1,Schedule.TAG ).commit();
		    		
		    		break;
		    		case 2:
		    		//	if(isNetworkAvailable())
		    			//{//new MyTask().execute();}
	/*	    			 register_page ev3=register_page.newInstance();
		 	    		
		 	    		getSupportFragmentManager()
		 				.beginTransaction()
		 				.replace(R.id.content_frame,ev3).commit();
		*/
		    			if(isNetworkAvailable())
		    				{Fb_page ev51=Fb_page.newInstance();
		    			Bundle arg=new Bundle();
		    			arg.putInt("No",1);
		    			ev51.setArguments(arg);
		 	    		getSupportFragmentManager()
		 				.beginTransaction()
		 				.replace(R.id.content_frame,ev51).commit();
		    				}
		    			else
		    			{
		    				AlertDialog.Builder builder = new AlertDialog.Builder(this);
		    				builder.setMessage("Internet Connection Not Available")
		    				       .setCancelable(false)
		    				       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
		    				           public void onClick(DialogInterface dialog, int id) {
		    				                //do things
		    				           }
		    				       });
		    				AlertDialog alert = builder.create();
		    				alert.show();
		    			}
		    		break;
		    		
		    		case 3:
		    			if(isNetworkAvailable())
		    			{
	Fb_page ev5=Fb_page.newInstance();
	Bundle arg1=new Bundle();
	arg1.putInt("No",2);
	ev5.setArguments(arg1);
		
		 	    		getSupportFragmentManager()
		 				.beginTransaction()
		 				.replace(R.id.content_frame,ev5).commit();

		    			}
		    			else
		    			{
		    				AlertDialog.Builder builder = new AlertDialog.Builder(this);
		    				builder.setMessage("Internet Connection Not Available")
		    				       .setCancelable(false)
		    				       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
		    				           public void onClick(DialogInterface dialog, int id) {
		    				                //do things
		    				           }
		    				       });
		    				AlertDialog alert = builder.create();
		    				alert.show();
		    			}
		    			break;
		    		case 4:
		    			Contact_page ev4=Contact_page.newInstance();
		    				 	    		
		    				 	    		getSupportFragmentManager()
		    				 				.beginTransaction()
		    				 				.replace(R.id.content_frame,ev4).commit();
		    				 			
		    				    			break;
		    		case 5:
		    			Contact_page_Fact_dev tb123=new Contact_page_Fact_dev();
		    			//tb12.setArguments(args);
		    			getSupportFragmentManager()
		    			.beginTransaction()
		    				.replace(R.id.content_frame,tb123,Schedule.TAG ).commit();
		    			
		    	
		    			break;
		    		case 6:
		    			String geoCode= "geo:28.4571329,77.49779999999998";
		    			Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse(geoCode));
		    			startActivity(intent);
		    		
		    			break;
		    				
		    			
		    		}
		    	
		}
		        public void descCall()
		    	{
		    		
		    		/*Bundle args=new Bundle();
		    		args.putInt("POSI",info);
		    		Schedule tb1=new Schedule();
		    		//tb1.setArguments(args);
		    		getSupportFragmentManager()
		    		.beginTransaction()
		    			.replace(R.id.content_frame,tb1,Schedule.TAG ).commit();
		    		*/
		        	//setContentView(R.layout.activity_main);
		        	Events ev=Events.newInstance();
		    		getSupportFragmentManager()
					.beginTransaction()
					.replace(R.id.content_frame,ev).addToBackStack(null).commit();
				
		    	}
		    	
	@Override
		        public boolean onOptionsItemSelected(MenuItem item) {
		            // Pass the event to ActionBarDrawerToggle, if it returns
		            // true, then it has handled the app icon touch event
		    		//Toast.makeText(getApplicationContext(),"CLick",3000).show();
		            if (mDrawerToggle.onOptionsItemSelected(item)) {
		              return true;
		            }
		            return super.onOptionsItemSelected(item);
		            
		        }
	private boolean isNetworkAvailable() {
	    ConnectivityManager connectivityManager 
	          = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
	    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
	    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
	    
	}
	}

	