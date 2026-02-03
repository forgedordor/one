package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnkb extends dnke {
    public final dnjw a;
    private final CharSequence b;
    private final dnjs e;

    public dnkb(CharSequence charSequence, dnjs dnjsVar, dnjw dnjwVar) {
        dnjsVar.getClass();
        this.b = charSequence;
        this.e = dnjsVar;
        this.a = dnjwVar;
    }

    @Override // defpackage.dnkf
    public final CharSequence a() {
        return this.b;
    }

    @Override // defpackage.dnkf
    public final dnjs b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnkb)) {
            return false;
        }
        dnkb dnkbVar = (dnkb) obj;
        return fdbq.f(this.b, dnkbVar.b) && fdbq.f(this.e, dnkbVar.e) && this.a == dnkbVar.a;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Gender(literal=" + ((Object) this.b) + ", base=" + this.e + ", gender=" + this.a + ")";
    }
}
