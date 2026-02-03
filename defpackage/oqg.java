package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oqg {
    public final int a;
    public final oxh b;

    public oqg(int i, oxh oxhVar) {
        oxhVar.getClass();
        this.a = i;
        this.b = oxhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqg)) {
            return false;
        }
        oqg oqgVar = (oqg) obj;
        return this.a == oqgVar.a && fdbq.f(this.b, oqgVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
