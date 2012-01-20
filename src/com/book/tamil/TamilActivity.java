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




public class TamilActivity extends Activity {
	Button Btn;
	Typeface font_Bamini = null;
	private void initializeFonts() {
		font_Bamini = Typeface.createFromAsset(getAssets(), "fonts/Bamini.ttf");
	}
	
	   private String readTxt(){

		     InputStream inputStream = getResources().openRawResource(R.raw.text1);
		     
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
        setContentView(R.layout.main);
        initializeFonts();
        setTitle("Main");
        TextView Text1;
        Text1 = (TextView)findViewById(R.id.Text_1);
        Text1.setTypeface(font_Bamini);
        Text1.setTextSize(22);
        Text1.setText(readTxt());
        
        TextView Title = (TextView)findViewById(R.id.title1);
        Title.setTypeface(font_Bamini);
        Title.setTextSize(19);
        Title.setText("ftpijf;Fz;L        ");
        Title.setText("cau;itj; je;j rpq;fg;G+u;");
        
        
        
        Btn = (Button)findViewById(R.id.Btn_Next);
        Btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent intent = new Intent(TamilActivity.this,Activity2.class);
			startActivity(intent);
			}
		});
    }
}