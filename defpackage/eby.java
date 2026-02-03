package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eby implements ehc {
    public final int a;
    private final String b;
    private final hox c;
    private final hox d;

    public eby(int i, String str) {
        this.a = i;
        this.b = str;
        kzc kzcVar = kzc.a;
        hsi hsiVar = hsi.a;
        this.c = new hpl(kzcVar, hsiVar);
        this.d = new hpl(true, hsiVar);
    }

    @Override // defpackage.ehc
    public final int a(kio kioVar) {
        return e().e;
    }

    @Override // defpackage.ehc
    public final int b(kio kioVar, kji kjiVar) {
        return e().b;
    }

    @Override // defpackage.ehc
    public final int c(kio kioVar, kji kjiVar) {
        return e().d;
    }

    @Override // defpackage.ehc
    public final int d(kio kioVar) {
        return e().c;
    }

    public final kzc e() {
        return (kzc) this.c.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eby) && this.a == ((eby) obj).a;
    }

    public final void f(lgt lgtVar) {
        int i = this.a;
        this.c.b(lgtVar.f(i));
        this.d.b(Boolean.valueOf(lgtVar.v(i)));
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + '(' + e().b + ", " + e().c + ", " + e().d + ", " + e().e + ')';
    }
}
