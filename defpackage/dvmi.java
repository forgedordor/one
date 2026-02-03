package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvmi {
    public final dwje b;
    public final Context c;
    public final dvqa d;
    public final dwws e;
    public final dvin f;
    public final dviy g;
    public final dvlj h;
    public final dvkb i;
    public final dvir k;
    public final dvix l;
    public final dvyx m;
    public final dvkc n;
    public final dvke o;
    public final Map p;
    public dvmh w;
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    private static final Map B = new HashMap();
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;
    public final Handler x = new Handler(Looper.getMainLooper());
    public final Object y = new Object();
    public final eosc j = dvie.b().a;
    public final ConcurrentMap q = new ConcurrentHashMap();
    public final Timer A = new Timer("TypingIndicatorTimer", true);
    final Map z = new HashMap();
    public final Set r = new HashSet();
    public final Map s = new HashMap();

    public dvmi(Context context, dwje dwjeVar, dvqa dvqaVar, dvir dvirVar, dvix dvixVar, dwws dwwsVar, dvin dvinVar, dviy dviyVar, dvlj dvljVar, dvkc dvkcVar, dvkb dvkbVar, dvke dvkeVar, Map map) {
        this.c = context;
        this.b = dwjeVar;
        this.d = dvqaVar;
        this.e = dwwsVar;
        this.f = dvinVar;
        this.g = dviyVar;
        this.h = dvljVar;
        this.n = dvkcVar;
        this.i = dvkbVar;
        this.p = map;
        this.o = dvkeVar;
        this.k = dvirVar;
        this.l = dvixVar;
        this.m = dvyx.a(context);
    }

    public static synchronized dvmi a(Context context, dwje dwjeVar, dvqa dvqaVar, dvir dvirVar, dvix dvixVar, dwws dwwsVar, dvin dvinVar, dviy dviyVar, dvlj dvljVar, dvkc dvkcVar, dvkb dvkbVar, Map map) {
        Map map2;
        map2 = B;
        if (!map2.containsKey(dwjeVar)) {
            map2.put(dwjeVar, new dvmi(context, dwjeVar, dvqaVar, dvirVar, dvixVar, dwwsVar, dvinVar, dviyVar, dvljVar, dvkcVar, dvkbVar, new dvke(), map));
        }
        return (dvmi) map2.get(dwjeVar);
    }

    public final synchronized ListenableFuture b() {
        if (!this.v && !this.t) {
            this.v = true;
            this.u = false;
            this.l.h(1);
            final dvmh dvmhVar = new dvmh(this);
            dvxe dvxeVarC = dvxf.c();
            ((dvxa) dvxeVarC).a = "stream open";
            dvxeVarC.b(dvxj.g);
            final dvxf dvxfVarA = dvxeVarC.a();
            eorg eorgVarD = eork.d(eork.n(new eooy() { // from class: dvlo
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    dvmi dvmiVar = this.a;
                    dwdo dwdoVar = (dwdo) dvmiVar.d;
                    final dwcm dwcmVar = dwdoVar.a;
                    final UUID uuidRandomUUID = UUID.randomUUID();
                    final dwje dwjeVar = dvmiVar.b;
                    final dwft dwftVar = new dwft(dwjeVar, dwdoVar.b, dwdoVar.e);
                    final ListenableFuture listenableFutureI = eork.i(new dwcn(eywe.b(dwcmVar.d.c)));
                    final dwpk dwpkVarF = dwjeVar.c().f();
                    final dvmh dvmhVar2 = dvmhVar;
                    return dwcmVar.c(dwjeVar, dwpkVarF, new eooz() { // from class: dwbw
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            final dwcm dwcmVar2 = dwcmVar;
                            final ListenableFuture listenableFutureA = dwcmVar2.a(listenableFutureI, dwpkVarF);
                            dvia.b();
                            final dwje dwjeVar2 = dwjeVar;
                            if (dwjeVar2 == null) {
                                return eork.h(new RuntimeException("Invalid RequestType: 0"));
                            }
                            final dwft dwftVar2 = dwftVar;
                            final dvqz dvqzVar = dvmhVar2;
                            final UUID uuid = uuidRandomUUID;
                            ListenableFuture listenableFutureE = dwcmVar2.e(uuid, new ejvr() { // from class: dwcf
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    ezpp ezppVar = (ezpp) obj2;
                                    ezkk ezkkVar = (ezkk) ezkl.a.createBuilder();
                                    ezkkVar.copyOnWrite();
                                    ezkl ezklVar = (ezkl) ezkkVar.instance;
                                    ezppVar.getClass();
                                    ezklVar.c = ezppVar;
                                    ezklVar.b |= 1;
                                    return eork.i((ezkl) ezkkVar.build());
                                }
                            }, dwjeVar2);
                            final SettableFuture settableFutureCreate = SettableFuture.create();
                            eooz eoozVar = new eooz() { // from class: dwcg
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    ejvr ejvrVar = new ejvr() { // from class: dwbv
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj3) {
                                            return ((dwcn) obj3).a;
                                        }
                                    };
                                    ListenableFuture listenableFuture = listenableFutureA;
                                    eoqg eoqgVar = eoqg.a;
                                    ListenableFuture listenableFutureF = eooq.f(listenableFuture, ejvrVar, eoqgVar);
                                    dvqz dvqzVar2 = dvqzVar;
                                    dwft dwftVar3 = dwftVar2;
                                    final dwcl dwclVar = new dwcl(dwcmVar2, settableFutureCreate, dvqzVar2, dwftVar3, uuid, dwjeVar2);
                                    final ezkl ezklVar = (ezkl) ((evuh) obj2);
                                    return eooq.f(listenableFutureF, new ejvr() { // from class: dwfs
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj3) {
                                            ((eywd) obj3).b(ezklVar, dwclVar);
                                            return null;
                                        }
                                    }, eoqgVar);
                                }
                            };
                            eoqg eoqgVar = eoqg.a;
                            final ListenableFuture listenableFutureG = eooq.g(listenableFutureE, eoozVar, eoqgVar);
                            return eork.b(listenableFutureG).b(new eooy() { // from class: dwch
                                @Override // defpackage.eooy
                                public final ListenableFuture a() {
                                    dwcm dwcmVar3 = dwcmVar2;
                                    ListenableFuture listenableFuture = listenableFutureG;
                                    dwft dwftVar3 = dwftVar2;
                                    UUID uuid2 = uuid;
                                    SettableFuture settableFuture = settableFutureCreate;
                                    long micros = settableFuture.isDone() ? TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) settableFuture.q()).longValue()) : 0L;
                                    try {
                                        dvyx dvyxVar = dwcmVar3.c;
                                        dwhp dwhpVarR = dwhq.r();
                                        dwhpVarR.g(10003);
                                        dwje dwjeVar3 = dwftVar3.a;
                                        dwhpVarR.n(dwjeVar3.c().f());
                                        dwhpVarR.o(dwjeVar3.d().E());
                                        dwhpVarR.p(uuid2.toString());
                                        dwhpVarR.j(11);
                                        dwhpVarR.f(1);
                                        dwhpVarR.e(micros);
                                        dvyxVar.b(dwhpVarR.a());
                                        return listenableFuture;
                                    } catch (Exception e) {
                                        int iA = dwda.b().a(dwcmVar3.a, e.getCause());
                                        int iValue = Status.c(e.getCause()).getCode().value();
                                        dvyx dvyxVar2 = dwcmVar3.c;
                                        dwhp dwhpVarR2 = dwhq.r();
                                        dwhpVarR2.g(10003);
                                        dwje dwjeVar4 = dwftVar3.a;
                                        dwhpVarR2.n(dwjeVar4.c().f());
                                        dwhpVarR2.o(dwjeVar4.d().E());
                                        dwhpVarR2.p(uuid2.toString());
                                        dwhpVarR2.j(11);
                                        dwhpVarR2.m(Integer.valueOf(iValue));
                                        dwhpVarR2.f(iA);
                                        dwhpVarR2.e(micros);
                                        dvyxVar2.b(dwhpVarR2.a());
                                        return listenableFuture;
                                    }
                                }
                            }, eoqgVar);
                        }
                    }, 0, dvxfVarA, true);
                }
            }, this.j));
            Callable callable = new Callable() { // from class: dvlp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dvmi dvmiVar = this.a;
                    dvmh dvmhVar2 = dvmhVar;
                    synchronized (dvmiVar) {
                        if (dvmiVar.u) {
                            dvhv.a("MsgReceiver", "BindV2 stream had an error. Not marking as open.");
                            return null;
                        }
                        dvmiVar.w = dvmhVar2;
                        dvmiVar.t = true;
                        dvmiVar.u = false;
                        dvmiVar.l.h(2);
                        dvhv.a("MsgReceiver", a.v(((dwiq) dvmiVar.b.c().f()).a, "BindV2 stream opened for "));
                        return null;
                    }
                }
            };
            eoqg eoqgVar = eoqg.a;
            return eork.b(eorgVarD.a(callable, eoqgVar)).a(new Callable() { // from class: dvlq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dvmi dvmiVar = this.a;
                    synchronized (dvmiVar) {
                        dvmiVar.v = false;
                    }
                    return null;
                }
            }, eoqgVar);
        }
        return eork.i(null);
    }

    public final synchronized void c() {
        dwck dwckVar;
        fcrp fcrpVar;
        if (this.t) {
            dvmh dvmhVar = this.w;
            if (dvmhVar != null && (dwckVar = dvmhVar.b) != null && (fcrpVar = dwckVar.a.a) != null) {
                fcrpVar.d("", Status.c.asException());
            }
            f();
        }
    }

    public final synchronized void d() {
        Set set = this.r;
        l(ekgb.n(set));
        set.clear();
    }

    public final synchronized void e() {
        Map map = this.s;
        i(ekgp.j(map));
        map.clear();
    }

    public final synchronized void f() {
        this.w = null;
        this.t = false;
        this.u = true;
        dvhv.a("MsgReceiver", "BindV2 stream closed for ".concat(((dwiq) this.b.c().f()).a));
    }

    public final void g(dwpx dwpxVar, dwpk dwpkVar) {
        Map map = this.z;
        if (map.containsKey(dwpxVar)) {
            ((Map) map.get(dwpxVar)).remove(dwpkVar);
            if (((Map) map.get(dwpxVar)).isEmpty()) {
                map.remove(dwpxVar);
            }
        }
    }

    public final void h(dwsg dwsgVar) {
        if (((Boolean) this.e.l(dwsgVar).second).booleanValue()) {
            this.q.remove(dwsgVar.e());
            dvyx dvyxVar = this.m;
            dwhp dwhpVarR = dwhq.r();
            dwhpVarR.g(10021);
            dwje dwjeVar = this.b;
            dwhpVarR.n(dwjeVar.c().f());
            dwhpVarR.o(dwjeVar.d().E());
            dwhpVarR.p(dwsgVar.e());
            dvyxVar.b(dwhpVarR.a());
        }
    }

    public final void i(final Map map) {
        dvxe dvxeVarC = dvxf.c();
        ((dvxa) dvxeVarC).a = "delivery receipt";
        dvxeVarC.b(dvxj.g);
        final dvxf dvxfVarA = dvxeVarC.a();
        for (final dwpx dwpxVar : map.keySet()) {
            this.e.o(dwxi.a(dwpxVar)).k(new dwwx() { // from class: dvmb
                @Override // defpackage.dwwx
                public final void a(Object obj) {
                    if (((dwov) obj).a()) {
                        return;
                    }
                    final dvxf dvxfVar = dvxfVarA;
                    final Map map2 = map;
                    final dwpx dwpxVar2 = dwpxVar;
                    final dvmi dvmiVar = this.a;
                    dvmiVar.j.submit(new Runnable() { // from class: dvls
                        @Override // java.lang.Runnable
                        public final void run() {
                            final dvmi dvmiVar2 = dvmiVar;
                            dwws dwwsVar = dvmiVar2.e;
                            final dwpx dwpxVar3 = dwpxVar2;
                            dwwsVar.q(dwpxVar3);
                            final SettableFuture settableFutureCreate = SettableFuture.create();
                            dwwsVar.q(dwpxVar3).k(new dwwx() { // from class: dvlx
                                @Override // defpackage.dwwx
                                public final void a(Object obj2) {
                                    settableFutureCreate.set((ejwi) obj2);
                                }
                            });
                            final Map map3 = map2;
                            final dvxf dvxfVar2 = dvxfVar;
                            eooz eoozVar = new eooz() { // from class: dvlz
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    ejwi ejwiVar = (ejwi) obj2;
                                    evqs evqsVarN = ejwiVar.g() ? ((dwpo) ejwiVar.c()).n() : evqs.b;
                                    dvmi dvmiVar3 = dvmiVar2;
                                    dvxf dvxfVar3 = dvxfVar2;
                                    Map map4 = map3;
                                    dwpx dwpxVar4 = dwpxVar3;
                                    return dvmiVar3.d.b(dvmiVar3.b, dwpxVar4, evqsVarN, ekgb.n((Collection) map4.get(dwpxVar4)), dvxfVar3);
                                }
                            };
                            eosc eoscVar = dvmiVar2.j;
                            eork.d(eooq.g(settableFutureCreate, eoozVar, eoscVar)).a(new Callable() { // from class: dvma
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    dvmiVar2.e.I(ekgb.n((Collection) map3.get(dwpxVar3)));
                                    return null;
                                }
                            }, eoscVar);
                        }
                    });
                }
            });
        }
    }

    public final boolean j(dwbf dwbfVar) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        dwag dwagVar = (dwag) dwbfVar;
        this.e.q(dwagVar.e).k(new dwwx() { // from class: dvly
            @Override // defpackage.dwwx
            public final void a(Object obj) {
                long j = dvmi.a;
                settableFutureCreate.set((ejwi) obj);
            }
        });
        try {
            ejwi ejwiVar = (ejwi) settableFutureCreate.q();
            if (!ejwiVar.g()) {
                dvhv.a("MsgReceiver", "Received receipt for unknown conversation ".concat(dwagVar.e.toString()));
                return false;
            }
            dwpo dwpoVar = (dwpo) ejwiVar.c();
            if (dwpoVar.h().e().equals(dwpu.ONE_TO_ONE)) {
                return true;
            }
            ejwi ejwiVarA = dwea.a(dwpoVar.o());
            return !ejwiVarA.g() || ((dwaa) ejwiVarA.c()).a.contains(dwagVar.d);
        } catch (Exception e) {
            dvhv.d("MsgReceiver", "Unexpected exception", e);
            return false;
        }
    }

    public final boolean k(dwpx dwpxVar, final long j) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        this.e.q(dwpxVar).k(new dwwx() { // from class: dvme
            @Override // defpackage.dwwx
            public final void a(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                long j2 = dvmi.a;
                boolean z = false;
                if (ejwiVar.g()) {
                    if (((dwpo) ejwiVar.c()).c() >= j) {
                        z = true;
                    }
                }
                settableFutureCreate.set(Boolean.valueOf(z));
            }
        });
        try {
            return ((Boolean) settableFutureCreate.q()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            dvhv.d("MsgReceiver", "Error determining if message should be dropped, won't drop", e);
            return false;
        }
    }

    public final void l(final List list) {
        if (list.isEmpty()) {
            eork.i(null);
            return;
        }
        dvxe dvxeVarC = dvxf.c();
        ((dvxa) dvxeVarC).a = "ack messages";
        dvxeVarC.b(dvxj.g);
        final dvxf dvxfVarA = dvxeVarC.a();
        eork.n(new eooy() { // from class: dvmd
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dvmi dvmiVar = this.a;
                dwcm dwcmVar = ((dwdo) dvmiVar.d).a;
                UUID uuidRandomUUID = UUID.randomUUID();
                dwje dwjeVar = dvmiVar.b;
                return dwcmVar.b(uuidRandomUUID, new dwfa(dwjeVar, list), eork.i(new dwcn(eywe.a(dwcmVar.d.c))), dwjeVar, dvxfVarA, true);
            }
        }, this.j);
    }

    public final synchronized void m() {
        this.o.a();
        b();
    }
}
