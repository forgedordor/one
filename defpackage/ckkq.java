package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckkq extends fcyz implements fdat {
    final /* synthetic */ ckkr a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckkq(ckkr ckkrVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ckkrVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckkq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean zBooleanValue = ((Boolean) dfpi.t().a.au.a()).booleanValue();
        ckkr ckkrVar = this.a;
        String str = this.b;
        if (zBooleanValue) {
            ((ekrd) ckkr.a.h().h("com/google/android/apps/messaging/shared/rcsprovisioning/tychogrpc/FiMultiSyncGrpcSchedulerImpl", "scheduleWork", 39, "FiMultiSyncGrpcSchedulerImpl.kt")).q("Cancelling existing FiMultiSyncGrpc work, if any, before scheduling new work.");
            ((cazj) ((ckkp) ckkrVar.b.b()).a.b()).h(Integer.toString(str.hashCode()));
        }
        ckkp ckkpVar = (ckkp) ckkrVar.b.b();
        ckkn ckknVar = (ckkn) ckko.a.createBuilder();
        ckknVar.copyOnWrite();
        ckko ckkoVar = (ckko) ckknVar.instance;
        ckkoVar.b |= 1;
        ckkoVar.c = str;
        ckko ckkoVar2 = (ckko) ckknVar.build();
        caxr caxrVar = new caxr();
        caxrVar.d = Integer.toString(str.hashCode());
        ((cazj) ckkpVar.a.b()).a(cbcu.g("fi_multi_sync_grpc", ckkoVar2, caxrVar.a()));
        ckkx ckkxVar = (ckkx) ckkrVar.c.b();
        eoby eobyVar = (eoby) eobz.a.createBuilder();
        eobyVar.getClass();
        eocj eocjVar = (eocj) eock.a.createBuilder();
        eocjVar.getClass();
        evsn evsnVarBuild = eocjVar.build();
        evsnVarBuild.getClass();
        eobyVar.copyOnWrite();
        eobz eobzVar = (eobz) eobyVar.instance;
        eobzVar.c = (eock) evsnVarBuild;
        eobzVar.b = 1;
        ckkxVar.a(eoca.a(eobyVar), str);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckkq(this.a, this.b, fcxyVar);
    }
}
