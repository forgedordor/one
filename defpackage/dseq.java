package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dseq implements dsea {
    private final dsbr a;

    public dseq(dsbr dsbrVar) {
        this.a = dsbrVar;
    }

    @Override // defpackage.dsea
    public final dsdz a() {
        return dsdz.MINOR_FILTER;
    }

    @Override // defpackage.ejug
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        dsec dsecVar = (dsec) obj2;
        if (!fbby.a.get().c()) {
            return true;
        }
        this.a.c(dsecVar.a(), "Promotion blocked: Minor account on device", new Object[0]);
        return false;
    }
}
