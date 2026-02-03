package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnkd extends dnke {
    public final CharSequence a;
    public final dnjz b;
    private final dnjs e;

    public dnkd(CharSequence charSequence, dnjs dnjsVar, dnjz dnjzVar) {
        dnjsVar.getClass();
        this.a = charSequence;
        this.e = dnjsVar;
        this.b = dnjzVar;
    }

    @Override // defpackage.dnkf
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.dnkf
    public final dnjs b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnkd)) {
            return false;
        }
        dnkd dnkdVar = (dnkd) obj;
        return fdbq.f(this.a, dnkdVar.a) && fdbq.f(this.e, dnkdVar.e) && this.b == dnkdVar.b;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SkinTone(literal=" + ((Object) this.a) + ", base=" + this.e + ", skinTone=" + this.b + ")";
    }
}
