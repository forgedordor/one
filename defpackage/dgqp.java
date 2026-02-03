package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgqp implements dggz, dggw, dgqr {
    public static final ekrg a = ekrg.c("com/google/android/ims/provisioning/manager/RcsProvisioningManager");
    public final fcsu c;
    public final dgia d;
    public final dgio e;
    public final cmlb f;
    public final dhkw g;
    public final cjpk h;
    public final awyu i;
    private final List l;
    private final eosc m;
    private final eosc n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    public final dhhr b = new dhhr();
    private final dhhr j = new dhhr();
    private final AtomicBoolean k = new AtomicBoolean();

    public dgqp(fcsu fcsuVar, final eosc eoscVar, eosc eoscVar2, Set set, Set set2, Set set3, Optional optional, List list, dgia dgiaVar, dgio dgioVar, fcsu fcsuVar2, fcsu fcsuVar3, cmlb cmlbVar, dhkw dhkwVar, cjpk cjpkVar, Set set4, awyu awyuVar, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.c = fcsuVar;
        this.l = list;
        this.m = eoscVar;
        this.n = eoscVar2;
        this.d = dgiaVar;
        this.e = dgioVar;
        this.o = fcsuVar2;
        this.p = fcsuVar3;
        this.f = cmlbVar;
        this.g = dhkwVar;
        this.h = cjpkVar;
        this.i = awyuVar;
        this.q = fcsuVar4;
        this.r = fcsuVar5;
        optional.ifPresent(new Consumer() { // from class: dgph
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Optional optionalEmpty = Optional.empty();
                dgqp dgqpVar = this.a;
                dgqi dgqiVar = new dgqi((dggy) obj, optionalEmpty, new dgpe(dgqpVar));
                dhhp dhhpVarF = dhhq.f(dgqiVar, eoscVar);
                dhhpVarF.c(false);
                dhhpVarF.b(dgqiVar.a);
                ((dhhf) dhhpVarF).c = new Function() { // from class: dgpg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return true;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                };
                dgqpVar.b.a(dhhpVarF.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            final dgqi dgqiVar = new dgqi((dggy) it.next(), Optional.empty(), new dgpe(this));
            dhhr dhhrVar = this.b;
            dhhp dhhpVarF = dhhq.f(dgqiVar, eoscVar);
            dhhpVarF.c(false);
            dhhpVarF.b(dgqiVar.a);
            ((dhhf) dhhpVarF).c = new Function() { // from class: dgpp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    dgqj dgqjVar = (dgqj) obj;
                    boolean z = false;
                    if (dgqjVar != null) {
                        Optional optional2 = dgqiVar.b;
                        if (optional2.isEmpty() || ((String) optional2.get()).equals(dgqjVar.b())) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            };
            dhhrVar.a(dhhpVarF.a());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            G(Optional.empty(), (dggv) it2.next(), eoscVar);
        }
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            dggm dggmVar = (dggm) it3.next();
            dgqh dgqhVar = new dgqh(dggmVar, dgiaVar);
            dgqk dgqkVar = new dgqk(dgqhVar);
            dhhr dhhrVar2 = this.j;
            dhhp dhhpVarF2 = dhhq.f(dgqkVar, eoscVar);
            dhhpVarF2.c(false);
            dhhpVarF2.b(dggmVar);
            ((dhhf) dhhpVarF2).c = new Function() { // from class: dgpa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return true;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            };
            dhhrVar2.a(dhhpVarF2.a());
            dgqn dgqnVar = new dgqn(dgqhVar);
            dhhr dhhrVar3 = this.b;
            dhhp dhhpVarF3 = dhhq.f(dgqnVar, eoscVar);
            dhhpVarF3.c(false);
            dhhpVarF3.b(dggmVar);
            ((dhhf) dhhpVarF3).c = new Function() { // from class: dgqa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return true;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            };
            dhhrVar3.a(dhhpVarF3.a());
        }
        Iterator it4 = set4.iterator();
        while (it4.hasNext()) {
            awtw awtwVar = (awtw) it4.next();
            dgqo dgqoVar = new dgqo(awtwVar, new dgpq(this), new Function() { // from class: dgpm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.a.i((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, this.f, this.h);
            dhhr dhhrVar4 = this.j;
            dhhp dhhpVarF4 = dhhq.f(dgqoVar, eoscVar);
            dhhpVarF4.c(false);
            dhhpVarF4.b(awtwVar);
            ((dhhf) dhhpVarF4).c = new Function() { // from class: dgpn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return true;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            };
            dhhrVar4.a(dhhpVarF4.a());
        }
    }

    private final Optional F(int i) {
        return this.f.g(i, true).map(new dgpu());
    }

    private final void G(Optional optional, dggv dggvVar, Executor executor) {
        final dgqe dgqeVar = new dgqe(dggvVar, optional);
        dhhp dhhpVarF = dhhq.f(dgqeVar, executor);
        dhhpVarF.c(false);
        dhhpVarF.b(dggvVar);
        ((dhhf) dhhpVarF).c = new Function() { // from class: dgpr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r5) {
                /*
                    r4 = this;
                    dgqf r5 = (defpackage.dgqf) r5
                    r0 = 0
                    if (r5 == 0) goto L21
                    dgqe r1 = r1
                    j$.util.Optional r1 = r1.a
                    boolean r2 = r1.isEmpty()
                    r3 = 1
                    if (r2 != 0) goto L20
                    java.lang.Object r1 = r1.get()
                    java.lang.String r5 = r5.b()
                    java.lang.String r1 = (java.lang.String) r1
                    boolean r5 = r1.equals(r5)
                    if (r5 == 0) goto L21
                L20:
                    r0 = r3
                L21:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dgpr.apply(java.lang.Object):java.lang.Object");
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        };
        this.j.a(dhhpVarF.a());
    }

    private final void H(Optional optional, final dggn dggnVar) {
        final cmmh cmmhVar = (cmmh) this.f.j(dggo.a(dggnVar)).orElse(null);
        if (cmmhVar == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addIdentityMapping", 903, "RcsProvisioningManager.java")).t("No SimSubscriptionInfo for sim with id: %s", dhiz.SIM_ID.c(dggo.a(dggnVar)));
        } else {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addIdentityMapping", 908, "RcsProvisioningManager.java")).G("Configuration is empty: %s for simId: %s", optional.isEmpty(), dhiz.SIM_ID.c(dggo.a(dggnVar)));
            optional.filter(new Predicate() { // from class: dgpf
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
                    return !((dgiq) obj).U();
                }
            }).flatMap(new dgpq(this)).ifPresentOrElse(new Consumer() { // from class: dgpy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.d.v(dggnVar, (dggk) obj, cmmhVar.d);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Runnable() { // from class: dgpz
                @Override // java.lang.Runnable
                public final void run() {
                    dgqp dgqpVar = this.a;
                    dhkw dhkwVar = dgqpVar.g;
                    cmmh cmmhVar2 = cmmhVar;
                    if (dhkwVar.b(cmmhVar2.d)) {
                        dgqpVar.d.v(dggnVar, null, cmmhVar2.d);
                    } else {
                        ekrw ekrwVarH2 = dgqp.a.h();
                        ekrwVarH2.X(eksq.a, "RcsProvisioningManager");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addIdentityMappingWithoutPhoneNumberIfSingleRegistration", 929, "RcsProvisioningManager.java")).w("Called addIdentityMappingWithoutPhoneNumberIfSingleRegistration and isSingleRegistration is false for sub id: %s and simId %s", cmmhVar2.d, dhiz.SIM_ID.c(cmmhVar2.c));
                    }
                }
            });
        }
    }

    private final void I(final int i) {
        if (i < 0) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "logProvisioningApisComparisonEvent", 1009, "RcsProvisioningManager.java")).r("subId is invalid: %s", i);
        } else {
            fcsu fcsuVar = this.r;
            awxu awxuVar = (awxu) fcsuVar.b();
            final eiju eijuVarC = auvw.c(awxuVar.b, fcyi.a, fdjz.a, new awxq(awxuVar, i, null));
            awxu awxuVar2 = (awxu) fcsuVar.b();
            final eiju eijuVarC2 = auvw.c(awxuVar2.b, fcyi.a, fdjz.a, new awxt(awxuVar2, i, null));
            auvh.f(eijx.k(eijuVarC, eijuVarC2).b(new eooy() { // from class: dgpc
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    awxn awxnVar;
                    List list = (List) eork.q(eijuVarC);
                    eiju eijuVar = eijuVarC2;
                    int i2 = i;
                    try {
                        awxnVar = (awxn) eork.q(eijuVar);
                    } catch (ExecutionException e) {
                        ekrw ekrwVarJ = dgqp.a.j();
                        ekrwVarJ.X(eksq.a, "RcsProvisioningManager");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "logProvisioningApisComparisonEvent", 1027, "RcsProvisioningManager.java")).r("Failed to get myIdentity for subId: %s", i2);
                        awxnVar = null;
                    }
                    dgqp dgqpVar = this.a;
                    if (list.isEmpty() && awxnVar == null) {
                        return dgqpVar.D(25, i2, false);
                    }
                    if (list.size() > 1) {
                        return dgqpVar.D(27, i2, true);
                    }
                    if (list.isEmpty()) {
                        ekrw ekrwVarH2 = dgqp.a.h();
                        ekrwVarH2.X(eksq.a, "RcsProvisioningManager");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "logProvisioningApisComparisonEvent", 1045, "RcsProvisioningManager.java")).r("No active myIdentity found for subId: %s", i2);
                    }
                    boolean z = list.size() == 1;
                    Optional optionalE = z ? dgqpVar.i.a((awxn) list.get(0)).e() : awxnVar != null ? dgqpVar.i.a(awxnVar).e() : Optional.empty();
                    Optional optionalN = optionalE.isPresent() ? dgqpVar.n((String) optionalE.get()) : Optional.empty();
                    Optional optionalY = dgqpVar.y(i2);
                    if (optionalN.isEmpty()) {
                        boolean zIsPresent = optionalY.isPresent();
                        if (z) {
                            return dgqpVar.D(true != zIsPresent ? 28 : 26, i2, false);
                        }
                        return dgqpVar.D(true != zIsPresent ? 29 : 18, i2, false);
                    }
                    if (optionalY.isEmpty()) {
                        return dgqpVar.D(18, i2, true);
                    }
                    if (((UUID) optionalY.get()).equals(optionalN.get())) {
                        return dgqpVar.D(23, i2, z);
                    }
                    dgqpVar.h.f(19, Integer.valueOf(i2), null, ((UUID) optionalN.get()).toString(), ((UUID) optionalY.get()).toString(), z);
                    return eijx.e(null);
                }
            }, this.n), "Failed to log provisioning apis comparison event for subId");
        }
    }

    private final void J(final dggk dggkVar) {
        aubn aubnVar = (aubn) aubq.a.createBuilder();
        aubnVar.copyOnWrite();
        aubq aubqVar = (aubq) aubnVar.instance;
        aubqVar.b |= 2;
        aubqVar.d = dggkVar.a;
        aubp aubpVar = aubp.PHONE;
        aubnVar.copyOnWrite();
        aubq aubqVar2 = (aubq) aubnVar.instance;
        aubqVar2.c = aubpVar.f;
        aubqVar2.b |= 1;
        aubq aubqVar3 = (aubq) aubnVar.build();
        awxu awxuVar = (awxu) this.r.b();
        aubqVar3.getClass();
        auvh.f(auvw.c(awxuVar.b, fcyi.a, fdjz.a, new awxp(awxuVar, aubqVar3, null)).i(new eooz() { // from class: dgpw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dggk dggkVar2 = dggkVar;
                dgqp dgqpVar = this.a;
                awxn awxnVar = (awxn) obj;
                if (awxnVar == null) {
                    return dgqpVar.E(25, dggkVar2, false);
                }
                awyu awyuVar = dgqpVar.i;
                Optional optionalE = awyuVar.a(awxnVar).e();
                Optional optionalN = optionalE.isPresent() ? dgqpVar.n((String) optionalE.get()) : Optional.empty();
                Integer num = (Integer) awyuVar.a(awxnVar).a().listIterator().next();
                if (num == null) {
                    throw new IllegalStateException("No subId found for my identity mapping from phone number.");
                }
                Optional optionalY = dgqpVar.y(num.intValue());
                if (optionalN.isEmpty()) {
                    return dgqpVar.E(true != optionalY.isPresent() ? 28 : 26, dggkVar2, false);
                }
                if (optionalY.isEmpty()) {
                    return dgqpVar.E(18, dggkVar2, true);
                }
                if (((UUID) optionalY.get()).equals(optionalN.get())) {
                    return dgqpVar.E(24, dggkVar2, true);
                }
                dgqpVar.h.f(20, null, dggkVar2, ((UUID) optionalN.get()).toString(), ((UUID) optionalY.get()).toString(), true);
                return eijx.e(null);
            }
        }, this.n), "Failed to log provisioning apis comparison event for phone number");
    }

    public final void A(cmmh cmmhVar) {
        eieu eieuVarK = eiiy.k("RcsProvisioningManager#addAvailabilityToIdentityMapForSim");
        try {
            final dggp dggpVar = new dggp(cmmhVar.c);
            Optional optionalM = m(cmmhVar.c);
            ekrg ekrgVar = a;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForSim", 613, "RcsProvisioningManager.java")).t("qualifiedProvisioningEngineAdapter is present: %s", Boolean.valueOf(optionalM.isPresent()));
            dgid dgidVar = (dgid) optionalM.map(new Function() { // from class: dgqb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new dgid(((chza) ((ckgw) obj).a.a()).v(dggpVar));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null);
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForSim", 622, "RcsProvisioningManager.java")).t("getAvailabilityForRcsProvisioningIdSync: %s", dgidVar);
            if (dgidVar == null) {
                ekrw ekrwVarH3 = ekrgVar.h();
                ekrwVarH3.X(ekrzVar, "RcsProvisioningManager");
                ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForSim", 625, "RcsProvisioningManager.java")).t("Cannot get provisioning adapter for simId: %s", cmmhVar.c);
            } else {
                r(dggpVar.a, dgidVar);
            }
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

    public final synchronized void B() {
        eieu eieuVarK;
        eieu eieuVarK2 = eiiy.k("RcsProvisioningManager#doPopulateRcsAvailableIdentityMapIfEmpty");
        try {
            dgia dgiaVar = this.d;
            if (!dgiaVar.o()) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "RcsProvisioningManager");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "doPopulateRcsAvailableIdentityMapIfEmpty", 538, "RcsProvisioningManager.java")).q("Identity mapping not empty. Backfill not required.");
                dgiaVar.u();
            } else if (this.k.get()) {
                ekrw ekrwVarH2 = a.h();
                ekrwVarH2.X(eksq.a, "RcsProvisioningManager");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "doPopulateRcsAvailableIdentityMapIfEmpty", 544, "RcsProvisioningManager.java")).q("Skipping backfill of identity mapping.");
            } else {
                ekrg ekrgVar = a;
                ekrw ekrwVarH3 = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH3.X(ekrzVar, "RcsProvisioningManager");
                ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "doPopulateRcsAvailableIdentityMapIfEmpty", 548, "RcsProvisioningManager.java")).q("Calculating availability");
                if (((Boolean) this.p.b()).booleanValue()) {
                    eieuVarK = eiiy.k("RcsProvisioningManager#addAvailabilityToIdentityMapForAllSims");
                    try {
                        ekrw ekrwVarH4 = ekrgVar.h();
                        ekrwVarH4.X(eksq.a, "RcsProvisioningManager");
                        ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForAllSims", 587, "RcsProvisioningManager.java")).q("Computing availability for all sims.");
                        Iterator it = this.f.q().iterator();
                        while (it.hasNext()) {
                            A((cmmh) it.next());
                        }
                        eieuVarK.close();
                        this.d.u();
                        this.k.set(true);
                    } finally {
                    }
                } else {
                    eieuVarK = eiiy.k("RcsProvisioningManager#addAvailabilityToIdentityMapForDefaultSim");
                    try {
                        ekrw ekrwVarH5 = ekrgVar.h();
                        ekrwVarH5.X(ekrzVar, "RcsProvisioningManager");
                        ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForDefaultSim", 574, "RcsProvisioningManager.java")).q("Computing availability for default call sim.");
                        this.f.h(cmla.a).ifPresentOrElse(new Consumer() { // from class: dgps
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                this.a.A((cmmh) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new Runnable() { // from class: dgpt
                            @Override // java.lang.Runnable
                            public final void run() {
                                ekrw ekrwVarH6 = dgqp.a.h();
                                ekrwVarH6.X(eksq.a, "RcsProvisioningManager");
                                ((ekrd) ((ekrd) ekrwVarH6).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForDefaultSim", 580, "RcsProvisioningManager.java")).q("No default call sim to calculate availability.");
                            }
                        });
                        eieuVarK.close();
                        this.d.u();
                        this.k.set(true);
                    } finally {
                    }
                }
            }
            eieuVarK2.close();
        } finally {
        }
    }

    final boolean C() {
        return this.k.get();
    }

    public final eiju D(int i, int i2, boolean z) {
        this.h.e(i, Integer.valueOf(i2), null, z);
        return eijx.e(null);
    }

    public final eiju E(int i, dggk dggkVar, boolean z) {
        this.h.e(i, null, dggkVar, z);
        return eijx.e(null);
    }

    @Override // defpackage.dggw
    public final dgid a(dggk dggkVar) {
        if (((Boolean) this.q.b()).booleanValue()) {
            J(dggkVar);
        }
        return (dgid) this.d.h(dggkVar).map(new dgpu()).map(new Function() { // from class: dgpv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.b(((dggp) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new dgid(enwr.DISABLED_SIM_ABSENT));
    }

    @Override // defpackage.dggw
    public final dgid b(String str) {
        Optional optionalM = m(str);
        return optionalM.isEmpty() ? new dgid(enwr.BUGLE_LOADING_AVAILABILITY_EXCEPTION) : ((ckgw) optionalM.get()).a(str);
    }

    @Override // defpackage.dggw
    public final dgid c(int i) {
        dgid dgidVar;
        eieu eieuVarK = eiiy.k("RcsProvisioningManager#getCachedRcsAvailabilityForSubId");
        try {
            if (((Boolean) this.q.b()).booleanValue()) {
                I(i);
            }
            if (i < 0) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "RcsProvisioningManager");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getCachedRcsAvailabilityForSubIdInTrace", 309, "RcsProvisioningManager.java")).r("getCachedRcsAvailabilityForSubId called with an invalid sub id: %s", i);
                dgidVar = new dgid(enwr.BUGLE_LOADING_AVAILABILITY_EXCEPTION);
            } else {
                dgidVar = (dgid) F(i).map(new dgoy()).map(new dgoz(this)).orElse(new dgid(enwr.BUGLE_LOADING_AVAILABILITY_EXCEPTION));
            }
            eieuVarK.close();
            return dgidVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dggw
    public final eiju d(final int i) {
        eieu eieuVarK = eiiy.k("RcsProvisioningManager#getRcsAvailabilityForSubIdAsync");
        try {
            if (((Boolean) this.q.b()).booleanValue()) {
                I(i);
            }
            eiju eijuVarH = eiju.g(g()).h(new ejvr() { // from class: dgpl
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    int i2 = i;
                    if (i2 < 0) {
                        ekrw ekrwVarJ = dgqp.a.j();
                        ekrwVarJ.X(eksq.a, "RcsProvisioningManager");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getRcsAvailabilityForSubId", 331, "RcsProvisioningManager.java")).r("getRcsAvailabilityForSubId called with an invalid sub id: %s", i2);
                        return new dgid(enwr.BUGLE_LOADING_AVAILABILITY_EXCEPTION);
                    }
                    dgqp dgqpVar = this.a;
                    Optional map = dgqpVar.f.i(i2).map(new Function() { // from class: dgqd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((cmmh) obj2).c;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: dgow
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return new dggp((String) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    if (map.isEmpty()) {
                        ekrw ekrwVarJ2 = dgqp.a.j();
                        ekrwVarJ2.X(eksq.a, "RcsProvisioningManager");
                        ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getSimIdFromSubId", 835, "RcsProvisioningManager.java")).r("getSimIdFromSubId for subId: %s returned no mapping.", i2);
                    }
                    return (dgid) map.map(new dgoy()).map(new dgoz(dgqpVar)).orElse(new dgid(enwr.BUGLE_LOADING_AVAILABILITY_EXCEPTION));
                }
            }, this.m);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dggw
    public final eiju e() {
        eieu eieuVarK = eiiy.k("RcsProvisioningManager#getRcsAvailablePhoneNumbersAsync");
        try {
            eiju eijuVarH = eiju.g(g()).h(new ejvr() { // from class: dgpb
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return this.a.z();
                }
            }, this.n);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dggw
    public final eiju f(String str) {
        try {
            final dggk dggkVarA = ((dggl) this.o.b()).a(str);
            return e().h(new ejvr() { // from class: dgpo
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((Set) obj).contains(dggkVarA));
                }
            }, this.m);
        } catch (IllegalArgumentException unused) {
            return eijx.e(false);
        }
    }

    @Override // defpackage.dggw
    public final ListenableFuture g() {
        dgia dgiaVar = this.d;
        if (!dgiaVar.o()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "populateRcsAvailableIdentityMapIfEmpty", 515, "RcsProvisioningManager.java")).q("Identity mapping not empty. Backfill not required.");
            dgiaVar.u();
            return eorv.a;
        }
        if (this.k.get()) {
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "populateRcsAvailableIdentityMapIfEmpty", 521, "RcsProvisioningManager.java")).q("Skipping backfill of identity mapping.");
            return eorv.a;
        }
        ekrw ekrwVarH3 = a.h();
        ekrwVarH3.X(eksq.a, "RcsProvisioningManager");
        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "populateRcsAvailableIdentityMapIfEmpty", 525, "RcsProvisioningManager.java")).q("Scheduling identity mapping backfill.");
        return this.m.submit(eiid.l(new Callable() { // from class: dgpd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.B();
                return null;
            }
        }));
    }

    @Override // defpackage.dggz
    public final Optional h(dggn dggnVar) {
        return i(dggo.a(dggnVar).a);
    }

    @Override // defpackage.dggz
    public final Optional i(String str) {
        eieu eieuVarK = eiiy.k("RcsProvisioningManager#getConfiguration");
        try {
            Optional optionalM = m(str);
            Optional optionalEmpty = optionalM.isEmpty() ? Optional.empty() : ((ckgw) optionalM.get()).b(str);
            eieuVarK.close();
            return optionalEmpty;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dggz
    public final Optional j(dggk dggkVar) {
        eieu eieuVarK = eiiy.k("RcsProvisioningManager#getConfigurationByPhoneNumber");
        try {
            Optional map = this.d.h(dggkVar).map(new Function() { // from class: dgqc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (dgiq) this.a.i(dggo.a((dggn) obj).a).orElse(null);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (((Boolean) this.q.b()).booleanValue()) {
                J(dggkVar);
            }
            eieuVarK.close();
            return map;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dggz
    public final Optional k(int i) {
        eieu eieuVarK = eiiy.k("RcsProvisioningManager#getConfigurationBySubscriptionId");
        try {
            if (((Boolean) this.q.b()).booleanValue()) {
                I(i);
            }
            Optional optionalFlatMap = this.d.q(i).flatMap(new Function() { // from class: dgox
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.a.h((dggn) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            eieuVarK.close();
            return optionalFlatMap;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dggz
    @Deprecated
    public final Optional l() {
        return i(((dhes) this.c.b()).l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Optional m(String str) {
        ekqh it = ((ekgb) this.l).iterator();
        if (it.hasNext()) {
            return Optional.of((ckgw) it.next());
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "RcsProvisioningManager");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "findProvisioningEngineAdapter", 788, "RcsProvisioningManager.java")).t("ProvisioningEngineAdapter not found for SIM %s", dhiz.SIM_ID.c(str));
        return Optional.empty();
    }

    public final Optional n(String str) {
        Optional map = this.f.j(new dggp(str)).map(new dgpi()).map(new dgpj());
        if (map.isEmpty()) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getLoggableSimIdFromProvisioningId", 859, "RcsProvisioningManager.java")).t("getLoggableSimIdFromProvisioningId for provisioningId: %s returned no mapping.", str);
        }
        return map;
    }

    @Override // defpackage.dggw
    public final Set o() {
        eieu eieuVarK = eiiy.k("RcsProvisioningManager#getRcsAvailablePhoneNumbers");
        try {
            if (!C() && !ecem.g() && this.d.m().isEmpty()) {
                B();
            }
            Set setZ = z();
            eieuVarK.close();
            return setZ;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dggw
    public final Set p() {
        if (!C() && !ecem.g() && this.d.t().isEmpty()) {
            B();
        }
        dgia dgiaVar = this.d;
        fcsu fcsuVar = this.p;
        Set setT = dgiaVar.t();
        if (((Boolean) fcsuVar.b()).booleanValue() || setT.size() <= 1) {
            return setT;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "RcsProvisioningManager");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getRcsAvailableProvisioningIds", 396, "RcsProvisioningManager.java")).q("DSDR is disabled and multiple sims RCS available, returning only the default SIM.");
        return (Set) Collection.EL.stream(setT).filter(new Predicate() { // from class: dgov
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
                return ((dggn) obj).equals(new dggp(((dhes) this.a.c.b()).l()));
            }
        }).collect(ekcv.b);
    }

    @Override // defpackage.dggw
    public final void q(String str, dggv dggvVar, Executor executor) {
        G(Optional.of(str), dggvVar, executor);
    }

    @Override // defpackage.dgqr
    public final void r(String str, dgid dgidVar) {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "RcsProvisioningManager");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "onRcsAvailabilityUpdate", 742, "RcsProvisioningManager.java");
        dhiz dhizVar = dhiz.SIM_ID;
        ekrdVar.D("Receive onRcsAvailabilityUpdate, SIM = %s, availability = %s", dhizVar.c(str), dgidVar);
        if (dgidVar.c()) {
            dggp dggpVar = new dggp(str);
            Optional optionalH = h(dggpVar);
            if (optionalH.isEmpty()) {
                ekrw ekrwVarH2 = ekrgVar.h();
                ekrwVarH2.X(ekrzVar, "RcsProvisioningManager");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "onRcsAvailabilityUpdate", 750, "RcsProvisioningManager.java")).t("onRcsAvailabilityUpdate: Configuration is empty for SIM = %s", dhizVar.c(str));
            }
            H(optionalH, dggpVar);
        } else {
            dgia dgiaVar = this.d;
            final dggp dggpVar2 = new dggp(str);
            ReentrantReadWriteLock reentrantReadWriteLock = dgiaVar.e;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                ekrw ekrwVarE = dgia.a.e();
                ekrwVarE.X(ekrzVar, "BugleRcs");
                ((ekrd) ekrwVarE.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "removeIdentifierMapping", 450, "RcsProvisioningIdentityMappingAccessorImpl.kt")).t("Removing identity mapping {ProvisioningId: %s}", dhizVar.c(dggo.a(dggpVar2).a));
                List list = dgiaVar.g;
                final fdap fdapVar = new fdap() { // from class: dghq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dgha dghaVar = (dgha) obj;
                        dghaVar.getClass();
                        return Boolean.valueOf(fdbq.f(dghaVar.a, dggpVar2));
                    }
                };
                Collection.EL.removeIf(list, new Predicate() { // from class: dghr
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
                        return ((Boolean) fdapVar.invoke(obj)).booleanValue();
                    }
                });
                dgiaVar.u();
            } finally {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        }
        this.j.b(new dgot(str, dgidVar));
    }

    @Override // defpackage.dgqr
    public final void s(String str, Optional optional) {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "RcsProvisioningManager");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "onRcsConfigurationUpdate", 765, "RcsProvisioningManager.java");
        dhiz dhizVar = dhiz.SIM_ID;
        ekrdVar.D("Receive onRcsConfigurationUpdate, SIM = %s, configuration = %s", dhizVar.c(str), optional.map(new Function() { // from class: dgpx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dgiq) obj).y();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("<empty>"));
        if (optional.isEmpty()) {
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "onRcsConfigurationUpdate", 771, "RcsProvisioningManager.java")).t("onRcsConfigurationUpdate: Configuration is empty for SIM = %s", dhizVar.c(str));
        }
        H(optional, new dggp(str));
        this.b.b(new dgou(str, optional));
    }

    @Override // defpackage.dggw
    public final void t(dggv dggvVar) {
        this.j.d(dggvVar);
    }

    @Override // defpackage.dggw
    public final boolean u(dggk dggkVar) {
        return o().contains(dggkVar);
    }

    @Override // defpackage.dggw
    public final boolean v(String str) {
        try {
            return u(((dggl) this.o.b()).a(str));
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // defpackage.dggw
    public final boolean w(int i) {
        boolean zEquals;
        eieu eieuVarK = eiiy.k("RcsProvisioningManager#isRcsAvailableForSubId");
        try {
            if (i < 0) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "RcsProvisioningManager");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "isRcsAvailableForSubIdInTrace", 808, "RcsProvisioningManager.java")).r("isRcsAvailableForSubId called with an invalid sub id: %s", i);
                zEquals = false;
            } else {
                zEquals = ((enwr) F(i).map(new dgoy()).map(new dgoz(this)).map(new Function() { // from class: dgpk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((dgid) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(enwr.BUGLE_LOADING_AVAILABILITY_EXCEPTION)).equals(enwr.AVAILABLE);
            }
            eieuVarK.close();
            return zEquals;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dggw
    public final boolean x(int i) {
        int iOrdinal = c(i).a.ordinal();
        if (iOrdinal != 1 && iOrdinal != 6 && iOrdinal != 10 && iOrdinal != 13 && iOrdinal != 21) {
            switch (iOrdinal) {
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final Optional y(int i) {
        Optional map = this.f.i(i).map(new dgpi()).map(new dgpj());
        if (map.isEmpty()) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getLoggableSimIdFromSubId", 847, "RcsProvisioningManager.java")).r("getLoggableSimIdFromSubId for subId: %s returned no mapping.", i);
        }
        return map;
    }

    public final Set z() {
        return this.d.m();
    }
}
