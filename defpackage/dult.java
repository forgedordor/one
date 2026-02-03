package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dult {
    private final ejxr a;

    public dult(final dtpi dtpiVar) {
        this.a = ejxx.a(new ejxr() { // from class: duls
            @Override // defpackage.ejxr
            public final Object get() {
                dtqh dtqhVarY = dtpiVar.y();
                return dtqhVarY == dtqh.UNDEFINED ? dtqh.SHARED_PREFERENCES_ONLY : dtqhVarY;
            }
        });
    }

    public final dtqh a() {
        return (dtqh) this.a.get();
    }
}
