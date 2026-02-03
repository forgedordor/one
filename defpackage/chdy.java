package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chdy implements cgxk {
    private final cgxm a = new cgxm("ReflectedTachygramMessageInterceptor");

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.a;
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chdq chdqVar;
        chdq chdqVar2 = (chdq) obj;
        if (chdqVar2 instanceof chdn) {
            ekrw ekrwVarH = cgxj.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Interceptor.kt");
            cgxm cgxmVar = this.a;
            int i = fdcj.a;
            ekrdVar.D("Running Interceptor %s. Subject is expected type %s", cgxmVar.a, new fdbi(chdn.class).c());
            chdqVar = chdqVar2;
        } else {
            ekrw ekrwVarH2 = cgxj.a.h();
            ekrwVarH2.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 110, "Interceptor.kt");
            cgxm cgxmVar2 = this.a;
            int i2 = fdcj.a;
            ekrdVar2.I("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cgxmVar2.a, new fdbi(chdn.class).c(), new fdbi(chdqVar2.getClass()).c());
            chdqVar = null;
        }
        chdn chdnVar = (chdn) chdqVar;
        if (chdnVar != null) {
            ezji ezjiVarB = ezji.b(chdnVar.a.d);
            if (ezjiVarB == null) {
                ezjiVarB = ezji.UNRECOGNIZED;
            }
            if (ezjiVarB != ezji.TACHYGRAM_MESSAGE) {
                throw new IllegalArgumentException("ReflectedTachygramMessageInterceptor should only be called for InboxMessages of type TACHYGRAM_MESSAGE.");
            }
        }
        return chdqVar2;
    }
}
