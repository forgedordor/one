package defpackage;

import android.util.Base64;
import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chgb implements cgxk {
    private final efnn a;
    private final cgxm b = new cgxm("SerializeProtoInterceptor");

    public chgb(efnn efnnVar) {
        this.a = efnnVar;
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.b;
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chfs chfsVar;
        Object next;
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
        chft chftVar = chfrVar.a;
        chfg chfgVar = chftVar.e;
        if (chfgVar instanceof chfd) {
            chem chemVar = chfrVar.b;
            if (chemVar.a == null) {
                efnn efnnVar = this.a;
                chfd chfdVar = (chfd) chfgVar;
                evuh evuhVar = chfdVar.a;
                fddy fddyVar = chfdVar.b;
                Iterator it = efnnVar.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (fdbq.f(((efol) next).a, fdab.a(fddyVar))) {
                        break;
                    }
                }
                efol efolVar = (efol) next;
                if (efolVar == null) {
                    throw new IllegalArgumentException(a.h(fddyVar, "Unknown proto: ", ", please register it."));
                }
                efmx efmxVar = new efmx();
                efmxVar.c(efolVar.b);
                efmxVar.b(evqs.x(Base64.encode(evuhVar.toByteArray(), efnnVar.a())));
                return new chfr(chftVar, chem.a(chemVar, efmxVar.a(), null, null, 6));
            }
        }
        return chfrVar;
    }
}
