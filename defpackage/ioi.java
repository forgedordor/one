package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioi {
    public static final ioh a;
    public static int b;
    public static final Object c;
    public final String d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final ipq i;
    public final long j;
    public final int k;
    public final boolean l;
    public final int m;

    static {
        ioh iohVar = new ioh();
        a = iohVar;
        c = iohVar;
    }

    public ioi(String str, float f, float f2, float f3, float f4, ipq ipqVar, long j, int i, boolean z, int i2) {
        this.d = str;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = ipqVar;
        this.j = j;
        this.k = i;
        this.l = z;
        this.m = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioi)) {
            return false;
        }
        ioi ioiVar = (ioi) obj;
        if (!fdbq.f(this.d, ioiVar.d) || !kir.b(this.e, ioiVar.e) || !kir.b(this.f, ioiVar.f) || this.g != ioiVar.g || this.h != ioiVar.h || !fdbq.f(this.i, ioiVar.i)) {
            return false;
        }
        long j = this.j;
        long j2 = ioiVar.j;
        long j3 = ije.a;
        return fcts.a(j, j2) && iis.b(this.k, ioiVar.k) && this.l == ioiVar.l;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.d.hashCode() * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i.hashCode();
        long j = ije.a;
        return (((((iHashCode * 31) + fctr.a(this.j)) * 31) + this.k) * 31) + (true != this.l ? 1237 : 1231);
    }
}
