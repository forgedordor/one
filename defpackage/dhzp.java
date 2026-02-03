package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhzp extends dhph {
    public final sfv a;
    public final dhzq b;

    public dhzp(sfv sfvVar, dhzq dhzqVar) {
        this.a = sfvVar;
        this.b = dhzqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhzp)) {
            return false;
        }
        dhzp dhzpVar = (dhzp) obj;
        return fdbq.f(this.a, dhzpVar.a) && fdbq.f(this.b, dhzpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
