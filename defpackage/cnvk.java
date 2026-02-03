package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvk {
    public final cnyk a;

    public cnvk(cnyk cnykVar) {
        cnykVar.getClass();
        this.a = cnykVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnvk) && fdbq.f(this.a, ((cnvk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncStarted(sync=" + this.a + ")";
    }
}
