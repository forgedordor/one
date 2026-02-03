package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dexn implements dewo, dfia, dgin {
    static final dfny a = dfod.a(153260444);
    static final dfny b;
    static final dfny c;
    public static final dhip d;
    private final ebja A;
    private final dfcg B;
    private final dhjt C;
    private final dgzb D;
    private final dfhz E;
    private final dfhz F;
    private final dgzd G;
    protected final ConcurrentHashMap e = new ConcurrentHashMap();
    public final Map f = new HashMap();
    public final dfdv g;
    public final Context h;
    public final dgyu i;
    public final dhgr j;
    public final dhaa k;
    public final dgxb l;
    public final dfdd m;
    public final crmx n;
    final dfhz o;
    public final dgiu p;
    public final dfhy q;
    final dfhz r;
    final dfhz s;
    final dhab t;
    private final fcsu u;
    private final ChatSessionEngine v;
    private final dgzu w;
    private final dhjz x;
    private final diep y;
    private final deza z;

    static {
        dfod.a(141314033);
        b = dfod.a(157085528);
        c = dfod.a(179153382);
        dfod.a(162601747);
        d = new dhip("ImsChatSessionProvider");
    }

    public dexn(Context context, fcsu fcsuVar, dgzu dgzuVar, dgyu dgyuVar, dhgr dhgrVar, ChatSessionEngine chatSessionEngine, dgxb dgxbVar, dfdv dfdvVar, dfdd dfddVar, crmx crmxVar, ebja ebjaVar, dgiu dgiuVar, dfcg dfcgVar, dhjt dhjtVar, diep diepVar, deza dezaVar) {
        dexd dexdVar = new dexd(this);
        this.o = dexdVar;
        dfhy dfhyVar = new dfhy();
        this.q = dfhyVar;
        dexe dexeVar = new dexe(this);
        this.r = dexeVar;
        dexf dexfVar = new dexf(this);
        this.s = dexfVar;
        dexg dexgVar = new dexg(this);
        this.E = dexgVar;
        dexh dexhVar = new dexh(this);
        this.F = dexhVar;
        dexi dexiVar = new dexi(this);
        this.t = dexiVar;
        dexj dexjVar = new dexj();
        this.G = dexjVar;
        this.v = chatSessionEngine;
        this.h = context;
        this.u = fcsuVar;
        this.w = dgzuVar;
        this.i = dgyuVar;
        this.j = dhgrVar;
        this.g = dfdvVar;
        dhaa dhaaVar = new dhaa();
        this.k = dhaaVar;
        dhaaVar.b = dexiVar;
        dgzuVar.t(dexjVar);
        this.l = dgxbVar;
        this.m = dfddVar;
        this.n = crmxVar;
        this.x = new dhjz(crmxVar);
        this.A = ebjaVar;
        this.p = dgiuVar;
        this.B = dfcgVar;
        this.C = dhjtVar;
        this.D = dgzuVar.u;
        this.y = diepVar;
        this.z = dezaVar;
        dfhyVar.w("text/plain", dexdVar);
        dfhyVar.w(RbmSpecificMessage.CONTENT_TYPE, dexeVar);
        dfhyVar.w("application/im-iscomposing+xml", dexhVar);
        dfhyVar.w("application/vnd.gsma.botsuggestion.v1.0+json", dexfVar);
        dfhyVar.w("video/aliasing", dexgVar);
        dfhyVar.w(dfqb.c, dexgVar);
        dfhyVar.w("video/key-frame-request", dexgVar);
        dfhyVar.w(dfqb.e, dexgVar);
        dfhyVar.w(GroupManagementContentType.CONTENT_TYPE, new dfhx(dfdvVar));
    }

    private final Optional A() {
        return this.p.a().map(new dewp());
    }

    private final List B(String str) {
        ArrayList arrayList = new ArrayList(1);
        for (dgzn dgznVar : this.e.values()) {
            if (!dgznVar.E && dhjv.A(dgznVar.y(), str)) {
                arrayList.add(dgznVar);
            }
        }
        return arrayList;
    }

    private final Map.Entry C(String str) {
        ArrayList<Map.Entry> arrayList = new ArrayList(1);
        for (Map.Entry entry : this.e.entrySet()) {
            dgzn dgznVar = (dgzn) entry.getValue();
            if (!dgznVar.E && dgznVar.z().equals(str)) {
                arrayList.add(entry);
            }
        }
        for (Map.Entry entry2 : arrayList) {
            dgzn dgznVar2 = (dgzn) entry2.getValue();
            if ((dgznVar2 instanceof dhat) || (dgznVar2 instanceof dham)) {
                return entry2;
            }
        }
        return null;
    }

    private static void D(dgzn dgznVar) {
        dgznVar.j();
        dgznVar.aT(dgzl.USER_BLOCKED);
    }

    private final void E(dgzn dgznVar, dhat dhatVar) throws NumberFormatException {
        dhja.c("Follow up session one2one chat session, declining previous session: %s", dgznVar.k);
        long jM = m(dgznVar);
        this.e.put(Long.valueOf(jM), dhatVar);
        if (dgznVar instanceof dhat) {
            dhatVar.af.addAll(((dhat) dgznVar).af);
        }
        dhatVar.aF(new dexm(this, dhatVar, jM));
        dgznVar.af(2, 57);
        if (!((Boolean) b.a()).booleanValue()) {
            String strZ = dhatVar.z();
            if (dfcq.a(this.h, strZ)) {
                dhja.c("Follow up One2One chat session will be rejected because contact is blocked. UserId: %s", strZ);
                D(dhatVar);
                return;
            }
        }
        F(dhatVar, m(dhatVar));
        dhatVar.j();
        if (J(dhatVar)) {
            dhja.c("Automatically accepting chat session %s", dhatVar.k);
            dhatVar.C();
        }
    }

    private final void F(dhat dhatVar, long j) throws NumberFormatException {
        dgyx dgyxVar = dhatVar.N;
        dhja.c("Notifying message filters of initial message: %s", dgyxVar == null ? "null" : dgyxVar.k);
        try {
            this.q.a(dgyxVar, j, dhatVar.z());
        } catch (IOException e) {
            dhja.i(e, "Unable to notify message filters: %s", e.getMessage());
        }
    }

    private final void G(dhat dhatVar) throws NumberFormatException {
        dhja.c("Initial chat session...", new Object[0]);
        if (L(dhatVar)) {
            dhja.q("Received invalid group chat invitation, will decline session: %s", dhatVar.toString());
            dhatVar.j();
            dhatVar.an();
            return;
        }
        long jRegisterSession = this.v.registerSession((dewo) this);
        if (!((Boolean) b.a()).booleanValue()) {
            String strZ = dhatVar.z();
            if (!((dgzn) dhatVar).E && dfcq.a(this.h, strZ)) {
                dhja.c("New One2One chat session will be rejected because contact is blocked. %s", dhiz.USER_ID.c(strZ));
                D(dhatVar);
                return;
            }
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        Long lValueOf = Long.valueOf(jRegisterSession);
        concurrentHashMap.put(lValueOf, dhatVar);
        dhatVar.aF(new dexm(this, dhatVar, jRegisterSession));
        if (((dgzn) dhatVar).E) {
            dhja.c("Register group session: %d", lValueOf);
            dhgr dhgrVar = this.j;
            Optional optionalA = dhgrVar.a(jRegisterSession);
            if (optionalA.isPresent()) {
                dhja.q("Group session with ID %d, already exists! Cannot register.", lValueOf);
            } else {
                String strW = dhatVar.w();
                String str = dhatVar.q;
                String str2 = ((dgzn) dhatVar).I;
                dhja.c("Registering group session %d, group ID %s, subject %s, conference URI %s", lValueOf, strW, dhiz.MESSAGE_CONTENT.c(str), dhiz.URI_SIP.c(str2));
                if (strW == null) {
                    dhja.g("Could not register group session. Invalid parameters.", new Object[0]);
                    optionalA = Optional.empty();
                } else {
                    Map map = dhgrVar.b;
                    synchronized (map) {
                        dhgp dhgpVar = (dhgp) map.get(lValueOf);
                        if (dhgpVar == null) {
                            dhja.c("Creating group session data.", new Object[0]);
                            dhgpVar = new dhgp(jRegisterSession, strW, str, str2);
                            map.put(lValueOf, dhgpVar);
                        }
                        try {
                            dhgrVar.d();
                        } catch (IOException unused) {
                            dhja.g("Error while storing group data", new Object[0]);
                        }
                        optionalA = Optional.of(dhgpVar);
                    }
                }
            }
            if (!optionalA.isPresent()) {
                dhja.g("Unable to register group session for an incoming conference invitation", new Object[0]);
            }
        }
        F(dhatVar, jRegisterSession);
        dhatVar.j();
        if (J(dhatVar)) {
            dhja.c("Automatically accepting chat session %d", Long.valueOf(jRegisterSession));
            dhatVar.C();
        }
        if (((dgzn) dhatVar).E) {
            Bundle bundle = new Bundle();
            boolean z = ((dgzn) dhatVar).E;
            String strX = dhatVar.x();
            String strZ2 = dhatVar.z();
            bundle.putString(RcsIntents.EXTRA_USER_ID, strZ2);
            bundle.putString(RcsIntents.EXTRA_REMOTE_INSTANCE, strX);
            bundle.putBoolean(RcsIntents.EXTRA_IS_CONFERENCE, z);
            bundle.putLong("rcs.intent.extra.sessionid", jRegisterSession);
            bundle.putString(RcsIntents.EXTRA_SUBJECT, dhatVar.q);
            dfda dfdaVarH = this.m.h(strZ2);
            if (!Objects.isNull(dfdaVarH)) {
                dfhv.a(dfdaVarH.a, dfdaVarH.b, bundle);
            }
            List<String> listAE = dhatVar.aE();
            GroupInfo groupInfo = new GroupInfo();
            ArrayList arrayList = new ArrayList();
            for (String strSubstring : listAE) {
                int iIndexOf = strSubstring.indexOf(59);
                if (iIndexOf >= 0) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
                UserInfo userInfoP = p(strSubstring);
                if (!arrayList.contains(userInfoP)) {
                    arrayList.add(userInfoP);
                }
            }
            groupInfo.b = arrayList;
            groupInfo.a = dhatVar.q;
            groupInfo.a(dhatVar.w());
            groupInfo.d = ((dgzn) dhatVar).I;
            bundle.putParcelable(RcsIntents.EXTRA_GROUP_INFO, groupInfo);
            String str3 = ((dgzn) dhatVar).H;
            if (str3 != null) {
                bundle.putString(RcsIntents.EXTRA_REFERRER, str3);
            }
            dhjm.c(this.h, RcsIntents.ACTION_INCOMING_GROUP_CHAT, bundle, dhjl.IMS_CHAT_SESSION_PROVIDER);
        }
    }

    private final void H(dgzn dgznVar) {
        dgznVar.Q = ((Boolean) this.p.a().map(new Function() { // from class: dexb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dhip dhipVar = dexn.d;
                return Boolean.valueOf(((dgiq) obj).r().mGeoLocPushAuth);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    private static void I(dgyx dgyxVar, String str, String str2, byte[] bArr) {
        dgyxVar.n = "Type: " + str2 + "\r\nRCS message ID: " + str + "\r\nContent length: " + (bArr == null ? "0" : Integer.valueOf(bArr.length)).toString();
    }

    private final boolean J(dgzn dgznVar) {
        Optional map = this.p.a().map(new dewp());
        if (!((Boolean) c.a()).booleanValue() || !map.isEmpty()) {
            return dgznVar.E ? ((InstantMessageConfiguration) map.get()).mAutoAcceptGroupChat : ((InstantMessageConfiguration) map.get()).mAutoAccept;
        }
        dhja.q("Unable to check if auto accept is required from Configuration", new Object[0]);
        return true;
    }

    private final boolean K() {
        return ((Boolean) this.p.a().map(new Function() { // from class: dewt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dhip dhipVar = dexn.d;
                InstantMessageConfiguration instantMessageConfigurationO = ((dgiq) obj).o();
                ebkr ebkrVar = dhjv.a;
                return Boolean.valueOf(instantMessageConfigurationO.a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    private final boolean L(dhat dhatVar) {
        if (!((dgzn) dhatVar).E) {
            return false;
        }
        if (!TextUtils.isEmpty(dhatVar.w())) {
            return dhatVar.aE().isEmpty();
        }
        dhja.g("Group invitation does not contain a %s", true != K() ? "Contribution-ID" : "Conversation-ID");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String[] M(dhgp dhgpVar) {
        if (!dhgpVar.b.isPresent()) {
            dhja.q("No ConferenceInfo available for session %d", Long.valueOf(dhgpVar.a));
            return new String[0];
        }
        dhja.c("Creating participant list from GroupSessionData", new Object[0]);
        Object obj = dhgpVar.b.get();
        ArrayList arrayList = new ArrayList();
        dfak dfakVar = ((dezn) obj).d;
        if (dfakVar != null) {
            int size = dfakVar.size();
            for (int i = 0; i < size; i++) {
                dfaj dfajVar = (dfaj) dfakVar.get(i);
                if (!dfajVar.i && dfajVar.g()) {
                    arrayList.add(dfajVar.g);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String r(dgyx dgyxVar) {
        String str = dgyxVar.k;
        if (str != null) {
            return str;
        }
        dhja.c("Message ID was null, generating a new one!", new Object[0]);
        return dhil.a().f();
    }

    private final ChatSessionServiceResult z(long j, String str, dgyx dgyxVar) {
        int i;
        long j2;
        dhja.c("startSession with instant message %s", dgyxVar);
        dgzu dgzuVar = this.w;
        if (!dgzuVar.l()) {
            dhja.c("Not registered!", new Object[0]);
            return new ChatSessionServiceResult(j, 4, "Not registered to RCS");
        }
        Optional optionalA = A();
        if (optionalA.isEmpty()) {
            dhja.k("instantMessageConfiguration is not present", new Object[0]);
            return new ChatSessionServiceResult(j, 2, "Not configured");
        }
        try {
            try {
                try {
                    try {
                        i = 0;
                        try {
                            dham dhamVar = new dham(this.h, dgzuVar, this.u, str, this.A, this.j, this.B, this.C, (InstantMessageConfiguration) optionalA.get(), 1, this.z);
                            H(dhamVar);
                            String str2 = dgyxVar.k;
                            dhamVar.N = dgyxVar;
                            boolean zC = dhim.c(str);
                            dhja.k("Starting session for: %s", zC ? dhiz.USER_ID_BOT.c(str) : dhiz.USER_ID.c(str));
                            if (zC) {
                                dhamVar.bl();
                            }
                            dhamVar.aF(new dexm(this, dhamVar, j));
                            this.e.put(Long.valueOf(j), dhamVar);
                            dhamVar.j();
                            return new ChatSessionServiceResult(j, str2, 0);
                        } catch (ebjd e) {
                            e = e;
                            j2 = j;
                            dhja.i(e, "MsrpException while creating OriginatingChatSession", new Object[i]);
                            return new ChatSessionServiceResult(j2, 17, e.getMessage());
                        }
                    } catch (ebjd e2) {
                        e = e2;
                        j2 = j;
                        i = 0;
                    }
                } catch (ebjd e3) {
                    e = e3;
                    j2 = j;
                    i = 0;
                }
            } catch (ebjd e4) {
                e = e4;
                j2 = j;
                i = 0;
            }
        } catch (ebjd e5) {
            e = e5;
            i = 0;
            j2 = j;
        }
    }

    @Override // defpackage.dewo
    public final long a(String str) {
        if (C(str) == null) {
            return this.v.registerSession((dewo) this);
        }
        return -1L;
    }

    @Override // defpackage.dewo
    public final ChatSessionServiceResult b(long j) {
        boolean zContainsKey;
        ConcurrentHashMap concurrentHashMap = this.e;
        Long lValueOf = Long.valueOf(j);
        dgzn dgznVar = (dgzn) concurrentHashMap.get(lValueOf);
        int i = 0;
        dhja.c("Ending chat session ...", new Object[0]);
        if (dgznVar == null) {
            Map map = this.j.b;
            synchronized (map) {
                zContainsKey = map.containsKey(lValueOf);
            }
            if (!zContainsKey) {
                i = 9;
            }
        } else {
            if (dgznVar.E) {
                dgznVar.bb(dgwq.DISCONNECT);
            } else {
                dgznVar.bb(dgwq.LEAVE);
            }
            if (dgznVar.p) {
                dgznVar.l();
            } else {
                dgznVar.af(5, 29);
            }
        }
        return new ChatSessionServiceResult(j, i);
    }

    @Override // defpackage.dewo
    public final ChatSessionServiceResult c(long j) {
        if (!this.w.l()) {
            dhja.c("Not registered!", new Object[0]);
            return new ChatSessionServiceResult(j, 4, "Not registered to RCS");
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        Long lValueOf = Long.valueOf(j);
        dgzn dgznVar = (dgzn) concurrentHashMap.get(lValueOf);
        if (dgznVar != null) {
            dgznVar.C();
            return new ChatSessionServiceResult(j, 0);
        }
        Optional optionalA = this.j.a(j);
        if (!optionalA.isEmpty()) {
            return (ChatSessionServiceResult) n(dgyn.CONFERENCE_URI, (dhgp) optionalA.get()).first;
        }
        dhja.c("Session %d not found!", lValueOf);
        return new ChatSessionServiceResult(j, 9);
    }

    @Override // defpackage.dewo
    public final ChatSessionServiceResult d(long j, String str, String str2, byte[] bArr) {
        eyga eygaVar = eyga.a;
        Long lValueOf = Long.valueOf(j);
        dhja.c("sendMessage {Session: %d, Message Id: %s", lValueOf, str);
        dgzu dgzuVar = this.w;
        if (!dgzuVar.l()) {
            dhja.c("Not registered!", new Object[0]);
            return new ChatSessionServiceResult(j, 4, "Not registered to RCS");
        }
        dgzn dgznVar = (dgzn) this.e.get(lValueOf);
        if (dgznVar == null) {
            dhja.c("session is not found. Reconnecting... Session: %d, Message Id: %s", lValueOf, str);
            return y(j, str, str2, bArr, eygaVar);
        }
        if (dgznVar.bg() && !(dgznVar instanceof dhaq)) {
            dhja.c("Sending message along existing session: %d [Session ID: %s]", lValueOf, dgznVar.k);
            try {
                dgyx dgyxVarA = dexp.a(dgznVar, str, str2, bArr, eygaVar);
                I(dgyxVarA, str, str2, bArr);
                dgznVar.aV(dgyxVarA);
                dhja.c("Successfully queued message!", new Object[0]);
                return new ChatSessionServiceResult(j, str, 0);
            } catch (dgzc e) {
                dhja.i(e, "Error while sending message: %s", e.getMessage());
                return new ChatSessionServiceResult(j, str, 1);
            }
        }
        if (dgznVar.a == dgws.STOPPED) {
            dhja.q("Cleaning up unexpected stale session %d in state STOPPED:\n%s", lValueOf, dgznVar.B());
            dgzuVar.i(dgznVar);
        }
        if (dgznVar.E) {
            return y(j, str, str2, bArr, eygaVar);
        }
        dhja.c("Sending message along new created session - session not established: %d", lValueOf);
        String strZ = dgznVar.z();
        dgzuVar.a();
        dgyx dgyxVarC = dexp.c(str, str2, bArr, eygaVar, K());
        I(dgyxVarC, str, str2, bArr);
        return z(j, strZ, dgyxVarC);
    }

    @Override // defpackage.dewo
    public final ChatSessionServiceResult e(String str, byte[] bArr, String str2, String str3) {
        return f(str, -1L, bArr, str2, str3);
    }

    @Override // defpackage.dewo
    public final ChatSessionServiceResult f(String str, long j, byte[] bArr, String str2, String str3) {
        eyga eygaVar = eyga.a;
        dhja.c("Send message with content type %s to %s, message ID is %s", str2, dhiz.USER_ID.c(str), str3);
        Map.Entry entryC = C(str);
        if (entryC != null) {
            dhja.c("Sending message via session %s", ((Long) entryC.getKey()).toString());
            return d(((Long) entryC.getKey()).longValue(), str3, str2, bArr);
        }
        dhja.c("Creating new session to send message", new Object[0]);
        dgzu dgzuVar = this.w;
        dgzuVar.s(str);
        if (j == -1) {
            j = this.v.registerSession((dewo) this);
        }
        dgzuVar.a();
        dgyx dgyxVarC = dexp.c(str3, str2, bArr, eygaVar, K());
        I(dgyxVarC, str3, str2, bArr);
        return z(j, str, dgyxVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dewo
    public final GroupInfo g(long j) {
        dfak dfakVar;
        Optional optionalQ = q(j);
        if (optionalQ.isEmpty()) {
            return null;
        }
        dhja.c("Creating group info from group session data for session %d", Long.valueOf(((dhgp) optionalQ.get()).a));
        dhgp dhgpVar = (dhgp) optionalQ.get();
        final GroupInfo groupInfo = new GroupInfo();
        groupInfo.a = (String) dhgpVar.f.orElse(null);
        groupInfo.a(dhgpVar.d);
        dhgpVar.e.ifPresent(new Consumer() { // from class: dewu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                groupInfo.d = (String) obj;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional optional = dhgpVar.b;
        if (!optional.isEmpty() && (dfakVar = ((dezn) optional.get()).d) != null && dfakVar.size() != 0) {
            int size = dfakVar.size();
            for (int i = 0; i < size; i++) {
                dfaj dfajVar = (dfaj) dfakVar.get(i);
                if (dfajVar.g()) {
                    UserInfo userInfoO = o(dfajVar);
                    int iIndexOf = groupInfo.b.indexOf(userInfoO);
                    if (iIndexOf < 0) {
                        groupInfo.b.add(userInfoO);
                    } else {
                        dhja.c("Replacing user in group info: %s", userInfoO.a);
                        groupInfo.b.set(iIndexOf, userInfoO);
                    }
                }
            }
        }
        return groupInfo;
    }

    @Override // defpackage.dewo
    public final String h(long j) {
        dgzn dgznVar = (dgzn) this.e.get(Long.valueOf(j));
        if (dgznVar != null && !dgznVar.E) {
            return dgznVar.o;
        }
        String str = (String) this.j.a(j).map(new Function() { // from class: dexc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dhip dhipVar = dexn.d;
                return ((dhgp) obj).e;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: dewq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dhip dhipVar = dexn.d;
                return (String) ((Optional) obj).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        if (Objects.isNull(str)) {
            return null;
        }
        return this.x.a(str);
    }

    @Override // defpackage.dewo
    public final boolean i() {
        return this.w.l();
    }

    @Override // defpackage.dewo
    public final long[] j() {
        return dhic.b(this.e.keySet());
    }

    @Override // defpackage.dewo
    public final String[] k(long j) {
        dgzn dgznVar = (dgzn) this.e.get(Long.valueOf(j));
        if (dgznVar == null || !dgznVar.E) {
            return new String[0];
        }
        dhjz dhjzVar = this.x;
        List listAE = dgznVar.aE();
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = listAE.iterator();
        while (it.hasNext()) {
            ekfwVar.h(dhjzVar.a((String) it.next()));
        }
        return (String[]) ekfwVar.g().toArray(new String[0]);
    }

    @Override // defpackage.dewo
    public final ChatSessionServiceResult l(long j) {
        if (this.w.l()) {
            return new ChatSessionServiceResult(j, 1, "Not implemented");
        }
        dhja.c("Not registered!", new Object[0]);
        return new ChatSessionServiceResult(j, 4, "Not registered to RCS");
    }

    public final long m(dgzn dgznVar) {
        for (Map.Entry entry : this.e.entrySet()) {
            if (entry.getValue() == dgznVar) {
                return ((Long) entry.getKey()).longValue();
            }
        }
        return 0L;
    }

    final Pair n(dgyn dgynVar, dhgp dhgpVar) {
        long j;
        String[] strArrM;
        dgyn dgynVar2;
        dham dhamVar;
        int i = 0;
        dhja.c("Reconnecting with method %s to %s", dgynVar, dhgpVar);
        dgyn dgynVar3 = dgyn.CONFERENCE_FACTORY_URI;
        if (dgynVar == dgynVar3) {
            dhja.q("Unable to reconnect using method %s", dgynVar.toString());
            return Pair.create(new ChatSessionServiceResult(12), null);
        }
        Optional optionalA = A();
        if (optionalA.isEmpty()) {
            dhja.k("instantMessageConfiguration is not present", new Object[0]);
            return Pair.create(new ChatSessionServiceResult(2), null);
        }
        try {
            j = dhgpVar.a;
            strArrM = M(dhgpVar);
            dgynVar2 = dgyn.CONFERENCE_URI;
        } catch (Exception e) {
            e = e;
            i = 0;
        }
        try {
            if (dgynVar == dgynVar2) {
                Context context = this.h;
                dgzu dgzuVar = this.w;
                fcsu fcsuVar = this.u;
                ebja ebjaVar = this.A;
                dhgr dhgrVar = this.j;
                dfcg dfcgVar = this.B;
                dhjt dhjtVar = this.C;
                InstantMessageConfiguration instantMessageConfiguration = (InstantMessageConfiguration) optionalA.get();
                deza dezaVar = this.z;
                int i2 = dham.Z;
                dhja.c("Creating a chat conference session as originating, reconnecting via conference URI", new Object[0]);
                String str = (String) dhgpVar.e.orElse(null);
                if (ejwk.c(str)) {
                    throw new ebmn("ConferenceUri is empty.");
                }
                dhamVar = new dham(context, dgzuVar, fcsuVar, str, ebjaVar, dhgrVar, dfcgVar, dhjtVar, instantMessageConfiguration, 1, dezaVar);
                dhamVar.bn(dhgpVar, strArrM);
                ((dgzn) dhamVar).I = str;
                dhamVar.Y = true;
                dhamVar.O = dgynVar2;
                H(dhamVar);
            } else {
                dgyn dgynVar4 = dgyn.GROUP_ID;
                if (dgynVar != dgynVar4) {
                    dhja.g("Unknown reconnect method %s", dgynVar.toString());
                    return Pair.create(new ChatSessionServiceResult(j, 1), null);
                }
                if (strArrM.length == 0) {
                    dhja.q("No participants in group.", new Object[0]);
                    return Pair.create(new ChatSessionServiceResult(107), null);
                }
                Context context2 = this.h;
                dgzu dgzuVar2 = this.w;
                fcsu fcsuVar2 = this.u;
                ebja ebjaVar2 = this.A;
                dhgr dhgrVar2 = this.j;
                dfcg dfcgVar2 = this.B;
                dhjt dhjtVar2 = this.C;
                InstantMessageConfiguration instantMessageConfiguration2 = (InstantMessageConfiguration) optionalA.get();
                deza dezaVar2 = this.z;
                int i3 = dham.Z;
                dhja.c("Creating a chat conference session as originating, reconnecting via Group-ID: %s", dhgpVar.d);
                dhja.c("Creating a new chat conference session as originating", new Object[0]);
                dham dhamVar2 = new dham(context2, dgzuVar2, fcsuVar2, dgzuVar2.a.d().mConferenceFactoryUri, ebjaVar2, dhgrVar2, dfcgVar2, dhjtVar2, instantMessageConfiguration2, 1, dezaVar2);
                dhamVar2.bm();
                dhamVar2.ba(strArrM);
                dhamVar2.O = dgynVar3;
                dhamVar2.bn(dhgpVar, strArrM);
                dhamVar2.O = dgynVar4;
                H(dhamVar2);
                dhamVar = dhamVar2;
            }
            dhamVar.aF(new dexm(this, dhamVar, j));
            this.e.put(Long.valueOf(j), dhamVar);
            dhamVar.j();
            dhja.k("Successfully reconnected to conference.", new Object[0]);
            return Pair.create(new ChatSessionServiceResult(j, 0), dhamVar);
        } catch (Exception e2) {
            e = e2;
            dhja.i(e, "Unable to reconnect to conference!", new Object[i]);
            return Pair.create(new ChatSessionServiceResult(1), null);
        }
    }

    public final UserInfo o(dfaj dfajVar) {
        UserInfo userInfo = new UserInfo(this.x.a(dfajVar.g));
        userInfo.b = dfajVar.a;
        userInfo.a(dfajVar.g);
        userInfo.d = dfajVar.i;
        userInfo.e = dfajVar.j;
        userInfo.c = dfajVar.a().l;
        return userInfo;
    }

    public final UserInfo p(String str) {
        dhjz dhjzVar = this.x;
        String strA = dhjzVar.a(str);
        UserInfo userInfo = new UserInfo(strA);
        userInfo.b = null;
        userInfo.a(str);
        String strA2 = dhjzVar.a(this.w.r());
        if (!TextUtils.isEmpty(strA2) && !TextUtils.isEmpty(strA) && strA.equals(strA2)) {
            userInfo.d = true;
        }
        return userInfo;
    }

    public final Optional q(long j) {
        ConcurrentHashMap concurrentHashMap = this.e;
        Long lValueOf = Long.valueOf(j);
        dgzn dgznVar = (dgzn) concurrentHashMap.get(lValueOf);
        if (dgznVar != null && !dgznVar.E) {
            dhja.k("Session %d is a one-to-one session, not a group session.", lValueOf);
            return Optional.empty();
        }
        Optional optionalA = this.j.a(j);
        if (!optionalA.isEmpty()) {
            return optionalA;
        }
        dhja.q("Session %d not registered in ImsChatSessionProvider or ConferenceInformationStorage. It may not be a group session.", lValueOf);
        return Optional.empty();
    }

    public final void s(dgyx dgyxVar, long j, String str, dgzn dgznVar) {
        GroupInfo groupInfoG;
        dhja.k("Broadcasting new incoming chat message - remoteUserId:%s messageId:%s session:%d", dhiz.USER_ID.c(str), dgyxVar.k, Long.valueOf(j));
        boolean z = dgyxVar.p;
        boolean z2 = dgznVar.E;
        String str2 = dgyxVar.h;
        byte[] bArr = dgyxVar.f;
        String strR = r(dgyxVar);
        String strX = dgznVar.x();
        String strA = dgyxVar.a();
        long j2 = dgyxVar.j;
        Bundle bundle = new Bundle();
        bundle.putString(RcsIntents.EXTRA_USER_ID, str);
        bundle.putString(RcsIntents.EXTRA_REMOTE_INSTANCE, strX);
        bundle.putBoolean(RcsIntents.EXTRA_IS_SYSTEM_MESSAGE, z);
        bundle.putBoolean(RcsIntents.EXTRA_IS_CONFERENCE, z2);
        bundle.putString("rcs.intent.extra.contentType", str2);
        bundle.putByteArray(RcsIntents.EXTRA_CONTENT, bArr);
        bundle.putString(RcsIntents.EXTRA_TEXT, strA);
        bundle.putLong(RcsIntents.EXTRA_TIMESTAMP, j2);
        bundle.putLong("rcs.intent.extra.sessionid", j);
        basd.h(bundle, RcsIntents.EXTRA_MESSAGE_ID, basd.a(strR));
        bundle.putBoolean(RcsIntents.EXTRA_IS_BOT, dgznVar.J);
        if (dgyxVar.l > 0) {
            bundle.putInt(RcsIntents.EXTRA_SPAM_VERDICT, 1);
        }
        if (z2 && (groupInfoG = g(j)) != null && !groupInfoG.b()) {
            bundle.putParcelable(RcsIntents.EXTRA_GROUP_INFO, groupInfoG);
        }
        String str3 = dgyxVar.d;
        TextUtils.isEmpty(null);
        bundle.putString(RcsIntents.EXTRA_SIP_ALIAS, null);
        eyga eygaVar = dgyxVar.i;
        if (eygaVar != null) {
            bundle.putByteArray(RcsIntents.EXTRA_CUSTOM_HEADERS, eygaVar.toByteArray());
        }
        dfda dfdaVarH = this.m.h(str);
        if (!Objects.isNull(dfdaVarH)) {
            dfhv.a(dfdaVarH.a, dfdaVarH.b, bundle);
        }
        String str4 = dgyxVar.b;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString(RcsIntents.EXTRA_SELF_USER_ID, str4);
        }
        dhjm.c(this.h, RcsIntents.ACTION_INCOMING_CHAT_MESSAGE, bundle, dhjl.IMS_CHAT_SESSION_PROVIDER);
        if (dgznVar instanceof dhaq) {
            dhia.d("Bugle.RcsEngine.Chat.IncomingDeferredMessage");
        }
    }

    public final void t(dhaq dhaqVar) throws NumberFormatException {
        String strY = dhaqVar.y();
        dhja.c("Incoming deferred messaging session for %s", strY);
        for (dgzn dgznVar : B(strY)) {
            if (dgznVar instanceof dhaq) {
                dhaq dhaqVar2 = (dhaq) dgznVar;
                dhja.c("Follow up deferred messaging session, declining previous session: %s", dhaqVar2.k);
                long jM = m(dhaqVar2);
                this.e.put(Long.valueOf(jM), dhaqVar);
                dhaqVar.aF(new dexm(this, dhaqVar, jM));
                dhaqVar2.af(2, 57);
                String strZ = dhaqVar.z();
                if (!((Boolean) b.a()).booleanValue() && dfcq.a(this.h, strZ)) {
                    dhja.c("Follow up deferred One2One chat session will be rejected because contact is blocked. %s", dhiz.USER_ID.c(strZ));
                    D(dhaqVar);
                    dhaqVar.j();
                    dhaqVar.aT(dgzl.USER_BLOCKED);
                    return;
                }
                F(dhaqVar, m(dhaqVar));
                dhaqVar.j();
                if (dhaqVar.Y || J(dhaqVar)) {
                    dhaqVar.C();
                    return;
                }
                return;
            }
        }
        dhja.c("Initial deferred messaging session...", new Object[0]);
        long jRegisterSession = this.v.registerSession((dewo) this);
        if (!((Boolean) b.a()).booleanValue()) {
            String strZ2 = dhaqVar.z();
            if (dfcq.a(this.h, strZ2)) {
                dhja.c("New deferred chat session will be rejected because contact is blocked. UserId: %s", strZ2);
                D(dhaqVar);
                return;
            }
        }
        this.e.put(Long.valueOf(jRegisterSession), dhaqVar);
        F(dhaqVar, jRegisterSession);
        dhaqVar.j();
        dhaqVar.aF(new dexm(this, dhaqVar, jRegisterSession));
        if (dhaqVar.Y || J(dhaqVar)) {
            dhaqVar.C();
        }
    }

    public final void v(dhat dhatVar) throws NumberFormatException {
        Optional optionalEmpty;
        H(dhatVar);
        if (!((dgzn) dhatVar).E) {
            String strY = dhatVar.y();
            dhja.c("Incoming 1-1 invitation from %s", dhiz.USER_ID.c(strY));
            for (dgzn dgznVar : B(strY)) {
                if (dgznVar instanceof dhat) {
                    E(dgznVar, dhatVar);
                    return;
                }
                if (dgznVar instanceof dham) {
                    if (dgznVar.l.m) {
                        E(dgznVar, dhatVar);
                        return;
                    }
                    dhja.c("Parallel incoming session, rejecting", new Object[0]);
                    F(dhatVar, m((dham) dgznVar));
                    dhatVar.j();
                    dhatVar.af(2, 57);
                    return;
                }
            }
            G(dhatVar);
            return;
        }
        dhja.c("Incoming conference invitation with Group-ID: %s", dhatVar.w());
        if (!((Boolean) this.p.a().map(new Function() { // from class: dexa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dhip dhipVar = dexn.d;
                return Boolean.valueOf(((dgiq) obj).r().mGroupChatAuth);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            dhja.q("Group chat disabled. Rejecting session.", new Object[0]);
            dhatVar.j();
            dhatVar.aT(dgzl.SERVICE_DISABLED);
            return;
        }
        dhgr dhgrVar = this.j;
        String strW = dhatVar.w();
        Map map = dhgrVar.b;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    optionalEmpty = Optional.empty();
                    break;
                }
                dhgp dhgpVar = (dhgp) it.next();
                if (dhgpVar.d.equals(strW)) {
                    optionalEmpty = Optional.of(dhgpVar);
                    break;
                }
            }
        }
        if (!optionalEmpty.isPresent()) {
            G(dhatVar);
            return;
        }
        dhgp dhgpVar2 = (dhgp) optionalEmpty.get();
        dhja.c("Incoming conference reconnect for: %s", dhgpVar2.toString());
        long j = dhgpVar2.a;
        if (L(dhatVar)) {
            dhja.q("Received invalid group chat reconnect, will send 488 NOT ACCEPTABLE for session ID %d: %s", Long.valueOf(j), dhatVar.toString());
            dhatVar.j();
            dhatVar.aT(dgzl.INVALID_PARAMETERS);
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        Long lValueOf = Long.valueOf(j);
        dgzn dgznVar2 = (dgzn) concurrentHashMap.remove(lValueOf);
        if (dgznVar2 != null) {
            dgznVar2.ao();
        }
        dexm dexmVar = new dexm(this, dhatVar, j);
        concurrentHashMap.put(lValueOf, dhatVar);
        F(dhatVar, j);
        dhatVar.j();
        dhatVar.aF(dexmVar);
        dhatVar.C();
    }

    @Override // defpackage.dfia
    public final void w(String str, dfhz dfhzVar) {
        this.q.w(str, dfhzVar);
    }

    public final void x(long j, dgzn dgznVar, dgyx dgyxVar) {
        dhja.c("Sending message to group, session ID %d, message ID %s", Long.valueOf(j), dgyxVar.k);
        try {
            dgznVar.aV(dgyxVar);
        } catch (dgzc e) {
            dhja.i(e, "Unable to send message to group: %s", e.getMessage());
            String str = dgyxVar.k;
            dhja.c("Firing group message failed event for sessiond ID %d, message ID %s", Long.valueOf(j), str);
            if (TextUtils.isEmpty(str)) {
                dhja.q("Unable to fire group message failed event, no message ID", new Object[0]);
            } else {
                this.g.c(new ChatSessionMessageEvent(j, 53L, str, this.y.f().toEpochMilli(), 50031, null, true), dhjl.IMS_CHAT_SESSION_PROVIDER);
            }
        }
    }

    final ChatSessionServiceResult y(long j, String str, String str2, byte[] bArr, eyga eygaVar) {
        Optional optionalA = this.j.a(j);
        if (optionalA.isEmpty()) {
            dhja.g("Could not find data for group %d", Long.valueOf(j));
            return new ChatSessionServiceResult(j, String.valueOf(str), 9);
        }
        dhja.c("Reconnecting to chat conference id: %d, %s", Long.valueOf(j), optionalA);
        if (M((dhgp) optionalA.get()).length == 0) {
            dhja.q("No participants in group - will not send any message!", new Object[0]);
            return new ChatSessionServiceResult(j, 107);
        }
        Pair pairN = n((dgyn) ((dhgp) optionalA.get()).e.map(new Function() { // from class: dewr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dhip dhipVar = dexn.d;
                return dgyn.CONFERENCE_URI;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: dews
            @Override // java.util.function.Supplier
            public final Object get() {
                dhip dhipVar = dexn.d;
                dhja.q("Trying to connect to conference with null uri", new Object[0]);
                return dgyn.GROUP_ID;
            }
        }), (dhgp) optionalA.get());
        ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) pairN.first;
        dgzn dgznVar = (dgzn) pairN.second;
        if (Objects.isNull(dgznVar)) {
            dhja.q("Failed to reconnect to conference", new Object[0]);
            return new ChatSessionServiceResult(j, 1);
        }
        if (chatSessionServiceResult.succeeded()) {
            dgyx dgyxVarA = dexp.a(dgznVar, str, str2, bArr, eygaVar);
            I(dgyxVarA, str, str2, bArr);
            x(j, dgznVar, dgyxVarA);
        }
        return chatSessionServiceResult;
    }

    @Override // defpackage.dgin
    public final /* synthetic */ void u(dgiq dgiqVar) {
    }
}
