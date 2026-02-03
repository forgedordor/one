package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozr {
    public final dggp a;

    public cozr(dggp dggpVar) {
        dggpVar.getClass();
        this.a = dggpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cozr) && fdbq.f(this.a, ((cozr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Tachygram(simId=" + this.a + ")";
    }
}
