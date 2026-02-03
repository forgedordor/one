package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bvhk;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvhk implements bvit, cmqg {
    public static final cqce a = cqce.g("BugleNetworkRetry", "NewDittoRegistrationManagerImpl");
    public bvil b;
    public final eygg c;
    public bvil d = null;
    public String e = null;
    public final Context f;
    private final bvsn g;
    private final eygg h;
    private final Executor i;
    private final crqv j;
    private final egej k;
    private final bvkr l;

    /* compiled from: PG */
    public interface a {
        bvil aH();
    }

    public bvhk(bvsn bvsnVar, eygg eyggVar, eosc eoscVar, crqv crqvVar, eygg eyggVar2, egej egejVar, bvkr bvkrVar, Context context) {
        this.g = bvsnVar;
        this.h = eyggVar;
        this.i = new eoss(eoscVar);
        this.j = crqvVar;
        this.c = eyggVar2;
        this.k = egejVar;
        this.l = bvkrVar;
        this.f = context;
    }

    private final void e(final ezol ezolVar, final String str, final boolean z) {
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        if (!felmVarB.equals(felm.EMAIL)) {
            auvh.h(eijx.f(new Runnable() { // from class: bvhj
                @Override // java.lang.Runnable
                public final void run() {
                    bvhk bvhkVar = this.a;
                    bvhkVar.b = (bvil) bvhkVar.c.b();
                    bvhkVar.b.f(ezolVar, str, z);
                }
            }, this.i));
            return;
        }
        final String strN = this.l.n(ezolVar.c);
        eiju eijuVarG = eiju.g(this.k.c(strN));
        eooz eoozVar = new eooz() { // from class: bvhh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                bvhk bvhkVar = this.a;
                efwo efwoVar = (efwo) obj;
                synchronized (bvhkVar) {
                    bvil bvilVar = bvhkVar.d;
                    String str2 = strN;
                    if (bvilVar == null || !str2.equals(bvhkVar.e)) {
                        bvhkVar.d = ((bvhk.a) ehlh.a(bvhkVar.f, bvhk.a.class, efwoVar)).aH();
                        bvhkVar.e = str2;
                    }
                    bvhkVar.b = bvhkVar.d;
                }
                boolean z2 = z;
                String str3 = str;
                bvhkVar.b.f(ezolVar, str3, z2);
                return eork.i(true);
            }
        };
        Executor executor = this.i;
        auvh.h(eijuVarG.i(eoozVar, executor).e(Throwable.class, new ejvr() { // from class: bvhi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarE = bvhk.a.e();
                cqbdVarE.I("Failed to get Gaia accountId when registering Ditto desktop.");
                cqbdVarE.s((Throwable) obj);
                return false;
            }
        }, executor));
    }

    private static boolean h(ezol ezolVar) {
        return ezolVar.d.equals("Bugle");
    }

    @Override // defpackage.cmqg
    public final void a(final boolean z) {
        auvh.h(eijx.f(new Runnable() { // from class: bvhg
            @Override // java.lang.Runnable
            public final void run() {
                bvil bvilVar = this.a.b;
                if (bvilVar != null) {
                    bvilVar.d(z);
                }
            }
        }, this.i));
    }

    @Override // defpackage.cmqg
    public final void b(final boolean z) {
        auvh.h(eijx.f(new Runnable() { // from class: bvhd
            @Override // java.lang.Runnable
            public final void run() {
                bvil bvilVar = this.a.b;
                if (bvilVar != null) {
                    bvilVar.e(z);
                }
            }
        }, this.i));
    }

    @Override // defpackage.chyy
    public final void c(final chyz chyzVar) {
        auvh.h(eijx.f(new Runnable() { // from class: bvgz
            @Override // java.lang.Runnable
            public final void run() {
                bvil bvilVar = this.a.b;
                if (bvilVar != null) {
                    bvilVar.c(chyzVar);
                }
            }
        }, this.i));
    }

    @Override // defpackage.cfwt
    public final eiju d() {
        return eijx.h(new eooy() { // from class: bvhc
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                bvil bvilVar = this.a.b;
                if (bvilVar == null) {
                    return eijx.c();
                }
                ArrayList arrayList = new ArrayList();
                synchronized (bvilVar) {
                    ezol ezolVar = bvilVar.t;
                    String str = bvilVar.u;
                    if (bvilVar.s && ezolVar != null && str != null) {
                        crqv crqvVar = bvilVar.i;
                        if (crqvVar.q("ditto_settings_need_update", false)) {
                            bvil.a.p("Retrying settings update.");
                            crqvVar.n("ditto_settings_need_update");
                            arrayList.add(bvilVar.a());
                        }
                        if (crqvVar.q("ditto_user_alert_needs_update", false)) {
                            bvil.a.p("Retrying network and battery level update.");
                            crqvVar.n("ditto_user_alert_needs_update");
                            bver bverVar = bvilVar.f;
                            arrayList.add(bverVar.c());
                            arrayList.add(bverVar.b());
                        }
                        long jE = crqvVar.e("ditto_oldest_message_needing_update_timestamp_ms", Long.MAX_VALUE);
                        if (jE != Long.MAX_VALUE) {
                            bvil.a.p("Retrying message update.");
                            crqvVar.n("ditto_oldest_message_needing_update_timestamp_ms");
                            arrayList.add(((axxv) bvilVar.d).b(ezolVar, str, jE).r());
                        }
                        long jE2 = crqvVar.e("ditto_oldest_conversation_needing_update_timestamp_ms", Long.MAX_VALUE);
                        if (jE2 != Long.MAX_VALUE) {
                            bvil.a.p("Retrying conversation update.");
                            crqvVar.n("ditto_oldest_conversation_needing_update_timestamp_ms");
                            arrayList.add(bvilVar.k.a(ezolVar, str, jE2).r());
                        }
                        return eijx.a(arrayList);
                    }
                    cqbd cqbdVarA = bvil.a.a();
                    cqbdVarA.I("Skip retry");
                    cqbdVarA.B("registered", bvilVar.s);
                    cqbdVarA.B("Empty desktop id", ezolVar == null);
                    cqbdVarA.B("Empty request id", str == null);
                    cqbdVarA.r();
                    return eijx.e(null);
                }
            }
        }, this.i);
    }

    @Override // defpackage.bvit
    public final eiju f(String str, boolean z) {
        bvil bvilVar = this.b;
        if (bvilVar == null) {
            bvilVar = (bvil) this.c.b();
            this.b = bvilVar;
        } else if (bvilVar.j()) {
            bvilVar.g(bvis.SESSION_TERMINATED);
            bvilVar = (bvil) this.c.b();
            this.b = bvilVar;
        }
        cfdh cfdhVar = (cfdh) bvilVar.o.b();
        str.getClass();
        return auvw.c(cfdhVar.e, fcyi.a, fdjz.a, new cfdg(cfdhVar, z, str, null)).h(new ejvr() { // from class: bvha
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvit
    public final eiju g() {
        bvil bvilVar = this.b;
        if (bvilVar == null) {
            return eijx.e(null);
        }
        if (!bvilVar.j()) {
            Optional optional = bvilVar.p;
            return optional.isPresent() ? ((cfzf) optional.get()).d() : eijx.e(null);
        }
        Map map = bvilVar.q;
        String str = bvilVar.v;
        cfic cficVar = (cfic) map.get(str);
        if (cficVar != null) {
            return cficVar.d();
        }
        ekrw ekrwVarF = bvil.b.f();
        ekrwVarF.X(eksq.a, "BugleNetworkRetry");
        ((ekrd) ((ekrd) ekrwVarF).h("com/google/android/apps/messaging/shared/datamodel/ditto/ScopedDittoUpdatesHandler", "startBind", 865, "ScopedDittoUpdatesHandler.java")).t("AppName not recognized by BindManager: %s, skipping start bind", str);
        return eijx.e(null);
    }

    @Override // defpackage.bvit
    public final void i(final long j) {
        auvh.h(eijx.f(new Runnable() { // from class: bvgu
            @Override // java.lang.Runnable
            public final void run() {
                final bvil bvilVar = this.a.b;
                if (bvilVar != null) {
                    final long micros = TimeUnit.DAYS.toMicros(TimeUnit.MILLISECONDS.toDays(j));
                    eiju eijuVarA = ((ceus) bvilVar.l.b()).a();
                    eooz eoozVar = new eooz() { // from class: bvhm
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            long j2 = micros;
                            Long l = (Long) obj;
                            if (l != null && l.longValue() > 0 && l.longValue() == j2) {
                                cqbd cqbdVarA = bvil.a.a();
                                cqbdVarA.z("Firebase message priority downgraded day", j2);
                                cqbdVarA.I("is skipped.");
                                cqbdVarA.r();
                                return eijx.e(ezjn.a);
                            }
                            bvil bvilVar2 = bvilVar;
                            cqbd cqbdVarA2 = bvil.a.a();
                            cqbdVarA2.z("Storing Firebase message priority downgraded day", j2);
                            cqbdVarA2.I("and sending settings update");
                            cqbdVarA2.r();
                            return eika.d(((ceus) bvilVar2.l.b()).b(Long.valueOf(j2)), bvilVar2.a().e(fbtf.class, new ejvr() { // from class: bvih
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    bvil.a.s("processSettingsUpdate failed and will be retried later", (fbtf) obj2);
                                    return ezjn.a;
                                }
                            }, bvilVar2.h)).a(new Callable() { // from class: bvhr
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return ezjn.a;
                                }
                            }, eoqg.a);
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    eijuVarA.i(eoozVar, eoqgVar).k(auwc.a(new bvij()), eoqgVar);
                }
            }
        }, this.i));
    }

    @Override // defpackage.bvit
    public final void j() {
        auvh.h(eijx.f(new Runnable() { // from class: bvhf
            @Override // java.lang.Runnable
            public final void run() {
                bvil bvilVar = this.a.b;
                if (bvilVar != null) {
                    bvilVar.b();
                }
            }
        }, this.i));
    }

    @Override // defpackage.bvit
    public final void k(ezol ezolVar, String str) {
        e(ezolVar, str, false);
    }

    @Override // defpackage.bvit
    public final void m() {
        bvil bvilVar = this.b;
        if (bvilVar != null) {
            if (!bvilVar.j()) {
                bvilVar.p.ifPresent(new Consumer() { // from class: bvhl
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((cfzf) obj).g();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            Map map = bvilVar.q;
            String str = bvilVar.v;
            cfic cficVar = (cfic) map.get(str);
            if (cficVar != null) {
                cficVar.h();
                return;
            }
            ekrw ekrwVarF = bvil.b.f();
            ekrwVarF.X(eksq.a, "BugleNetworkRetry");
            ((ekrd) ((ekrd) ekrwVarF).h("com/google/android/apps/messaging/shared/datamodel/ditto/ScopedDittoUpdatesHandler", "stopBind", 851, "ScopedDittoUpdatesHandler.java")).t("AppName not recognized by BindManager: %s, skipping stop bind", str);
        }
    }

    @Override // defpackage.bvit
    public final void n(final ezol ezolVar, final String str, final bvis bvisVar) {
        auvh.h(eijx.f(new Runnable() { // from class: bvhb
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                bvhk bvhkVar = this.a;
                if (bvhkVar.p()) {
                    bvis bvisVar2 = bvisVar;
                    String str2 = str;
                    ezol ezolVar2 = ezolVar;
                    bvil bvilVar = bvhkVar.b;
                    bvilVar.getClass();
                    bvilVar.h(ezolVar2, str2, bvisVar2);
                }
            }
        }, this.i));
    }

    @Override // defpackage.bvit
    public final void o(final ezol ezolVar, final bvis bvisVar) {
        auvh.h(eijx.f(new Runnable() { // from class: bvgy
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                bvhk bvhkVar = this.a;
                if (bvhkVar.p()) {
                    bvis bvisVar2 = bvisVar;
                    ezol ezolVar2 = ezolVar;
                    bvil bvilVar = bvhkVar.b;
                    bvilVar.getClass();
                    bvilVar.i(ezolVar2, bvisVar2);
                }
            }
        }, this.i));
    }

    @Override // defpackage.bvit
    public final boolean p() {
        bvil bvilVar = this.b;
        if (bvilVar != null) {
            return bvilVar.k();
        }
        return false;
    }

    @Override // defpackage.bvit
    public final eiju q(final int i) {
        return eijx.h(new eooy() { // from class: bvgv
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ezol ezolVar;
                String str;
                bvil bvilVar = this.a.b;
                if (bvilVar == null) {
                    return eijx.e(false);
                }
                synchronized (bvilVar) {
                    ezolVar = bvilVar.t;
                    str = bvilVar.u;
                }
                if (ezolVar == null || TextUtils.isEmpty(str)) {
                    return eijx.e(false);
                }
                int i2 = i;
                ((bvgt) bvilVar.g.b()).c();
                return i2 == 1 ? bvilVar.m.d(ezolVar, str).h(new ejvr() { // from class: bvhw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return true;
                    }
                }, eoqg.a) : eijx.e(true);
            }
        }, this.i);
    }

    @Override // defpackage.bvit
    public final eiju r(final int i) {
        return eijx.h(new eooy() { // from class: bvhe
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ezol ezolVar;
                String str;
                bvil bvilVar = this.a.b;
                if (bvilVar == null) {
                    return eijx.e(false);
                }
                synchronized (bvilVar) {
                    ezolVar = bvilVar.t;
                    str = bvilVar.u;
                }
                if (ezolVar == null || TextUtils.isEmpty(str)) {
                    return eijx.e(false);
                }
                int i2 = i;
                ((bvgt) bvilVar.g.b()).a(ezolVar, str);
                return i2 == 1 ? bvilVar.m.b(ezolVar, str).h(new ejvr() { // from class: bvii
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return true;
                    }
                }, eoqg.a) : eijx.e(true);
            }
        }, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bvit
    public final void t() {
        ezol ezolVar;
        if (p()) {
            return;
        }
        cqce cqceVar = a;
        cqceVar.m("Trying to register with last active desktop.");
        bvkr bvkrVar = this.l;
        if (!bvkrVar.u()) {
            crqv crqvVar = this.j;
            byte[] bArrR = crqvVar.r("ditto_active_desktop_id");
            if (bArrR == null) {
                cqceVar.m("No active desktop ID. Cleaning up attachment upload task.");
                ((bvth) this.h.b()).a();
                return;
            }
            try {
                ezol ezolVar2 = (ezol) evsn.parseFrom(ezol.a, bArrR, evrr.a());
                String strF = crqvVar.f("ditto_active_desktop_request_id", null);
                if (strF != null) {
                    cqceVar.r("Registering managers...");
                    e(ezolVar2, strF, true);
                    if (h(ezolVar2)) {
                        this.g.c();
                        return;
                    }
                    return;
                }
                return;
            } catch (evtj e) {
                a.s("Invalid active ditto ID when registering with last active desktop.", e);
                return;
            }
        }
        crqv crqvVar2 = this.j;
        byte[] bArrR2 = crqvVar2.r("ditto_active_desktop_id");
        String strF2 = crqvVar2.f("ditto_active_desktop_request_id", null);
        ekgb ekgbVarL = bvkrVar.l();
        if (bArrR2 == null || strF2 == null) {
            ((ekrd) cqceVar.i().h("com/google/android/apps/messaging/shared/datamodel/ditto/NewDittoRegistrationManagerImpl", "tryToUpdatePrefsAndRegisterLastActiveDesktop", 191, "NewDittoRegistrationManagerImpl.java")).q("idBytes or request Id is null in preferences. Update the first active ditto desktop's desktopId & requestId to bugle preferences");
            ezolVar = ((bvix) ekgbVarL.get(0)).c().d;
            strF2 = ((bvix) ekgbVarL.get(0)).e();
            crqvVar2.i("ditto_active_desktop_id", ezolVar.toByteArray());
            crqvVar2.l("ditto_active_desktop_request_id", strF2);
        } else {
            try {
                ezolVar = (ezol) evsn.parseFrom(ezol.a, bArrR2, evrr.a());
                Stream map = Collection.EL.stream(ekgbVarL).map(new Function() { // from class: bvgw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bvix) obj).c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: bvgx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bvks) obj).d;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                if (!((ekgb) map.collect(ekcv.a)).contains(ezolVar)) {
                    ((ekrd) cqceVar.i().h("com/google/android/apps/messaging/shared/datamodel/ditto/NewDittoRegistrationManagerImpl", "tryToUpdatePrefsAndRegisterLastActiveDesktop", 208, "NewDittoRegistrationManagerImpl.java")).q("The desktop stored in preferences is not active. Update the first active ditto desktop's desktopId & requestId to bugle preferences");
                    ezolVar = ((bvix) ekgbVarL.get(0)).c().d;
                    strF2 = ((bvix) ekgbVarL.get(0)).e();
                    crqvVar2.i("ditto_active_desktop_id", ezolVar.toByteArray());
                    crqvVar2.l("ditto_active_desktop_request_id", strF2);
                }
            } catch (evtj e2) {
                ((ekrd) ((ekrd) a.k().g(e2)).h("com/google/android/apps/messaging/shared/datamodel/ditto/NewDittoRegistrationManagerImpl", "tryToUpdatePrefsAndRegisterLastActiveDesktop", 217, "NewDittoRegistrationManagerImpl.java")).q("Invalid active ditto ID when registering with last active desktop.");
                return;
            }
        }
        e(ezolVar, strF2, true);
        if (h(ezolVar)) {
            this.g.c();
        }
    }
}
