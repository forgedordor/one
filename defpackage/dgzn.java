package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgzn extends dgwe implements ebjc {
    public static final String D;
    private static final ejxk aa;
    public boolean E;
    public ebji F;
    protected List G;
    public String H;
    public String I;
    public boolean J;
    public final LinkedBlockingDeque K;
    public final dhjz L;
    public long M;
    public dgyx N;
    public dgyn O;
    public final Object P;
    public boolean Q;
    public final dhgr R;
    public dgza S;
    public fcsu T;
    public boolean U;
    public boolean V;
    public final String W;
    public final dgzx X;
    private dgwm ab;
    private dgwq ac;
    private final ConcurrentHashMap ad;
    private boolean ae;
    private Optional af;
    private final InstantMessageConfiguration ag;
    private dgzm ah;
    public static final dhip B = new dhip("InstantMessageSession");
    static final dfny C = dfnv.b("enable_reason_header_on_bye_for_all_sessions");
    private static final dfny Y = dfod.a(173039682);
    private static final dfny Z = dfod.a(183695160);

    static {
        dfnv.b("enable_revocation_for_encrypted_session");
        D = ebcu.DELIVERED.p + ", " + ebcu.DISPLAYED.p;
        aa = ejxk.d(" ").f().a();
    }

    public dgzn(Context context, dgvq dgvqVar, fcsu fcsuVar, ebqr ebqrVar, ebja ebjaVar, dhgr dhgrVar, dfcg dfcgVar, dhjt dhjtVar, InstantMessageConfiguration instantMessageConfiguration, deza dezaVar) throws ebmn {
        super(context, dgvqVar, fcsuVar, null, ebqrVar, dfcgVar, dhjtVar);
        this.E = false;
        this.ac = dgwq.LEAVE_INVOLUNTARILY;
        this.K = new LinkedBlockingDeque();
        this.ad = new ConcurrentHashMap();
        this.O = dgyn.CONFERENCE_FACTORY_URI;
        this.P = new Object();
        this.ae = false;
        this.Q = true;
        this.af = Optional.empty();
        this.S = dgza.e;
        this.R = dhgrVar;
        this.F = bt(context, dgvqVar.a, ebjaVar, bs(1));
        this.E = be(ebqrVar);
        String strE = ebqrVar.e();
        if (strE == null) {
            throw new ebmn("Incoming request has no contact header");
        }
        this.J = strE.contains("+g.gsma.rcs.isbot");
        this.L = new dhjz(this.m);
        this.ag = instantMessageConfiguration;
        bq();
        ebkr ebkrVar = dhjv.a;
        ebnr ebnrVarB = ebqrVar.b();
        this.V = ebnrVarB != null && (ebnrVarB.l("vnd.google.rcs.encrypted") || ebnrVarB.l("+vnd.google.rcs.encrypted"));
        this.X = new dgyh(instantMessageConfiguration.mMessageTech, 1);
        this.y = ebqrVar.j("Contribution-ID");
        this.W = ebqrVar.j("Accept-Contact");
        if (this.y == null && ((Boolean) dfpo.p().a.H.a()).booleanValue()) {
            as(ebqrVar, this.l.d, 5);
            o(new ebmn("Incoming request has no contributionId"), 2, 62);
            return;
        }
        if (ai()) {
            this.z = ebqrVar.j("Conversation-ID");
        }
        List<ebqo> listO = ebqrVar.o();
        ebpc ebpcVar = ebqrVar.a;
        for (ebqo ebqoVar : listO) {
            if (!ejuf.e(ebqoVar.b, "application/resource-lists+xml") && !ebqoVar.b.equalsIgnoreCase("application/sdp")) {
                byte[] bArr = ebqoVar.a;
                String str = ebqoVar.b;
                String str2 = this.l.g;
                String strY = y();
                String strX = x();
                dgyx dgyxVar = new dgyx(str2, bArr, str);
                boolean z = this.E;
                dgyxVar.o = z;
                dgyxVar.q = this.J;
                dgyxVar.p = z && TextUtils.equals(this.I, strY);
                dgyxVar.c = strY;
                dgyxVar.e = strX;
                if (dgzq.b(dgyxVar)) {
                    try {
                        ebcp ebcpVarB = ebcp.b(dgyxVar.f);
                        dgyxVar.k = ebcpVarB.g("urn:ietf:params:imdn", "Message-ID");
                        dgyxVar.j = ebcpVarB.a();
                        dgyxVar.l = dgzq.a(ebcpVarB);
                        dgyxVar.i = ebcpVarB.c();
                    } catch (Exception unused) {
                        dhja.r(B, "Failed to parse CPIM msg to get IMDN msg ID and profile info!", new Object[0]);
                    }
                }
                TextUtils.isEmpty(null);
                this.N = dgyxVar;
                return;
            }
        }
    }

    public static boolean be(ebqr ebqrVar) throws ebmn {
        String strE = ebqrVar.e();
        if (strE != null) {
            return strE.contains(String.format(";%s", "isfocus"));
        }
        throw new ebmn("Incoming request has no contact header");
    }

    protected static final ebjj bj(dgyx dgyxVar) {
        ebjj ebjjVar;
        String str = dgyxVar.b;
        if (str == null) {
            dhja.r(B, "Message has no receiver - return null", new Object[0]);
            return null;
        }
        String str2 = dgyxVar.k;
        if ("message/cpim".equalsIgnoreCase(dgyxVar.h)) {
            ebco ebcoVar = dgyxVar.g;
            if (ebcoVar == null) {
                dhja.h(B, "MessageContent is null, return null", new Object[0]);
                return null;
            }
            ebjjVar = new ebjj(ebcoVar, "message/cpim");
            if (dfoq.p()) {
                str2.getClass();
                ebjjVar.f(str2);
            }
        } else if (str2 == null) {
            ebco ebcoVar2 = dgyxVar.g;
            if (ebcoVar2 == null) {
                dhja.h(B, "MessageContent is null, return null", new Object[0]);
                return null;
            }
            ebjjVar = new ebjj(ebcoVar2, dgyxVar.h);
        } else {
            ebcp ebcpVar = new ebcp(dgyxVar.h, "utf-8");
            ebcpVar.l(dgyxVar.c);
            ebcpVar.p(str);
            ebcpVar.j(dgyxVar.f);
            ebcpVar.o("imdn", "urn:ietf:params:imdn");
            ebcpVar.n("urn:ietf:params:imdn", "Message-ID", dgyxVar.k);
            ebcpVar.m("DateTime", dhie.a().toString());
            ebjj ebjjVar2 = new ebjj(ebcpVar.s());
            ebjjVar2.f(str2);
            ebjjVar = ebjjVar2;
        }
        if (!((Boolean) dfpc.a().a.c.a()).booleanValue() || dgyxVar.r) {
            ebjjVar.e("yes");
        } else {
            ebjjVar.e("no");
        }
        ebjjVar.g();
        ebjjVar.o = dgyxVar.b();
        return ebjjVar;
    }

    private final String bn() {
        String str = this.y;
        String strConcat = str == null ? "" : "\r\n contributionId: ".concat(str);
        return " conferenceUri: " + dhiz.URI.c(this.I) + strConcat + "\r\n conversationId: " + this.z + "\r\n sessionExitState: " + String.valueOf(this.ac) + "\r\n participants: " + dhiz.USER_ID.b(aE());
    }

    private final void bo(dgyx dgyxVar, int i) {
        dhja.d(B, "Cleaning up %s", dgyxVar.toString());
        aG(dgyxVar, i);
    }

    private final void bp(int i) {
        if (this.p && ((!((Boolean) Z.a()).booleanValue() || !ai()) && this.N != null && !this.ae)) {
            dhja.d(B, "[Session ID: %s] Initial message has failed.", this.k);
            aG(this.N, i);
        }
        String str = this.k;
        dhip dhipVar = B;
        ConcurrentHashMap concurrentHashMap = this.ad;
        Integer numValueOf = Integer.valueOf(concurrentHashMap.size());
        LinkedBlockingDeque linkedBlockingDeque = this.K;
        dhja.d(dhipVar, "[Session ID: %s] Need to cleanup %d pending and %d queued messages.", str, numValueOf, Integer.valueOf(linkedBlockingDeque.size()));
        Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            bo((dgyx) it.next(), i);
        }
        concurrentHashMap.clear();
        Iterator it2 = linkedBlockingDeque.iterator();
        while (it2.hasNext()) {
            bo((dgyx) it2.next(), i);
        }
        linkedBlockingDeque.clear();
    }

    private final void bq() {
        if (this.I != null) {
            return;
        }
        this.I = this.l.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Type inference failed for: r8v19, types: [dgza] */
    /* JADX WARN: Type inference failed for: r8v20, types: [dgza] */
    /* JADX WARN: Type inference failed for: r8v23, types: [dgza] */
    /* JADX WARN: Type inference failed for: r8v24, types: [dgza] */
    /* JADX WARN: Type inference failed for: r8v25, types: [dgza] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void br(defpackage.ebjj r7, int r8, defpackage.ebjn r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgzn.br(ebjj, int, ebjn):void");
    }

    private static int bs(int i) {
        return i == 2 ? ((Integer) dfoq.c().a.i.a()).intValue() : ((Integer) dfoq.c().a.h.a()).intValue();
    }

    private static ebji bt(Context context, dfys dfysVar, ebja ebjaVar, int i) throws ebjd {
        Optional optionalA = dfyq.a(dfysVar);
        if (context == null) {
            throw new ebjd("Can't create msrp manager: no application context available");
        }
        if (optionalA.isEmpty()) {
            throw new ebjd("Can't create msrp manager: no network interface available");
        }
        return new ebji(context, ((dfyt) optionalA.get()).b(), (String) ((dfyt) optionalA.get()).a().orElseThrow(new Supplier() { // from class: dgzg
            @Override // java.util.function.Supplier
            public final Object get() {
                dhip dhipVar = dgzn.B;
                return new ebjd("Can't create msrp manager: no local ip address");
            }
        }), ebfo.a(), ebjaVar, i);
    }

    @Override // defpackage.dgwe
    public final String B() {
        if (!this.E) {
            return super.B();
        }
        return bn() + VCardBuilder.VCARD_END_OF_LINE + super.B();
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0205 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185 A[FALL_THROUGH] */
    @Override // defpackage.dgwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void M(defpackage.ebqs r18) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgzn.M(ebqs):void");
    }

    @Override // defpackage.dgwe
    protected void P() {
        if (this.E) {
            bq();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    @Override // defpackage.dgwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(defpackage.ebqr r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgzn.Q(ebqr):void");
    }

    @Override // defpackage.dgwe
    protected final void R(ebqs ebqsVar) {
        ebnq ebnqVar = ebqsVar.a.j;
        if (ebnqVar != null) {
            this.x = ebnqVar;
            dhja.d(dgwe.f, "conference header response: %s", this.x.a);
        }
        aI(ebqsVar);
        try {
            if (this.E) {
                String strF = ebqsVar.f();
                if (TextUtils.isEmpty(strF)) {
                    dhja.h(B, "Received empty conference URI from 200 OK", new Object[0]);
                } else {
                    this.I = strF;
                }
            }
        } catch (Exception e) {
            dhja.j(e, B, "Conference URI set has failed: %s", e.getMessage());
        }
    }

    @Override // defpackage.dgwe
    protected final void S(ebqr ebqrVar) {
        if (this.E || (ai() && ((Boolean) C.a()).booleanValue())) {
            try {
                dgwq dgwqVarAw = aw();
                ebqrVar.s("Reason", "SIP;cause=" + dgwqVarAw.e + ";text=\"" + dgwqVarAw.f + "\"");
            } catch (ebml e) {
                dhja.j(e, B, "Can't add reason header: %s", e.getMessage());
            }
        }
    }

    @Override // defpackage.dgwe
    protected void T(ebqr ebqrVar) {
        if (ai()) {
            dhip dhipVar = B;
            dhja.d(dhipVar, "CPM is enabled, adding Conversation-ID", new Object[0]);
            if (this.z == null) {
                dhja.h(dhipVar, "Conversation-ID not generated yet", new Object[0]);
                return;
            }
            if (ebqrVar.j("Conversation-ID") != null) {
                dhja.r(dhipVar, "Conversation-ID was already added to INVITE header", new Object[0]);
                return;
            }
            try {
                String str = this.z;
                str.getClass();
                ebqrVar.s("Conversation-ID", str);
            } catch (ebml e) {
                dhja.j(e, B, "SIP INVITE can't accept Conversation-ID: %s", e.getMessage());
            }
            if (((Boolean) dfpo.p().a.o.a()).booleanValue()) {
                try {
                    if (!dfog.E()) {
                        if (this.E) {
                            ebqrVar.s("P-Preferred-Service", "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session.group");
                            return;
                        } else {
                            ebqrVar.s("P-Preferred-Service", "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session");
                            return;
                        }
                    }
                    dgzx dgzxVar = this.X;
                    Optional optionalEmpty = !dgzxVar.e() ? Optional.empty() : dgzxVar.f() ? Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.largemsg") : this.E ? Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session.group") : Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session");
                    if (optionalEmpty.isPresent()) {
                        ebqrVar.s("P-Preferred-Service", (String) optionalEmpty.get());
                    }
                } catch (ebml e2) {
                    dhja.j(e2, B, "SIP INVITE can't accept P-Preferred-Service: %s", e2.getMessage());
                }
            }
        }
    }

    @Override // defpackage.dgwe
    protected final void U() {
        dgwm dgwmVar = this.ab;
        if (dgwmVar != null) {
            dgwmVar.i(this.ah);
            this.ab.l(true);
        }
    }

    @Override // defpackage.dgwe
    public final void V(ebqs ebqsVar) {
        dhja.d(dgwe.f, "Received session progress/ringing", new Object[0]);
        if (ebqsVar.y() == 180) {
            this.r = true;
        }
        N(ebqsVar);
        K(ebqsVar.z());
        aI(ebqsVar);
    }

    public final ekhx aA() throws IOException {
        String str;
        String str2 = this.k;
        dhip dhipVar = B;
        dhja.d(dhipVar, "Retrieving remote accept wrapped types for group session: %s", str2);
        ebqo ebqoVarG = this.l.g();
        if (ebqoVarG == null) {
            dhja.d(dhipVar, "No remote SDP. Cannot retrieve accept wrapped types for session: %s", str2);
            return ekon.a;
        }
        String strB = ebqoVarG.b();
        if (ejwk.c(strB)) {
            dhja.d(dhipVar, "No remote SDP content. Cannot retrieve accept wrapped types for session: %s", str2);
            return ekon.a;
        }
        BufferedReader bufferedReader = new BufferedReader(new StringReader(strB));
        ebkd ebkdVarC = null;
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                if (line.startsWith("m=")) {
                    ebkdVarC = ebkd.c(line);
                } else if (line.startsWith("c=") && !Objects.isNull(ebkdVarC)) {
                    ebkdVarC.c = ebka.a(line);
                } else if (line.startsWith("b=") && !Objects.isNull(ebkdVarC)) {
                    ebkdVarC.d = ebjz.a(line);
                } else if (line.startsWith("i=") && !Objects.isNull(ebkdVarC)) {
                    ebkdVarC.b = ebko.c(line);
                } else if (line.startsWith("a=") && !Objects.isNull(ebkdVarC)) {
                    ebkdVarC.e(ebkb.a(line));
                }
            }
        } catch (IOException unused) {
        }
        if (ebkdVarC == null) {
            dhja.d(B, "No remote SDP media description. Cannot retrieve accept wrapped types for session: %s", str2);
            return ekon.a;
        }
        ebkb ebkbVarA = ebkdVarC.a("accept-wrapped-types");
        if (ebkbVarA != null && (str = ebkbVarA.b) != null) {
            return ekhx.n(aa.g(str));
        }
        dhja.d(B, "No remote accept wrapped types for session: %s", str2);
        return ekon.a;
    }

    public Optional aB() {
        return Optional.empty();
    }

    protected final String aC() {
        return (this.E || this.X.f()) ? "message/cpim" : "message/cpim application/im-iscomposing+xml";
    }

    protected String aD() {
        StringBuilder sb = new StringBuilder("text/plain application/vnd.gsma.rcs-ft-http+xml");
        if (this.E) {
            sb.append(" application/im-iscomposing+xml application/vnd.oma.cpm-groupdata+xml");
        }
        if (this.J) {
            sb.append(" multipart/mixed application/vnd.gsma.botsuggestion.v1.0+json application/vnd.gsma.botmessage.v1.0+json");
        }
        sb.append(" message/imdn+xml");
        if (this.Q) {
            sb.append(" application/vnd.gsma.rcspushlocation+xml");
        }
        return sb.toString();
    }

    public final List aE() {
        List list = this.G;
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
    }

    public final void aF(dgzo dgzoVar) {
        ((dgwe) this).g.add(dgzoVar);
    }

    protected final void aG(dgyx dgyxVar, int i) {
        for (dgwh dgwhVar : ((dgwe) this).g) {
            if (dgwhVar instanceof dgzo) {
                ((dgzo) dgwhVar).a(dgyxVar, i);
            }
        }
    }

    protected final void aH(dgyx dgyxVar) {
        for (dgwh dgwhVar : ((dgwe) this).g) {
            if (dgwhVar instanceof dgzo) {
                ((dgzo) dgwhVar).b(dgyxVar);
            }
        }
    }

    final void aI(ebqs ebqsVar) {
        dgyx dgyxVar;
        if (this.ae) {
            return;
        }
        int iY = ebqsVar.y();
        if ((iY != 180 && iY != 486 && iY != 200) || this.E || ai() || (dgyxVar = this.N) == null) {
            return;
        }
        this.ae = true;
        aH(dgyxVar);
    }

    protected final void aJ(dgyx dgyxVar) {
        dhja.d(B, "Received message: %s", dgyxVar.toString());
        for (dgwh dgwhVar : ((dgwe) this).g) {
            if (dgwhVar instanceof dgzo) {
                ((dgzo) dgwhVar).c(dgyxVar);
            }
        }
    }

    public final void aK(String str, dgzc dgzcVar) {
        for (dgwh dgwhVar : ((dgwe) this).g) {
            if (dgwhVar instanceof dgyy) {
                ((dgyy) dgwhVar).q(str, dgzcVar);
            }
        }
    }

    @Override // defpackage.ebjc
    public final void aL(ebjj ebjjVar) {
        dhja.d(B, "Incoming msrp message: message=%s; contentType=%s", ebjjVar.b(), ebjjVar.h);
    }

    @Override // defpackage.ebjc
    public final void aM(ebjr ebjrVar, ebjj ebjjVar) throws dgzc {
        bd();
        try {
            String str = ebjjVar.h;
            dgyx dgyxVar = new dgyx(dgyw.UNKNOWN);
            dgyxVar.d(ebjjVar.h, ebjjVar.b.I());
            dgyxVar.c = y();
            dgyxVar.b = this.l.g;
            dgyxVar.e = x();
            boolean z = this.E;
            dgyxVar.o = z;
            dgyxVar.q = this.J;
            dgyxVar.p = z && TextUtils.equals(this.I, y());
            if (dhim.e(str, "message/cpim")) {
                ebcp ebcpVarB = ebcp.b(ebjjVar.b.I());
                String strF = ebcpVarB.f();
                if (strF == null) {
                    throw new dgzc(8, "incoming message has no from header");
                }
                dgyxVar.c = ebcq.a(strF).a;
                String strI = ebcpVarB.i();
                if (!GroupManagementContentType.CONTENT_TYPE.equals(ebcpVarB.e())) {
                    if (strI == null) {
                        throw new dgzc(8, "incoming message has no to header");
                    }
                    dgyxVar.b = ebcq.a(strI).a;
                }
                String strG = ebcpVarB.g("urn:ietf:params:imdn", "Message-ID");
                if (strG != null) {
                    dgyxVar.k = strG;
                }
                String strT = ebcpVarB.t();
                if (strT != null) {
                    dgyxVar.j = dhie.c(strT).a;
                }
                dgyxVar.l = dgzq.a(ebcpVarB);
                dgyxVar.i = ebcpVarB.c();
            }
            dhip dhipVar = B;
            dhiz dhizVar = dhiz.USER_ID;
            dhja.d(dhipVar, "Received MSRP message:\nsender: %s\nreceiver: %s\ncontent-type: %s\nsize: %d\ncontent: %s", dhizVar.c(dgyxVar.c), dhizVar.c(dgyxVar.b), dgyxVar.h, Integer.valueOf(dgyxVar.f.length), dhiz.MESSAGE_CONTENT.c(new String(dgyxVar.f, StandardCharsets.UTF_8)));
            aJ(dgyxVar);
        } catch (Exception e) {
            dhja.j(e, B, "Problem while receiving data", new Object[0]);
        }
    }

    @Override // defpackage.ebjc
    public final void aN(ebjr ebjrVar, ebjj ebjjVar) {
        if (ebjjVar.k) {
            return;
        }
        dhip dhipVar = B;
        dhja.d(dhipVar, "Data transferred: message[%s]", dhiz.MSRP_MESSAGE.c(ebjjVar));
        dgyx dgyxVar = (dgyx) this.ad.remove(ebjjVar);
        if (dgyxVar == null) {
            dhja.r(dhipVar, "No instant message found for msrp message - skipping event", new Object[0]);
        } else {
            aH(dgyxVar);
        }
    }

    @Override // defpackage.ebjc
    public final void aO(ebjr ebjrVar, ebjj ebjjVar) {
        dhja.l(B, "Data transfer aborted: message[%s]", dhiz.MSRP_MESSAGE.c(ebjjVar));
    }

    @Override // defpackage.ebjc
    public final void aP(ebjr ebjrVar, ebjj ebjjVar, ebjn ebjnVar) {
        dhja.r(B, "MsrpRequestRejected, response: %s, status code %s", ebjnVar.b, Integer.valueOf(ebjnVar.a));
        br(ebjjVar, 3, ebjnVar);
    }

    @Override // defpackage.ebjc
    public final void aS() {
        String str = this.k;
        dhip dhipVar = B;
        dhja.r(dhipVar, "Dedicated bearer is lost for session %s", str);
        if (dfog.x()) {
            dhja.l(dhipVar, "Session %s falling back to a default bearer.", str);
        } else {
            n(9, 69);
        }
    }

    public final void aT(dgzl dgzlVar) {
        int iOrdinal = dgzlVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            X(4, 7, 24);
            return;
        }
        if (iOrdinal == 2) {
            X(9, 7, 58);
            return;
        }
        if (iOrdinal == 3) {
            X(10, 7, 59);
            return;
        }
        if (iOrdinal == 4) {
            X(11, 7, 60);
        } else if (iOrdinal != 5) {
            X(2, this.d, this.e);
        } else {
            X(12, 7, 70);
        }
    }

    public final void aU(dgzo dgzoVar) {
        ((dgwe) this).g.remove(dgzoVar);
    }

    public final void aV(dgyx dgyxVar) throws dgzc {
        if (!bg()) {
            dhja.h(B, "Unable to send message: %s, %d", this.a.toString(), Integer.valueOf(this.n));
            throw new dgzc();
        }
        if (dgyxVar.c == null) {
            dgyxVar.c = this.l.g;
        }
        if (dgyxVar.b == null) {
            dgyxVar.b = y();
        }
        dhja.w(13, 3, "Queueing message for sending %s with messageid=%s", dgyxVar, dgyxVar.k);
        this.K.add(dgyxVar);
    }

    public final void aW(long j, dgwm dgwmVar) {
        dgwm dgwmVar2 = this.ab;
        if (dgwmVar2 != null) {
            dgwmVar2.i(this.ah);
        }
        this.ab = dgwmVar;
        if (dgwmVar != null) {
            dgzm dgzmVar = new dgzm(this, j);
            this.ah = dgzmVar;
            dgwmVar.d(dgzmVar);
        }
    }

    public final void aX(boolean z) {
        ejwl.l(this.a.equals(dgws.INITIAL));
        this.V = z;
    }

    public final void aY(boolean z) {
        if (!this.p) {
            dhja.r(B, "Ignoring disable network fallback signal: terminating session", new Object[0]);
        }
        if (this.a != dgws.INITIAL) {
            dhja.r(B, "Ignoring disable network fallback signal: session in state %s", this.a.toString());
        } else {
            this.U = z;
        }
    }

    protected final void aZ(dgyx dgyxVar, ebjj ebjjVar) {
        this.ad.put(ebjjVar, dgyxVar);
    }

    @Override // defpackage.dgwe
    public final boolean ai() {
        if (dfog.E()) {
            return this.X.e();
        }
        InstantMessageConfiguration instantMessageConfiguration = this.ag;
        ebkr ebkrVar = dhjv.a;
        return instantMessageConfiguration.a();
    }

    public final dewi au(dewk dewkVar) {
        Optional optionalOfNullable = this.J ? Optional.ofNullable(this.o) : Optional.empty();
        if (optionalOfNullable.isEmpty()) {
            dhja.h(B, "BotId is missing; cannot wait for business info availability", new Object[0]);
            return dewi.CLIENT_ERROR;
        }
        String str = (String) optionalOfNullable.get();
        dewi dewiVarD = dewkVar.d(str);
        dewi dewiVar = dewi.INFO_LOCALLY_AVAILABLE;
        if (dewiVarD == dewiVar) {
            dhja.l(B, "Business info is already locally available for %s", dhiz.USER_ID_BOT.c(str));
            return dewiVar;
        }
        if (BusinessInfoData.getVerifiedBotPlatform(str) == 0) {
            dhja.h(B, "Unknown platform for botId %s", dhiz.USER_ID_BOT.c(str));
            return dewi.CLIENT_ERROR;
        }
        dgzh dgzhVar = new dgzh(this, str, dewkVar);
        dhip dhipVar = B;
        dhiz dhizVar = dhiz.USER_ID_BOT;
        dhja.l(dhipVar, "Starting new business info retrieval for botId %s", dhizVar.c(str));
        dewkVar.g(str, dgzhVar);
        dhja.l(dhipVar, "Waiting for business info retrieval for botId %s", dhizVar.c(str));
        Object obj = this.P;
        synchronized (obj) {
            long millis = TimeUnit.SECONDS.toMillis(eonc.a(((Long) dfnr.a().b.g.a()).longValue()));
            long millis2 = TimeUnit.SECONDS.toMillis(eonc.a(((Long) dfnr.a().b.f.a()).longValue()));
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = millis2 + jCurrentTimeMillis;
            ejwl.l(j > jCurrentTimeMillis);
            long jMin = jCurrentTimeMillis;
            while (jCurrentTimeMillis < j) {
                try {
                    jMin = Math.min(j, jMin + millis);
                    while (jCurrentTimeMillis < jMin && !dewkVar.f(str)) {
                        obj.wait(jMin - jCurrentTimeMillis);
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    if (dewkVar.f(str)) {
                        dhja.l(B, "Business info retrieval completed for botId %s", dhiz.USER_ID_BOT.c(str));
                        return dewkVar.d(str);
                    }
                    try {
                        ebky ebkyVar = this.l;
                        ebqr ebqrVar = ebkyVar.i;
                        if (ebqrVar == null) {
                            throw new ebmn("No invite found for this session");
                        }
                        Z(ebqrVar, ebkyVar.d);
                    } catch (ebmn e) {
                        dhja.h(B, "Could not send 180 ringing while retrieving business information: %s", e);
                        m(e);
                    }
                } catch (InterruptedException unused) {
                    dhja.h(B, "Interrupted while waiting for business information for botId %s", dhiz.USER_ID_BOT.c(str));
                }
            }
            dhja.h(B, "Timeout - Business info retrieval period expired for botId %s", dhiz.USER_ID_BOT.c(str));
            return dewi.SERVER_ERROR;
        }
    }

    protected final InstantMessageConfiguration av() {
        return t().d();
    }

    public final dgwq aw() {
        return this.E ? this.ac : dgwq.LEAVE;
    }

    protected final dgyx ax(int i) {
        dhip dhipVar = B;
        dhja.d(dhipVar, "Polling for next sending message", new Object[0]);
        dgyx dgyxVar = (dgyx) this.K.poll(i, TimeUnit.MILLISECONDS);
        dhja.d(dhipVar, "Found sending message %s", dgyxVar);
        return dgyxVar;
    }

    protected final ebjr ay(String str, ebjc ebjcVar) {
        ebix ebixVar;
        ebfw ebfwVar;
        ebji ebjiVar = this.F;
        if (str.startsWith("msrps")) {
            dhip dhipVar = ebjiVar.f;
            final int i = ebjiVar.a;
            dhja.l(dhipVar, "Creating secure MSRP server endpoint at %d", Integer.valueOf(i));
            ebja ebjaVar = ebjiVar.b;
            if (((Boolean) dfog.o().a.aj.a()).booleanValue()) {
                final ebfl ebflVarB = ebjaVar.c.b();
                ebfwVar = new ebfw(new ebfs() { // from class: ebfj
                    @Override // defpackage.ebfs
                    public final ServerSocket a() {
                        return ebflVarB.b(i);
                    }
                });
            } else {
                ebfwVar = new ebfw(new ebfs() { // from class: ebiz
                    @Override // defpackage.ebfs
                    public final ServerSocket a() {
                        return SSLServerSocketFactory.getDefault().createServerSocket(i);
                    }
                });
            }
            ebixVar = new ebix(ebjaVar.a, ebfwVar, 4);
        } else {
            dhip dhipVar2 = ebjiVar.f;
            final int i2 = ebjiVar.a;
            dhja.l(dhipVar2, "Creating MSRP server endpoint at %d", Integer.valueOf(i2));
            ebja ebjaVar2 = ebjiVar.b;
            Context context = ebjaVar2.a;
            final ebfl ebflVarB2 = ebjaVar2.c.b();
            ebixVar = new ebix(context, new ebfw(new ebfs() { // from class: ebfi
                @Override // defpackage.ebfs
                public final ServerSocket a() {
                    return ebflVarB2.c.createServerSocket(i2);
                }
            }), 2);
        }
        ebix ebixVar2 = ebixVar;
        ebjiVar.i(ebixVar2, str, this.l.a, ebjcVar, Optional.empty());
        new ebjg(ebjiVar, ebixVar2).start();
        ebjr ebjrVar = ebjiVar.c;
        ebjrVar.getClass();
        return ebjrVar;
    }

    protected final ebkd az(boolean z) {
        if (this.w) {
            if (z) {
                return this.F.d();
            }
            ebji ebjiVar = this.F;
            return ebjiVar.e(ebjiVar.e, ebjiVar.d.a(), ebjiVar.a);
        }
        if (z) {
            return this.F.b();
        }
        ebji ebjiVar2 = this.F;
        return ebjiVar2.c(ebjiVar2.a, "TCP/MSRP", "msrp");
    }

    public final void ba(String[] strArr) {
        final ImsConfiguration imsConfigurationU = u();
        this.G = (List) DesugarArrays.stream(strArr).map(new Function() { // from class: dgzj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dhjv.l((String) obj, imsConfigurationU, this.a.m);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
    }

    public final void bb(dgwq dgwqVar) {
        if (!this.E) {
            dhja.r(B, "setting session exit state on 1:1 chat will be ignored by getSessionExitState", new Object[0]);
        }
        this.ac = dgwqVar;
    }

    public final void bc(boolean z) {
        if (z) {
            n(3, 61);
        } else {
            L(new dgzc(6, "Data transfer error"));
        }
    }

    protected final void bd() {
        this.M = System.currentTimeMillis();
    }

    public final boolean bf() {
        if (dfpc.d()) {
            return aA().contains("application/conference-info+xml");
        }
        return false;
    }

    public boolean bg() {
        if (this.af.isPresent()) {
            return false;
        }
        if (((((Boolean) Y.a()).booleanValue() || this.E) && this.a == dgws.STARTING) || this.a == dgws.RUNNING) {
            return true;
        }
        return this.a != dgws.STOPPED && this.n == 1;
    }

    public final String[] bh() {
        return (String[]) Collection.EL.toArray(this.X.d(), new IntFunction() { // from class: dgzi
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                dhip dhipVar = dgzn.B;
                return new String[i];
            }
        });
    }

    @Override // defpackage.ebjc
    public final void bi(ebjr ebjrVar, ebjj ebjjVar, int i) {
        br(ebjjVar, i, null);
    }

    @Override // defpackage.ebjc
    public final void bk(ebjm ebjmVar) {
        byte[] byteArray;
        if (dfoq.p()) {
            String strE = ebjmVar.e("Status");
            String strA = ebjmVar.a();
            String strE2 = ebjmVar.e("Status");
            if (strE2 == null || strE2.startsWith("000 200")) {
                dhja.l(B, "[%s] MSRP REPORT received with status 200", strA);
                return;
            }
            dhja.r(B, "[%s] MSRP REPORT received with status: %s ", strA, strE);
            dgyx dgyxVar = new dgyx(dgyw.CPIM_MESSAGE);
            String str = this.l.g;
            str.getClass();
            dgyxVar.c = y();
            dgyxVar.b = str;
            dgyxVar.e = x();
            boolean z = this.E;
            dgyxVar.o = z;
            dgyxVar.q = this.J;
            dgyxVar.s = true;
            dgyxVar.p = z && TextUtils.equals(this.I, y());
            ebcv ebcvVar = new ebcv("local:".concat(String.valueOf(String.valueOf(UUID.randomUUID()))), dgyxVar.c, str, ebjmVar.d, ebcu.DELIVERY_FAILED);
            dgyxVar.e("message/cpim");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ebcv.u(ebcvVar, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                byteArray = new byte[0];
            }
            dgyxVar.f = byteArray;
            dgyxVar.a = dgyw.UNKNOWN;
            dhip dhipVar = B;
            dhiz dhizVar = dhiz.USER_ID;
            dhja.l(dhipVar, "[%s] Received MSRP REPORT - translated into IMDN:\nsender: %s\nreceiver: %s\ncontent-type: %s\nsize: %d\ncontent: %s", strA, dhizVar.c(dgyxVar.c), dhizVar.c(dgyxVar.b), dgyxVar.h, Integer.valueOf(dgyxVar.f.length), dhiz.MESSAGE_CONTENT.c(new String(dgyxVar.f, StandardCharsets.UTF_8)));
            aJ(dgyxVar);
            n(3, 61);
        }
    }

    public final void bl() {
        this.J = true;
    }

    public final void bm() {
        this.E = true;
    }

    @Override // defpackage.dgwe, defpackage.dgvh
    protected final void f() {
        int i;
        this.F.h();
        int i2 = this.d;
        int i3 = this.e;
        dgza dgzaVar = this.S;
        if (i3 == 21) {
            i = 51;
        } else if (i2 != 2 || i3 != 4) {
            int i4 = ((dgyg) dgzaVar).a;
            switch (i4) {
                case 1:
                    i = 59;
                    break;
                case 2:
                    i = 60;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    i = 61;
                    break;
                default:
                    dhja.r(B, "Invalid error type %s", Integer.valueOf(i4));
                    i = 50;
                    break;
            }
        } else {
            i = 52;
        }
        bp(i);
        try {
            super.ah(null);
        } catch (Exception e) {
            dhja.j(e, dgwe.f, "Exception during service termination", new Object[0]);
            J();
            return;
        }
        if (this.u) {
            h(5);
            i(29);
            J();
            return;
        }
        if (this.t != null) {
            h(1);
            i(19);
            super.O();
            return;
        }
        ebky ebkyVar = this.l;
        if (!ebkyVar.m && !ebkyVar.l) {
            if (this.p) {
                h(5);
                i(29);
                if (ebkyVar.k) {
                    F();
                    return;
                } else {
                    if (ebkyVar.o) {
                        return;
                    }
                    ac(null);
                    return;
                }
            }
            int i5 = this.n;
            if (i5 == 2) {
                dhja.d(dgwe.f, "Session has been rejected by user", new Object[0]);
                ebqr ebqrVar = ebkyVar.i;
                ebqrVar.getClass();
                aq(ebqrVar, ebkyVar.d, 12);
                h(5);
                i(30);
                F();
                return;
            }
            if (i5 == 0) {
                ebqr ebqrVar2 = ebkyVar.i;
                ebqrVar2.getClass();
                String str = ebkyVar.d;
                try {
                    dhja.l(dgwe.f, "Send 408 Timeout", new Object[0]);
                    super.ad(this.A.p(ebqrVar2, str, 408, 7));
                } catch (Exception e2) {
                    dhja.j(e2, dgwe.f, "Can't send 408 Timeout", new Object[0]);
                }
                h(1);
                i(1);
                H(408, "Session has been rejected on timeout");
                return;
            }
            if (i5 == 3) {
                h(1);
                i(66);
                dhip dhipVar = dgwe.f;
                dhja.d(dhipVar, "Session has been canceled by remote user", new Object[0]);
                ebky ebkyVar2 = this.l;
                ebqr ebqrVar3 = ebkyVar2.i;
                ebqrVar3.getClass();
                String str2 = ebkyVar2.d;
                try {
                    dhja.l(dhipVar, "Send 487 Request terminated", new Object[0]);
                    super.ad(this.A.p(ebqrVar3, str2, 487, 13));
                } catch (Exception e3) {
                    dhja.j(e3, dgwe.f, "Can't send 487 Request Terminated response", new Object[0]);
                }
                Iterator it = ((dgwe) this).g.iterator();
                while (it.hasNext()) {
                    try {
                        ((dgwh) it.next()).f();
                    } catch (Exception e4) {
                        dhja.j(e4, dgwe.f, "handleSessionAbortedByRemote: Call to listener failed with error: ", new Object[0]);
                    }
                }
                return;
            }
            if (i5 == 4) {
                ebky ebkyVar3 = this.l;
                ebqr ebqrVar4 = ebkyVar3.i;
                ebqrVar4.getClass();
                ar(ebqrVar4, ebkyVar3.d, 16);
                h(2);
                i(24);
                H(488, "Session invitation was not acceptable");
                return;
            }
            if (i5 == 4) {
                dhja.d(dgwe.f, "Session invitation was not acceptable", new Object[0]);
                ebky ebkyVar4 = this.l;
                ebqr ebqrVar5 = ebkyVar4.i;
                ebqrVar5.getClass();
                ar(ebqrVar5, ebkyVar4.d, 17);
                h(2);
                i(24);
                H(488, "Not acceptable here");
                return;
            }
            if (i5 == 8) {
                dhip dhipVar2 = dgwe.f;
                dhja.d(dhipVar2, "Session has been declined by user", new Object[0]);
                ebky ebkyVar5 = this.l;
                ebqr ebqrVar6 = ebkyVar5.i;
                ebqrVar6.getClass();
                String str3 = ebkyVar5.d;
                try {
                    dhja.l(dhipVar2, "Send 603 Decline", new Object[0]);
                    super.ad(this.A.p(ebqrVar6, str3, 603, 20));
                } catch (Exception e5) {
                    dhja.j(e5, dgwe.f, "Can't send 603 Decline response", new Object[0]);
                }
                h(5);
                i(30);
                F();
                return;
            }
            if (i5 == 9) {
                ebky ebkyVar6 = this.l;
                ebqr ebqrVar7 = ebkyVar6.i;
                ebqrVar7.getClass();
                aq(ebqrVar7, ebkyVar6.d, 10);
                h(5);
                i(30);
                H(486, "Session from blocked user is declined");
                return;
            }
            if (i5 == 10) {
                dhip dhipVar3 = dgwe.f;
                dhja.d(dhipVar3, "Session has been rejected by user; business info retrieval encountered a server error", new Object[0]);
                h(7);
                i(59);
                ebky ebkyVar7 = this.l;
                ebqr ebqrVar8 = ebkyVar7.i;
                ebqrVar8.getClass();
                String str4 = ebkyVar7.d;
                int iA = eonc.a(((Long) dfnr.a().b.k.a()).longValue());
                try {
                    dhja.l(dhipVar3, "Sending 503 Service Unavailable", new Object[0]);
                    ebqs ebqsVarP = this.A.p(ebqrVar8, str4, 503, 19);
                    if (iA > 0) {
                        dhja.l(dhipVar3, "Add Retry-After header: %s", Integer.valueOf(iA));
                        ebqsVarP.s("Retry-After", String.valueOf(iA));
                    }
                    super.ad(ebqsVarP);
                    return;
                } catch (Exception e6) {
                    dhja.j(e6, dgwe.f, "Can't send 503 Service Unavailable", new Object[0]);
                    return;
                }
            }
            if (i5 == 11) {
                dhja.d(dgwe.f, "Session has been rejected by user; business info retrieval encountered a client error", new Object[0]);
                h(7);
                i(60);
                ebky ebkyVar8 = this.l;
                ebqr ebqrVar9 = ebkyVar8.i;
                ebqrVar9.getClass();
                as(ebqrVar9, ebkyVar8.d, 6);
                return;
            }
            if (i5 == 12) {
                dhip dhipVar4 = dgwe.f;
                dhja.d(dhipVar4, "Session has been rejected by user; business info retrieval encountered a client error", new Object[0]);
                h(7);
                i(70);
                ebqr ebqrVar10 = ebkyVar.i;
                ebqrVar10.getClass();
                String str5 = ebkyVar.d;
                try {
                    dhja.l(dhipVar4, "Send 606 Not Acceptable", new Object[0]);
                    super.ad(this.A.p(ebqrVar10, str5, 606, 22));
                    return;
                } catch (Exception e7) {
                    dhja.j(e7, dgwe.f, "Can't send 606 Not Acceptable response", new Object[0]);
                    return;
                }
            }
            return;
            dhja.j(e, dgwe.f, "Exception during service termination", new Object[0]);
            J();
            return;
        }
        if (this.d != 2) {
            super.ab();
        }
        h(5);
        i(29);
        J();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    @Override // defpackage.dgwe, defpackage.dgvh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void g(java.lang.Throwable r8) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgzn.g(java.lang.Throwable):void");
    }

    @Override // defpackage.dgwe, defpackage.dgvh
    public final String toString() {
        if (!this.E) {
            return super.toString();
        }
        return bn() + VCardBuilder.VCARD_END_OF_LINE + super.toString();
    }

    public dgzn(Context context, dgvq dgvqVar, fcsu fcsuVar, String str, ebja ebjaVar, dhgr dhgrVar, dfcg dfcgVar, dhjt dhjtVar, InstantMessageConfiguration instantMessageConfiguration, int i, deza dezaVar) {
        String str2;
        super(context, dgvqVar, fcsuVar, str, null, dfcgVar, dhjtVar);
        this.E = false;
        this.ac = dgwq.LEAVE_INVOLUNTARILY;
        this.K = new LinkedBlockingDeque();
        this.ad = new ConcurrentHashMap();
        this.O = dgyn.CONFERENCE_FACTORY_URI;
        this.P = new Object();
        this.ae = false;
        this.Q = true;
        this.af = Optional.empty();
        this.S = dgza.e;
        this.R = dhgrVar;
        dfyj dfyjVar = (dfyj) dgvqVar.a;
        dfyx dfyxVar = dfyjVar.b;
        if (dfyxVar != null && dfyxVar.n()) {
            str2 = dfyjVar.c().mWifiMediaTransport;
        } else {
            str2 = dfyjVar.c().mPsMediaTransport;
        }
        this.w = "MSRPoTLS".equals(str2);
        this.F = bt(context, dgvqVar.a, ebjaVar, bs(i));
        this.L = new dhjz(this.m);
        this.ag = instantMessageConfiguration;
        this.W = null;
        this.X = new dgyh(instantMessageConfiguration.mMessageTech, i);
    }

    @Override // defpackage.ebjc
    public final /* synthetic */ void aQ(ebjr ebjrVar, ebjn ebjnVar, ebjj ebjjVar) {
    }

    @Override // defpackage.ebjc
    public final /* synthetic */ void aR(ebjr ebjrVar, ebjn ebjnVar, ebjm ebjmVar) {
    }
}
