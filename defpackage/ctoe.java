package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctoe {
    public final String a;
    public final String b;
    public final dkri c;
    public final fdae d;

    public ctoe(String str, String str2, dkri dkriVar, fdae fdaeVar) {
        this.a = str;
        this.b = str2;
        this.c = dkriVar;
        this.d = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctoe)) {
            return false;
        }
        ctoe ctoeVar = (ctoe) obj;
        return fdbq.f(this.a, ctoeVar.a) && fdbq.f(this.b, ctoeVar.b) && fdbq.f(this.c, ctoeVar.c) && fdbq.f(this.d, ctoeVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "PenpalRowUiData(title=" + this.a + ", subtitle=" + this.b + ", monogram=" + this.c + ", onClick=" + this.d + ")";
    }
}
