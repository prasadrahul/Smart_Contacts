package rahul.com.example.loginpage;


import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;


/* Activity which displays a login screen to the user, offering Theme and Language Change */

public class LoginActivity extends Activity implements OnClickListener{
    
	 /*A dummy authentication store containing known user names and passwords. */
    private static final String[] CREDENTIALS = new String[]{
        "admin@epaisa.com:123123"};
    private String [] pieces = null;
   
    
    // Values for email and password at the time of the login attempt.
    private String mEmail;
    private String mPassword;

    // UI references.
    private EditText mEmailView;
    private EditText mPasswordView;
    
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		//Utility.onActivityCreateSetTheme(this);
        super.onCreate(savedInstanceState);
      Utility.onActivityCreateSetTheme(this);
        
        setContentView(R.layout.activity_login);
        
        mEmailView=(EditText)findViewById(R.id.email);
        mPasswordView=(EditText)findViewById(R.id.password);
        
        findViewById(R.id.sign_in_button).setOnClickListener(this);
        findViewById(R.id.sign_up_button).setOnClickListener(this);
        findViewById(R.id.Language).setOnClickListener(this);
        findViewById(R.id.Theme).setOnClickListener(this);
	}
		

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
        switch (v.getId())
        {

        case R.id.sign_in_button:
        	attemptLogin();
        break;
        case R.id.sign_up_button:
        	attemptRegister();
        break;
        case R.id.Language:
        	//attemptLanguage();
     		//Toast toast2=Toast.makeText(getApplicationContext(),
        	//		"you are in language..", Toast.LENGTH_LONG);
        	//toast2.show();
        	
         	  Intent b= new Intent("rahul.com.example.loginpage.LANGUAGE");
         	  startActivityForResult(b, 1);
         	  
        	
        break;
        case R.id.Theme:
        	//attemptTheme();
     		//Toast toast1=Toast.makeText(getApplicationContext(),
        	//		"you are in theme..", Toast.LENGTH_LONG);
        	//toast1.show();
        	
        	   Intent a= new Intent("rahul.com.example.loginpage.THEME");
         	   startActivityForResult(a,2);
        break;
        }
		
	}

	/**private void attemptTheme() {
		// TODO Auto-generated method stub
		//Theme.select();
  	   Intent a= new Intent("rahul.com.example.loginpage.THEME");
 	   startActivity(a);
 		Toast toast=Toast.makeText(getApplicationContext(),
    			"you are in theme..", Toast.LENGTH_LONG);
    	toast.show();
	}


	private void attemptLanguage() {
		// TODO Auto-generated method stub
		//Language.select();
  	   Intent b= new Intent("rahul.com.example.loginpage.LANGUAGE");
 	   startActivity(b);
 	   
 		Toast toast=Toast.makeText(getApplicationContext(),
    			"you are in language..", Toast.LENGTH_LONG);
    	toast.show();
	}**/


	private void attemptRegister() {
		// TODO Auto-generated method stub
		//RegisterActivity.register_user();
		Utility.changeToTheme(this, Utility.THEME_BLUE);
		Locale locale4 = new Locale("en"); 
        Locale.setDefault(locale4);
        Configuration config4 = new Configuration();
        config4.locale = locale4;
        getBaseContext().getResources().updateConfiguration(config4, getBaseContext().getResources().getDisplayMetrics());
		Utility.changeToTheme(this, Utility.THEME_BLUE);
	}


	private void attemptLogin() {
		// TODO Auto-generated method stub
	

        // Store values at the time of the login attempt.
        mEmail = mEmailView.getText().toString();
        mPassword = mPasswordView.getText().toString();
        
        for (String credential : CREDENTIALS) {
        	pieces = credential.split(":");
        }
        	for(int i=0;i<CREDENTIALS.length;i++){
        	if (pieces[i].equals(mEmail) && pieces[++i].equals(mPassword)) {
                // Account exists, return true if the password matches.
        		
         	   Intent p= new Intent("rahul.com.example.loginpage.USERLOGINTASK");
        	   startActivity(p);

        	   
            } else {
            	// There was an error; don't attempt login.pop up message
            	Toast toast=Toast.makeText(getApplicationContext(),
            			"Sorry !! Try Again..", Toast.LENGTH_LONG);
            	toast.show();

            }
        }
	
	}


}
