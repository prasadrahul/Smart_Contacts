package rahul.com.example.loginpage;

import java.util.Locale;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class UserLoginTask extends Activity implements OnClickListener{
   
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Utility.onActivityCreateSetTheme(this);
        setContentView(R.layout.theme);
         
          findViewById(R.id.button1).setOnClickListener(this);
          findViewById(R.id.button2).setOnClickListener(this);
          findViewById(R.id.button3).setOnClickListener(this);
          findViewById(R.id.button4).setOnClickListener(this);
          findViewById(R.id.button5).setOnClickListener(this);
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
        switch (v.getId())
        {

        case R.id.button1:
        Utility.changeToTheme(this, Utility.THEME_DEFAULT);
        break;
        
        case R.id.button2:
        Utility.changeToTheme(this, Utility.THEME_WHITE);
        
     // language change-1
    	Locale locale = new Locale("en"); 
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        Toast.makeText(this, "Locale in English !", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Welcome...", Toast.LENGTH_SHORT).show();
        Utility.changeToTheme(this, Utility.THEME_WHITE);
        break;
        
        case R.id.button3:
        Utility.changeToTheme(this, Utility.THEME_BLUE);
        
        // language change-2
    	Locale locale2 = new Locale("de"); 
        Locale.setDefault(locale2);
        Configuration config2 = new Configuration();
        config2.locale = locale2;
        getBaseContext().getResources().updateConfiguration(config2, getBaseContext().getResources().getDisplayMetrics());

        Toast.makeText(this, "Locale en deschu !", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Willkommen...", Toast.LENGTH_SHORT).show();
        Utility.changeToTheme(this, Utility.THEME_BLUE);
        break;
        
        case R.id.button4:
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
        break;
        
        case R.id.button5:
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
        break;
        }
	}
}
