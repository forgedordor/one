package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbe extends kam {
    public final String c;
    public final kcc d;
    public final int e;

    public kbe(String str, kcc kccVar, kca kcaVar) {
        super(1, kcg.a, kcaVar);
        this.c = str;
        this.d = kccVar;
        this.e = 0;
    }

    @Override // defpackage.kbh
    public final kcc b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbe)) {
            return false;
        }
        kbe kbeVar = (kbe) obj;
        if (fdbq.f(this.c, kbeVar.c) && fdbq.f(this.d, kbeVar.d)) {
            int i = kbeVar.e;
            return kbw.b(0, 0) && fdbq.f(this.b, kbeVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.d.i) * 961) + this.b.hashCode();
    }

    public final String toString() {
        return "Font(familyName=\"" + ((Object) ("DeviceFontFamilyName(name=" + this.c + ')')) + "\", weight=" + this.d + ", style=" + ((Object) kbw.a(0)) + ')';
    }

    @Override // defpackage.kbh
    public final void c() {
    }
}
