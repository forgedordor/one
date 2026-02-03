package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnkc extends dnke {
    public final dnjw a;
    public final dnjz b;
    private final CharSequence e;
    private final dnjs f;

    public dnkc(CharSequence charSequence, dnjs dnjsVar, dnjw dnjwVar, dnjz dnjzVar) {
        dnjsVar.getClass();
        this.e = charSequence;
        this.f = dnjsVar;
        this.a = dnjwVar;
        this.b = dnjzVar;
    }

    @Override // defpackage.dnkf
    public final CharSequence a() {
        return this.e;
    }

    @Override // defpackage.dnkf
    public final dnjs b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnkc)) {
            return false;
        }
        dnkc dnkcVar = (dnkc) obj;
        return fdbq.f(this.e, dnkcVar.e) && fdbq.f(this.f, dnkcVar.f) && this.a == dnkcVar.a && this.b == dnkcVar.b;
    }

    public final int hashCode() {
        return (((((this.e.hashCode() * 31) + this.f.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GenderAndSkinTone(literal=" + ((Object) this.e) + ", base=" + this.f + ", gender=" + this.a + ", skinTone=" + this.b + ")";
    }
}
