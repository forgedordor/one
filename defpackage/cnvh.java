package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvh {
    private final cnyk a;
    private final cnvc b;

    public cnvh(cnyk cnykVar, cnvc cnvcVar) {
        cnykVar.getClass();
        this.a = cnykVar;
        this.b = cnvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnvh)) {
            return false;
        }
        cnvh cnvhVar = (cnvh) obj;
        return fdbq.f(this.a, cnvhVar.a) && fdbq.f(this.b, cnvhVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncProgress(sync=" + this.a + ", update=" + this.b + ")";
    }
}
