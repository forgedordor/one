package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnka extends dnke {
    private final CharSequence a;
    private final dnjs b;
    private final dnjz e;
    private final dnjz f;

    public dnka(CharSequence charSequence, dnjs dnjsVar, dnjz dnjzVar, dnjz dnjzVar2) {
        dnjsVar.getClass();
        this.a = charSequence;
        this.b = dnjsVar;
        this.e = dnjzVar;
        this.f = dnjzVar2;
    }

    @Override // defpackage.dnkf
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.dnkf
    public final dnjs b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnka)) {
            return false;
        }
        dnka dnkaVar = (dnka) obj;
        return fdbq.f(this.a, dnkaVar.a) && fdbq.f(this.b, dnkaVar.b) && this.e == dnkaVar.e && this.f == dnkaVar.f;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "DualSkinTone(literal=" + ((Object) this.a) + ", base=" + this.b + ", skinTone1=" + this.e + ", skinTone2=" + this.f + ")";
    }
}
