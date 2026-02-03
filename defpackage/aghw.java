package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghw {
    public final String a;
    public final String b;

    public aghw(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aghw)) {
            return false;
        }
        aghw aghwVar = (aghw) obj;
        return fdbq.f(this.a, aghwVar.a) && fdbq.f(this.b, aghwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Header(key=" + this.a + ", value=" + this.b + ")";
    }
}
