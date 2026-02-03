package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egw implements ehc {
    private final ehc a;
    private final ehc b;

    public egw(ehc ehcVar, ehc ehcVar2) {
        this.a = ehcVar;
        this.b = ehcVar2;
    }

    @Override // defpackage.ehc
    public final int a(kio kioVar) {
        return Math.max(this.a.a(kioVar), this.b.a(kioVar));
    }

    @Override // defpackage.ehc
    public final int b(kio kioVar, kji kjiVar) {
        return Math.max(this.a.b(kioVar, kjiVar), this.b.b(kioVar, kjiVar));
    }

    @Override // defpackage.ehc
    public final int c(kio kioVar, kji kjiVar) {
        return Math.max(this.a.c(kioVar, kjiVar), this.b.c(kioVar, kjiVar));
    }

    @Override // defpackage.ehc
    public final int d(kio kioVar) {
        return Math.max(this.a.d(kioVar), this.b.d(kioVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egw)) {
            return false;
        }
        egw egwVar = (egw) obj;
        return fdbq.f(egwVar.a, this.a) && fdbq.f(egwVar.b, this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
