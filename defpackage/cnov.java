package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnov implements cnxx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/telephony/TelephonySyncPauseLatch");
    public final fcsu b;
    public final cogw c;
    public final cmfo d;
    private final fdjx e;
    private final fcsu f;

    public cnov(fdjx fdjxVar, fcsu fcsuVar, cogw cogwVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        cogwVar.getClass();
        fcsuVar2.getClass();
        this.e = fdjxVar;
        this.b = fcsuVar;
        this.c = cogwVar;
        this.f = fcsuVar2;
        cmgk cmgkVar = (cmgk) fcsuVar2.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.REVERSE_TELEPHONY_SYNC_STATE);
        cmggVarC.f(cnoh.a);
        this.d = cmgkVar.a(cmggVarC.a());
    }

    @Override // defpackage.cnxx
    public final Object a(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e.hE()), new cnou(null, this), fcxyVar);
    }
}
