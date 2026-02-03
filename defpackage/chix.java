package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chix implements cgxk {
    public final aydh a;
    private final fcyh b;
    private final cgxm c;

    public chix(cmqj cmqjVar, aydh aydhVar, fcyh fcyhVar) {
        cmqjVar.getClass();
        aydhVar.getClass();
        fcyhVar.getClass();
        this.a = aydhVar;
        this.b = fcyhVar;
        this.c = new cgxm("SimpleSmsToTelephonyWriter");
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.c;
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chil chilVar;
        chil chilVar2 = (chil) obj;
        if (chilVar2 instanceof chif) {
            ekrw ekrwVarH = cgxj.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Interceptor.kt");
            cgxm cgxmVar = this.c;
            int i = fdcj.a;
            ekrdVar.D("Running Interceptor %s. Subject is expected type %s", cgxmVar.a, new fdbi(chif.class).c());
            chilVar = chilVar2;
        } else {
            ekrw ekrwVarH2 = cgxj.a.h();
            ekrwVarH2.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 110, "Interceptor.kt");
            cgxm cgxmVar2 = this.c;
            int i2 = fdcj.a;
            ekrdVar2.I("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cgxmVar2.a, new fdbi(chif.class).c(), new fdbi(chilVar2.getClass()).c());
            chilVar = null;
        }
        chif chifVar = (chif) chilVar;
        return chifVar == null ? chilVar2 : chifVar.f.d ? chifVar : eicj.a(this.b, new chiw(this, chifVar, null), fcxyVar);
    }
}
