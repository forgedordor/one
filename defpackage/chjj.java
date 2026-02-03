package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chjj implements cgxk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/pipeline/sms/receive/SmsToBugleDbWriter");
    public final aydh b;
    public final fcsu c;
    private final fcyh d;
    private final cgxm e;

    public chjj(cmqj cmqjVar, aydh aydhVar, fcsu fcsuVar, fcyh fcyhVar) {
        cmqjVar.getClass();
        aydhVar.getClass();
        fcsuVar.getClass();
        fcyhVar.getClass();
        this.b = aydhVar;
        this.c = fcsuVar;
        this.d = fcyhVar;
        this.e = new cgxm("SmsToBugleDbWriter");
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.e;
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chil chilVar;
        chil chilVar2 = (chil) obj;
        if (chilVar2 instanceof chif) {
            ekrw ekrwVarH = cgxj.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Interceptor.kt");
            cgxm cgxmVar = this.e;
            int i = fdcj.a;
            ekrdVar.D("Running Interceptor %s. Subject is expected type %s", cgxmVar.a, new fdbi(chif.class).c());
            chilVar = chilVar2;
        } else {
            ekrw ekrwVarH2 = cgxj.a.h();
            ekrwVarH2.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 110, "Interceptor.kt");
            cgxm cgxmVar2 = this.e;
            int i2 = fdcj.a;
            ekrdVar2.I("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cgxmVar2.a, new fdbi(chif.class).c(), new fdbi(chilVar2.getClass()).c());
            chilVar = null;
        }
        chif chifVar = (chif) chilVar;
        return chifVar == null ? chilVar2 : chifVar.f.c ? chifVar : eicj.a(this.d, new chji(this, chifVar, null), fcxyVar);
    }
}
