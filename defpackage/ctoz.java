package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctoz {
    public final String a;
    public final boolean b;
    public final fdae c;

    public ctoz(String str, boolean z, fdae fdaeVar) {
        this.a = str;
        this.b = z;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctoz)) {
            return false;
        }
        ctoz ctozVar = (ctoz) obj;
        return fdbq.f(this.a, ctozVar.a) && this.b == ctozVar.b && fdbq.f(this.c, ctozVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DestinationUiData(displayDestination=" + this.a + ", isSelected=" + this.b + ", onClick=" + this.c + ")";
    }
}
