package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqy {
    public final long a;
    private final fwx b = null;

    public gqy(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqy)) {
            return false;
        }
        long j = this.a;
        gqy gqyVar = (gqy) obj;
        long j2 = gqyVar.a;
        long j3 = ije.a;
        if (!fcts.a(j, j2)) {
            return false;
        }
        fwx fwxVar = gqyVar.b;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        long j = ije.a;
        return fctr.a(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) ije.g(this.a)) + ", rippleAlpha=null)";
    }
}
