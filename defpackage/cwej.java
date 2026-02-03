package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwej extends fcyz implements fdat {
    final /* synthetic */ cwek a;
    final /* synthetic */ cwdf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwej(cwek cwekVar, cwdf cwdfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cwekVar;
        this.b = cwdfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwej) c((cwen) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cwek cwekVar = this.a;
        cwdc cwdcVar = cwekVar.e;
        auyh auyhVar = new auyh("visibility", cwdcVar.c);
        auyh auyhVar2 = new auyh("avatarPosition", cwdcVar.d);
        cwbt cwbtVar = (cwbt) cwekVar.b.b();
        cwdf cwdfVar = this.b;
        return avac.e(auyhVar, auyhVar2, auyk.b(cwbtVar.a(new cwbs(cwdfVar.a)), "actionsUiData"), auyk.b(((cwcp) cwekVar.c.b()).a(), "avatarUiData"), auyk.a(cwekVar.d, "photoSelectorUiData"), cwekVar.a, new cwei(cwdfVar, cwekVar, null));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwej(this.a, this.b, fcxyVar);
    }
}
