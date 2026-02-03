package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class davl extends fcyz implements fdat {
    final /* synthetic */ davn a;
    final /* synthetic */ ctcj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public davl(davn davnVar, ctcj ctcjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = davnVar;
        this.b = ctcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((davl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        davn davnVar = this.a;
        ains ainsVar = (ains) davnVar.b.b();
        ctcj ctcjVar = this.b;
        ainsVar.e("Bugle.Welcome.V1.Screen.Completed", davn.b(ctcjVar));
        ailn ailnVarA = ((aimb) davnVar.c.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.BUGLE_WELCOME_V1_EVENT, ellgVar);
        enma enmaVar = (enma) enmb.a.createBuilder();
        enmaVar.getClass();
        enmk enmkVar = (enmk) enml.a.createBuilder();
        enmkVar.getClass();
        enmkVar.copyOnWrite();
        enml enmlVar = (enml) enmkVar.instance;
        enmlVar.c = ctcjVar.g;
        enmlVar.b |= 1;
        evsn evsnVarBuild = enmkVar.build();
        evsnVarBuild.getClass();
        enmaVar.copyOnWrite();
        enmb enmbVar = (enmb) enmaVar.instance;
        enmbVar.c = (enml) evsnVarBuild;
        enmbVar.b = 2;
        elgr.m(enmo.a(enmaVar), ellgVar);
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_BUGLE_WELCOME_V1_EVENT);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new davl(this.a, this.b, fcxyVar);
    }
}
