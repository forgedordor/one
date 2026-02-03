package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnve {
    public final cnyk a;
    private final cnxu b;

    public cnve(cnyk cnykVar, cnxu cnxuVar) {
        cnykVar.getClass();
        cnxuVar.getClass();
        this.a = cnykVar;
        this.b = cnxuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnve)) {
            return false;
        }
        cnve cnveVar = (cnve) obj;
        return fdbq.f(this.a, cnveVar.a) && this.b == cnveVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncCompleted(sync=" + this.a + ", status=" + this.b + ")";
    }
}
