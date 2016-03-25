package com.ayush.metacogn;



import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;
public class imagecustom8 extends ArrayAdapter<String>{
private final Activity context;
private final String[] web;
public imagecustom8(Activity context,
String[] web) {
super(context, R.layout.imagecustom8_check, web);
this.context = context;
this.web = web;
}
@Override
public View getView(int position, View view, ViewGroup parent) {
LayoutInflater inflater = context.getLayoutInflater();
View rowView= inflater.inflate(R.layout.imagecustom8_check, null, true);
//TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
//ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
//TextView txtTitle=(TextView)rowView.findViewById(R.id.textView1);
CheckedTextView tv=(CheckedTextView)rowView.findViewById(R.id.checkedTextView1);
//TextView txtTitle2=(TextView)rowView.findViewById(R.id.textView4);
tv.setText(web[position]);
//txtTitle2.setText("TIME:"+web2[position]);

//imageView.setImageResource(imageId[0]);
return rowView;
}
}

