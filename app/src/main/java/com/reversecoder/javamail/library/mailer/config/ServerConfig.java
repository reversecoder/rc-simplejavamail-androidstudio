package com.reversecoder.javamail.library.mailer.config;

import android.util.Log;

import static com.reversecoder.javamail.library.internal.util.MiscUtil.checkArgumentNotEmpty;
import static com.reversecoder.javamail.library.internal.util.MiscUtil.valueNullOrEmpty;
import static com.reversecoder.javamail.library.util.ConfigLoader.Property.SMTP_HOST;
import static com.reversecoder.javamail.library.util.ConfigLoader.Property.SMTP_PASSWORD;
import static com.reversecoder.javamail.library.util.ConfigLoader.Property.SMTP_PORT;
import static com.reversecoder.javamail.library.util.ConfigLoader.Property.SMTP_USERNAME;
import static com.reversecoder.javamail.library.util.ConfigLoader.valueOrProperty;
import static java.lang.String.format;

public class ServerConfig {
    private final String host;
    private final Integer port;
    private final String username;
    private final String password;

    /**
     * No-arg constructor short-cut. Works only with populated config files.
     *
     * @see #ServerConfig(String, Integer, String, String)
     */
    public ServerConfig() {
        this(null, null, null, null);
    }

    /**
     * 'Anonymous smtp' constructor short-cut. If provided, username and / or password is loaded from config file.
     *
     * @param host The address URL of the SMTP server to be used.
     * @param port The port of the SMTP server.
     * @see #ServerConfig(String, Integer, String, String)
     */
    public ServerConfig(final String host, final Integer port) {
        this(host, port, null, null);
    }

    /**
     * 'Non-authenticated smtp' constructor short-cut. If provided, password is loaded from config file.
     *
     * @param host     The address URL of the SMTP server to be used.
     * @param port     The port of the SMTP server.
     * @param username An optional username, may be <code>null</code>.
     * @see #ServerConfig(String, Integer, String, String)
     */
    public ServerConfig(final String host, final Integer port, final String username) {
        this(host, port, username, null);
    }

    /**
     * Main constructor, overrides any relevant values that may have been provided in config file.
     *
     * @param host     The address URL of the SMTP server to be used.
     * @param port     The port of the SMTP server.
     * @param username An optional username, may be <code>null</code>.
     * @param password An optional password, may be <code>null</code>.
     */
    public ServerConfig(final String host, final Integer port, final String username, final String password) {
        this.host = valueOrProperty(host, SMTP_HOST);
        this.port = valueOrProperty(port, SMTP_PORT);
        this.username = valueOrProperty(username, SMTP_USERNAME);
        this.password = valueOrProperty(password, SMTP_PASSWORD);
        Log.d("", "--------------------------------------------------------------------------");
        Log.d("username: ", username);
        Log.d("password: ", password);
        Log.d("", "--------------------------------------------------------------------------");
        checkArgumentNotEmpty(this.host, "smtp host address not given and not configured in config file");
        checkArgumentNotEmpty(this.port, "smtp host port not given and not configured in config file");

        if (valueNullOrEmpty(this.username) && !valueNullOrEmpty(this.password)) {
            throw new IllegalArgumentException("Password provided but no username given as argument or in config file");
        }
    }

    @Override
    public String toString() {
        String str = format("%s:%s", host, port);
        if (username != null) {
            str += format(", username: %s", username);
        }
        if (password != null) {
            str += " (authenticated)";
        }
        return str;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
