package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkph implements dkpi {
    public final fdat a;
    private final Boolean b;
    private final int c;

    public /* synthetic */ dkph(fdat fdatVar, int i, int i2) {
        if ((i2 & 4) == 0 && i == 0) {
            throw null;
        }
        this.b = null;
        this.a = fdatVar;
        this.c = 1;
    }

    @Override // defpackage.dkpi
    public final Boolean a() {
        return null;
    }

    @Override // defpackage.dkpi
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkph)) {
            return false;
        }
        dkph dkphVar = (dkph) obj;
        Boolean bool = dkphVar.b;
        if (!fdbq.f(null, null) || !fdbq.f(this.a, dkphVar.a)) {
            return false;
        }
        int i = dkphVar.c;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1;
    }

    public final String toString() {
        return "Unassigned(forceClipToCircle=null, backgroundColor=" + this.a + ", monogramBadge=NONE)";
    }
}
