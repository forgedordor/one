package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.ajhd;
import defpackage.axkf;
import defpackage.aydm;
import defpackage.ayou;
import defpackage.ayqb;
import defpackage.ayqd;
import defpackage.bahv;
import defpackage.bbdl;
import defpackage.bbfn;
import defpackage.brdr;
import defpackage.bveg;
import defpackage.cauu;
import defpackage.cmot;
import defpackage.cmqj;
import defpackage.cogw;
import defpackage.cqaz;
import defpackage.cqce;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ekrg;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveWapPushSiMessageAction extends Action<MessageCoreData> implements Parcelable {
    private final ayqd A;
    private final dqsn B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    private final cauu F;
    private final fcsu G;
    private final fcsu H;
    private final fcsu I;
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final axkf d;
    public final bbfn e;
    public final bveg f;
    public final bahv g;
    public final fcsu h;
    private final Context k;
    private final cogw l;
    private final cmot m;
    private final ajhd n;
    private final cmqj o;
    private final fcsu p;
    private final fcsu q;
    private final bbdl r;
    private final ayou s;
    private static final cqce i = cqce.g("BugleDataModel", "ReceiveWapPushSiMessageAction");
    private static final ekrg j = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/ReceiveWapPushSiMessageAction");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new aydm();

    /* compiled from: PG */
    public interface a {
        ayqb bk();
    }

    public ReceiveWapPushSiMessageAction(Context context, fcsu fcsuVar, cogw cogwVar, cmot cmotVar, ajhd ajhdVar, cmqj cmqjVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bbdl bbdlVar, axkf axkfVar, ayou ayouVar, bbfn bbfnVar, ayqd ayqdVar, bveg bvegVar, bahv bahvVar, dqsn dqsnVar, fcsu fcsuVar6, cauu cauuVar, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, int i2, byte[] bArr, long j2) {
        super(elgm.RECEIVE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.A = ayqdVar;
        this.B = dqsnVar;
        this.C = fcsuVar6;
        this.D = fcsuVar7;
        this.E = fcsuVar8;
        this.v.r("sub_id", i2);
        this.v.q("push_data", bArr);
        this.v.s("message_logging_id", j2);
        this.k = context;
        this.a = fcsuVar;
        this.l = cogwVar;
        this.m = cmotVar;
        this.n = ajhdVar;
        this.o = cmqjVar;
        this.b = fcsuVar2;
        this.p = fcsuVar3;
        this.c = fcsuVar4;
        this.q = fcsuVar5;
        this.r = bbdlVar;
        this.d = axkfVar;
        this.s = ayouVar;
        this.e = bbfnVar;
        this.f = bvegVar;
        this.g = bahvVar;
        this.F = cauuVar;
        this.h = fcsuVar9;
        this.G = fcsuVar10;
        this.H = fcsuVar11;
        this.I = fcsuVar12;
    }

    private final MessageCoreData h(final String str) {
        MessageCoreData messageCoreDataA;
        eieu eieuVarK = eiiy.k("ReceiveWapPushSiMessageAction#readWapPushSiMessageData");
        try {
            cqaz.h();
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("readWapPushSiMessageData");
            brdrVarD.h(new Function() { // from class: aydi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.ap(new dqpj("messages.mms_transaction_id", 1, String.valueOf(str)));
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            MessagesTable.BindData bindData = (MessagesTable.BindData) brdrVarD.b().l();
            if (bindData != null) {
                messageCoreDataA = this.f.a();
                messageCoreDataA.aN(bindData);
            } else {
                messageCoreDataA = null;
            }
            eieuVarK.close();
            return messageCoreDataA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ReceiveWapPushSiMessageAction");
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0231, code lost:
    
        if (r2 != r6) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0235, code lost:
    
        r3.g = r2 + 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x0101. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016f A[Catch: all -> 0x02f9, TryCatch #2 {all -> 0x02f9, blocks: (B:196:0x02ef, B:202:0x031c, B:205:0x0330, B:207:0x0345, B:209:0x034d, B:211:0x0362, B:213:0x036f, B:215:0x0393, B:217:0x0399, B:219:0x03b9, B:220:0x03d1, B:227:0x03f5, B:228:0x03f8, B:230:0x0400, B:240:0x0435, B:243:0x043e, B:248:0x044d, B:250:0x0461, B:254:0x0482, B:256:0x0488, B:258:0x0492, B:259:0x049b, B:231:0x0410, B:222:0x03d7, B:223:0x03dd, B:224:0x03e3, B:225:0x03e9, B:226:0x03ef, B:218:0x03b4, B:214:0x038c, B:210:0x035d, B:206:0x0340, B:23:0x0064, B:25:0x0071, B:28:0x0079, B:29:0x007b, B:30:0x0087, B:45:0x00b7, B:47:0x00bd, B:49:0x00c3, B:51:0x00c9, B:53:0x00cd, B:55:0x00d2, B:58:0x00d9, B:182:0x02cd, B:189:0x02e0, B:191:0x02e4, B:74:0x00fb, B:75:0x0101, B:77:0x0106, B:80:0x0111, B:127:0x0224, B:134:0x0235, B:136:0x023c, B:137:0x0241, B:171:0x02ab, B:144:0x0254, B:147:0x025b, B:161:0x0295, B:168:0x02a4, B:148:0x0260, B:149:0x0268, B:151:0x026c, B:153:0x0270, B:155:0x027b, B:157:0x0283, B:160:0x0288, B:82:0x0119, B:89:0x012a, B:92:0x0136, B:93:0x0140, B:100:0x0167, B:103:0x016f, B:95:0x0144, B:96:0x014a, B:97:0x014f, B:98:0x0156, B:99:0x015d, B:104:0x0178, B:124:0x0210, B:125:0x0215, B:107:0x0188, B:110:0x019b, B:114:0x01a9, B:116:0x01c5, B:117:0x01dc, B:126:0x021a, B:177:0x02bf, B:180:0x02c9), top: B:317:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ab A[Catch: all -> 0x02f9, TryCatch #2 {all -> 0x02f9, blocks: (B:196:0x02ef, B:202:0x031c, B:205:0x0330, B:207:0x0345, B:209:0x034d, B:211:0x0362, B:213:0x036f, B:215:0x0393, B:217:0x0399, B:219:0x03b9, B:220:0x03d1, B:227:0x03f5, B:228:0x03f8, B:230:0x0400, B:240:0x0435, B:243:0x043e, B:248:0x044d, B:250:0x0461, B:254:0x0482, B:256:0x0488, B:258:0x0492, B:259:0x049b, B:231:0x0410, B:222:0x03d7, B:223:0x03dd, B:224:0x03e3, B:225:0x03e9, B:226:0x03ef, B:218:0x03b4, B:214:0x038c, B:210:0x035d, B:206:0x0340, B:23:0x0064, B:25:0x0071, B:28:0x0079, B:29:0x007b, B:30:0x0087, B:45:0x00b7, B:47:0x00bd, B:49:0x00c3, B:51:0x00c9, B:53:0x00cd, B:55:0x00d2, B:58:0x00d9, B:182:0x02cd, B:189:0x02e0, B:191:0x02e4, B:74:0x00fb, B:75:0x0101, B:77:0x0106, B:80:0x0111, B:127:0x0224, B:134:0x0235, B:136:0x023c, B:137:0x0241, B:171:0x02ab, B:144:0x0254, B:147:0x025b, B:161:0x0295, B:168:0x02a4, B:148:0x0260, B:149:0x0268, B:151:0x026c, B:153:0x0270, B:155:0x027b, B:157:0x0283, B:160:0x0288, B:82:0x0119, B:89:0x012a, B:92:0x0136, B:93:0x0140, B:100:0x0167, B:103:0x016f, B:95:0x0144, B:96:0x014a, B:97:0x014f, B:98:0x0156, B:99:0x015d, B:104:0x0178, B:124:0x0210, B:125:0x0215, B:107:0x0188, B:110:0x019b, B:114:0x01a9, B:116:0x01c5, B:117:0x01dc, B:126:0x021a, B:177:0x02bf, B:180:0x02c9), top: B:317:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ec A[PHI: r20 r29
      0x02ec: PHI (r20v1 int) = 
      (r20v0 int)
      (r20v3 int)
      (r20v3 int)
      (r20v3 int)
      (r20v4 int)
      (r20v4 int)
      (r20v4 int)
      (r20v6 int)
      (r20v12 int)
      (r20v14 int)
      (r20v16 int)
     binds: [B:193:0x02ea, B:186:0x02db, B:188:0x02de, B:190:0x02e2, B:342:0x02ec, B:343:0x02ec, B:176:0x02be, B:170:0x02aa, B:121:0x020a, B:133:0x0233, B:68:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r29v2 cogw) = 
      (r29v1 cogw)
      (r29v4 cogw)
      (r29v4 cogw)
      (r29v4 cogw)
      (r29v5 cogw)
      (r29v5 cogw)
      (r29v5 cogw)
      (r29v6 cogw)
      (r29v6 cogw)
      (r29v6 cogw)
      (r29v6 cogw)
     binds: [B:193:0x02ea, B:186:0x02db, B:188:0x02de, B:190:0x02e2, B:342:0x02ec, B:343:0x02ec, B:176:0x02be, B:170:0x02aa, B:121:0x020a, B:133:0x0233, B:68:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x047c A[Catch: all -> 0x0724, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0724, blocks: (B:3:0x0009, B:200:0x02fc, B:234:0x0422, B:238:0x042d, B:245:0x0447, B:252:0x047c, B:260:0x04a0, B:262:0x050f, B:264:0x0515, B:266:0x0554, B:272:0x0593, B:274:0x0599, B:275:0x05a2, B:277:0x05a8, B:278:0x05b5, B:279:0x05ba, B:281:0x05d2, B:282:0x05db, B:284:0x0627, B:296:0x0686, B:298:0x068b, B:300:0x06f7, B:290:0x0647, B:292:0x0653, B:293:0x065b, B:295:0x0680, B:286:0x0630, B:299:0x06ef, B:265:0x0518, B:267:0x0567, B:269:0x056f, B:271:0x0586, B:270:0x0583, B:301:0x06fd, B:304:0x070c, B:305:0x0716, B:9:0x003c, B:12:0x0043), top: B:314:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[Catch: all -> 0x02f9, TryCatch #2 {all -> 0x02f9, blocks: (B:196:0x02ef, B:202:0x031c, B:205:0x0330, B:207:0x0345, B:209:0x034d, B:211:0x0362, B:213:0x036f, B:215:0x0393, B:217:0x0399, B:219:0x03b9, B:220:0x03d1, B:227:0x03f5, B:228:0x03f8, B:230:0x0400, B:240:0x0435, B:243:0x043e, B:248:0x044d, B:250:0x0461, B:254:0x0482, B:256:0x0488, B:258:0x0492, B:259:0x049b, B:231:0x0410, B:222:0x03d7, B:223:0x03dd, B:224:0x03e3, B:225:0x03e9, B:226:0x03ef, B:218:0x03b4, B:214:0x038c, B:210:0x035d, B:206:0x0340, B:23:0x0064, B:25:0x0071, B:28:0x0079, B:29:0x007b, B:30:0x0087, B:45:0x00b7, B:47:0x00bd, B:49:0x00c3, B:51:0x00c9, B:53:0x00cd, B:55:0x00d2, B:58:0x00d9, B:182:0x02cd, B:189:0x02e0, B:191:0x02e4, B:74:0x00fb, B:75:0x0101, B:77:0x0106, B:80:0x0111, B:127:0x0224, B:134:0x0235, B:136:0x023c, B:137:0x0241, B:171:0x02ab, B:144:0x0254, B:147:0x025b, B:161:0x0295, B:168:0x02a4, B:148:0x0260, B:149:0x0268, B:151:0x026c, B:153:0x0270, B:155:0x027b, B:157:0x0283, B:160:0x0288, B:82:0x0119, B:89:0x012a, B:92:0x0136, B:93:0x0140, B:100:0x0167, B:103:0x016f, B:95:0x0144, B:96:0x014a, B:97:0x014f, B:98:0x0156, B:99:0x015d, B:104:0x0178, B:124:0x0210, B:125:0x0215, B:107:0x0188, B:110:0x019b, B:114:0x01a9, B:116:0x01c5, B:117:0x01dc, B:126:0x021a, B:177:0x02bf, B:180:0x02c9), top: B:317:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x068b A[Catch: all -> 0x0724, TryCatch #0 {all -> 0x0724, blocks: (B:3:0x0009, B:200:0x02fc, B:234:0x0422, B:238:0x042d, B:245:0x0447, B:252:0x047c, B:260:0x04a0, B:262:0x050f, B:264:0x0515, B:266:0x0554, B:272:0x0593, B:274:0x0599, B:275:0x05a2, B:277:0x05a8, B:278:0x05b5, B:279:0x05ba, B:281:0x05d2, B:282:0x05db, B:284:0x0627, B:296:0x0686, B:298:0x068b, B:300:0x06f7, B:290:0x0647, B:292:0x0653, B:293:0x065b, B:295:0x0680, B:286:0x0630, B:299:0x06ef, B:265:0x0518, B:267:0x0567, B:269:0x056f, B:271:0x0586, B:270:0x0583, B:301:0x06fd, B:304:0x070c, B:305:0x0716, B:9:0x003c, B:12:0x0043), top: B:314:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x016d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0231 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136 A[Catch: all -> 0x02f9, TryCatch #2 {all -> 0x02f9, blocks: (B:196:0x02ef, B:202:0x031c, B:205:0x0330, B:207:0x0345, B:209:0x034d, B:211:0x0362, B:213:0x036f, B:215:0x0393, B:217:0x0399, B:219:0x03b9, B:220:0x03d1, B:227:0x03f5, B:228:0x03f8, B:230:0x0400, B:240:0x0435, B:243:0x043e, B:248:0x044d, B:250:0x0461, B:254:0x0482, B:256:0x0488, B:258:0x0492, B:259:0x049b, B:231:0x0410, B:222:0x03d7, B:223:0x03dd, B:224:0x03e3, B:225:0x03e9, B:226:0x03ef, B:218:0x03b4, B:214:0x038c, B:210:0x035d, B:206:0x0340, B:23:0x0064, B:25:0x0071, B:28:0x0079, B:29:0x007b, B:30:0x0087, B:45:0x00b7, B:47:0x00bd, B:49:0x00c3, B:51:0x00c9, B:53:0x00cd, B:55:0x00d2, B:58:0x00d9, B:182:0x02cd, B:189:0x02e0, B:191:0x02e4, B:74:0x00fb, B:75:0x0101, B:77:0x0106, B:80:0x0111, B:127:0x0224, B:134:0x0235, B:136:0x023c, B:137:0x0241, B:171:0x02ab, B:144:0x0254, B:147:0x025b, B:161:0x0295, B:168:0x02a4, B:148:0x0260, B:149:0x0268, B:151:0x026c, B:153:0x0270, B:155:0x027b, B:157:0x0283, B:160:0x0288, B:82:0x0119, B:89:0x012a, B:92:0x0136, B:93:0x0140, B:100:0x0167, B:103:0x016f, B:95:0x0144, B:96:0x014a, B:97:0x014f, B:98:0x0156, B:99:0x015d, B:104:0x0178, B:124:0x0210, B:125:0x0215, B:107:0x0188, B:110:0x019b, B:114:0x01a9, B:116:0x01c5, B:117:0x01dc, B:126:0x021a, B:177:0x02bf, B:180:0x02c9), top: B:317:0x0064 }] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object b() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ReceiveWapPushSiMessageAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveWapPushSiMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fT() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        C(parcel, i2);
    }

    public ReceiveWapPushSiMessageAction(Context context, fcsu fcsuVar, cogw cogwVar, cmot cmotVar, ajhd ajhdVar, cmqj cmqjVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bbdl bbdlVar, axkf axkfVar, ayou ayouVar, bbfn bbfnVar, ayqd ayqdVar, bveg bvegVar, bahv bahvVar, dqsn dqsnVar, fcsu fcsuVar6, cauu cauuVar, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, Parcel parcel) {
        super(parcel, elgm.RECEIVE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.k = context;
        this.a = fcsuVar;
        this.l = cogwVar;
        this.m = cmotVar;
        this.n = ajhdVar;
        this.o = cmqjVar;
        this.b = fcsuVar2;
        this.p = fcsuVar3;
        this.c = fcsuVar4;
        this.q = fcsuVar5;
        this.r = bbdlVar;
        this.d = axkfVar;
        this.s = ayouVar;
        this.e = bbfnVar;
        this.A = ayqdVar;
        this.f = bvegVar;
        this.g = bahvVar;
        this.B = dqsnVar;
        this.C = fcsuVar6;
        this.F = cauuVar;
        this.D = fcsuVar7;
        this.E = fcsuVar8;
        this.h = fcsuVar9;
        this.G = fcsuVar10;
        this.H = fcsuVar11;
        this.I = fcsuVar12;
    }
}
