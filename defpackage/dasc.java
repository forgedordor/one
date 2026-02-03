package defpackage;

import j$.time.Duration;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dasc implements ctbx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl");
    public static final cczv b = cdag.f(cdag.b, "is_wearable_installed_cache_seconds", 15);
    public final fcsu c;
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();

    public dasc(fcsu fcsuVar) {
        this.c = fcsuVar;
    }

    private static Boolean c(AtomicReference atomicReference, final fcsu fcsuVar) {
        return (Boolean) ((ejxr) DesugarAtomicReference.updateAndGet(atomicReference, new UnaryOperator() { // from class: dasb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ejxr ejxrVar = (ejxr) obj;
                ekrg ekrgVar = dasc.a;
                if (ejxrVar != null) {
                    return ejxrVar;
                }
                final fcsu fcsuVar2 = fcsuVar;
                return ejxx.b(new ejxr() { // from class: darz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        ekrg ekrgVar2 = dasc.a;
                        Boolean bool = (Boolean) fcsuVar2.b();
                        boolean zBooleanValue = bool.booleanValue();
                        ekrw ekrwVarF = dasc.a.f();
                        ekrwVarF.X(eksq.a, "BugleWearable");
                        ekrd ekrdVar = (ekrd) ekrwVarF;
                        ekrdVar.X(cqnc.S, "CachedWearableCompanionAppInstalledImpl");
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl", "getFromCache", 83, "CachedWearableCompanionAppInstalledImpl.java")).G("Memoizing value=%s and saving in cache with %d second(s) expiration", zBooleanValue, dasc.b.e());
                        return bool;
                    }
                }, Duration.ofSeconds(((Long) dasc.b.e()).longValue()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).get();
    }

    @Override // defpackage.ctbx
    public final boolean a() {
        return c(this.e, new fcsu() { // from class: dasa
            @Override // defpackage.fcsu
            public final Object b() {
                boolean zA = ((dasd) this.a.c.b()).a();
                ekrw ekrwVarF = dasc.a.f();
                ekrwVarF.X(eksq.a, "BugleWearable");
                ekrd ekrdVar = (ekrd) ekrwVarF;
                ekrdVar.X(cqnc.S, "CachedWearableCompanionAppInstalledImpl");
                ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl", "companionHasMissingHapticsBugFix", 117, "CachedWearableCompanionAppInstalledImpl.java");
                Boolean boolValueOf = Boolean.valueOf(zA);
                ekrdVar2.t("Caching companionHasMissingHapticsBugFix with value=%s", boolValueOf);
                return boolValueOf;
            }
        }).booleanValue();
    }

    @Override // defpackage.ctbx
    public final boolean b() {
        return c(this.d, new fcsu() { // from class: dary
            @Override // defpackage.fcsu
            public final Object b() {
                boolean zB = ((dasd) this.a.c.b()).b();
                ekrw ekrwVarF = dasc.a.f();
                ekrwVarF.X(eksq.a, "BugleWearable");
                ekrd ekrdVar = (ekrd) ekrwVarF;
                ekrdVar.X(cqnc.S, "CachedWearableCompanionAppInstalledImpl");
                ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl", "isWearCompanionAppInstalled", 103, "CachedWearableCompanionAppInstalledImpl.java");
                Boolean boolValueOf = Boolean.valueOf(zB);
                ekrdVar2.t("Caching isWearCompanionAppInstalled with value=%s", boolValueOf);
                return boolValueOf;
            }
        }).booleanValue();
    }
}
