package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipw extends ips {
    public final String a;
    public final List b;
    public final int c;
    public final iiy d;
    public final float e;
    public final iiy f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public ipw(String str, List list, int i, iiy iiyVar, float f, iiy iiyVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = iiyVar;
        this.e = f;
        this.f = iiyVar2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ipw ipwVar = (ipw) obj;
            return fdbq.f(this.a, ipwVar.a) && fdbq.f(this.d, ipwVar.d) && this.e == ipwVar.e && fdbq.f(this.f, ipwVar.f) && this.g == ipwVar.g && this.h == ipwVar.h && iku.a(this.i, ipwVar.i) && ikv.a(this.j, ipwVar.j) && this.k == ipwVar.k && this.l == ipwVar.l && this.m == ipwVar.m && this.n == ipwVar.n && ike.a(this.c, ipwVar.c) && fdbq.f(this.b, ipwVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        iiy iiyVar = this.d;
        int iHashCode2 = ((((iHashCode * 31) + (iiyVar != null ? iiyVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.e)) * 31;
        iiy iiyVar2 = this.f;
        return ((((((((((((((((((iHashCode2 + (iiyVar2 != null ? iiyVar2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i) * 31) + this.j) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + Float.floatToIntBits(this.m)) * 31) + Float.floatToIntBits(this.n)) * 31) + this.c;
    }
}
