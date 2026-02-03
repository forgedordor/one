package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chht implements cgxk {
    public final Optional a;
    public final Context b;
    private final fcyh c;
    private final cgxm d;

    public chht(Optional optional, Context context, fcyh fcyhVar) {
        context.getClass();
        fcyhVar.getClass();
        this.a = optional;
        this.b = context;
        this.c = fcyhVar;
        this.d = new cgxm("ClassZeroInterceptor");
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.d;
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chil chilVar;
        chil chilVar2 = (chil) obj;
        if (chilVar2 instanceof chif) {
            ekrw ekrwVarH = cgxj.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Interceptor.kt");
            cgxm cgxmVar = this.d;
            int i = fdcj.a;
            ekrdVar.D("Running Interceptor %s. Subject is expected type %s", cgxmVar.a, new fdbi(chif.class).c());
            chilVar = chilVar2;
        } else {
            ekrw ekrwVarH2 = cgxj.a.h();
            ekrwVarH2.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 110, "Interceptor.kt");
            cgxm cgxmVar2 = this.d;
            int i2 = fdcj.a;
            ekrdVar2.I("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cgxmVar2.a, new fdbi(chif.class).c(), new fdbi(chilVar2.getClass()).c());
            chilVar = null;
        }
        chif chifVar = (chif) chilVar;
        return chifVar == null ? chilVar2 : chifVar.d.f != 2 ? chifVar : eicj.a(this.c, new chhs(this, chifVar, null), fcxyVar);
    }
}
