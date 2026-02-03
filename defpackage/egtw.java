package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtw implements egsh {
    public final egsu a;
    public final Executor b;
    private final Context c;
    private final Map d;
    private final ejwi e;
    private final egsq f;

    public egtw(Context context, egsu egsuVar, Map map, Executor executor, ejwi ejwiVar, egsq egsqVar) {
        this.c = context;
        this.a = egsuVar;
        this.d = map;
        this.b = executor;
        this.e = ejwiVar;
        this.f = egsqVar;
    }

    public static void i(qbp qbpVar) {
        if (qbpVar == null) {
            throw new NoSuchElementException("Work ID not found");
        }
        ejwl.a(!qbpVar.c.contains("tiktok_account_work"));
    }

    private final qav j(egsn egsnVar) {
        egry egryVar = (egry) egsnVar;
        ejwl.l(!egryVar.g.g());
        qau qauVar = new qau(TikTokListenableWorker.class);
        qauVar.g(egryVar.b);
        egsa egsaVar = (egsa) egryVar.d;
        qauVar.h(egsaVar.a, egsaVar.b);
        qauVar.j(egryVar.f);
        m(egsnVar, qauVar);
        return (qav) qauVar.b();
    }

    private final qbh k(egsn egsnVar, egsl egslVar, ejwi ejwiVar) {
        egry egryVar = (egry) egsnVar;
        ejwl.l(egryVar.g.g());
        if (ejwiVar.g()) {
            egsa egsaVar = (egsa) egslVar;
            qbg qbgVar = new qbg(TikTokListenableWorker.class, egsaVar.a, egsaVar.b, ((egsa) ejwiVar.c()).a, ((egsa) ejwiVar.c()).b);
            m(egsnVar, qbgVar);
            qbgVar.g(egryVar.b);
            egsa egsaVar2 = (egsa) egryVar.d;
            qbgVar.h(egsaVar2.a, egsaVar2.b);
            return (qbh) qbgVar.b();
        }
        egsa egsaVar3 = (egsa) egslVar;
        qbg qbgVar2 = new qbg(TikTokListenableWorker.class, egsaVar3.a, egsaVar3.b);
        m(egsnVar, qbgVar2);
        qbgVar2.g(egryVar.b);
        egsa egsaVar4 = (egsa) egryVar.d;
        qbgVar2.h(egsaVar4.a, egsaVar4.b);
        return (qbh) qbgVar2.b();
    }

    private final String l(Class cls) {
        String str = (String) this.d.get(cls);
        cls.toString();
        str.getClass();
        return str;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    private final void m(egsn egsnVar, qbt qbtVar) {
        egry egryVar = (egry) egsnVar;
        ekqg ekqgVarListIterator = egryVar.i.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            qbtVar.d((String) ekqgVarListIterator.next());
        }
        ejwi ejwiVar = egryVar.c;
        if (ejwiVar.g()) {
            qbtVar.c((qbf) ejwiVar.c());
        }
        ejwi ejwiVar2 = egryVar.j;
        if (ejwiVar2.g()) {
            ejwi ejwiVar3 = egryVar.k;
            if (ejwiVar3.g()) {
                egsa egsaVar = (egsa) ejwiVar3.c();
                qbtVar.f((pza) ejwiVar2.c(), egsaVar.a, egsaVar.b);
            }
        }
        ejwi ejwiVar4 = egryVar.e;
        if (ejwiVar4.g() && (qbtVar instanceof qbg)) {
            qbg qbgVar = (qbg) qbtVar;
            long jLongValue = ((Long) ejwiVar4.c()).longValue();
            if (jLongValue == Long.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            qjn qjnVar = qbgVar.c;
            qjnVar.w = jLongValue;
            qjnVar.x = 1;
        }
        pzn pznVar = new pzn();
        pznVar.b(egryVar.f);
        ejwi ejwiVar5 = egryVar.l;
        if (ejwiVar5.g()) {
            ejwi ejwiVar6 = this.e;
            ComponentName componentName = (ComponentName) ((ejwt) ejwiVar6).a.get(ejwiVar5.c());
            pznVar.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", componentName.getPackageName());
            pznVar.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", componentName.getClassName());
        }
        qbtVar.j(pznVar.a());
        String strL = l(egryVar.a);
        int length = strL.length();
        int i = egus.c;
        qbtVar.k("TikTokWorker#".concat(String.valueOf(strL.substring(Math.max(0, length + NetError.ERR_SSL_RENEGOTIATION_REQUESTED)))));
    }

    @Override // defpackage.egsh
    public final ListenableFuture a(String str) {
        return ((egur) this.f).c(this.a.b(str), new eooz() { // from class: egum
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((egsi) obj).a();
            }
        });
    }

    @Override // defpackage.egsh
    public final ListenableFuture b(UUID uuid) {
        return ((egur) this.f).c(this.a.c(uuid), new eooz() { // from class: eguo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((egsi) obj).b();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.egsh
    public final ListenableFuture c(egsn egsnVar) {
        Boolean bool = false;
        bool.getClass();
        egus.d(egsnVar);
        egry egryVar = (egry) egsnVar;
        ejwi ejwiVar = egryVar.l;
        if (ejwiVar.g()) {
            ejwl.m(!((String) ejwiVar.c()).equals(this.c.getPackageName()), "Default process must be targeted using shorthand '' empty string, not the package name.");
            ejwl.m(false, "You must depend upon //java/com/google/apps/tiktok/contrib/work/impl:multiprocess_module in order to use .setTargetProcess");
            ejwl.p(((ejwt) this.e).a.containsKey(ejwiVar.c()), "You must generate remote worker services using java/com/google/apps/tiktok/contrib/work/codegen/generated_remote_worker_service.bzl before targeting them by process name and include the service target in every scheduling process's dagger deps. Could not find [%s]", ejwiVar.c());
            ejwl.b(Collections.disjoint(egryVar.f.e().keySet(), ekhx.s("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME")), "You may not specify RemoteListenableWorker arguments at the same time as TikTok's targetProcess feature.");
        }
        return this.f.a(h(g(egsnVar)));
    }

    @Override // defpackage.egsh
    public final ListenableFuture d(UUID uuid) {
        ListenableFuture listenableFutureH = this.a.h(new qbs(fcur.M(new UUID[]{uuid}), null, null, 14));
        ejvr ejvrVar = new ejvr() { // from class: egtr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return null;
                }
                return (qbp) ekis.l(list);
            }
        };
        Executor executor = this.b;
        return eooq.f(eooq.f(listenableFutureH, ejvrVar, executor), new ejvr() { // from class: egts
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                qbp qbpVar = (qbp) obj;
                egtw.i(qbpVar);
                return qbpVar;
            }
        }, executor);
    }

    @Override // defpackage.egsh
    public final ListenableFuture e(String str) {
        return eooq.f(this.a.h(qbs.a(str)), new ejvr() { // from class: egtq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                for (qbp qbpVar : (List) obj) {
                    if (!qbpVar.c.contains("tiktok_account_work")) {
                        ekfwVar.h(qbpVar);
                    }
                }
                return ekfwVar.g();
            }
        }, this.b);
    }

    @Override // defpackage.egsh
    public final ListenableFuture f(String str) {
        return eooq.f(this.a.h(new qbs(null, fcur.M(new String[]{str}), null, 13)), new ejvr() { // from class: egtp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                List list = (List) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    egtw.i((qbp) it.next());
                }
                return list;
            }
        }, this.b);
    }

    final egsn g(egsn egsnVar) {
        return egsnVar.o(new ekph(egus.b(l(((egry) egsnVar).a))));
    }

    final ListenableFuture h(egsn egsnVar) {
        pzz pzzVar;
        egry egryVar = (egry) egsnVar;
        ejwi ejwiVar = egryVar.g;
        if (ejwiVar.g()) {
            ejwl.l(ejwiVar.g());
            ejwi ejwiVar2 = egryVar.h;
            if (ejwiVar2.g()) {
                ejwl.l(ejwiVar.g());
                ejwl.l(ejwiVar2.g());
                final qbh qbhVarK = k(egsnVar, ((egrz) ejwiVar.c()).a, ((egrz) ejwiVar.c()).b);
                return eooq.f(this.a.e(((egsb) ejwiVar2.c()).a, ((egsb) ejwiVar2.c()).b, qbhVarK), new ejvr() { // from class: egtt
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return qbhVarK.a;
                    }
                }, eoqg.a);
            }
            ejwl.l(ejwiVar.g());
            ejwl.l(!ejwiVar2.g());
            final qbh qbhVarK2 = k(egsnVar, ((egrz) ejwiVar.c()).a, ((egrz) ejwiVar.c()).b);
            return eooq.f(this.a.d(qbhVarK2), new ejvr() { // from class: egtv
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return qbhVarK2.a;
                }
            }, eoqg.a);
        }
        ejwl.l(!ejwiVar.g());
        ejwi ejwiVar3 = egryVar.h;
        if (!ejwiVar3.g()) {
            ejwl.l(!ejwiVar.g());
            ejwl.l(!ejwiVar3.g());
            final qav qavVarJ = j(egsnVar);
            return eooq.f(this.a.d(qavVarJ), new ejvr() { // from class: egtn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return qavVarJ.a;
                }
            }, eoqg.a);
        }
        ejwl.l(!ejwiVar.g());
        ejwl.l(ejwiVar3.g());
        final qav qavVarJ2 = j(egsnVar);
        egsu egsuVar = this.a;
        String str = ((egsb) ejwiVar3.c()).a;
        int iOrdinal = ((egsb) ejwiVar3.c()).b.ordinal();
        if (iOrdinal == 0) {
            pzzVar = pzz.a;
        } else if (iOrdinal == 1) {
            pzzVar = pzz.b;
        } else {
            if (iOrdinal == 2) {
                throw new IllegalArgumentException("One-time unique work does not support ExistingPeriodicWorkPolicy UPDATE. Use CANCEL_AND_REENQUEUE or KEEP instead");
            }
            if (iOrdinal != 3) {
                throw new RuntimeException(null, null);
            }
            pzzVar = pzz.a;
        }
        return eooq.f(egsuVar.f(str, pzzVar, qavVarJ2), new ejvr() { // from class: egtm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return qavVarJ2.a;
            }
        }, eoqg.a);
    }
}
