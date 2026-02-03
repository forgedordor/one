package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqgr extends eqey {
    private final eqef a;

    public eqgr(eqef eqefVar) {
        this.a = eqefVar;
    }

    @Override // defpackage.eqey
    public final eqdz f() {
        if (eqef.b == this.a) {
            return eqdz.b;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // defpackage.eqey
    public final eqdz g() {
        if (eqef.c == this.a) {
            return eqdz.b;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // defpackage.eqey
    public final fell h() {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            return fell.UNRECOGNIZED;
        }
        if (iOrdinal == 1) {
            return fell.DEFAULT_ROLE;
        }
        if (iOrdinal == 2) {
            return fell.REGULAR;
        }
        throw new fctg();
    }
}
