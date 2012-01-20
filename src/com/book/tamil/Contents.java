package com.book.tamil;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gmail.shanmugammpl.R;

public class Contents extends Activity {
	Typeface font_Bamini = null;
	private void initializeFonts() {
		font_Bamini = Typeface.createFromAsset(getAssets(), "fonts/Bamini.ttf");
	}
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contents);
        initializeFonts();
        
        Button Btn1;
        Button Btn2;
        Button Btn3;
        //Button Btn_email1; 
        Button Btn_email2;
        
        TextView Contactus = (TextView)findViewById(R.id.contactus);
        Contactus.setText("\n \n \n \n Contact us/feedback");
        
        
        TextView title = (TextView)findViewById(R.id.text_title);
        title.setTypeface(font_Bamini);
        title.setTextSize(18);
        title.setText(" midj;J capu;fsplj;Jk; md;G nra;! \n");
        
        
        TextView about = (TextView)findViewById(R.id.text_about);
        about.setText(Html.fromHtml(
                "<br>Author:Rama Vairavan<br>"+
                "<a href=\"http://yennamviri.blogspot.com/\">http://yennamviri.blogspot.com/</a>"+
                "<br>email: rvairamr@gmail.com <br> <br> <br> <br>"+
                "v1.1	 beta"));
        about.setMovementMethod(LinkMovementMethod.getInstance());
   //     about.setText("\n Author: Vairavan \n blog: http://www.example.com");
    //    Linkify.addlinks(about);
        
     
        
        
        
        Btn1 = (Button)findViewById(R.id.content1);
        Btn2 = (Button)findViewById(R.id.content2);
        Btn3 = (Button)findViewById(R.id.content3);
        
        //Btn_email1 = (Button)findViewById(R.id.btn_email1);
        Btn_email2 = (Button)findViewById(R.id.btn_email2);
        
        
        Btn1.setTypeface(font_Bamini);
        Btn2.setTypeface(font_Bamini);
        Btn3.setTypeface(font_Bamini);
        
        Btn1.setText(" cau;itj; je;j rpq;fg;G+u;");
        Btn2.setText("ftpijf;Fz;L");
        Btn3.setText("gQ;rtu;zf;fpspfs; NgRkh? (rpWfij)");
        
        
        Btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Contents.this,TamilActivity.class);
				startActivity(intent);
				
			}
		});
        
        Btn2.setOnClickListener(new View.OnClickListener() {
			
     			@Override
     			public void onClick(View v) {
     				// TODO Auto-generated method stub
     				Intent intent = new Intent(Contents.this,Activity2.class);
     				startActivity(intent);
     				
     			}
     		});
        Btn3.setOnClickListener(new View.OnClickListener() {
			
     			@Override
     			public void onClick(View v) {
     				// TODO Auto-generated method stub
     				Intent intent = new Intent(Contents.this,Activity3.class);
     				startActivity(intent);
     				
     			}
     		});
        
   /*     Btn_email1.setOnClickListener(new View.OnClickListener() {
			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				
 				 Create the Intent 
 				final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

 				 Fill it with Data 
 				emailIntent.setType("plain/text");
 				emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"rvairamr@gmail.com"});
 				emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Regarding aTamil app");

 				 Send it off to the Activity-Chooser 
 				startActivity(Intent.createChooser(emailIntent, "Send mail..."));
 				
 			}
 		});*/
        Btn_email2.setOnClickListener(new View.OnClickListener() {
			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				
 				/* Create the Intent */
 				final Intent emailIntent2 = new Intent(android.content.Intent.ACTION_SEND);

 				/* Fill it with Data */
 				emailIntent2.setType("plain/text");
 				emailIntent2.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"shanmugammpl@gmail.com"});
 				emailIntent2.putExtra(android.content.Intent.EXTRA_SUBJECT, "Regarding aTamil app");

 				/* Send it off to the Activity-Chooser */
 				startActivity(Intent.createChooser(emailIntent2, "Send mail..."));
 				
 			}
 		});    
        
        
    }
}