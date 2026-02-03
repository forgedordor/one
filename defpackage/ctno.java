package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctno {
    public final ekgb a;
    public final boolean b;

    public ctno(ekgb ekgbVar) {
        this.a = ekgbVar;
        this.b = ekgbVar.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctno) && fdbq.f(this.a, ((ctno) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HeaderIndexUiData(headers=" + this.a + ")";
    }
}
