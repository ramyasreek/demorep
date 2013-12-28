package com.kmit;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class CList extends ListActivity {
    /** Called when the activity is first created. */
	
	//step-1
	final String[] carr=new String[]{"CBIT","VASAVI","KMIT","CVR","MVSR"};
	final String[] larr=new String[]{"Gandipet","Langar House","Naryanaguda","Ghatkeshar","Nadargul"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        //step-2
        ArrayAdapter<String> ca=new ArrayAdapter<String>(this, R.layout.itemview, carr);
        setListAdapter(ca);
        
        //step-3
        ListView lv=getListView();
        OnItemClickListener mylistner=new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), larr[arg2], Toast.LENGTH_LONG).show();
			}
		};        
        
		//step-4
        lv.setOnItemClickListener(mylistner);
      }
}