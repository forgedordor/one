package defpackage;

import android.util.SparseArray;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axfu {
    public static final eksp a = eksp.c("BugleDataModel");
    public static final cqce b = cqce.g("BugleDataModel", "SubscriptionsTracker");
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final axjq g;
    public final fcsu h;
    public final fcsu i;
    private final fcsu l;
    private volatile ekgb m;
    private final fcsu n;
    public final ReentrantLock k = new ReentrantLock();
    public final csq j = new csq();

    public axfu(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, axjq axjqVar, fcsu fcsuVar7, fcsu fcsuVar8) {
        this.n = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.l = fcsuVar5;
        this.f = fcsuVar6;
        this.g = axjqVar;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
    }

    public static brvp h(int i) {
        String[] strArr = ParticipantsTable.a;
        brvq brvqVar = new brvq();
        brvqVar.T(i);
        brvqVar.S(-1);
        brvqVar.U(0);
        brvqVar.l(-1L);
        return brvqVar;
    }

    static ekhx k() {
        ekhv ekhvVar = new ekhv();
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("SelfIdentitiesTracker#getExistingSelfSubIds");
        bsboVarE.h(new Function() { // from class: axfa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                eksp ekspVar = axfu.a;
                bsbxVar.w(-2);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekhvVar.j(bsboVarE.b().g());
        ekhx ekhxVarG = ekhvVar.g();
        ((eksl) a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getExistingSelfSubIds", 1100, "SubscriptionsTracker.java")).t("SelfIdentitiesTracker getExistingSelfSubIds returning %s", ekhxVarG);
        return ekhxVarG;
    }

    public static String l(crof crofVar) {
        return crofVar.w();
    }

    public static boolean r(brvp brvpVar) {
        return brvpVar.d != -2;
    }

    private final axcy s(final int i) {
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ((dqsn) this.d.b()).c("SelfParticipantsData#insertInactiveSelfParticipant", new ejxr() { // from class: axfk
            @Override // defpackage.ejxr
            public final Object get() {
                bsbo bsboVarE = ParticipantsTable.e();
                bsboVarE.A("insertInactiveSelfParticipant2");
                bsboVarE.s();
                final int i2 = i;
                bsboVarE.h(new Function() { // from class: axfg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsbx bsbxVar = (bsbx) obj;
                        eksp ekspVar = axfu.a;
                        bsbxVar.v(i2);
                        return bsbxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brzj brzjVar = (brzj) bsboVarE.b().p();
                try {
                    if (brzjVar.getCount() > 0 && brzjVar.moveToFirst()) {
                        ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) brzjVar.cQ();
                        ((eksl) axfu.a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "insertInactiveSelfParticipant", 406, "SubscriptionsTracker.java")).B("SelfIdentitiesTracker insertInactiveSelfParticipant quick return participant=%s for subId=%s", bindData2.R(), i2);
                        brzjVar.close();
                        return bindData2;
                    }
                    axfu axfuVar = this.a;
                    brzjVar.close();
                    brvp brvpVarH = axfu.h(i2);
                    axfuVar.g.e(brvpVarH);
                    ParticipantsTable.BindData bindDataA = brvpVarH.a();
                    long jB = axjq.b(bindDataA);
                    String[] strArr = btyx.a;
                    btxi btxiVar = new btxi();
                    btxiVar.h(i2);
                    btxiVar.d(String.valueOf(jB));
                    btxiVar.f(-1);
                    long jA = axjq.a(btxiVar.a());
                    cqbd cqbdVarC = axfu.b.c();
                    cqbdVarC.I("insert inactive self participant.");
                    cqbdVarC.z("participantId", jB);
                    cqbdVarC.z("selfParticipantId", jA);
                    cqbdVarC.y("subId", i2);
                    cqbdVarC.r();
                    return bindDataA;
                } catch (Throwable th) {
                    try {
                        brzjVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        this.k.lock();
        try {
            String strR = bindData.R();
            csq csqVar = this.j;
            axcy axcyVar = (axcy) csqVar.get(strR);
            if (axcyVar == null) {
                awtt awttVar = new awtt(bindData, ((alrj) this.l.b()).A(bindData));
                csqVar.put(strR, awttVar);
                ((eksl) a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "putSubscriptionIfAbsent", 452, "SubscriptionsTracker.java")).B("SelfIdentitiesTracker putSubscriptionIfAbsent adding participant=%s for subId=%s", strR, awttVar.e());
                axcyVar = awttVar;
            }
            return axcyVar;
        } finally {
            this.k.unlock();
        }
    }

    public final int a() {
        ejwl.l(((dqsn) this.d.b()).i());
        int i = 1073741824;
        do {
            i++;
        } while (k().contains(Integer.valueOf(i)));
        return i;
    }

    @Deprecated
    public final int b() {
        return ((aqrz) this.n.b()).a() ? ((crny) this.c.b()).f() : ((crny) this.c.b()).c();
    }

    public final axcy c(SelfIdentityId selfIdentityId) {
        axcy axcyVar;
        this.k.lock();
        if (selfIdentityId != null) {
            try {
                axcyVar = (axcy) this.j.get(selfIdentityId.b());
            } catch (Throwable th) {
                this.k.unlock();
                throw th;
            }
        } else {
            axcyVar = null;
        }
        ((eksl) a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getSubscriptionBySelfParticipantId", 276, "SubscriptionsTracker.java")).D("SelfIdentitiesTracker getSubscriptionBySelfParticipantId returning subId=%s for selfId=%s", axcyVar != null ? Integer.valueOf(axcyVar.e()) : "(null)", selfIdentityId);
        this.k.unlock();
        return axcyVar;
    }

    public final axcy d(int i) {
        axcy axcyVar;
        this.k.lock();
        try {
            csq csqVar = this.j;
            int i2 = csqVar.d;
            do {
                i2--;
                if (i2 < 0) {
                    this.k.unlock();
                    ((eksl) a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getSubscriptionBySubId", 301, "SubscriptionsTracker.java")).r("SubscriptionsTracker getSubscriptionBySubId did not find subId=%s in cache", i);
                    return null;
                }
                axcyVar = (axcy) csqVar.g(i2);
            } while (axcyVar.e() != i);
            return axcyVar;
        } finally {
            this.k.unlock();
        }
    }

    @Deprecated
    public final axcy e() {
        eieu eieuVarK = eiiy.k("loadDefaultSubscription");
        try {
            axcy axcyVarG = g(b());
            eieuVarK.close();
            return axcyVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final axcy f(SelfIdentityId selfIdentityId) {
        eieu eieuVarK = eiiy.k("loadSubscriptionBySelfParticipantId");
        try {
            axcy axcyVarC = c(selfIdentityId);
            if (axcyVarC != null) {
                eieuVarK.close();
                return axcyVarC;
            }
            ((eksl) a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "loadSubscriptionBySelfParticipantId", 347, "SubscriptionsTracker.java")).t("SubscriptionsTracker#loadSubscriptionBySelfParticipantId had cache miss for self %s. Refreshing self participants", selfIdentityId);
            o();
            axcy axcyVarC2 = c(selfIdentityId);
            if (axcyVarC2 == null) {
                cqbd cqbdVarE = b.e();
                cqbdVarE.I("Subscription does not exist.");
                cqbdVarE.A("selfId", selfIdentityId);
                cqbdVarE.r();
            }
            eieuVarK.close();
            return axcyVarC2;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final axcy g(int i) {
        axcy axcyVarS;
        eieu eieuVarK = eiiy.k("loadSubscriptionBySubId");
        try {
            axcy axcyVarD = d(i);
            if (axcyVarD != null) {
                eieuVarK.close();
                return axcyVarD;
            }
            ((eksl) a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "loadSubscriptionBySubId", 366, "SubscriptionsTracker.java")).r("SelfParticipantsData#loadSubscriptionBySubId miss for subId=%s", i);
            if (i == -1 || ((crny) this.c.b()).h(i).d() != -1) {
                o();
                axcy axcyVarD2 = d(i);
                if (axcyVarD2 == null) {
                    cqbd cqbdVarE = b.e();
                    cqbdVarE.I("Subscription is not active after refresh.");
                    cqbdVarE.y("subId", i);
                    cqbdVarE.r();
                    axcyVarS = s(i);
                } else {
                    axcyVarS = axcyVarD2;
                }
            } else {
                cqbd cqbdVarA = b.a();
                cqbdVarA.I("Subscription is not active.");
                cqbdVarA.y("subId", i);
                cqbdVarA.r();
                axcyVarS = s(i);
            }
            eieuVarK.close();
            return axcyVarS;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb i() {
        eieu eieuVarK = eiiy.k("getActiveSubscriptions");
        try {
            this.k.lock();
            try {
                csq csqVar = this.j;
                int i = csqVar.d;
                SparseArray sparseArray = new SparseArray(i);
                for (int i2 = 0; i2 < i; i2++) {
                    axcy axcyVar = (axcy) csqVar.g(i2);
                    if (axcyVar.h() && !axcyVar.i()) {
                        sparseArray.put(axcyVar.d(), axcyVar);
                    }
                }
                int size = sparseArray.size();
                ekfw ekfwVarD = ekgb.d(size + 1);
                axcy axcyVarD = d(-1);
                if (axcyVarD == null) {
                    b.r("cannot find subscription with DEFAULT_SELF_SUB_ID.");
                } else if (axcyVarD.h()) {
                    ekfwVarD.h(axcyVarD);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    ekfwVarD.h((axcy) sparseArray.valueAt(i3));
                }
                ekgb ekgbVarG = ekfwVarD.g();
                ((eksl) a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getActiveSubscriptions", 256, "SubscriptionsTracker.java")).w("SelfIdentitiesTracker getActiveSelfIdentities found %s activeSubscriptions and is returning %s", sparseArray.size(), Collection.EL.stream(ekgbVarG).map(new Function() { // from class: axfc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((axcy) obj).e());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.a));
                eieuVarK.close();
                return ekgbVarG;
            } finally {
                this.k.unlock();
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb j() {
        if (this.m == null) {
            q();
        }
        ekgb ekgbVar = this.m;
        ekgbVar.getClass();
        return ekgbVar;
    }

    public final void m(int i) {
        int iA = a();
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("allocateNewVirtualSubId-participants");
        bsbsVarF.P(iA);
        bsbsVarF.O(-1);
        bsbsVarF.am();
        if (bsbsVarF.a(i) > 0) {
            String[] strArr = btyx.a;
            btyu btyuVar = new btyu();
            btyuVar.ap("allocateNewVirtualSubId-selfParticipants");
            btyuVar.e(iA);
            btyuVar.d(-1);
            btyuVar.am();
            btyuVar.a(i);
            cqbd cqbdVarC = b.c();
            cqbdVarC.I("Successfully allocated new virtual subId.");
            cqbdVarC.m(i);
            cqbdVarC.y("virtualSubId", iA);
            cqbdVarC.r();
        }
    }

    public final void n(List list) {
        this.k.lock();
        try {
            csq csqVar = this.j;
            csqVar.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                csqVar.put(bindData.R(), new awtt(bindData, ((alrj) this.l.b()).A(bindData)));
            }
            eksl ekslVar = (eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "bindToTrackingMap", 146, "SubscriptionsTracker.java");
            Stream map = Collection.EL.stream(csqVar.entrySet()).map(new Function() { // from class: axfb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    eksp ekspVar = axfu.a;
                    return "ParticipantId=" + ((String) entry.getKey()) + " subId=" + ((axcy) entry.getValue()).e();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            ekslVar.t("SubscriptionsTracker bindToTrackingMap bound participants: %s", map.collect(ekcv.a));
        } finally {
            this.k.unlock();
        }
    }

    @Deprecated
    public final void o() {
        p(((crny) this.c.b()).m());
    }

    public final void p(final List list) {
        eieu eieuVarK = eiiy.k("refreshSelfParticipantList");
        try {
            cqbd cqbdVarA = b.a();
            cqbdVarA.I("refreshSelfParticipantList.");
            cqbdVarA.L("count", list);
            cqbdVarA.r();
            eksl ekslVar = (eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "refreshSelfParticipantListInternal", 539, "SubscriptionsTracker.java");
            Stream map = Collection.EL.stream(list).map(new Function() { // from class: axfq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((crof) obj).a());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            ekslVar.t("SubscriptionsTracker#refreshSelfParticipantList(%s)", map.collect(ekcv.a));
            ((dqsn) this.d.b()).d("SelfParticipantsData#refreshSelfParticipantList", new Runnable() { // from class: axfr
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:108:0x0139 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:110:0x00cb A[SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r2v17, types: [alqm, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v19, types: [alqm, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v6, types: [alqm, java.lang.Object] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() throws java.io.IOException {
                    /*
                        Method dump skipped, instructions count: 1408
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.axfr.run():void");
                }
            });
            q();
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void q() {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("SelfIdentitiesTracker#repopulateCaches");
        bsboVarE.h(new Function() { // from class: axew
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                eksp ekspVar = axfu.a;
                bsbxVar.w(-2);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brzh brzhVar = ParticipantsTable.c;
        bsboVarE.d(new bsbl(brzhVar.e, false), new bsbl(brzhVar.a, false));
        ekgb ekgbVarZ = bsboVarE.b().z();
        n(ekgbVarZ);
        Stream map = Collection.EL.stream(ekgbVarZ).filter(new Predicate() { // from class: axex
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
                eksp ekspVar = axfu.a;
                return ((ParticipantsTable.BindData) obj).B() != null;
            }
        }).map(new Function() { // from class: axey
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                eksp ekspVar = axfu.a;
                return new awtu(bindData.R(), bindData.B());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        Collector collector = ekcv.a;
        this.m = (ekgb) map.collect(collector);
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "repopulateCaches", 695, "SubscriptionsTracker.java")).t("set orderedRowIdAndTokenPairs: %s", Collection.EL.stream(ekgbVarZ).map(new Function() { // from class: axez
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                eksp ekspVar = axfu.a;
                return "rowId=" + bindData.R() + " subId= " + bindData.r() + " token=" + String.valueOf(bindData.B());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(collector));
    }
}
