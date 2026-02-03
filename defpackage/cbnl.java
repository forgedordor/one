package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbnl {
    public final qap a;
    public final fdkf b;
    public final int c;

    public cbnl(int i, qap qapVar, fdkf fdkfVar) {
        this.c = i;
        this.a = qapVar;
        this.b = fdkfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbnl)) {
            return false;
        }
        cbnl cbnlVar = (cbnl) obj;
        return this.c == cbnlVar.c && fdbq.f(this.a, cbnlVar.a) && fdbq.f(this.b, cbnlVar.b);
    }

    public final int hashCode() {
        int iHashCode = (this.c * 31) + this.a.hashCode();
        fdkf fdkfVar = this.b;
        return (iHashCode * 31) + (fdkfVar == null ? 0 : fdkfVar.hashCode());
    }

    public final String toString() {
        return "RunResult(finalStatus=" + ((Object) cbmp.a(this.c)) + ", workerResult=" + this.a + ", followUpWork=" + this.b + ")";
    }

    public cbnl(int i, qap qapVar) {
        this(i, qapVar, null);
    }
}
