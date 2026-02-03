package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acaa implements abzv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever");
    public final fcyh b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fdjx f;
    private final fcsu g;

    public acaa(fcyh fcyhVar, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = fcyhVar;
        this.f = fdjxVar;
        this.c = fcsuVar;
        this.g = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
    }

    @Override // defpackage.abzv
    public final eiju a(efwo efwoVar, String str) throws IOException {
        efwoVar.getClass();
        eieu eieuVarH = eiiy.h("GmsGaiaCapabilityRetriever#hasCapability");
        try {
            eiju eijuVarC = auvw.c(this.f, fcyi.a, fdjz.a, new abzw(this, efwoVar, str, null));
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    @Override // defpackage.abzv
    public final eiju b(egbe egbeVar, String str) throws IOException {
        egbeVar.getClass();
        eieu eieuVarH = eiiy.h("GmsGaiaCapabilityRetriever#hasCapabilityAccount");
        try {
            eiju eijuVarC = auvw.c(this.f, fcyi.a, fdjz.a, new abzx(this, egbeVar, str, null));
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    public final Object c(egbe egbeVar, String str, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.b), new abzy(null, egbeVar, this, str), fcxyVar);
    }

    public final void d(int i) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleGaia");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever", "logCounter", 195, "GmsGaiaCapabilityRetriever.kt")).r("Gaia capability response result_code=%d", i);
        ((ains) this.g.b()).e("Bugle.Gaia.Capability.ResponseResult", i);
    }
}
