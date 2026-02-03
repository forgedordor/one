package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efj implements egc {
    private final ehc a;
    private final kio b;

    public efj(ehc ehcVar, kio kioVar) {
        this.a = ehcVar;
        this.b = kioVar;
    }

    @Override // defpackage.egc
    public final float a() {
        ehc ehcVar = this.a;
        kio kioVar = this.b;
        return kioVar.el(ehcVar.a(kioVar));
    }

    @Override // defpackage.egc
    public final float b(kji kjiVar) {
        ehc ehcVar = this.a;
        kio kioVar = this.b;
        return kioVar.el(ehcVar.b(kioVar, kjiVar));
    }

    @Override // defpackage.egc
    public final float c(kji kjiVar) {
        ehc ehcVar = this.a;
        kio kioVar = this.b;
        return kioVar.el(ehcVar.c(kioVar, kjiVar));
    }

    @Override // defpackage.egc
    public final float d() {
        ehc ehcVar = this.a;
        kio kioVar = this.b;
        return kioVar.el(ehcVar.d(kioVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efj)) {
            return false;
        }
        efj efjVar = (efj) obj;
        return fdbq.f(this.a, efjVar.a) && fdbq.f(this.b, efjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
