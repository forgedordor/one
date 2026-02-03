package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dktq {
    public final String a;
    public final boolean b;
    public final fdae c;

    public dktq(String str, boolean z, fdae fdaeVar) {
        str.getClass();
        fdaeVar.getClass();
        this.a = str;
        this.b = z;
        this.c = fdaeVar;
    }

    public static /* synthetic */ dktq a(dktq dktqVar, String str, fdae fdaeVar, int i) {
        if ((i & 1) != 0) {
            str = dktqVar.a;
        }
        boolean z = (i & 2) != 0 ? dktqVar.b : false;
        if ((i & 4) != 0) {
            fdaeVar = dktqVar.c;
        }
        str.getClass();
        fdaeVar.getClass();
        return new dktq(str, z, fdaeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dktq)) {
            return false;
        }
        dktq dktqVar = (dktq) obj;
        return fdbq.f(this.a, dktqVar.a) && this.b == dktqVar.b && fdbq.f(this.c, dktqVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PopupButton(text=" + this.a + ", enabled=" + this.b + ", onClick=" + this.c + ")";
    }

    public /* synthetic */ dktq(String str, fdae fdaeVar) {
        this(str, true, fdaeVar);
    }
}
