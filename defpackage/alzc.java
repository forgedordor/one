package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alzc {
    public final int a;
    public final ekgb b;

    public alzc(int i, ekgb ekgbVar) {
        ekgbVar.getClass();
        this.a = i;
        this.b = ekgbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alzc)) {
            return false;
        }
        alzc alzcVar = (alzc) obj;
        return this.a == alzcVar.a && fdbq.f(this.b, alzcVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BugleMessageSearchSummary(totalCount=" + this.a + ", summary=" + this.b + ")";
    }
}
