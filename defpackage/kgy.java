package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kgy implements khs {
    private final long a;

    public kgy(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        kfq.b("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.khs
    public final float a() {
        return ije.a(this.a);
    }

    @Override // defpackage.khs
    public final long b() {
        return this.a;
    }

    @Override // defpackage.khs
    public final iiy c() {
        return null;
    }

    @Override // defpackage.khs
    public final /* synthetic */ khs d(khs khsVar) {
        return khp.a(this, khsVar);
    }

    @Override // defpackage.khs
    public final /* synthetic */ khs e(fdae fdaeVar) {
        return khp.b(this, fdaeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgy)) {
            return false;
        }
        long j = this.a;
        long j2 = ((kgy) obj).a;
        long j3 = ije.a;
        return fcts.a(j, j2);
    }

    public final int hashCode() {
        long j = ije.a;
        return fctr.a(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) ije.g(this.a)) + ')';
    }
}
