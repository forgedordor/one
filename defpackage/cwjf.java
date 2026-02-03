package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwjf {
    public final ekgb a;

    public cwjf(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwjf) && fdbq.f(this.a, ((cwjf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchUiData(actions=" + this.a + ")";
    }
}
