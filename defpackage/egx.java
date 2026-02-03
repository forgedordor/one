package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egx extends eff {
    private final ehc a;

    public egx(ehc ehcVar) {
        this.a = ehcVar;
    }

    @Override // defpackage.eff
    public final ehc e(ehc ehcVar) {
        return new egw(this.a, ehcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof egx) {
            return fdbq.f(((egx) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
