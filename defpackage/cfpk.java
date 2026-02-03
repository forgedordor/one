package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfpk implements cfpa {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl");
    public final Object b = new Object();
    public final eosc c;
    public final fcsu d;
    public final cfrl e;
    public final cedp f;
    public final String g;
    public eiju h;
    public boolean i;
    private final cepf j;
    private final cenj k;
    private final boolean l;

    public cfpk(cenj cenjVar, eosc eoscVar, fcsu fcsuVar, cfrl cfrlVar, cepf cepfVar, cedp cedpVar, boolean z, String str) {
        this.j = cepfVar;
        this.k = cenjVar;
        this.d = fcsuVar;
        this.c = eoscVar;
        this.e = cfrlVar;
        this.f = cedpVar;
        this.l = z;
        this.g = str;
    }

    @Override // defpackage.cfpa
    public final eiju a() {
        eieu eieuVarK = eiiy.k("PullHandlerImpl::pullMessages");
        try {
            eiju eijuVarI = this.f.l().i(new cfpg(this), this.c);
            eieuVarK.b(eijuVarI);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cfpa
    public final eiju b(cedo cedoVar) {
        eieu eieuVarK = eiiy.k("PullHandlerImpl::pullMessages");
        try {
            eiju eijuVarI = this.f.m(cedoVar).i(new cfpg(this), this.c);
            eieuVarK.b(eijuVarI);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju c(ezns eznsVar) {
        synchronized (this.b) {
            if (this.h != null) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", 111, "PullHandlerImpl.java")).q("Pull in progress. Will issue another PullMessages when the current one completes");
                this.i = true;
                return eijx.e(null);
            }
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", 116, "PullHandlerImpl.java")).q("Issuing a new PullMessages RPC");
            this.i = false;
            String strK = this.f.k();
            ezpo ezpoVarB = this.l ? this.k.b(strK) : this.k.a(strK);
            evqs evqsVar = eznsVar.b;
            ezpoVarB.copyOnWrite();
            ezpp ezppVar = (ezpp) ezpoVarB.instance;
            ezpp ezppVar2 = ezpp.a;
            evqsVar.getClass();
            ezppVar.f = evqsVar;
            ezke ezkeVar = (ezke) ezkf.a.createBuilder();
            ezkeVar.copyOnWrite();
            ezkf ezkfVar = (ezkf) ezkeVar.instance;
            ezpp ezppVar3 = (ezpp) ezpoVarB.build();
            ezppVar3.getClass();
            ezkfVar.c = ezppVar3;
            ezkfVar.b |= 1;
            eiju eijuVarC = this.j.c((ezkf) ezkeVar.build());
            eooz eoozVar = new eooz() { // from class: cfpb
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    ezkh ezkhVar = (ezkh) obj;
                    ekrw ekrwVarH3 = cfpk.a.h();
                    ekrwVarH3.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "handlePullResponse", 189, "PullHandlerImpl.java")).x("Pull completed, messagecount: %d, pulledAll: %s", ezkhVar.b.size(), ezkhVar.c);
                    cfpk cfpkVar = this.a;
                    synchronized (cfpkVar.b) {
                        if (!ezkhVar.c) {
                            cfpkVar.i = true;
                        }
                    }
                    ArrayList arrayList = new ArrayList(ezkhVar.b.size());
                    for (ezjj ezjjVar : ezkhVar.b) {
                        cgam cgamVar = (cgam) cfpkVar.d.b();
                        ezji ezjiVarB = ezji.b(ezjjVar.d);
                        if (ezjiVarB == null) {
                            ezjiVarB = ezji.UNRECOGNIZED;
                        }
                        if (ezjiVarB == ezji.TACHYGRAM_MESSAGE) {
                            basd basdVarA = basd.a(ezjjVar.c);
                            febx febxVar = (febx) fecc.a.createBuilder();
                            fhaz fhazVarA = cqdr.a();
                            febxVar.copyOnWrite();
                            fecc feccVar = (fecc) febxVar.instance;
                            fhazVarA.getClass();
                            feccVar.c = fhazVarA;
                            feccVar.b |= 1;
                            febxVar.copyOnWrite();
                            ((fecc) febxVar.instance).e = fecb.a(9);
                            febxVar.copyOnWrite();
                            ((fecc) febxVar.instance).g = feca.a(49);
                            febv febvVar = (febv) febw.a.createBuilder();
                            febvVar.a(ezjjVar.c);
                            febw febwVar = (febw) febvVar.build();
                            febxVar.copyOnWrite();
                            fecc feccVar2 = (fecc) febxVar.instance;
                            febwVar.getClass();
                            feccVar2.d = febwVar;
                            feccVar2.b |= 2;
                            cgamVar.b(basdVarA, febxVar);
                        }
                        arrayList.add(cfpkVar.e.a(ezjjVar));
                    }
                    return eijx.j(arrayList).a(new Callable() { // from class: cfpi
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return null;
                        }
                    }, eoqg.a);
                }
            };
            eosc eoscVar = this.c;
            final eiju eijuVarF = eijuVarC.i(eoozVar, eoscVar).f(Throwable.class, new eooz() { // from class: cfpc
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Throwable th = (Throwable) obj;
                    ekrw ekrwVarJ = cfpk.a.j();
                    ekrwVarJ.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", (char) 133, "PullHandlerImpl.java")).q("Failure calling pull messages or handling results");
                    return eijx.d(th);
                }
            }, eoscVar);
            return eijs.e(new eopk() { // from class: cfpd
                @Override // defpackage.eopk
                public final eopy a(eopt eoptVar) {
                    cfpk cfpkVar = this.a;
                    eiju eijuVar = eijuVarF;
                    synchronized (cfpkVar.b) {
                        cfpkVar.h = eijuVar;
                    }
                    eoptVar.a(new cfpj(cfpkVar, eijuVar), cfpkVar.c);
                    return eijs.c(eijuVar).a;
                }
            }, eoqg.a).h().i(new eooz() { // from class: cfpe
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final cfpk cfpkVar = this.a;
                    synchronized (cfpkVar.b) {
                        cfpkVar.h = null;
                        if (!cfpkVar.i) {
                            return eijx.e(null);
                        }
                        ekrw ekrwVarH3 = cfpk.a.h();
                        ekrwVarH3.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", 178, "PullHandlerImpl.java")).q("Perform pullMessages again at the end of the previous pullMessages call.");
                        return cfpkVar.f.l().i(new eooz() { // from class: cfpf
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return cfpkVar.c((ezns) obj2);
                            }
                        }, cfpkVar.c);
                    }
                }
            }, eoscVar);
        }
    }
}
