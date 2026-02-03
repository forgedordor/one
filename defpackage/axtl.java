package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axtl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor");
    private static final Object f = new Object();
    private final Map A;
    private final aujz B;
    private final axth C;
    private final fcsu D;
    private final fcsu E;
    private final fcsu F;
    private final fcsu G;
    private final fcsu H;
    private final fcsu I;
    private final fcsu J;
    private final fcsu K;
    private final fcsu L;
    private final fcsu M;
    private final ayrm N;
    private final int O;
    private final Duration P;
    private final Action Q;
    private final cldb R;
    private final cazg S;
    private final List T = new ArrayList();
    private final List U = new ArrayList();
    private final List V = new ArrayList();
    private final List W = new ArrayList();
    private final List X = new ArrayList();
    private final Set Y = new HashSet();
    private final Set Z = new HashSet();
    private final Set aa = new HashSet();
    private final Set ab = new HashSet();
    private final Set ac = new HashSet();
    private final boolean[] ad = new boolean[8];
    private final boolean[] ae = new boolean[8];
    private final Boolean[] af = new Boolean[8];
    private boolean ag;
    public final cjpo b;
    public final cmxr c;
    public final eosc d;
    public final String e;
    private final ayqj g;
    private final cogw h;
    private final fcsu i;
    private final cqbm j;
    private final fcsu k;
    private final ajhd l;
    private final axxy m;
    private final ayqd n;
    private final ayqx o;
    private final axsj p;
    private final bveg q;
    private final fcsu r;
    private final Optional s;
    private final aypv t;
    private final bydb u;
    private final fcsu v;
    private final fcsu w;
    private final axtk x;
    private final fcsu y;
    private final ckfo z;

    /* compiled from: PG */
    public interface a {
        axtn aL();

        axxy aM();

        crmx cO();

        cogw y();
    }

    public axtl(fcsu fcsuVar, fcsu fcsuVar2, ayqj ayqjVar, cogw cogwVar, fcsu fcsuVar3, cqbm cqbmVar, fcsu fcsuVar4, ajhd ajhdVar, axxy axxyVar, ayqd ayqdVar, ayqx ayqxVar, axsj axsjVar, bveg bvegVar, aypv aypvVar, ayrm ayrmVar, Optional optional, cjpo cjpoVar, bydb bydbVar, fcsu fcsuVar5, fcsu fcsuVar6, axtk axtkVar, fcsu fcsuVar7, cmxr cmxrVar, eosc eoscVar, int i, Duration duration, Action action, cldb cldbVar, cazg cazgVar, String str, ckfo ckfoVar, Map map, aujz aujzVar, axth axthVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16) {
        this.r = fcsuVar;
        this.G = fcsuVar2;
        this.g = ayqjVar;
        this.h = cogwVar;
        this.i = fcsuVar3;
        this.j = cqbmVar;
        this.k = fcsuVar4;
        this.l = ajhdVar;
        this.m = axxyVar;
        this.n = ayqdVar;
        this.o = ayqxVar;
        this.p = axsjVar;
        this.q = bvegVar;
        this.t = aypvVar;
        this.N = ayrmVar;
        this.s = optional;
        this.b = cjpoVar;
        this.u = bydbVar;
        this.v = fcsuVar5;
        this.w = fcsuVar6;
        this.x = axtkVar;
        this.y = fcsuVar7;
        this.c = cmxrVar;
        this.d = eoscVar;
        this.O = i;
        this.P = duration;
        this.Q = action;
        this.R = cldbVar;
        this.S = cazgVar;
        this.e = str;
        this.H = fcsuVar11;
        this.I = fcsuVar12;
        this.K = fcsuVar15;
        for (int i2 = 0; i2 < 8; i2++) {
            this.ad[i2] = false;
            this.ae[i2] = false;
            this.af[i2] = false;
        }
        this.ag = false;
        this.z = ckfoVar;
        this.A = map;
        this.B = aujzVar;
        this.C = axthVar;
        this.D = fcsuVar8;
        this.E = fcsuVar9;
        this.F = fcsuVar10;
        this.J = fcsuVar13;
        this.M = fcsuVar14;
        this.L = fcsuVar16;
    }

    public static brdr b() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.h(5);
        ekfwVar.h(6);
        ekfwVar.h(4);
        ekfwVar.h(7);
        ekfwVar.h(10);
        ekfwVar.h(105);
        ekfwVar.h(103);
        ekfwVar.h(104);
        ekfwVar.h(102);
        ekfwVar.h(115);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("+buildPendingMessagesQuery");
        brec brecVar = new brec();
        brecVar.ah(ekfwVar.g());
        brdrVarD.g(brecVar);
        brdrVarD.d(new brdo(MessagesTable.c.i, true));
        return brdrVarD;
    }

    public static void d(int i, Action action) {
        e(i, Duration.ZERO, action);
    }

    public static void e(int i, Duration duration, Action action) throws Throwable {
        ejwl.b(true, "ProcessPendingMessagesAction: empty processing action");
        a aVar = (a) cqtf.a(a.class);
        if (!aVar.cO().G()) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromAction", 273, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - not default SMS app");
            return;
        }
        long epochMilli = aVar.y().f().toEpochMilli();
        if (aVar.aM().d(i, epochMilli)) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromAction", 284, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - too frequent");
            return;
        }
        axtn axtnVarAL = aVar.aL();
        fcsu fcsuVar = axtnVarAL.a;
        ayqj ayqjVar = (ayqj) axtnVarAL.b.b();
        ayqjVar.getClass();
        cogw cogwVar = (cogw) axtnVarAL.c.b();
        cogwVar.getClass();
        fcsu fcsuVar2 = axtnVarAL.d;
        cqbm cqbmVar = (cqbm) axtnVarAL.e.b();
        cqbmVar.getClass();
        fcsu fcsuVar3 = axtnVarAL.f;
        ajhd ajhdVar = (ajhd) axtnVarAL.g.b();
        ajhdVar.getClass();
        axxy axxyVar = (axxy) axtnVarAL.h.b();
        axxyVar.getClass();
        ayqd ayqdVar = (ayqd) axtnVarAL.i.b();
        ayqdVar.getClass();
        ayqx ayqxVar = (ayqx) axtnVarAL.j.b();
        ayqxVar.getClass();
        axsj axsjVar = (axsj) axtnVarAL.k.b();
        axsjVar.getClass();
        bveg bvegVar = (bveg) axtnVarAL.l.b();
        bvegVar.getClass();
        aypv aypvVar = (aypv) axtnVarAL.m.b();
        aypvVar.getClass();
        ayrm ayrmVar = (ayrm) axtnVarAL.n.b();
        ayrmVar.getClass();
        Optional optional = (Optional) axtnVarAL.o.b();
        optional.getClass();
        cjpo cjpoVar = (cjpo) axtnVarAL.p.b();
        cjpoVar.getClass();
        bydb bydbVar = (bydb) axtnVarAL.q.b();
        bydbVar.getClass();
        ((cokd) axtnVarAL.r.b()).getClass();
        fcsu fcsuVar4 = axtnVarAL.s;
        fcsu fcsuVar5 = axtnVarAL.t;
        axtk axtkVar = (axtk) axtnVarAL.u.b();
        axtkVar.getClass();
        fcsu fcsuVar6 = axtnVarAL.v;
        cmxr cmxrVar = (cmxr) axtnVarAL.w.b();
        cmxrVar.getClass();
        eosc eoscVar = (eosc) axtnVarAL.x.b();
        eoscVar.getClass();
        duration.getClass();
        ckfo ckfoVar = (ckfo) axtnVarAL.y.b();
        ckfoVar.getClass();
        Map map = (Map) axtnVarAL.z.b();
        map.getClass();
        aujz aujzVar = (aujz) axtnVarAL.A.b();
        aujzVar.getClass();
        axth axthVar = (axth) axtnVarAL.B.b();
        axthVar.getClass();
        fcsu fcsuVar7 = axtnVarAL.C;
        fcsu fcsuVar8 = axtnVarAL.D;
        fcsu fcsuVar9 = axtnVarAL.E;
        fcsu fcsuVar10 = axtnVarAL.F;
        fcsu fcsuVar11 = axtnVarAL.G;
        fcsu fcsuVar12 = axtnVarAL.H;
        fcsu fcsuVar13 = axtnVarAL.I;
        fcsu fcsuVar14 = axtnVarAL.J;
        new axtl(axtnVarAL.K, fcsuVar, ayqjVar, cogwVar, fcsuVar2, cqbmVar, fcsuVar3, ajhdVar, axxyVar, ayqdVar, ayqxVar, axsjVar, bvegVar, aypvVar, ayrmVar, optional, cjpoVar, bydbVar, fcsuVar4, fcsuVar5, axtkVar, fcsuVar6, cmxrVar, eoscVar, i, duration, action, null, null, action.getClass().getSimpleName(), ckfoVar, map, aujzVar, axthVar, fcsuVar7, fcsuVar8, fcsuVar9, fcsuVar12, fcsuVar13, fcsuVar10, fcsuVar11, fcsuVar14, axtnVarAL.L).c();
        axxy.d = epochMilli;
    }

    private final void f(MessageCoreData messageCoreData, List list) {
        cqaz.l(messageCoreData);
        if (((Boolean) cgwx.a.e()).booleanValue()) {
            ((bbae) this.w.b()).c(messageCoreData, false);
            list.add(messageCoreData);
            return;
        }
        cqaz.l(list);
        MessageCoreData messageCoreDataW = ((baxe) this.v.b()).w(messageCoreData.C());
        if (messageCoreDataW != null) {
            list.add(messageCoreDataW);
            return;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleDataModel");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.X(cqnc.b, messageCoreData.C());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "addFullMessage", 1794, "PendingMessagesProcessor.java")).q("PendingMessageProcessor: failed to read message");
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0446 A[Catch: all -> 0x0998, TryCatch #5 {all -> 0x0998, blocks: (B:71:0x01b4, B:210:0x078d, B:213:0x079d, B:215:0x07a3, B:219:0x07cd, B:221:0x07d7, B:226:0x07ee, B:228:0x07f4, B:216:0x07ab, B:72:0x01f5, B:39:0x00a7, B:41:0x00b7, B:60:0x018a, B:62:0x0198, B:64:0x019e, B:73:0x0229, B:83:0x024b, B:85:0x0253, B:87:0x0259, B:89:0x025f, B:91:0x0271, B:92:0x0286, B:94:0x02cb, B:114:0x0373, B:120:0x038c, B:124:0x044a, B:131:0x0475, B:139:0x04ae, B:141:0x04df, B:142:0x04f4, B:144:0x04fa, B:145:0x0510, B:147:0x0535, B:179:0x061c, B:181:0x0623, B:183:0x062d, B:184:0x0631, B:186:0x0635, B:187:0x063d, B:191:0x064a, B:193:0x0658, B:195:0x065e, B:197:0x0665, B:199:0x0671, B:201:0x0678, B:203:0x0715, B:205:0x071b, B:206:0x073c, B:200:0x0675, B:202:0x06d6, B:136:0x04a2, B:137:0x04ab, B:128:0x046a, B:129:0x0473, B:123:0x0446, B:111:0x0367, B:112:0x0370, B:97:0x02d5, B:101:0x02f7, B:103:0x031f, B:151:0x0557, B:152:0x056a, B:154:0x0579, B:157:0x0580, B:158:0x058d, B:160:0x059b, B:162:0x05a1, B:164:0x05ae, B:166:0x05d5, B:174:0x060a, B:178:0x0614, B:167:0x05e0, B:169:0x05f1, B:171:0x05f7, B:173:0x05ff, B:44:0x00bf, B:46:0x00db, B:48:0x00e1, B:52:0x00ef, B:54:0x0100, B:55:0x0148, B:56:0x0172, B:57:0x017a, B:208:0x0747, B:229:0x07fa, B:231:0x083a, B:232:0x0854, B:234:0x085a, B:236:0x086e, B:243:0x087b, B:246:0x0887, B:254:0x090e, B:255:0x0915, B:257:0x091b, B:259:0x092b, B:263:0x0934, B:265:0x0942, B:272:0x0953, B:287:0x0986, B:286:0x0983, B:290:0x098f, B:283:0x097e, B:247:0x08ac, B:253:0x090b, B:280:0x097b, B:279:0x0978), top: B:313:0x01b4, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04df A[Catch: all -> 0x0998, TryCatch #5 {all -> 0x0998, blocks: (B:71:0x01b4, B:210:0x078d, B:213:0x079d, B:215:0x07a3, B:219:0x07cd, B:221:0x07d7, B:226:0x07ee, B:228:0x07f4, B:216:0x07ab, B:72:0x01f5, B:39:0x00a7, B:41:0x00b7, B:60:0x018a, B:62:0x0198, B:64:0x019e, B:73:0x0229, B:83:0x024b, B:85:0x0253, B:87:0x0259, B:89:0x025f, B:91:0x0271, B:92:0x0286, B:94:0x02cb, B:114:0x0373, B:120:0x038c, B:124:0x044a, B:131:0x0475, B:139:0x04ae, B:141:0x04df, B:142:0x04f4, B:144:0x04fa, B:145:0x0510, B:147:0x0535, B:179:0x061c, B:181:0x0623, B:183:0x062d, B:184:0x0631, B:186:0x0635, B:187:0x063d, B:191:0x064a, B:193:0x0658, B:195:0x065e, B:197:0x0665, B:199:0x0671, B:201:0x0678, B:203:0x0715, B:205:0x071b, B:206:0x073c, B:200:0x0675, B:202:0x06d6, B:136:0x04a2, B:137:0x04ab, B:128:0x046a, B:129:0x0473, B:123:0x0446, B:111:0x0367, B:112:0x0370, B:97:0x02d5, B:101:0x02f7, B:103:0x031f, B:151:0x0557, B:152:0x056a, B:154:0x0579, B:157:0x0580, B:158:0x058d, B:160:0x059b, B:162:0x05a1, B:164:0x05ae, B:166:0x05d5, B:174:0x060a, B:178:0x0614, B:167:0x05e0, B:169:0x05f1, B:171:0x05f7, B:173:0x05ff, B:44:0x00bf, B:46:0x00db, B:48:0x00e1, B:52:0x00ef, B:54:0x0100, B:55:0x0148, B:56:0x0172, B:57:0x017a, B:208:0x0747, B:229:0x07fa, B:231:0x083a, B:232:0x0854, B:234:0x085a, B:236:0x086e, B:243:0x087b, B:246:0x0887, B:254:0x090e, B:255:0x0915, B:257:0x091b, B:259:0x092b, B:263:0x0934, B:265:0x0942, B:272:0x0953, B:287:0x0986, B:286:0x0983, B:290:0x098f, B:283:0x097e, B:247:0x08ac, B:253:0x090b, B:280:0x097b, B:279:0x0978), top: B:313:0x01b4, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04fa A[Catch: all -> 0x0998, TryCatch #5 {all -> 0x0998, blocks: (B:71:0x01b4, B:210:0x078d, B:213:0x079d, B:215:0x07a3, B:219:0x07cd, B:221:0x07d7, B:226:0x07ee, B:228:0x07f4, B:216:0x07ab, B:72:0x01f5, B:39:0x00a7, B:41:0x00b7, B:60:0x018a, B:62:0x0198, B:64:0x019e, B:73:0x0229, B:83:0x024b, B:85:0x0253, B:87:0x0259, B:89:0x025f, B:91:0x0271, B:92:0x0286, B:94:0x02cb, B:114:0x0373, B:120:0x038c, B:124:0x044a, B:131:0x0475, B:139:0x04ae, B:141:0x04df, B:142:0x04f4, B:144:0x04fa, B:145:0x0510, B:147:0x0535, B:179:0x061c, B:181:0x0623, B:183:0x062d, B:184:0x0631, B:186:0x0635, B:187:0x063d, B:191:0x064a, B:193:0x0658, B:195:0x065e, B:197:0x0665, B:199:0x0671, B:201:0x0678, B:203:0x0715, B:205:0x071b, B:206:0x073c, B:200:0x0675, B:202:0x06d6, B:136:0x04a2, B:137:0x04ab, B:128:0x046a, B:129:0x0473, B:123:0x0446, B:111:0x0367, B:112:0x0370, B:97:0x02d5, B:101:0x02f7, B:103:0x031f, B:151:0x0557, B:152:0x056a, B:154:0x0579, B:157:0x0580, B:158:0x058d, B:160:0x059b, B:162:0x05a1, B:164:0x05ae, B:166:0x05d5, B:174:0x060a, B:178:0x0614, B:167:0x05e0, B:169:0x05f1, B:171:0x05f7, B:173:0x05ff, B:44:0x00bf, B:46:0x00db, B:48:0x00e1, B:52:0x00ef, B:54:0x0100, B:55:0x0148, B:56:0x0172, B:57:0x017a, B:208:0x0747, B:229:0x07fa, B:231:0x083a, B:232:0x0854, B:234:0x085a, B:236:0x086e, B:243:0x087b, B:246:0x0887, B:254:0x090e, B:255:0x0915, B:257:0x091b, B:259:0x092b, B:263:0x0934, B:265:0x0942, B:272:0x0953, B:287:0x0986, B:286:0x0983, B:290:0x098f, B:283:0x097e, B:247:0x08ac, B:253:0x090b, B:280:0x097b, B:279:0x0978), top: B:313:0x01b4, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0535 A[Catch: all -> 0x0998, TryCatch #5 {all -> 0x0998, blocks: (B:71:0x01b4, B:210:0x078d, B:213:0x079d, B:215:0x07a3, B:219:0x07cd, B:221:0x07d7, B:226:0x07ee, B:228:0x07f4, B:216:0x07ab, B:72:0x01f5, B:39:0x00a7, B:41:0x00b7, B:60:0x018a, B:62:0x0198, B:64:0x019e, B:73:0x0229, B:83:0x024b, B:85:0x0253, B:87:0x0259, B:89:0x025f, B:91:0x0271, B:92:0x0286, B:94:0x02cb, B:114:0x0373, B:120:0x038c, B:124:0x044a, B:131:0x0475, B:139:0x04ae, B:141:0x04df, B:142:0x04f4, B:144:0x04fa, B:145:0x0510, B:147:0x0535, B:179:0x061c, B:181:0x0623, B:183:0x062d, B:184:0x0631, B:186:0x0635, B:187:0x063d, B:191:0x064a, B:193:0x0658, B:195:0x065e, B:197:0x0665, B:199:0x0671, B:201:0x0678, B:203:0x0715, B:205:0x071b, B:206:0x073c, B:200:0x0675, B:202:0x06d6, B:136:0x04a2, B:137:0x04ab, B:128:0x046a, B:129:0x0473, B:123:0x0446, B:111:0x0367, B:112:0x0370, B:97:0x02d5, B:101:0x02f7, B:103:0x031f, B:151:0x0557, B:152:0x056a, B:154:0x0579, B:157:0x0580, B:158:0x058d, B:160:0x059b, B:162:0x05a1, B:164:0x05ae, B:166:0x05d5, B:174:0x060a, B:178:0x0614, B:167:0x05e0, B:169:0x05f1, B:171:0x05f7, B:173:0x05ff, B:44:0x00bf, B:46:0x00db, B:48:0x00e1, B:52:0x00ef, B:54:0x0100, B:55:0x0148, B:56:0x0172, B:57:0x017a, B:208:0x0747, B:229:0x07fa, B:231:0x083a, B:232:0x0854, B:234:0x085a, B:236:0x086e, B:243:0x087b, B:246:0x0887, B:254:0x090e, B:255:0x0915, B:257:0x091b, B:259:0x092b, B:263:0x0934, B:265:0x0942, B:272:0x0953, B:287:0x0986, B:286:0x0983, B:290:0x098f, B:283:0x097e, B:247:0x08ac, B:253:0x090b, B:280:0x097b, B:279:0x0978), top: B:313:0x01b4, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05e0 A[Catch: all -> 0x0998, TryCatch #5 {all -> 0x0998, blocks: (B:71:0x01b4, B:210:0x078d, B:213:0x079d, B:215:0x07a3, B:219:0x07cd, B:221:0x07d7, B:226:0x07ee, B:228:0x07f4, B:216:0x07ab, B:72:0x01f5, B:39:0x00a7, B:41:0x00b7, B:60:0x018a, B:62:0x0198, B:64:0x019e, B:73:0x0229, B:83:0x024b, B:85:0x0253, B:87:0x0259, B:89:0x025f, B:91:0x0271, B:92:0x0286, B:94:0x02cb, B:114:0x0373, B:120:0x038c, B:124:0x044a, B:131:0x0475, B:139:0x04ae, B:141:0x04df, B:142:0x04f4, B:144:0x04fa, B:145:0x0510, B:147:0x0535, B:179:0x061c, B:181:0x0623, B:183:0x062d, B:184:0x0631, B:186:0x0635, B:187:0x063d, B:191:0x064a, B:193:0x0658, B:195:0x065e, B:197:0x0665, B:199:0x0671, B:201:0x0678, B:203:0x0715, B:205:0x071b, B:206:0x073c, B:200:0x0675, B:202:0x06d6, B:136:0x04a2, B:137:0x04ab, B:128:0x046a, B:129:0x0473, B:123:0x0446, B:111:0x0367, B:112:0x0370, B:97:0x02d5, B:101:0x02f7, B:103:0x031f, B:151:0x0557, B:152:0x056a, B:154:0x0579, B:157:0x0580, B:158:0x058d, B:160:0x059b, B:162:0x05a1, B:164:0x05ae, B:166:0x05d5, B:174:0x060a, B:178:0x0614, B:167:0x05e0, B:169:0x05f1, B:171:0x05f7, B:173:0x05ff, B:44:0x00bf, B:46:0x00db, B:48:0x00e1, B:52:0x00ef, B:54:0x0100, B:55:0x0148, B:56:0x0172, B:57:0x017a, B:208:0x0747, B:229:0x07fa, B:231:0x083a, B:232:0x0854, B:234:0x085a, B:236:0x086e, B:243:0x087b, B:246:0x0887, B:254:0x090e, B:255:0x0915, B:257:0x091b, B:259:0x092b, B:263:0x0934, B:265:0x0942, B:272:0x0953, B:287:0x0986, B:286:0x0983, B:290:0x098f, B:283:0x097e, B:247:0x08ac, B:253:0x090b, B:280:0x097b, B:279:0x0978), top: B:313:0x01b4, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0623 A[Catch: all -> 0x0998, TryCatch #5 {all -> 0x0998, blocks: (B:71:0x01b4, B:210:0x078d, B:213:0x079d, B:215:0x07a3, B:219:0x07cd, B:221:0x07d7, B:226:0x07ee, B:228:0x07f4, B:216:0x07ab, B:72:0x01f5, B:39:0x00a7, B:41:0x00b7, B:60:0x018a, B:62:0x0198, B:64:0x019e, B:73:0x0229, B:83:0x024b, B:85:0x0253, B:87:0x0259, B:89:0x025f, B:91:0x0271, B:92:0x0286, B:94:0x02cb, B:114:0x0373, B:120:0x038c, B:124:0x044a, B:131:0x0475, B:139:0x04ae, B:141:0x04df, B:142:0x04f4, B:144:0x04fa, B:145:0x0510, B:147:0x0535, B:179:0x061c, B:181:0x0623, B:183:0x062d, B:184:0x0631, B:186:0x0635, B:187:0x063d, B:191:0x064a, B:193:0x0658, B:195:0x065e, B:197:0x0665, B:199:0x0671, B:201:0x0678, B:203:0x0715, B:205:0x071b, B:206:0x073c, B:200:0x0675, B:202:0x06d6, B:136:0x04a2, B:137:0x04ab, B:128:0x046a, B:129:0x0473, B:123:0x0446, B:111:0x0367, B:112:0x0370, B:97:0x02d5, B:101:0x02f7, B:103:0x031f, B:151:0x0557, B:152:0x056a, B:154:0x0579, B:157:0x0580, B:158:0x058d, B:160:0x059b, B:162:0x05a1, B:164:0x05ae, B:166:0x05d5, B:174:0x060a, B:178:0x0614, B:167:0x05e0, B:169:0x05f1, B:171:0x05f7, B:173:0x05ff, B:44:0x00bf, B:46:0x00db, B:48:0x00e1, B:52:0x00ef, B:54:0x0100, B:55:0x0148, B:56:0x0172, B:57:0x017a, B:208:0x0747, B:229:0x07fa, B:231:0x083a, B:232:0x0854, B:234:0x085a, B:236:0x086e, B:243:0x087b, B:246:0x0887, B:254:0x090e, B:255:0x0915, B:257:0x091b, B:259:0x092b, B:263:0x0934, B:265:0x0942, B:272:0x0953, B:287:0x0986, B:286:0x0983, B:290:0x098f, B:283:0x097e, B:247:0x08ac, B:253:0x090b, B:280:0x097b, B:279:0x0978), top: B:313:0x01b4, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x064a A[Catch: all -> 0x0998, TRY_ENTER, TryCatch #5 {all -> 0x0998, blocks: (B:71:0x01b4, B:210:0x078d, B:213:0x079d, B:215:0x07a3, B:219:0x07cd, B:221:0x07d7, B:226:0x07ee, B:228:0x07f4, B:216:0x07ab, B:72:0x01f5, B:39:0x00a7, B:41:0x00b7, B:60:0x018a, B:62:0x0198, B:64:0x019e, B:73:0x0229, B:83:0x024b, B:85:0x0253, B:87:0x0259, B:89:0x025f, B:91:0x0271, B:92:0x0286, B:94:0x02cb, B:114:0x0373, B:120:0x038c, B:124:0x044a, B:131:0x0475, B:139:0x04ae, B:141:0x04df, B:142:0x04f4, B:144:0x04fa, B:145:0x0510, B:147:0x0535, B:179:0x061c, B:181:0x0623, B:183:0x062d, B:184:0x0631, B:186:0x0635, B:187:0x063d, B:191:0x064a, B:193:0x0658, B:195:0x065e, B:197:0x0665, B:199:0x0671, B:201:0x0678, B:203:0x0715, B:205:0x071b, B:206:0x073c, B:200:0x0675, B:202:0x06d6, B:136:0x04a2, B:137:0x04ab, B:128:0x046a, B:129:0x0473, B:123:0x0446, B:111:0x0367, B:112:0x0370, B:97:0x02d5, B:101:0x02f7, B:103:0x031f, B:151:0x0557, B:152:0x056a, B:154:0x0579, B:157:0x0580, B:158:0x058d, B:160:0x059b, B:162:0x05a1, B:164:0x05ae, B:166:0x05d5, B:174:0x060a, B:178:0x0614, B:167:0x05e0, B:169:0x05f1, B:171:0x05f7, B:173:0x05ff, B:44:0x00bf, B:46:0x00db, B:48:0x00e1, B:52:0x00ef, B:54:0x0100, B:55:0x0148, B:56:0x0172, B:57:0x017a, B:208:0x0747, B:229:0x07fa, B:231:0x083a, B:232:0x0854, B:234:0x085a, B:236:0x086e, B:243:0x087b, B:246:0x0887, B:254:0x090e, B:255:0x0915, B:257:0x091b, B:259:0x092b, B:263:0x0934, B:265:0x0942, B:272:0x0953, B:287:0x0986, B:286:0x0983, B:290:0x098f, B:283:0x097e, B:247:0x08ac, B:253:0x090b, B:280:0x097b, B:279:0x0978), top: B:313:0x01b4, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06d6 A[Catch: all -> 0x0998, TryCatch #5 {all -> 0x0998, blocks: (B:71:0x01b4, B:210:0x078d, B:213:0x079d, B:215:0x07a3, B:219:0x07cd, B:221:0x07d7, B:226:0x07ee, B:228:0x07f4, B:216:0x07ab, B:72:0x01f5, B:39:0x00a7, B:41:0x00b7, B:60:0x018a, B:62:0x0198, B:64:0x019e, B:73:0x0229, B:83:0x024b, B:85:0x0253, B:87:0x0259, B:89:0x025f, B:91:0x0271, B:92:0x0286, B:94:0x02cb, B:114:0x0373, B:120:0x038c, B:124:0x044a, B:131:0x0475, B:139:0x04ae, B:141:0x04df, B:142:0x04f4, B:144:0x04fa, B:145:0x0510, B:147:0x0535, B:179:0x061c, B:181:0x0623, B:183:0x062d, B:184:0x0631, B:186:0x0635, B:187:0x063d, B:191:0x064a, B:193:0x0658, B:195:0x065e, B:197:0x0665, B:199:0x0671, B:201:0x0678, B:203:0x0715, B:205:0x071b, B:206:0x073c, B:200:0x0675, B:202:0x06d6, B:136:0x04a2, B:137:0x04ab, B:128:0x046a, B:129:0x0473, B:123:0x0446, B:111:0x0367, B:112:0x0370, B:97:0x02d5, B:101:0x02f7, B:103:0x031f, B:151:0x0557, B:152:0x056a, B:154:0x0579, B:157:0x0580, B:158:0x058d, B:160:0x059b, B:162:0x05a1, B:164:0x05ae, B:166:0x05d5, B:174:0x060a, B:178:0x0614, B:167:0x05e0, B:169:0x05f1, B:171:0x05f7, B:173:0x05ff, B:44:0x00bf, B:46:0x00db, B:48:0x00e1, B:52:0x00ef, B:54:0x0100, B:55:0x0148, B:56:0x0172, B:57:0x017a, B:208:0x0747, B:229:0x07fa, B:231:0x083a, B:232:0x0854, B:234:0x085a, B:236:0x086e, B:243:0x087b, B:246:0x0887, B:254:0x090e, B:255:0x0915, B:257:0x091b, B:259:0x092b, B:263:0x0934, B:265:0x0942, B:272:0x0953, B:287:0x0986, B:286:0x0983, B:290:0x098f, B:283:0x097e, B:247:0x08ac, B:253:0x090b, B:280:0x097b, B:279:0x0978), top: B:313:0x01b4, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x071b A[Catch: all -> 0x0998, TryCatch #5 {all -> 0x0998, blocks: (B:71:0x01b4, B:210:0x078d, B:213:0x079d, B:215:0x07a3, B:219:0x07cd, B:221:0x07d7, B:226:0x07ee, B:228:0x07f4, B:216:0x07ab, B:72:0x01f5, B:39:0x00a7, B:41:0x00b7, B:60:0x018a, B:62:0x0198, B:64:0x019e, B:73:0x0229, B:83:0x024b, B:85:0x0253, B:87:0x0259, B:89:0x025f, B:91:0x0271, B:92:0x0286, B:94:0x02cb, B:114:0x0373, B:120:0x038c, B:124:0x044a, B:131:0x0475, B:139:0x04ae, B:141:0x04df, B:142:0x04f4, B:144:0x04fa, B:145:0x0510, B:147:0x0535, B:179:0x061c, B:181:0x0623, B:183:0x062d, B:184:0x0631, B:186:0x0635, B:187:0x063d, B:191:0x064a, B:193:0x0658, B:195:0x065e, B:197:0x0665, B:199:0x0671, B:201:0x0678, B:203:0x0715, B:205:0x071b, B:206:0x073c, B:200:0x0675, B:202:0x06d6, B:136:0x04a2, B:137:0x04ab, B:128:0x046a, B:129:0x0473, B:123:0x0446, B:111:0x0367, B:112:0x0370, B:97:0x02d5, B:101:0x02f7, B:103:0x031f, B:151:0x0557, B:152:0x056a, B:154:0x0579, B:157:0x0580, B:158:0x058d, B:160:0x059b, B:162:0x05a1, B:164:0x05ae, B:166:0x05d5, B:174:0x060a, B:178:0x0614, B:167:0x05e0, B:169:0x05f1, B:171:0x05f7, B:173:0x05ff, B:44:0x00bf, B:46:0x00db, B:48:0x00e1, B:52:0x00ef, B:54:0x0100, B:55:0x0148, B:56:0x0172, B:57:0x017a, B:208:0x0747, B:229:0x07fa, B:231:0x083a, B:232:0x0854, B:234:0x085a, B:236:0x086e, B:243:0x087b, B:246:0x0887, B:254:0x090e, B:255:0x0915, B:257:0x091b, B:259:0x092b, B:263:0x0934, B:265:0x0942, B:272:0x0953, B:287:0x0986, B:286:0x0983, B:290:0x098f, B:283:0x097e, B:247:0x08ac, B:253:0x090b, B:280:0x097b, B:279:0x0978), top: B:313:0x01b4, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x073c A[Catch: all -> 0x0998, TryCatch #5 {all -> 0x0998, blocks: (B:71:0x01b4, B:210:0x078d, B:213:0x079d, B:215:0x07a3, B:219:0x07cd, B:221:0x07d7, B:226:0x07ee, B:228:0x07f4, B:216:0x07ab, B:72:0x01f5, B:39:0x00a7, B:41:0x00b7, B:60:0x018a, B:62:0x0198, B:64:0x019e, B:73:0x0229, B:83:0x024b, B:85:0x0253, B:87:0x0259, B:89:0x025f, B:91:0x0271, B:92:0x0286, B:94:0x02cb, B:114:0x0373, B:120:0x038c, B:124:0x044a, B:131:0x0475, B:139:0x04ae, B:141:0x04df, B:142:0x04f4, B:144:0x04fa, B:145:0x0510, B:147:0x0535, B:179:0x061c, B:181:0x0623, B:183:0x062d, B:184:0x0631, B:186:0x0635, B:187:0x063d, B:191:0x064a, B:193:0x0658, B:195:0x065e, B:197:0x0665, B:199:0x0671, B:201:0x0678, B:203:0x0715, B:205:0x071b, B:206:0x073c, B:200:0x0675, B:202:0x06d6, B:136:0x04a2, B:137:0x04ab, B:128:0x046a, B:129:0x0473, B:123:0x0446, B:111:0x0367, B:112:0x0370, B:97:0x02d5, B:101:0x02f7, B:103:0x031f, B:151:0x0557, B:152:0x056a, B:154:0x0579, B:157:0x0580, B:158:0x058d, B:160:0x059b, B:162:0x05a1, B:164:0x05ae, B:166:0x05d5, B:174:0x060a, B:178:0x0614, B:167:0x05e0, B:169:0x05f1, B:171:0x05f7, B:173:0x05ff, B:44:0x00bf, B:46:0x00db, B:48:0x00e1, B:52:0x00ef, B:54:0x0100, B:55:0x0148, B:56:0x0172, B:57:0x017a, B:208:0x0747, B:229:0x07fa, B:231:0x083a, B:232:0x0854, B:234:0x085a, B:236:0x086e, B:243:0x087b, B:246:0x0887, B:254:0x090e, B:255:0x0915, B:257:0x091b, B:259:0x092b, B:263:0x0934, B:265:0x0942, B:272:0x0953, B:287:0x0986, B:286:0x0983, B:290:0x098f, B:283:0x097e, B:247:0x08ac, B:253:0x090b, B:280:0x097b, B:279:0x0978), top: B:313:0x01b4, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x07f4 A[Catch: all -> 0x0998, TryCatch #5 {all -> 0x0998, blocks: (B:71:0x01b4, B:210:0x078d, B:213:0x079d, B:215:0x07a3, B:219:0x07cd, B:221:0x07d7, B:226:0x07ee, B:228:0x07f4, B:216:0x07ab, B:72:0x01f5, B:39:0x00a7, B:41:0x00b7, B:60:0x018a, B:62:0x0198, B:64:0x019e, B:73:0x0229, B:83:0x024b, B:85:0x0253, B:87:0x0259, B:89:0x025f, B:91:0x0271, B:92:0x0286, B:94:0x02cb, B:114:0x0373, B:120:0x038c, B:124:0x044a, B:131:0x0475, B:139:0x04ae, B:141:0x04df, B:142:0x04f4, B:144:0x04fa, B:145:0x0510, B:147:0x0535, B:179:0x061c, B:181:0x0623, B:183:0x062d, B:184:0x0631, B:186:0x0635, B:187:0x063d, B:191:0x064a, B:193:0x0658, B:195:0x065e, B:197:0x0665, B:199:0x0671, B:201:0x0678, B:203:0x0715, B:205:0x071b, B:206:0x073c, B:200:0x0675, B:202:0x06d6, B:136:0x04a2, B:137:0x04ab, B:128:0x046a, B:129:0x0473, B:123:0x0446, B:111:0x0367, B:112:0x0370, B:97:0x02d5, B:101:0x02f7, B:103:0x031f, B:151:0x0557, B:152:0x056a, B:154:0x0579, B:157:0x0580, B:158:0x058d, B:160:0x059b, B:162:0x05a1, B:164:0x05ae, B:166:0x05d5, B:174:0x060a, B:178:0x0614, B:167:0x05e0, B:169:0x05f1, B:171:0x05f7, B:173:0x05ff, B:44:0x00bf, B:46:0x00db, B:48:0x00e1, B:52:0x00ef, B:54:0x0100, B:55:0x0148, B:56:0x0172, B:57:0x017a, B:208:0x0747, B:229:0x07fa, B:231:0x083a, B:232:0x0854, B:234:0x085a, B:236:0x086e, B:243:0x087b, B:246:0x0887, B:254:0x090e, B:255:0x0915, B:257:0x091b, B:259:0x092b, B:263:0x0934, B:265:0x0942, B:272:0x0953, B:287:0x0986, B:286:0x0983, B:290:0x098f, B:283:0x097e, B:247:0x08ac, B:253:0x090b, B:280:0x097b, B:279:0x0978), top: B:313:0x01b4, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[Catch: all -> 0x099a, TRY_LEAVE, TryCatch #6 {all -> 0x099a, blocks: (B:3:0x0008, B:4:0x000c, B:13:0x002d, B:14:0x0031, B:16:0x0038, B:25:0x0068, B:28:0x0078, B:35:0x0099, B:37:0x009f, B:22:0x005c), top: B:314:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0835 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(java.util.List r40, final long r41, defpackage.cldb r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axtl.g(java.util.List, long, cldb):void");
    }

    private final void h() {
        cqey cqeyVar = (cqey) this.j.a();
        cqer cqerVar = (cqer) cqeu.a.createBuilder();
        cqet cqetVar = cqet.ALL_ACTIVE_SUBSCRIPTIONS;
        cqerVar.copyOnWrite();
        cqeu cqeuVar = (cqeu) cqerVar.instance;
        cqeuVar.c = cqetVar.e;
        cqeuVar.b |= 1;
        cqeyVar.m(this.x.a, (cqeu) cqerVar.build());
    }

    private final void i(MessageCoreData messageCoreData, SelfIdentityId selfIdentityId) {
        m(1);
        messageCoreData.aP(selfIdentityId);
        baxe baxeVar = (baxe) this.v.b();
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        MessageIdType messageIdTypeC = messageCoreData.C();
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("updateMessageSelfId");
        brduVar.K(((SelfIdentityIdImpl) selfIdentityId).a);
        baxeVar.V(conversationIdTypeA, messageIdTypeC, brduVar);
    }

    private static boolean j(List list, Object obj) {
        if (obj == null) {
            return false;
        }
        list.add(obj);
        return true;
    }

    private final boolean k(MessageCoreData messageCoreData) {
        if (((aptx) this.F.b()).a() && messageCoreData.H() != null) {
            MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
            messagePartCoreDataH.getClass();
            athh athhVarZ = messagePartCoreDataH.z();
            if (athhVarZ != null) {
                return ((atjz) this.J.b()).s(athhVarZ);
            }
        }
        return ((Boolean) cokd.e(messageCoreData.C()).map(new Function() { // from class: cojm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = cokd.a;
                return Boolean.valueOf(((cokk) obj).n() == null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    private final boolean l(MessageCoreData messageCoreData) {
        return !((cqey) this.j.a()).o(a(messageCoreData));
    }

    private final void m(int i) {
        if (((aqry) this.G.b()).a()) {
            ((ains) this.r.b()).e("Bugle.PendingMessagesProcessor.UpdateMessageSelf.Count", i);
        }
    }

    private final void n(int i) {
        cqaz.d(i, 0, 7);
        this.ad[i] = true;
    }

    public final int a(MessageCoreData messageCoreData) {
        fcsu fcsuVar = this.k;
        axcy axcyVarE = ((bbdl) fcsuVar.b()).e(messageCoreData.v());
        if (axcyVarE == null) {
            axcyVarE = ((bbdl) fcsuVar.b()).b();
        }
        if (axcyVarE != null) {
            return axcyVarE.e();
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x07f3  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axtl.c():void");
    }
}
