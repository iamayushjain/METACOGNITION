package com.ayush.metacogn;



import android.R.string;
import android.app.Activity;
import android.app.Dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.*;
//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;

public class listview3 extends Dialog 
{
	public Activity c;
	public String pos;
    public listview3(String info,Activity a) {
		super(a);
		this.c=a;
		pos=info;
		//System.out.print(c.)
		//Toast.makeText(a, pos, 3000).show();
		// TODO Auto-generated constructor stub
	}

	/** Called when the activity is first created. */
 GridView view3;
    ListView lview3;
    TextView text1;
    // adapter;
	 
   // ListViewCustomAdapter adapter;
    Button b1;
 
    //private static String desc[][]
    	//	= {{"Touch & Augmented Reality"},{"T-SHIRT DESIGNING","WRIGHT PLANE","DIGITAL MEMORIES","LOGO-DESIGNING"},{""},{},{},{},{},{}};
 //String j[]=desc[pos][];
    private static String desc[] ;
    String[] menu={"QUIZ","LITERARY","DESIGN","FRAG","INNOVATE","BRAIN BOGGLER","CODING/DECODING","ROBOTICS"};
	   
    private static String desc1[] = {"SCIENCE HOAX","AMUSING-MATHS"};
    private static String desc2[] = {"Spellathon","EXTEMPORE","DEBATE"};
    private static String desc3[] = {"DESIGNER","CAMPUS TRAIL","MAD AD","LOGO-DESIGNING"};
    private static String desc4[] = {"TEKKEN_3","Call of Duty","NEED FOR SPEED","COUNTER-STRIKE™","GOOOOAAAALLLL!"};
    private static String desc5[] = {"IDEAZ"};
    private static String desc6[] = {"Warzone","RUBIK’S CUBE","CHESS","SUDOKU","TREASURE HUNT"};
    private static String desc7[] = {"Brain CodeX","Code_Cocinero","Code Hummer","Enigma-2","JAVA Uncoded"};
    private static String desc8[] = {"CHASE THE BOT","MAZE RUNNER","REAL STEEL","Robo Rush"};
    Integer[] imageId;
    Integer[] imageId1 = {	      R.drawable.meta11,  R.drawable.meta12};
    Integer[] imageId2 = {	      R.drawable.meta21,R.drawable.meta22,R.drawable.meta23};
    Integer[] imageId3 = {	      R.drawable.meta31,R.drawable.meta32,R.drawable.meta33,  R.drawable.meta34};
    Integer[] imageId4 = {	      R.drawable.meta41,R.drawable.meta42,R.drawable.meta43,  R.drawable.meta44,  R.drawable.meta45};
    Integer[] imageId5 = {	      R.drawable.meta51};
    Integer[] imageId6 = {	      R.drawable.meta61,R.drawable.meta62,R.drawable.meta63,R.drawable.meta64,  R.drawable.meta65};
    Integer[] imageId7 = {	      R.drawable.meta71,R.drawable.meta72,R.drawable.meta73,  R.drawable.meta74 ,  R.drawable.meta75};
    Integer[] imageId8 = {	      R.drawable.meta81,R.drawable.meta82,R.drawable.meta83,R.drawable.meta84};
  int posi;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.gridlayout_demo);
       posi=Integer.parseInt(pos);
       if(posi==0)
       {
    	   desc=desc1;
    	   imageId=imageId1;
       }
       else if(posi==1)
       {
    	   desc=desc2;
    	   imageId=imageId2;
       }
       else if(posi==2)
       {
    	   desc=desc3;
    	   imageId=imageId3;
       }else if(posi==3)
       {
    	   desc=desc4;
    	   imageId=imageId4;
       }
       else if(posi==4)
       {
    	   desc=desc5;
    	   imageId=imageId5;
       }
       else if(posi==5)
       {
    	   desc=desc6;
    	   imageId=imageId6;
       }

       else if(posi==6)
       {
    	   desc=desc7;
    	   imageId=imageId7;
       }
       else        {
    	   desc=desc8;
    	   imageId=imageId8;
       }
    	   
    	   
        //lview3 = (ListView) findViewById(R.id.);
        view3=(GridView)findViewById(R.id.gridView1);
        text1=(TextView)findViewById(R.id.textView1);
        text1.setText(menu[posi].toUpperCase()
        		);
      //  adapter = new ListViewCustomAdapter(c, month, desc,imageId);
        //adapter = new ArrayAdapter<String>(c
        	//	,android.R.layout.simple_list_item_1,desc);
        imagecustom1 adapter = new
    	        imagecustom1(c, desc, imageId);
    	 view3.setAdapter(adapter);
    	 view3.setOnItemClickListener(clickb);
    }
    	OnItemClickListener clickb = new OnItemClickListener() 
    		{
    		public void onItemClick(android.widget.AdapterView<?> arg0, View arg1, int arg2, long arg3) 
    		{
    		//	Toast.makeText(c, arg2+"", 3000).show();
    			//posi2=arg2;
    			navigateTo(arg2);
    		}
    		};
    		private void navigateTo(int position) {
//    	    	
    			//Bundle args=new Bundle();
    			//args.putInt("POSI",(10*posi)+position);
    			int ab=(10*posi)+position;
    			//Description_page tb1=Description_page.newInstance();
    			/*Description_page tb1=new Description_page();
    			tb1.setArguments(args);
    			c.getFragmentManager()
    			.beginTransaction()
    				.replace(R.id.content_frame,tb1,Schedule.TAG ).commit();
    			*/
    			
    			dismiss();	
    			Intent i=new Intent(c,MyMainActivity2.class);
    			i.putExtra("User",ab+"");
				c.startActivity(i);
				//Toast.makeText(c, c.getLocalClassName(), 3000).show();
				String cl_main="MyMainActivity";
				
				 if(cl_main.equals("MyMainActivity"))
				 {
					 
				 }
				 else
				 {
					 c.finish();
				 }
			    
    			//Events ob=new Events();
    			//ob.descCall(ab);
    			//new MyMainActivity().descCall();
    			}
    			
    }
 
