package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krb {
    final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public final float a(Object obj) {
        if (!(obj instanceof kqv)) {
            if (obj instanceof kqr) {
                return ((kqr) obj).t();
            }
            return 0.0f;
        }
        String strV = ((kqv) obj).v();
        HashMap map = this.b;
        if (map.containsKey(strV)) {
            return ((kqz) map.get(strV)).a();
        }
        HashMap map2 = this.a;
        if (map2.containsKey(strV)) {
            return ((Integer) map2.get(strV)).floatValue();
        }
        return 0.0f;
    }

    public final void b(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
    }

    public final void c(String str, ArrayList arrayList) {
        this.c.put(str, arrayList);
    }
}
