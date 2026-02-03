package defpackage;

import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexa {
    public static final Log a = LogFactory.getLog(fexa.class);

    public static InputStream a(String str) {
        InputStream resourceAsStream;
        try {
            resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(str);
        } catch (SecurityException e) {
            a.info("Unable to access context classloader, using default. ".concat(String.valueOf(e.getMessage())));
            resourceAsStream = null;
        }
        return resourceAsStream == null ? fexa.class.getResourceAsStream("/".concat(str)) : resourceAsStream;
    }
}
