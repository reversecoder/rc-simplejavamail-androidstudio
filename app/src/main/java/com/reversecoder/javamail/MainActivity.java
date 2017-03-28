package com.reversecoder.javamail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.reversecoder.javamail.library.email.Email;
import com.reversecoder.javamail.library.email.EmailBuilder;
import com.reversecoder.javamail.library.mailer.Mailer;
import com.reversecoder.javamail.library.mailer.config.ProxyConfig;
import com.reversecoder.javamail.library.mailer.config.ServerConfig;
import com.reversecoder.javamail.library.mailer.config.TransportStrategy;
import com.reversecoder.javamail.library.util.ConfigLoader;
import com.reversecoder.library.customasynctask.AsyncJob;

import javax.mail.Message;

import static com.reversecoder.javamail.application.JavaMailApplication.getGlobalContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncJob.doInBackground(new AsyncJob.OnBackgroundJob() {
            @Override
            public void doOnBackground() {

                try {

                ConfigLoader.loadProperties(getGlobalContext(),"simplejavamail.properties",true); // optional default
//                ConfigLoader.loadProperties("overrides.properties"); // optional extra

/*                Email email = new Email();

                email.addRecipient("lollypop", "rashedul.alam@bjitgroup.com", Message.RecipientType.TO);
//                email.setReplyToAddress("lollypop", "lolly.pop@othermail.com");
//                email.addRecipient("C. Cane", "candycane@candyshop.org", Message.RecipientType.TO);
//                email.addRecipient("C. Bo", "chocobo@candyshop.org", Message.RecipientType.CC);
                email.setSubject("hey");
                email.setText("We should meet up! ;)");
                email.setTextHTML("<img src='cid:wink1'><b>We should meet up!</b><img src='cid:wink2'>");
//                email.addEmbeddedImage("wink1", imageByteArray, "image/png");
//                email.addEmbeddedImage("wink2", imageDatesource);
//                email.addAttachment("invitation", pdfByteArray, "application/pdf");
//                email.addAttachment("dresscode", odfDatasource);

//                email.signWithDomainKey(privateKeyData, "somemail.com", "selector");

                new Mailer(
                        new ServerConfig("bd1.bjitgroup.com", 465, "rashedul.alam", ""),
                        TransportStrategy.SMTP_SSL
//                        ,new ProxyConfig("socksproxy.host.com", 1080, "proxy user", "proxy password")
                ).sendMail(email);*/

                    Email email = new EmailBuilder()
                            .from("lollypop","rashed.droid@gmail.com")
                            .to("C. Cane", "rashedul.alam@bjitgroup.com")
//                            .to("C. Bo", "chocobo@candyshop.org")
                            .subject("hey")
                            .text("We should meet up! ;)")
                            .build();

//                    new Mailer("bd1.bjitgroup.com", 995, "rashedul.alam", "",TransportStrategy.SMTP_TLS).sendMail(email);
                    new Mailer(new ServerConfig("smtp.gmail.com", 465, "rashed.droid@gmail.com", ""),TransportStrategy.SMTP_TLS).sendMail(email);

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }
}
