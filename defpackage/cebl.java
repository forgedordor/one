package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cebl implements cebq {
    private static final ekrg e = ekrg.c("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever");
    public final fcsu a;
    private final eosc f;
    private final ConcurrentHashMap g = new ConcurrentHashMap();
    private final HashSet h = new HashSet();

    public cebl(fcsu fcsuVar, eosc eoscVar) {
        this.a = fcsuVar;
        this.f = eoscVar;
    }

    private final synchronized boolean j(String str) {
        return this.h.add(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.cebq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ekgp a(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cebl.a(java.lang.String):ekgp");
    }

    @Override // defpackage.cebq
    public final ekgp b(String str) {
        ettc ettcVarD = d(str);
        int i = cebo.a;
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("upi_policy_id", ettcVarD.b);
        return ekgiVar.c();
    }

    @Override // defpackage.cebq
    public final etsz c(String str) {
        if (str.isEmpty()) {
            ekrw ekrwVarJ = e.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.Z(eksk.FULL);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getRcsOnboardingFlags", 88, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: simId is missing, return default rcs onboarding flags.");
            return b;
        }
        Optional map = f(cebg.c(str, etsf.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS)).map(new Function() { // from class: cebi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etsc etscVar = (etsc) obj;
                return etscVar.c == 3 ? (etsz) etscVar.d : etsz.c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        etsz etszVar = b;
        etsz etszVar2 = (etsz) map.orElse(etszVar);
        if (etszVar2.equals(etszVar)) {
            ekrw ekrwVarH = e.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ekrd ekrdVar2 = (ekrd) ekrwVarH;
            ekrdVar2.Z(eksk.MEDIUM);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getRcsOnboardingFlags", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Cannot retrieve rcs onboarding flags in configuration right now, return default flags instead.");
        }
        return etszVar2;
    }

    @Override // defpackage.cebq
    public final ettc d(String str) {
        return str.isEmpty() ? c : (ettc) f(cebg.c(str, etsf.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS)).map(new Function() { // from class: cebj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etsc etscVar = (etsc) obj;
                return etscVar.c == 5 ? (ettc) etscVar.d : ettc.a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(c);
    }

    @Override // defpackage.cebq
    public final ettk e() {
        etsf etsfVar = etsf.CONFIGURATION_TYPE_RENUMBERINGS_CONFIGURATION_WITH_VERSION;
        return (ettk) f(cebg.c(etsfVar.name(), etsfVar)).map(new Function() { // from class: cebk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etsc etscVar = (etsc) obj;
                return etscVar.c == 6 ? (ettk) etscVar.d : ettk.a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(d);
    }

    @Override // defpackage.cebq
    public final Optional f(cebg cebgVar) {
        final String strD = cebgVar.d();
        fcsu fcsuVar = this.a;
        if (((Optional) fcsuVar.b()).isEmpty()) {
            ekrw ekrwVarJ = e.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 148, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Could not access MobileConfigurationApi");
            return Optional.empty();
        }
        ConcurrentHashMap concurrentHashMap = this.g;
        if (!concurrentHashMap.containsKey(strD)) {
            if (ecem.g()) {
                if (j(strD)) {
                    eijx.f(new Runnable() { // from class: cebh
                        @Override // java.lang.Runnable
                        public final void run() {
                            cebl ceblVar = this.a;
                            diff diffVar = (diff) ((Optional) ceblVar.a.b()).get();
                            String str = strD;
                            Optional optionalA = diffVar.a(str);
                            if (optionalA.isPresent()) {
                                ceblVar.i(str, (etsc) optionalA.get());
                            }
                            ceblVar.h(str);
                        }
                    }, this.f).k(auvh.b(), eoqg.a);
                }
            } else if (j(strD)) {
                Optional optionalA = ((diff) ((Optional) fcsuVar.b()).get()).a(strD);
                if (optionalA.isPresent()) {
                    i(strD, (etsc) optionalA.get());
                } else {
                    ekrw ekrwVarJ2 = e.j();
                    ekrwVarJ2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 187, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Cannot find configuration from the current mobileConfigurationDataId");
                }
                h(strD);
            } else {
                ekrw ekrwVarJ3 = e.j();
                ekrwVarJ3.X(eksq.a, "Bugle");
                ekrd ekrdVar = (ekrd) ekrwVarJ3;
                ekrdVar.Z(eksk.FULL);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 193, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Cannot access SSOT for the same mobileConfigurationDataId that currrently being accessed by another thread");
            }
        }
        if (concurrentHashMap.containsKey(strD)) {
            return Optional.ofNullable((etsc) concurrentHashMap.get(strD));
        }
        if (ecem.g()) {
            ekrw ekrwVarJ4 = e.j();
            ekrwVarJ4.X(eksq.a, "Bugle");
            ekrd ekrdVar2 = (ekrd) ekrwVarJ4;
            ekrdVar2.Z(eksk.FULL);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 206, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: config is not cached when running on main thread.");
        } else {
            ekrw ekrwVarJ5 = e.j();
            ekrwVarJ5.X(eksq.a, "Bugle");
            ekrd ekrdVar3 = (ekrd) ekrwVarJ5;
            ekrdVar3.Z(eksk.FULL);
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 209, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: config is not cached when running on background thread.");
        }
        return Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cebq
    public final void g(ekgb ekgbVar) {
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) ekgbVar.get(i);
            ConcurrentHashMap concurrentHashMap = this.g;
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
            } else {
                ekrw ekrwVarI = e.i();
                ekrwVarI.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "removeFromConfigurationCache", 69, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: The mobileConfigurationDataId cannot be removed as it is not present in the configurationCache");
            }
        }
        ekrw ekrwVarE = e.e();
        ekrwVarE.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "invalidateCache", 80, "MobileConfigurationRetriever.java")).t("MobileConfigurationRetriever: Invalidating the configurationCache for updated IDs : %s", ekgbVar);
    }

    public final synchronized void h(String str) {
        if (this.h.remove(str)) {
            return;
        }
        ekrw ekrwVarI = e.i();
        ekrwVarI.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "removeFromSynchronizationHashSet", 232, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: The mobileConfigurationDataId was not present in the object used for synchronization");
    }

    public final void i(String str, etsc etscVar) {
        this.g.put(str, etscVar);
    }
}
