package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Map;
import j$.util.Optional;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfeg implements cfrj {
    public static final /* synthetic */ int i = 0;
    private static final ekrg j = ekrg.c("com/google/android/apps/messaging/shared/net/handler/InboxSendRpcHandler");
    private static final cczi k = cdag.e(cdag.b, "ditto_max_hours_to_retry_push", 24);
    private final boolean A;
    private final evqs B;
    private final Optional C;
    private String D = "";
    private long E = 0;
    private String F;
    public final fcsu a;
    public final ezol b;
    public final String c;
    public final cema d;
    public final String e;
    public final ezol f;
    public final fcsu g;
    public final eoxg h;
    private final eygg l;
    private final ains m;
    private final fcsu n;
    private final bviy o;
    private final cepf p;
    private final cfgi q;
    private final ezol r;
    private final ezjh s;
    private final long t;
    private final cogw u;
    private final crqv v;
    private final bvkr w;
    private final eosc x;
    private final evqs y;
    private final boolean z;

    public cfeg(cehg cehgVar, cogw cogwVar, crqv crqvVar, bvkr bvkrVar, cema cemaVar, eosc eoscVar, fcsu fcsuVar, eygg eyggVar, ains ainsVar, cfgj cfgjVar, fcsu fcsuVar2, cfgc cfgcVar, cepf cepfVar, cepf cepfVar2, fcsu fcsuVar3, bviy bviyVar, cfef cfefVar) {
        String str;
        epby epbyVar;
        this.F = "";
        this.u = cogwVar;
        this.v = crqvVar;
        this.w = bvkrVar;
        this.d = cemaVar;
        this.a = fcsuVar;
        this.l = eyggVar;
        this.m = ainsVar;
        this.n = fcsuVar2;
        this.o = bviyVar;
        cepf cepfVar3 = true == ((cdio) fcsuVar3.b()).a() ? cepfVar2 : cepfVar;
        this.p = cepfVar3;
        this.g = fcsuVar3;
        this.q = cfgjVar.a(cepfVar3, cfgcVar);
        this.B = cfefVar.o;
        Optional optional = cfefVar.p;
        this.C = optional;
        ezol ezolVar = cfefVar.a;
        this.r = ezolVar;
        if (((cdio) fcsuVar3.b()).a() && optional.isPresent()) {
            this.b = ((bvks) optional.get()).d;
        } else {
            this.b = ezolVar;
        }
        this.x = eoscVar;
        this.c = UUID.randomUUID().toString();
        if (!TextUtils.isEmpty(cfefVar.d)) {
            this.F = cfefVar.d;
        }
        ezjh ezjhVar = cfefVar.i;
        if (ezjhVar == null) {
            this.s = ezjh.STATUS;
        } else {
            this.s = ezjhVar;
        }
        this.t = cfefVar.j;
        this.y = cfefVar.e;
        this.z = cfefVar.f;
        this.A = cfefVar.g;
        this.e = cfefVar.m;
        this.f = cfefVar.n;
        eoxf eoxfVar = (eoxf) eoxg.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(cogwVar.f().toEpochMilli());
        eoxfVar.copyOnWrite();
        ((eoxg) eoxfVar.instance).f = micros;
        epby epbyVar2 = cfefVar.b;
        eoxfVar.copyOnWrite();
        ((eoxg) eoxfVar.instance).g = epbyVar2.a();
        boolean z = cfefVar.l;
        eoxfVar.copyOnWrite();
        ((eoxg) eoxfVar.instance).e = z;
        int i2 = cfefVar.k;
        eoxfVar.copyOnWrite();
        ((eoxg) eoxfVar.instance).d = i2;
        if (!bvkrVar.v(this.b)) {
            eoxfVar.copyOnWrite();
            ((eoxg) eoxfVar.instance).j = true;
        }
        if (!TextUtils.isEmpty(cfefVar.c)) {
            String str2 = cfefVar.c;
            eoxfVar.copyOnWrite();
            eoxg eoxgVar = (eoxg) eoxfVar.instance;
            str2.getClass();
            eoxgVar.b = str2;
        }
        if (!cfefVar.h.H()) {
            try {
                evqs evqsVarV = cehgVar.v(cfefVar.h, this.b);
                if (evqsVarV == null || evqsVarV.H()) {
                    cqca.l("BugleNetwork", "Encrypted Request Error was empty");
                } else if (((cdio) fcsuVar3.b()).a()) {
                    eoxfVar.copyOnWrite();
                    ((eoxg) eoxfVar.instance).k = evqsVarV;
                } else {
                    eoxfVar.copyOnWrite();
                    ((eoxg) eoxfVar.instance).c = evqsVarV;
                }
            } catch (GeneralSecurityException e) {
                cqca.h("BugleNetwork", e, "Request Error Encryption Failed");
            }
        }
        if (!cfefVar.e.H()) {
            if (cfefVar.f || (epbyVar = cfefVar.b) == epby.CREATE_GAIA_PAIRING_CLIENT_INIT || epbyVar == epby.CREATE_GAIA_PAIRING_CLIENT_FINISHED || epbyVar == epby.CANCEL_GAIA_PAIRING) {
                evqs evqsVar = cfefVar.e;
                eoxfVar.copyOnWrite();
                eoxg eoxgVar2 = (eoxg) eoxfVar.instance;
                evqsVar.getClass();
                eoxgVar2.h = evqsVar;
            } else {
                try {
                    evqs evqsVarV2 = cehgVar.v(cfefVar.e, this.b);
                    if (evqsVarV2 == null || evqsVarV2.H()) {
                        cqca.l("BugleNetwork", "encryptedData was empty");
                    } else {
                        eoxfVar.copyOnWrite();
                        ((eoxg) eoxfVar.instance).i = evqsVarV2;
                    }
                } catch (GeneralSecurityException e2) {
                    cqca.h("BugleNetwork", e2, "Encryption failed");
                }
            }
        }
        eoxg eoxgVar3 = (eoxg) eoxfVar.build();
        this.h = eoxgVar3;
        epby epbyVarB = epby.b(eoxgVar3.g);
        if (!(epbyVarB == null ? epby.UNRECOGNIZED : epbyVarB).equals(epby.GET_UPDATES) || cfefVar.e.H()) {
            epby epbyVarB2 = epby.b(eoxgVar3.g);
            cqca.c("BugleNetwork", "Created InboxSendRequest, type: ".concat(String.valueOf(String.valueOf(epbyVarB2 == null ? epby.UNRECOGNIZED : epbyVarB2))));
            return;
        }
        try {
            epby epbyVarB3 = epby.b(eoxgVar3.g);
            String strValueOf = String.valueOf(epbyVarB3 == null ? epby.UNRECOGNIZED : epbyVarB3);
            switch (eozd.a(((eoze) evsn.parseFrom(eoze.a, cfefVar.e, evrr.a())).b)) {
                case 1:
                    str = "UPDATE_NOT_SET";
                    break;
                case 2:
                default:
                    str = "null";
                    break;
                case 3:
                    str = "CONVERSATION";
                    break;
                case 4:
                    str = "MESSAGE";
                    break;
                case 5:
                    str = "TYPING";
                    break;
                case 6:
                    str = "SETTINGS";
                    break;
                case 7:
                    str = "USER_ALERT";
                    break;
                case 8:
                    str = "BROWSER_PRESENCE_CHECK";
                    break;
                case 9:
                    str = "PARTICIPANTS";
                    break;
                case 10:
                    str = "CONVERSATION_TYPE";
                    break;
                case 11:
                    str = "FAVORITE_STICKER_PACKS";
                    break;
                case 12:
                    str = "RECENT_STICKERS";
                    break;
                case 13:
                    str = "CLOUD_STORE_INFO";
                    break;
                case 14:
                    str = "GET_BLOB_FOR_ATTACHMENT_PROGRESS_UPDATE";
                    break;
                case 15:
                    str = "UNPAIR_GAIA_PAIRING";
                    break;
                case 16:
                    str = "GAIA_PAIRING_INFO";
                    break;
            }
            cqca.c("BugleNetwork", a.n(str, strValueOf, "Created InboxSendRequest, type: ", "."));
        } catch (evtj unused) {
            cqca.f("BugleNetwork", "Created InboxSendRequest, type: " + epby.GET_UPDATES.a() + " with unknown inner type");
        }
    }

    public static void s(Throwable th) {
        if (th != null) {
            cqca.n("BugleNetwork", "Error executing RPC for Ditto InboxSendRpcHandler: ".concat(String.valueOf(th.getMessage())));
        }
    }

    @Deprecated
    public static void t(cema cemaVar, ezjn ezjnVar, ezol ezolVar) {
        cqca.m("BugleNetwork", "result is %s", ezjnVar);
        long j2 = ezjnVar.c;
        if (j2 <= 0) {
            return;
        }
        synchronized (cemaVar.e) {
            Map map = cemaVar.f;
            if (((Long) Map.EL.getOrDefault(map, ezolVar, 0L)).longValue() < j2) {
                map.put(ezolVar, Long.valueOf(j2));
            }
        }
    }

    private final void u(String str, long j2) {
        crqv crqvVar = this.v;
        if (j2 < crqvVar.e(str, Long.MAX_VALUE)) {
            crqvVar.k(str, j2);
        }
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.E;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return (((cdio) this.g.b()).a() && p().equals("GDitto")) ? new cfrd("GDitto") : cfrh.d;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        ezjk ezjkVar = (ezjk) ezjl.a.createBuilder();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar = (ezjl) ezjkVar.instance;
        ezppVar.getClass();
        ezjlVar.f = ezppVar;
        ezjlVar.b |= 4;
        ezjkVar.copyOnWrite();
        ezjl ezjlVar2 = (ezjl) ezjkVar.instance;
        ezjlVar2.c = this.r;
        ezjlVar2.b |= 1;
        ezjg ezjgVar = (ezjg) ezjj.a.createBuilder();
        ezjgVar.copyOnWrite();
        ezjj ezjjVar = (ezjj) ezjgVar.instance;
        String str = this.c;
        str.getClass();
        ezjjVar.c = str;
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).k = this.s.a();
        ezji ezjiVar = ezji.DITTO;
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).d = ezjiVar.a();
        eoxg eoxgVar = this.h;
        evqs byteString = eoxgVar.toByteString();
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).e = byteString;
        ezjkVar.copyOnWrite();
        ezjl ezjlVar3 = (ezjl) ezjkVar.instance;
        ezjj ezjjVar2 = (ezjj) ezjgVar.build();
        ezjjVar2.getClass();
        ezjlVar3.e = ezjjVar2;
        ezjlVar3.b |= 2;
        long j2 = this.t;
        if (j2 != 0) {
            ezjkVar.copyOnWrite();
            ((ezjl) ezjkVar.instance).g = j2;
        }
        if (((cdio) this.g.b()).a() && p().equals("GDitto")) {
            ezjkVar.a(this.B);
        }
        final ezjl ezjlVar4 = (ezjl) ezjkVar.build();
        this.D = ezppVar.c;
        epby epbyVarB = epby.b(eoxgVar.g);
        if (epbyVarB == null) {
            epbyVarB = epby.UNRECOGNIZED;
        }
        if (epbyVarB.equals(epby.GET_UPDATES)) {
            try {
                if (eozd.a(((eoze) evsn.parseFrom(eoze.a, this.y, evrr.a())).b) == 4) {
                    eiju eijuVarB = ((bvfj) this.n.b()).b(this.b);
                    ejvr ejvrVar = new ejvr() { // from class: cfec
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            int i2 = cfeg.i;
                            return ezjlVar4;
                        }
                    };
                    eosc eoscVar = this.x;
                    return eijuVarB.h(ejvrVar, eoscVar).e(Exception.class, new ejvr() { // from class: cfed
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            int i2 = cfeg.i;
                            cqca.p("BugleNetwork", (Exception) obj, "setDittoLastPushTimeMillis did not complete successfully");
                            return ezjlVar4;
                        }
                    }, eoscVar);
                }
            } catch (evtj unused) {
                cqca.f("BugleNetwork", "CreateRequest, type: " + epby.GET_UPDATES.a() + " with unknown inner type");
            }
        }
        return eork.i(ezjlVar4);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "InboxSendRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0157  */
    @Override // defpackage.cfrj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Throwable r21) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfeg.h(java.lang.Throwable):void");
    }

    @Override // defpackage.cfrj
    public final void i() {
        if (((cdio) this.g.b()).a()) {
            eoxg eoxgVar = this.h;
            epby epbyVarB = epby.b(eoxgVar.g);
            if (epbyVarB == null) {
                epbyVarB = epby.UNRECOGNIZED;
            }
            cqca.j("BugleNetwork", "Executing RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s, proxy=%s", "InboxSendRpcHandler", Integer.valueOf(epbyVarB.a()), eoxgVar.b, this.c, this.b.c, this.p.getClass().getSimpleName());
            return;
        }
        eoxg eoxgVar2 = this.h;
        epby epbyVarB2 = epby.b(eoxgVar2.g);
        if (epbyVarB2 == null) {
            epbyVarB2 = epby.UNRECOGNIZED;
        }
        cqca.j("BugleNetwork", "Executing RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s", "InboxSendRpcHandler", Integer.valueOf(epbyVarB2.a()), eoxgVar2.b, this.c, this.b.c);
    }

    @Override // defpackage.cfrj
    public final void j() {
        if (((cdio) this.g.b()).a()) {
            eoxg eoxgVar = this.h;
            epby epbyVarB = epby.b(eoxgVar.g);
            if (epbyVarB == null) {
                epbyVarB = epby.UNRECOGNIZED;
            }
            cqca.j("BugleNetwork", "Received result for RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s, proxy=%s", "InboxSendRpcHandler", Integer.valueOf(epbyVarB.a()), eoxgVar.b, this.c, this.b.c, this.p.getClass().getSimpleName());
            return;
        }
        eoxg eoxgVar2 = this.h;
        epby epbyVarB2 = epby.b(eoxgVar2.g);
        if (epbyVarB2 == null) {
            epbyVarB2 = epby.UNRECOGNIZED;
        }
        cqca.j("BugleNetwork", "Received result for RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s", "InboxSendRpcHandler", Integer.valueOf(epbyVarB2.a()), eoxgVar2.b, this.c, this.b.c);
    }

    @Override // defpackage.cfxa
    public final void k() {
        Status.Code code = Status.Code.OK;
        epby epbyVarB = epby.b(this.h.g);
        if (epbyVarB == null) {
            epbyVarB = epby.UNRECOGNIZED;
        }
        if (epbyVarB.ordinal() != 19) {
            return;
        }
        try {
            eoze eozeVar = (eoze) evsn.parseFrom(eoze.a, this.y, evrr.a());
            int i2 = eozeVar.b;
            int iA = eozd.a(i2);
            if (iA == 0) {
                throw null;
            }
            int i3 = iA - 1;
            if (i3 == 2) {
                eowm eowmVar = (eowm) Collections.min((i2 == 2 ? (eowu) eozeVar.c : eowu.a).b, new Comparator() { // from class: cfeb
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int i4 = cfeg.i;
                        return Long.compare(((eowm) obj).f, ((eowm) obj2).f);
                    }
                });
                if (eowmVar != null) {
                    u("ditto_oldest_conversation_needing_update_timestamp_ms", TimeUnit.MICROSECONDS.toMillis(eowmVar.f));
                    return;
                }
                return;
            }
            if (i3 == 3) {
                evtg evtgVar = (i2 == 3 ? (epca) eozeVar.c : epca.a).b;
                long micros = TimeUnit.MILLISECONDS.toMicros(this.u.f().toEpochMilli()) - TimeUnit.HOURS.toMicros(((Integer) k.e()).intValue());
                Iterator<E> it = evtgVar.iterator();
                long j2 = Long.MAX_VALUE;
                while (it.hasNext()) {
                    long j3 = ((epbl) it.next()).h;
                    if (j3 < micros) {
                        cqca.d("BugleNetworkRetry", "Message is skipped. Timestamp %d is older than cut-off %d.", Long.valueOf(j3), Long.valueOf(micros));
                    } else if (j3 < j2) {
                        j2 = j3;
                    }
                }
                if (j2 != Long.MAX_VALUE) {
                    u("ditto_oldest_message_needing_update_timestamp_ms", TimeUnit.MICROSECONDS.toMillis(j2));
                    return;
                }
                return;
            }
            if (i3 == 5) {
                this.v.h("ditto_settings_need_update", true);
                return;
            }
            if (i3 != 6) {
                return;
            }
            epfy epfyVarB = epfy.b((i2 == 6 ? (epga) eozeVar.c : epga.a).b);
            if (epfyVarB == null) {
                epfyVarB = epfy.UNRECOGNIZED;
            }
            int iOrdinal = epfyVarB.ordinal();
            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                this.v.j("ditto_browser_inactive_needs_update", (eozeVar.b == 6 ? (epga) eozeVar.c : epga.a).b);
            } else {
                this.v.h("ditto_user_alert_needs_update", true);
            }
        } catch (evtj e) {
            cqca.h("BugleNetworkRetry", e, "Failed to unmarshall GetUpdatesResponse");
        }
    }

    public final cfyv m() {
        cfyu cfyuVar = (cfyu) cfyv.a.createBuilder();
        cfyuVar.copyOnWrite();
        cfyv cfyvVar = (cfyv) cfyuVar.instance;
        cfyvVar.c = this.r;
        cfyvVar.b |= 1;
        eoxg eoxgVar = this.h;
        epby epbyVarB = epby.b(eoxgVar.g);
        if (epbyVarB == null) {
            epbyVarB = epby.UNRECOGNIZED;
        }
        cfyuVar.copyOnWrite();
        ((cfyv) cfyuVar.instance).d = epbyVarB.a();
        String str = eoxgVar.b;
        cfyuVar.copyOnWrite();
        cfyv cfyvVar2 = (cfyv) cfyuVar.instance;
        str.getClass();
        cfyvVar2.e = str;
        evqs evqsVar = this.y;
        cfyuVar.copyOnWrite();
        cfyv cfyvVar3 = (cfyv) cfyuVar.instance;
        evqsVar.getClass();
        cfyvVar3.f = evqsVar;
        boolean z = this.z;
        cfyuVar.copyOnWrite();
        cfyv cfyvVar4 = (cfyv) cfyuVar.instance;
        cfyvVar4.b |= 8;
        cfyvVar4.n = z;
        ezjh ezjhVar = this.s;
        cfyuVar.copyOnWrite();
        ((cfyv) cfyuVar.instance).g = ezjhVar.a();
        boolean z2 = eoxgVar.e;
        cfyuVar.copyOnWrite();
        ((cfyv) cfyuVar.instance).h = z2;
        int i2 = eoxgVar.d;
        cfyuVar.copyOnWrite();
        ((cfyv) cfyuVar.instance).i = i2;
        long j2 = this.t;
        cfyuVar.copyOnWrite();
        ((cfyv) cfyuVar.instance).j = j2;
        boolean z3 = this.A;
        cfyuVar.copyOnWrite();
        cfyv cfyvVar5 = (cfyv) cfyuVar.instance;
        cfyvVar5.b |= 32;
        cfyvVar5.p = z3;
        String str2 = this.e;
        if (str2 != null) {
            cfyuVar.copyOnWrite();
            ((cfyv) cfyuVar.instance).k = str2;
        }
        ezol ezolVar = this.f;
        if (ezolVar != null) {
            cfyuVar.copyOnWrite();
            cfyv cfyvVar6 = (cfyv) cfyuVar.instance;
            cfyvVar6.l = ezolVar;
            cfyvVar6.b |= 2;
        }
        String str3 = this.F;
        if (str3 != null) {
            cfyuVar.copyOnWrite();
            cfyv cfyvVar7 = (cfyv) cfyuVar.instance;
            cfyvVar7.b |= 16;
            cfyvVar7.o = str3;
        }
        if (((cdio) this.g.b()).a() && p().equals("GDitto")) {
            Optional optional = this.C;
            ezol ezolVar2 = ((bvks) optional.get()).d;
            cfyuVar.copyOnWrite();
            cfyv cfyvVar8 = (cfyv) cfyuVar.instance;
            cfyvVar8.c = ezolVar2;
            cfyvVar8.b |= 1;
            if (ezolVar == null) {
                ezol ezolVar3 = ((bvks) optional.get()).a;
                cfyuVar.copyOnWrite();
                cfyv cfyvVar9 = (cfyv) cfyuVar.instance;
                cfyvVar9.l = ezolVar3;
                cfyvVar9.b |= 2;
            }
            evqs evqsVar2 = this.B;
            if (!evqsVar2.H()) {
                cfyuVar.copyOnWrite();
                cfyv cfyvVar10 = (cfyv) cfyuVar.instance;
                evqsVar2.getClass();
                cfyvVar10.b |= 4;
                cfyvVar10.m = evqsVar2;
            }
        }
        return (cfyv) cfyuVar.build();
    }

    @Override // defpackage.cfrj
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture d(cezv cezvVar, ezjl ezjlVar) {
        cqca.m("BugleNetwork", "Sent InboxSendRequest: %s", ezjlVar.toString());
        return cezvVar.a().e(ezjlVar);
    }

    @Override // defpackage.cfrj
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture e(ezjn ezjnVar) {
        long j2;
        if (ezjnVar != null) {
            ezpr ezprVar = ezjnVar.b;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j2 = ezprVar.b;
        } else {
            j2 = 0;
        }
        this.E = j2;
        return eork.i(ezjnVar);
    }

    public final String p() {
        return this.r.d;
    }

    public final void q(ListenableFuture listenableFuture) {
        eiju eijuVarG = eiju.g(listenableFuture);
        ejvr ejvrVar = new ejvr() { // from class: cfdy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cfeg cfegVar = this.a;
                cfeg.t(cfegVar.d, (ezjn) obj, cfegVar.b);
                return null;
            }
        };
        eosc eoscVar = this.x;
        auvh.h(eijuVarG.h(ejvrVar, eoscVar).e(fbtf.class, new ejvr() { // from class: cfdz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cfeg.s((fbtf) obj);
                return null;
            }
        }, eoscVar).e(cefl.class, new ejvr() { // from class: cfea
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cfeg.s((cefl) obj);
                return null;
            }
        }, eoscVar));
    }

    public final void r() {
        int iA;
        epby epbyVarB = epby.b(this.h.g);
        if (epbyVarB == null) {
            epbyVarB = epby.UNRECOGNIZED;
        }
        if (!epbyVarB.equals(epby.GET_UPDATES)) {
            bvio bvioVar = (bvio) this.a.b();
            eoxg eoxgVar = this.h;
            bvioVar.l(eoxgVar.b, this.b.c, eoxgVar.g, this.c);
            return;
        }
        try {
            eoze eozeVar = (eoze) evsn.parseFrom(eoze.a, this.y, evrr.a());
            int iA2 = eozd.a(eozeVar.b);
            if (TextUtils.isEmpty(this.F)) {
                this.F = this.c;
            }
            bvio bvioVar2 = (bvio) this.a.b();
            String str = this.F;
            eoxg eoxgVar2 = this.h;
            ezol ezolVar = this.b;
            String str2 = eoxgVar2.b;
            String str3 = ezolVar.c;
            int iA3 = epby.GET_UPDATES.a();
            int i2 = iA2 - 1;
            if (iA2 == 0) {
                throw null;
            }
            if (iA2 == 7) {
                epfy epfyVarB = epfy.b((eozeVar.b == 6 ? (epga) eozeVar.c : epga.a).b);
                if (epfyVarB == null) {
                    epfyVarB = epfy.UNRECOGNIZED;
                }
                iA = epfyVarB.a();
            } else {
                iA = -1;
            }
            bvioVar2.j(str, str2, str3, iA3, i2, iA, this.c);
        } catch (evtj e) {
            cqca.h("BugleNetworkRetry", e, "Failed to unmarshall GetUpdatesResponse");
        }
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
