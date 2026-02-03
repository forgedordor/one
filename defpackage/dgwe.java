package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgwe extends dgvh {
    private static final dfny B = dfod.a(174556556);
    private static final dfny C = dfod.a(181136833);
    private static final dfny D = dfod.a(182436580);
    public static final dhip f = new dhip("ImsServiceSession");
    public final dhjt A;
    private final dhfw E;
    private ebma F;
    private String G;
    private final PowerManager.WakeLock H;
    private final dfcg J;
    public final dgvq i;
    public final fcsu j;
    public final ebky l;
    public final crmx m;
    public String o;
    public boolean p;
    public String q;
    public dgwd s;
    public ebqr t;
    public final dgwt v;
    protected ebnq x;
    public String y;
    public String z;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public final Object h = new Object();
    public final String k = ebmh.a();
    public int n = 0;
    public boolean r = false;
    public boolean u = false;
    public boolean w = false;
    private final Object I = new Object();

    public dgwe(Context context, dgvq dgvqVar, fcsu fcsuVar, String str, ebqr ebqrVar, dfcg dfcgVar, dhjt dhjtVar) throws ebmn {
        this.q = "";
        crmx crmxVarC = ((dgwc) dfds.a(dgwc.class)).c();
        this.m = crmxVarC;
        this.i = dgvqVar;
        this.j = fcsuVar;
        this.J = dfcgVar;
        this.A = dhjtVar;
        this.d = 0;
        this.e = 0;
        this.E = new dhfw(dgvqVar.a.c());
        this.H = ((PowerManager) context.getSystemService("power")).newWakeLock(1, A());
        this.y = ebmh.b();
        this.z = ebmh.b();
        this.v = new dgwt(this, t(), fcsuVar, dhjtVar);
        boolean z = ebqrVar == null;
        this.p = z;
        eblv eblvVarB = null;
        if (!z) {
            ebma ebmaVarB = dhjv.b(ebqrVar, crmxVarC);
            ebmaVarB.getClass();
            this.F = ebmaVarB;
            au();
            String strJ = ebqrVar.j("P-Asserted-Identity");
            strJ = (strJ == null || strJ.length() == 0) ? ebqrVar.j("From") : strJ;
            if (strJ != null) {
                try {
                    eblvVarB = ebkr.b(strJ);
                } catch (ebml e) {
                    dhja.i(e, "Error while parsing remote address: %s", e.getMessage());
                }
            }
            if (eblvVarB != null) {
                this.G = eblvVarB.a;
            }
            ebnq ebnqVar = ebqrVar.a.j;
            if (ebnqVar != null) {
                this.x = ebnqVar;
                dhja.d(f, "conference header from server: %s", ebnqVar.a);
            }
            if (ebqrVar.y().q("Subject")) {
                this.q = ebqrVar.j("Subject");
            }
            try {
                String strD = ebqrVar.d();
                if (strD == null) {
                    throw new ebmn("Null CallId. Can't create dialog path");
                }
                String strF = ebqrVar.f();
                if (strF == null) {
                    throw new ebmn("Null Contact. Can't create dialog path");
                }
                String strL = ebqrVar.l();
                if (strL == null) {
                    throw new ebmn("Null To header. Can't create dialog path");
                }
                String strI = ebqrVar.i();
                if (strI == null) {
                    throw new ebmn("Null From header. Can't create dialog path");
                }
                int iA = ebqrVar.a();
                ArrayList arrayListS = dhjv.s(ebqrVar, false);
                ebnr ebnrVar = (ebnr) ebqrVar.a.c().f();
                ebnrVar.getClass();
                ebky ebkyVar = new ebky(strD, iA, strF, strL, strI, arrayListS);
                ebkyVar.i = ebqrVar;
                ebkyVar.e = dhjv.i(ebqrVar.i());
                String strD2 = ebnrVar.e.d("+sip.instance");
                if (strD2 != null) {
                    ebkyVar.e(strD2);
                }
                ebnr ebnrVar2 = (ebnr) ebqrVar.a.c().f();
                if (ebnrVar2 != null) {
                    eblv eblvVar = ebnrVar2.a;
                    if (eblvVar.b.l()) {
                        eblx eblxVar = (eblx) eblvVar.b;
                        if (eblxVar.b.a("gr") != null) {
                            ebkyVar.v = eblxVar.c();
                        }
                    }
                    if (ebkyVar.v == null) {
                        String strI2 = ebnrVar2.i("pub-gruu");
                        if (strI2 != null) {
                            ebkyVar.v = strI2;
                        } else {
                            String strI3 = ebnrVar2.i("temp-gruu");
                            if (strI3 != null) {
                                ebkyVar.v = strI3;
                            }
                        }
                    }
                }
                String strG = ebqrVar.g();
                if (strG != null) {
                    String strH = ebqrVar.h();
                    strH.getClass();
                    try {
                        ebkyVar.s = ebqo.d(strG, strH);
                    } catch (IOException e2) {
                        dhja.j(e2, f, "Could not set content: %s", e2.getMessage());
                    }
                }
                this.l = ebkyVar;
            } catch (ebmn e3) {
                throw new IllegalStateException(e3);
            }
        } else {
            if (str == null) {
                throw new IllegalStateException("Remote contact cannot be null.");
            }
            ae(str, ((eblg) fcsuVar).a);
            this.x = null;
            try {
                dfys dfysVar = dgvqVar.a;
                eblf eblfVarV = v();
                String strW = eblf.w();
                ArrayList arrayListQ = eblfVarV.q();
                String strE = dfysVar.e();
                if (strE == null) {
                    throw new ebmn("Public Identity is empty in ImsModule. Can't create dialog path");
                }
                this.l = new ebky(strW, 1, y(), strE, y(), arrayListQ);
            } catch (ebmn e4) {
                throw new IllegalStateException(e4);
            }
        }
        dhja.d(f, "session %s created", this.k);
    }

    private final void au() {
        ebma ebmaVar = this.F;
        crmx crmxVar = this.m;
        String strJ = dhjv.j(ebmaVar, crmxVar);
        boolean z = this.F.l() && !PhoneNumberUtils.isGlobalPhoneNumber(strJ);
        this.o = z ? dhjv.n(this.F.toString(), crmxVar) : strJ;
        dhip dhipVar = f;
        dhiz dhizVar = dhiz.USER_ID;
        dhja.l(dhipVar, "Updated remoteUserName: {remoteUserName: '%s', remoteUri: '%s', extractedUserName: '%s'}, isSipUriAndNotGlobalPhone: %s", dhizVar.c(this.o), dhiz.URI_SIP.c(this.F), dhizVar.c(strJ), Boolean.valueOf(z));
    }

    protected abstract String A();

    public String B() {
        String string = toString();
        StringBuilder sb = new StringBuilder("Sip history for Call ID ");
        ebky ebkyVar = this.l;
        sb.append(ebkyVar.a);
        sb.append("\r\n\r\n");
        ebqr ebqrVar = ebkyVar.i;
        if (ebqrVar != null) {
            sb.append(" --- Initial INVITE:\r\n\r\n");
            sb.append(ebqrVar.n());
            sb.append("\r\n\r\n");
        }
        ebqr ebqrVar2 = ebkyVar.p;
        if (ebqrVar2 != null) {
            sb.append(" --- Last request, timestamp ");
            sb.append(ebqrVar2.a.c);
            sb.append(":\r\n\r\n");
            sb.append(ebkyVar.p.n());
            sb.append("\r\n\r\n");
        }
        ebqs ebqsVar = ebkyVar.q;
        if (ebqsVar != null) {
            sb.append(" --- Last response, timestamp ");
            sb.append(ebqsVar.a.c);
            sb.append(":\r\n\r\n");
            sb.append(ebkyVar.q.n());
            sb.append("\r\n\r\n");
        }
        return a.q(sb.toString(), string, "\r\n\r\n");
    }

    public final synchronized void C() {
        if (this.p) {
            dhja.d(f, "session %s cannot be accepted because it is originating", this.k);
            return;
        }
        dhja.d(f, "session %s invitation has been accepted", this.k);
        this.n = 1;
        Object obj = this.h;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    protected final void D(ebqo[] ebqoVarArr) throws ebmn, IOException {
        if (ebqoVarArr != null) {
            eblf eblfVar = ((eblg) this.j).a;
            if (eblfVar.v()) {
                throw new ebmn("The sip stack is unavailable while completing the sdp");
            }
            String strO = this.i.a.c().mUserName;
            if (((Boolean) C.a()).booleanValue() && TextUtils.isEmpty(strO)) {
                strO = dhjv.o(t().e(), this.m);
            }
            String strN = eblfVar.n();
            if (TextUtils.isEmpty(strN)) {
                throw new ebki("Unable to complete SDP. Local IP address not available!");
            }
            ebjy ebjyVarA = ebjy.a(strN);
            for (ebqo ebqoVar : ebqoVarArr) {
                if (ebqoVar != null && "application/sdp".equals(ebqoVar.b)) {
                    String strB = ebqoVar.b();
                    strB.getClass();
                    ebkn ebknVarB = ebkk.b(strB);
                    if (ebknVarB.a.size() <= 0) {
                        ebknVarB.c(ebkq.a);
                    }
                    if (ebknVarB.e == null) {
                        ebknVarB.e = new ebkg(strO, ebkf.a, ebjyVarA, strN);
                    }
                    if (ebknVarB.h == null) {
                        ebknVarB.h = new ebka(ebkf.a, ebjyVarA, eblfVar.n());
                    }
                    try {
                        ebqoVar.a = ebknVarB.f().getBytes("utf-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
            }
        }
    }

    public final synchronized void E(dezf dezfVar) {
        this.u = true;
        n(2, dgvh.a(dezfVar));
    }

    protected final void F() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dgwh) it.next()).e();
            } catch (Exception e) {
                dhja.j(e, f, "handleSessionAborted: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    protected final void G(dhfu dhfuVar) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dgwh) it.next()).g(dhfuVar);
            } catch (Exception e) {
                dhja.j(e, f, "handleSessionStartFailed: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    protected final void H(int i, String str) {
        dhja.d(f, "handleSessionStartFailed with reason: %s, due to: %s", ebpe.y(i), str);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dgwh) it.next()).h(i, str);
            } catch (Exception e) {
                dhja.j(e, f, "handleSessionStartFailed: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    protected final void I() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dgwh) it.next()).j();
            } catch (Exception e) {
                dhja.j(e, f, "handleSessionStarting: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    protected final void J() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dgwh) it.next()).k();
            } catch (Exception e) {
                dhja.j(e, f, "handleSessionTerminated: Call to listener failed with error", new Object[0]);
            }
        }
    }

    protected final void K(ebpe ebpeVar) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            dgwh dgwhVar = (dgwh) it.next();
            try {
                if (dgwhVar instanceof dgwi) {
                    ((dgwi) dgwhVar).r(ebpeVar);
                }
            } catch (Exception e) {
                dhja.j(e, f, "responseReceived: Call to listener failed with error", new Object[0]);
            }
        }
    }

    protected final void L(dhfu dhfuVar) {
        this.r = false;
        dhja.j(dhfuVar, f, "Error occurred - stopping session: %s", dhfuVar.getMessage());
        m(dhfuVar);
    }

    protected void M(ebqs ebqsVar) {
        throw null;
    }

    protected final void N(ebqs ebqsVar) {
        dhja.d(f, "Provisional response received for INVITE: %d %s", Integer.valueOf(ebqsVar.y()), ebqsVar.A());
        ebky ebkyVar = this.l;
        ebqo[] ebqoVarArr = ebkyVar.s;
        String strH = ebqsVar.h();
        if ((ebqoVarArr == null || ebqoVarArr.length == 0) && strH != null) {
            try {
                String strG = ebqsVar.g();
                strG.getClass();
                ebkyVar.s = ebqo.d(strG, strH);
            } catch (IOException e) {
                dhja.d(f, "IOException: %s", e.getMessage());
            }
        }
    }

    public final void O() {
        ag();
        if (this.a == dgws.STARTING) {
            H(487, "Terminated by remote");
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dgwh) it.next()).m();
            } catch (Exception e) {
                dhja.j(e, f, "handleSessionTerminatedByRemote: Call to listener failed with error", new Object[0]);
            }
        }
    }

    public void Q(ebqr ebqrVar) {
        throw null;
    }

    protected void R(ebqs ebqsVar) {
        throw null;
    }

    protected void S(ebqr ebqrVar) {
        throw null;
    }

    protected void T(ebqr ebqrVar) {
        throw null;
    }

    public void V(ebqs ebqsVar) {
        throw null;
    }

    public final synchronized void W() {
        X(2, this.d, this.e);
    }

    protected final void X(int i, int i2, int i3) {
        dhja.d(f, "session %s invitation is requested to be rejected: %s", this.k, Integer.valueOf(i));
        this.n = i;
        h(i2);
        i(i3);
        Object obj = this.h;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    protected final void Y(int i, int i2) {
        dhja.l(f, "Stop reason: %d subreason: %d", Integer.valueOf(i), Integer.valueOf(i2));
        String str = this.l.a;
        if (str != null) {
            this.J.a(str, str, i, i2, this.p);
        }
    }

    public final void Z(ebqr ebqrVar, String str) throws ebmn {
        dhjt dhjtVar = this.A;
        eblf eblfVarV = v();
        try {
            ebqs ebqsVarH = dhjtVar.h(ebqrVar, str, 180);
            ebqsVarH.q(dhjt.a(eblfVarV, false, new String[0]));
            ad(ebqsVarH);
        } catch (ebml e) {
            dhja.i(e, "Can't create SIP message", new Object[0]);
            throw new ebmn("Can't create SIP response", e);
        }
    }

    protected final void aa(ebky ebkyVar) {
        try {
            eblf eblfVarV = v();
            dhjt dhjtVar = this.A;
            t();
            ad(dhjtVar.q(eblfVarV, ebkyVar));
        } catch (Exception e) {
            dhja.j(e, f, "Can't send SIP ACK", new Object[0]);
        }
    }

    public final void ab() {
        try {
            eblf eblfVarV = v();
            ebky ebkyVar = this.l;
            ebkyVar.a();
            dhja.l(f, "Send BYE", new Object[0]);
            dhjt dhjtVar = this.A;
            t();
            try {
                String str = ebkyVar.f;
                String str2 = ebkyVar.a;
                String str3 = ebkyVar.g;
                String str4 = ebkyVar.h;
                dhjt.m(str2, str3, str4);
                ebkr ebkrVar = dhjv.a;
                ebma ebmaVarD = ebkr.d(str);
                ebno ebnoVarB = ebql.b(str2);
                ebnn ebnnVarA = ebql.a(ebkyVar.b, "BYE");
                eblv eblvVarB = ebkr.b(str3);
                ebpd ebpdVarA = ebkx.a(ebmaVarD, "BYE", ebnoVarB, ebnnVarA, ebql.f(eblvVarB, ebkyVar.d), ebql.i(ebkr.b(str4), ebkyVar.e), dhjv.q(eblfVarV), dhjv.g());
                ArrayList arrayList = ebkyVar.j;
                if (arrayList != null) {
                    dhjt.l(ebpdVarA, arrayList);
                }
                ebpdVarA.k(ebql.g("P-Preferred-Identity", eblvVarB.c()));
                ebpdVarA.k(dhjv.f(dhjtVar.b.a()));
                ebpdVarA.k(dhjv.F());
                Optional optional = eblfVarV.e;
                if (optional.isPresent()) {
                    dhjt.k(ebpdVarA, (String) optional.get());
                    dhjt.i(ebpdVarA, "sec-agree");
                    dhjt.j(ebpdVarA, "sec-agree");
                }
                ebqr ebqrVar = new ebqr(ebpdVarA);
                if (ai()) {
                    ebqrVar.s("Conversation-ID", this.z);
                }
                dhfw dhfwVar = this.E;
                if (dhfwVar != null) {
                    dhfwVar.b(ebqrVar);
                }
                S(ebqrVar);
                eblfVarV.k(ebqrVar, new dgwb(this));
                ag();
            } catch (Exception e) {
                dhja.i(e, "Can't create SIP message", new Object[0]);
                throw new ebmn("Can't create SIP BYE message");
            }
        } catch (Exception e2) {
            dhja.j(e2, f, "Error while sending bye: %s", e2.getMessage());
        }
    }

    protected final void ac(dhfu dhfuVar) {
        dhjt dhjtVar;
        eblf eblfVarV;
        ebky ebkyVar;
        ebma ebmaVarD;
        ebno ebnoVarB;
        ebnn ebnnVarA;
        eboa eboaVarF;
        ebos ebosVarI;
        ebqr ebqrVar;
        dhja.l(f, "Send CANCEL", new Object[0]);
        eblm eblmVar = null;
        try {
            dhjtVar = this.A;
            eblfVarV = v();
            ebkyVar = this.l;
            t();
            try {
                String str = ebkyVar.f;
                String str2 = ebkyVar.a;
                String str3 = ebkyVar.g;
                String str4 = ebkyVar.h;
                dhjt.m(str2, str3, str4);
                ebkr ebkrVar = dhjv.a;
                ebmaVarD = ebkr.d(str);
                ebnoVarB = ebql.b(str2);
                ebnnVarA = ebql.a(ebkyVar.b, "CANCEL");
                eboaVarF = ebql.f(ebkr.b(str3), ebkyVar.d);
                ebosVarI = ebql.i(ebkr.b(str4), null);
                ebqrVar = ebkyVar.i;
            } catch (Exception e) {
                dhja.i(e, "Can't create SIP message", new Object[0]);
                throw new ebmn("Can't create SIP CANCEL message");
            }
        } catch (Exception e2) {
            dhja.j(e2, f, "Error while sending cancel: %s", e2.getMessage());
        }
        if (ebqrVar == null) {
            throw new ebmn("INVITE is null.");
        }
        ebpd ebpdVarA = ebkx.a(ebmaVarD, "CANCEL", ebnoVarB, ebnnVarA, eboaVarF, ebosVarI, ebqrVar.p(), dhjv.g());
        ArrayList arrayList = ebkyVar.j;
        if (arrayList != null) {
            dhjt.l(ebpdVarA, arrayList);
        }
        ebpdVarA.k(dhjt.a(eblfVarV, false, new String[0]));
        ebpdVarA.k(dhjv.f(dhjtVar.b.a()));
        ebpdVarA.k(dhjv.F());
        ebqr ebqrVar2 = new ebqr(ebpdVarA);
        dhfw dhfwVar = this.E;
        if (dhfwVar != null) {
            dhfwVar.b(ebqrVar2);
        }
        eblm eblmVarL = v().l(ebqrVar2);
        this.l.b();
        eblmVar = eblmVarL;
        if (eblmVar != null || ((Boolean) B.a()).booleanValue()) {
            dhja.l(f, "Response of CANCEL is received: %b", Boolean.valueOf((eblmVar == null || eblmVar.b() == null) ? false : true));
            if (dhfuVar != null) {
                G(dhfuVar);
            } else {
                F();
            }
        }
    }

    public final void ad(ebqq ebqqVar) {
        v().s(ebqqVar);
    }

    protected final void ae(String str, eblf eblfVar) {
        dhja.l(f, "Setting contact: %s", dhiz.USER_ID.c(str));
        ImsConfiguration imsConfigurationC = this.i.a.c();
        if (((Boolean) C.a()).booleanValue()) {
            boolean zY = dhjv.y(imsConfigurationC);
            String strF = !eblfVar.v() ? eblfVar.f() : "";
            if (TextUtils.isEmpty(strF)) {
                strF = t().c().mDomain;
            }
            ebma ebmaVarD = dhjv.d(str, strF, this.m, zY);
            ebmaVarD.getClass();
            this.F = ebmaVarD;
        } else {
            ebma ebmaVarC = dhjv.c(str, imsConfigurationC, this.m);
            ebmaVarC.getClass();
            this.F = ebmaVarC;
        }
        au();
    }

    public final void af(int i, int i2) {
        h(i);
        i(i2);
        if (!this.l.l) {
            W();
        } else {
            l();
            dhja.l(f, "Stopped session, reason: %d subreason: %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void ag() {
        this.l.d();
    }

    public final void ah(dhfu dhfuVar) {
        dhja.d(f, "Terminating session", new Object[0]);
        Object obj = this.I;
        synchronized (obj) {
            obj.notify();
        }
        if (dhfuVar == null) {
            try {
                U();
            } catch (Exception e) {
                dhja.h(f, "Error while calling onTerminating: %s", e.getMessage());
            }
        }
    }

    public boolean ai() {
        throw null;
    }

    public final boolean aj() {
        return ai() || dfpo.v();
    }

    protected ebqo[] ak() {
        throw null;
    }

    public String[] al() {
        throw null;
    }

    public final synchronized void an() {
        dhja.d(f, "Session invitation is requested to be declined", new Object[0]);
        this.n = 8;
        h(2);
        i(56);
        Object obj = this.h;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final synchronized void ao() {
        this.u = true;
        n(2, 57);
    }

    protected final void ap(ebqr ebqrVar) {
        int iIndexOf;
        dhja.w(24, 3, "Sending SIP INVITE with callid=%s", ebqrVar.d());
        ebky ebkyVar = this.l;
        ebkyVar.k = false;
        eblm eblmVarL = v().l(ebqrVar);
        String str = eblmVarL.c;
        dhip dhipVar = f;
        dhja.d(dhipVar, "Created transaction: %s", str);
        dhja.d(dhipVar, "First invite message timeout value is %d seconds and later invite message timeout value is %d seconds", Long.valueOf(dfpo.c()), Long.valueOf(dfpo.c()));
        int i = eblmVarL.i((int) dfpo.c(), (int) dfpo.c());
        if (!eblmVarL.g()) {
            if (i == 2) {
                return;
            }
            this.l.k = true;
            if (i == 3) {
                n(1, 66);
                H(477, ejwk.b(eblmVarL.c()));
                return;
            } else {
                n(1, 21);
                H(408, "No response received for INVITE");
                return;
            }
        }
        ebqs ebqsVarB = eblmVarL.b();
        ebqsVarB.getClass();
        ebkyVar.q = ebqsVarB;
        dhja.w(27, 3, "SIP Response received with response code: %s", Integer.valueOf(ebqsVarB.y()));
        int iA = eblmVarL.a();
        if (iA >= 100 && iA < 200) {
            N(ebqsVarB);
            return;
        }
        if (iA != 200) {
            if (iA != 407) {
                M(ebqsVarB);
                return;
            }
            try {
                dhja.l(dhipVar, "407 response received", new Object[0]);
                String strL = ebqsVarB.l();
                ebky ebkyVar2 = this.l;
                ebkyVar2.e = dhjv.i(strL);
                ebkyVar2.q = ebqsVarB;
                dhja.l(dhipVar, "Send ACK for 407 response", new Object[0]);
                dhjt dhjtVar = this.A;
                eblf eblfVarV = v();
                t();
                ad(dhjtVar.q(eblfVarV, ebkyVar2));
                dhfw dhfwVar = this.E;
                dhfwVar.a(ebqsVarB);
                ebkyVar2.a();
                dhja.l(dhipVar, "Send second INVITE", new Object[0]);
                eblf eblfVarV2 = v();
                t();
                ebqr ebqrVarR = dhjtVar.r(eblfVarV2, ebkyVar2);
                String[] strArrAl = al();
                if (strArrAl != null) {
                    dhjv.u(ebqrVarR, x(), strArrAl);
                }
                ebkyVar2.i = ebqrVarR;
                String str2 = this.q;
                if (str2 != null) {
                    ebqrVarR.r(a.v(str2, "Subject: "));
                }
                dhfwVar.b(ebqrVarR);
                T(ebqrVarR);
                ebos ebosVar = ebqrVarR.y().f;
                ebosVar.getClass();
                ebosVar.e();
                ap(ebqrVarR);
                return;
            } catch (Exception e) {
                dhja.j(e, f, "Session initiation has failed", new Object[0]);
                L(new dhfu(e));
                return;
            }
        }
        try {
            this.r = false;
            dhja.l(dhipVar, "200 OK response received", new Object[0]);
            ebkyVar.q = ebqsVarB;
            ebkyVar.f();
            ebkyVar.e = dhjv.i(ebqsVarB.l());
            String strF = ebqsVarB.f();
            if (strF != null) {
                ebkyVar.f = strF;
            }
            ebkyVar.j = dhjv.s(ebqsVarB, true);
            ebkyVar.s = ebqo.d(ebqsVarB.g(), ebqsVarB.h());
            ebnr ebnrVar = (ebnr) ebqsVarB.z().c().f();
            ebnrVar.getClass();
            String strD = ebnrVar.e.d("+sip.instance");
            if (strD != null) {
                ebkyVar.e(strD);
            }
            String strE = ebqsVarB.e();
            if (strE != null && this.G == null) {
                int iIndexOf2 = strE.indexOf(34) + 1;
                String strSubstring = null;
                if (iIndexOf2 > 0 && (iIndexOf = strE.indexOf(34, iIndexOf2)) > iIndexOf2) {
                    strSubstring = strE.substring(iIndexOf2, iIndexOf);
                }
                this.G = strSubstring;
            }
            ebkyVar.c();
            dhja.l(dhipVar, "Send ACK", new Object[0]);
            dhjt dhjtVar2 = this.A;
            eblf eblfVarV3 = v();
            t();
            ad(dhjtVar2.q(eblfVarV3, ebkyVar));
            try {
                R(ebqsVarB);
                P();
            } catch (Exception e2) {
                dhja.j(e2, f, "Session completion has failed: %s", e2.getMessage());
                m(e2);
            }
            this.v.b(this.l, ebqsVarB);
        } catch (Exception e3) {
            dhja.j(e3, f, "Session initiation has failed: %s", e3.getMessage());
            L(new dhfu(e3));
        }
    }

    public final void aq(ebqr ebqrVar, String str, int i) {
        try {
            dhja.l(f, "Send 486 Busy here", new Object[0]);
            ad(this.A.p(ebqrVar, str, 486, i));
        } catch (Exception e) {
            dhja.j(e, f, "Can't send 486 Busy Response", new Object[0]);
        }
    }

    protected final void ar(ebqr ebqrVar, String str, int i) {
        try {
            dhja.l(f, "Send 488 Not acceptable", new Object[0]);
            ad(this.A.p(ebqrVar, str, 488, i));
        } catch (Exception e) {
            dhja.j(e, f, "Can't send 488 Not acceptable", new Object[0]);
        }
    }

    public final void as(ebqr ebqrVar, String str, int i) {
        try {
            dhja.l(f, "Sending 400 Bad Request", new Object[0]);
            ad(this.A.p(ebqrVar, str, 400, i));
        } catch (Exception e) {
            dhja.j(e, f, "Can't send 400 Bad Request", new Object[0]);
        }
    }

    public final void at() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            dgwh dgwhVar = (dgwh) it.next();
            try {
                if (dgwhVar instanceof dgwi) {
                    ((dgwi) dgwhVar).t();
                }
            } catch (Exception e) {
                dhja.j(e, f, "requestReceived: Call to listener failed with error", new Object[0]);
            }
        }
    }

    @Override // defpackage.dgvh
    protected final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dgwh) it.next()).i();
            } catch (Exception e) {
                dhja.j(e, f, "handleSessionStarted: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    @Override // defpackage.dgvh
    protected final void d() {
        dgvq dgvqVar = this.i;
        dgwg dgwgVar = dgvqVar.c;
        ConcurrentHashMap concurrentHashMap = dgwgVar.a;
        synchronized (concurrentHashMap) {
            String str = this.k;
            if (concurrentHashMap.containsKey(str)) {
                dhja.c("session %s is already tracked.", str);
            } else {
                dhja.c("Add new session %s", str);
                concurrentHashMap.put(str, this);
                dgwgVar.b.a(dgvqVar, this);
            }
        }
        dhip dhipVar = f;
        dhja.d(dhipVar, "Aquiring wake lock for session %s", this.k);
        this.H.acquire();
        try {
            eblm eblmVarL = null;
            if (this.p) {
                try {
                    dhja.l(dhipVar, "Initiate a new session as originating", new Object[0]);
                    try {
                        ebqo[] ebqoVarArrAk = ak();
                        D(ebqoVarArrAk);
                        ebky ebkyVar = this.l;
                        ebkyVar.r = ebqoVarArrAk;
                        ebkyVar.w = "uac";
                        ebnq ebnqVar = this.x;
                        if (ebnqVar != null) {
                            ebkyVar.c = ebnqVar;
                        }
                        dhja.l(dhipVar, "Send INVITE", new Object[0]);
                        dhjt dhjtVar = this.A;
                        eblf eblfVarV = v();
                        t();
                        ebqr ebqrVarR = dhjtVar.r(eblfVarV, ebkyVar);
                        dhja.w(23, 4, "SIP INVITE created with callid=%s", ebqrVarR.d());
                        if (ebqrVarR.j("Contribution-ID") != null) {
                            dhja.r(dhipVar, "Contribution-ID was already added to INVITE header", new Object[0]);
                        } else {
                            try {
                                String str2 = this.y;
                                if (str2 != null) {
                                    ebqrVarR.s("Contribution-ID", str2);
                                }
                            } catch (ebml e) {
                                dhja.j(e, f, "SIP INVITE can't accept Contribution-ID: %s", e.getMessage());
                            }
                        }
                        String strY = y();
                        dgwe dgweVarA = strY == null ? null : this.i.c.a(strY, this);
                        dhjv.u(ebqrVarR, dgweVarA != null ? dgweVarA.x() : null, al());
                        if (!dhim.d(this.q)) {
                            ebqrVarR.s("Subject", this.q);
                        }
                        ebqrVarR.y().e.getClass();
                        T(ebqrVarR);
                        this.l.i = ebqrVarR;
                        I();
                        ap(ebqrVarR);
                    } catch (dgwr e2) {
                        dhja.j(e2, f, "Could not prepare sip body parts!", new Object[0]);
                        o(e2, 2, 18);
                    }
                } catch (Exception e3) {
                    dhja.j(e3, f, "Error while starting session: %s", e3.getMessage());
                    o(e3, 2, 18);
                }
            } else {
                ebky ebkyVar2 = this.l;
                ebqr ebqrVar = ebkyVar2.i;
                ebqrVar.getClass();
                try {
                    dhja.l(dhipVar, "Initiate a new session as terminating", new Object[0]);
                    Z(ebqrVar, ebkyVar2.d);
                    if (s() != 1) {
                        if (((Boolean) D.a()).booleanValue()) {
                            h(1);
                            i(24);
                            l();
                        } else {
                            n(1, 24);
                        }
                        dhja.l(dhipVar, "Stopped session as the invitation was not acceptable.", new Object[0]);
                    } else {
                        try {
                            ebqo[] ebqoVarArrAk2 = ak();
                            D(ebqoVarArrAk2);
                            this.l.r = ebqoVarArrAk2;
                            dhja.l(dhipVar, "Send 200 OK", new Object[0]);
                            try {
                                dhjt dhjtVar2 = this.A;
                                eblf eblfVarV2 = v();
                                ebky ebkyVar3 = this.l;
                                ebqs ebqsVarF = dhjtVar2.f(eblfVarV2, ebkyVar3);
                                if (ebqsVarF == null) {
                                    dhja.h(dhipVar, "Error generating 200 OK to INVITE.", new Object[0]);
                                    n(9, 55);
                                } else {
                                    dhjv.u(ebqsVarF, x(), al());
                                    this.v.c(ebkyVar3, ebqrVar, ebqsVarF);
                                    I();
                                    try {
                                        eblmVarL = v().l(ebqsVarF);
                                    } catch (ebmn e4) {
                                        dhja.j(e4, f, "Can't send 200 OK response, will retry", new Object[0]);
                                    }
                                    this.l.f();
                                    eblmVarL.getClass();
                                    eblmVarL.h(30);
                                    int i = 0;
                                    while (!eblmVarL.f() && i < ((Integer) dfbx.c.a()).intValue()) {
                                        if (this.a != dgws.STARTING) {
                                            dhja.d(f, "No longer starting, aborting!", new Object[0]);
                                            break;
                                        }
                                        i++;
                                        dhja.l(f, "Re-send 200 OK because ACK is not received", new Object[0]);
                                        try {
                                            eblmVarL = v().l(ebqsVarF);
                                        } catch (ebmn e5) {
                                            dhja.j(e5, f, "Can't send 200 OK response, will retry", new Object[0]);
                                        }
                                        eblmVarL.h(30);
                                    }
                                    if (this.a != dgws.STARTING) {
                                        dhja.d(f, "No longer starting, aborting!", new Object[0]);
                                    } else {
                                        this.l.c();
                                        if (eblmVarL.f()) {
                                            dhja.l(f, "ACK request received", new Object[0]);
                                            try {
                                                P();
                                            } catch (Exception e6) {
                                                dhja.j(e6, f, "Error while completing session - stopping: %s", e6.getMessage());
                                                m(e6);
                                            }
                                        } else {
                                            dhja.h(f, "No ACK received for INVITE", new Object[0]);
                                            m(new dhft(408, "Timeout"));
                                        }
                                    }
                                }
                            } catch (Exception e7) {
                                dhja.j(e7, f, "Sending response failed: %s", e7.getMessage());
                                m(e7);
                            }
                        } catch (Exception e8) {
                            dhja.j(e8, f, "Error in preparing session: %s", e8.getMessage());
                            this.n = 4;
                            m(e8);
                        }
                    }
                } catch (Exception e9) {
                    dhja.j(e9, f, "Error while processing incoming session", new Object[0]);
                    m(e9);
                }
            }
            dhja.d(f, "Releasing wake lock for session %s", this.k);
            try {
                this.H.release();
            } catch (RuntimeException unused) {
            }
        } catch (Throwable th) {
            dhja.d(f, "Releasing wake lock for session %s", this.k);
            try {
                this.H.release();
            } catch (RuntimeException unused2) {
            }
            throw th;
        }
    }

    @Override // defpackage.dgvh
    protected final void e() {
        this.i.i(this);
        Y(this.d, this.e);
    }

    @Override // defpackage.dgvh
    protected void f() {
        throw null;
    }

    @Override // defpackage.dgvh
    protected void g(Throwable th) {
        throw null;
    }

    @Override // defpackage.dgvh
    protected final void r() {
        this.i.i(this);
        Y(this.d, this.e);
    }

    public final int s() {
        int i;
        ebky ebkyVar = this.l;
        ebqr ebqrVar = ebkyVar.i;
        ebqrVar.getClass();
        int i2 = this.n;
        if (i2 != 0) {
            return i2;
        }
        dhja.d(f, "Wait session invitation answer", new Object[0]);
        Object obj = this.h;
        synchronized (obj) {
            i = 0;
            while (i < 60) {
                try {
                    obj.wait(5000L);
                    if (this.n != 0) {
                        break;
                    }
                    try {
                        Z(ebqrVar, ebkyVar.d);
                        i += 5;
                    } catch (ebmn e) {
                        m(e);
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i >= 60) {
            dhja.l(f, "Timeout - Ringing period expired", new Object[0]);
            this.n = 0;
        }
        return this.n;
    }

    public final dfys t() {
        return this.i.a;
    }

    @Override // defpackage.dgvh
    public String toString() {
        return " mSessionId: " + this.k + "\r\n remoteUri: " + dhiz.URI.c(this.F) + "\r\n invitationStatus: " + this.n + "\r\n disconnect: " + this.u + "\r\n isRinging: " + this.r + "\r\n originating: " + this.p + "\r\n updateOriginating: false\r\n" + (" State: " + String.valueOf(this.a) + "\r\n Error: " + String.valueOf(this.c));
    }

    public final ImsConfiguration u() {
        return t().c();
    }

    protected final eblf v() throws ebmn {
        eblf eblfVar = ((eblg) this.j).a;
        if (eblfVar.v()) {
            throw new ebmn("SipStack is not initialized.");
        }
        return eblfVar;
    }

    public final String w() {
        return ai() ? this.z : this.y;
    }

    public final String x() {
        return this.l.u;
    }

    public final String y() {
        ebma ebmaVar = this.F;
        if (ebmaVar != null) {
            return ebmaVar.toString();
        }
        throw new IllegalStateException("remote URI was not initialized");
    }

    public final String z() {
        String str = this.o;
        str.getClass();
        return str;
    }

    protected void P() {
    }

    protected void U() {
    }
}
