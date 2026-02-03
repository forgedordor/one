package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkgn {
    private final boolean a;
    private final hox b;
    private final hox c;

    public dkgn(boolean z, hox hoxVar, hox hoxVar2) {
        hoxVar.getClass();
        hoxVar2.getClass();
        this.a = z;
        this.b = hoxVar;
        this.c = hoxVar2;
    }

    public final void a() {
        this.c.b(Boolean.valueOf(!((Boolean) r0.a()).booleanValue()));
        this.b.b(true);
    }

    public final boolean b() {
        if (((Boolean) this.c.a()).booleanValue()) {
            return ((Boolean) this.b.a()).booleanValue() || this.a;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkgn)) {
            return false;
        }
        dkgn dkgnVar = (dkgn) obj;
        return this.a == dkgnVar.a && fdbq.f(this.b, dkgnVar.b) && fdbq.f(this.c, dkgnVar.c);
    }

    public final int hashCode() {
        return ((((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BottomMetatextState(showByDefault=" + this.a + ", userInteracted=" + this.b + ", isShowing=" + this.c + ")";
    }
}
