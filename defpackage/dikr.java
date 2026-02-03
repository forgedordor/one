package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikr {
    public final dlps a;
    public final dlpo b;

    public dikr(dlps dlpsVar, dlpo dlpoVar) {
        this.a = dlpsVar;
        this.b = dlpoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dikr)) {
            return false;
        }
        dikr dikrVar = (dikr) obj;
        return fdbq.f(this.a, dikrVar.a) && fdbq.f(this.b, dikrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Transcript(uiData=" + this.a + ", uiAction=" + this.b + ")";
    }
}
