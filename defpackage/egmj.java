package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egmj {
    public final String a;
    public final String b;
    public final String c;

    public egmj(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egmj)) {
            return false;
        }
        egmj egmjVar = (egmj) obj;
        return fdbq.f(this.a, egmjVar.a) && fdbq.f(this.b, egmjVar.b) && fdbq.f(this.c, egmjVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SelectedAccount(userId=" + this.a + ", displayId=" + this.b + ", type=" + this.c + ")";
    }
}
