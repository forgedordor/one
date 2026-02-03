package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsos {
    private final String a;
    private final eyax b;
    private final eyax c;
    private final fdae d;

    public dsos(String str, eyax eyaxVar, eyax eyaxVar2, fdae fdaeVar) {
        this.a = str;
        this.b = eyaxVar;
        this.c = eyaxVar2;
        this.d = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsos)) {
            return false;
        }
        dsos dsosVar = (dsos) obj;
        return fdbq.f(this.a, dsosVar.a) && fdbq.f(this.b, dsosVar.b) && fdbq.f(this.c, dsosVar.c) && fdbq.f(this.d, dsosVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "PromotionAction(text=" + this.a + ", lightThemeTextColor=" + this.b + ", darkThemeTextColor=" + this.c + ", onClick=" + this.d + ")";
    }
}
