package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkya implements dkyb {
    public final String a;
    public final String b;
    public final fdae c;

    public dkya(String str, String str2, fdae fdaeVar) {
        this.a = str;
        this.b = str2;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkya)) {
            return false;
        }
        dkya dkyaVar = (dkya) obj;
        return fdbq.f(this.a, dkyaVar.a) && fdbq.f(this.b, dkyaVar.b) && fdbq.f(this.c, dkyaVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Emotify(uri=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
