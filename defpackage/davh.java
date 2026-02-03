package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class davh extends fcyz implements fdat {
    final /* synthetic */ davn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public davh(davn davnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = davnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((davh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        davn davnVar = this.a;
        ((ains) davnVar.b.b()).c("Bugle.Welcome.V1.Screen.EditPhoto");
        ailn ailnVarA = ((aimb) davnVar.c.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.BUGLE_WELCOME_V1_EVENT, ellgVar);
        enma enmaVar = (enma) enmb.a.createBuilder();
        enmaVar.getClass();
        enme enmeVar = (enme) enmf.a.createBuilder();
        enmeVar.getClass();
        evsn evsnVarBuild = enmeVar.build();
        evsnVarBuild.getClass();
        enmaVar.copyOnWrite();
        enmb enmbVar = (enmb) enmaVar.instance;
        enmbVar.c = (enmf) evsnVarBuild;
        enmbVar.b = 4;
        elgr.m(enmo.a(enmaVar), ellgVar);
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_BUGLE_WELCOME_V1_EVENT);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new davh(this.a, fcxyVar);
    }
}
