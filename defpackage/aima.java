package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.car.app.model.Alert;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Consumer$CC;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aima implements aill {
    public static final eksp a = eksp.c("BugleClearcutLogger");
    static final cczi b = cdag.h(cdag.b, "filter_non_northstar_clearcut_logs_enable", false);
    private static final int e = (int) TimeUnit.SECONDS.toMillis(1);
    public dbzq c;
    public final eosd d;
    private final boolean f;
    private final fcsu g;
    private final fcsu h;
    private dbyl i;
    private dbyl j;
    private dbyl k;
    private Map l;
    private final cogw m;
    private final aiul n;
    private Map o;
    private final ejxr p;
    private final aimb q;
    private final aimb r;
    private final aimb s;
    private final dezb t;

    public aima(Context context, eosd eosdVar, final cqpz cqpzVar, fcsu fcsuVar, cqcz cqczVar, fcsu fcsuVar2, cogw cogwVar, aiul aiulVar, dezb dezbVar, ailp ailpVar, fcsu fcsuVar3, aimb aimbVar, aimb aimbVar2, aimb aimbVar3) {
        this.h = fcsuVar;
        this.m = cogwVar;
        this.n = aiulVar;
        this.d = eosdVar;
        boolean zI = cqpzVar.i("bugle_enable_analytics", true);
        this.f = zI;
        this.g = fcsuVar3;
        if (zI && cqczVar.b.h(context, 12200000) == 0) {
            Context context2 = ailpVar.a;
            List list = dbyl.m;
            this.i = new dbyi(context2, "ANDROID_MESSAGING").c();
            this.j = ailpVar.a();
            this.k = ailpVar.b();
            this.c = new dbzq(this.i, "BUGLE_COUNTERS", Alert.DURATION_SHOW_INDEFINITELY);
            if (((Boolean) ccze.A.e()).booleanValue()) {
                this.c.h(eosdVar, e);
            }
            fcsuVar2.b();
            B(fcsuVar, this.c, true, this.i);
            this.l = new HashMap();
        } else if (zI) {
            ((eksl) a.n().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "<init>", 178, "BugleClearcutLoggerImpl.java")).q("Clearcut logging is disabled because Google Play Services isn't available.");
        } else {
            ((eksl) a.n().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "<init>", 175, "BugleClearcutLoggerImpl.java")).q("Clearcut logging is disabled because analytics GServices is not enabled.");
        }
        this.p = ejxx.a(new ejxr() { // from class: ailt
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = aima.a;
                String strE = cqbe.i() ? cqpzVar.e("bugle_testing_simulation_session_id", "") : "";
                if ("".equals(strE)) {
                    return Optional.empty();
                }
                eltx eltxVar = (eltx) elty.a.createBuilder();
                ((eksl) ((eksl) aima.a.h()).h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "extractBugleTestingInfo", 205, "BugleClearcutLoggerImpl.java")).t("Associating clearcut log with simulation: %s", strE);
                eltxVar.copyOnWrite();
                elty eltyVar = (elty) eltxVar.instance;
                strE.getClass();
                eltyVar.b |= 2;
                eltyVar.d = strE;
                return Optional.of((elty) eltxVar.build());
            }
        });
        this.t = dezbVar;
        this.q = aimbVar;
        this.r = aimbVar2;
        this.s = aimbVar3;
    }

    private final void A(final ellg ellgVar, dbyl dbylVar, emxt emxtVar, double d, Long l, Long l2, boolean z) {
        ejwl.a(d >= 0.0d);
        ejwl.a(d <= 100.0d);
        if (this.t.a() < d) {
            if (((Boolean) b.e()).booleanValue()) {
                ellf ellfVarB = ellf.b(((ellh) ellgVar.instance).j);
                if (ellfVarB == null) {
                    ellfVarB = ellf.UNKNOWN_BUGLE_EVENT_TYPE;
                }
                int iOrdinal = ellfVarB.ordinal();
                if (iOrdinal == 12 || iOrdinal == 18 || iOrdinal == 23 || iOrdinal == 37 || iOrdinal == 40 || iOrdinal == 44 || iOrdinal == 60 || iOrdinal == 88 || iOrdinal == 108 || iOrdinal == 28 || iOrdinal == 29) {
                    return;
                }
            }
            ellh ellhVar = (ellh) ellgVar.instance;
            ellf ellfVarB2 = ellf.b(ellhVar.j);
            if (ellfVarB2 == null) {
                ellfVarB2 = ellf.UNKNOWN_BUGLE_EVENT_TYPE;
            }
            if (ellfVarB2 == ellf.BUGLE_MESSAGE) {
                elpg elpgVar = ellhVar.l;
                if (elpgVar == null) {
                    elpgVar = elpg.b;
                }
                int iB = eloc.b(elpgVar.h);
                if (iB == 0 || iB == 1) {
                    return;
                }
            }
            eika.l(this.n.g(this.m.f().toEpochMilli()), new cqob(new Consumer() { // from class: ailv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    eksp ekspVar = aima.a;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: ailw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((eksl) ((eksl) ((eksl) aima.a.i()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "sendBugleEventToClearcut", 326, "BugleClearcutLoggerImpl.java")).q("Failed to log lastPassiveEventTime");
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), eoqg.a);
            if (!this.f || dbylVar == null) {
                return;
            }
            if (ellgVar != null) {
                ((Optional) this.p.get()).ifPresent(new Consumer() { // from class: ailr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ellg ellgVar2 = ellgVar;
                        elty eltyVar = (elty) obj;
                        ellgVar2.copyOnWrite();
                        ellh ellhVar2 = (ellh) ellgVar2.instance;
                        ellh ellhVar3 = ellh.a;
                        eltyVar.getClass();
                        ellhVar2.s = eltyVar;
                        ellhVar2.b |= 2048;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (dbylVar.e()) {
                z(this.s, ellgVar, emxtVar, l, l2);
            } else if (dbylVar.k.equals(dcaa.c) || z) {
                z(this.r, ellgVar, emxtVar, l, l2);
            } else {
                z(this.q, ellgVar, emxtVar, l, l2);
            }
        }
    }

    private static void B(fcsu fcsuVar, dbzq dbzqVar, boolean z, dbyl dbylVar) {
        elku elkuVarA = ((ainw) fcsuVar.b()).a();
        ekrw ekrwVarO = a.o();
        ekrwVarO.X(aiuq.h, elkuVarA.c);
        ekrz ekrzVar = aiuq.i;
        int iA = elkt.a(elkuVarA.e);
        if (iA == 0) {
            iA = 1;
        }
        ekrwVarO.X(ekrzVar, Integer.valueOf(iA - 1));
        ekrwVarO.X(aiuq.j, elkuVarA.r);
        ekrwVarO.X(aiuq.k, elkuVarA.f);
        ekrwVarO.X(aiuq.l, elkuVarA.g);
        ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "logCustomDimensions", 700, "BugleClearcutLoggerImpl.java")).q("---COUNTER DIMENSIONS---");
        if (C(dbzqVar, z, dbylVar)) {
            dbzqVar.i(elkuVarA);
        }
    }

    private static boolean C(dbzq dbzqVar, boolean z, dbyl dbylVar) {
        if (!z) {
            ((eksl) a.n().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "shouldLogCounters", 707, "BugleClearcutLoggerImpl.java")).q("Clearcut logging disabled via GServices.");
            return false;
        }
        if (dbylVar != null && dbzqVar != null) {
            return true;
        }
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "shouldLogCounters", 712, "BugleClearcutLoggerImpl.java")).q("Clearcut logging disabled because Play Services isn't available.");
        return false;
    }

    private final void D(final dbzq dbzqVar, final String str, final long j) {
        if (t(dbzqVar, str)) {
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(aiuq.b, str);
            ekrwVarO.X(aiuq.f, Long.valueOf(j));
            ekrwVarO.X(aiuq.a, 1L);
            ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementLongHistogram", 630, "BugleClearcutLoggerImpl.java")).q("Incrementing long histogram.");
            w(dbzqVar, str, new Runnable() { // from class: aily
                @Override // java.lang.Runnable
                public final void run() {
                    eksp ekspVar = aima.a;
                    dbzn dbznVarE = dbzqVar.e(str);
                    dbzh dbzhVar = dbznVarE.f;
                    dbznVarE.a(j, 1L, dbzq.b);
                }
            });
        }
    }

    private final synchronized Optional u(String str) {
        Map map = this.l;
        if (map == null) {
            return Optional.empty();
        }
        if (!map.containsKey(str)) {
            dbzq dbzqVar = new dbzq(this.i, "BUGLE_COUNTERS", Alert.DURATION_SHOW_INDEFINITELY);
            dbzqVar.i(((ainw) this.h.b()).b(str));
            this.l.put(str, dbzqVar);
        }
        return Optional.of((dbzq) this.l.get(str));
    }

    private final synchronized Map v() {
        if (this.o == null) {
            this.o = new ArrayMap();
            for (String str : ejxk.b(',').g((String) ccze.r.e())) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        int iIndexOf = str.indexOf(58);
                        this.o.put(str.substring(0, iIndexOf), Double.valueOf(Double.parseDouble(str.substring(iIndexOf + 1))));
                    } catch (Exception e2) {
                        ((eksl) ((eksl) ((eksl) a.i()).g(e2)).h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "getHistogramUploadRatios", 750, "BugleClearcutLoggerImpl.java")).t("Error parsing %s", str);
                    }
                }
            }
        }
        return this.o;
    }

    private final void w(final dbzq dbzqVar, String str, final Runnable runnable) {
        aisn aisnVar = (aisn) this.g.b();
        str.getClass();
        auvh.h(auvw.c(aisnVar.a, fcyi.a, fdjz.a, new aisj(aisnVar, str, null)).h(new ejvr() { // from class: ails
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                final Runnable runnable2 = runnable;
                if (((Boolean) ccze.A.e()).booleanValue()) {
                    runnable2.run();
                    return null;
                }
                final dbzq dbzqVar2 = dbzqVar;
                auwa.a(new Runnable() { // from class: ailz
                    @Override // java.lang.Runnable
                    public final void run() throws NoSuchAlgorithmException {
                        eksp ekspVar = aima.a;
                        runnable2.run();
                        dbzqVar2.f();
                    }
                }, this.a.d);
                return null;
            }
        }, this.d));
    }

    private final void x(final dbzq dbzqVar, final String str, final long j) {
        if (C(this.c, this.f, this.i)) {
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(aiuq.b, str);
            ekrwVarO.X(aiuq.a, Long.valueOf(j));
            ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementCounterBy", 551, "BugleClearcutLoggerImpl.java")).q("Incrementing counter.");
            w(dbzqVar, str, new Runnable() { // from class: ailu
                @Override // java.lang.Runnable
                public final void run() {
                    eksp ekspVar = aima.a;
                    dbzq dbzqVar2 = dbzqVar;
                    dbzqVar2.c(str).a(0L, j, dbzq.b);
                }
            });
        }
    }

    private final void y(final dbzq dbzqVar, final String str, final int i, final long j) {
        if (t(dbzqVar, str)) {
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(aiuq.b, str);
            ekrwVarO.X(aiuq.e, Integer.valueOf(i));
            ekrwVarO.X(aiuq.a, Long.valueOf(j));
            ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementIntegerHistogram", 588, "BugleClearcutLoggerImpl.java")).q("Incrementing integer histogram.");
            w(dbzqVar, str, new Runnable() { // from class: ailq
                @Override // java.lang.Runnable
                public final void run() {
                    eksp ekspVar = aima.a;
                    dbzqVar.d(str).a(i, j, dbzq.b);
                }
            });
        }
    }

    private static void z(aimb aimbVar, ellg ellgVar, emxt emxtVar, Long l, Long l2) {
        ailn ailnVarA = aimbVar.a();
        ailnVarA.d(emxtVar);
        if (l != null && l2 != null) {
            ailnVarA.f(new ainn(l.longValue(), l2.longValue()));
        }
        ailnVarA.h(ellgVar, aioj.LOG_SPEC_LEGACY_LOGGING);
    }

    @Override // defpackage.aill
    public final void a() throws NoSuchAlgorithmException {
        ecem.b();
        dbzq dbzqVar = this.c;
        if (dbzqVar == null) {
            return;
        }
        try {
            degc.g(dbzqVar.f(), 1100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
    }

    @Override // defpackage.aill
    public final void b() throws NoSuchAlgorithmException {
        ecem.b();
        dbzq dbzqVar = this.c;
        if (dbzqVar == null) {
            return;
        }
        cogw cogwVar = this.m;
        defn defnVarF = dbzqVar.f();
        long jA = cogwVar.a();
        this.i.h.c(TimeUnit.MILLISECONDS);
        try {
            degc.g(defnVarF, Math.max(0L, 1100 - (cogwVar.a() - jA)), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
    }

    @Override // defpackage.aill
    public final void c(final String str, elgm elgmVar, final long j) {
        if (t(this.c, str)) {
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(aiuq.b, str);
            ekrwVarO.X(aiuq.g, elgmVar.name());
            ekrwVarO.X(aiuq.a, Long.valueOf(j));
            ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementActionHistogramBy", 652, "BugleClearcutLoggerImpl.java")).q("Incrementing action histogram.");
            elkq elkqVar = (elkq) elku.a.createBuilder();
            elkqVar.copyOnWrite();
            elku elkuVar = (elku) elkqVar.instance;
            elkuVar.t = elgmVar.bI;
            elkuVar.b |= 131072;
            elvg elvgVar = cqbe.a;
            elkqVar.copyOnWrite();
            elku elkuVar2 = (elku) elkqVar.instance;
            elkuVar2.u = elvgVar.x;
            elkuVar2.b |= 262144;
            final elku elkuVar3 = (elku) elkqVar.build();
            w(this.c, str, new Runnable() { // from class: ailx
                @Override // java.lang.Runnable
                public final void run() {
                    dbzn dbznVarE = this.a.c.e(str);
                    dbzh dbzhVar = dbznVarE.f;
                    dbznVarE.a(j, 1L, dbzj.a(elkuVar3));
                }
            });
        }
    }

    @Override // defpackage.aill
    public final void d(String str) {
        x(this.c, str, 1L);
    }

    @Override // defpackage.aill
    public final void e(String str, int i) {
        x(this.c, str, i);
    }

    @Override // defpackage.aill
    public final void f(String str, int i) {
        y(this.c, str, i, 1L);
    }

    @Override // defpackage.aill
    public final void g(String str, int i, long j) {
        y(this.c, str, i, j);
    }

    @Override // defpackage.aill
    public final void h(String str, long j) {
        D(this.c, str, j);
    }

    @Override // defpackage.aill
    public final void i(String str, long j, String str2) {
        Optional optionalU = u(str2);
        if (optionalU.isPresent()) {
            D((dbzq) optionalU.get(), str, j);
            return;
        }
        ekrw ekrwVarO = a.o();
        ekrwVarO.X(aiuq.b, str);
        ekrwVarO.X(aiuq.k, str2);
        ekrwVarO.X(aiuq.f, Long.valueOf(j));
        ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementLongHistogram", 610, "BugleClearcutLoggerImpl.java")).q("Unable to increment long histogram for rbm bot.");
    }

    @Override // defpackage.aill
    public final void j(ellg ellgVar) {
        k(ellgVar, emxt.UNKNOWN_BUGLE_EVENT_CODE);
    }

    @Override // defpackage.aill
    public final void k(ellg ellgVar, emxt emxtVar) {
        A(ellgVar, this.i, emxtVar, 100.0d, null, null, false);
    }

    @Override // defpackage.aill
    public final void l(ellg ellgVar, emxt emxtVar, long j) {
        A(ellgVar, this.i, emxtVar, 100.0d, Long.valueOf(j), null, false);
    }

    @Override // defpackage.aill
    public final void m(ellg ellgVar, emxt emxtVar, ainn ainnVar) {
        long j = ainnVar.b;
        A(ellgVar, this.i, emxtVar, 100.0d, Long.valueOf(ainnVar.a), Long.valueOf(j), false);
    }

    @Override // defpackage.aill
    public final void n(ellg ellgVar) {
        q(ellgVar, 100.0d);
    }

    @Override // defpackage.aill
    public final void o(ellg ellgVar) {
        A(ellgVar, this.k, emxt.UNKNOWN_BUGLE_EVENT_CODE, 100.0d, null, null, true);
    }

    @Override // defpackage.aill
    public final void p(ellg ellgVar, double d) {
        A(ellgVar, this.i, emxt.UNKNOWN_BUGLE_EVENT_CODE, d, null, null, false);
    }

    @Override // defpackage.aill
    public final void q(ellg ellgVar, double d) {
        A(ellgVar, this.j, emxt.UNKNOWN_BUGLE_EVENT_CODE, d, null, null, false);
    }

    @Override // defpackage.aill
    public final void r() {
        B(this.h, this.c, this.f, this.i);
    }

    @Override // defpackage.aill
    public final void s() {
        Optional optionalU = u("112855188");
        if (optionalU.isPresent()) {
            x((dbzq) optionalU.get(), "Bugle.BugOccurrence.Counts", 1L);
            return;
        }
        ekrw ekrwVarO = a.o();
        ekrwVarO.X(aiuq.b, "Bugle.BugOccurrence.Counts");
        ekrwVarO.X(aiuq.k, "112855188");
        ekrwVarO.X(aiuq.a, 1L);
        ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementCounterBy", 533, "BugleClearcutLoggerImpl.java")).q("Unable to increment counter for rbm bot.");
    }

    final boolean t(dbzq dbzqVar, String str) {
        if (!C(dbzqVar, this.f, this.i)) {
            return false;
        }
        Double d = (Double) v().get(str);
        return d == null || ThreadLocalRandom.current().nextDouble() < d.doubleValue();
    }
}
