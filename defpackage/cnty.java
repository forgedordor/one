package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnty {
    public static final cqce a = cqce.g("Bugle", "SyncMessageBatch");
    public static final eksp b = eksp.c("Bugle");
    static final cczv c = cdag.p(132812332);
    static final ejxr d = cdag.v("log_duplicate_rcs_message_id_event_in_sync_message_batch");
    public final fcsu A;
    public final fcsu B;
    public final fcsu C;
    public final ejxr D;
    public final fcsu E;
    public final cnrp F;
    public final fcsu G;
    private final dqsn I;
    private final fcsu J;
    private final fcsu K;
    private final fcsu L;
    private final fcsu M;
    private final bveg N;
    private final fcsu O;
    private final fcsu P;
    private final ejxr Q;
    private final fcsu R;
    private final apth S;
    private final fcsu T;
    private final fcsu U;
    private final fcsu V;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final Set j;
    public final Set l;
    public final fcsu m;
    public final fcsu n;
    public final cldr o;
    public final cmop p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final fcsu t;
    public final fcsu u;
    public final fcsu v;
    public final cmqj w;
    public final cmsk x;
    public final bxlc y;
    public final fcsu z;
    public final HashSet e = new HashSet();
    private final cvw H = new cvw();
    public final HashSet k = new HashSet();

    public cnty(cldr cldrVar, cmop cmopVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, cmqj cmqjVar, cmsk cmskVar, bxlc bxlcVar, fcsu fcsuVar7, bveg bvegVar, dqsn dqsnVar, fcsu fcsuVar8, final crma crmaVar, final crny crnyVar, fcsu fcsuVar9, fcsu fcsuVar10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Set set, Set set2, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, cnrp cnrpVar, apth apthVar, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23) {
        this.o = cldrVar;
        this.p = cmopVar;
        this.q = fcsuVar;
        this.r = fcsuVar2;
        this.t = fcsuVar4;
        this.s = fcsuVar3;
        this.u = fcsuVar5;
        this.v = fcsuVar6;
        this.w = cmqjVar;
        this.x = cmskVar;
        this.y = bxlcVar;
        this.M = fcsuVar7;
        this.N = bvegVar;
        this.I = dqsnVar;
        this.J = fcsuVar8;
        this.z = fcsuVar9;
        this.A = fcsuVar10;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
        this.i = arrayList4;
        this.j = set;
        this.l = set2;
        this.K = fcsuVar11;
        this.m = fcsuVar12;
        this.L = fcsuVar13;
        this.O = fcsuVar14;
        this.B = cnrpVar.a;
        this.P = fcsuVar15;
        this.C = fcsuVar16;
        this.n = fcsuVar17;
        this.E = fcsuVar18;
        this.R = fcsuVar19;
        this.F = cnrpVar;
        this.S = apthVar;
        this.T = fcsuVar20;
        this.U = fcsuVar21;
        this.V = fcsuVar22;
        this.G = fcsuVar23;
        this.Q = ejxx.a(new ejxr() { // from class: cntn
            @Override // defpackage.ejxr
            public final Object get() {
                if (((Boolean) cnty.c.e()).booleanValue()) {
                    return crmaVar.k() ? crnyVar.j().n() : "default_device_id";
                }
                return null;
            }
        });
        this.D = ejxx.a(new ejxr() { // from class: cnto
            @Override // defpackage.ejxr
            public final Object get() {
                cqce cqceVar = cnty.a;
                ekfw ekfwVar = new ekfw();
                Iterator it = crnyVar.m().iterator();
                while (it.hasNext()) {
                    Optional optionalK = ((crof) it.next()).k(true);
                    if (!optionalK.isEmpty() && !TextUtils.isEmpty(((alqm) optionalK.get()).n())) {
                        ekfwVar.h(((alqm) optionalK.get()).n());
                    }
                }
                return ekfwVar.g();
            }
        });
    }

    public static boolean f(Map map, cmny cmnyVar) {
        return Boolean.TRUE.equals(map.get(cmnyVar.a));
    }

    public static cnvx g(cnvx cnvxVar) {
        return cnvxVar == null ? new cnvx(bvdk.ARCHIVED, false, false, "", 0, -1L) : new cnvx(bvdk.ARCHIVED, cnvxVar.b, cnvxVar.c, cnvxVar.d, cnvxVar.e, cnvxVar.f);
    }

    private final SelfIdentityId h(final int i) {
        fcsu fcsuVar = new fcsu() { // from class: cntv
            @Override // defpackage.fcsu
            public final Object b() {
                int i2 = bbbd.a;
                int i3 = i;
                cqaz.k(i3 != -2);
                String[] strArr = ParticipantsTable.a;
                brvq brvqVar = new brvq();
                bbbd.s(brvqVar);
                brvqVar.T(i3);
                brvqVar.S(-1);
                brvqVar.R(null);
                brvqVar.I(null);
                brvqVar.q(null);
                brvqVar.u(null);
                brvqVar.t(null);
                brvqVar.N(null);
                brvqVar.l(-1L);
                brvqVar.D(null);
                brvqVar.e(false);
                brvqVar.U(0);
                brvqVar.V(null);
                return ((bbca) this.a.q.b()).i(brvqVar.a());
            }
        };
        cnrp cnrpVar = this.F;
        return aofa.b((String) cnrp.e(cnrpVar, cnrpVar.c, Integer.valueOf(i), fcsuVar, "selfDestinationCache", null, null, 48));
    }

    private final ConversationIdType i(cmny cmnyVar) {
        return j(cmnyVar, false);
    }

    private final ConversationIdType j(cmny cmnyVar, boolean z) {
        long j = cmnyVar.i;
        int i = cmnyVar.q;
        cnvx cnvxVarB = b(j);
        String str = cmnyVar.a;
        ejyb.e(str);
        return this.x.d(j, i, cnvxVarB, str, bvdk.b(false), z);
    }

    private final String k(int i, alqm alqmVar) {
        String strN = alqmVar.n();
        strN.getClass();
        cvw cvwVar = this.H;
        ParticipantsTable.BindData bindDataA = (ParticipantsTable.BindData) cvwVar.get(strN);
        if (bindDataA == null) {
            cczv cczvVar = alvx.a;
            brvp brvpVarG = ((Boolean) new alvc().get()).booleanValue() ? bbbd.g(i, alqmVar) : bbbd.i(i, strN);
            ((bbca) this.q.b()).k(brvpVarG, true);
            bindDataA = brvpVarG.a();
            cvwVar.put(strN, bindDataA);
        }
        return bindDataA.R();
    }

    private final String l(final int i, final String str) {
        fcsu fcsuVar = new fcsu() { // from class: cntr
            @Override // defpackage.fcsu
            public final Object b() {
                brvp brvpVarI = bbbd.i(i, str);
                ((bbca) this.a.q.b()).k(brvpVarI, true);
                return brvpVarI.a().R();
            }
        };
        str.getClass();
        String str2 = i + "::" + str;
        final cnrp cnrpVar = this.F;
        return (String) cnrp.e(cnrpVar, cnrpVar.d, str2, fcsuVar, "participantCache", new fdap() { // from class: cnro
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str3 = (String) obj;
                str3.getClass();
                return cnrpVar.c(str3);
            }
        }, null, 32);
    }

    private final void m(int i) {
        ((ains) this.U.b()).e("Bugle.Telephony.ForwardSync.SyncMessageBatch.ThirdPartyOrLegacyMessageCount", i);
    }

    private static boolean n(chxw chxwVar) {
        Optional optional = ((chul) chxwVar).e;
        return optional.isPresent() && (((chuv) optional.get()).b & 1) != 0;
    }

    public final ConversationIdType a(final cmoc cmocVar) {
        final alqm alqmVar;
        alqm alqmVar2 = cmocVar.c;
        if (alqmVar2 == null || alqmVar2.D()) {
            final cnqj cnqjVar = new cnqj(cmocVar.i);
            final cnrp cnrpVar = this.F;
            alqmVar = (alqm) cnrp.e(cnrpVar, cnrpVar.e, cnqjVar, new fcsu() { // from class: cnth
                @Override // defpackage.fcsu
                public final Object b() {
                    final cnty cntyVar = this.a;
                    cmqj cmqjVar = cntyVar.w;
                    cnqj cnqjVar2 = cnqjVar;
                    List listU = cmqjVar.U(ejwk.b(cmqjVar.D(cnqjVar2)));
                    if (listU.size() != 1) {
                        cqbd cqbdVarE = cnty.a.e();
                        cqbdVarE.I("Thread ID had an SMS message but had 0 or multiple recipients");
                        cqbdVarE.A("threadId", cnqjVar2);
                        cqbdVarE.y("recipients.size()", listU.size());
                        cqbdVarE.r();
                    }
                    return (alqm) Collection.EL.stream(listU).findFirst().orElseGet(new Supplier() { // from class: cnta
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return ((alrj) cntyVar.B.b()).f();
                        }
                    });
                }
            }, "firstRecipientForThreadCache", null, new fdap() { // from class: cnri
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    alqm alqmVar3 = (alqm) obj;
                    alqmVar3.getClass();
                    return cnrpVar.c(alqmVar3.toString());
                }
            }, 16);
        } else {
            alqmVar = cmocVar.c;
        }
        cczv cczvVar = alvx.a;
        ((Boolean) new alux().get()).booleanValue();
        alqmVar.p(false);
        return ((avpc) this.K.b()).a(alqmVar, new fcsu() { // from class: cntp
            @Override // defpackage.fcsu
            public final Object b() {
                cnty cntyVar = this.a;
                cmoc cmocVar2 = cmocVar;
                cnvx cnvxVarB = cntyVar.b(cmocVar2.i);
                cnqj cnqjVarB = cnqj.b(cmocVar2.i);
                if (cnqjVarB.c() && cntyVar.w.P(cnqjVarB)) {
                    cnvxVarB = cnty.g(cnvxVarB);
                }
                alqm alqmVar3 = alqmVar;
                return ((cnqt) cntyVar.m.b()).c(cnvxVarB, alqmVar3, cmocVar2.m, new cnqj(cmocVar2.i), true);
            }
        }).C();
    }

    public final cnvx b(long j) {
        if (!((Boolean) ((cczi) cmqf.a.get()).e()).booleanValue()) {
            return ((cmqf) this.J.b()).b(j);
        }
        ctz ctzVar = ((cnvy) this.O.b()).a;
        if (ctzVar != null) {
            return (cnvx) ctzVar.d(j);
        }
        return null;
    }

    public final void c(final cmoc cmocVar, boolean z) {
        final ConversationIdType conversationIdTypeD;
        alqm alqmVar = cmocVar.c;
        if (alqmVar == null || alqmVar.w()) {
            a.r("SMS has no address; using unknown sender");
            cmocVar.c = ((alrj) this.B.b()).f();
            ((ains) this.A.b()).c("Bugle.Telephony.ForwardSync.EmptySmsAddress");
        }
        if (((Boolean) avos.a.e()).booleanValue()) {
            String str = cmocVar.d;
            if (str != null) {
                final cnrp cnrpVar = this.F;
                final fcsu fcsuVar = new fcsu() { // from class: cntg
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return this.a.a(cmocVar);
                    }
                };
                final ekgb ekgbVarR = ekgb.r(str);
                ekgbVarR.getClass();
                String string = ekgbVarR.toString();
                string.getClass();
                final fdci fdciVar = new fdci();
                fcsu fcsuVar2 = new fcsu() { // from class: cnrf
                    @Override // defpackage.fcsu
                    public final Object b() {
                        TreeSet treeSet = new TreeSet();
                        fcva.aG(ekgbVarR, treeSet);
                        String string2 = treeSet.toString();
                        fdci fdciVar2 = fdciVar;
                        fdciVar2.a = string2;
                        ConversationIdType conversationIdType = (ConversationIdType) cnrpVar.b.get(fdciVar2.a);
                        return conversationIdType == null ? fcsuVar.b() : conversationIdType;
                    }
                };
                fdap fdapVar = new fdap() { // from class: cnrg
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        String str2 = (String) obj;
                        str2.getClass();
                        return cnrpVar.c(str2);
                    }
                };
                LruCache lruCache = cnrpVar.b;
                conversationIdTypeD = (ConversationIdType) cnrp.e(cnrpVar, lruCache, string, fcsuVar2, "conversationIdCache-unsorted", fdapVar, null, 32);
                String str2 = (String) fdciVar.a;
                if (str2 != null) {
                }
            } else {
                conversationIdTypeD = a(cmocVar);
            }
        } else {
            cmsk cmskVar = this.x;
            long j = cmocVar.i;
            conversationIdTypeD = cmskVar.d(j, cmocVar.m, b(j), cmocVar.b, bvdk.b(false), false);
        }
        ConversationIdType conversationIdType = conversationIdTypeD;
        if (conversationIdType.b()) {
            cqbd cqbdVarB = a.b();
            cqbdVarB.I("Failed to create conversation for SMS thread");
            cqbdVarB.H(cmocVar.i);
            cqbdVarB.r();
            return;
        }
        int i = cmocVar.m;
        SelfIdentityId selfIdentityIdH = h(i);
        MessageCoreData messageCoreDataJ = this.N.j(cmocVar.b, z ? ((SelfIdentityIdImpl) selfIdentityIdH).a : !cssr.g(cmocVar.d) ? l(i, cmocVar.d) : k(i, cmocVar.c), selfIdentityIdH, conversationIdType, cmvy.b(z, cmocVar.h, cmocVar.j), cmocVar.l, cmocVar.k, cmocVar.g, cmocVar.f, cmocVar.e);
        try {
            ((bauh) this.z.b()).d(messageCoreDataJ, true, Optional.ofNullable((String) this.Q.get()));
        } catch (SQLiteConstraintException e) {
            if (e.getMessage() != null && e.getMessage().contains("message_persistence_id")) {
                ((eksl) ((eksl) b.j()).h("com/google/android/apps/messaging/shared/telephony/forwardsync/SyncMessageBatch", "insertNonOtpSms", 886, "SyncMessageBatch.java")).t("SQLiteConstraintException related to SMS message_persistence_id: %s", messageCoreDataJ.ae());
            }
        }
        cqbd cqbdVarD = a.d();
        cqbdVarD.I("Inserted new SMS message.");
        cqbdVarD.d(messageCoreDataJ.C());
        cqbdVarD.A("smsMessageUri", messageCoreDataJ.u());
        cqbdVarD.z("receivedTimeStamp", messageCoreDataJ.o());
        cqbdVarD.A("messagePersistenceId", messageCoreDataJ.ae());
        cqbdVarD.r();
        this.e.add(conversationIdType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03e0 A[PHI: r12
      0x03e0: PHI (r12v5 int) = (r12v4 int), (r12v4 int), (r12v4 int), (r12v4 int), (r12v4 int), (r12v13 int) binds: [B:123:0x036e, B:125:0x0381, B:127:0x038d, B:129:0x0399, B:131:0x03c3, B:92:0x0285] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[Catch: cmnw -> 0x00ec, TryCatch #3 {cmnw -> 0x00ec, blocks: (B:19:0x0058, B:23:0x0070, B:25:0x0078, B:27:0x0082, B:29:0x008c, B:30:0x0091, B:34:0x009f, B:36:0x00bc, B:38:0x00cd, B:35:0x00b8, B:22:0x0068), top: B:251:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c2  */
    /* JADX WARN: Type inference failed for: r7v71, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(final defpackage.cmny r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnty.d(cmny, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8 A[PHI: r10
      0x00d8: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v6 java.lang.String) binds: [B:16:0x00b8, B:18:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnty.e():void");
    }
}
