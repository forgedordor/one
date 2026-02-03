package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iny extends inz {
    private final long a;
    private float b = 1.0f;
    private ijf c;

    public iny(long j) {
        this.a = j;
    }

    @Override // defpackage.inz
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.inz
    protected final void b(imz imzVar) {
        imzVar.r(this.a, 0L, (126 & 4) != 0 ? imy.c(imzVar.b(), 0L) : 0L, (126 & 8) != 0 ? 1.0f : this.b, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : this.c, (126 & 64) != 0 ? 3 : 0);
    }

    @Override // defpackage.inz
    protected final void c(float f) {
        this.b = f;
    }

    @Override // defpackage.inz
    protected final void d(ijf ijfVar) {
        this.c = ijfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iny)) {
            return false;
        }
        long j = this.a;
        long j2 = ((iny) obj).a;
        long j3 = ije.a;
        return fcts.a(j, j2);
    }

    public final int hashCode() {
        long j = ije.a;
        return fctr.a(this.a);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) ije.g(this.a)) + ')';
    }
}
