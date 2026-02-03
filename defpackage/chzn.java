package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chzn {
    public static final egyj a = new egyb("rcs_availability_data_source_key");
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/rcs/availability/cache/RcsAvailabilityCache");
    private final fcsu c;
    private final fcsu d;
    private final Map e = new ConcurrentHashMap();

    public chzn(fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    @Deprecated
    public final enwr a() {
        return b(((dhes) this.c.b()).l());
    }

    public final enwr b(String str) {
        enwr enwrVar = (enwr) this.e.get(str);
        if (enwrVar == null) {
            ekrw ekrwVarH = b.h();
            ekrwVarH.X(eksq.a, "RcsAvailabilityCache");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcs/availability/cache/RcsAvailabilityCache", "getCachedAvailabilityForSimId", 85, "RcsAvailabilityCache.java")).t("Cached availability not found for simId: %s", dhiz.SIM_ID.c(str));
        }
        return enwrVar != null ? enwrVar : enwr.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
    }

    public final void c(String str, final enwr enwrVar) {
        egzg egzgVar = (egzg) this.d.b();
        egxy egxyVar = new egxy();
        egxyVar.b(eijx.e((enwr) this.e.put(str, enwrVar)));
        egxyVar.c(a);
        egxyVar.a = new ejvr() { // from class: chzm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return enwrVar;
            }
        };
        egzgVar.a(egxyVar.a());
    }
}
