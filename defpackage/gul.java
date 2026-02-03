package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gul {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;

    public gul(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gul gulVar = (gul) obj;
            return fdbq.f(this.a, gulVar.a) && fdbq.f(this.b, gulVar.b) && this.c == gulVar.c && this.d == gulVar.d;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d;
    }
}
