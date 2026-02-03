package defpackage;

import android.net.Network;
import android.telephony.ims.ImsManager;
import android.telephony.ims.ImsRcsManager;
import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateManager;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgao implements dfyx {
    static final dfny a = dfod.a(190970850);
    private final dhip b;
    private final dgbo c;
    private dgbn d;

    @Deprecated
    private final dgit e;
    private final dgim f;
    private final deym g;
    private int h = -1;
    private final dfyl i = new dgan();
    private final dfyp j;

    public dgao(dhip dhipVar, dgbo dgboVar, dfyp dfypVar, dgit dgitVar, dgim dgimVar, deym deymVar) {
        this.b = dhipVar;
        this.c = dgboVar;
        this.j = dfypVar;
        this.e = dgitVar;
        this.f = dgimVar;
        this.g = deymVar;
    }

    @Override // defpackage.dfyx
    public final dfyl a() {
        return this.i;
    }

    @Override // defpackage.dfyx
    public final dfyu b() {
        return null;
    }

    @Override // defpackage.dfyx
    public final Optional c() {
        dfyp dfypVar = this.j;
        return Optional.of(dfyt.d((String) Optional.ofNullable(dfypVar.a).map(new Function() { // from class: dfym
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((InetAddress) obj).getHostAddress();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null), (Network) Optional.ofNullable(dfypVar.b).orElse(null), l()));
    }

    @Override // defpackage.dfyx
    public final String d() {
        if (!l()) {
            return dfog.J() ? this.f.a.m().w() : this.e.a.w();
        }
        dgbn dgbnVar = this.d;
        dgbnVar.getClass();
        return dgbnVar.z();
    }

    @Override // defpackage.dfyx
    public final synchronized void e() {
        dgbn dgbnVar = this.d;
        dhja.l(this.b, "Destroying RegistrationEngine.", new Object[0]);
        if (Objects.isNull(dgbnVar)) {
            return;
        }
        dgbnVar.F();
        dgbnVar.m();
        this.d = null;
    }

    @Override // defpackage.dfyx
    public final void f(PrintWriter printWriter) {
        if (((Boolean) a.a()).booleanValue()) {
            printWriter.println("    - SingleRegistrationRegistrationController: ".concat(this.b.a));
            dgbn dgbnVar = this.d;
            if (dgbnVar != null) {
                printWriter.println("     - SingleRegistrationStateMachine ".concat(String.valueOf(String.valueOf(dgbnVar.i))));
                dgbb dgbbVar = (dgbb) dgbnVar.d();
                printWriter.println("       state: ".concat(dgbbVar != null ? dgbbVar.a() : "UnknownState"));
                SipDelegateConfiguration sipDelegateConfiguration = dgbnVar.E;
                if (sipDelegateConfiguration != null) {
                    printWriter.println("       - SipDelegateConfiguration");
                    dhiz dhizVar = dhiz.GENERIC;
                    printWriter.println("         p_access_network_info_header: ".concat(String.valueOf(dhizVar.c(sipDelegateConfiguration.getSipPaniHeader()))));
                    printWriter.println("         security_verify_header: ".concat(String.valueOf(dhizVar.c(Optional.ofNullable(sipDelegateConfiguration.getIpSecConfiguration()).map(new dgaq()).orElse("")))));
                    printWriter.println("         home_domain: ".concat(String.valueOf(sipDelegateConfiguration.getHomeDomain())));
                    dhiz dhizVar2 = dhiz.USER_ID;
                    printWriter.println("         ue_public_user_id: ".concat(String.valueOf(dhizVar2.c(sipDelegateConfiguration.getPublicUserIdentifier()))));
                    dhiz dhizVar3 = dhiz.IP_ADDRESS;
                    printWriter.println("         server_default_ipaddress: ".concat(String.valueOf(dhizVar3.c(sipDelegateConfiguration.getSipServerAddress().getAddress().getHostAddress()))));
                    printWriter.println("         server_default_port: " + sipDelegateConfiguration.getSipServerAddress().getPort());
                    printWriter.println("         ue_default_ipaddress: ".concat(String.valueOf(dhizVar3.c(sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress()))));
                    printWriter.println("         ue_default_port: " + sipDelegateConfiguration.getLocalAddress().getPort());
                    printWriter.println("         p_associated_uri_header: ".concat(String.valueOf(dhiz.URI_SIP.c(sipDelegateConfiguration.getSipAssociatedUriHeader()))));
                    printWriter.println("         service_route_header: ".concat(String.valueOf(dhizVar3.c(sipDelegateConfiguration.getSipServiceRouteHeader()))));
                    printWriter.println("         uri_user_part: ".concat(String.valueOf(dhizVar2.c(sipDelegateConfiguration.getSipContactUserParameter()))));
                    printWriter.println("         user_agent: ".concat(String.valueOf(dhizVar.c(sipDelegateConfiguration.getSipUserAgentHeader()))));
                }
            }
        }
    }

    @Override // defpackage.dfyx
    public final void g(dezf dezfVar) {
        dhja.l(this.b, "Restarting IMS registration. reason=%s", dezfVar);
        int i = this.h;
        j(dezfVar);
        i(i);
    }

    @Override // defpackage.dfyx
    public final void h(dezf dezfVar, int i) {
        dhja.l(this.b, "Restarting IMS registration. reason=%s sipCode=%d", dezfVar, Integer.valueOf(i));
        if (dezfVar != dezf.REREGISTRATION_REQUIRED) {
            g(dezfVar);
            return;
        }
        dgbn dgbnVar = this.d;
        if (dgbnVar != null) {
            dgbnVar.r(18, i);
        }
    }

    @Override // defpackage.dfyx
    public final synchronized void i(int i) {
        dhip dhipVar = this.b;
        dhja.l(dhipVar, "Request to start registration to IMS network.", new Object[0]);
        dgbn dgbnVar = this.d;
        if (dgbnVar == null || dgbnVar.d() == dgbnVar.t) {
            if (!Objects.isNull(dgbnVar)) {
                dgbnVar.F();
            }
            dhja.l(dhipVar, "Starting RegistrationStateMachine.", new Object[0]);
            dgbo dgboVar = this.c;
            int iB = ((dfmn) dgboVar.q.b()).a() ? -1 : dgboVar.d.b();
            ImsManager imsManagerM59m = aee$$ExternalSyntheticApiModelOutline0.m59m(dgboVar.a.getSystemService(aee$$ExternalSyntheticApiModelOutline0.m62m()));
            ImsRcsManager imsRcsManager = imsManagerM59m.getImsRcsManager(iB);
            SipDelegateManager sipDelegateManager = imsManagerM59m.getSipDelegateManager(iB);
            dgbn dgbnVar2 = new dgbn(imsManagerM59m.getImsRcsManager(iB).getUceAdapter(), dgboVar.h, dgboVar.e, dgboVar.f, dgboVar.c, dgboVar.b, sipDelegateManager, dgboVar.g, dgboVar.s, dgboVar.i, dgboVar.p, dgboVar.j, dgboVar.r, dgboVar.k, imsRcsManager, dgboVar.l, dgboVar.m, ((Boolean) dfpo.p().a.N.a()).booleanValue() ? Optional.of(new dgah()) : Optional.empty(), dgboVar.n, dgboVar.o);
            if (Objects.isNull(dgbnVar2)) {
                dhja.g("Failed to create RegistrationEngineStateMachine.", new Object[0]);
                return;
            }
            dgbnVar2.o(new dgbx(dgbnVar2.A(), this.g));
            dgbnVar2.v();
            this.d = dgbnVar2;
            dgbnVar = dgbnVar2;
        }
        if (Objects.isNull(dgbnVar)) {
            return;
        }
        if (dgbnVar.N()) {
            dhja.d(dhipVar, "Already registered", new Object[0]);
        } else {
            this.h = i;
            dgbnVar.q(3);
        }
    }

    @Override // defpackage.dfyx
    public final synchronized void j(dezf dezfVar) {
        dhja.l(this.b, "Unregistering from IMS network. reason=%s", dezfVar);
        dgbn dgbnVar = this.d;
        if (Objects.isNull(dgbnVar)) {
            return;
        }
        dgbnVar.F();
        this.d = null;
        this.h = -1;
    }

    @Override // defpackage.dfyx
    public final boolean k() {
        dgbn dgbnVar = this.d;
        if (Objects.isNull(dgbnVar)) {
            return false;
        }
        return dgbnVar.O() || dgbnVar.N();
    }

    @Override // defpackage.dfyx
    public final boolean l() {
        dgbn dgbnVar = this.d;
        if (Objects.isNull(dgbnVar)) {
            return false;
        }
        return dgbnVar.N();
    }

    @Override // defpackage.dfyx
    public final boolean m() {
        dgbn dgbnVar = this.d;
        if (Objects.isNull(dgbnVar)) {
            return false;
        }
        return dgbnVar.O();
    }

    @Override // defpackage.dfyx
    public final boolean n() {
        return false;
    }
}
