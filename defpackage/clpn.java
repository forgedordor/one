package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clpn extends fcyz implements fdat {
    final /* synthetic */ clpo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clpn(clpo clpoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = clpoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clpn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean zB = eicg.b(u());
        clpo clpoVar = this.a;
        if (!zB) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        eieu eieuVarH = eiiy.h("TelephonySatelliteReporter#reportNtnSmsSupport");
        try {
            ekrw ekrwVarH = clpo.a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/telephony/TelephonySatelliteReporter$reportNtnSmsSupport$1", "invokeSuspend", 65, "TelephonySatelliteReporterImpl.kt")).q("Reporting to Telephony: SMS supported = true");
            clpoVar.b.e();
            fczl.a(eieuVarH, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new clpn(this.a, fcxyVar);
    }
}
