//package com.reversecoder.javamail.library.util;
//
//import android.content.Context;
//
//import com.reversecoder.library.androidproperties.AssetsProperties;
//import com.reversecoder.library.androidproperties.Property;
//
///**
// * Created by rashed on 3/27/17.
// */
//
//public class SimpleJavaMailProperties extends AssetsProperties {
//
//    private static final String DEFAULT_CONFIG_FILENAME = "simplejavamail";
//
//    @Property("simplejavamail.javaxmail.debug")
//    public boolean debug;
//    @Property("simplejavamail.transportstrategy")
//    public String transportStrategy;
//    @Property("simplejavamail.smtp.host")
//    public String smtpHost;
//    @Property("simplejavamail.smtp.port")
//    public int smtPort;
//    @Property("simplejavamail.smtp.username")
//    public String smtpUserName;
//    @Property("simplejavamail.smtp.password")
//    public String smtpPassword;
//    @Property("simplejavamail.proxy.host")
//    public String proxyHost;
//    @Property("simplejavamail.proxy.port")
//    public int proxyPort;
//    @Property("simplejavamail.proxy.username")
//    public String proxyUserName;
//    @Property("simplejavamail.proxy.password")
//    public String proxyPassword;
//    @Property("simplejavamail.proxy.socks5bridge.port")
//    public int socks5BridgePort;
//    @Property("simplejavamail.defaults.subject")
//    public String defSubject;
//    @Property("simplejavamail.defaults.from.name")
//    public String defFromName;
//    @Property("simplejavamail.defaults.from.address")
//    public String defFromAddress;
//    @Property("simplejavamail.defaults.replyto.name")
//    public String defReplyToName;
//    @Property("simplejavamail.defaults.replyto.address")
//    public String defReplyToAddress;
//    @Property("simplejavamail.defaults.to.name")
//    public String defToName;
//    @Property("simplejavamail.defaults.to.address")
//    public String defToAddress;
//    @Property("simplejavamail.defaults.cc.name")
//    public String defCcName;
//    @Property("simplejavamail.defaults.cc.address")
//    public String defCcAddress;
//    @Property("simplejavamail.defaults.bcc.name")
//    public String defBccName;
//    @Property("simplejavamail.defaults.bcc.address")
//    public String defBccAddress;
//    @Property("simplejavamail.transport.mode.logging.only")
//    public boolean transportModeLoggingOnly;
//
////    @Property
////    String message;
//
//    public SimpleJavaMailProperties(Context context) {
//        super(context, DEFAULT_CONFIG_FILENAME);
//    }
//}
