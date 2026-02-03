package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbx {
    public final ekgb a;
    public final fdap b;

    public cwbx(ekgb ekgbVar, fdap fdapVar) {
        this.a = ekgbVar;
        this.b = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwbx)) {
            return false;
        }
        cwbx cwbxVar = (cwbx) obj;
        return fdbq.f(this.a, cwbxVar.a) && fdbq.f(this.b, cwbxVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ActionsUiData(actions=" + this.a + ", onClick=" + this.b + ")";
    }
}
