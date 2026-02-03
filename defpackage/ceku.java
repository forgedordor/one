package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class ceku implements cedp {
    public static final cqce p = cqce.g("BugleNetwork", "RegistrationProvider");
    private final AtomicReference a = new AtomicReference();
    public final eosc q;
    protected final eosc r;
    protected final cezv s;
    protected final cogw t;
    protected final cenj u;
    protected final Optional v;
    protected final fcsu w;
    public eiju x;

    public ceku(eosc eoscVar, eosc eoscVar2, cezv cezvVar, cogw cogwVar, cenj cenjVar, Optional optional, fcsu fcsuVar) {
        this.q = eoscVar;
        this.r = eoscVar2;
        this.s = cezvVar;
        this.t = cogwVar;
        this.u = cenjVar;
        this.v = optional;
        this.w = fcsuVar;
    }

    static final void H(ezpj ezpjVar) {
        fels felsVarB = fels.b(ezpjVar.b);
        if (felsVarB == null) {
            felsVarB = fels.UNRECOGNIZED;
        }
        if (felsVarB.equals(fels.UNKNOWN)) {
            return;
        }
        cqbd cqbdVarE = p.e();
        cqbdVarE.I("Received warning during tachyon registration: ");
        fels felsVarB2 = fels.b(ezpjVar.b);
        if (felsVarB2 == null) {
            felsVarB2 = fels.UNRECOGNIZED;
        }
        cqbdVarE.I(felsVarB2);
        cqbdVarE.r();
    }

    private final eiju o() {
        return a().c().i(new eooz() { // from class: cejx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ceku cekuVar = this.a;
                final byte[] bArr = (byte[]) obj;
                return cekuVar.a().b().h(new ejvr() { // from class: cejy
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        byte[] bArr2 = bArr;
                        return new cedr(bArr2 != null ? evqs.x(bArr2) : evqs.b, jLongValue);
                    }
                }, cekuVar.r);
            }
        }, this.r);
    }

    final eiju A(final long j, final boolean z) {
        eieu eieuVarK = eiiy.k("RegistrationProvider#refreshTachyonRegistration");
        try {
            cqce cqceVar = p;
            cqceVar.m("starting refresh of tachyon registration");
            final cffr cffrVarB = b(j);
            ezpp ezppVar = (ezpp) this.u.a(k()).build();
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.A("RefreshRequestId", ezppVar.c);
            cqbdVarC.r();
            eiju eijuVarG = eiju.g(cffrVarB.c(ezppVar));
            eooz eoozVar = new eooz() { // from class: cekk
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return cffrVarB.d(this.a.s, (ezll) obj);
                }
            };
            eosc eoscVar = this.q;
            eiju eijuVarI = eijuVarG.i(eoozVar, eoscVar).i(new eooz() { // from class: cekl
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return cffrVarB.e((ezln) obj);
                }
            }, eoscVar);
            eooz eoozVar2 = new eooz() { // from class: cekm
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final ezln ezlnVar = (ezln) obj;
                    cqce cqceVar2 = ceku.p;
                    cqceVar2.p("Received Tachyon registration refresh token");
                    if (ezlnVar == null) {
                        cqceVar2.n("Tachyon register refresh response was null");
                        return eijx.d(new IllegalArgumentException("Tachyon register refresh response was null"));
                    }
                    ceku cekuVar = this.a;
                    if ((ezlnVar.b & 8) != 0) {
                        ezpj ezpjVar = ezlnVar.g;
                        if (ezpjVar == null) {
                            ezpjVar = ezpj.a;
                        }
                        ceku.H(ezpjVar);
                    }
                    if ((ezlnVar.b & 2) != 0) {
                        return eiju.g(cekuVar.j(ezlnVar)).h(new ejvr() { // from class: cejs
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ezns eznsVar = ezlnVar.d;
                                return eznsVar == null ? ezns.a : eznsVar;
                            }
                        }, eoqg.a);
                    }
                    cqceVar2.r("Tachyon register refresh response has no auth token");
                    if (!ezlnVar.e || ezlnVar.f == 0 || j != 0) {
                        return eijx.d(new IllegalArgumentException("Tachyon register refresh response has no auth token"));
                    }
                    boolean z2 = z;
                    cqbd cqbdVarC2 = cqceVar2.c();
                    cqbdVarC2.I("Retrying RegisterRefresh with server timestamp");
                    cqbdVarC2.z("timestamp", ezlnVar.f);
                    cqbdVarC2.r();
                    return cekuVar.A(ezlnVar.f, z2);
                }
            };
            eoqg eoqgVar = eoqg.a;
            eiju eijuVarF = eijuVarI.i(eoozVar2, eoqgVar).f(fbtf.class, new eooz() { // from class: cekn
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    fbtf fbtfVar = (fbtf) obj;
                    felx felxVarB = cems.b(fbtfVar);
                    Status.Code codeA = cems.a(fbtfVar);
                    cqce cqceVar2 = ceku.p;
                    cqbd cqbdVarE = cqceVar2.e();
                    cqbdVarE.I("Got StatusRuntimeException for RegisterRefresh");
                    cqbdVarE.A("error", felxVarB.name());
                    cqbdVarE.A("status", codeA);
                    cqbdVarE.A("exception", fbtfVar);
                    cqbdVarE.r();
                    if (felxVarB != felx.REGISTRATION_NOT_FOUND && felxVarB != felx.REGISTRATION_UNAUTHENTICATED && felxVarB != felx.GAIA_ID_MISMATCH) {
                        throw fbtfVar;
                    }
                    boolean z2 = z;
                    ceku cekuVar = this.a;
                    if (!z2) {
                        return cekuVar.v().i(new eooz() { // from class: ceko
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return eijx.d(new fbtf(Status.j.d(new IllegalStateException("Refresh failed and not allowed to re-register"))));
                            }
                        }, eoqg.a);
                    }
                    cqceVar2.p("Handle non-retriable RegisterRefresh error by re-registering");
                    return cekuVar.e();
                }
            }, eoqgVar);
            eieuVarK.b(eijuVarF);
            eieuVarK.close();
            return eijuVarF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final synchronized eiju B() {
        p.p("Refresh Tachyon Registration Now");
        return y().i(new eooz() { // from class: cejw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return this.a.m(cedo.FORCE_REFRESH).h(new ejvr() { // from class: cejr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }, eoqg.a);
                }
                ceku.p.p("Tachyon registration token is null, ignore immediate refresh");
                return eijx.e(null);
            }
        }, eoqg.a);
    }

    @Deprecated
    protected final eiju C(ezns eznsVar) {
        p.m("Storing Tachyon auth token");
        return eiju.g(eika.d(h(eznsVar.b.I()), i(this.t.f().toEpochMilli() + TimeUnit.MICROSECONDS.toMillis(eznsVar.c))).a(new Callable() { // from class: cekg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, eoqg.a));
    }

    protected final eiju D(ezns eznsVar) {
        long jN = n(this.t.f().plusMillis(TimeUnit.MICROSECONDS.toMillis(eznsVar.c)).toEpochMilli());
        F(cekr.c(eznsVar.b, jN));
        return eiju.g(eika.d(a().e(eznsVar.b.I()), a().d(jN)).a(new Callable() { // from class: ceke
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, this.r));
    }

    protected final void E() {
        this.a.set(cekr.c(evqs.b, 0L));
    }

    public final void F(cekr cekrVar) {
        this.a.set(cekrVar);
    }

    public final boolean G(cekr cekrVar) {
        return cekrVar.a() - ((Long) cefs.b.e()).longValue() < this.t.f().toEpochMilli();
    }

    protected eiju I(cekr cekrVar) {
        return eijx.e(cekrVar);
    }

    protected eiju J(byte[] bArr) {
        return eijx.e(bArr);
    }

    protected abstract cesd a();

    protected abstract cffr b(long j);

    protected abstract cfrh c();

    @Deprecated
    protected abstract eiju d();

    protected abstract eiju e();

    @Deprecated
    protected abstract eiju f();

    @Deprecated
    protected abstract eiju g();

    @Deprecated
    protected abstract eiju h(byte[] bArr);

    @Deprecated
    protected abstract eiju i(long j);

    protected abstract eiju j(ezln ezlnVar);

    @Override // defpackage.cedp
    public final eiju l() {
        return m(cedo.CACHE_ALLOWED);
    }

    @Override // defpackage.cedp
    public final eiju m(final cedo cedoVar) {
        eiju eijuVarI;
        eiju eijuVarZ;
        Optional optionalEmpty;
        eieu eieuVarK = eiiy.k("RegistrationProvider#getAuthToken");
        try {
            if (((asep) this.w.b()).a()) {
                if (cedoVar.d) {
                    cekr cekrVar = (cekr) this.a.get();
                    if (cekrVar == null || cekrVar.b().H() || G(cekrVar)) {
                        optionalEmpty = Optional.empty();
                    } else {
                        eznr eznrVar = (eznr) ezns.a.createBuilder();
                        evqs evqsVarB = cekrVar.b();
                        eznrVar.copyOnWrite();
                        ((ezns) eznrVar.instance).b = evqsVarB;
                        optionalEmpty = Optional.of((ezns) eznrVar.build());
                    }
                    if (optionalEmpty.isPresent()) {
                        eijuVarI = eijx.e(optionalEmpty.get());
                    } else {
                        eijuVarZ = eijx.e(null);
                    }
                } else {
                    eijuVarZ = z();
                }
                eijuVarI = eijuVarZ.i(new eooz() { // from class: cekc
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return this.a.x(cedoVar.e);
                    }
                }, this.r);
                eieuVarK.b(eijuVarI);
            } else {
                eijuVarI = (cedoVar.d ? eijx.e(null) : i(0L)).i(new eooz() { // from class: cekd
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return this.a.x(cedoVar.e);
                    }
                }, eoqg.a);
                eieuVarK.b(eijuVarI);
            }
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

    public final eiju v() {
        return ((asep) this.w.b()).a() ? a().a().h(new ejvr() { // from class: cejt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.E();
                return null;
            }
        }, this.r) : d();
    }

    @Deprecated
    public final synchronized eiju w() {
        if (((asep) this.w.b()).a()) {
            return m(cedo.CACHE_ALLOWED);
        }
        return x(true);
    }

    public final synchronized eiju x(final boolean z) {
        eiju eijuVarI;
        if (this.x != null) {
            p.p("returning already existing registration future");
            return this.x;
        }
        p.p("Getting Tachyon registration");
        if (((asep) this.w.b()).a()) {
            eiju eijuVarO = o();
            eooz eoozVar = new eooz() { // from class: ceju
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.I((cekr) obj);
                }
            };
            eosc eoscVar = this.r;
            eijuVarI = eijuVarO.i(eoozVar, eoscVar).i(new eooz() { // from class: cejv
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    cekr cekrVar = (cekr) obj;
                    boolean zH = cekrVar.b().H();
                    ceku cekuVar = this.a;
                    boolean z2 = z;
                    if (zH) {
                        return !z2 ? eijx.d(new fbtf(Status.g.d(new IllegalStateException("No registration and not allowed to re-register")))) : cekuVar.e();
                    }
                    if (cekuVar.G(cekrVar)) {
                        return cekuVar.A(0L, z2);
                    }
                    ceku.p.q("using immediateFuture based on stored tachyon registration");
                    cekuVar.F(cekrVar);
                    eznr eznrVar = (eznr) ezns.a.createBuilder();
                    evqs evqsVarB = cekrVar.b();
                    eznrVar.copyOnWrite();
                    ((ezns) eznrVar.instance).b = evqsVarB;
                    return eijx.e((ezns) eznrVar.build());
                }
            }, eoscVar);
        } else {
            eijuVarI = f().i(new eooz() { // from class: cejz
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.J((byte[]) obj);
                }
            }, this.r).i(new eooz() { // from class: cekb
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final ceku cekuVar = this.a;
                    final byte[] bArr = (byte[]) obj;
                    final boolean z2 = z;
                    return (bArr == null || bArr.length == 0) ? !z2 ? eijx.d(new fbtf(Status.g.d(new IllegalStateException("No registration and not allowed to re-register")))) : cekuVar.e() : cekuVar.g().i(new eooz() { // from class: cekf
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            Long l = (Long) obj2;
                            long jLongValue = l == null ? 0L : l.longValue();
                            ceku cekuVar2 = cekuVar;
                            if (jLongValue - ((Long) cefs.b.e()).longValue() < cekuVar2.t.f().toEpochMilli()) {
                                return cekuVar2.A(0L, z2);
                            }
                            byte[] bArr2 = bArr;
                            ceku.p.q("using immediateFuture based on stored tachyon registration");
                            eznr eznrVar = (eznr) ezns.a.createBuilder();
                            evqs evqsVarX = evqs.x(bArr2);
                            eznrVar.copyOnWrite();
                            ((ezns) eznrVar.instance).b = evqsVarX;
                            return eijx.e((ezns) eznrVar.build());
                        }
                    }, eoqg.a);
                }
            }, eoqg.a);
        }
        eooz eoozVar2 = new eooz() { // from class: ceka
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Throwable th = (Throwable) obj;
                cqce cqceVar = ceku.p;
                cqceVar.s("Failed to register with Tachyon", th);
                if (th instanceof fbtf) {
                    felx felxVarB = cems.b(th);
                    Status.Code codeA = cems.a(th);
                    if (felxVarB == felx.DASHER_ACCOUNT_RESTRICTED) {
                        cqbd cqbdVarE = cqceVar.e();
                        cqbdVarE.I("Got Dasher account restricted error in StatusRuntimeException");
                        cqbdVarE.A("error", felxVarB);
                        cqbdVarE.A("status", codeA);
                        cqbdVarE.s(th);
                        return eijx.d(new ceks(th));
                    }
                    if (felxVarB == felx.UNICORN_ACCOUNT_RESTRICTED) {
                        cqbd cqbdVarE2 = cqceVar.e();
                        cqbdVarE2.I("Got Unicorn account restricted error in StatusRuntimeException");
                        cqbdVarE2.A("error", felxVarB);
                        cqbdVarE2.A("status", codeA);
                        cqbdVarE2.s(th);
                        return eijx.d(new cekt(th));
                    }
                    ceku cekuVar = this.a;
                    Optional optional = cekuVar.v;
                    if (optional.isPresent()) {
                        cqbd cqbdVarE3 = cqceVar.e();
                        cqbdVarE3.I("Got error in StatusRuntimeException. Notifying tachyon registration error listeners");
                        cqbdVarE3.A("error", felxVarB);
                        cqbdVarE3.A("status", codeA);
                        cqbdVarE3.s(th);
                        cfrh cfrhVarC = cekuVar.c();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((Set) optional.get()).iterator();
                        while (it.hasNext()) {
                            arrayList.add(((cfsc) it.next()).e(cfrhVarC, felxVarB));
                        }
                        return eijx.j(arrayList).b(new eooy() { // from class: cekp
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                return eijx.d(th);
                            }
                        }, eoqg.a);
                    }
                }
                return eijx.d(th);
            }
        };
        eoqg eoqgVar = eoqg.a;
        final eiju eijuVarF = eijuVarI.f(Throwable.class, eoozVar2, eoqgVar);
        return eijs.e(new eopk() { // from class: cekj
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                ceku cekuVar = this.a;
                eiju eijuVar = eijuVarF;
                synchronized (cekuVar) {
                    cekuVar.x = eijuVar;
                }
                eoptVar.a(new cekq(cekuVar), cekuVar.r);
                return eijs.c(eijuVar).a;
            }
        }, eoqgVar).h();
    }

    public final eiju y() {
        return ((asep) this.w.b()).a() ? o().h(new ejvr() { // from class: cekh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(!((cekr) obj).b().H());
            }
        }, this.r) : eiju.g(f()).h(new ejvr() { // from class: ceki
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                byte[] bArr = (byte[]) obj;
                boolean z = false;
                if (bArr != null && bArr.length != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, eoqg.a);
    }

    public final eiju z() {
        return a().d(0L).h(new ejvr() { // from class: cejq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.E();
                return null;
            }
        }, this.r);
    }

    protected long n(long j) {
        return j;
    }
}
