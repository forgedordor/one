package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edk implements ede {
    public final long a;
    private final /* synthetic */ edf b = edf.a;
    private final kio c;

    public edk(kio kioVar, long j) {
        this.c = kioVar;
        this.a = j;
    }

    @Override // defpackage.ede
    public final ics a(ics icsVar, iby ibyVar) {
        return this.b.a(icsVar, ibyVar);
    }

    @Override // defpackage.ede
    public final ics b(ics icsVar) {
        return this.b.b(icsVar);
    }

    public final float c() {
        long j = this.a;
        if (kil.h(j)) {
            return this.c.el(kil.a(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final float d() {
        long j = this.a;
        if (kil.i(j)) {
            return this.c.el(kil.b(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edk)) {
            return false;
        }
        edk edkVar = (edk) obj;
        return fdbq.f(this.c, edkVar.c) && kil.g(this.a, edkVar.a);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + kij.a(this.a);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.c + ", constraints=" + ((Object) kil.e(this.a)) + ')';
    }
}
