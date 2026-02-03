package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeb implements ehc {
    private final ehc a;
    private final ehc b;

    public eeb(ehc ehcVar, ehc ehcVar2) {
        this.a = ehcVar;
        this.b = ehcVar2;
    }

    @Override // defpackage.ehc
    public final int a(kio kioVar) {
        return fddu.f(this.a.a(kioVar) - this.b.a(kioVar), 0);
    }

    @Override // defpackage.ehc
    public final int b(kio kioVar, kji kjiVar) {
        return fddu.f(this.a.b(kioVar, kjiVar) - this.b.b(kioVar, kjiVar), 0);
    }

    @Override // defpackage.ehc
    public final int c(kio kioVar, kji kjiVar) {
        return fddu.f(this.a.c(kioVar, kjiVar) - this.b.c(kioVar, kjiVar), 0);
    }

    @Override // defpackage.ehc
    public final int d(kio kioVar) {
        return fddu.f(this.a.d(kioVar) - this.b.d(kioVar), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eeb)) {
            return false;
        }
        eeb eebVar = (eeb) obj;
        return fdbq.f(eebVar.a, this.a) && fdbq.f(eebVar.b, this.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
