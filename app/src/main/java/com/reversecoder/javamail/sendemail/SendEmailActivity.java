package com.reversecoder.javamail.sendemail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.reversecoder.javamail.R;
import com.reversecoder.javamail.library.email.Email;
import com.reversecoder.javamail.library.email.EmailBuilder;
import com.reversecoder.javamail.library.mailer.Mailer;
import com.reversecoder.javamail.library.mailer.config.ServerConfig;
import com.reversecoder.javamail.library.mailer.config.TransportStrategy;
import com.reversecoder.javamail.library.util.ConfigLoader;
import com.reversecoder.library.customasynctask.AsyncJob;

import static com.reversecoder.javamail.application.JavaMailApplication.getGlobalContext;

public class SendEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.btnSend)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {

                    public void run() {
//                AsyncJob.doInBackground(new AsyncJob.OnBackgroundJob() {
//                    @Override
//                    public void doOnBackground() {
                        Log.d("Javamail:","-----------------------start-----------------------");
                        try {

                            GMailSender sender = new GMailSender(

                                    "rashedul.alam@bjitgroup.com",

                                    "");


//                    sender.addAttachment(Environment.getExternalStorageDirectory().getPath() + "/image.jpg");

                            sender.sendMail("Test mail", "This mail has been sent from android app along with attachment",

                                    "rashedul.alam@bjitgroup.com",

                                    "rashed.droid@gmail.com");


                        } catch (Exception e) {
                            e.printStackTrace();
//                            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();


                        }

                        Log.d("Javamail:","---------------------------end---------------------");
                    }

                }).start();
            }
        });


    }
}
