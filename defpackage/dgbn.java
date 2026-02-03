package defpackage;

import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.DelegateRequest;
import android.telephony.ims.ImsException;
import android.telephony.ims.ImsRcsManager;
import android.telephony.ims.RcsUceAdapter;
import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateConnection;
import android.telephony.ims.SipDelegateManager;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgbn extends dfnb {
    public static final /* synthetic */ int L = 0;
    public final RcsUceAdapter A;
    public final dhjt B;
    public final deym C;
    public SipDelegateConnection D;
    public SipDelegateConfiguration E;
    public dgbw F;
    public String G;
    public RcsUceAdapter.OnPublishStateChangedListener H;
    public final Optional I;
    public final UUID J;
    public final dgce K;
    private final dgbu N;
    private final dgaz O;
    private final eblg P;
    private final eblo Q;

    @Deprecated
    private final dgit R;

    @Deprecated
    private final InstantMessageConfiguration S;
    private final ImsRcsManager T;
    private final AtomicInteger U;
    private final RcsUceAdapter.OnPublishStateChangedListener V;
    private final dgim W;
    private dfzy X;
    private SettableFuture Y;
    private ekhx Z;
    private final dfyp aa;
    public final dhip i;
    final dgbb j;
    final dgbb k;
    final dgbb l;
    final dgbb m;
    final dgbb n;
    final dgbb o;
    final dgbb p;
    final dgbb q;
    final dgbb r;
    final dgbb s;
    final dgbb t;
    final ekhx u;
    public final dfzi v;
    public final ebkz w;
    public final dfzz x;
    public final SipDelegateManager y;
    public final eosd z;
    static final dfny d = dfod.a(190037064);
    static final dfny e = dfod.a(190018698);
    static final dfny f = dfod.a(172413462);
    static final dfny g = dfod.a(189380557);
    static final dfny h = dfnv.b("enable_processing_registering_feature_tags");
    private static final String M = dgxd.b();

    public dgbn(RcsUceAdapter rcsUceAdapter, dfzi dfziVar, eblg eblgVar, dfzz dfzzVar, ebkz ebkzVar, dhip dhipVar, SipDelegateManager sipDelegateManager, eosd eosdVar, dfyp dfypVar, dgit dgitVar, dgim dgimVar, InstantMessageConfiguration instantMessageConfiguration, dfcg dfcgVar, dgbu dgbuVar, ImsRcsManager imsRcsManager, dgak dgakVar, dhjt dhjtVar, Optional optional, deym deymVar, final dgal dgalVar) {
        super("SingleRegistrationStatemachine");
        dgbf dgbfVar = new dgbf(this);
        this.j = dgbfVar;
        dgbc dgbcVar = new dgbc(this);
        this.k = dgbcVar;
        dgbi dgbiVar = new dgbi(this);
        this.l = dgbiVar;
        dgbh dgbhVar = new dgbh(this);
        this.m = dgbhVar;
        dgbk dgbkVar = new dgbk(this);
        this.n = dgbkVar;
        dgbj dgbjVar = new dgbj(this);
        this.o = dgbjVar;
        dgbg dgbgVar = new dgbg(this);
        this.p = dgbgVar;
        dgbd dgbdVar = new dgbd(this);
        this.q = dgbdVar;
        dgbe dgbeVar = new dgbe(this);
        this.r = dgbeVar;
        dgbl dgblVar = new dgbl(this);
        this.s = dgblVar;
        dgbm dgbmVar = new dgbm(this);
        this.t = dgbmVar;
        this.u = P() ? ekhx.s(dgbcVar, dgbkVar, dgbjVar) : ekhx.r(dgbcVar, dgbkVar);
        new CopyOnWriteArrayList();
        this.U = new AtomicInteger(0);
        this.Z = ekon.a;
        this.A = rcsUceAdapter;
        this.v = dfziVar;
        this.i = dhipVar.b("[SRRSM]");
        this.w = ebkzVar;
        this.P = eblgVar;
        this.x = dfzzVar;
        this.y = sipDelegateManager;
        this.z = eosdVar;
        this.aa = dfypVar;
        this.R = dgitVar;
        this.W = dgimVar;
        this.S = instantMessageConfiguration;
        this.N = dgbuVar;
        this.T = imsRcsManager;
        this.O = new dgaz(dgakVar);
        this.B = dhjtVar;
        this.I = optional;
        this.C = deymVar;
        this.J = UUID.randomUUID();
        this.Q = new eblo(dhipVar, dfcgVar);
        this.K = new dgce();
        this.V = new RcsUceAdapter.OnPublishStateChangedListener() { // from class: dgas
            public final void onPublishStateChange(int i) {
                String string = this.a.J.toString();
                ewig ewigVar = (ewig) ewih.a.createBuilder();
                ewigVar.copyOnWrite();
                ewih ewihVar = (ewih) ewigVar.instance;
                int i2 = 7;
                ewihVar.f = 7;
                ewihVar.b |= 2;
                ewigVar.copyOnWrite();
                ewih ewihVar2 = (ewih) ewigVar.instance;
                ewihVar2.g = 2;
                ewihVar2.b |= 4;
                ewhj ewhjVar = (ewhj) ewhl.a.createBuilder();
                ewhjVar.copyOnWrite();
                ewhl ewhlVar = (ewhl) ewhjVar.instance;
                string.getClass();
                ewhlVar.b |= 1;
                ewhlVar.c = string;
                switch (i) {
                    case 1:
                        i2 = 2;
                        break;
                    case 2:
                        i2 = 3;
                        break;
                    case 3:
                        i2 = 4;
                        break;
                    case 4:
                        i2 = 5;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        break;
                    case 7:
                        i2 = 8;
                        break;
                    default:
                        i2 = 1;
                        break;
                }
                dgal dgalVar2 = dgalVar;
                ewhjVar.copyOnWrite();
                ewhl ewhlVar2 = (ewhl) ewhjVar.instance;
                ewhlVar2.d = i2 - 1;
                ewhlVar2.b |= 2;
                ewigVar.copyOnWrite();
                ewih ewihVar3 = (ewih) ewigVar.instance;
                ewhl ewhlVar3 = (ewhl) ewhjVar.build();
                ewhlVar3.getClass();
                ewihVar3.d = ewhlVar3;
                ewihVar3.c = 10;
                dgalVar2.a.h(dgalVar2.b, (ewih) ewigVar.build());
            }
        };
        e(dgbfVar);
        e(dgbcVar);
        e(dgbkVar);
        e(dgbhVar);
        e(dgbiVar);
        e(dgbjVar);
        f(dgbgVar, dgbjVar);
        e(dgbeVar);
        e(dgbdVar);
        e(dgblVar);
        e(dgbmVar);
        u(dgbfVar);
    }

    public static boolean P() {
        return (dfog.H() || ((Boolean) dfog.o().a.o.a()).booleanValue()) && ((Boolean) g.a()).booleanValue();
    }

    private final void Q() {
        String strV;
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        dgir dgirVarI = dfog.J() ? this.W.a.m().i() : this.R.a.i();
        String homeDomain = sipDelegateConfiguration.getHomeDomain();
        homeDomain.getClass();
        dgirVarI.k(homeDomain);
        int port = sipDelegateConfiguration.getSipServerAddress().getPort();
        ejwl.a(port > 0);
        dgirVarI.l(port);
        String homeDomain2 = sipDelegateConfiguration.getHomeDomain();
        homeDomain2.getClass();
        dgirVarI.f(homeDomain2);
        String strZ = z();
        try {
            ebpx ebpxVar = new ebpx();
            ebpxVar.a = new ebpu("charLexer", strZ);
            ebma ebmaVar = ebpg.a(ebpxVar).b;
            if (ebmaVar.l()) {
                strV = ((eblx) ebmaVar).e();
                if (ejwk.c(strV)) {
                    throw new IllegalArgumentException(a.v(strZ, "Given public identity does not have a user part: "));
                }
            } else {
                ebly eblyVar = (ebly) ebmaVar;
                String strA = eblyVar.a();
                strV = eblyVar.e() ? a.v(strA, "+") : strA;
            }
            dgirVarI.r(strZ);
            dgirVarI.z(strV);
            int i = dfog.J() ? this.W.b : this.R.b;
            if (!dfog.J()) {
                this.R.a(dgirVarI.a(), i);
                return;
            }
            dgim dgimVar = this.W;
            dgiq dgiqVar = dgimVar.a;
            dgiqVar.D(ImsConfiguration.a(dgirVarI.a()));
            dgimVar.a(dgiqVar, i);
        } catch (ebml e2) {
            throw new IllegalArgumentException("Can't parse: ".concat(String.valueOf(strZ)), e2);
        }
    }

    private final void R(eblf eblfVar) {
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        String str = (String) Optional.ofNullable(sipDelegateConfiguration.getIpSecConfiguration()).map(new dgaq()).orElse("");
        if (TextUtils.isEmpty(str)) {
            dhja.d(this.i, "Security-Verify header in configuration is null or empty", new Object[0]);
        } else {
            eblfVar.e = Optional.ofNullable(str);
        }
    }

    private final void S(eblf eblfVar) {
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        String sipServiceRouteHeader = sipDelegateConfiguration.getSipServiceRouteHeader();
        if (TextUtils.isEmpty(sipServiceRouteHeader)) {
            dhja.d(this.i, "Route header in configuration is null or empty", new Object[0]);
            return;
        }
        List<String> listI = ejxk.b(',').i(sipServiceRouteHeader);
        ArrayList arrayList = new ArrayList();
        for (String str : listI) {
            try {
                ebob ebobVarG = ebql.g("Route", str);
                dhja.d(this.i, "service route headers are %s", dhiz.IP_ADDRESS.c(str));
                arrayList.add((ebon) ebobVarG);
            } catch (ebml e2) {
                dhja.j(e2, this.i, "Invalid ServiceRoute header: %s", dhiz.IP_ADDRESS.c(str));
            }
        }
        eblfVar.t(arrayList);
    }

    final String A() {
        return this.J.toString();
    }

    public final void B() {
        if (this.D != null) {
            dhja.l(this.i, "Already connected", new Object[0]);
            return;
        }
        int iIncrementAndGet = this.U.incrementAndGet();
        String string = UUID.randomUUID().toString();
        String strA = A();
        ekhx ekhxVarX = x();
        DelegateRequest delegateRequest = new DelegateRequest(ekhxVarX);
        this.Y = SettableFuture.create();
        dgbu dgbuVar = this.N;
        dgax dgaxVar = new dgax(this, dgbuVar, string, this.Y);
        dgau dgauVar = new dgau(this, dgbuVar, string);
        t(16, TimeUnit.SECONDS.toMillis(((Long) dfpo.p().a.D.a()).longValue()));
        dhja.d(this.i, "creating SipDelegate for instanceId:[%s], featureTags:[%s]", string, ekhxVarX);
        try {
            this.y.createSipDelegate(delegateRequest, this.z, dgaxVar, dgauVar);
            if (((Boolean) d.a()).booleanValue()) {
                ewis ewisVar = (ewis) ewit.a.createBuilder();
                ewisVar.copyOnWrite();
                ewit ewitVar = (ewit) ewisVar.instance;
                strA.getClass();
                ewitVar.b |= 2;
                ewitVar.d = strA;
                ewisVar.copyOnWrite();
                ewit ewitVar2 = (ewit) ewisVar.instance;
                string.getClass();
                ewitVar2.b |= 1;
                ewitVar2.c = string;
                ewil ewilVar = (ewil) ewin.a.createBuilder();
                ewilVar.copyOnWrite();
                ewin ewinVar = (ewin) ewilVar.instance;
                ewinVar.b |= 1;
                ewinVar.c = iIncrementAndGet;
                ewilVar.copyOnWrite();
                ewin ewinVar2 = (ewin) ewilVar.instance;
                ewinVar2.d = 1;
                ewinVar2.b |= 2;
                ewisVar.copyOnWrite();
                ewit ewitVar3 = (ewit) ewisVar.instance;
                ewin ewinVar3 = (ewin) ewilVar.build();
                ewinVar3.getClass();
                ewitVar3.i = ewinVar3;
                ewitVar3.b |= 64;
                dgbuVar.b((ewit) ewisVar.build());
            }
        } catch (ImsException e2) {
            int iMin = Math.min(iIncrementAndGet * 3, 3600);
            if (((Boolean) d.a()).booleanValue()) {
                this.N.a(strA, string, iIncrementAndGet);
            }
            dhja.j(e2, this.i, "Error while creating delegate connection. Reconnecting in %s", Integer.valueOf(iMin));
            I(dgba.RESET_FROM_CONNECT_IMS_EXCEPTION);
            w(this.j);
            t(3, TimeUnit.SECONDS.toMillis(iMin));
        } catch (Exception e3) {
            if (((Boolean) d.a()).booleanValue()) {
                this.N.a(strA, string, iIncrementAndGet);
            }
            dhja.j(e3, this.i, "Error while creating delegate connection. Terminating state machine.", new Object[0]);
            w(this.t);
        }
    }

    public final void C(int i) {
        this.D = null;
        if (i == 2) {
            w(this.t);
        } else {
            w(this.s);
        }
    }

    public final void D() {
        ekgb ekgbVarG;
        try {
            this.U.set(0);
            Q();
            SipDelegateConfiguration sipDelegateConfiguration = this.E;
            sipDelegateConfiguration.getClass();
            SipDelegateConnection sipDelegateConnection = this.D;
            sipDelegateConnection.getClass();
            dgbw dgbwVar = new dgbw(sipDelegateConnection, sipDelegateConfiguration);
            this.F = dgbwVar;
            SipDelegateConfiguration sipDelegateConfiguration2 = this.E;
            if (sipDelegateConfiguration2 == null) {
                throw new IllegalStateException("No IMS configuration available");
            }
            String sipContactUserParameter = sipDelegateConfiguration2.getSipContactUserParameter();
            sipContactUserParameter.getClass();
            String homeDomain = sipDelegateConfiguration2.getHomeDomain();
            homeDomain.getClass();
            String imei = sipDelegateConfiguration2.getImei();
            imei.getClass();
            String strB = dhkd.b(imei);
            this.G = strB;
            SipDelegateConfiguration sipDelegateConfiguration3 = this.E;
            sipDelegateConfiguration3.getClass();
            M(sipDelegateConfiguration3);
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h(new ebla() { // from class: dgat
                @Override // defpackage.ebla
                public final void a(ebqq ebqqVar) {
                    dgbn dgbnVar = this.a;
                    SipDelegateConfiguration sipDelegateConfiguration4 = dgbnVar.E;
                    sipDelegateConfiguration4.getClass();
                    String sipPaniHeader = sipDelegateConfiguration4.getSipPaniHeader();
                    if (TextUtils.isEmpty(sipPaniHeader)) {
                        dhja.l(dgbnVar.i, "No PANI header in configuration", new Object[0]);
                    } else {
                        try {
                            ebqqVar.q(ebql.g("P-Access-Network-Info", sipPaniHeader));
                        } catch (ebml e2) {
                            dhja.j(e2, dgbnVar.i, "Exception while adding PANI header", new Object[0]);
                        }
                    }
                    SipDelegateConfiguration sipDelegateConfiguration5 = dgbnVar.E;
                    sipDelegateConfiguration5.getClass();
                    String sipPlaniHeader = sipDelegateConfiguration5.getSipPlaniHeader();
                    if (TextUtils.isEmpty(sipPlaniHeader)) {
                        dhja.l(dgbnVar.i, "No PLANI header in configuration", new Object[0]);
                    } else {
                        try {
                            ebqqVar.q(ebql.g("P-Last-Access-Network-Info", sipPlaniHeader));
                        } catch (ebml e3) {
                            dhja.j(e3, dgbnVar.i, "Exception while adding PLANI header", new Object[0]);
                        }
                    }
                    SipDelegateConfiguration sipDelegateConfiguration6 = dgbnVar.E;
                    sipDelegateConfiguration6.getClass();
                    String sipUserAgentHeader = sipDelegateConfiguration6.getSipUserAgentHeader();
                    if (TextUtils.isEmpty(sipUserAgentHeader)) {
                        dhja.l(dgbnVar.i, "No User-Agent header in configuration", new Object[0]);
                        return;
                    }
                    dhjt dhjtVar = dgbnVar.B;
                    String str = sipUserAgentHeader + ((String) dfog.o().a.G.a()) + dhjx.c(dhjtVar.b.b());
                    try {
                        if (((Boolean) dgbn.f.a()).booleanValue()) {
                            ebqqVar.t("User-Agent");
                            ebqqVar.q(dhjv.f(str));
                        } else {
                            if (ebqqVar.v("User-Agent")) {
                                return;
                            }
                            ebqqVar.q(dhjv.f(str));
                        }
                    } catch (ebml e4) {
                        dhja.j(e4, dgbnVar.i, "Exception while adding User-Agent header", new Object[0]);
                    }
                }
            });
            ekfwVar.h(new dhjn(this.x));
            if (dfog.H()) {
                ekfwVar.h(new dhjq(new ekph("INVITE")));
                ekgbVarG = ekfwVar.g();
            } else {
                ekgbVarG = ekfwVar.g();
            }
            dgis dgisVarM = dfog.J() ? this.W.a.m() : this.R.a;
            ebln eblnVarA = this.Q.a(dgbwVar, new ebmc(dgisVarM.f(), dgisVarM.g(), dgisVarM.h()));
            eblh eblhVarX = ebli.x();
            dhip dhipVar = this.i;
            eblhVarX.c(dhipVar);
            ((ebks) eblhVarX).a = sipContactUserParameter;
            ((ebks) eblhVarX).b = homeDomain;
            ((ebks) eblhVarX).c = eblnVarA;
            eblhVarX.e(ebmr.TCP);
            eblhVarX.d(strB);
            ((ebks) eblhVarX).b(ekgbVarG);
            ebli ebliVarA = eblhVarX.a();
            ebkz ebkzVar = this.w;
            if (ebkzVar != null) {
                ebliVarA.r(ebkzVar);
            }
            ebliVarA.u();
            S(ebliVarA);
            R(ebliVarA);
            this.P.a = ebliVarA;
            SipDelegateConfiguration sipDelegateConfiguration4 = this.E;
            sipDelegateConfiguration4.getClass();
            InetSocketAddress localAddress = sipDelegateConfiguration4.getLocalAddress();
            this.aa.b(localAddress.getHostString());
            dhja.d(dhipVar, "IMS PDN addresses: %s", dhiz.IP_ADDRESS.c(localAddress.getHostString()));
            w(this.o);
        } catch (Exception e2) {
            dhja.j(e2, this.i, "Error while starting SIP stack!", new Object[0]);
            w(this.t);
        }
    }

    public final void E() {
        dfzi dfziVar = this.v;
        if (dfziVar != null) {
            dfziVar.g(dezf.UNKNOWN);
        }
        w(this.s);
    }

    public final void F() {
        q(4);
        SettableFuture settableFuture = this.Y;
        if (settableFuture != null) {
            try {
                if (((SipDelegateConnection) settableFuture.r(10L, TimeUnit.SECONDS)) == null) {
                    dhja.q("Timeout on waiting for callback.", new Object[0]);
                }
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                dhja.q("Interrupted waiting for connection termination.", new Object[0]);
            }
        }
        try {
            this.A.removeOnPublishStateChangedListener(this.V);
        } catch (ImsException e2) {
            dhja.j(e2, this.i, "Failed to unregister publish state change listener logger", new Object[0]);
        }
    }

    public final void G(dezf dezfVar) {
        dfzi dfziVar = this.v;
        if (dfziVar != null) {
            dfziVar.i(dezfVar);
        }
    }

    public final void H() {
        p(16);
    }

    public final void I(dgba dgbaVar) {
        String str = this.D != null ? "with-connection" : "without-connection";
        dgba dgbaVar2 = dgba.RESET_FROM_STATE_RETRY;
        dhja.d(this.i, "stateMachine#resetStateMachine [%s] with reason: [%s]", str, dgbaVar.c);
        SipDelegateConnection sipDelegateConnection = this.D;
        if (sipDelegateConnection != null) {
            this.y.destroySipDelegate(sipDelegateConnection, 2);
            this.D = null;
        }
        H();
        this.E = null;
        this.F = null;
        this.P.a();
    }

    public final void J(int i) {
        if (i < 100 || i > 699) {
            dhja.h(this.i, "Invalid sipCode %d", Integer.valueOf(i));
            return;
        }
        SipDelegateConnection sipDelegateConnection = this.D;
        if (sipDelegateConnection != null) {
            this.y.triggerFullNetworkRegistration(sipDelegateConnection, i, (String) null);
        }
    }

    public final synchronized void K(SipDelegateConfiguration sipDelegateConfiguration) {
        Optional map = Optional.ofNullable(this.E).map(new Function() { // from class: dgar
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = dgbn.L;
                return Long.valueOf(((SipDelegateConfiguration) obj).getVersion());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        long version = sipDelegateConfiguration.getVersion();
        if (map.isPresent() && version < ((Long) map.get()).longValue()) {
            dhja.r(this.i, "invalid configuration downgrade from version[%d] to version[%d], ignoring configuration update", map.get(), Long.valueOf(version));
            return;
        }
        dhja.l(this.i, "updating configuration from version %d -> %d", map.orElse(-1L), Long.valueOf(version));
        this.E = sipDelegateConfiguration;
        eblf eblfVar = this.P.a;
        R(eblfVar);
        S(eblfVar);
        Q();
        this.aa.b(sipDelegateConfiguration.getLocalAddress().getHostString());
        dgbw dgbwVar = this.F;
        if (dgbwVar != null) {
            dhja.l(dgbw.a, "updating SipTransport configuration from version %d -> %d", Long.valueOf(dgbwVar.c.getVersion()), Long.valueOf(sipDelegateConfiguration.getVersion()));
            dgbwVar.c = sipDelegateConfiguration;
        }
    }

    public final void L(DelegateRegistrationState delegateRegistrationState) {
        this.Z = ekhx.o(delegateRegistrationState.getRegisteredFeatureTags());
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        if (sipDelegateConfiguration != null) {
            M(sipDelegateConfiguration);
        }
    }

    public final void M(SipDelegateConfiguration sipDelegateConfiguration) {
        String imei = sipDelegateConfiguration.getImei();
        imei.getClass();
        this.G = dhkd.b(imei);
        ebmr ebmrVar = sipDelegateConfiguration.getTransportType() == 1 ? ebmr.TCP : ebmr.UDP;
        dfzx dfzxVarI = dfzy.i();
        dfzv dfzvVar = (dfzv) dfzxVarI;
        dfzvVar.a = Optional.ofNullable(sipDelegateConfiguration.getPublicGruuUri() != null ? String.valueOf(sipDelegateConfiguration.getPublicGruuUri()) : null);
        String sipContactUserParameter = sipDelegateConfiguration.getSipContactUserParameter();
        sipContactUserParameter.getClass();
        dfzvVar.b = sipContactUserParameter;
        String hostAddress = sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress();
        hostAddress.getClass();
        dfzxVarI.g(hostAddress);
        dfzxVarI.e(ebmrVar);
        dfzxVarI.c(sipDelegateConfiguration.getLocalAddress().getPort());
        dfzxVarI.b(ejwk.b(this.G));
        dfzvVar.c = Optional.of(ejwk.b(sipDelegateConfiguration.getSipPaniHeader()));
        dfzxVarI.f(this.Z);
        dfzy dfzyVarA = dfzxVarI.a();
        this.X = dfzyVarA;
        this.x.a = dfzyVarA;
    }

    public final boolean N() {
        dfmy dfmyVarD = d();
        return P() ? dfmyVarD == this.p : dfmyVarD == this.o || dfmyVarD == this.p;
    }

    public final boolean O() {
        return this.u.contains(d());
    }

    @Override // defpackage.dfnb
    public final void v() throws ImsException {
        super.v();
        dhja.l(this.i, "starting SingleRegistrationRegistrationStateMachine[%s]", A());
        ebkz ebkzVar = this.w;
        if (ebkzVar != null) {
            ebkzVar.d();
        }
        if (((Boolean) e.a()).booleanValue()) {
            try {
                this.T.registerImsRegistrationCallback(this.z, this.O);
            } catch (ImsException e2) {
                dhja.j(e2, this.i, "Failed to register ImsRegistrationCallback.", new Object[0]);
            }
        }
        try {
            this.A.addOnPublishStateChangedListener(this.z, this.V);
        } catch (ImsException e3) {
            dhja.j(e3, this.i, "Failed to register publish state change listener logger", new Object[0]);
        }
    }

    final ekhx x() {
        ekhx ekhxVarY = y();
        if (!ekhxVarY.contains(dhbr.b)) {
            return ekhxVarY;
        }
        ekhv ekhvVar = new ekhv();
        ekhvVar.j(ekhxVarY);
        ekhvVar.h(dhbr.e, dhbr.f);
        if (((Boolean) dfog.o().a.v.a()).booleanValue()) {
            ekhvVar.c(dhbr.g);
        }
        if (((Boolean) dfpo.p().a.K.a()).booleanValue()) {
            ekhvVar.h(dhbr.h, !TextUtils.isEmpty(dfpo.q()) ? String.format("+g.gsma.rcs.botversion=\"%s\"", dfpo.q()) : M);
        }
        if (dfog.J() ? this.W.a.r().mStandaloneMsgAuth : dfog.E()) {
            ekhvVar.h(dhbr.c, dhbr.d);
        }
        return ekhvVar.g();
    }

    final ekhx y() {
        InstantMessageConfiguration instantMessageConfigurationO = dfog.J() ? this.W.a.o() : this.S;
        ebkr ebkrVar = dhjv.a;
        return new ekph(instantMessageConfigurationO.a() ? dhbr.b : "+g.oma.sip-im");
    }

    final String z() {
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        ekgb ekgbVarA = this.K.a(sipDelegateConfiguration);
        Optional optionalFindFirst = Collection.EL.stream(ekgbVarA).filter(new Predicate() { // from class: dgcc
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
                return ((String) obj).startsWith("tel:");
            }
        }).findFirst();
        if (optionalFindFirst.isPresent()) {
            return (String) optionalFindFirst.get();
        }
        final String strB = ejwk.b(sipDelegateConfiguration.getHomeDomain());
        Optional optionalFindFirst2 = !strB.isEmpty() ? Collection.EL.stream(ekgbVarA).filter(new Predicate() { // from class: dgca
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
                String str = strB;
                String str2 = (String) obj;
                try {
                    ebma ebmaVarE = new ebqi(str2).e();
                    if (ebmaVarE.l()) {
                        return str.equals(((eblx) ebmaVarE).b());
                    }
                    return false;
                } catch (ebml e2) {
                    dhja.j(e2, dgce.a, "Exception while trying to parse Uri: %s", str2);
                    return false;
                }
            }
        }).filter(new Predicate() { // from class: dgcb
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
                return ((String) obj).startsWith("sip:+");
            }
        }).findFirst() : Optional.empty();
        if (optionalFindFirst2.isPresent()) {
            return (String) optionalFindFirst2.get();
        }
        Optional optionalFindFirst3 = Collection.EL.stream(ekgbVarA).filter(new Predicate() { // from class: dgcd
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
                return ((String) obj).startsWith("sip:");
            }
        }).findFirst();
        if (optionalFindFirst3.isPresent()) {
            return (String) optionalFindFirst3.get();
        }
        String publicUserIdentifier = sipDelegateConfiguration.getPublicUserIdentifier();
        if (ejwk.c(publicUserIdentifier)) {
            throw new IllegalStateException("No proper public identity can be calculated.");
        }
        return publicUserIdentifier;
    }
}
