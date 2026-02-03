package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inx extends inz {
    public int a;
    private final ijp b;
    private final long c;
    private final long d;
    private final long e;
    private float f;
    private ijf g;

    public inx(ijp ijpVar, long j) {
        int i;
        int i2;
        this.b = ijpVar;
        this.c = 0L;
        this.d = j;
        this.a = 1;
        if (kjb.a(0L) < 0 || kjb.b(0L) < 0 || (i = (int) (j >> 32)) < 0 || (i2 = (int) (4294967295L & j)) < 0 || i > ijpVar.c() || i2 > ijpVar.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.e = j;
        this.f = 1.0f;
    }

    @Override // defpackage.inz
    public final long a() {
        return kjh.d(this.e);
    }

    @Override // defpackage.inz
    protected final void b(imz imzVar) {
        imy.k(imzVar, this.b, this.d, (Math.round(Float.intBitsToFloat((int) (imzVar.b() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (imzVar.b() & 4294967295L))) & 4294967295L), this.f, this.g, this.a, 328);
    }

    @Override // defpackage.inz
    protected final void c(float f) {
        this.f = f;
    }

    @Override // defpackage.inz
    protected final void d(ijf ijfVar) {
        this.g = ijfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inx)) {
            return false;
        }
        inx inxVar = (inx) obj;
        if (!fdbq.f(this.b, inxVar.b)) {
            return false;
        }
        long j = inxVar.c;
        return kjb.f(0L, 0L) && kjg.e(this.d, inxVar.d) && ijl.a(this.a, inxVar.a);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + kja.a(0L)) * 31) + kjf.a(this.d)) * 31) + this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.b);
        sb.append(", srcOffset=");
        sb.append((Object) kjb.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) kjg.c(this.d));
        sb.append(", filterQuality=");
        int i = this.a;
        sb.append((Object) (ijl.a(i, 0) ? "None" : ijl.a(i, 1) ? "Low" : ijl.a(i, 2) ? "Medium" : ijl.a(i, 3) ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ inx(ijp ijpVar) {
        this(ijpVar, (ijpVar.c() << 32) | (ijpVar.b() & 4294967295L));
    }
}
