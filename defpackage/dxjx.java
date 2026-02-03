package defpackage;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxjx {
    public abstract dxjv a();

    public abstract String b();

    public abstract URL c();

    public abstract Map d();

    public abstract byte[] e();

    public abstract int f();

    public final dxjv g() {
        dxjv dxjvVarA = a();
        ((dxjp) dxjvVarA).c = new HashMap(d());
        return dxjvVarA;
    }
}
