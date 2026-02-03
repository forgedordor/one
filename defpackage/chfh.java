package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chfh implements cgxk {
    private final cgxm a = new cgxm("MessageStatusToResultInterceptor");

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.a;
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chfs chfsVar;
        chfs chfsVar2 = (chfs) obj;
        if (chfsVar2 instanceof chfp) {
            ekrw ekrwVarH = cgxj.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Interceptor.kt");
            cgxm cgxmVar = this.a;
            int i = fdcj.a;
            ekrdVar.D("Running Interceptor %s. Subject is expected type %s", cgxmVar.a, new fdbi(chfp.class).c());
            chfsVar = chfsVar2;
        } else {
            ekrw ekrwVarH2 = cgxj.a.h();
            ekrwVarH2.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 110, "Interceptor.kt");
            cgxm cgxmVar2 = this.a;
            int i2 = fdcj.a;
            ekrdVar2.I("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cgxmVar2.a, new fdbi(chfp.class).c(), new fdbi(chfsVar2.getClass()).c());
            chfsVar = null;
        }
        chfp chfpVar = (chfp) chfsVar;
        if (chfpVar == null) {
            return chfsVar2;
        }
        int i3 = ((chuf) chfpVar.b).a;
        int i4 = 1;
        if (i3 != -1 && i3 != 0) {
            i4 = i3 != 1 ? 3 : 2;
        }
        return new chfq(chfpVar.a, i4, i3);
    }
}
