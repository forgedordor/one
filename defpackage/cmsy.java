package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmsy extends fcyz implements fdat {
    final /* synthetic */ cmsz a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmsy(cmsz cmszVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cmszVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmsy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.BUGLE_MESSAGE, ellgVar);
        elof elofVar = (elof) elpg.b.createBuilder();
        elofVar.getClass();
        elhf.d(this.b, elofVar);
        elhf.i(2, elofVar);
        elhf.h(32, elofVar);
        elgr.d(elhf.a(elofVar), ellgVar);
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        ((aimb) this.a.a.b()).a().j((ellg) builder, aioj.LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmsy(this.a, this.b, fcxyVar);
    }
}
