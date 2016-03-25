package com.ayush.metacogn;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class register_page extends Fragment{
	
	 public static register_page newInstance() {
			return new register_page();
		}
	 EditText ed1,ed2,ed3,ed4,ed5;
	 private static String desc1[] = {"Touch & Augmented Reality"};
	    private static String desc2[] = {"T-SHIRT DESIGNING","WRIGHT PLANE","DIGITAL MEMORIES","LOGO-DESIGNING"};
	    private static String desc3[] = {"NEED FOR SPEED","IT’S A GOAL!!!","COUNTER-STRIKE"};
	    private static String desc4[] = {"FUN-TRIVIA","SCIENCE & ASTRONOMY","ECO-TREASURE"};
	    private static String desc5[] = {"NEW FANGLED EXPLORATION","DEBATE","DRAW MASTER"};
	    private static String desc6[] = {"RUBIK’S CUBE","CHESS","SUDOKU","TREASURE HUNT"};
	    private static String desc7[] = {"ENIGMA","CAN YOU “C”","BUG D BASH"};
	    private static String desc8[] = {"ROBO-LAKSHYA","BATTLE-SHIP","ADVENTURE TRAIL","AQUA-GLIDER"};
	   
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
	    	//setContentView(R.layout.activity_my_main);
		View view1;
		Button b1;
		String gender[]={"MALE","FEMALE"};
	    GridView gv1,gv2,gv3,gv4,gv5,gv6,gv7,gv8;
  	   view1 = inflater.inflate(R.layout.register_page_layout, container, false);
  	// TextView view=(TextView)view1.findViewById(R.id.textView1);
  	// AutoCompleteTextView text1=(AutoCompleteTextView)view1.findViewById(R.id.autoCompleteTextView1);
  	// text1.setAdapter(new ArrayAdapter<>(context, resource))
	//Spinner dropdown=(Spinner)view1.findViewById(R.id.spinner1);
	//ArrayAdapter<String> adapter =new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,desc1);
	Spinner dropdown1=(Spinner)view1.findViewById(R.id.spinner2);
	ArrayAdapter<String> adapter1 =new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,gender);
	ed1=(EditText)view1.findViewById(R.id.editText1);
	ed2=(EditText)view1.findViewById(R.id.editText2);
	b1=(Button)view1.findViewById(R.id.button1);
	
	ed3=(EditText)view1.findViewById(R.id.editText3);
	ed4=(EditText)view1.findViewById(R.id.editText4);
	/*gv1=(GridView)view1.findViewById(R.id.gridView1);
	gv2=(GridView)view1.findViewById(R.id.gridView2);
	gv3=(GridView)view1.findViewById(R.id.gridView3);
	gv4=(GridView)view1.findViewById(R.id.gridView4);
	gv5=(GridView)view1.findViewById(R.id.gridView5);
	gv6=(GridView)view1.findViewById(R.id.gridView6);
	gv7=(GridView)view1.findViewById(R.id.gridView7);
	gv8=(GridView)view1.findViewById(R.id.gridView8);
	imagecustom8 adapter11 = new
	        imagecustom8(getActivity(),desc1);
	imagecustom8 adapter2 = new
	        imagecustom8(getActivity(), desc2);
	imagecustom8 adapter3 = new
	        imagecustom8(getActivity(),desc3);
	    	
	imagecustom8 adapter4 = new
	        imagecustom8(getActivity(), desc4);
	    	
	imagecustom8 adapter5 = new
	        imagecustom8(getActivity(), desc5);
	    	
	imagecustom8 adapter6 = new
	        imagecustom8(getActivity(), desc6);
	    	
	imagecustom8 adapter7 = new
	        imagecustom8(getActivity(), desc7);
	    	
	imagecustom8 adapter8 = new
	        imagecustom8(getActivity(), desc8);
	    	gv1.setAdapter(adapter11);
	     	gv2.setAdapter(adapter2);
	     	gv3.setAdapter(adapter3);
	     	gv4.setAdapter(adapter4);
	     	gv5.setAdapter(adapter5);
	     	gv6.setAdapter(adapter6);
	     	gv7.setAdapter(adapter7);
	     	gv8.setAdapter(adapter8);
	  */  	
	//dropdown.setAdapter(adapter);
	dropdown1.setAdapter(adapter1);
	b1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if((ed1.getText().toString()==null)&&(ed2.getText().toString()=="")&&(ed3.getText().toString()==null)&&(ed4.getText().toString()==null))
			{	
				//Toast.makeText(getActivity(), "Not DONE",3000).show();
				
			}
			
			else
			{
				//Toast.makeText(getActivity(), "DONE",3000).show();
				
			}
		}
	});
	 return view1;
	
  	 
	  
  
	}
	
	
}
