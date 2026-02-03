package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoax implements aoaq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl");
    public final Optional b;
    public final Optional c;
    public final fcsu d;
    public final fcsu e;
    public final aqcf f;
    private final fdjx g;

    public aoax(fdjx fdjxVar, Optional optional, Optional optional2, fcsu fcsuVar, fcsu fcsuVar2, aqcf aqcfVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.g = fdjxVar;
        this.b = optional;
        this.c = optional2;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = aqcfVar;
    }

    @Override // defpackage.aoaq
    public final eiju a(ekgb ekgbVar) {
        return auvw.i(this.g, new aoav(this, ekgbVar, null));
    }

    @Override // defpackage.aoaq
    public final eiju b(ekgb ekgbVar) {
        return auvw.i(this.g, new aoaw(this, ekgbVar, null));
    }

    @Override // defpackage.aoaq
    public final /* synthetic */ eiju c() {
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
