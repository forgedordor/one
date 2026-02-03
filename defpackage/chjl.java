package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chjl implements cgxk {
    public final cmqj a;
    public final aydh b;
    public final Context c;
    private final fcyh d;
    private final cgxm e;

    public chjl(cmqj cmqjVar, aydh aydhVar, fcyh fcyhVar, Context context) {
        cmqjVar.getClass();
        aydhVar.getClass();
        fcyhVar.getClass();
        context.getClass();
        this.a = cmqjVar;
        this.b = aydhVar;
        this.d = fcyhVar;
        this.c = context;
        this.e = new cgxm("SmsToTelephonyWriter");
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.e;
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chil chilVar;
        chil chilVar2 = (chil) obj;
        if (chilVar2 instanceof chik) {
            ekrw ekrwVarH = cgxj.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Interceptor.kt");
            cgxm cgxmVar = this.e;
            int i = fdcj.a;
            ekrdVar.D("Running Interceptor %s. Subject is expected type %s", cgxmVar.a, new fdbi(chik.class).c());
            chilVar = chilVar2;
        } else {
            ekrw ekrwVarH2 = cgxj.a.h();
            ekrwVarH2.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 110, "Interceptor.kt");
            cgxm cgxmVar2 = this.e;
            int i2 = fdcj.a;
            ekrdVar2.I("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cgxmVar2.a, new fdbi(chik.class).c(), new fdbi(chilVar2.getClass()).c());
            chilVar = null;
        }
        chik chikVar = (chik) chilVar;
        return chikVar == null ? chilVar2 : eicj.a(this.d, new chjk(this, chikVar, null), fcxyVar);
    }
}
