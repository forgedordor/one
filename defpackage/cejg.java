package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cejg extends ceku {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider");
    static final cczi b = cdag.q(159662717, "new_rcs_token_resets_otp_backoff");
    static final cczi c = cdag.f(cdag.b, "tachyon_otp_retry_multiplier_in_millis", 3600000);
    static final cczi d = cdag.c(cdag.b, "tachyon_otp_retry_backoff_base", 2.0d);
    static final cczi e = cdag.e(cdag.b, "tachyon_otp_retry_max_exponent", 7);
    static final cczi f = cdag.e(cdag.b, "tachyon_otp_wait_seconds", (int) TimeUnit.MINUTES.toSeconds(30));
    private final fcsu A;
    private final crny B;
    private final crmx C;
    private final fcsu D;
    private final eosc E;
    private final Object F;
    private cexm G;
    public final ceop g;
    public final fcsu h;
    public final fcsu i;
    public final cfre j;
    public final eosd k;
    public final eosc l;
    public final fcsu m;
    public final Object n;
    public kog o;
    private final cffn y;
    private final cfet z;

    public cejg(eosc eoscVar, eosd eosdVar, eosc eoscVar2, cezv cezvVar, cenj cenjVar, cogw cogwVar, Optional optional, cffn cffnVar, cfet cfetVar, ceop ceopVar, fcsu fcsuVar, crny crnyVar, crmx crmxVar, fcsu fcsuVar2, fcsu fcsuVar3, eosd eosdVar2, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, cfre cfreVar) {
        super(eoscVar, eosdVar, cezvVar, cogwVar, cenjVar, optional, fcsuVar6);
        this.n = new Object();
        this.F = new Object();
        this.k = eosdVar;
        this.g = ceopVar;
        this.y = cffnVar;
        this.z = cfetVar;
        this.A = fcsuVar;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = cfreVar;
        this.l = eoscVar2;
        this.B = crnyVar;
        this.C = crmxVar;
        this.m = fcsuVar2;
        this.D = fcsuVar3;
        this.E = eosdVar2;
    }

    @Override // defpackage.ceku
    protected final eiju I(final cekr cekrVar) {
        if (!cekrVar.b().H()) {
            return eijx.e(cekrVar);
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkAlternativeIfNeeded", 314, "PhoneRegistrationProvider.java")).q("Check if data exists for alternative.");
        return o().k().h(new ejvr() { // from class: ceja
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                ekrg ekrgVar = cejg.a;
                boolean zIsPresent = optional.isPresent();
                cekr cekrVar2 = cekrVar;
                return zIsPresent ? cekr.c(((cevr) optional.get()).d, cekrVar2.a()) : cekrVar2;
            }
        }, this.l);
    }

    @Override // defpackage.ceku
    protected final eiju J(final byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return eijx.e(bArr);
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkAlternativeIfNeeded", 294, "PhoneRegistrationProvider.java")).q("Check if data exists for alternative.");
        return o().k().h(new ejvr() { // from class: cehl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                ekrg ekrgVar = cejg.a;
                return optional.isPresent() ? ((cevr) optional.get()).d.I() : bArr;
            }
        }, this.l);
    }

    @Override // defpackage.ceku
    protected final cesd a() {
        return o();
    }

    @Override // defpackage.ceku
    protected final cffr b(long j) {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "createRegisterRefreshRpcHandler", 192, "PhoneRegistrationProvider.java")).q("Creating phone register refresh RPC handler");
        cfre cfreVar = this.j;
        Optional optionalOf = Optional.of(cfreVar.b);
        Callable callable = new Callable() { // from class: ceik
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cejg cejgVar = this.a;
                return cejgVar.g.a(cejgVar.j.b);
            }
        };
        Supplier supplier = new Supplier() { // from class: ceil
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.u();
            }
        };
        cfet cfetVar = this.z;
        cffq cffqVar = (cffq) cfetVar.a.b();
        cffqVar.getClass();
        cexn cexnVar = (cexn) cfetVar.b.b();
        cexnVar.getClass();
        cepq cepqVar = (cepq) cfetVar.c.b();
        cepqVar.getClass();
        alrj alrjVar = (alrj) cfetVar.d.b();
        alrjVar.getClass();
        ((aoou) cfetVar.f.b()).getClass();
        ((eosc) cfetVar.h.b()).getClass();
        ((cfir) cfetVar.i.b()).getClass();
        return new cfes(cffqVar, cexnVar, cepqVar, alrjVar, cfetVar.e, cfetVar.g, j, optionalOf, callable, supplier, cfreVar);
    }

    @Override // defpackage.ceku
    public final /* synthetic */ cfrh c() {
        return this.j;
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final synchronized eiju d() {
        return o().m();
    }

    @Override // defpackage.ceku
    protected final eiju e() {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 227, "PhoneRegistrationProvider.java")).q("doing first time phone tachyon registration");
        if (!this.B.r()) {
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 230, "PhoneRegistrationProvider.java")).q("SIM is not present. Do not perform first-time Tachyon phone registration.");
            return eijx.d(new fbtf(Status.l.d(new IllegalStateException("SIM is not present"))));
        }
        if (!this.C.G()) {
            ekrw ekrwVarH3 = ekrgVar.h();
            ekrwVarH3.X(ekrzVar, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 239, "PhoneRegistrationProvider.java")).q("Not default SMS app. Do not perform first-time Tachyon phone registration.");
            return eijx.d(new fbtf(Status.l.d(new IllegalStateException("Not default SMS app"))));
        }
        cffn cffnVar = this.y;
        cfre cfreVar = this.j;
        cfgs cfgsVar = (cfgs) cffnVar.a.b();
        cfgsVar.getClass();
        ceop ceopVar = (ceop) cffnVar.b.b();
        ceopVar.getClass();
        eosc eoscVar = (eosc) cffnVar.c.b();
        eoscVar.getClass();
        cepq cepqVar = (cepq) cffnVar.d.b();
        cepqVar.getClass();
        cexn cexnVar = (cexn) cffnVar.e.b();
        cexnVar.getClass();
        alrj alrjVar = (alrj) cffnVar.f.b();
        alrjVar.getClass();
        ((aoou) cffnVar.h.b()).getClass();
        ((cfir) cffnVar.m.b()).getClass();
        final cffm cffmVar = new cffm(cfgsVar, ceopVar, eoscVar, cepqVar, cexnVar, alrjVar, cffnVar.g, cffnVar.i, cffnVar.j, cffnVar.k, cffnVar.l, cfreVar);
        eiju eijuVarI = v().i(new eooz() { // from class: ceho
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cejg cejgVar = this.a;
                if (((dggw) cejgVar.m.b()).v(cejgVar.j.b)) {
                    ekrw ekrwVarH4 = cejg.a.h();
                    ekrwVarH4.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkRcsAvailability", 279, "PhoneRegistrationProvider.java")).q("Phone number to register is provisioned for RCS");
                    return eijx.e(null);
                }
                ekrw ekrwVarJ = cejg.a.j();
                ekrwVarJ.X(eksq.a, "BugleNetwork");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.MEDIUM);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkRcsAvailability", 283, "PhoneRegistrationProvider.java")).q("Phone number to register is not provisioned for RCS");
                return eijx.d(new fbtf(Status.l.withDescription("Phone number to register is not provisioned for RCS")));
            }
        }, this.E);
        eooz eoozVar = new eooz() { // from class: cehp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return cffmVar.c((ezpp) this.a.u.a("RCS").build());
            }
        };
        eosc eoscVar2 = this.q;
        eiju eijuVarI2 = eijuVarI.i(eoozVar, eoscVar2);
        eooz eoozVar2 = new eooz() { // from class: cehq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cejg cejgVar = this.a;
                final ezlp ezlpVar = (ezlp) obj;
                final cexm cexmVarO = cejgVar.o();
                ezjf ezjfVar = ezlpVar.f;
                if (ezjfVar == null) {
                    ezjfVar = ezjf.a;
                }
                final String str = ezjfVar.b;
                eiju eijuVarG = cejgVar.o().g();
                eooz eoozVar3 = new eooz() { // from class: ceif
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        cevr cevrVar = (cevr) obj2;
                        int i = cevrVar.r;
                        if (((Boolean) cejg.b.e()).booleanValue()) {
                            String str2 = str;
                            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(cevrVar.p, str2)) {
                                cexm cexmVar = cexmVarO;
                                ekrw ekrwVarH4 = cejg.a.h();
                                ekrwVarH4.X(eksq.a, "BugleNetwork");
                                ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkRetryBackoffIfNeeded", 343, "PhoneRegistrationProvider.java")).r("New RCS token, skips back-off. retryCount: %d", i);
                                return cexmVar.l();
                            }
                        }
                        long j = cevrVar.q;
                        if (i != 0) {
                            long epochMilli = cejgVar.t.f().toEpochMilli();
                            if (epochMilli >= j) {
                                long jLongValue = ((long) (((Long) cejg.c.e()).longValue() * Math.pow(((Double) cejg.d.e()).doubleValue(), Math.min(i - 1, ((Integer) cejg.e.e()).intValue())))) + j;
                                if (epochMilli < jLongValue) {
                                    ekrw ekrwVarJ = cejg.a.j();
                                    ekrwVarJ.X(eksq.a, "BugleNetwork");
                                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                                    ekrdVar.Z(eksk.MEDIUM);
                                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "isTimeToRetry", 374, "PhoneRegistrationProvider.java")).J("Registration throttled due to consecutive OTP failure. current: %d, retryCount:%d, lastTimestamp: %d, earliestTimeToRetry:%d", Long.valueOf(epochMilli), Integer.valueOf(i), Long.valueOf(j), Long.valueOf(jLongValue));
                                    return eijx.d(new fbtf(Status.l.d(new cejf())));
                                }
                            }
                        }
                        return eijx.e(null);
                    }
                };
                eosc eoscVar3 = cejgVar.l;
                return eijuVarG.i(eoozVar3, eoscVar3).i(new eooz() { // from class: ceig
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ekrg ekrgVar2 = cejg.a;
                        cmfo cmfoVar = cexmVarO.b;
                        final String str2 = str;
                        return cmfoVar.j(new ejvr() { // from class: cewe
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cevo cevoVar = (cevo) ((cevr) obj3).toBuilder();
                                cevoVar.copyOnWrite();
                                cevr cevrVar = (cevr) cevoVar.instance;
                                String str3 = str2;
                                str3.getClass();
                                cevrVar.p = str3;
                                return (cevr) cevoVar.build();
                            }
                        }).h(new ejvr() { // from class: cewf
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return null;
                            }
                        }, eoqg.a);
                    }
                }, eoscVar3).h(new ejvr() { // from class: ceih
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekrg ekrgVar2 = cejg.a;
                        return ezlpVar;
                    }
                }, eoqg.a);
            }
        };
        eosc eoscVar3 = this.l;
        return eijuVarI2.i(eoozVar2, eoscVar3).i(new eooz() { // from class: cehr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return cffmVar.d(this.a.s, (ezlp) obj);
            }
        }, eoscVar3).i(new eooz() { // from class: ceht
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return cffmVar.e((ezlr) obj);
            }
        }, eoscVar3).h(new ejvr() { // from class: cehu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ezlr ezlrVar = (ezlr) obj;
                if (ezlrVar == null) {
                    throw new IllegalArgumentException("Tachyon phone register response was null");
                }
                if ((ezlrVar.b & 8) != 0) {
                    ezpj ezpjVar = ezlrVar.f;
                    if (ezpjVar == null) {
                        ezpjVar = ezpj.a;
                    }
                    cejg.H(ezpjVar);
                }
                if ((ezlrVar.b & 2) != 0) {
                    return ezlrVar;
                }
                throw new IllegalArgumentException("Tachyon phone register response has no auth token");
            }
        }, eoscVar3).i(new eooz() { // from class: cehv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ezlr ezlrVar = (ezlr) obj;
                boolean z = ezlrVar.d;
                cejg cejgVar = this.a;
                if (z) {
                    return cejgVar.o().l().h(new ejvr() { // from class: cejb
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekrg ekrgVar2 = cejg.a;
                            return ezlrVar;
                        }
                    }, eoqg.a);
                }
                cexm cexmVarO = cejgVar.o();
                final long epochMilli = cejgVar.t.f().toEpochMilli();
                eiju eijuVarJ = cexmVarO.b.j(new ejvr() { // from class: cewl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cevr cevrVar = (cevr) obj2;
                        cevo cevoVar = (cevo) cevrVar.toBuilder();
                        int i = cevrVar.r + 1;
                        cevoVar.copyOnWrite();
                        ((cevr) cevoVar.instance).r = i;
                        cevoVar.copyOnWrite();
                        ((cevr) cevoVar.instance).q = epochMilli;
                        return (cevr) cevoVar.build();
                    }
                });
                ejvr ejvrVar = new ejvr() { // from class: cewm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return null;
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eijuVarJ.h(ejvrVar, eoqgVar).h(new ejvr() { // from class: cejc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekrg ekrgVar2 = cejg.a;
                        return ezlrVar;
                    }
                }, eoqgVar);
            }
        }, eoscVar3).i(new eooz() { // from class: cehw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ezlr ezlrVar = (ezlr) obj;
                boolean z = ezlrVar.d;
                final cejg cejgVar = this.a;
                if (!z) {
                    ekrw ekrwVarH4 = cejg.a.h();
                    ekrwVarH4.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "handleUnverifiedResponse", 502, "PhoneRegistrationProvider.java")).q("Received a valid unverified Tachyon RegisterResponse. Waiting for OTP.");
                    cexm cexmVarO = cejgVar.o();
                    ezns eznsVar = ezlrVar.e;
                    if (eznsVar == null) {
                        eznsVar = ezns.a;
                    }
                    return eiju.g(cexmVarO.p(eznsVar.b.I())).i(new eooz() { // from class: ceii
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            cejg cejgVar2 = cejgVar;
                            return eiju.g(kol.a(new ceje(cejgVar2))).j(((Integer) cejg.f.e()).intValue(), TimeUnit.SECONDS, cejgVar2.k);
                        }
                    }, cejgVar.k).f(TimeoutException.class, new eooz() { // from class: ceij
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            ekrg ekrgVar2 = cejg.a;
                            return eijx.d(new fbtf(Status.f.d((TimeoutException) obj2)));
                        }
                    }, eoqg.a);
                }
                ekrw ekrwVarH5 = cejg.a.h();
                ekrwVarH5.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 266, "PhoneRegistrationProvider.java")).q("Registration request is completed and verified.");
                final ezns eznsVar2 = ezlrVar.e;
                if (eznsVar2 == null) {
                    eznsVar2 = ezns.a;
                }
                ListenableFuture[] listenableFutureArr = new ListenableFuture[3];
                listenableFutureArr[0] = ((asep) cejgVar.w.b()).a() ? cejgVar.D(eznsVar2) : cejgVar.C(eznsVar2);
                listenableFutureArr[1] = cejgVar.t(ezlrVar.g);
                listenableFutureArr[2] = cejgVar.o().t(3);
                return eiju.g(eika.d(listenableFutureArr).a(new Callable() { // from class: cehx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ekrg ekrgVar2 = cejg.a;
                        return eznsVar2;
                    }
                }, eoqg.a));
            }
        }, eoscVar2);
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju f() {
        return o().c();
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju g() {
        return o().b();
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju h(byte[] bArr) {
        return o().e(bArr);
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju i(long j) {
        return o().d(j);
    }

    @Override // defpackage.ceku
    protected final eiju j(ezln ezlnVar) {
        ezns eznsVar = ezlnVar.d;
        if (eznsVar == null) {
            eznsVar = ezns.a;
        }
        ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
        listenableFutureArr[0] = ((asep) this.w.b()).a() ? D(eznsVar) : C(eznsVar);
        listenableFutureArr[1] = t(ezlnVar.h);
        return eiju.g(eika.d(listenableFutureArr).b(new eooy() { // from class: ceim
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.o().t(5);
            }
        }, eoqg.a));
    }

    @Override // defpackage.cedp
    public final String k() {
        return "RCS";
    }

    public final cexm o() {
        cexm cexmVar;
        synchronized (this.F) {
            if (this.G == null) {
                this.G = ((cexn) this.A.b()).a(this.j.b);
            }
            cexmVar = this.G;
        }
        return cexmVar;
    }

    public final eiju r(final String str) {
        final cfej cfejVar = new cfej(this.h, this.j, str);
        final cexm cexmVarO = o();
        eiju eijuVarG = eiju.g(cexmVarO.c());
        eooz eoozVar = new eooz() { // from class: ceis
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null || bArr.length == 0) {
                    throw new cekv("Phone registration is not ready.");
                }
                cfej cfejVar2 = cfejVar;
                cejg cejgVar = this.a;
                ezpo ezpoVarA = cejgVar.u.a("RCS");
                evqs evqsVarX = evqs.x(bArr);
                ezpoVarA.copyOnWrite();
                ezpp ezppVar = (ezpp) ezpoVarA.instance;
                ezpp ezppVar2 = ezpp.a;
                ezppVar.f = evqsVarX;
                ezol ezolVarU = cejgVar.u();
                ezpoVarA.copyOnWrite();
                ezpp ezppVar3 = (ezpp) ezpoVarA.instance;
                ezolVarU.getClass();
                ezppVar3.h = ezolVarU;
                ezppVar3.b |= 2;
                return cfejVar2.c((ezpp) ezpoVarA.build());
            }
        };
        eosc eoscVar = this.l;
        return eijuVarG.i(eoozVar, eoscVar).i(new eooz() { // from class: ceit
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return cfejVar.d(this.a.s, (ezjp) obj);
            }
        }, this.q).i(new eooz() { // from class: ceiu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return cfejVar.e((ezjr) obj);
            }
        }, eoscVar).i(new eooz() { // from class: ceiv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekrg ekrgVar = cejg.a;
                cmfo cmfoVar = cexmVarO.b;
                final String str2 = str;
                return cmfoVar.j(new ejvr() { // from class: cexc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cevo cevoVar = (cevo) ((cevr) obj2).toBuilder();
                        cevoVar.copyOnWrite();
                        cevr cevrVar = (cevr) cevoVar.instance;
                        String str3 = str2;
                        str3.getClass();
                        cevrVar.b |= 64;
                        cevrVar.u = str3;
                        return (cevr) cevoVar.build();
                    }
                }).h(new ejvr() { // from class: cexe
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, eoqg.a);
            }
        }, eoscVar).h(new ejvr() { // from class: ceiw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrg ekrgVar = cejg.a;
                return null;
            }
        }, eoqg.a);
    }

    public final eiju s(String str) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "provideOtpCode", 629, "PhoneRegistrationProvider.java")).q("Received OTP code");
        final cfgw cfgwVar = new cfgw(((ahmr) this.D.b()).a.a.a.pT, this.j, str);
        return eiju.g(o().j()).i(new eooz() { // from class: ceiz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null || bArr.length == 0) {
                    ekrw ekrwVarH2 = cejg.a.h();
                    ekrwVarH2.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "provideOtpCode", 637, "PhoneRegistrationProvider.java")).q("No auth token for Verify. Skip this OTP code.");
                    return eijx.e(false);
                }
                final cfgw cfgwVar2 = cfgwVar;
                final cejg cejgVar = this.a;
                ezpo ezpoVarA = cejgVar.u.a("RCS");
                evqs evqsVarX = evqs.x(bArr);
                ezpoVarA.copyOnWrite();
                ezpp ezppVar = (ezpp) ezpoVarA.instance;
                ezpp ezppVar2 = ezpp.a;
                ezppVar.f = evqsVarX;
                eiju eijuVarG = eiju.g(cfgwVar2.c((ezpp) ezpoVarA.build()));
                eooz eoozVar = new eooz() { // from class: cehy
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return cfgwVar2.d(cejgVar.s, (ezno) obj2);
                    }
                };
                eosc eoscVar = cejgVar.q;
                eiju eijuVarI = eijuVarG.i(eoozVar, eoscVar);
                eooz eoozVar2 = new eooz() { // from class: cehz
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return cfgwVar2.e((eznq) obj2);
                    }
                };
                eosd eosdVar = cejgVar.k;
                return eijuVarI.i(eoozVar2, eosdVar).i(new eooz() { // from class: ceia
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        eiju eijuVarC;
                        final eznq eznqVar = (eznq) obj2;
                        if ((eznqVar.b & 2) == 0) {
                            return eijx.d(new IllegalStateException("Verify response has no token"));
                        }
                        if (eznqVar.e.H()) {
                            return eijx.d(new IllegalStateException("Verify response has no registration Id"));
                        }
                        final cejg cejgVar2 = cejgVar;
                        ekrw ekrwVarH3 = cejg.a.h();
                        ekrwVarH3.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "handleVerifyResponse", 674, "PhoneRegistrationProvider.java")).q("VerifyResponse contains valid token. Updating data store.");
                        ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                        if (((asep) cejgVar2.w.b()).a()) {
                            ezns eznsVar = eznqVar.d;
                            if (eznsVar == null) {
                                eznsVar = ezns.a;
                            }
                            eijuVarC = cejgVar2.D(eznsVar);
                        } else {
                            ezns eznsVar2 = eznqVar.d;
                            if (eznsVar2 == null) {
                                eznsVar2 = ezns.a;
                            }
                            eijuVarC = cejgVar2.C(eznsVar2);
                        }
                        listenableFutureArr[0] = eijuVarC;
                        listenableFutureArr[1] = cejgVar2.t(eznqVar.e);
                        eijw eijwVarM = eijx.m(listenableFutureArr);
                        eooy eooyVar = new eooy() { // from class: cejd
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                return cejgVar2.o().t(4);
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        eiju eijuVarB = eijwVarM.b(eooyVar, eoqgVar);
                        eooz eoozVar3 = new eooz() { // from class: cehi
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                return cejgVar2.o().p(new byte[0]);
                            }
                        };
                        eosc eoscVar2 = cejgVar2.l;
                        return eijuVarB.i(eoozVar3, eoscVar2).i(new eooz() { // from class: cehj
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                return cejgVar2.o().l();
                            }
                        }, eoscVar2).h(new ejvr() { // from class: cehk
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                ekrg ekrgVar = cejg.a;
                                ezns eznsVar3 = eznqVar.d;
                                return eznsVar3 == null ? ezns.a : eznsVar3;
                            }
                        }, eoqgVar);
                    }
                }, eoscVar).h(new ejvr() { // from class: ceib
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        kog kogVar;
                        ezns eznsVar = (ezns) obj2;
                        cejg cejgVar2 = cejgVar;
                        synchronized (cejgVar2.n) {
                            kogVar = cejgVar2.o;
                            cejgVar2.o = null;
                        }
                        if (kogVar != null) {
                            ekrw ekrwVarH3 = cejg.a.h();
                            ekrwVarH3.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "completeAwaitingOtpFuture", 701, "PhoneRegistrationProvider.java")).q("OTP is processed and pending OTP completer is completed.");
                            kogVar.b(eznsVar);
                        } else {
                            ekrw ekrwVarH4 = cejg.a.h();
                            ekrwVarH4.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "completeAwaitingOtpFuture", 704, "PhoneRegistrationProvider.java")).q("OTP is processed successfully without awaiting completer.");
                        }
                        return true;
                    }
                }, eosdVar).f(Throwable.class, new eooz() { // from class: ceic
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        kog kogVar;
                        final Throwable th = (Throwable) obj2;
                        ekrw ekrwVarJ = cejg.a.j();
                        ekrwVarJ.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "completeAwaitingOtpFutureWithFailure", (char) 710, "PhoneRegistrationProvider.java")).q("Failed to handle OTP, failing awaiting futures.");
                        cejg cejgVar2 = cejgVar;
                        synchronized (cejgVar2.n) {
                            kogVar = cejgVar2.o;
                            cejgVar2.o = null;
                        }
                        if (kogVar != null) {
                            kogVar.c(th);
                        }
                        return eiju.g(cejgVar2.o().p(new byte[0])).i(new eooz() { // from class: cehn
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                ekrg ekrgVar = cejg.a;
                                return eijx.d(th);
                            }
                        }, eoqg.a);
                    }
                }, eoqg.a);
            }
        }, this.q);
    }

    public final eiju t(evqs evqsVar) {
        cexm cexmVarO = o();
        final String strE = evqsVar.E();
        return cexmVarO.b.j(new ejvr() { // from class: cevt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cevo cevoVar = (cevo) ((cevr) obj).toBuilder();
                cevoVar.copyOnWrite();
                ((cevr) cevoVar.instance).c = strE;
                return (cevr) cevoVar.build();
            }
        }).h(new ejvr() { // from class: cewa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final ezol u() {
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        felm felmVar = felm.PHONE_NUMBER;
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).b = felmVar.a();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).d = "RCS";
        ezokVar.copyOnWrite();
        ezol ezolVar = (ezol) ezokVar.instance;
        String str = this.j.b;
        str.getClass();
        ezolVar.c = str;
        return (ezol) ezokVar.build();
    }
}
