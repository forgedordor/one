package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dixo {
    public final String a;
    public final String b;
    public final fdap c;

    public dixo(String str, String str2, fdap fdapVar) {
        str.getClass();
        fdapVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dixo)) {
            return false;
        }
        dixo dixoVar = (dixo) obj;
        return fdbq.f(this.a, dixoVar.a) && fdbq.f(this.b, dixoVar.b) && fdbq.f(this.c, dixoVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Mode(label=" + this.a + ", contentDescription=" + this.b + ", onSelected=" + this.c + ")";
    }
}
