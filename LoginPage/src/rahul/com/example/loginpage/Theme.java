package rahul.com.example.loginpage;


import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Theme extends Activity implements OnClickListener {
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Utility.onActivityCreateSetTheme(this);
        setContentView(R.layout.themes);
         
          findViewById(R.id.b1).setOnClickListener(this);
          findViewById(R.id.b2).setOnClickListener(this);
          findViewById(R.id.b3).setOnClickListener(this);
       
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId())
        {

        case R.id.b1:
        Utility.changeToTheme(this, Utility.THEME_DEFAULT);
  	  
       // Intent p= new Intent("rahul.com.example.loginpage.LOGINPAGE");
  	  // startActivity(p);
      //  finish();
        break;
        
        case R.id.b2:
        Utility.changeToTheme(this, Utility.THEME_WHITE);
  	  // Intent q= new Intent("rahul.com.example.loginpage.LOGINPAGE");
  	   //startActivity(q);
        //finish();
        break;
        
        case R.id.b3:
        Utility.changeToTheme(this, Utility.THEME_BLUE);
  	  // Intent r= new Intent("rahul.com.example.loginpage.LOGINPAGE");
  	  // startActivity(r);
      //  finish();
        break;
        }
		finishActivity(1);
	}
	

}
