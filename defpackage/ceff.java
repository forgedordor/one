package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceff extends ceku {
    public static final cqce a = cqce.g("BugleNetwork", "GaiaRegistrationProvider");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider");
    public static final Duration c = Duration.ofDays(1);
    public static final Duration d = Duration.ofMinutes(1);
    public final ceta e;
    private final ejxr f;
    private final cert g;
    private final cfdq h;
    private final cfdt i;
    private final cfrd j;
    private final aqpb k;
    private final bvll l;

    public ceff(eosc eoscVar, eosc eoscVar2, cezv cezvVar, cenj cenjVar, cogw cogwVar, Optional optional, final cffe cffeVar, cfdt cfdtVar, cfdq cfdqVar, aqpb aqpbVar, bvll bvllVar, fcsu fcsuVar, final cfrd cfrdVar, final cert certVar, ceta cetaVar) {
        super(eoscVar, eoscVar2, cezvVar, cogwVar, cenjVar, optional, fcsuVar);
        this.g = certVar;
        this.e = cetaVar;
        this.k = aqpbVar;
        this.f = ejxx.a(new ejxr() { // from class: ceer
            @Override // defpackage.ejxr
            public final Object get() {
                cqce cqceVar = ceff.a;
                cffe cffeVar2 = cffeVar;
                fcsu fcsuVar2 = cffeVar2.a;
                Optional optionalOf = Optional.of(certVar);
                cfgs cfgsVar = (cfgs) fcsuVar2.b();
                cfgsVar.getClass();
                cdio cdioVar = (cdio) cffeVar2.b.b();
                cdioVar.getClass();
                eosc eoscVar3 = (eosc) cffeVar2.c.b();
                eoscVar3.getClass();
                cfdl cfdlVar = (cfdl) cffeVar2.d.b();
                cfdlVar.getClass();
                aprp aprpVar = (aprp) cffeVar2.e.b();
                aprpVar.getClass();
                ains ainsVar = (ains) cffeVar2.f.b();
                ainsVar.getClass();
                bvll bvllVar2 = (bvll) cffeVar2.g.b();
                bvllVar2.getClass();
                aqpb aqpbVar2 = (aqpb) cffeVar2.h.b();
                aqpbVar2.getClass();
                return new cffd(cfgsVar, cdioVar, eoscVar3, optionalOf, cfdlVar, aprpVar, cfrdVar, ainsVar, bvllVar2, aqpbVar2);
            }
        });
        this.i = cfdtVar;
        this.h = cfdqVar;
        this.l = bvllVar;
        this.j = cfrdVar;
    }

    @Override // defpackage.ceku
    protected final cesd a() {
        return this.e;
    }

    @Override // defpackage.ceku
    protected final cffr b(long j) {
        final ceta cetaVar = this.e;
        Supplier supplier = new Supplier() { // from class: ceet
            @Override // java.util.function.Supplier
            public final Object get() {
                return cetaVar.f();
            }
        };
        cfdq cfdqVar = this.h;
        fcsu fcsuVar = cfdqVar.a;
        Optional optionalOf = Optional.of(this.g);
        cogw cogwVar = (cogw) fcsuVar.b();
        cogwVar.getClass();
        eosc eoscVar = (eosc) cfdqVar.b.b();
        eoscVar.getClass();
        cfgs cfgsVar = (cfgs) cfdqVar.c.b();
        cfgsVar.getClass();
        cfdl cfdlVar = (cfdl) cfdqVar.d.b();
        cfdlVar.getClass();
        aprp aprpVar = (aprp) cfdqVar.e.b();
        aprpVar.getClass();
        return new cfdp(cogwVar, eoscVar, cfgsVar, cfdlVar, aprpVar, supplier, optionalOf, j, this.j, cetaVar);
    }

    @Override // defpackage.ceku
    protected final /* synthetic */ cfrh c() {
        return this.j;
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final synchronized eiju d() {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider", "clearRegistrationOld", 304, "GaiaRegistrationProvider.java")).q("Clear gaia registration");
        if (!((asep) this.w.b()).a()) {
            return eijx.m(i(0L), q(evqs.b), h(new byte[0])).a(new Callable() { // from class: ceeo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cqce cqceVar = ceff.a;
                    return null;
                }
            }, this.q);
        }
        ceta cetaVar = this.e;
        return eijx.m(cetaVar.j(0L), q(evqs.b), cetaVar.i(new byte[0])).a(new Callable() { // from class: ceen
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqce cqceVar = ceff.a;
                return null;
            }
        }, this.r);
    }

    @Override // defpackage.ceku
    protected final eiju e() {
        ekrw ekrwVarE = b.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider", "doFirstTimeTachyonRegistration", 239, "GaiaRegistrationProvider.java")).q("doing first time GAIA tachyon registration");
        return (this.k.a() && k().equals("GDitto")) ? this.l.b().i(new eooz() { // from class: cees
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    return this.a.o();
                }
                ekrw ekrwVarJ = ceff.b.j();
                ekrwVarJ.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider", "getFirstTimeTokenForGaiaPairing", 253, "GaiaRegistrationProvider.java")).q("Device cannot register for on GDitto, no Auth Token");
                return eijx.e(ezns.a);
            }
        }, eoqg.a) : o();
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju f() {
        return eiju.g(this.e.f());
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju g() {
        return eiju.g(this.e.g());
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju h(byte[] bArr) {
        return eiju.g(this.e.i(bArr));
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju i(long j) {
        return eiju.g(this.e.j(Long.valueOf(n(j))));
    }

    @Override // defpackage.ceku
    protected final eiju j(ezln ezlnVar) {
        ezns eznsVar = ezlnVar.d;
        if (eznsVar == null) {
            eznsVar = ezns.a;
        }
        return ((asep) this.w.b()).a() ? eiju.g(eika.d(D(eznsVar), q(ezlnVar.h)).a(new Callable() { // from class: ceep
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqce cqceVar = ceff.a;
                return null;
            }
        }, this.r)) : eiju.g(eika.d(C(eznsVar), q(ezlnVar.h)).a(new Callable() { // from class: ceeq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqce cqceVar = ceff.a;
                return null;
            }
        }, eoqg.a));
    }

    @Override // defpackage.cedp
    public final String k() {
        return this.j.a;
    }

    @Override // defpackage.ceku
    protected final long n(long j) {
        long epochMilli = this.t.f().toEpochMilli() - d.toMillis();
        Duration durationOfMillis = Duration.ofMillis(j - epochMilli);
        Duration duration = c;
        return durationOfMillis.compareTo(duration) > 0 ? epochMilli + duration.toMillis() : j;
    }

    public final eiju o() {
        return p().i(new eooz() { // from class: ceev
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ezmt ezmtVar = (ezmt) obj;
                ekrw ekrwVarE = ceff.b.e();
                ekrwVarE.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider", "getFirstTimeAuthToken", 265, "GaiaRegistrationProvider.java")).q("Received Tachyon registration");
                if (ezmtVar == null) {
                    ceff.a.n("Tachyon SignInGaiaResponse is null");
                    throw new IllegalArgumentException("Tachyon SignInGaiaResponse is null");
                }
                if ((ezmtVar.b & 4) == 0) {
                    ceff.a.n("Tachyon SignInGaiaResponse has no auth token");
                    throw new IllegalArgumentException("Tachyon SignInGaiaResponse has no auth token");
                }
                final ezns eznsVar = ezmtVar.f;
                if (eznsVar == null) {
                    eznsVar = ezns.a;
                }
                final ceff ceffVar = this.a;
                evqs evqsVar = ezmtVar.d;
                if (!((asep) ceffVar.w.b()).a()) {
                    return ceffVar.q(evqsVar).i(new eooz() { // from class: cefd
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return ceffVar.C(eznsVar);
                        }
                    }, ceffVar.q).h(new ejvr() { // from class: cefe
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            cqce cqceVar = ceff.a;
                            return eznsVar;
                        }
                    }, eoqg.a);
                }
                eiju eijuVarQ = ceffVar.q(evqsVar);
                eooz eoozVar = new eooz() { // from class: cefb
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return ceffVar.D(eznsVar);
                    }
                };
                eosc eoscVar = ceffVar.r;
                return eijuVarQ.i(eoozVar, eoscVar).h(new ejvr() { // from class: cefc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = ceff.a;
                        return eznsVar;
                    }
                }, eoscVar);
            }
        }, eoqg.a);
    }

    public final eiju p() {
        final cfrj cfrjVar = (cfrj) this.f.get();
        eiju eijuVarG = eiju.g(cfrjVar.c((ezpp) this.u.a(k()).build()));
        eooz eoozVar = new eooz() { // from class: ceem
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ezmr ezmrVar = (ezmr) obj;
                cqbd cqbdVarC = ceff.a.c();
                cqbdVarC.I("SignInGaiaRequest");
                ezpp ezppVar = ezmrVar.c;
                if (ezppVar == null) {
                    ezppVar = ezpp.a;
                }
                final ceff ceffVar = this.a;
                cqbdVarC.A("RequestId", ezppVar.c);
                cqbdVarC.r();
                cetp cetpVar = (cetp) cetq.a.createBuilder();
                ezpp ezppVar2 = ezmrVar.c;
                if (ezppVar2 == null) {
                    ezppVar2 = ezpp.a;
                }
                ceta cetaVar = ceffVar.e;
                final cfrj cfrjVar2 = cfrjVar;
                String str = ezppVar2.c;
                cetpVar.copyOnWrite();
                cetq cetqVar = (cetq) cetpVar.instance;
                str.getClass();
                cetqVar.b = str;
                long epochMilli = ceffVar.t.f().toEpochMilli();
                cetpVar.copyOnWrite();
                ((cetq) cetpVar.instance).c = epochMilli;
                return cetaVar.l((cetq) cetpVar.build()).i(new eooz() { // from class: ceeu
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return cfrjVar2.d(ceffVar.s, ezmrVar);
                    }
                }, ceffVar.r);
            }
        };
        eosc eoscVar = this.r;
        eiju eijuVarI = eijuVarG.i(eoozVar, eoscVar);
        cfrjVar.getClass();
        return eijuVarI.i(new eooz() { // from class: ceew
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return cfrjVar.e((ezmt) obj);
            }
        }, eoscVar);
    }

    public final eiju q(evqs evqsVar) {
        return eiju.g(this.e.h(evqsVar.E()));
    }

    public final eiju r() {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider", "unregister", 323, "GaiaRegistrationProvider.java")).q("Doing GAIA tachyon unregistration");
        eosc eoscVar = (eosc) this.i.a.b();
        eoscVar.getClass();
        final cfds cfdsVar = new cfds(eoscVar, this.j, this.g, this.e);
        eiju eijuVarG = eiju.g(cfdsVar.c((ezpp) this.u.a(k()).build()));
        eooz eoozVar = new eooz() { // from class: ceex
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ezni ezniVar = (ezni) obj;
                cqbd cqbdVarC = ceff.a.c();
                cqbdVarC.I("UnregisterRequest");
                ezpp ezppVar = ezniVar.c;
                if (ezppVar == null) {
                    ezppVar = ezpp.a;
                }
                cfds cfdsVar2 = cfdsVar;
                cqbdVarC.A("RequestId", ezppVar.c);
                cqbdVarC.r();
                return cfdsVar2.o(ezniVar);
            }
        };
        eosc eoscVar2 = this.r;
        return eijuVarG.i(eoozVar, eoscVar2).i(new eooz() { // from class: ceey
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cqce cqceVar = ceff.a;
                return cfdsVar.e((eznk) obj);
            }
        }, eoscVar2).i(new eooz() { // from class: ceez
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.v();
            }
        }, this.q).h(new ejvr() { // from class: cefa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarH2 = ceff.b.h();
                ekrwVarH2.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider", "unregister", 347, "GaiaRegistrationProvider.java")).q("Tachyon Gaia unregistration completed");
                return null;
            }
        }, eoqg.a);
    }
}
