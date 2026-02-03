package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvj {
    public final cnyk a;

    public cnvj(cnyk cnykVar) {
        cnykVar.getClass();
        this.a = cnykVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnvj) && fdbq.f(this.a, ((cnvj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncResumed(sync=" + this.a + ")";
    }
}
