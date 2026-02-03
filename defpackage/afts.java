package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afts {
    public final ekgb a;
    public final boolean b;

    public afts(ekgb ekgbVar) {
        this.a = ekgbVar;
        this.b = ekgbVar.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afts) && fdbq.f(this.a, ((afts) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HeaderIndexUiData(headers=" + this.a + ")";
    }
}
