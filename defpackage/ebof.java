package defpackage;

import java.util.Hashtable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebof {
    public static final Hashtable a = new Hashtable();

    static {
        a("CSeq", ebnn.class);
        a("Record-Route", ebok.class);
        a("Via", ebov.class);
        a("From", eboa.class);
        a("Call-Id", ebno.class);
        a("Max-Forwards", ebod.class);
        a("Proxy-Authenticate", eboi.class);
        a(ffho.a, ebnv.class);
        a("Content-Length", ebnu.class);
        a("Route", ebon.class);
        a("Contact", ebnr.class);
        a("WWW-Authenticate", ebox.class);
        a("Proxy-Authorization", eboj.class);
        a("Date", ebnw.class);
        a("Expires", ebny.class);
        a("Authorization", ebnm.class);
        a("Session-Expires", eboq.class);
    }

    protected static void a(String str, Class cls) {
        a.put(str.toLowerCase(Locale.US), cls);
    }
}
