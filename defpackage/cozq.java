package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozq {
    public final dggp a;
    public final coze b;

    public cozq(dggp dggpVar, coze cozeVar) {
        dggpVar.getClass();
        cozeVar.getClass();
        this.a = dggpVar;
        this.b = cozeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cozq)) {
            return false;
        }
        cozq cozqVar = (cozq) obj;
        return fdbq.f(this.a, cozqVar.a) && this.b == cozqVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NonTachygram(simId=" + this.a + ", transport=" + this.b + ")";
    }
}
