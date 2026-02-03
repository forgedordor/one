package defpackage;

import android.os.PowerManager;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgfg extends dfnb {
    public static final dfny d = dfod.a(168944779);
    public static final dfny e = dfod.a(177952078);
    public static final dfny f = dfod.a(185722655);
    public static final dfny g = dfod.a(186900101);
    public static final dfny h = dfod.a(187006179);
    static final dfny i = dfnv.b("clear_termination_reason_on_start");
    static final dfny j = dfnv.b("set_timeout_for_connecting_state");
    static final dfny k = dfnv.b("reset_network_callback_listener_when_callback_is_not_registered");
    final AtomicReference A;
    dfzs B;
    public final String C;
    public dezf D;
    public int E;
    int F;
    public final dgch G;
    public long H;
    public final dgis I;
    public final int J;
    final dgab K;
    public final dgfs L;
    public final crmx M;
    public final dgcf N;
    public final List O;
    public final List P;
    public final dfyr Q;
    final ScheduledExecutorService R;
    public final PowerManager S;
    public final dhks T;
    public final boolean U;
    public final AtomicBoolean V;
    final dgdq W;
    final dgdq X;
    final dgdq Y;
    final dgdq Z;
    final dgdq aa;
    final dgdq ab;
    final dgdq ac;
    final dgdq ad;
    final dgdq ae;
    final dgdq af;
    final dgdq ag;
    final dgdq ah;
    final dgdq ai;
    final dgdq aj;
    final dgdq ak;
    final dgdq al;
    private final dhkv am;
    private final eblo an;
    private final dhjt ao;
    private final dfcg ap;
    private final dgxm aq;
    private final dhej ar;
    private final AtomicReference as;
    private final ekhx at;
    private final ekhx au;
    private final int av;
    public final boolean l;
    public final dhip m;
    public final String n;
    public final int o;
    public final ebkz p;
    public final dfzr q;
    public final dhkr r;
    public final dfzz s;
    public final eblg t;
    public final ebqx u;
    ebky v;
    volatile dfyu w;
    ebqv x;
    String y;
    List z;

    public dgfg(String str, int i2, eblg eblgVar, dfzz dfzzVar, ebkz ebkzVar, dfzr dfzrVar, dgfs dgfsVar, dgab dgabVar, dgis dgisVar, int i3, String str2, dgxm dgxmVar, dfyr dfyrVar, dgch dgchVar, crmx crmxVar, dhip dhipVar, dfcg dfcgVar, dhej dhejVar, ScheduledExecutorService scheduledExecutorService, ebqx ebqxVar, dhjt dhjtVar, dgcf dgcfVar, PowerManager powerManager, dhks dhksVar, dhkr dhkrVar, dhkv dhkvVar, boolean z) {
        super("RegistrationStateMachine");
        int i4 = ekgb.d;
        this.z = ekoe.a;
        this.A = new AtomicReference();
        this.B = null;
        this.D = dezf.UNKNOWN;
        this.H = 0L;
        this.O = new CopyOnWriteArrayList();
        this.P = new CopyOnWriteArrayList();
        this.V = new AtomicBoolean();
        dgez dgezVar = new dgez(this);
        this.W = dgezVar;
        dgem dgemVar = new dgem(this);
        this.X = dgemVar;
        dgff dgffVar = new dgff(this);
        this.Y = dgffVar;
        dgef dgefVar = new dgef(this);
        this.Z = dgefVar;
        dges dgesVar = new dges(this);
        this.aa = dgesVar;
        dgeo dgeoVar = new dgeo(this);
        this.ab = dgeoVar;
        dgfb dgfbVar = new dgfb(this);
        this.ac = dgfbVar;
        dgfa dgfaVar = new dgfa(this);
        this.ad = dgfaVar;
        dgeu dgeuVar = new dgeu(this);
        this.ae = dgeuVar;
        dget dgetVar = new dget(this);
        this.af = dgetVar;
        dgej dgejVar = new dgej(this);
        this.ag = dgejVar;
        dgeh dgehVar = new dgeh(this);
        this.ah = dgehVar;
        dgen dgenVar = new dgen(this);
        this.ai = dgenVar;
        dgey dgeyVar = new dgey(this);
        this.aj = dgeyVar;
        dgex dgexVar = new dgex(this);
        this.ak = dgexVar;
        dgek dgekVar = new dgek(this);
        this.al = dgekVar;
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("StoppedState", dgezVar);
        ekgiVar.i("ReadyState", dgemVar);
        ekgiVar.i("WaitForNetworkState", dgffVar);
        ekgiVar.i("ConnectingState", dgefVar);
        ekgiVar.i("RegisteringState", dgesVar);
        ekgiVar.i("RegisteredState", dgeoVar);
        ekgiVar.i("SubscribingState", dgfbVar);
        ekgiVar.i("SubscribedState", dgfaVar);
        ekgiVar.i("ReregisteringState", dgeuVar);
        ekgiVar.i("ReregisteredState", dgetVar);
        ekgiVar.i("DeregisteringState", dgejVar);
        ekgiVar.i("DeregisteredState", dgehVar);
        ekgiVar.i("ReconfigurationRequiredState", dgenVar);
        ekgiVar.i("SimRemovedState", dgeyVar);
        ekgiVar.i("RetryState", dgexVar);
        ekgiVar.i("DisabledState", dgekVar);
        ekgiVar.c();
        this.at = ekhx.u(dgeoVar, dgeuVar, dgetVar, dgfbVar, dgfaVar);
        this.au = ekhx.t(dgemVar, dgffVar, dgefVar, dgesVar);
        this.m = dhipVar;
        this.n = str;
        this.o = i2;
        this.ap = dfcgVar;
        this.p = ebkzVar;
        this.s = dfzzVar;
        this.q = dfzrVar;
        this.K = dgabVar;
        this.I = dgisVar;
        this.J = i3;
        this.C = str2;
        this.av = 1;
        this.aq = dgxmVar;
        this.Q = dfyrVar;
        this.L = dgfsVar;
        this.G = dgchVar;
        this.M = crmxVar;
        this.R = scheduledExecutorService;
        this.as = new AtomicReference();
        this.t = eblgVar;
        this.ar = dhejVar;
        this.u = ebqxVar;
        this.ao = dhjtVar;
        this.U = z;
        this.an = new eblo(dhipVar, dfcgVar);
        this.N = dgcfVar;
        this.S = powerManager;
        this.T = dhksVar;
        this.r = dhkrVar;
        this.am = dhkvVar;
        this.l = ((Boolean) dfpo.p().a.y.a()).booleanValue();
    }

    public final void A() {
        eblg eblgVar = this.t;
        eblf eblfVar = eblgVar.a;
        if (eblfVar != ebli.f) {
            dhja.d(this.m, "Resetting SipStack.", new Object[0]);
            eblfVar.a.clear();
            eblfVar.c().c();
            eblgVar.a();
        }
    }

    public final void B(dezf dezfVar) {
        dhip dhipVar = this.m;
        dhja.d(dhipVar, "deregister: reason=%s", dezfVar);
        if (dezf.DISABLED.equals(dezfVar)) {
            this.G.c();
        }
        if (Q() && dezf.FCM_TICKLE_KEEP_ALIVE.equals(dezfVar)) {
            dhja.d(dhipVar, "Registration is in progress. Ignore tickle messages.", new Object[0]);
        } else {
            s(8, dezfVar);
        }
    }

    public final void C(String str, Throwable th) {
        ebqv ebqvVar = this.x;
        if (Objects.isNull(ebqvVar) || Objects.isNull(str) || Objects.isNull(th)) {
            return;
        }
        dhip dhipVar = this.m;
        dhja.d(dhipVar, "SIP transport error from %s - %s", str, th.getMessage());
        if (!str.equals(ebqvVar.d())) {
            dhja.d(dhipVar, "Ignore transport error from other network interfaces.", new Object[0]);
        } else {
            N(dezf.NETWORK_ERROR);
            w(this.ah);
        }
    }

    public final void D(final dezf dezfVar) {
        dhja.d(this.m, "Notify Failed. reason=%s", dezfVar);
        Runnable runnable = new Runnable() { // from class: dgdn
            @Override // java.lang.Runnable
            public final void run() {
                Collection.EL.stream(this.a.P).forEach(new Consumer() { // from class: dgcx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        dfny dfnyVar = dgfg.d;
                        ((dfyw) obj).m();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.R;
        scheduledExecutorService.execute(runnable);
        scheduledExecutorService.execute(new Runnable() { // from class: dgdo
            @Override // java.lang.Runnable
            public final void run() {
                Stream stream = Collection.EL.stream(this.a.O);
                final dezf dezfVar2 = dezfVar;
                stream.forEach(new Consumer() { // from class: dgct
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        dfny dfnyVar = dgfg.d;
                        ((dfzi) obj).g(dezfVar2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }

    public final void E() {
        dhja.d(this.m, "Notify ReconfigurationRequired.", new Object[0]);
        this.R.execute(new Runnable() { // from class: dgcz
            @Override // java.lang.Runnable
            public final void run() {
                Collection.EL.stream(this.a.P).forEach(new Consumer() { // from class: dgdb
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        dfny dfnyVar = dgfg.d;
                        ((dfyw) obj).i();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }

    final void F(Runnable runnable) {
        s(EnergyProfile.EVCONNECTOR_TYPE_OTHER, runnable);
    }

    public final void G(boolean z) {
        if (dfpk.o()) {
            if (z) {
                this.V.set(true);
                q(16);
            } else {
                this.V.set(false);
                q(17);
            }
        }
    }

    public final void H(dfyw dfywVar) {
        this.P.add(dfywVar);
    }

    public final void I() {
        this.v = null;
    }

    public final void J(Runnable runnable, long j2, TimeUnit timeUnit) {
        z();
        this.as.set(this.R.schedule(runnable, j2, timeUnit));
    }

    public final void K() {
        int i2 = this.F;
        long j2 = i2 > 1200 ? i2 - 600 : i2 >> 1;
        p(14);
        if (j2 > 0) {
            dhja.d(this.m, "Scheduling Refresh registration in %ds", Long.valueOf(j2));
            J(new Runnable() { // from class: dgdi
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.q(14);
                }
            }, j2, TimeUnit.SECONDS);
        }
    }

    protected final void L() throws ebmn, dfzh {
        ebky ebkyVar = this.v;
        if (Objects.isNull(ebkyVar)) {
            throw new ebmn("Null SipDialogPath. Can't send De-REGISTER.");
        }
        eblf eblfVar = this.t.a;
        if (Objects.isNull(eblfVar)) {
            throw new dfzh("Null SipStack. Can't send De-REGISTER.");
        }
        ebkyVar.a();
        ebqr ebqrVarY = y(eblfVar, ebkyVar, 0, this.I.a(), false, false, null);
        dhja.d(this.m, "sending SIP deregistration request: %s", ebqrVarY);
        R(eblfVar, ebqrVarY);
    }

    protected final void M() throws ebmn, dfzh {
        ebky ebkyVar;
        eblf eblfVar = this.t.a;
        if (eblfVar.v()) {
            throw new dfzh("Null SipStack. Can't send REGISTER.");
        }
        ebky ebkyVar2 = this.v;
        if (ebkyVar2 == null) {
            dgis dgisVar = this.I;
            String strW = eblf.w();
            String strN = dgisVar.n();
            String strW2 = dgisVar.w();
            if (Objects.isNull(strW2)) {
                throw new ebmn("Empty public identity in ImsConfiguration.");
            }
            ArrayList arrayList = eblfVar.d;
            if (arrayList.isEmpty()) {
                try {
                    eblfVar.b();
                    eblx eblxVarC = ebkr.c(eblfVar.m().f(), eblfVar.m().b(), eblfVar.p());
                    eblfVar.b();
                    arrayList.add(new ebon(ebkr.a(eblxVarC)));
                } catch (ebml e2) {
                    dhja.i(e2, "Can't create default Route header", new Object[0]);
                }
            }
            ebky ebkyVar3 = new ebky(strW, 1, "sip:".concat(strN), strW2, strW2, eblfVar.d);
            this.v = ebkyVar3;
            ebkyVar = ebkyVar3;
        } else {
            ebkyVar2.a();
            ebkyVar = ebkyVar2;
        }
        int i2 = this.E;
        if (i2 <= 0) {
            i2 = this.F;
        }
        int i3 = i2;
        if (Objects.isNull(this.y)) {
            this.y = this.I.w();
        }
        dgis dgisVar2 = this.I;
        ebqr ebqrVarY = y(eblfVar, ebkyVar, i3, dgisVar2.a(), dgisVar2.B(), ((Boolean) dfpo.p().a.p.a()).booleanValue(), this.ar.a);
        dhja.d(this.m, "sending SIP registration request: %s", ebqrVarY);
        R(eblfVar, ebqrVarY);
    }

    final void N(Object obj) {
        this.D = obj instanceof dezf ? (dezf) obj : dezf.UNKNOWN;
    }

    public final void O() {
        dgco dgcoVar = (dgco) this.A.getAndSet(null);
        if (dgcoVar != null) {
            this.r.h(dgcoVar);
        }
        this.B = null;
    }

    public final boolean P() {
        dfmy dfmyVarD = d();
        if (dfmyVarD == null) {
            return false;
        }
        return this.at.contains(dfmyVarD);
    }

    public final boolean Q() {
        dfmy dfmyVarD = d();
        if (dfmyVarD == null) {
            return false;
        }
        return this.au.contains(dfmyVarD);
    }

    protected final void R(eblf eblfVar, ebqr ebqrVar) {
        try {
            eblm eblmVarK = eblfVar.k(ebqrVar, new dgdp(this, ebqrVar));
            int iF = this.I.f() * 60;
            dhip dhipVar = this.m;
            dhja.d(dhipVar, "Set SIP request timeout to %dms", Integer.valueOf(iF));
            long j2 = iF;
            dfnn dfnnVar = this.b;
            if (dfnnVar != null) {
                dfnnVar.sendMessageDelayed(b(3, eblmVarK), j2);
            }
            dhja.d(dhipVar, "Wait SIP response for %s, CallId=%s", ebqrVar.z(), ebqrVar.y().h());
            Optional.of(eblmVarK);
        } catch (ebmn e2) {
            s(2, e2);
            Optional.empty();
        }
    }

    final eblf x(ebmr ebmrVar, ebqv ebqvVar, ebkz ebkzVar) {
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        if (this.l) {
            dfzs dfzsVar = this.B;
            dfzsVar.getClass();
            ekfwVar.h(new dhjp(dfzsVar, this.am));
        } else {
            ekfwVar.h(new dhjo(this.av, this.w));
        }
        ekfwVar.h(new dgvd());
        try {
            ekfwVar.h(new dhjy(dhjv.f(this.ao.b.a())));
        } catch (ebml e2) {
            dhja.g("Can't add UserAgentHeaderMessageFilter. %s", e2.getMessage());
        }
        dgis dgisVar = this.I;
        ebln eblnVarA = this.an.a(ebqvVar, new ebmc(dgisVar.f(), dgisVar.g(), dgisVar.h()));
        dhip dhipVar = this.m;
        eblh eblhVarX = ebli.x();
        eblhVarX.c(dhipVar);
        ebks ebksVar = (ebks) eblhVarX;
        ebksVar.a = dgisVar.x();
        ebksVar.b = dgisVar.n();
        ebksVar.c = eblnVarA;
        eblhVarX.e(ebmrVar);
        eblhVarX.d(this.C);
        ebksVar.b(ekfwVar.g());
        ebli ebliVarA = eblhVarX.a();
        if (ebkzVar != null) {
            ebliVarA.r(ebkzVar);
        }
        ebliVarA.b = this.L;
        ebliVarA.u();
        return ebliVarA;
    }

    final ebqr y(eblf eblfVar, ebky ebkyVar, int i2, float f2, boolean z, boolean z2, String str) throws ebmn, dfzh {
        ebkr ebkrVar = dhjv.a;
        dhjt dhjtVar = this.ao;
        try {
            String str2 = ebkyVar.f;
            String str3 = ebkyVar.a;
            String str4 = ebkyVar.g;
            String str5 = ebkyVar.h;
            dhjt.m(str3, str4, str5);
            ebma ebmaVarD = ebkr.d(str2);
            ebno ebnoVarB = ebql.b(str3);
            ebnn ebnnVarA = ebql.a(ebkyVar.b, "REGISTER");
            eblv eblvVarB = ebkr.b(str4);
            eboa eboaVarF = ebql.f(eblvVarB, ebkyVar.d);
            ebos ebosVarI = ebql.i(ebkr.b(str5), null);
            ebov ebovVarJ = ebql.j(eblfVar.n(), eblfVar.i(), eblfVar.p(), dhjv.p());
            if (z) {
                ebovVarJ.f();
            }
            if (z2) {
                ebovVarJ.o();
            }
            ebovVarJ.g();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ebovVarJ);
            ebpd ebpdVarA = ebkx.a(ebmaVarD, "REGISTER", ebnoVarB, ebnnVarA, eboaVarF, ebosVarI, arrayList, dhjv.g());
            ebnr ebnrVarA = dhjt.a(eblfVar, true, new String[0]);
            ebnrVarA.j(new ebmj("expires", Integer.valueOf(i2)));
            if (f2 > 0.0f && f2 <= 1.0f) {
                ebnrVarA.j(new ebmj("q", Float.valueOf(f2)));
            }
            ebpdVarA.k(ebnrVarA);
            ebpdVarA.k(ebql.g("Supported", "path,gruu"));
            ebpdVarA.k(ebql.g("P-Preferred-Identity", eblvVarB.c()));
            ebpdVarA.k(dhjv.f(dhjtVar.b.a()));
            ebpdVarA.k(dhjv.F());
            ebpdVarA.k(ebql.c(0));
            ebqr ebqrVar = new ebqr(ebpdVarA);
            dgxd.d(ebqrVar.b(), this.aq.b(), this.U);
            dgab dgabVar = this.K;
            String str6 = dgabVar.c;
            String str7 = dgabVar.d;
            String str8 = dgabVar.e;
            if (dhim.d(str6)) {
                dhja.q("Empty username for security header.", new Object[0]);
            }
            if (dhim.d(str7)) {
                dhja.q("Empty password for security header.", new Object[0]);
            }
            if (dhim.d(str8)) {
                dhja.q("Empty realm for security header.", new Object[0]);
            }
            dhfe dhfeVar = ((dgaa) dgabVar).a;
            if (dhfeVar.d == null) {
                ebqrVar.r("Authorization: Digest username=\"" + str6 + "\",uri=\"" + ebqrVar.A() + "\",algorithm=MD5,realm=\"" + str8 + "\",nonce=\"\",response=\"\"");
            } else {
                try {
                    dhfeVar.c();
                    String strB = dhfeVar.b(str6, str7, ebqrVar.z(), ebqrVar.A(), dhfeVar.a(), ebqrVar.g());
                    String str9 = "Authorization: Digest username=\"" + str6 + "\",uri=\"" + ebqrVar.A() + "\",algorithm=MD5,realm=\"" + ejwk.b(dhfeVar.b) + "\",nonce=\"" + ejwk.b(dhfeVar.c) + "\",response=\"" + strB + "\"";
                    String str10 = dhfeVar.e;
                    if (str10 != null && str10.startsWith("auth")) {
                        str9 = str9 + ",nc=" + dhfeVar.a() + ",qop=" + str10 + ",cnonce=\"" + dhfeVar.a + "\"";
                    }
                    ebqrVar.r(str9);
                } catch (Exception e2) {
                    dhja.i(e2, "Can't create the authorization header", new Object[0]);
                    throw new dfzh("Can't write the security header".concat(String.valueOf(e2.getMessage())), e2);
                }
            }
            try {
                int i3 = this.av;
                if (!((Boolean) dfpo.p().a.x.a()).booleanValue() || TextUtils.isEmpty(str)) {
                    return ebqrVar;
                }
                if (i3 == 0) {
                    throw null;
                }
                ebqrVar.q(ebql.g("X-Google-Self-Service-Message-ID", str.replace("\n", "").replace("\r", "")));
                return ebqrVar;
            } catch (ebml e3) {
                dhja.j(e3, this.m, "Failed to add SelfServiceMessageId header.", new Object[0]);
                return ebqrVar;
            }
        } catch (Exception e4) {
            dhja.i(e4, "Can't create SIP message", new Object[0]);
            throw new ebmn("Can't create SIP REGISTER message. ", e4);
        }
    }

    public final void z() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.as.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
