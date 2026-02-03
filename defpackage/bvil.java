package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvil implements chyy {
    public static final cqce a = cqce.g("BugleNetworkRetry", "ScopedDittoUpdatesHandler");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/ditto/ScopedDittoUpdatesHandler");
    private final eygg A;
    private final eygg B;
    private final eygg C;
    private final fcsu D;
    private final ayov E;
    private final fcsu F;
    private final fcsu G;
    private final fcsu H;
    private final fcsu I;
    private final fcsu J;
    private enwr K;
    private eiju L;
    private bwvp M;
    private cquc O;
    public final fcsu c;
    public final aypu d;
    public final cqbm e;
    public final bver f;
    public final eygg g;
    public final eosc h;
    public final crqv i;
    public final bvkr j;
    public final ayps k;
    public final fcsu l;
    public final aypz m;
    public final fcsu n;
    public final fcsu o;
    public final Optional p;
    public final Map q;
    public ezol t;
    public String u;
    public final String v;
    private final Optional w;
    private final Optional x;
    private final bvsn y;
    private final Optional z;
    public boolean r = false;
    public volatile boolean s = false;
    private boolean N = false;

    public bvil(Optional optional, bver bverVar, eygg eyggVar, eygg eyggVar2, Optional optional2, eosc eoscVar, crqv crqvVar, bvkr bvkrVar, fcsu fcsuVar, bvsn bvsnVar, ayps aypsVar, Optional optional3, cqbm cqbmVar, fcsu fcsuVar2, fcsu fcsuVar3, aypu aypuVar, eygg eyggVar3, eygg eyggVar4, ayov ayovVar, aypz aypzVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, Optional optional4, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, Map map) {
        this.x = optional;
        this.v = true != optional.isPresent() ? "Bugle" : "GDitto";
        this.f = bverVar;
        this.g = eyggVar;
        this.h = eoscVar;
        this.i = crqvVar;
        this.j = bvkrVar;
        this.D = fcsuVar;
        this.k = aypsVar;
        this.z = optional2;
        this.A = eyggVar2;
        this.y = bvsnVar;
        this.w = optional3;
        this.e = cqbmVar;
        this.c = fcsuVar2;
        this.l = fcsuVar3;
        this.d = aypuVar;
        this.B = eyggVar3;
        this.C = eyggVar4;
        this.E = ayovVar;
        this.m = aypzVar;
        this.F = fcsuVar4;
        this.G = fcsuVar5;
        this.n = fcsuVar6;
        this.o = fcsuVar7;
        this.p = optional4;
        this.q = map;
        this.H = fcsuVar8;
        this.I = fcsuVar9;
        this.J = fcsuVar10;
    }

    private final void l(final ezol ezolVar, ekgb ekgbVar, final bvdm bvdmVar, int i) {
        if (((ekoe) ekgbVar).c <= i) {
            return;
        }
        long jCount = Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: bvid
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((bvix) obj).b() == bvdmVar;
            }
        }).count() - i;
        if (jCount > 0) {
            Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: bvie
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    bvix bvixVar = (bvix) obj;
                    if (bvixVar.c().d.c.equals(ezolVar.c)) {
                        return false;
                    }
                    return bvixVar.b() == bvdmVar;
                }
            }).sorted(Comparator.CC.comparingLong(new ToLongFunction() { // from class: bvif
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((bvix) obj).a();
                }
            })).limit(jCount).forEach(new Consumer() { // from class: bvig
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    bvix bvixVar = (bvix) obj;
                    ezol ezolVar2 = bvixVar.c().d;
                    cqbd cqbdVarC = bvil.a.c();
                    cqbdVarC.I("Deactivating desktop");
                    cqbdVarC.M("desktopId", ezolVar2.c);
                    cqbdVarC.A("desktopType", bvixVar.b());
                    cqbdVarC.r();
                    String strE = bvixVar.e();
                    bvil bvilVar = this.a;
                    bvilVar.j.B(ezolVar2, strE);
                    bvilVar.m.e(ezolVar2, bvixVar.e()).k(auvh.b(), eoqg.a);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    private final synchronized void m(ezol ezolVar, bvis bvisVar, ezol ezolVar2, String str, boolean z) {
        if (str != null && !z) {
            int iOrdinal = bvisVar.ordinal();
            if (iOrdinal == 0) {
                this.m.m(ezolVar, str);
            } else if (iOrdinal == 2) {
                this.m.e(ezolVar, str);
            }
        }
        Stream streamFilter = Collection.EL.stream(this.j.l()).filter(new Predicate() { // from class: bvhn
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((bvix) obj).c().a.d.equals(this.a.v);
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar = (ekgb) streamFilter.collect(ekcv.a);
        if (!ekgbVar.isEmpty() && n(ezolVar, ekgbVar, ezolVar2)) {
            a.m("Skip unregistering due to the existing active desktops.");
            return;
        }
        this.s = false;
        crqv crqvVar = this.i;
        crqvVar.n("ditto_active_desktop_id");
        crqvVar.n("ditto_active_desktop_request_id");
        this.f.h();
        ((bvgt) this.g.b()).c();
        this.z.ifPresent(new Consumer() { // from class: bvho
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cqzo) obj).c();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((bvth) this.A.b()).a();
        this.y.g();
        this.t = null;
        this.u = null;
        this.K = null;
        this.r = false;
        this.L = null;
        this.N = false;
        cquc cqucVar = this.O;
        if (cqucVar != null) {
            cqucVar.a();
            this.O = null;
        }
        cqdq.f(new Runnable() { // from class: bvhp
            @Override // java.lang.Runnable
            public final void run() {
                bvil bvilVar = this.a;
                ((chza) bvilVar.e.a()).l(bvilVar);
            }
        });
        bwvp bwvpVar = this.M;
        if (bwvpVar != null) {
            ((ebun) this.B.b()).l(bwvpVar);
            this.M = null;
        }
        ((cehg) this.D.b()).E(barn.a);
        crqvVar.n("ditto_oldest_conversation_needing_update_timestamp_ms");
        crqvVar.n("ditto_oldest_message_needing_update_timestamp_ms");
        crqvVar.n("ditto_oldest_participant_needing_update_timestamp_ms");
        crqvVar.n("ditto_settings_need_update");
        crqvVar.n("ditto_user_alert_needs_update");
        crqvVar.n("ditto_browser_inactive_needs_update");
        crqvVar.n("ditto_messages_need_revoke_timestamp");
        this.w.ifPresent(new Consumer() { // from class: bvhq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((ceov) obj).d();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.p("Unregister is complete.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final synchronized boolean n(ezol ezolVar, ekgb ekgbVar, ezol ezolVar2) {
        if (ezolVar2 != null) {
            if (ezolVar2.equals(ezolVar)) {
                int size = ekgbVar.size();
                long jA = 0;
                bvix bvixVar = null;
                for (int i = 0; i < size; i++) {
                    bvix bvixVar2 = (bvix) ekgbVar.get(i);
                    if (bvixVar2.a() >= jA && !TextUtils.isEmpty(bvixVar2.e())) {
                        jA = bvixVar2.a();
                        bvixVar = bvixVar2;
                    }
                }
                String strE = bvixVar != null ? bvixVar.e() : null;
                if (bvixVar == null) {
                    return false;
                }
                ezol ezolVar3 = bvixVar.c().d;
                this.t = ezolVar3;
                this.u = strE;
                crqv crqvVar = this.i;
                crqvVar.i("ditto_active_desktop_id", ezolVar3.toByteArray());
                crqvVar.l("ditto_active_desktop_request_id", strE);
                this.f.g(ezolVar3, strE);
                ((bvgt) this.g.b()).b(ezolVar3, strE);
                ekrw ekrwVarE = b.e();
                ekrwVarE.X(eksq.a, "BugleNetworkRetry");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/ditto/ScopedDittoUpdatesHandler", "updateCurrentActiveDesktopIfNeeded", 649, "ScopedDittoUpdatesHandler.java")).t("Switching active desktop to [%s]", bvixVar.c().b);
                return true;
            }
        }
        return true;
    }

    public final synchronized eiju a() {
        eiju eijuVarE;
        eiju eijuVar = this.L;
        if (eijuVar != null && !eijuVar.isDone()) {
            this.r = true;
            a.m("Using the existing future.");
            return eijuVar;
        }
        this.r = false;
        this.L = null;
        ezol ezolVar = this.t;
        String str = this.u;
        if (!this.s || ezolVar == null || str == null) {
            eijuVarE = eijx.e(ezjn.a);
            this.L = eijuVarE;
        } else {
            this.E.a(ezolVar, str).z();
            eiju eijuVarJ = this.j.j(new Function() { // from class: bvib
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvix bvixVar = (bvix) obj;
                    return ((bvin) this.a.c.b()).a(bvixVar.d(), Optional.of(bvixVar.c()), bvixVar.e());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ejvr ejvrVar = new ejvr() { // from class: bvic
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ezjn.a;
                }
            };
            eoqg eoqgVar = eoqg.a;
            eijuVarE = eijuVarJ.h(ejvrVar, eoqgVar);
            this.L = eijuVarE;
            eijuVarE.k(new bvik(this), eoqgVar);
        }
        return eijuVarE;
    }

    public final synchronized void b() {
        cqnx.c(a(), "BugleNetworkRetry", "Failed to process settings update after SIM loaded");
    }

    @Override // defpackage.chyy
    public final synchronized void c(chyz chyzVar) {
        enwr enwrVarB = chyzVar.b();
        enwr enwrVar = this.K;
        if (enwrVar != null && enwrVar == enwrVarB) {
            a.m("Skip updating rcs availability");
        } else {
            this.K = enwrVarB;
            cqnx.c(a(), "BugleNetworkRetry", "Failed to process settings update after RCS availability update");
        }
    }

    public final synchronized void d(boolean z) {
        ezol ezolVar = this.t;
        String str = this.u;
        if (!this.N || ezolVar == null || TextUtils.isEmpty(str) || !z) {
            return;
        }
        ((bvgt) this.g.b()).a(ezolVar, str);
        this.m.i(ezolVar, str);
    }

    public final synchronized void e(boolean z) {
        ezol ezolVar = this.t;
        String str = this.u;
        if (!this.N || ezolVar == null || TextUtils.isEmpty(str) || !z) {
            return;
        }
        a.p("Bugle database full sync started, unregister DittoContentObserver.");
        ((bvgt) this.g.b()).c();
        this.m.j(ezolVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [eygg, java.lang.Object] */
    public final synchronized void f(final ezol ezolVar, final String str, boolean z) {
        String str2 = ezolVar.d;
        String str3 = this.v;
        if (!str2.equals(str3)) {
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleNetworkRetry");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/ditto/ScopedDittoUpdatesHandler", "register", 267, "ScopedDittoUpdatesHandler.java")).D("Skipping registration in this updatesHandler instance. This instance supports app [%s], but found app [%s]", str3, ezolVar.d);
            return;
        }
        cqce cqceVar = a;
        cqceVar.m("Registering with a desktop ID");
        bvkr bvkrVar = this.j;
        if (!bvkrVar.z(ezolVar, str)) {
            cqceVar.r("Cannot set the Desktop active.");
            return;
        }
        ekgb ekgbVarL = bvkrVar.l();
        l(ezolVar, ekgbVarL, bvdm.WEB, ((Integer) bvkr.d.e()).intValue());
        l(ezolVar, ekgbVarL, bvdm.PWA, ((Integer) bvkr.b.e()).intValue());
        l(ezolVar, ekgbVarL, bvdm.SATELLITE, ((Integer) bvkr.c.e()).intValue());
        aypz aypzVar = this.m;
        aypzVar.l(ezolVar, str);
        this.t = ezolVar;
        this.u = str;
        crqv crqvVar = this.i;
        crqvVar.i("ditto_active_desktop_id", ezolVar.toByteArray());
        crqvVar.l("ditto_active_desktop_request_id", str);
        fcsu fcsuVar = this.G;
        if (((cmqf) fcsuVar.b()).u()) {
            cqceVar.r("Bugle database is syncing, notify ditto.");
            aypzVar.k(ezolVar, str);
        }
        if (((aqcb) this.H.b()).a() && ((bvpy) this.J.b()).a()) {
            cqceVar.r("Bugle is in Throttle State, notify ditto.");
            aypzVar.h().k(auvh.b(), eoqg.a);
        }
        if (((aqca) this.I.b()).a() && ((bvpy) this.J.b()).a()) {
            cqceVar.r("Bugle is in Throttle State, notify ditto.");
            aypzVar.g().k(auvh.b(), eoqg.a);
        }
        if (this.s) {
            this.f.f(ezolVar, str);
            ((bvgt) this.g.b()).b(ezolVar, str);
            return;
        }
        this.f.e(ezolVar, str);
        this.N = true;
        if (!((cmqf) fcsuVar.b()).u()) {
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.I("Bugle database is not syncing, register DittoContentObserver");
            cqbdVarC.r();
            ((bvgt) this.g.b()).a(ezolVar, str);
            if (z) {
                eiju eijuVarA = ((bvfj) this.n.b()).a(ezolVar);
                eooz eoozVar = new eooz() { // from class: bvhv
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        Long l = (Long) obj;
                        ArrayList arrayList = new ArrayList();
                        long jLongValue = l.longValue();
                        cczv cczvVar = bvfd.b;
                        long jLongValue2 = ((Long) cczvVar.e()).longValue();
                        bvil bvilVar = this.a;
                        if (jLongValue > jLongValue2) {
                            String str4 = str;
                            ezol ezolVar2 = ezolVar;
                            long jLongValue3 = l.longValue() - ((Long) cczvVar.e()).longValue();
                            cqbd cqbdVarC2 = bvil.a.c();
                            cqbdVarC2.z("Sending message update starting from", jLongValue3);
                            cqbdVarC2.r();
                            arrayList.add(bvilVar.d.f(ezolVar2, str4, jLongValue3).r());
                            arrayList.add(((bvfj) bvilVar.n.b()).b(ezolVar2).e(Exception.class, new ejvr() { // from class: bvhx
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    cqbd cqbdVarE = bvil.a.e();
                                    cqbdVarE.I("setDittoLastPushTimeMillis did not complete successfully");
                                    cqbdVarE.s((Exception) obj2);
                                    return null;
                                }
                            }, bvilVar.h));
                        }
                        return eijx.j(arrayList).a(new Callable() { // from class: bvhy
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return ezjn.a;
                            }
                        }, bvilVar.h);
                    }
                };
                eosc eoscVar = this.h;
                eijuVarA.i(eoozVar, eoscVar).k(auvh.b(), eoscVar);
            }
        }
        this.z.ifPresent(new Consumer() { // from class: bvhs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cqzo) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((bvth) this.A.b()).b();
        if (this.O == null) {
            this.O = ((ajnf) this.F.b()).a(new ajne() { // from class: bvht
                @Override // defpackage.cqtk
                public final eiju a(Object obj) {
                    bvil bvilVar = this.a;
                    return bvilVar.a().e(Exception.class, new ejvr() { // from class: bvhz
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            bvil.a.r("Failed to process settings update after configuration change");
                            return ezjn.a;
                        }
                    }, bvilVar.h).h(new ejvr() { // from class: bvia
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }, eoqg.a);
                }
            }, "ScopedDittoUpdatesHandler.configurationUpdated");
        }
        cqdq.f(new Runnable() { // from class: bvhu
            @Override // java.lang.Runnable
            public final void run() {
                bvil bvilVar = this.a;
                ((chza) bvilVar.e.a()).i(bvilVar, bvilVar.h);
            }
        });
        if (this.M == null) {
            bwvq bwvqVar = (bwvq) this.C.b();
            ?? B = bwvqVar.a.b();
            B.getClass();
            fcsu fcsuVar2 = bwvqVar.b;
            ezolVar.getClass();
            str.getClass();
            bwvp bwvpVar = new bwvp(B, fcsuVar2, ezolVar, str);
            ((ebun) this.B.b()).j(bwvpVar);
            this.M = bwvpVar;
        }
        this.s = true;
    }

    public final synchronized void g(bvis bvisVar) {
        ezol ezolVar = this.t;
        if (ezolVar != null) {
            a.m("Forcing unregister of current desktop");
            i(ezolVar, bvisVar);
        }
    }

    public final synchronized void h(ezol ezolVar, String str, bvis bvisVar) throws Throwable {
        Throwable th;
        boolean z;
        try {
            try {
                if (this.s) {
                    cqce cqceVar = a;
                    cqbd cqbdVarA = cqceVar.a();
                    cqbdVarA.I("Unregister desktop");
                    cqbdVarA.A("desktopId", ezolVar);
                    cqbdVarA.A("requestId", str);
                    cqbdVarA.A("reason", bvisVar);
                    cqbdVarA.r();
                    bvkr bvkrVar = this.j;
                    if (bvkrVar.B(ezolVar, str)) {
                        z = false;
                    } else {
                        try {
                            if (bvkrVar.y(ezolVar)) {
                                cqceVar.m("Skip unregistering because the desktopId and the requestId are not matched.");
                                return;
                            }
                            z = true;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    m(ezolVar, bvisVar, this.t, this.u, z);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void i(ezol ezolVar, bvis bvisVar) throws Throwable {
        try {
            try {
                if (this.s) {
                    cqbd cqbdVarA = a.a();
                    cqbdVarA.I("Unregister desktop");
                    cqbdVarA.A("desktopId", ezolVar);
                    cqbdVarA.A("reason", bvisVar);
                    cqbdVarA.r();
                    m(ezolVar, bvisVar, this.t, this.u, !this.j.A(ezolVar));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean j() {
        return this.x.isPresent();
    }

    public final synchronized boolean k() {
        return this.s;
    }
}
