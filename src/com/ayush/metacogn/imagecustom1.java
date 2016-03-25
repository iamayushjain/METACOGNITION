package com.ayush.metacogn;



import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class imagecustom1 extends ArrayAdapter<String>{
private final Activity context;
private final String[] web;
private final Integer[] imageId;
public imagecustom1(Activity context,
String[] web, Integer[] imageId) {
super(context, R.layout.imagecustom_grid, web);
this.context = context;
this.web = web;
this.imageId = imageId;
}
@Override
public View getView(int position, View view, ViewGroup parent) {
LayoutInflater inflater = context.getLayoutInflater();
View rowView= inflater.inflate(R.layout.imagecustom_grid, null, true);
//TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
ImageView imageView = (ImageView) rowView.findViewById(R.id.listImage);
TextView txtTitle=(TextView)rowView.findViewById(R.id.textView1);
txtTitle.setText(web[position]);
imageView.setImageResource(imageId[position]);
return rowView;
}
}

