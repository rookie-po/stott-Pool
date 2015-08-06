package com.example.sampleapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        final Button logIn = (Button)findViewById(R.id.logInButton);
        final Button signUp = (Button)findViewById(R.id.signUpButton);
        
        final ProgressBar logInProgress = (ProgressBar)findViewById(R.id.logInProgress);
        
        logIn.setOnClickListener(new View.OnClickListener()
        {
        	public void onClick(View v)
        	{
        		EditText username = (EditText)findViewById(R.id.usernameField);
        		EditText password = (EditText)findViewById(R.id.passwordField);
        	
        		logInProgress.setVisibility(0);
        		
        		System.out.println(username);
                System.out.println(password);
        	}
        });
        
    }

    
    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
