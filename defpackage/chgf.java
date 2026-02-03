package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chgf implements cgxk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/pipeline/rcs/send/UnhandledRequestToErrorInterceptor");
    private final cgxm b = new cgxm("UnhandledRequestToErrorInterceptor");

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.b;
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chfs chfsVar;
        chfs chfsVar2 = (chfs) obj;
        if (chfsVar2 instanceof chfr) {
            ekrw ekrwVarH = cgxj.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Interceptor.kt");
            cgxm cgxmVar = this.b;
            int i = fdcj.a;
            ekrdVar.D("Running Interceptor %s. Subject is expected type %s", cgxmVar.a, new fdbi(chfr.class).c());
            chfsVar = chfsVar2;
        } else {
            ekrw ekrwVarH2 = cgxj.a.h();
            ekrwVarH2.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 110, "Interceptor.kt");
            cgxm cgxmVar2 = this.b;
            int i2 = fdcj.a;
            ekrdVar2.I("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cgxmVar2.a, new fdbi(chfr.class).c(), new fdbi(chfsVar2.getClass()).c());
            chfsVar = null;
        }
        chfr chfrVar = (chfr) chfsVar;
        if (chfrVar == null) {
            return chfsVar2;
        }
        ((ekrd) a.j().h("com/google/android/apps/messaging/shared/pipeline/rcs/send/UnhandledRequestToErrorInterceptor", "execute", 26, "UnhandledRequestToErrorInterceptor.kt")).q("Message send failed because no configured interceptor transformed the Request to a PipelineResult.");
        return new chfq(chfrVar.a, 3, 3);
    }
}
