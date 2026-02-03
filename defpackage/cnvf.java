package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvf {
    private final cnyk a;
    private final cnyk b;

    public cnvf(cnyk cnykVar, cnyk cnykVar2) {
        cnykVar.getClass();
        cnykVar2.getClass();
        this.a = cnykVar;
        this.b = cnykVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnvf)) {
            return false;
        }
        cnvf cnvfVar = (cnvf) obj;
        return fdbq.f(this.a, cnvfVar.a) && fdbq.f(this.b, cnvfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncInterrupted(newActiveSync=" + this.a + ", interruptedSync=" + this.b + ")";
    }
}
