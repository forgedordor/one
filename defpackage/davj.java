package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class davj extends fcyz implements fdat {
    final /* synthetic */ davn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public davj(davn davnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = davnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((davj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        davn davnVar = this.a;
        ((ains) davnVar.b.b()).e("Bugle.Welcome.V1.Reachability.Result", 3);
        ailn ailnVarA = ((aimb) davnVar.c.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.BUGLE_WELCOME_V1_EVENT, ellgVar);
        enma enmaVar = (enma) enmb.a.createBuilder();
        enmaVar.getClass();
        enmg enmgVar = (enmg) enmh.a.createBuilder();
        enmgVar.getClass();
        enyx.b(5, enmgVar);
        enmo.b(enyx.a(enmgVar), enmaVar);
        elgr.m(enmo.a(enmaVar), ellgVar);
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_BUGLE_WELCOME_V1_EVENT);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new davj(this.a, fcxyVar);
    }
}
