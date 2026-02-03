package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dksy implements dktc {
    private final long a;
    private final dff b;
    private final ikt c;

    public dksy(long j, dff dffVar) {
        this.a = j;
        this.b = dffVar;
        this.c = new ikt(j);
    }

    @Override // defpackage.dktc
    public final dff b() {
        return this.b;
    }

    @Override // defpackage.dktc
    public final iiy c(float f, long j) {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dksy)) {
            return false;
        }
        dksy dksyVar = (dksy) obj;
        long j = this.a;
        long j2 = dksyVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fdbq.f(this.b, dksyVar.b);
    }

    public final int hashCode() {
        long j = ije.a;
        return (fctr.a(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Fade(highlightColor=" + ije.g(this.a) + ", animationSpec=" + this.b + ")";
    }

    @Override // defpackage.dktc
    public final float a(float f) {
        return f;
    }
}
