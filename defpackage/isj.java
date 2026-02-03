package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isj {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List i;
    public final long j;
    public final long k;

    public isj(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isj)) {
            return false;
        }
        isj isjVar = (isj) obj;
        return isd.b(this.a, isjVar.a) && this.b == isjVar.b && ihs.h(this.c, isjVar.c) && ihs.h(this.d, isjVar.d) && this.e == isjVar.e && Float.compare(this.f, isjVar.f) == 0 && ita.b(this.g, isjVar.g) && this.h == isjVar.h && fdbq.f(this.i, isjVar.i) && ihs.h(this.j, isjVar.j) && ihs.h(this.k, isjVar.k);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        float f = this.f;
        boolean z = this.e;
        int iA = (((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ihr.a(this.c)) * 31) + ihr.a(this.d)) * 31) + isi.a(z)) * 31) + Float.floatToIntBits(f);
        List list = this.i;
        return (((((((((iA * 31) + this.g) * 31) + isi.a(this.h)) * 31) + list.hashCode()) * 31) + ihr.a(this.j)) * 31) + ihr.a(this.k);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) isd.a(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) ihs.g(this.c)) + ", position=" + ((Object) ihs.g(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) ita.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) ihs.g(this.j)) + ", originalEventPosition=" + ((Object) ihs.g(this.k)) + ')';
    }
}
