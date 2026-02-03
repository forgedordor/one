package defpackage;

import android.database.Cursor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehlp implements ebcg {
    private final Optional a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public ehlp(Optional optional, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar3.getClass();
        this.a = optional;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    @Override // defpackage.ebcg
    public final void a() throws IOException {
        this.a.isPresent();
        if (ebbu.b()) {
            if (!((Boolean) fdct.a((Optional) ((eyig) this.d).a, false)).booleanValue()) {
                ehlo ehloVar = (ehlo) this.b.b();
                if (ehloVar.b.a()) {
                    ehloVar.a(true);
                    return;
                } else {
                    boolean z = ehloVar.h;
                    return;
                }
            }
            final ehms ehmsVar = (ehms) this.c.b();
            if (ebbu.a(ehmsVar.b) == null) {
                ((ekrd) ehmsVar.h.j().h("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "runListeners", 92, "StartupAfterPackageReplacedWithRetryRunner.kt")).q("Couldn't determine current process name. Skipping startup after package replaced listeners.");
                return;
            }
            if (!ehmsVar.c.a()) {
                boolean z2 = ehmsVar.i;
                return;
            }
            int i = ehmsVar.f;
            ecmd ecmdVarA = ehmsVar.a();
            ecnw ecnwVar = new ecnw();
            ecnwVar.b("SELECT * FROM AllListenersSucceededVersionTable WHERE version_code = (?)");
            ecnwVar.c(Long.valueOf(i));
            eijs eijsVar = new eijs(ecmdVarA.a(ecnwVar.a()));
            final fdat fdatVar = new fdat() { // from class: ehmb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ecnr ecnrVar = ehms.a;
                    ((eopt) obj).getClass();
                    return Boolean.valueOf(((Cursor) obj2).getCount() > 0);
                }
            };
            eopo eopoVar = new eopo() { // from class: ehmj
                @Override // defpackage.eopo
                public final Object a(eopt eoptVar, Object obj) {
                    ecnr ecnrVar = ehms.a;
                    eoptVar.getClass();
                    return fdatVar.a(eoptVar, obj);
                }
            };
            ExecutorService executorService = ehmsVar.d;
            eiju eijuVarH = eijsVar.f(eopoVar, executorService).h();
            final fdap fdapVar = new fdap() { // from class: ehmk
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    Exception exc = (Exception) obj;
                    exc.getClass();
                    ((ekrd) ((ekrd) ehmsVar.h.j()).g(exc).h("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "didAllListenersAlreadySucceed$lambda$31", 346, "StartupAfterPackageReplacedWithRetryRunner.kt")).q("Failed to get all listeners succeeded at this version");
                    return false;
                }
            };
            eiju eijuVarE = eijuVarH.e(Exception.class, new ejvr() { // from class: ehml
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ecnr ecnrVar = ehms.a;
                    return fdapVar.invoke(obj);
                }
            }, eoqg.a);
            final fdap fdapVar2 = new fdap() { // from class: ehma
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        return eorv.a;
                    }
                    final ehms ehmsVar2 = ehmsVar;
                    ecmd ecmdVarA2 = ehmsVar2.a();
                    final int i2 = ehmsVar2.f;
                    ListenableFuture listenableFutureD = ecmdVarA2.d(new ecnz() { // from class: ehmm
                        @Override // defpackage.ecnz
                        public final void a(ecoa ecoaVar) throws InterruptedException {
                            ecnr ecnrVar = ehms.a;
                            ecnw ecnwVar2 = new ecnw();
                            ecnwVar2.b("DELETE FROM ListenerSuccessfulRuns WHERE version_code != ?");
                            Long lValueOf = Long.valueOf(i2);
                            ecnwVar2.c(lValueOf);
                            ecoaVar.g(ecnwVar2.a());
                            ecnw ecnwVar3 = new ecnw();
                            ecnwVar3.b("DELETE FROM AllListenersSucceededVersionTable WHERE version_code != ?");
                            ecnwVar3.c(lValueOf);
                            ecoaVar.g(ecnwVar3.a());
                        }
                    });
                    final fdap fdapVar3 = new fdap() { // from class: ehmn
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            Exception exc = (Exception) obj2;
                            exc.getClass();
                            ((ekrd) ((ekrd) ehmsVar2.h.j()).g(exc).h("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "tryPurgeOldVersions$lambda$22", 258, "StartupAfterPackageReplacedWithRetryRunner.kt")).q("Failed to purge old versions");
                            return eorv.a;
                        }
                    };
                    ListenableFuture listenableFutureF = eika.f(listenableFutureD, Exception.class, new eooz() { // from class: ehmo
                        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            ecnr ecnrVar = ehms.a;
                            return fdapVar3.invoke(obj2);
                        }
                    }, eoqg.a);
                    final fdap fdapVar4 = new fdap() { // from class: ehmd
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            ecnw ecnwVar2 = new ecnw();
                            ecnwVar2.b("SELECT * FROM ListenerSuccessfulRuns WHERE version_code = ?");
                            final ehms ehmsVar3 = ehmsVar2;
                            ecnwVar2.c(Long.valueOf(ehmsVar3.f));
                            eijs eijsVar2 = new eijs(ehmsVar3.a().a(ecnwVar2.a()));
                            final fdat fdatVar2 = new fdat() { // from class: ehlw
                                @Override // defpackage.fdat
                                public final Object a(Object obj3, Object obj4) {
                                    Cursor cursor = (Cursor) obj4;
                                    ecnr ecnrVar = ehms.a;
                                    ((eopt) obj3).getClass();
                                    fcww fcwwVar = new fcww((byte[]) null);
                                    while (cursor.moveToNext()) {
                                        String string = cursor.getString(cursor.getColumnIndexOrThrow("listener_key"));
                                        string.getClass();
                                        fcwwVar.add(string);
                                    }
                                    return fcva.a(fcwwVar);
                                }
                            };
                            eiju eijuVarH2 = eijsVar2.f(new eopo() { // from class: ehlx
                                @Override // defpackage.eopo
                                public final Object a(eopt eoptVar, Object obj3) {
                                    ecnr ecnrVar = ehms.a;
                                    eoptVar.getClass();
                                    return fdatVar2.a(eoptVar, obj3);
                                }
                            }, ehmsVar3.e).h();
                            final fdap fdapVar5 = new fdap() { // from class: ehly
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj3) {
                                    Exception exc = (Exception) obj3;
                                    exc.getClass();
                                    ((ekrd) ((ekrd) ehmsVar3.h.j()).g(exc).h("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "getListenersPreviouslySucceededAtThisVersion$lambda$27", 299, "StartupAfterPackageReplacedWithRetryRunner.kt")).q("Failed to get listeners previously succeeded at this version");
                                    return fcvo.a;
                                }
                            };
                            return eijuVarH2.e(Exception.class, new ejvr() { // from class: ehlz
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    ecnr ecnrVar = ehms.a;
                                    return fdapVar5.invoke(obj3);
                                }
                            }, eoqg.a);
                        }
                    };
                    eooz eoozVar = new eooz() { // from class: ehme
                        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            ecnr ecnrVar = ehms.a;
                            return fdapVar4.invoke(obj2);
                        }
                    };
                    ExecutorService executorService2 = ehmsVar2.d;
                    ListenableFuture listenableFutureK = eika.k(listenableFutureF, eoozVar, executorService2);
                    final Map map = ehmsVar2.j;
                    final fdap fdapVar5 = new fdap() { // from class: ehmf
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            List list = (List) obj2;
                            list.getClass();
                            Set setEntrySet = map.entrySet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : setEntrySet) {
                                if (!list.contains(((Map.Entry) obj3).getKey())) {
                                    arrayList.add(obj3);
                                }
                            }
                            fcww fcwwVar = new fcww((byte[]) null);
                            Iterator it = arrayList.iterator();
                            while (true) {
                                final ehms ehmsVar3 = ehmsVar2;
                                if (!it.hasNext()) {
                                    final List listA = fcva.a(fcwwVar);
                                    return eika.a(listA).a(new Callable() { // from class: ehlq
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            ecnr ecnrVar = ehms.a;
                                            List list2 = listA;
                                            boolean z3 = true;
                                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                                Iterator it2 = list2.iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    Object objQ = eork.q((ListenableFuture) it2.next());
                                                    objQ.getClass();
                                                    if (!((Boolean) objQ).booleanValue()) {
                                                        z3 = false;
                                                        break;
                                                    }
                                                }
                                            }
                                            return Boolean.valueOf(z3);
                                        }
                                    }, ehmsVar3.d);
                                }
                                final Map.Entry entry = (Map.Entry) it.next();
                                ehmr ehmrVar = new ehmr(entry);
                                ScheduledExecutorService scheduledExecutorService = ehmsVar3.e;
                                ListenableFuture listenableFutureP = eork.p(eika.i(ehmrVar, scheduledExecutorService), 180L, TimeUnit.SECONDS, scheduledExecutorService);
                                egoc.c(listenableFutureP, "Client StartupAfterPackageReplacedListener failed for key: %s", new esvh(esvg.NO_USER_DATA, entry.getKey()));
                                listenableFutureP.getClass();
                                eijz eijzVarD = eika.d(listenableFutureP);
                                Callable callable = new Callable() { // from class: ehlt
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ecnr ecnrVar = ehms.a;
                                        return true;
                                    }
                                };
                                eoqg eoqgVar = eoqg.a;
                                ListenableFuture listenableFutureA = eijzVarD.a(callable, eoqgVar);
                                final fdap fdapVar6 = new fdap() { // from class: ehlu
                                    @Override // defpackage.fdap
                                    public final Object invoke(Object obj4) {
                                        ecnr ecnrVar = ehms.a;
                                        ((Exception) obj4).getClass();
                                        return false;
                                    }
                                };
                                ListenableFuture listenableFutureE = eika.e(listenableFutureA, Exception.class, new ejvr() { // from class: ehlv
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj4) {
                                        ecnr ecnrVar = ehms.a;
                                        return fdapVar6.invoke(obj4);
                                    }
                                }, eoqgVar);
                                final fdap fdapVar7 = new fdap() { // from class: ehlr
                                    @Override // defpackage.fdap
                                    public final Object invoke(Object obj4) {
                                        Boolean bool2 = (Boolean) obj4;
                                        bool2.getClass();
                                        if (!bool2.booleanValue()) {
                                            return eork.i(false);
                                        }
                                        Map.Entry entry2 = entry;
                                        ehms ehmsVar4 = ehmsVar3;
                                        String str = (String) entry2.getKey();
                                        str.getClass();
                                        ecmd ecmdVarA3 = ehmsVar4.a();
                                        ecnw ecnwVar2 = new ecnw();
                                        ecnwVar2.b("INSERT INTO ListenerSuccessfulRuns (listener_key, version_code) VALUES (?, ?)");
                                        ecnwVar2.d(str);
                                        ecnwVar2.c(Long.valueOf(ehmsVar4.f));
                                        ListenableFuture listenableFutureB = ecmdVarA3.b(ecnwVar2.a());
                                        listenableFutureB.getClass();
                                        final fdap fdapVar8 = new fdap() { // from class: ehmp
                                            @Override // defpackage.fdap
                                            public final Object invoke(Object obj5) {
                                                ecnr ecnrVar = ehms.a;
                                                return eork.i(true);
                                            }
                                        };
                                        return eika.k(listenableFutureB, new eooz() { // from class: ehmq
                                            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj5) {
                                                ecnr ecnrVar = ehms.a;
                                                return fdapVar8.invoke(obj5);
                                            }
                                        }, ehmsVar4.d);
                                    }
                                };
                                fcwwVar.add(eika.k(listenableFutureE, new eooz() { // from class: ehls
                                    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj4) {
                                        ecnr ecnrVar = ehms.a;
                                        return fdapVar7.invoke(obj4);
                                    }
                                }, ehmsVar3.d));
                            }
                        }
                    };
                    ListenableFuture listenableFutureK2 = eika.k(listenableFutureK, new eooz() { // from class: ehmg
                        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            ecnr ecnrVar = ehms.a;
                            return fdapVar5.invoke(obj2);
                        }
                    }, executorService2);
                    final fdap fdapVar6 = new fdap() { // from class: ehmh
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            Boolean bool2 = (Boolean) obj2;
                            bool2.getClass();
                            if (!bool2.booleanValue()) {
                                return eorv.a;
                            }
                            ecmd ecmdVarA3 = ehmsVar2.a();
                            ecnw ecnwVar2 = new ecnw();
                            ecnwVar2.b("INSERT INTO AllListenersSucceededVersionTable (version_code) VALUES (?)");
                            ecnwVar2.c(Long.valueOf(r5.f));
                            ListenableFuture listenableFutureB = ecmdVarA3.b(ecnwVar2.a());
                            listenableFutureB.getClass();
                            return listenableFutureB;
                        }
                    };
                    return eika.k(listenableFutureK2, new eooz() { // from class: ehmi
                        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            ecnr ecnrVar = ehms.a;
                            return fdapVar6.invoke(obj2);
                        }
                    }, executorService2);
                }
            };
            egoc.c(eika.k(eijuVarE, new eooz() { // from class: ehmc
                /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    ecnr ecnrVar = ehms.a;
                    return fdapVar2.invoke(obj);
                }
            }, executorService), "StartupAfterPackageReplacedListenerImpl infrastructure failure.", new Object[0]);
        }
    }
}
