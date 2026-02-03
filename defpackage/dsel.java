package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsel implements dsea {
    private final dsbr a;

    public dsel(dsbr dsbrVar) {
        this.a = dsbrVar;
    }

    @Override // defpackage.dsea
    public final dsdz a() {
        return dsdz.DISPLAY_WITHOUT_NEW_SYNC;
    }

    @Override // defpackage.ejug
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        etom etomVar = (etom) obj;
        dsec dsecVar = (dsec) obj2;
        if (!dsecVar.c()) {
            return true;
        }
        boolean z = (etomVar.b & 32) != 0 ? etomVar.g : false;
        if (z) {
            return z;
        }
        this.a.c(dsecVar.a(), "Promotion needs sync to display.", new Object[0]);
        return false;
    }
}
