package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heq {
    public static final heq a;
    public final heg b;
    public final List c;
    public final List d;
    public final float e;
    public final float f;
    public final boolean g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final csz l;
    private final csz m;

    static {
        heg hegVar = heg.a;
        fcvo fcvoVar = fcvo.a;
        a = new heq(hegVar, fcvoVar, fcvoVar, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public heq(heg hegVar, List list, List list2, float f, float f2, float f3, float f4) {
        this.b = hegVar;
        this.c = list;
        this.d = list2;
        this.e = f;
        this.f = f2;
        this.h = f3;
        this.i = f4;
        float fMax = list.isEmpty() ? 0.0f : Math.max(((hef) fcva.N((List) fcva.S(list))).c - ((hef) fcva.N((List) fcva.N(list))).c, f3);
        this.j = fMax;
        float fMax2 = list2.isEmpty() ? 0.0f : Math.max(((hef) fcva.S((List) fcva.N(list2))).c - ((hef) fcva.S((List) fcva.S(list2))).c, f4);
        this.k = fMax2;
        this.l = het.b(fMax, list, true);
        this.m = het.b(fMax2, list2, false);
        this.g = (hegVar.isEmpty() || f == 0.0f || a() == 0.0f) ? false : true;
    }

    public final float a() {
        return this.b.c().a;
    }

    public final heg b(float f, float f2, boolean z) {
        heo heoVar;
        float f3 = this.j;
        float fMax = Math.max(0.0f, f);
        float fMax2 = Math.max(0.0f, f2 - this.k);
        if (f3 <= fMax && fMax <= fMax2) {
            return this.b;
        }
        float fA = het.a(1.0f, 0.0f, 0.0f, f3, fMax);
        csz cszVar = this.l;
        List list = this.c;
        if (fMax > fMax2) {
            fA = het.a(0.0f, 1.0f, fMax2, f2, fMax);
            cszVar = this.m;
            list = this.d;
        }
        int size = list.size();
        float fA2 = cszVar.a(0);
        fcvy it = fddu.r(1, size).iterator();
        while (true) {
            if (!((fddp) it).a) {
                heoVar = new heo(0, 0, 0.0f);
                break;
            }
            int iA = it.a();
            float fA3 = cszVar.a(iA);
            if (fA <= fA3) {
                heoVar = new heo(iA - 1, iA, het.a(0.0f, 1.0f, fA2, fA3, fA));
                break;
            }
            fA2 = fA3;
        }
        if (z) {
            return (heg) list.get(fdcu.b(heoVar.c) == 0 ? heoVar.a : heoVar.b);
        }
        heg hegVar = (heg) list.get(heoVar.a);
        heg hegVar2 = (heg) list.get(heoVar.b);
        float f4 = heoVar.c;
        ArrayList arrayList = new ArrayList(hegVar.a());
        int iA2 = hegVar.a();
        for (int i = 0; i < iA2; i++) {
            arrayList.add(heh.a(hegVar.get(i), hegVar2.get(i), f4));
        }
        return new heg(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heq)) {
            return false;
        }
        boolean z = this.g;
        if (!z && !((heq) obj).g) {
            return true;
        }
        heq heqVar = (heq) obj;
        return z == heqVar.g && this.e == heqVar.e && this.f == heqVar.f && this.h == heqVar.h && this.i == heqVar.i && a() == heqVar.a() && this.j == heqVar.j && this.k == heqVar.k && fdbq.f(this.l, heqVar.l) && fdbq.f(this.m, heqVar.m) && fdbq.f(this.b, heqVar.b);
    }

    public final int hashCode() {
        if (!this.g) {
            return hep.a(false);
        }
        return (((((((((((((((((((hep.a(true) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i)) * 31) + Float.floatToIntBits(a())) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.b.hashCode();
    }
}
