package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxju {
    public static final dxju a = b("Content-Encoding");
    public static final dxju b;
    public static final dxju c;
    public static final dxju d;

    static {
        b(ffho.a);
        b = b("X-DFE-Device-Id");
        c = b("X-DFE-Debug-Overrides");
        d = b("X-Server-Token");
    }

    public static dxju b(String str) {
        ejwl.f(ejuq.a.i(str), "Only ASCII characters are permitted in header keys: %s", str);
        return new dxjo(str.toLowerCase(Locale.US));
    }

    public abstract String a();
}
