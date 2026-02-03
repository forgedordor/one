package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chgm implements cgxk {
    private final fcsu a;
    private final fcsu b;
    private final cgxm c;

    public chgm(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = new cgxm("PreSendMetricsInterceptor");
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.c;
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chhb chhbVar;
        chhb chhbVar2 = (chhb) obj;
        if (chhbVar2 instanceof chgz) {
            ekrw ekrwVarH = cgxj.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Interceptor.kt");
            cgxm cgxmVar = this.c;
            int i = fdcj.a;
            ekrdVar.D("Running Interceptor %s. Subject is expected type %s", cgxmVar.a, new fdbi(chgz.class).c());
            chhbVar = chhbVar2;
        } else {
            ekrw ekrwVarH2 = cgxj.a.h();
            ekrwVarH2.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 110, "Interceptor.kt");
            cgxm cgxmVar2 = this.c;
            int i2 = fdcj.a;
            ekrdVar2.I("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cgxmVar2.a, new fdbi(chgz.class).c(), new fdbi(chhbVar2.getClass()).c());
            chhbVar = null;
        }
        chgz chgzVar = (chgz) chhbVar;
        if (chgzVar == null) {
            return chhbVar2;
        }
        chgt chgtVar = chgzVar.a;
        if (chgtVar.h == auhk.DELIVERY) {
            ((asrx) this.a.b()).a(chgtVar.g, chgtVar.i);
        }
        ((cmxn) this.b.b()).c(chgtVar.g.f(), chgtVar.a.c);
        return chgzVar;
    }
}
