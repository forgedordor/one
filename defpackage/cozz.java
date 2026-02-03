package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozz implements cozo {
    private final fcsu a;
    private final cqej b;

    public cozz(fcsu fcsuVar, cqej cqejVar) {
        fcsuVar.getClass();
        cqejVar.getClass();
        this.a = fcsuVar;
        this.b = cqejVar;
    }

    @Override // defpackage.cozo
    public final Object a(Set set, fcxy fcxyVar) {
        final cnjw cnjwVar = (cnjw) this.a.b();
        ArrayList arrayList = new ArrayList(fcva.p(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.b(((cozu) it.next()).a));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = (String) obj;
            str.getClass();
            if (str.length() > 0) {
                arrayList2.add(obj);
            }
        }
        final Set setAv = fcva.av(arrayList2);
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.TACHYON_PHONE);
        cmggVarC.f(cevr.a);
        cmggVarC.b(true);
        cmggVarC.c(new Supplier() { // from class: cnjq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new cnjx();
            }
        });
        Object objC = fdxs.c(((cmgk) cnjwVar.f.b()).a(cmggVarC.a()).g().i(new eooz() { // from class: cnjr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                Stream stream = Collection.EL.stream(((ekgp) obj2).entrySet());
                final Set set2 = setAv;
                Stream streamFilter = stream.filter(new Predicate() { // from class: cnjj
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
                    public final boolean test(Object obj3) {
                        eksp ekspVar = cnjw.a;
                        return !set2.contains(((Map.Entry) obj3).getKey());
                    }
                }).filter(new Predicate() { // from class: cnjk
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
                    public final boolean test(Object obj3) {
                        Map.Entry entry = (Map.Entry) obj3;
                        eksp ekspVar = cnjw.a;
                        return entry.getValue() != null && cnjw.a((cevr) entry.getValue());
                    }
                });
                final cnjw cnjwVar2 = cnjwVar;
                Stream map = streamFilter.map(new Function() { // from class: cnjl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        String str2 = (String) ((Map.Entry) obj3).getKey();
                        Optional optional = cnjwVar2.e;
                        if (optional.isEmpty()) {
                            ((eksl) ((eksl) cnjw.a.j()).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "disable", 159, "TachygramLifecycleManager.java")).q("Tachygram is active but no tachyon receiver manager provided");
                            return eijx.e(null);
                        }
                        ((cfzf) optional.get()).h(str2);
                        return eijx.e(null);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
                return eijx.j(ekgbVar).a(new Callable() { // from class: cnjm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eksp ekspVar = cnjw.a;
                        return Boolean.valueOf(!ekgbVar.isEmpty());
                    }
                }, cnjwVar2.c);
            }
        }, cnjwVar.c), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.cozo
    public final Object b(cozu cozuVar, fcxy fcxyVar) {
        final String strB = this.b.b(cozuVar.a);
        if (strB.length() <= 0) {
            throw new IllegalArgumentException("Msisdn in ACS configuration is empty.");
        }
        final cnjw cnjwVar = (cnjw) this.a.b();
        eiju eijuVarD = TextUtils.isEmpty(strB) ? eijx.d(new IllegalStateException("Cannot determine if Tachygram is active. No msisdn available")) : cnjwVar.b.a(strB).g().h(new ejvr() { // from class: cnjp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(cnjw.a((cevr) obj));
            }
        }, cnjwVar.c);
        eooz eoozVar = new eooz() { // from class: cnji
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eiju eijuVarI;
                if (((Boolean) obj).booleanValue()) {
                    return eijx.e(false);
                }
                final String str = strB;
                final cnjw cnjwVar2 = cnjwVar;
                ((eksl) ((eksl) cnjw.a.h()).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "enableTransport", 82, "TachygramLifecycleManager.java")).q("Forcing Tachyon phone registration to enable Tachygram.");
                cczv cczvVar = alvx.a;
                if (((Boolean) new aluo().get()).booleanValue()) {
                    eiju eijuVarC = cnjwVar2.d.c(((asqx) cnjwVar2.g.b()).a(str, false));
                    eooz eoozVar2 = new eooz() { // from class: cnjs
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return cnjwVar2.b(str);
                        }
                    };
                    eosc eoscVar = cnjwVar2.c;
                    return eijuVarC.i(eoozVar2, eoscVar).h(new ejvr() { // from class: cnjt
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar = cnjw.a;
                            return true;
                        }
                    }, eoscVar);
                }
                final ceni ceniVar = cnjwVar2.d;
                if (ceniVar.i()) {
                    cqce cqceVar = ceni.a;
                    cqceVar.m("Tachyon phone registration flag enabled");
                    ceniVar.i.set(true);
                    eiju eijuVarE = eijx.e(str);
                    if (TextUtils.isEmpty(str)) {
                        cqceVar.r("No phone number provided for registration. Attempting to acquire from profile service");
                        if (ceniVar.d.isConnected()) {
                            ekrw ekrwVarJ = ceni.b.j();
                            ekrwVarJ.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 163, "TachyonPhoneRegistrationManager.java")).q("Forcing Tachyon phone registration for all self identities");
                            eijuVarI = ceniVar.b();
                        } else {
                            cqceVar.r("Config update received but no phone number could be acquired");
                            eijuVarI = eijx.e(null);
                        }
                    } else {
                        eijuVarI = eijuVarE.i(new eooz() { // from class: ceng
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                ceni ceniVar2 = ceniVar;
                                String str2 = (String) obj2;
                                if (!ceniVar2.i()) {
                                    return eijx.d(new IllegalStateException("Tachyon phone registration flag disabled"));
                                }
                                ceni.a.p("Ensuring Tachyon phone registration");
                                eiju eijuVarI2 = ceniVar2.c.e(str2, 12).i(new cemv(ceniVar2), ceniVar2.g);
                                ejvr ejvrVar = new ejvr() { // from class: cend
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        cqce cqceVar2 = ceni.a;
                                        return null;
                                    }
                                };
                                eoqg eoqgVar = eoqg.a;
                                return eijuVarI2.h(ejvrVar, eoqgVar).e(fbtf.class, new ejvr() { // from class: cene
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        ceni.a.s("Failed to ensure Tachyon registration", (fbtf) obj3);
                                        return null;
                                    }
                                }, eoqgVar);
                            }
                        }, ceniVar.g);
                    }
                } else {
                    ceni.a.m("Tachyon phone registration flag disabled");
                    eijuVarI = eijx.e(null);
                }
                eooz eoozVar3 = new eooz() { // from class: cnju
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return cnjwVar2.b(str);
                    }
                };
                eosc eoscVar2 = cnjwVar2.c;
                return eijuVarI.i(eoozVar3, eoscVar2).h(new ejvr() { // from class: cnjv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = cnjw.a;
                        return true;
                    }
                }, eoscVar2);
            }
        };
        eosc eoscVar = cnjwVar.c;
        Object objC = fdxs.c(eijuVarD.i(eoozVar, eoscVar).e(cefk.class, new ejvr() { // from class: cnjn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) cnjw.a.j()).g((cefk) obj)).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "enableTransport", 111, "TachygramLifecycleManager.java")).q("Failed to enable Tachygram for invalid phone number");
                return false;
            }
        }, eoscVar), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.cozo
    public final boolean c(cozu cozuVar) throws IOException {
        cozuVar.getClass();
        eieu eieuVarA = eiiy.a("TachygramChatTransportRegistrar#isTransportEligible");
        try {
            dgiq dgiqVar = cozuVar.a;
            boolean z = false;
            if (dgiqVar.P()) {
                if (this.b.b(dgiqVar).length() > 0) {
                    z = true;
                }
            }
            fczl.a(eieuVarA, null);
            return z;
        } finally {
        }
    }
}
