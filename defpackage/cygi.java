package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cygi {
    public final int a;
    public final String b;
    public final String c;
    public final fdae d;

    public cygi(int i, String str, String str2, fdae fdaeVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cygi)) {
            return false;
        }
        cygi cygiVar = (cygi) obj;
        return this.a == cygiVar.a && fdbq.f(this.b, cygiVar.b) && fdbq.f(this.c, cygiVar.c) && fdbq.f(this.d, cygiVar.d);
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DBTool(key=" + this.a + ", descriptionText=" + this.b + ", buttonText=" + this.c + ", handler=" + this.d + ")";
    }
}
