package defpackage;

import java.util.Properties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fews {
    private static final Log a = LogFactory.getLog(fews.class);
    private static final Properties b;

    static {
        Properties properties = new Properties();
        b = properties;
        try {
            properties.load(fexa.a("ical4j.properties"));
        } catch (Exception unused) {
            a.info("ical4j.properties not found.");
        }
    }

    private fews() {
    }

    public static String a(String str) {
        String property = b.getProperty(str);
        return property == null ? System.getProperty(str) : property;
    }
}
