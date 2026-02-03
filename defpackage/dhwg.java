package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhwg extends dhph {
    public final dhpa a;
    public final long b;
    public final dhpd c;
    public final String d;

    public dhwg(dhpa dhpaVar, long j, dhpd dhpdVar, String str) {
        this.a = dhpaVar;
        this.b = j;
        this.c = dhpdVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhwg)) {
            return false;
        }
        dhwg dhwgVar = (dhwg) obj;
        return fdbq.f(this.a, dhwgVar.a) && fdhi.p(this.b, dhwgVar.b) && fdbq.f(this.c, dhwgVar.c) && fdbq.f(this.d, dhwgVar.d);
    }

    public final int hashCode() {
        dhpa dhpaVar = this.a;
        int iHashCode = dhpaVar == null ? 0 : dhpaVar.hashCode();
        long j = this.b;
        long j2 = fdhi.a;
        int iA = (((iHashCode * 31) + fdhh.a(j)) * 31) + this.c.hashCode();
        String str = this.d;
        return (iA * 31) + (str != null ? str.hashCode() : 0);
    }

    public dhwg(fdhu fdhuVar, dhpd dhpdVar) {
        this((dhpa) fdhuVar.a, fdhuVar.b, dhpdVar, null);
    }
}
