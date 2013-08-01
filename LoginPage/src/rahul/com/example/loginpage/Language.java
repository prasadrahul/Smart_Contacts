package rahul.com.example.loginpage;

import java.util.Locale;
import android.app.Activity;
//import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


// hello rahul this is for github test

public class Language extends Activity implements OnClickListener{
	

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Utility.onActivityCreateSetTheme(this);
        setContentView(R.layout.languages);
         
          findViewById(R.id.bt1).setOnClickListener(this);
          findViewById(R.id.bt2).setOnClickListener(this);
       
    }
// hello aaditya
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId())
        {
        case R.id.bt1:
        // language change-1
        	Locale locale3 = new Locale("en"); 
            Locale.setDefault(locale3);
            Configuration config3 = new Configuration();
            config3.locale = locale3;
            getBaseContext().getResources().updateConfiguration(config3, getBaseContext().getResources().getDisplayMetrics());
            Toast.makeText(this, "Locale in English !", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Welcome...", Toast.LENGTH_SHORT).show();
            // theme change
           Utility.changeToTheme(this, Utility.THEME_WHITE);
            
     	   //Intent a= new Intent("rahul.com.example.loginpage.LOGINPAGE");
     	   //startActivity(a);
        break;
        
        case R.id.bt2:
        // language change-2
        	Locale locale4 = new Locale("de"); 
            Locale.setDefault(locale4);
            Configuration config4 = new Configuration();
            config4.locale = locale4;
            getBaseContext().getResources().updateConfiguration(config4, getBaseContext().getResources().getDisplayMetrics());
            Toast.makeText(this, "Locale en deschu !", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Willkommen...", Toast.LENGTH_SHORT).show();
            // theme change
           Utility.changeToTheme(this, Utility.THEME_BLUE);
            
      	  // Intent b= new Intent("rahul.com.example.loginpage.LOGINPAGE");
      	  // startActivity(b);
        break;
        }
	}
}
