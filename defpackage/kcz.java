package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcz extends kam {
    public final String c;
    public final kcx d;
    public final kcc e;
    public final int f;
    private final boolean g;

    public kcz(String str, kcx kcxVar, kcc kccVar) {
        super(2, kdc.a, new kca(new kbz[0]));
        this.c = str;
        this.d = kcxVar;
        this.e = kccVar;
        this.f = 0;
        this.g = true;
    }

    @Override // defpackage.kbh
    public final kcc b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcz)) {
            return false;
        }
        kcz kczVar = (kcz) obj;
        if (!fdbq.f(this.c, kczVar.c) || !fdbq.f(this.d, kczVar.d) || !fdbq.f(this.e, kczVar.e)) {
            return false;
        }
        int i = kczVar.f;
        if (!kbw.b(0, 0)) {
            return false;
        }
        boolean z = kczVar.g;
        return true;
    }

    public final int hashCode() {
        return (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.i) * 961) + 1231;
    }

    public final String toString() {
        return "Font(GoogleFont(\"" + this.c + "\", bestEffort=true), weight=" + this.e + ", style=" + ((Object) kbw.a(0)) + ')';
    }

    @Override // defpackage.kbh
    public final void c() {
    }
}
