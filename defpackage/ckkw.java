package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckkw extends fcyz implements fdat {
    final /* synthetic */ ckkx a;
    final /* synthetic */ eobz b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckkw(ckkx ckkxVar, eobz eobzVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ckkxVar;
        this.b = eobzVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckkw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ckkx ckkxVar = this.a;
        ailn ailnVarA = ((aimb) ckkxVar.b.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.TYCHO_GRPC_EVENT, ellgVar);
        eobw eobwVar = (eobw) eobx.a.createBuilder();
        eobwVar.getClass();
        eobwVar.copyOnWrite();
        eobx eobxVar = (eobx) eobwVar.instance;
        eobxVar.d = this.b;
        eobxVar.c = 2;
        enpl enplVarB = ((dexw) ckkxVar.a.b()).b(new dggp(this.c));
        enplVarB.getClass();
        eobwVar.copyOnWrite();
        eobx eobxVar2 = (eobx) eobwVar.instance;
        eobxVar2.e = enplVarB;
        eobxVar2.b |= 1;
        evsn evsnVarBuild = eobwVar.build();
        evsnVarBuild.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.cs = (eobx) evsnVarBuild;
        ellhVar.h |= 536870912;
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_TYCHO_GRPC_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckkw(this.a, this.b, this.c, fcxyVar);
    }
}
