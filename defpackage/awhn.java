package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awhn extends awhp {
    private final ekgp a;
    private final boolean b;

    public awhn(ekgp ekgpVar, boolean z) {
        this.a = ekgpVar;
        this.b = z;
    }

    @Override // defpackage.awhp
    public final ekgp b() {
        return this.a;
    }

    @Override // defpackage.awhp
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awhp) {
            awhp awhpVar = (awhp) obj;
            if (ekmi.m(this.a, awhpVar.b()) && this.b == awhpVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "RcsCapabilities{capabilities=" + ekmi.g(this.a) + ", isValid=" + this.b + "}";
    }
}
