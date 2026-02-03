package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlff {
    public final String a;
    public final String b;
    public final fdae c;

    public dlff(String str, String str2, fdae fdaeVar) {
        fdaeVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlff)) {
            return false;
        }
        dlff dlffVar = (dlff) obj;
        return fdbq.f(this.a, dlffVar.a) && fdbq.f(this.b, dlffVar.b) && fdbq.f(this.c, dlffVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Basic(title=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
