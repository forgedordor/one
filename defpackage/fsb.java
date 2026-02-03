package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsb {
    public final long a;
    private final fwx b = null;

    public fsb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsb)) {
            return false;
        }
        long j = this.a;
        fsb fsbVar = (fsb) obj;
        long j2 = fsbVar.a;
        long j3 = ije.a;
        if (!fcts.a(j, j2)) {
            return false;
        }
        fwx fwxVar = fsbVar.b;
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
