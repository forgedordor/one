package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvgl implements bvit, cmqg, caiq {
    public static final cqce a = cqce.g("BugleNetworkRetry", "DittoRegistrationManagerImpl");
    private final Optional A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    private final fcsu F;
    private final fcsu G;
    private enwr H;
    private eiju I;
    private bvgk J;
    private cquc M;
    public final fcsu b;
    public final aypu c;
    public final cqbm d;
    public final eosc e;
    public final bvkr f;
    public final fcsu g;
    public final aypz h;
    public final fcsu i;
    public ezol k;
    public String l;
    public final axwu m;
    private final eygg n;
    private final Optional o;
    private final bver p;
    private final eygg q;
    private final bvsn r;
    private final Optional s;
    private final eygg t;
    private final crqv u;
    private final fcsu v;
    private final ayps w;
    private final ayov x;
    private final fcsu y;
    private final fcsu z;
    public boolean j = false;
    private volatile boolean K = false;
    private boolean L = false;

    public bvgl(bver bverVar, eygg eyggVar, eygg eyggVar2, Optional optional, eosc eoscVar, crqv crqvVar, bvkr bvkrVar, fcsu fcsuVar, bvsn bvsnVar, ayps aypsVar, axwu axwuVar, eygg eyggVar3, Optional optional2, cqbm cqbmVar, fcsu fcsuVar2, fcsu fcsuVar3, aypu aypuVar, ayov ayovVar, aypz aypzVar, fcsu fcsuVar4, fcsu fcsuVar5, Optional optional3, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12) {
        this.p = bverVar;
        this.q = eyggVar;
        this.e = eoscVar;
        this.u = crqvVar;
        this.f = bvkrVar;
        this.v = fcsuVar;
        this.w = aypsVar;
        this.m = axwuVar;
        this.s = optional;
        this.t = eyggVar2;
        this.r = bvsnVar;
        this.n = eyggVar3;
        this.o = optional2;
        this.d = cqbmVar;
        this.b = fcsuVar2;
        this.g = fcsuVar3;
        this.c = aypuVar;
        this.x = ayovVar;
        this.h = aypzVar;
        this.y = fcsuVar4;
        this.z = fcsuVar5;
        this.A = optional3;
        this.i = fcsuVar6;
        this.B = fcsuVar7;
        this.C = fcsuVar11;
        this.D = fcsuVar8;
        this.E = fcsuVar9;
        this.F = fcsuVar10;
        this.G = fcsuVar12;
    }

    private final void u() {
        ((bvth) this.t.b()).a();
    }

    private final void v(final ezol ezolVar, ekgb ekgbVar, final bvdm bvdmVar, int i) {
        if (((ekoe) ekgbVar).c <= i) {
            return;
        }
        long jCount = Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: bvgg
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
            Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: bvgh
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
                    if (bvixVar.d().c.equals(ezolVar.c)) {
                        return false;
                    }
                    return bvixVar.b() == bvdmVar;
                }
            }).sorted(Comparator.CC.comparingLong(new ToLongFunction() { // from class: bvfm
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((bvix) obj).a();
                }
            })).limit(jCount).forEach(new Consumer() { // from class: bvfn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    bvix bvixVar = (bvix) obj;
                    cqbd cqbdVarC = bvgl.a.c();
                    cqbdVarC.I("Deactivating desktop");
                    cqbdVarC.M("desktopId", bvixVar.d().c);
                    cqbdVarC.A("desktopType", bvixVar.b());
                    cqbdVarC.r();
                    ezol ezolVarD = bvixVar.d();
                    String strE = bvixVar.e();
                    bvgl bvglVar = this.a;
                    bvglVar.f.B(ezolVarD, strE);
                    bvglVar.h.e(bvixVar.d(), bvixVar.e()).k(auvh.b(), eoqg.a);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    private final synchronized void w(ezol ezolVar, bvis bvisVar, ezol ezolVar2, String str, boolean z) {
        if (str != null && !z) {
            int iOrdinal = bvisVar.ordinal();
            if (iOrdinal == 0) {
                this.h.m(ezolVar, str);
            } else if (iOrdinal == 2) {
                this.h.e(ezolVar, str);
            }
        }
        ekgb ekgbVarL = this.f.l();
        if (!ekgbVarL.isEmpty() && x(ezolVar, ekgbVarL, ezolVar2)) {
            a.m("Skip unregistering due to the existing active desktops.");
            return;
        }
        this.K = false;
        crqv crqvVar = this.u;
        crqvVar.n("ditto_active_desktop_id");
        crqvVar.n("ditto_active_desktop_request_id");
        this.p.h();
        ((bvfb) this.q.b()).c();
        this.s.ifPresent(new Consumer() { // from class: bvfu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cqzo) obj).c();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        u();
        this.r.g();
        this.k = null;
        this.l = null;
        this.H = null;
        this.j = false;
        this.I = null;
        this.L = false;
        cquc cqucVar = this.M;
        if (cqucVar != null) {
            cqucVar.a();
            this.M = null;
        }
        cqdq.f(new Runnable() { // from class: bvfv
            @Override // java.lang.Runnable
            public final void run() {
                bvgl bvglVar = this.a;
                ((chza) bvglVar.d.a()).l(bvglVar);
            }
        });
        bvgk bvgkVar = this.J;
        if (bvgkVar != null) {
            ((ebun) this.n.b()).l(bvgkVar);
            this.J = null;
        }
        ((cehg) this.v.b()).E(barn.a);
        crqvVar.n("ditto_oldest_conversation_needing_update_timestamp_ms");
        crqvVar.n("ditto_oldest_message_needing_update_timestamp_ms");
        crqvVar.n("ditto_oldest_participant_needing_update_timestamp_ms");
        crqvVar.n("ditto_settings_need_update");
        crqvVar.n("ditto_user_alert_needs_update");
        crqvVar.n("ditto_browser_inactive_needs_update");
        crqvVar.n("ditto_messages_need_revoke_timestamp");
        this.o.ifPresent(new Consumer() { // from class: bvfx
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
    private final synchronized boolean x(ezol ezolVar, ekgb ekgbVar, ezol ezolVar2) {
        if (ezolVar2 != null) {
            if (ezolVar2.equals(ezolVar)) {
                int i = ((ekoe) ekgbVar).c;
                long jA = 0;
                bvix bvixVar = null;
                for (int i2 = 0; i2 < i; i2++) {
                    bvix bvixVar2 = (bvix) ekgbVar.get(i2);
                    if (bvixVar2.a() >= jA && !TextUtils.isEmpty(bvixVar2.e())) {
                        jA = bvixVar2.a();
                        bvixVar = bvixVar2;
                    }
                }
                String strE = bvixVar != null ? bvixVar.e() : null;
                if (bvixVar == null) {
                    return false;
                }
                this.k = bvixVar.d();
                this.l = strE;
                crqv crqvVar = this.u;
                crqvVar.i("ditto_active_desktop_id", bvixVar.d().toByteArray());
                crqvVar.l("ditto_active_desktop_request_id", strE);
                this.p.g(bvixVar.d(), strE);
                ((bvfb) this.q.b()).b(bvixVar.d(), strE);
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.cmqg
    public final synchronized void a(boolean z) {
        ezol ezolVar = this.k;
        String str = this.l;
        if (!this.L || ezolVar == null || TextUtils.isEmpty(str) || !z) {
            return;
        }
        a.p("Bugle database full sync is completed, register DittoContentObserver.");
        ((bvfb) this.q.b()).a(ezolVar, str);
        this.h.i(ezolVar, str);
    }

    @Override // defpackage.cmqg
    public final synchronized void b(boolean z) {
        ezol ezolVar = this.k;
        String str = this.l;
        if (!this.L || ezolVar == null || TextUtils.isEmpty(str) || !z) {
            return;
        }
        a.p("Bugle database full sync started, unregister DittoContentObserver.");
        ((bvfb) this.q.b()).c();
        this.h.j(ezolVar, str);
    }

    @Override // defpackage.chyy
    public final synchronized void c(chyz chyzVar) {
        enwr enwrVarB = chyzVar.b();
        enwr enwrVar = this.H;
        if (enwrVar != null && enwrVar == enwrVarB) {
            a.m("Skip updating rcs availability");
        } else {
            this.H = enwrVarB;
            cqnx.c(e(), "BugleNetworkRetry", "Failed to process settings update after RCS availability update");
        }
    }

    @Override // defpackage.cfwt
    public final eiju d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            ezol ezolVar = this.k;
            String str = this.l;
            if (this.K && ezolVar != null && str != null) {
                crqv crqvVar = this.u;
                if (crqvVar.q("ditto_settings_need_update", false)) {
                    a.p("Retrying settings update.");
                    crqvVar.n("ditto_settings_need_update");
                    arrayList.add(e());
                }
                if (crqvVar.q("ditto_user_alert_needs_update", false)) {
                    a.p("Retrying network and battery level update.");
                    crqvVar.n("ditto_user_alert_needs_update");
                    bver bverVar = this.p;
                    arrayList.add(bverVar.c());
                    arrayList.add(bverVar.b());
                }
                long jE = crqvVar.e("ditto_oldest_message_needing_update_timestamp_ms", Long.MAX_VALUE);
                if (jE != Long.MAX_VALUE) {
                    a.p("Retrying message update.");
                    crqvVar.n("ditto_oldest_message_needing_update_timestamp_ms");
                    arrayList.add(((axxv) this.c).b(ezolVar, str, jE).r());
                }
                long jE2 = crqvVar.e("ditto_oldest_conversation_needing_update_timestamp_ms", Long.MAX_VALUE);
                if (jE2 != Long.MAX_VALUE) {
                    a.p("Retrying conversation update.");
                    crqvVar.n("ditto_oldest_conversation_needing_update_timestamp_ms");
                    arrayList.add(this.w.a(ezolVar, str, jE2).r());
                }
                return eijx.a(arrayList);
            }
            cqbd cqbdVarA = a.a();
            cqbdVarA.I("Skip retry");
            cqbdVarA.B("registered", this.K);
            cqbdVarA.B("Empty desktop id", ezolVar == null);
            cqbdVarA.B("Empty request id", str == null);
            cqbdVarA.r();
            return eijx.e(null);
        }
    }

    public final synchronized eiju e() {
        eiju eijuVarE;
        eiju eijuVar = this.I;
        if (eijuVar != null && !eijuVar.isDone()) {
            this.j = true;
            a.m("Using the existing future.");
            return eijuVar;
        }
        this.j = false;
        this.I = null;
        ezol ezolVar = this.k;
        String str = this.l;
        if (!this.K || ezolVar == null || str == null) {
            eijuVarE = eijx.e(ezjn.a);
            this.I = eijuVarE;
        } else {
            this.x.a(ezolVar, str).z();
            eiju eijuVarJ = this.f.j(new Function() { // from class: bvfl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvix bvixVar = (bvix) obj;
                    return ((bvin) this.a.b.b()).a(bvixVar.d(), Optional.empty(), bvixVar.e());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ejvr ejvrVar = new ejvr() { // from class: bvfw
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ezjn.a;
                }
            };
            eoqg eoqgVar = eoqg.a;
            eijuVarE = eijuVarJ.h(ejvrVar, eoqgVar);
            this.I = eijuVarE;
            eijuVarE.k(new bvgj(this), eoqgVar);
        }
        return eijuVarE;
    }

    @Override // defpackage.bvit
    public final eiju f(String str, boolean z) {
        return eijx.e(null);
    }

    @Override // defpackage.bvit
    public final eiju g() {
        Optional optional = this.A;
        return optional.isPresent() ? ((cfzf) optional.get()).d() : eijx.e(null);
    }

    @Override // defpackage.caiq
    public final synchronized void h() {
        ezol ezolVar = this.k;
        String str = this.l;
        if (ezolVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.h.f(21, ezolVar, str).k(auvh.b(), eoqg.a);
    }

    @Override // defpackage.bvit
    public final void i(long j) {
        final long micros = TimeUnit.DAYS.toMicros(TimeUnit.MILLISECONDS.toDays(j));
        eiju eijuVarA = ((ceus) this.g.b()).a();
        eooz eoozVar = new eooz() { // from class: bvfo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                long j2 = micros;
                Long l = (Long) obj;
                if (l != null && l.longValue() > 0 && l.longValue() == j2) {
                    cqbd cqbdVarA = bvgl.a.a();
                    cqbdVarA.z("Firebase message priority downgraded day", j2);
                    cqbdVarA.I("is skipped.");
                    cqbdVarA.r();
                    return eijx.e(ezjn.a);
                }
                bvgl bvglVar = this.a;
                cqbd cqbdVarA2 = bvgl.a.a();
                cqbdVarA2.z("Storing Firebase message priority downgraded day", j2);
                cqbdVarA2.I("and sending settings update");
                cqbdVarA2.r();
                return eika.d(((ceus) bvglVar.g.b()).b(Long.valueOf(j2)), bvglVar.e().e(fbtf.class, new ejvr() { // from class: bvga
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        bvgl.a.s("processSettingsUpdate failed and will be retried later", (fbtf) obj2);
                        return ezjn.a;
                    }
                }, bvglVar.e)).a(new Callable() { // from class: bvfz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ezjn.a;
                    }
                }, eoqg.a);
            }
        };
        eoqg eoqgVar = eoqg.a;
        eijuVarA.i(eoozVar, eoqgVar).k(auwc.a(new bvgi()), eoqgVar);
    }

    @Override // defpackage.bvit
    public final synchronized void j() {
        cqnx.c(e(), "BugleNetworkRetry", "Failed to process settings update after SIM loaded");
    }

    @Override // defpackage.bvit
    public final synchronized void k(ezol ezolVar, String str) {
        l(ezolVar, str, false);
    }

    public final synchronized void l(final ezol ezolVar, final String str, boolean z) {
        cqce cqceVar = a;
        cqceVar.m("Registering with a desktop ID");
        bvkr bvkrVar = this.f;
        if (!bvkrVar.z(ezolVar, str)) {
            cqceVar.r("Cannot set the Desktop active.");
            return;
        }
        ekgb ekgbVarL = bvkrVar.l();
        v(ezolVar, ekgbVarL, bvdm.WEB, ((Integer) bvkr.d.e()).intValue());
        v(ezolVar, ekgbVarL, bvdm.PWA, ((Integer) bvkr.b.e()).intValue());
        v(ezolVar, ekgbVarL, bvdm.SATELLITE, ((Integer) bvkr.c.e()).intValue());
        aypz aypzVar = this.h;
        aypzVar.l(ezolVar, str);
        this.k = ezolVar;
        this.l = str;
        crqv crqvVar = this.u;
        crqvVar.i("ditto_active_desktop_id", ezolVar.toByteArray());
        crqvVar.l("ditto_active_desktop_request_id", str);
        if (((cmqf) this.z.b()).u()) {
            cqceVar.r("Bugle database is syncing, notify ditto.");
            aypzVar.k(ezolVar, str);
        }
        try {
            if (autx.m(((aurx) this.C.b()).c())) {
                cqceVar.r("CMS Restore is in progress, notify ditto.");
                aypzVar.f(19, ezolVar, str).k(auvh.b(), eoqg.a);
            }
            if (((aqcb) this.D.b()).a() && ((bvpy) this.F.b()).a()) {
                cqceVar.r("Bugle is in Throttle State, notify ditto.");
                this.h.h().k(auvh.b(), eoqg.a);
            }
            if (((aqca) this.E.b()).a() && ((bvpy) this.F.b()).a()) {
                cqceVar.r("Bugle is in Throttle State, notify ditto.");
                this.h.g().k(auvh.b(), eoqg.a);
            }
            if (this.K) {
                this.p.f(ezolVar, str);
                ((bvfb) this.q.b()).b(ezolVar, str);
                return;
            }
            this.p.e(ezolVar, str);
            this.L = true;
            if (!((cmqf) this.z.b()).u()) {
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.I("Bugle database is not syncing, register DittoContentObserver");
                cqbdVarC.r();
                ((bvfb) this.q.b()).a(ezolVar, str);
                if (z) {
                    eiju eijuVarA = ((bvfj) this.i.b()).a(ezolVar);
                    eooz eoozVar = new eooz() { // from class: bvge
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            Long l = (Long) obj;
                            ArrayList arrayList = new ArrayList();
                            long jLongValue = l.longValue();
                            cczv cczvVar = bvfd.b;
                            long jLongValue2 = ((Long) cczvVar.e()).longValue();
                            bvgl bvglVar = this.a;
                            if (jLongValue > jLongValue2) {
                                String str2 = str;
                                ezol ezolVar2 = ezolVar;
                                long jLongValue3 = l.longValue() - ((Long) cczvVar.e()).longValue();
                                cqbd cqbdVarC2 = bvgl.a.c();
                                cqbdVarC2.z("Sending message update starting from", jLongValue3);
                                cqbdVarC2.r();
                                arrayList.add(bvglVar.c.f(ezolVar2, str2, jLongValue3).r());
                                arrayList.add(((bvfj) bvglVar.i.b()).b(ezolVar2).e(Exception.class, new ejvr() { // from class: bvfs
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        cqbd cqbdVarE = bvgl.a.e();
                                        cqbdVarE.I("setDittoLastPushTimeMillis did not complete successfully");
                                        cqbdVarE.s((Exception) obj2);
                                        return null;
                                    }
                                }, bvglVar.e));
                            }
                            return eijx.j(arrayList).a(new Callable() { // from class: bvft
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return ezjn.a;
                                }
                            }, bvglVar.e);
                        }
                    };
                    eosc eoscVar = this.e;
                    eijuVarA.i(eoozVar, eoscVar).k(auvh.b(), eoscVar);
                }
            }
            this.s.ifPresent(new Consumer() { // from class: bvgb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((cqzo) obj).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((bvth) this.t.b()).b();
            if (this.M == null) {
                this.M = ((ajnf) this.y.b()).a(new ajne() { // from class: bvgc
                    @Override // defpackage.cqtk
                    public final eiju a(Object obj) {
                        bvgl bvglVar = this.a;
                        return bvglVar.e().e(Exception.class, new ejvr() { // from class: bvfq
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                bvgl.a.r("Failed to process settings update after configuration change");
                                return ezjn.a;
                            }
                        }, bvglVar.e).h(new ejvr() { // from class: bvfr
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return null;
                            }
                        }, eoqg.a);
                    }
                }, "DittoRegistrationManagerImpl.configurationUpdated");
            }
            cqdq.f(new Runnable() { // from class: bvgd
                @Override // java.lang.Runnable
                public final void run() {
                    bvgl bvglVar = this.a;
                    ((chza) bvglVar.d.a()).h(bvglVar);
                }
            });
            if (this.J == null) {
                bvgk bvgkVar = new bvgk(this);
                this.J = bvgkVar;
                ((ebun) this.n.b()).j(bvgkVar);
            }
            this.K = true;
        } catch (evtj e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.bvit
    public final void m() {
        this.A.ifPresent(new Consumer() { // from class: bvfy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cfzf) obj).g();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.bvit
    public final synchronized void n(ezol ezolVar, String str, bvis bvisVar) throws Throwable {
        Throwable th;
        boolean z;
        try {
            try {
                if (this.K) {
                    cqce cqceVar = a;
                    cqbd cqbdVarA = cqceVar.a();
                    cqbdVarA.I("Unregister desktop");
                    cqbdVarA.A("desktopId", ezolVar);
                    cqbdVarA.A("requestId", str);
                    cqbdVarA.A("reason", bvisVar);
                    cqbdVarA.r();
                    bvkr bvkrVar = this.f;
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
                    w(ezolVar, bvisVar, this.k, this.l, z);
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

    @Override // defpackage.bvit
    public final synchronized void o(ezol ezolVar, bvis bvisVar) throws Throwable {
        try {
            try {
                if (this.K) {
                    cqbd cqbdVarA = a.a();
                    cqbdVarA.I("Unregister desktop");
                    cqbdVarA.A("desktopId", ezolVar);
                    cqbdVarA.A("reason", bvisVar);
                    cqbdVarA.r();
                    w(ezolVar, bvisVar, this.k, this.l, !this.f.A(ezolVar));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.bvit
    public final synchronized boolean p() {
        return this.K;
    }

    @Override // defpackage.bvit
    public final eiju q(int i) {
        ezol ezolVar;
        String str;
        synchronized (this) {
            ezolVar = this.k;
            str = this.l;
        }
        if (ezolVar == null || TextUtils.isEmpty(str) || i != 1) {
            return eijx.e(false);
        }
        ((bvfb) this.q.b()).c();
        return this.h.d(ezolVar, str).h(new ejvr() { // from class: bvfp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return true;
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvit
    public final eiju r(int i) {
        ezol ezolVar;
        String str;
        synchronized (this) {
            ezolVar = this.k;
            str = this.l;
        }
        if (ezolVar == null || TextUtils.isEmpty(str) || i != 1) {
            return eijx.e(false);
        }
        ((bvfb) this.q.b()).a(ezolVar, str);
        return this.h.b(ezolVar, str).h(new ejvr() { // from class: bvgf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return true;
            }
        }, eoqg.a);
    }

    @Override // defpackage.caiq
    public final synchronized void s() {
        ezol ezolVar = this.k;
        String str = this.l;
        if (ezolVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.h.f(20, ezolVar, str).k(auvh.b(), eoqg.a);
    }

    @Override // defpackage.bvit
    public final synchronized void t() {
        if (!p()) {
            cqce cqceVar = a;
            cqceVar.m("Trying to register with last active desktop.");
            crqv crqvVar = this.u;
            byte[] bArrR = crqvVar.r("ditto_active_desktop_id");
            if (bArrR == null) {
                cqceVar.m("No active desktop ID. Cleaning up attachment upload task.");
                u();
                return;
            }
            try {
                ezol ezolVar = (ezol) evsn.parseFrom(ezol.a, bArrR);
                String strF = crqvVar.f("ditto_active_desktop_request_id", null);
                if (strF != null) {
                    cqceVar.r("Registering managers...");
                    l(ezolVar, strF, true);
                    if (!((aqbc) this.G.b()).a()) {
                        this.r.c();
                    }
                }
            } catch (evtj e) {
                a.s("Invalid active ditto ID when registering with last active desktop.", e);
            }
        }
    }
}
