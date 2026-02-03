package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adcc extends fcyz implements fdat {
    final /* synthetic */ adcg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adcc(adcg adcgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = adcgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adcc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        adcg adcgVar = this.a;
        adcgVar.g.compareAndSet(false, true);
        ekrw ekrwVarH = adcg.a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/home/satellite/SatelliteManualConnectionBanner$onSuccessCallback$1", "invokeSuspend", 116, "SatelliteManualConnectionBanner.kt")).q("SatelliteManualConnectionBanner dismissed");
        ((egzh) adcgVar.f.b()).a(eijx.e(null), acto.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adcc(this.a, fcxyVar);
    }
}
