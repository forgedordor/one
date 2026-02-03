package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axcc {
    public final axcm a;
    public final boolean b;

    public axcc(axcm axcmVar, boolean z) {
        axcmVar.getClass();
        this.a = axcmVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axcc)) {
            return false;
        }
        axcc axccVar = (axcc) obj;
        return fdbq.f(this.a, axccVar.a) && this.b == axccVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "MyIdentityUpdateResult(token=" + this.a + ", hasChanges=" + this.b + ")";
    }
}
