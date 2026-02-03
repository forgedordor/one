package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozx {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public cozx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
    }

    public final Map a() throws IOException {
        fcxe fcxeVar = new fcxe();
        eieu eieuVarH = eiiy.h("SimRegistrationInfoProvider#get#buildMap");
        try {
            Set<dggn> setP = ((dggw) this.b.b()).p();
            setP.getClass();
            ArrayList<dggp> arrayList = new ArrayList(fcva.p(setP, 10));
            for (dggn dggnVar : setP) {
                dggnVar.getClass();
                arrayList.add(dggo.a(dggnVar));
            }
            ekrg ekrgVar = a;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "BugleTransport");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider", "getSimIdToRegistrationInfo$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_transport_sim_registration_info_provider_AUTO_DEPS_ORIGINAL", 40, "SimRegistrationInfoProvider.kt");
            ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(cqcv.b(((dggp) it.next()).a));
            }
            ekrdVar.t("Retrieved RCS available simIds: %s", arrayList2);
            if (!((apwv) this.e.b()).a() && arrayList.size() > 1) {
                throw new IllegalStateException("More than one SIM available for RCS even though enableMultiSimRcs is false.");
            }
            for (dggp dggpVar : arrayList) {
                dgiq dgiqVar = (dgiq) fdct.b(((dggz) this.c.b()).h(dggpVar));
                if (dgiqVar == null) {
                    ekrw ekrwVarJ = ekrgVar.j();
                    ekrwVarJ.X(ekrzVar, "BugleTransport");
                    ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider", "getSimIdToRegistrationInfo$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_transport_sim_registration_info_provider_AUTO_DEPS_ORIGINAL", 55, "SimRegistrationInfoProvider.kt")).t("No configuration found for SIM with simId %s", cqcv.b(dggpVar.a));
                } else {
                    dggr dggrVarD = ((dghj) this.d.b()).d(dggpVar);
                    if (dggrVarD == null) {
                        ekrw ekrwVarJ2 = ekrgVar.j();
                        ekrwVarJ2.X(ekrzVar, "BugleTransport");
                        ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider", "getSimIdToRegistrationInfo$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_transport_sim_registration_info_provider_AUTO_DEPS_ORIGINAL", 68, "SimRegistrationInfoProvider.kt")).t("No subscription id found for SIM with simId %s", cqcv.b(dggpVar.a));
                    } else {
                        fcxeVar.put(dggpVar, new cozu(dgiqVar, dggrVarD.a));
                    }
                }
            }
            fczl.a(eieuVarH, null);
            return fcwa.b(fcxeVar);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }
}
