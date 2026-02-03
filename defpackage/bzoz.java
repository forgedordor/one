package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzoz extends fcyz implements fdat {
    final /* synthetic */ bzpg a;
    final /* synthetic */ cand b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzoz(fcxy fcxyVar, bzpg bzpgVar, cand candVar, boolean z, boolean z2, int i) {
        super(2, fcxyVar);
        this.a = bzpgVar;
        this.b = candVar;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzoz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cand candVar = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        cazj cazjVar = this.a.h;
        int i = this.e;
        cazjVar.a(bzpg.i(candVar, z, z2, canc.a(i)));
        ekrw ekrwVarH = bzpg.a.h();
        ekrwVarH.X(eksq.a, "BugleCmsMediaRestore");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreDelegateImpl$enqueueLogMediaDownloadStage$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 326, "CmsLocalMediaRestoreDelegateImpl.kt")).I("Queued request to log %s event for media download metrics, requireWifi=%s requireBatteryNotLow=%s", canc.a(i), Boolean.valueOf(z), Boolean.valueOf(z2));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzoz bzozVar = new bzoz(fcxyVar, this.a, this.b, this.c, this.d, this.e);
        bzozVar.f = obj;
        return bzozVar;
    }
}
