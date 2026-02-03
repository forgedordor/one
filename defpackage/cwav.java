package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwav {
    public final ekgb a;
    public final cwau b;

    public cwav(ekgb ekgbVar, cwau cwauVar) {
        this.a = ekgbVar;
        this.b = cwauVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwav)) {
            return false;
        }
        cwav cwavVar = (cwav) obj;
        return fdbq.f(this.a, cwavVar.a) && fdbq.f(this.b, cwavVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "HeaderActionsUiData(actions=" + this.a + ", flags=" + this.b + ")";
    }
}
