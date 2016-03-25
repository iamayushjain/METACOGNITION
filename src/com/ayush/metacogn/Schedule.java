package com.ayush.metacogn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.http.impl.entity.StrictContentLengthStrategy;




import android.app.Activity;
import android.app.ProgressDialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.sax.RootElement;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Schedule extends Fragment{

	SectionsPagerAdapter mSectionsPagerAdapter;

	public static final String TAG = Schedule.class.getSimpleName();
	
	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;
	
	
	public static Schedule newInstance() {
		return new Schedule();
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_item_one, container, false);
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getChildFragmentManager());
		
		mViewPager = (ViewPager) v.findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		
		return v;
	}
	
	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a DummySectionFragment (defined as a static inner class
			// below) with the page number as its lone argument.
			Fragment fragment = new DummySectionFragment();
			Bundle args = new Bundle();
			args.putString("POSS", position+"");
			
			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position +1);
						fragment.setArguments(args);
						fragment.setArguments(args);
						return fragment;
		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 2;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return "DAY 1".toUpperCase(l);
			case 1:
				return "DAY 2".toUpperCase(l);
			
			}
			return null;
		}
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		ListView list;
		//ProgressDialog mProgressDialog;

		public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}
		
		View rootView;
		int divs;
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			
			divs=Integer.parseInt(getArguments().getString("POSS"));
			   
		   //	divs=Integer.parseInt(getArguments().getString("POSS"));
		   	rootView = inflater.inflate(R.layout.listview,
					container, false);
		   	
		//	TextView dummyTextView = (TextView) rootView
			//		.findViewById(R.id.section_label);
			//dummyTextView.setText(username);
	 list=(ListView)rootView.findViewById(R.id.listView1);
		  //new MyTask().execute();
	 // mProgressDialog.dismiss();
	 //String mon_nme[];
		//String mon_nme1[];
		//String mon_nme2[];
	 String mon_nme[];
		String mon_nme1[];
		String mon_nme2[];

		String mon_nmeq[]={"TO BE UPDATED SOON"};
		String mon_nmeq1[]={"TO BE UPDATED SOON"};
		String mon_nmeq2[]={"TO BE UPDATED SOON"};	
	
		 
			String mon_nmew[]={"TO BE UPDATED SOON"};
			String mon_nmew1[]={"TO BE UPDATED SOON"};
			String mon_nmew2[]={"TO BE UPDATED SOON"};
		if(divs==1)
	 {
		 mon_nme=mon_nmeq;
		 mon_nme1=mon_nmeq1;
		 mon_nme2=mon_nmeq2;
	 
	 }
		 //if(divs==2)
		 
		 else
		 {
			 mon_nme=mon_nmew;
			 mon_nme1=mon_nmew1;
			 mon_nme2=mon_nmew2;
		 		 
		 }Integer[] imageId = {
		      R.drawable.ic_launcher
		      };
	
	 imagecustom3 ic=new imagecustom3(getActivity(), mon_nme,mon_nme1,mon_nme2,imageId);
		//list.setAdapter(ic);
	  list.setBackgroundColor(Color.BLACK);
			    
		list.setAdapter(ic);
	
          
			return rootView;
		///	SQLiteDatabase db=openOrCreateDatabase("MYDataBase", 0, null);
			
		}
	}
}
