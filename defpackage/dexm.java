package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.ims.rcsservice.chatsession.ChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.chatsession.GroupChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.rcs.client.messaging.GroupMember;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dexm implements dgyy, dgwi {
    final /* synthetic */ dexn a;
    private final long b;
    private final dgzn c;

    public dexm(dexn dexnVar, dgzn dgznVar, long j) {
        this.a = dexnVar;
        this.c = dgznVar;
        this.b = j;
    }

    private final void A() {
        if (this.c.E) {
            long j = this.b;
            dhja.c("Unregistering group session %d", Long.valueOf(j));
            this.a.j.c(j);
        }
    }

    private final GroupChatSessionEvent B(long j, long j2) {
        dhbu dhbuVar = new dhbu(50003, j, j2);
        dexn dexnVar = this.a;
        long j3 = this.b;
        GroupInfo groupInfoG = dexnVar.g(j3);
        if (groupInfoG == null) {
            dhja.q("Null GroupInfo for group session. RCS session id: %s", Long.valueOf(j3));
        } else {
            dhbuVar.a(groupInfoG);
        }
        return new GroupChatSessionEvent(dhbuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final GroupChatSessionEvent C(int i, long j) throws IOException {
        Optional optionalOf;
        dhbu dhbuVar = new dhbu(i, j, 0L);
        dexn dexnVar = this.a;
        long j2 = this.b;
        GroupInfo groupInfoG = dexnVar.g(j2);
        if (groupInfoG == null) {
            dhja.q("Null GroupInfo for group session. RCS session id: %s", Long.valueOf(j2));
        } else {
            dhbuVar.a(groupInfoG);
        }
        if (((Boolean) dexn.a.a()).booleanValue()) {
            Optional optionalQ = dexnVar.q(j2);
            if (optionalQ.isEmpty()) {
                optionalOf = Optional.empty();
            } else {
                dhja.c("Creating group information from group session data for session %d", Long.valueOf(j2));
                dhgp dhgpVar = (dhgp) optionalQ.get();
                final efbz efbzVar = new efbz();
                efbzVar.a = dhgpVar.d;
                Optional optional = dhgpVar.f;
                dgzn dgznVar = this.c;
                efbzVar.c((String) optional.orElse(dgznVar.q));
                efbzVar.b((String) dhgpVar.e.orElse(dgznVar.I));
                ekhx ekhxVarAA = dgznVar.aA();
                efcc efccVar = new efcc();
                efccVar.b(ekhxVarAA.contains(GroupManagementContentType.CONTENT_TYPE));
                efbzVar.d = Optional.of(efccVar.a());
                Optional optional2 = dhgpVar.b;
                if (optional2.isEmpty()) {
                    optionalOf = Optional.of(efbzVar.a());
                } else {
                    ((dezn) optional2.get()).a.ifPresent(new Consumer() { // from class: dexl
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            Optional optional3 = ((dezi) obj).c;
                            final efed efedVar = efbzVar;
                            optional3.ifPresent(new Consumer() { // from class: dexk
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj2) {
                                    dfaf dfafVar = (dfaf) obj2;
                                    final efcw efcwVar = new efcw();
                                    try {
                                        efcwVar.a = Optional.of(effi.c(dfafVar.a));
                                    } catch (IllegalArgumentException unused) {
                                    }
                                    efed efedVar2 = efedVar;
                                    dfafVar.b.ifPresent(new Consumer() { // from class: effz
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj3) {
                                            ((efcw) efcwVar).b = Optional.of(Instant.ofEpochMilli(((dhie) obj3).a));
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    ((efbz) efedVar2).e = Optional.of(efcwVar.a());
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    dfak dfakVar = ((dezn) optional2.get()).d;
                    if (dfakVar == null || dfakVar.isEmpty()) {
                        optionalOf = Optional.of(efbzVar.a());
                    } else {
                        int size = dfakVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            dfaj dfajVar = (dfaj) dfakVar.get(i2);
                            if (dfajVar.g()) {
                                efeg efegVarE = GroupMember.e();
                                efca efcaVar = (efca) efegVarE;
                                efcaVar.a = effi.c(dfajVar.g);
                                efegVarE.b(TextUtils.isEmpty(dfajVar.a) ? dfajVar.g : dfajVar.a);
                                efegVarE.c(dfajVar.i);
                                Optional optionalFlatMap = dfajVar.b().flatMap(new Function() { // from class: dewz
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return ((dezv) obj).b;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                if (optionalFlatMap.isPresent()) {
                                    String str = ((dezx) optionalFlatMap.get()).d;
                                    if (!TextUtils.isEmpty(str)) {
                                        efcaVar.b = Optional.of(effi.c(str));
                                    }
                                }
                                GroupMember groupMemberA = efegVarE.a();
                                if (efbzVar.b == null) {
                                    if (efbzVar.c == null) {
                                        int i3 = ekgb.d;
                                        efbzVar.b = new ekfw();
                                    } else {
                                        int i4 = ekgb.d;
                                        efbzVar.b = new ekfw();
                                        efbzVar.b.j(efbzVar.c);
                                        efbzVar.c = null;
                                    }
                                }
                                efbzVar.b.h(groupMemberA);
                            }
                        }
                        optionalOf = Optional.of(efbzVar.a());
                    }
                }
            }
            if (optionalOf.isEmpty()) {
                dhja.q("Null GroupInformation for group session. RCS session id: %s", Long.valueOf(j2));
            } else {
                dhbuVar.i = Optional.of(optionalOf.get());
            }
        }
        return new GroupChatSessionEvent(dhbuVar);
    }

    private static final int D(int i) {
        if (i == 4) {
            return 12;
        }
        if (i == 5) {
            return 52;
        }
        if (i == 51) {
            return 56;
        }
        if (i == 408) {
            return 3;
        }
        if (i == 477 || i == 480) {
            return 2;
        }
        if (i == 486) {
            return 4;
        }
        if (i == 603) {
            return 3;
        }
        if (i == 403) {
            return 9;
        }
        if (i == 404) {
            return 1;
        }
        switch (i) {
            case 7:
                return 16;
            case 8:
                return 14;
            case 9:
                return 17;
            case 10:
                return 18;
            case 11:
                return 13;
            default:
                return i;
        }
    }

    private final void v(long j) {
        dexn dexnVar = this.a;
        ConcurrentHashMap concurrentHashMap = dexnVar.e;
        long j2 = this.b;
        dgzn dgznVar = (dgzn) concurrentHashMap.get(Long.valueOf(j2));
        if (dgznVar != this.c) {
            return;
        }
        y();
        if (!dgznVar.E) {
            dexnVar.g.c(new ChatSessionEvent(50005, j2, j), dhjl.IMS_CHAT_SESSION_PROVIDER);
            z();
        } else if (dgznVar.aw() != dgwq.DISCONNECT) {
            dexnVar.g.c(new GroupChatSessionEvent(new dhbu(50005, j2, 0L)), dhjl.IMS_CHAT_SESSION_PROVIDER);
        }
    }

    private final void w() {
        long j = this.b;
        Long lValueOf = Long.valueOf(j);
        dhja.c("Group chat has been terminated by the server and is no longer available! \n  Session ID: %d,\n  Group-ID: %s", lValueOf, this.c.w());
        y();
        A();
        dexn dexnVar = this.a;
        dexnVar.f.remove(lValueOf);
        dexnVar.g.c(new GroupChatSessionEvent(new dhbu(50005, j, 6L)), dhjl.IMS_CHAT_SESSION_PROVIDER);
    }

    private final void x(long j) {
        this.a.g.c(this.c.E ? B(this.b, j) : new ChatSessionEvent(50003, this.b, j), dhjl.IMS_CHAT_SESSION_PROVIDER);
    }

    private final void y() {
        long j = this.b;
        Long lValueOf = Long.valueOf(j);
        dhja.c("Releasing session %d", lValueOf);
        this.a.e.remove(lValueOf);
        this.c.aW(j, null);
    }

    private final void z() {
        dgxb dgxbVar;
        dgzn dgznVar = this.c;
        if (dgznVar.E || (dgxbVar = this.a.l) == null) {
            return;
        }
        dgxbVar.a(dgznVar.z());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    @Override // defpackage.dgzd
    public final void a(dgyx dgyxVar, int i) {
        ChatSessionMessageEvent chatSessionMessageEvent;
        ?? r3;
        if (dgyxVar != null) {
            dhja.g("message transfer failed for message %s, type %s", dgyxVar.k, dgyxVar.a.toString());
            dgyw dgywVar = dgyxVar.a;
            if (dgywVar == dgyw.IS_COMPOSING_INDICATOR || dgyxVar.k == null) {
                return;
            }
            if (dgywVar == dgyw.DISPOSITION_NOTIFICATION) {
                throw null;
            }
            long j = i;
            dgzn dgznVar = this.c;
            dgza dgzaVar = dgznVar.S;
            String str = dgyxVar.c;
            String strH = str == null ? this.a.h(this.b) : dhjv.k(str, this.a.n);
            boolean z = dgznVar.E;
            boolean z2 = z && dhjv.A(str, dgznVar.I);
            int i2 = dexp.a;
            String strX = dgznVar.x();
            String strF = dgyxVar.k;
            if (strF == null) {
                strF = dhil.a().f();
            }
            String str2 = strF;
            Duration duration = ((dgyg) dgzaVar).b;
            if ("message/cpim".equalsIgnoreCase(dgyxVar.h)) {
                try {
                    ebcp ebcpVarB = ebcp.b(dgyxVar.f);
                    chatSessionMessageEvent = new ChatSessionMessageEvent(50031, j, this.b, str2, z2, dgyxVar.j, strH, strX, ebcpVarB.e(), ebcpVarB.c, z, duration);
                    String strG = ebcpVarB.g("urn:ietf:params:imdn", "Disposition-Notification");
                    if (strG == null) {
                        r3 = 0;
                    } else {
                        boolean zContains = strG.contains("positive-delivery");
                        boolean z3 = zContains;
                        if (strG.contains("negative-delivery")) {
                            z3 = (zContains ? 1 : 0) | 2;
                        }
                        boolean z4 = z3;
                        if (strG.contains("display")) {
                            z4 = (z3 ? 1 : 0) | '\b';
                        }
                        r3 = z4;
                        if (strG.contains("processing")) {
                            r3 = (z4 ? 1 : 0) | 4;
                        }
                    }
                    dhja.c("Requested reports: %d", Integer.valueOf((int) r3));
                    chatSessionMessageEvent.e = r3;
                } catch (Exception e) {
                    dhja.i(e, "Error while reading message: %s", e.getMessage());
                    chatSessionMessageEvent = new ChatSessionMessageEvent(50031, j, this.b, str2, z2, dgyxVar.j, strH, strX, null, null, z, duration);
                }
            } else {
                chatSessionMessageEvent = new ChatSessionMessageEvent(50031, j, this.b, str2, z2, dgyxVar.j, strH, strX, dgyxVar.h, dgyxVar.f, z, duration);
            }
            chatSessionMessageEvent.b = dgyxVar.j;
            this.a.g.c(chatSessionMessageEvent, dhjl.IMS_CHAT_SESSION_PROVIDER);
        }
    }

    @Override // defpackage.dgzd
    public final void b(dgyx dgyxVar) {
        dhja.c("Message transferred successfully, ID %s, type %s", dgyxVar.k, dgyxVar.a.toString());
        dgzn dgznVar = this.c;
        boolean z = dgznVar.E;
        dgyw dgywVar = dgyxVar.a;
        if (dgywVar == dgyw.IS_COMPOSING_INDICATOR) {
            return;
        }
        if (dgywVar != dgyw.DISPOSITION_NOTIFICATION) {
            this.a.g.c(new ChatSessionMessageEvent(this.b, dgyxVar.k, dgyxVar.j, 50030, z ? dgznVar.I : dgznVar.o, z), dhjl.IMS_CHAT_SESSION_PROVIDER);
        } else {
            throw null;
        }
    }

    @Override // defpackage.dgzd
    public final void c(dgyx dgyxVar) {
        dexn dexnVar = this.a;
        dgzn dgznVar = this.c;
        String str = dgyxVar.c;
        String strK = str == null ? dgznVar.E ? dhjv.k(dgznVar.I, dexnVar.n) : dgznVar.o : dgznVar.E ? dhjv.k(str, dexnVar.n) : dgznVar.o;
        long j = this.b;
        if (strK == null) {
            dhja.g("Unable to retrieve sender userId for message %s, session %d", dgyxVar.toString(), Long.valueOf(j));
            return;
        }
        try {
            dexnVar.q.a(dgyxVar, j, strK);
        } catch (Exception e) {
            dhja.i(e, "Error while processing message: %s", dgyxVar);
        }
    }

    @Override // defpackage.dgyy
    public final void d() {
        dhja.c("Received conference NOTIFY. Notifying updated group state", new Object[0]);
        dhgr dhgrVar = this.a.j;
        long j = this.b;
        Optional optionalA = dhgrVar.a(j);
        if (optionalA.isPresent()) {
            Optional optional = ((dhgp) optionalA.get()).b;
            if (optional.isPresent() && ((dezn) optional.get()).a.isPresent() && ((dezi) ((dezn) optional.get()).a.get()).b.isPresent()) {
                Object obj = ((dezi) ((dezn) optional.get()).a.get()).b.get();
                this.c.q = (String) obj;
                Map map = dhgrVar.b;
                synchronized (map) {
                    Long lValueOf = Long.valueOf(j);
                    dhja.c("Updating subject for session %d to %s", lValueOf, dhiz.MESSAGE_CONTENT.c(obj));
                    dhgp dhgpVar = (dhgp) map.get(lValueOf);
                    if (dhgpVar == null) {
                        dhja.g("No group found for ID %d. Cannot update subject.", lValueOf);
                    } else {
                        dhgpVar.f = Optional.of(obj);
                        try {
                            dhgrVar.d();
                        } catch (IOException e) {
                            dhja.i(e, "Error while saving groups: %s", e.getMessage());
                        }
                    }
                }
            }
        }
        this.a.g.c(C(50046, this.b), dhjl.IMS_CHAT_SESSION_PROVIDER);
    }

    @Override // defpackage.dgwh
    public final void e() {
        dgzn dgznVar = (dgzn) this.a.e.get(Long.valueOf(this.b));
        if (dgznVar != this.c) {
            return;
        }
        y();
        if (dgznVar.p) {
            x(5L);
        } else {
            x(4L);
        }
    }

    @Override // defpackage.dgwh
    public final void f() {
        dgzn dgznVar = (dgzn) this.a.e.get(Long.valueOf(this.b));
        if (dgznVar != this.c) {
            return;
        }
        y();
        if (dgznVar.p) {
            x(4L);
        } else {
            x(5L);
        }
    }

    @Override // defpackage.dgwh
    public final void g(dhfu dhfuVar) {
        dhja.k("Session start failed with exception: %d for session %d", Integer.valueOf(dhfuVar.a), Long.valueOf(this.b));
        y();
        x(D(r5));
    }

    @Override // defpackage.dgwh
    public final void h(int i, String str) {
        Integer numValueOf = Integer.valueOf(i);
        long j = this.b;
        Long lValueOf = Long.valueOf(j);
        dhja.k("Session start failed: %d %s for session %d", numValueOf, str, lValueOf);
        dexn dexnVar = this.a;
        dgzn dgznVar = (dgzn) dexnVar.e.get(lValueOf);
        dgzn dgznVar2 = this.c;
        if (dgznVar != dgznVar2) {
            return;
        }
        y();
        if (!dgznVar.E) {
            int iD = D(i);
            z();
            dexnVar.g.c(new ChatSessionEvent(50003, j, iD), dhjl.IMS_CHAT_SESSION_PROVIDER);
            return;
        }
        dgyn dgynVar = dgznVar2.O;
        dhja.g("Group session start failed with connecting method %s", dgynVar.toString());
        if (i == 488) {
            w();
            return;
        }
        if (dgynVar == dgyn.CONFERENCE_FACTORY_URI) {
            A();
        }
        if (i == 404) {
            if (dgynVar == dgyn.CONFERENCE_URI) {
                Optional optionalA = dexnVar.j.a(j);
                if (optionalA.isEmpty()) {
                    dhja.q("Unable to reconnect to conference without valid group session data!", new Object[0]);
                    return;
                }
                Pair pairN = dexnVar.n(dgyn.GROUP_ID, (dhgp) optionalA.get());
                dgzn dgznVar3 = (dgzn) pairN.second;
                if (((ChatSessionServiceResult) pairN.first).succeeded() && !Objects.isNull(dgznVar3)) {
                    dhja.c("Transferring queued messages from %s to %s", dgznVar.toString(), dgznVar3.toString());
                    LinkedBlockingDeque linkedBlockingDeque = dgznVar.K;
                    if (!linkedBlockingDeque.isEmpty()) {
                        ArrayList arrayList = new ArrayList(linkedBlockingDeque.size());
                        linkedBlockingDeque.drainTo(arrayList);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            dexnVar.x(j, dgznVar3, (dgyx) it.next());
                        }
                    }
                }
            }
            i = 404;
        }
        dexnVar.f.remove(Long.valueOf(j));
        dexnVar.g.c(B(j, D(i)), dhjl.IMS_CHAT_SESSION_PROVIDER);
    }

    @Override // defpackage.dgwh
    public final void i() {
        dgzn dgznVar = this.c;
        if (dgznVar.E) {
            dexn dexnVar = this.a;
            long j = this.b;
            dhgr dhgrVar = dexnVar.j;
            Optional optionalA = dhgrVar.a(j);
            if (optionalA.isPresent()) {
                Long lValueOf = Long.valueOf(j);
                dhja.c("Subscribe to group session: %d", lValueOf);
                String str = dgznVar.I;
                if (str == null) {
                    dhja.g("No conference uri. Cannot subscribe.", new Object[0]);
                } else {
                    Map map = dhgrVar.b;
                    synchronized (map) {
                        dhja.c("Updating conference URI for session %d to %s", lValueOf, str);
                        dhgp dhgpVar = (dhgp) map.get(lValueOf);
                        if (dhgpVar == null) {
                            dhja.g("No group found for ID %d. Cannot update conference URI.", lValueOf);
                        } else {
                            dhgpVar.e = Optional.of(str);
                            try {
                                dhgrVar.d();
                            } catch (IOException e) {
                                dhja.i(e, "Error while saving groups: %s", e.getMessage());
                            }
                        }
                    }
                    dexn dexnVar2 = this.a;
                    long j2 = this.b;
                    dexnVar2.i.p(j2);
                    this.c.aW(j2, (dgwm) ((dhgp) optionalA.get()).c.orElse(null));
                }
            } else {
                dhja.g("Group not known. Cannot subscribe to session: %s", Long.valueOf(this.b));
            }
        }
        Event eventC = this.c.E ? C(50002, this.b) : new ChatSessionEvent(50002, this.b, 0L);
        dexn dexnVar3 = this.a;
        dexnVar3.g.c(eventC, dhjl.IMS_CHAT_SESSION_PROVIDER);
        dexo dexoVar = (dexo) dexnVar3.f.remove(Long.valueOf(this.b));
        if (dexoVar != null) {
            dhja.c("Performing session started action: %s", dexoVar.toString());
            try {
                dexoVar.a();
            } catch (Exception e2) {
                dhja.s(e2, "Unable to execute session started action %s", dexoVar.toString());
            }
        }
    }

    @Override // defpackage.dgwh
    public final void j() {
        dhja.c("Session %d starting", Long.valueOf(this.b));
    }

    @Override // defpackage.dgwh
    public final void k() {
        v(0L);
    }

    @Override // defpackage.dgwh
    public final void l(dhfu dhfuVar) {
        v(dhfuVar.a);
    }

    @Override // defpackage.dgwh
    public final void m() {
        dexn dexnVar = this.a;
        ConcurrentHashMap concurrentHashMap = dexnVar.e;
        long j = this.b;
        dgzn dgznVar = (dgzn) concurrentHashMap.get(Long.valueOf(j));
        dgzn dgznVar2 = this.c;
        if (dgznVar != dgznVar2) {
            return;
        }
        y();
        if (dgznVar2.E) {
            if (dgznVar2.aw() == dgwq.GONE) {
                w();
            }
        } else {
            dexnVar.g.c(new ChatSessionEvent(50005, j, 0L), dhjl.IMS_CHAT_SESSION_PROVIDER);
            z();
        }
    }

    @Override // defpackage.dgyy
    public final void q(String str, dgzc dgzcVar) {
        long j = this.b;
        dexn dexnVar = this.a;
        UserInfo userInfoP = dexnVar.p(str);
        dhbu dhbuVar = new dhbu(50072, j, dgzcVar.a);
        dhbuVar.b(userInfoP);
        dexnVar.g.c(new GroupChatSessionEvent(dhbuVar), dhjl.IMS_CHAT_SESSION_PROVIDER);
    }

    @Override // defpackage.dgwi
    public final void r(ebpe ebpeVar) {
        ebnn ebnnVar = ebpeVar.g;
        if (ebnnVar == null) {
            dhja.g("cSeqHeader is null", new Object[0]);
            return;
        }
        long j = this.b;
        dhja.c("Received response for session: %d method: %s status: %d", Long.valueOf(j), ebnnVar.e(), Integer.valueOf(ebpeVar.w()));
        if ("BYE".equals(ebnnVar.e())) {
            if (ebpeVar.w() == 200 && this.c.aw() == dgwq.LEAVE) {
                this.a.j.c(j);
            }
            this.c.aU(this);
        }
    }

    @Override // defpackage.dgwh
    public final void n() {
    }

    @Override // defpackage.dgwh
    public final void o() {
    }

    @Override // defpackage.dgwh
    public final void p() {
    }

    @Override // defpackage.dgwh
    public final void s() {
    }

    @Override // defpackage.dgwi
    public final void t() {
    }

    @Override // defpackage.dgwi
    public final void u() {
    }
}
