package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlht {
    public final int a;
    public final int b;
    public final fdae c;
    public final fdae d;

    public dlht(int i, int i2, fdae fdaeVar, fdae fdaeVar2) {
        this.a = i;
        this.b = i2;
        this.c = fdaeVar;
        this.d = fdaeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlht)) {
            return false;
        }
        dlht dlhtVar = (dlht) obj;
        return this.a == dlhtVar.a && this.b == dlhtVar.b && fdbq.f(this.c, dlhtVar.c) && fdbq.f(this.d, dlhtVar.d);
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TextResultsBarUiData(resultCount=" + this.a + ", currentResult=" + this.b + ", onPreviousClick=" + this.c + ", onNextClick=" + this.d + ")";
    }
}
