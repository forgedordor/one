package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxe {
    public static final int a(int i, int i2) {
        return i << ((i2 * 3) + 1);
    }

    public static final int b(int i) {
        return a(2, i);
    }

    public static final int c(int i) {
        return a(1, i);
    }

    public static final hwv d(int i, Object obj, hml hmlVar) {
        Object objF = hmlVar.f();
        if (objF == hmk.a) {
            objF = new hxd(i, true, obj);
            hmlVar.y(objF);
        }
        hxd hxdVar = (hxd) objF;
        if (!fdbq.f(hxdVar.b, obj)) {
            Object obj2 = hxdVar.b;
            hxdVar.b = obj;
            if (obj2 != null && hxdVar.a) {
                hpx hpxVar = hxdVar.d;
                if (hpxVar != null) {
                    hpxVar.a();
                    hxdVar.d = null;
                }
                List list = hxdVar.c;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((hpx) list.get(i2)).a();
                    }
                    list.clear();
                }
            }
        }
        return hxdVar;
    }

    public static final boolean e(hpx hpxVar, hpx hpxVar2) {
        return hpxVar == null || !hpxVar.l() || fdbq.f(hpxVar, hpxVar2) || fdbq.f(hpxVar.c, hpxVar2.c);
    }
}
