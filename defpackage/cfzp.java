package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfzp implements cfzf {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl");
    public final Context b;
    public final eosc c;
    public final fcsu d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    private final eosc k;
    private final ejxr l;
    private final fcsu m;
    private final ConcurrentMap n = new ConcurrentHashMap();
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;

    public cfzp(fcsu fcsuVar, final Context context, final eosc eoscVar, eosc eoscVar2, fcsu fcsuVar2, final fcsu fcsuVar3, final fcsu fcsuVar4, fcsu fcsuVar5, final Optional optional, final Optional optional2, final Optional optional3, final Optional optional4, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        this.b = context;
        this.c = eoscVar;
        this.k = eoscVar2;
        this.q = fcsuVar2;
        this.d = fcsuVar3;
        this.g = optional4;
        this.e = optional2;
        this.f = optional3;
        this.h = fcsuVar6;
        this.i = fcsuVar;
        this.o = fcsuVar7;
        this.p = fcsuVar8;
        this.l = ejxx.a(new ejxr() { // from class: cfzm
            /* JADX WARN: Type inference failed for: r9v0, types: [cfgy, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                Optional optional5 = optional4;
                Optional optional6 = optional2;
                Optional optional7 = optional3;
                cfzp.k(optional5, optional6, optional7);
                final cezv cezvVar = (cezv) fcsuVar3.b();
                cezvVar.getClass();
                fcsu fcsuVar10 = new fcsu() { // from class: cfzo
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return cezvVar.a();
                    }
                };
                fcsu fcsuVar11 = fcsuVar4;
                Object obj = optional5.get();
                ?? r9 = optional6.get();
                Object obj2 = optional7.get();
                cedp cedpVar = (cedp) fcsuVar11.b();
                Optional optional8 = optional;
                return Optional.ofNullable(new cfze(context, fcsuVar10, (cfrx) obj, r9, (cfpl) obj2, eoscVar, cedpVar, 2, optional8.isPresent() ? Optional.of(new ceot((ceov) optional8.get())) : Optional.empty(), cfgy.a, Duration.ofSeconds(((Integer) cefs.j.e()).intValue()), ((Integer) cefs.k.e()).intValue(), ((Integer) cefs.l.e()).intValue(), false, false, true));
            }
        });
        this.m = fcsuVar5;
        this.j = fcsuVar9;
    }

    public static void k(Optional optional, Optional optional2, Optional optional3) {
        optional.isPresent();
        optional2.isPresent();
        optional3.isPresent();
    }

    private final void l() {
        k(this.g, this.e, this.f);
    }

    @Override // defpackage.cfzf
    public final eiju a(ezol ezolVar) {
        return b(ezolVar, Optional.empty());
    }

    @Override // defpackage.cfzf
    public final eiju b(final ezol ezolVar, final Optional optional) {
        final String str = ezolVar.c;
        if (TextUtils.isEmpty(str)) {
            return eijx.e(null);
        }
        l();
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "pullMessagesForPhone", 286, "TachyonReceiverManagerImpl.java")).q("beginning of pullMessagesForPhone");
        return ((cejj) this.m.b()).e(str, 20).i(new eooz() { // from class: cfzh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cfze cfzeVarJ = this.a.j(str, (cejg) obj);
                ezol ezolVar2 = ezolVar;
                Optional optional2 = optional;
                if (!optional2.isPresent()) {
                    return cfzeVarJ.b(ezolVar2);
                }
                Object obj2 = optional2.get();
                cfzeVarJ.f = true;
                return cfzeVarJ.a(ezolVar2, ((cfpa) cfzeVarJ.e.get()).b((cedo) obj2));
            }
        }, this.k).h(new ejvr() { // from class: cfzi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarH2 = cfzp.a.h();
                ekrwVarH2.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "pullMessagesForPhone", 301, "TachyonReceiverManagerImpl.java")).q("End of pullMessagesForPhone");
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.cfzf
    public final eiju c(final ezol ezolVar) {
        final String str = ezolVar.c;
        if (TextUtils.isEmpty(str)) {
            return eijx.e(new qam());
        }
        l();
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "pullMessagesForPhoneFromWorker", 315, "TachyonReceiverManagerImpl.java")).q("beginning of pullMessagesForPhoneFromWorker");
        return ((cejj) this.m.b()).e(str, 19).i(new eooz() { // from class: cfzn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.j(str, (cejg) obj).c(ezolVar);
            }
        }, this.k);
    }

    @Override // defpackage.cfzf
    public final eiju d() {
        if (((apro) this.p.b()).a() && !((cqhz) this.o.b()).a()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startAnonymousBindHandler", 155, "TachyonReceiverManagerImpl.java")).q("Device data over satellite, skipping start bind");
            return eijx.e(null);
        }
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startAnonymousBindHandler", 158, "TachyonReceiverManagerImpl.java")).q("beginning of startAnonymousBindHandler");
        ejxr ejxrVar = this.l;
        return ((Optional) ejxrVar.get()).isEmpty() ? eijx.e(null) : ((cfze) ((Optional) ejxrVar.get()).get()).d();
    }

    @Override // defpackage.cfzf
    public final eiju e(final String str) {
        if (TextUtils.isEmpty(str)) {
            return eijx.e(null);
        }
        l();
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startPhoneBindHandler", 334, "TachyonReceiverManagerImpl.java")).q("beginning of startPhoneBindHandler");
        return ((cejj) this.m.b()).e(str, 18).i(new eooz() { // from class: cfzj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.j(str, (cejg) obj).d();
            }
        }, this.k);
    }

    @Override // defpackage.cfzf
    public final void f() {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "onAppBackgrounding", 206, "TachyonReceiverManagerImpl.java")).q("Notifying TachyonReceivers for backgrounding");
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            ((cfgx) ((cfze) it.next()).d.get()).b();
        }
    }

    @Override // defpackage.cfzf
    public final synchronized void g() {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "stopAnonymousBindHandler", 182, "TachyonReceiverManagerImpl.java")).q("stopping anonymous bind");
        ((ains) this.q.b()).e("Bugle.Ditto.Binding.Stop.Counts", 1);
        ((Optional) this.l.get()).ifPresent(new Consumer() { // from class: cfzg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cfze) obj).e();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.cfzf
    public final synchronized void h(String str) {
        ConcurrentMap concurrentMap = this.n;
        if (concurrentMap.containsKey(str)) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "stopPhoneBindHandler", 198, "TachyonReceiverManagerImpl.java")).t("Stopping phone bind for %s", cqcv.b(str));
            ((cfze) concurrentMap.get(str)).e();
        }
    }

    @Override // defpackage.cfzf
    public final eiju i(String str) {
        if (((apro) this.p.b()).a() && !((cqhz) this.o.b()).a()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startAnonymousBindHandlerFromTickle", 170, "TachyonReceiverManagerImpl.java")).q("Device data over satellite, skipping start bind");
            return eijx.e(null);
        }
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startAnonymousBindHandlerFromTickle", 173, "TachyonReceiverManagerImpl.java")).q("beginning of startBindHandler from tickle");
        ejxr ejxrVar = this.l;
        return ((Optional) ejxrVar.get()).isEmpty() ? eijx.e(null) : ((cfze) ((Optional) ejxrVar.get()).get()).f(str);
    }

    public final cfze j(final String str, final cedp cedpVar) {
        l();
        ejwl.l(true);
        return (cfze) ConcurrentMap.EL.computeIfAbsent(this.n, str, new Function() { // from class: cfzl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [cfgy, java.lang.Object] */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final cfzp cfzpVar = this.a;
                final String str2 = str;
                fcsu fcsuVar = new fcsu() { // from class: cfzk
                    @Override // defpackage.fcsu
                    public final Object b() {
                        cfzp cfzpVar2 = cfzpVar;
                        cfep cfepVar = (cfep) cfzpVar2.i.b();
                        String str3 = str2;
                        cfepVar.a(str3, 21);
                        aubq aubqVarC = ((asqx) cfzpVar2.h.b()).c(str3);
                        cezv cezvVar = (cezv) cfzpVar2.d.b();
                        ezol ezolVarB = cnln.b(aubqVarC);
                        eieu eieuVarK = eiiy.k("GrpcProxies#getPhoneMessagingGrpcProxy");
                        try {
                            ekrw ekrwVarE = cezv.a.e();
                            ekrwVarE.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/grpcproxies/GrpcProxies", "getPhoneMessagingGrpcProxy", 81, "GrpcProxies.java")).q("Phone channel bound to identity messaging grpc is used.");
                            cepf cepfVarA = ((cepg) cezvVar.d.b()).a(ezolVarB);
                            eieuVarK.close();
                            return cepfVarA;
                        } catch (Throwable th) {
                            try {
                                eieuVarK.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                };
                Object obj2 = cfzpVar.g.get();
                ?? r6 = cfzpVar.e.get();
                Object obj3 = cfzpVar.f.get();
                return new cfze(cfzpVar.b, fcsuVar, (cfrx) obj2, r6, (cfpl) obj3, cfzpVar.c, cedpVar, 3, Optional.empty(), evwz.c((evrj) cfzpVar.j.b()), Duration.ofSeconds(((Integer) cefs.g.e()).intValue()), ((Integer) cefs.h.e()).intValue(), ((Integer) cefs.i.e()).intValue(), true, true, false);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
