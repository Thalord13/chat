package com.example.chat;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	EditText txtSender, txtMessage;
	Button btnSend;
	WebView web;
	private URL url;
	private HttpURLConnection conn;
	AlertDialog.Builder builder;
	AlertDialog dialog;
	
	private String ipaddress,port;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        this.txtSender=(EditText) this.findViewById(R.id.editText1);
        this.txtMessage = (EditText) this.findViewById(R.id.editText2);
        this.btnSend = (Button) this.findViewById(R.id.button1);
        this.web= (WebView) this.findViewById(R.id.webView1);
        
        builder=new AlertDialog.Builder(this);
        
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        	
        //this.web.loadUrl("http://192.168.1.6/server/chatList.php");
        this.web.loadUrl("http://192.168.125.49/server/chatList.php");
        this.btnSend.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		
		WebView chat = new WebView(this);
		
		//http://localhost/server/addChat.php?Name=MGA&Chat=BOBO
		/*chat.loadUrl("http://192.168.1.6/server/addChat.php?Name="+txtSender.getText
				().toString()+"&Chat="+txtMessage.getText().toString());*/
		
		chat.loadUrl("http://192.168.125.49/server/addChat.php?Name="+txtSender.getText
				().toString()+"&Chat="+txtMessage.getText().toString());
		
		//this.web.loadUrl("http://192.168.1.6/server/chatList.php");
		this.web.loadUrl("http://192.168.125.49/server/chatList.php");
		
	}
    
}
