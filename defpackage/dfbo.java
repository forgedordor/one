package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfbo extends dfaq {
    public static final dhip x = new dhip("RcsMobileConfigurationFlags");
    private final eosc A;
    private Optional B = Optional.empty();
    private Optional C = Optional.empty();
    private final AtomicLong D;
    private final Duration E;
    private final Duration F;
    private final dfap G;
    private final dfap H;
    private final dfap I;
    private final dfap J;
    private final dfap K;
    private final dfap L;
    private final dfap M;
    private final dfap N;
    private final dfap O;
    private final dfap P;
    private final dfap Q;
    private dfbn R;
    private dfbn S;
    private dfbn T;
    private dfbn U;
    private dfbn V;
    private dfbn W;
    private dfbn X;
    private dfbn Y;
    private dfbn Z;
    private dfbn aa;
    private dfbn ab;
    private dfbn ac;
    private dfbn ad;
    private dfbn ae;
    private dfbn af;
    private dfbn ag;
    private dfbn ah;
    private dfbn ai;
    private dfbn aj;
    private final fcsu y;
    private final fcsu z;

    public dfbo(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.D = atomicLong;
        this.y = fcsuVar;
        this.z = fcsuVar2;
        this.A = eoscVar;
        if (dfaq.a == null) {
            dfaq.H(((dfao) dfds.a(dfao.class)).a());
        }
        if (dfaq.a == null) {
            throw new IllegalStateException("RcsFlags is not initialized!");
        }
        dfaq dfaqVar = dfaq.a;
        this.G = dfaqVar.c();
        this.H = dfaqVar.e();
        this.I = dfaqVar.h();
        this.J = dfaqVar.i();
        this.K = dfaqVar.z();
        this.L = dfaqVar.k();
        this.M = dfaqVar.l();
        this.N = dfaqVar.A();
        this.O = dfaqVar.B();
        this.P = dfaqVar.D();
        this.Q = dfaqVar.f();
        Duration durationOfMillis = Duration.ofMillis(((Long) dfpi.t().a.V.a()).longValue());
        this.E = durationOfMillis;
        Duration durationOfMillis2 = Duration.ofMillis(((Long) dfpi.t().a.W.a()).longValue());
        this.F = durationOfMillis2;
        atomicLong.set(Instant.now().plus(durationOfMillis2).minus(durationOfMillis).toEpochMilli());
    }

    public static final Integer O(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 4 ? 2 : 3;
        }
        return 1;
    }

    private final Optional P() {
        if (N(false)) {
            if (!((Boolean) dfpi.t().a.T.a()).booleanValue() || ecem.g()) {
                eork.r(this.A.submit(new Callable() { // from class: dfas
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dfbo dfboVar = this.a;
                        if (!dfboVar.N(true)) {
                            return null;
                        }
                        dfboVar.M();
                        return null;
                    }
                }), new dfbm(), eoqg.a);
            } else {
                M();
            }
        }
        return this.C;
    }

    @Override // defpackage.dfaq
    public final dfap A() {
        return this.N;
    }

    @Override // defpackage.dfaq
    public final dfap B() {
        return this.O;
    }

    @Override // defpackage.dfaq
    public final dfap C() {
        dfbn dfbnVar = new dfbn((Integer) P().map(new Function() { // from class: dfaz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((etsz) obj).k);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(l), "sms_port");
        this.ac = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap D() {
        return this.P;
    }

    @Override // defpackage.dfaq
    public final boolean K() {
        return false;
    }

    @Override // defpackage.dfaq
    public final int L() {
        return 6;
    }

    public final void M() {
        fcsu fcsuVar = this.z;
        this.B = Optional.of(((dheq) fcsuVar.b()).g());
        String strF = ((dheq) fcsuVar.b()).f();
        if (strF.isEmpty()) {
            dhja.r(x, "not calling getConfiguration because simId is empty", new Object[0]);
        } else {
            this.C = ((diff) this.y.b()).a(cebg.c(strF, etsf.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS).d()).map(new Function() { // from class: dfat
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    etsc etscVar = (etsc) obj;
                    return etscVar.c == 3 ? (etsz) etscVar.d : etsz.c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
    }

    public final synchronized boolean N(boolean z) {
        Instant instantNow = Instant.now();
        AtomicLong atomicLong = this.D;
        if (!instantNow.isAfter(Instant.ofEpochMilli(atomicLong.get()).plus(this.E))) {
            return false;
        }
        if (z) {
            atomicLong.set(Instant.now().toEpochMilli());
        }
        return true;
    }

    @Override // defpackage.dfaq
    public final dfap a() {
        dfbn dfbnVar = new dfbn((String) P().map(new Function() { // from class: dfbh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etsz etszVar = (etsz) obj;
                return etszVar.e == 2 ? (String) etszVar.f : "";
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(""), "acs_url");
        this.R = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap b() {
        dfbn dfbnVar = new dfbn((Boolean) P().map(new Function() { // from class: dfbd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((etsz) obj).w);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(p), "allow_manual_phone_number_input");
        this.ae = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap c() {
        return this.G;
    }

    @Override // defpackage.dfaq
    public final dfap d() {
        dfbn dfbnVar = new dfbn((Boolean) P().map(new Function() { // from class: dfau
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((etsz) obj).D);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(o), "allow_seamless_authorized_provisioning");
        this.ad = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap e() {
        return this.H;
    }

    @Override // defpackage.dfaq
    public final dfap f() {
        return this.Q;
    }

    @Override // defpackage.dfaq
    public final dfap g() {
        dfbn dfbnVar = new dfbn((Boolean) P().map(new Function() { // from class: dfay
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((etsz) obj).A);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(r), "enable_instance_id_in_provisioning");
        this.ag = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap h() {
        return this.I;
    }

    @Override // defpackage.dfaq
    public final dfap i() {
        return this.J;
    }

    @Override // defpackage.dfaq
    public final dfap j() {
        dfbn dfbnVar = new dfbn((Long) P().map(new Function() { // from class: dfbc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                evrj evrjVar = ((etsz) obj).J;
                return evrjVar == null ? evrj.a : evrjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new dfbk()).orElse(Long.valueOf(w)), "provisioning_retry_max_delay_in_millis");
        this.S = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap k() {
        return this.L;
    }

    @Override // defpackage.dfaq
    public final dfap l() {
        return this.M;
    }

    @Override // defpackage.dfaq
    public final dfap m() {
        dfbn dfbnVar = new dfbn((String) P().map(new Function() { // from class: dfbl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                etsz etszVar = (etsz) obj;
                return etszVar.e == 3 ? (String) etszVar.f : "";
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(""), "mcc_url_format");
        this.T = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap n() {
        dfbn dfbnVar = new dfbn((Long) P().map(new Function() { // from class: dfbj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                evrj evrjVar = ((etsz) obj).K;
                return evrjVar == null ? evrj.a : evrjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new dfbk()).orElse(Long.valueOf(v)), "provisioning_retry_min_delay_in_millis");
        this.U = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap o() {
        dfbn dfbnVar = new dfbn((Boolean) P().map(new Function() { // from class: dfbe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((etsz) obj).L);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(u), "notify_backend_rcs_is_unavailable");
        this.aj = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap p() {
        dfbn dfbnVar = new dfbn((String) P().map(new Function() { // from class: dfax
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((etsz) obj).j;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(""), "otp_pattern");
        this.V = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap q() {
        dfbn dfbnVar = new dfbn((Integer) P().map(new Function() { // from class: dfav
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dhip dhipVar = dfbo.x;
                evrj evrjVar = ((etsz) obj).l;
                if (evrjVar == null) {
                    evrjVar = evrj.a;
                }
                return Integer.valueOf((int) evwy.b(evrjVar));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(i), "otp_wait_time_millis");
        this.W = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap r() {
        dfbn dfbnVar = new dfbn((Integer) P().map(new Function() { // from class: dfba
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int iC = etsr.c(((etsz) obj).E);
                if (iC == 0) {
                    iC = 1;
                }
                return dfbo.O(iC);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(2), "provisioning_imei_format");
        this.X = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap s() {
        dfbn dfbnVar = new dfbn((Integer) P().map(new Function() { // from class: dfbg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int iC = etsr.c(((etsz) obj).F);
                if (iC == 0) {
                    iC = 1;
                }
                return dfbo.O(iC);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(2), "provisioning_imsi_format");
        this.Y = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap t() {
        Optional optionalP = P();
        if (optionalP.isEmpty()) {
            dfbn dfbnVar = new dfbn("00101", "rcs_enabled_mcc_mnc");
            this.Z = dfbnVar;
            return dfbnVar;
        }
        int iA = etsv.a(((etsz) optionalP.get()).g);
        if (iA == 0) {
            iA = 1;
        }
        if (iA - 2 != 1) {
            dfbn dfbnVar2 = new dfbn("00101", "rcs_enabled_mcc_mnc");
            this.Z = dfbnVar2;
            return dfbnVar2;
        }
        if (this.B.isEmpty()) {
            dhja.r(x, "Unable to get cached simOperator, get it from simProvider instead.", new Object[0]);
            this.B = Optional.of(((dheq) this.z.b()).g());
        }
        return new dfbn(this.B.get(), "rcs_enabled_mcc_mnc");
    }

    @Override // defpackage.dfaq
    public final dfap u() {
        dfbn dfbnVar = new dfbn((String) P().map(new Function() { // from class: dfaw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((etsz) obj).B;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("UP_T"), "rcs_profile");
        this.aa = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap v() {
        Optional optionalP = P();
        if (optionalP.isEmpty()) {
            dfbn dfbnVar = new dfbn(t, "rcs_provisioning_enabled");
            this.ai = dfbnVar;
            return dfbnVar;
        }
        int iA = etsv.a(((etsz) optionalP.get()).g);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 2;
        if (i == 1) {
            return new dfbn(true, "rcs_provisioning_enabled");
        }
        if (i == 2) {
            return new dfbn(false, "rcs_provisioning_enabled");
        }
        dfbn dfbnVar2 = new dfbn(t, "rcs_provisioning_enabled");
        this.ai = dfbnVar2;
        return dfbnVar2;
    }

    @Override // defpackage.dfaq
    public final dfap w() {
        dfbn dfbnVar = new dfbn((String) P().map(new Function() { // from class: dfbf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((etsz) obj).C;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("5.1B"), "rcs_version");
        this.ab = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap x() {
        dfbn dfbnVar = new dfbn((Boolean) P().map(new Function() { // from class: dfbi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((etsz) obj).n);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(q), "show_google_tos");
        this.af = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap y() {
        dfbn dfbnVar = new dfbn((Boolean) P().map(new Function() { // from class: dfbb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((etsz) obj).o);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(s), "show_rcs_enabled_by_carrier_in_settings");
        this.ah = dfbnVar;
        return dfbnVar;
    }

    @Override // defpackage.dfaq
    public final dfap z() {
        return this.K;
    }
}
