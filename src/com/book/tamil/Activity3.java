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


public class Activity3 extends Activity {
	Button BtnBack;
	Button BtnNext;
	Typeface font_Bamin = null;
	private void initializeFonts() {
		font_Bamin = Typeface.createFromAsset(getAssets(), "fonts/Bamini.ttf");
	}
	
	   private String readTxt(){

		     InputStream inputStream = getResources().openRawResource(R.raw.text3);
		     
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
        setContentView(R.layout.third);
        initializeFonts();
        TextView Text3;
        Text3 = (TextView)findViewById(R.id.Text_3);
        Text3.setTypeface(font_Bamin);
        Text3.setTextSize(22);
        Text3.setText(readTxt());
        
        TextView Title3 = (TextView)findViewById(R.id.title3);
        Title3.setTypeface(font_Bamin);
        Title3.setTextSize(19);
        Title3.setText("gQ;rtu;zf;fpspfs; NgRkh? (rpWfij)");
        
  
        
        
        BtnBack = (Button)findViewById(R.id.Btn3_Back);
        BtnBack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent intent2 = new Intent(Activity3.this,Activity2.class);
			startActivity(intent2);
			}
		});
        
     /*   BtnNext = (Button)findViewById(R.id.Btn3_Next);
        BtnNext.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent3 = new Intent(Activity3.this,Activity3.class);
				startActivity(intent3);
				
			}
		});*/
        
    }
}