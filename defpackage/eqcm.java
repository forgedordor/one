package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eqcm {
    public abstract ekgi a();

    public abstract eqcn b();

    public abstract String c();

    public abstract String d();

    public abstract void e(String str);

    public abstract void f(String str);

    public final eqcn g() {
        f(ejuc.a(d()));
        e(ejuc.a(c()));
        return b();
    }

    public final void h(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            a().i(ejuc.a(str), str2);
        }
    }
}
