package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chie implements cgxk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/pipeline/sms/receive/RawSmsExtractor");
    private final alrj b;
    private final fcsu c;
    private final cogw d;
    private final cgxm e;

    public chie(alrj alrjVar, fcsu fcsuVar, cogw cogwVar) {
        alrjVar.getClass();
        fcsuVar.getClass();
        cogwVar.getClass();
        this.b = alrjVar;
        this.c = fcsuVar;
        this.d = cogwVar;
        this.e = new cgxm("RawSmsExtractor");
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.chij r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chie.b(chij, fcxy):java.lang.Object");
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        Object obj2;
        Object obj3 = (chil) obj;
        if (obj3 instanceof chij) {
            ekrw ekrwVarH = cgxj.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Interceptor.kt");
            cgxm cgxmVar = this.e;
            int i = fdcj.a;
            ekrdVar.D("Running Interceptor %s. Subject is expected type %s", cgxmVar.a, new fdbi(chij.class).c());
            obj2 = obj3;
        } else {
            ekrw ekrwVarH2 = cgxj.a.h();
            ekrwVarH2.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 110, "Interceptor.kt");
            cgxm cgxmVar2 = this.e;
            int i2 = fdcj.a;
            ekrdVar2.I("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cgxmVar2.a, new fdbi(chij.class).c(), new fdbi(obj3.getClass()).c());
            obj2 = null;
        }
        chij chijVar = (chij) obj2;
        return chijVar == null ? obj3 : b(chijVar, fcxyVar);
    }
}
