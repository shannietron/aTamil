package com.book.tamil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.gmail.shanmugammpl.R;


public class Activity2 extends Activity {
	Button BtnBack;
	Button BtnNext;
	Typeface font_Bamin = null;
	private void initializeFonts() {
		font_Bamin = Typeface.createFromAsset(getAssets(), "fonts/Bamini.ttf");
	}
	
	   private String readTxt(){

		     InputStream inputStream = getResources().openRawResource(R.raw.text2);
		     
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     
		     int i;
			 try {
				   i = inputStream.read();
				   while (i != -1)
				      {
					       byteArrayOutputStream.write(i);
					       i = inputStream.read();
				      }
				      inputStream.close();
		      
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  
		     return byteArrayOutputStream.toString();
		    }
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        initializeFonts();
    
        TextView Title2 = (TextView)findViewById(R.id.title2);
        Title2.setTypeface(font_Bamin);
        Title2.setTextSize(25);
        Title2.setText("ftpijf;Fz;L    ");
        
        TextView Text2;
        Text2 = (TextView)findViewById(R.id.Text_2);
        Text2.setTypeface(font_Bamin);
        Text2.setTextSize(22);
        Text2.setText(readTxt());
  
        BtnBack = (Button)findViewById(R.id.Btn2_Back);
        BtnBack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent intent2 = new Intent(Activity2.this,TamilActivity.class);
			startActivity(intent2);
			}
		});
        BtnNext = (Button)findViewById(R.id.Btn2_Next);
        BtnNext.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3 = new Intent(Activity2.this,Activity3.class);
				startActivity(intent3);
				
			}
		});
        
    }
}