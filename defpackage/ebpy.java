package defpackage;

import java.util.Hashtable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebpy {
    private static final Hashtable a;

    static {
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        hashtable.put("t", ebqh.class);
        hashtable.put("To".toLowerCase(Locale.US), ebqh.class);
        hashtable.put("From".toLowerCase(Locale.US), ebps.class);
        hashtable.put("f", ebps.class);
        hashtable.put("CSeq".toLowerCase(Locale.US), ebpi.class);
        hashtable.put("X-Pidgey-Conference-Params".toLowerCase(Locale.US), ebpl.class);
        hashtable.put("X-Pidgey-Selected-Experiments".toLowerCase(Locale.US), ebqe.class);
        hashtable.put("Via".toLowerCase(Locale.US), ebqj.class);
        hashtable.put("v", ebqj.class);
        hashtable.put("Contact".toLowerCase(Locale.US), ebpm.class);
        hashtable.put("m", ebpm.class);
        hashtable.put(ffho.a.toLowerCase(Locale.US), ebpo.class);
        hashtable.put("c", ebpo.class);
        hashtable.put("Content-Length".toLowerCase(Locale.US), ebpn.class);
        hashtable.put("l", ebpn.class);
        hashtable.put("Authorization".toLowerCase(Locale.US), ebph.class);
        hashtable.put("WWW-Authenticate".toLowerCase(Locale.US), ebqk.class);
        hashtable.put("Call-Id".toLowerCase(Locale.US), ebpj.class);
        hashtable.put("i", ebpj.class);
        hashtable.put("Route".toLowerCase(Locale.US), ebqd.class);
        hashtable.put("Record-Route".toLowerCase(Locale.US), ebqb.class);
        hashtable.put("Date".toLowerCase(Locale.US), ebpp.class);
        hashtable.put("Proxy-Authorization".toLowerCase(Locale.US), ebqa.class);
        hashtable.put("Proxy-Authenticate".toLowerCase(Locale.US), ebpz.class);
        hashtable.put("Max-Forwards".toLowerCase(Locale.US), ebpv.class);
        hashtable.put("Expires".toLowerCase(Locale.US), ebpr.class);
        hashtable.put("Event".toLowerCase(Locale.US), ebpq.class);
        hashtable.put("o", ebpq.class);
        hashtable.put("Session-Expires".toLowerCase(Locale.US), ebqf.class);
        hashtable.put("Referred-By".toLowerCase(Locale.US), ebqc.class);
        hashtable.put("b", ebqc.class);
    }

    public static ebpt a(String str) {
        String strV = ebpu.v(str);
        String strW = ebpu.w(str);
        if (strV == null || strW == null) {
            throw new ebml("The header name or value is null");
        }
        Class cls = (Class) a.get(strV.toLowerCase(Locale.US));
        if (cls == null) {
            return new ebpt(str);
        }
        try {
            ebpt ebptVar = (ebpt) cls.getDeclaredConstructor(null).newInstance(null);
            ebptVar.e(str);
            return ebptVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
