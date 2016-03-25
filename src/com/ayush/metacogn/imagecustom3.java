package com.ayush.metacogn;



import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class imagecustom3 extends ArrayAdapter<String>{
private final Activity context;
private final String[] web;
private final String[] web1;
private final String[] web2;
private final Integer[] imageId;
public imagecustom3(Activity context,
String[] web,String[] web1,String[] web2, Integer[] imageId) {
super(context, R.layout.imagecustom, web);
this.context = context;
this.web = web;
this.web1 = web1;
this.web2 = web2;

this.imageId = imageId;
}
@Override
public View getView(int position, View view, ViewGroup parent) {
LayoutInflater inflater = context.getLayoutInflater();
View rowView= inflater.inflate(R.layout.imagecustom3, null, true);
//TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
TextView txtTitle=(TextView)rowView.findViewById(R.id.textView1);
TextView txtTitle1=(TextView)rowView.findViewById(R.id.textView2);
TextView txtTitle2=(TextView)rowView.findViewById(R.id.textView4);
txtTitle.setText(web[position]);
txtTitle1.setText("VENUE:"+web1[position]);
txtTitle2.setText("TIME:"+web2[position]);

//imageView.setImageResource(imageId[0]);
return rowView;
}
}

