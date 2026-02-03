package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhpd extends dhph {
    public final String a;
    public final String b;

    public dhpd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhpd)) {
            return false;
        }
        dhpd dhpdVar = (dhpd) obj;
        return fdbq.f(this.a, dhpdVar.a) && fdbq.f(this.b, dhpdVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
