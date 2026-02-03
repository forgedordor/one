package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axrj {
    public static final eksp a = eksp.c("BugleNotifications");
    public static final eksp b = eksp.c("BugleDataModel");
    public static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageProcessor");
    public final fcsu A;
    public final fcsu B;
    public final fcsu C;
    public final fcsu D;
    public final fcsu E;
    public final fcsu F;
    public final fcsu G;
    public final fdjx H;
    public final fcsu I;
    public final fcsu J;
    public final AtomicReference K;
    public final fcsu L;
    public final fcsu M;
    public final fcsu N;
    public final arnv O;
    public final Map P;
    public MessageIdType Q;
    public boolean R;
    public final axpg S;
    public final ayeo T;
    private final Context U;
    private final fcsu V;
    private final fcsu W;
    private final fcsu X;
    private final fcsu Y;
    private final fcsu Z;
    private final bvuf aA;
    private final fcsu aB;
    private final fcsu aC;
    private final aqee aD;
    private final fcsu aE;
    private final fcsu aF;
    private final aqzn aG;
    private final fcsu aH;
    private final bbdl aa;
    private final bagw ab;
    private final fcsu ac;
    private final cqmr ad;
    private final cmqj ae;
    private final Optional af;
    private final ains ag;
    private final fcsu ah;
    private final bbfk ai;
    private final fcsu aj;
    private final bydb ak;
    private final alrj al;
    private final fcsu am;
    private final fcsu an;
    private final fcsu ao;
    private final fcsu ap;
    private final fcsu aq;
    private final fcsu ar;
    private final fcsu as;
    private final fcsu at;
    private final fcsu au;
    private final fcsu av;
    private final fcsu aw;
    private final fcsu ax;
    private final apqz ay;
    private final eosc az;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final cmuq j;
    public final bbhh k;
    public final fcsu l;
    public final fcsu m;
    public final crej n;
    public final crma o;
    public final cogw p;
    public final aipo q;
    public final fcsu r;
    public final bbgy s;
    public final bxlc t;
    public final bveg u;
    public final dqsn v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;
    public final cgdh z;

    public axrj(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, bbdl bbdlVar, bagw bagwVar, cmuq cmuqVar, fcsu fcsuVar12, bbhh bbhhVar, fcsu fcsuVar13, fcsu fcsuVar14, crej crejVar, crma crmaVar, cqmr cqmrVar, cmqj cmqjVar, Optional optional, cogw cogwVar, aipo aipoVar, ains ainsVar, fcsu fcsuVar15, fcsu fcsuVar16, axpg axpgVar, bbgy bbgyVar, bbfk bbfkVar, bxlc bxlcVar, ayeo ayeoVar, bveg bvegVar, dqsn dqsnVar, fcsu fcsuVar17, bydb bydbVar, fcsu fcsuVar18, alrj alrjVar, fcsu fcsuVar19, fcsu fcsuVar20, cgdh cgdhVar, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, fcsu fcsuVar36, fcsu fcsuVar37, fcsu fcsuVar38, fcsu fcsuVar39, apqz apqzVar, eosc eoscVar, fdjx fdjxVar, bvuf bvufVar, aoou aoouVar, fcsu fcsuVar40, fcsu fcsuVar41, AtomicReference atomicReference, fcsu fcsuVar42, fcsu fcsuVar43, fcsu fcsuVar44, fcsu fcsuVar45, fcsu fcsuVar46, aqee aqeeVar, apwn apwnVar, arnv arnvVar, fcsu fcsuVar47, fcsu fcsuVar48, aqzn aqznVar, fcsu fcsuVar49) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        bbdlVar.getClass();
        bagwVar.getClass();
        cmuqVar.getClass();
        fcsuVar12.getClass();
        bbhhVar.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        crejVar.getClass();
        crmaVar.getClass();
        cqmrVar.getClass();
        cmqjVar.getClass();
        cogwVar.getClass();
        aipoVar.getClass();
        ainsVar.getClass();
        fcsuVar15.getClass();
        fcsuVar16.getClass();
        bbgyVar.getClass();
        bbfkVar.getClass();
        bxlcVar.getClass();
        ayeoVar.getClass();
        bvegVar.getClass();
        dqsnVar.getClass();
        fcsuVar17.getClass();
        bydbVar.getClass();
        fcsuVar18.getClass();
        alrjVar.getClass();
        fcsuVar19.getClass();
        fcsuVar20.getClass();
        cgdhVar.getClass();
        fcsuVar21.getClass();
        fcsuVar22.getClass();
        fcsuVar23.getClass();
        fcsuVar24.getClass();
        fcsuVar25.getClass();
        fcsuVar26.getClass();
        fcsuVar27.getClass();
        fcsuVar28.getClass();
        fcsuVar29.getClass();
        fcsuVar30.getClass();
        fcsuVar31.getClass();
        fcsuVar32.getClass();
        fcsuVar33.getClass();
        fcsuVar34.getClass();
        fcsuVar35.getClass();
        fcsuVar36.getClass();
        fcsuVar37.getClass();
        fcsuVar38.getClass();
        fcsuVar39.getClass();
        eoscVar.getClass();
        fdjxVar.getClass();
        aoouVar.getClass();
        fcsuVar40.getClass();
        fcsuVar41.getClass();
        atomicReference.getClass();
        fcsuVar42.getClass();
        fcsuVar43.getClass();
        fcsuVar44.getClass();
        fcsuVar45.getClass();
        fcsuVar46.getClass();
        aqeeVar.getClass();
        apwnVar.getClass();
        arnvVar.getClass();
        fcsuVar47.getClass();
        fcsuVar48.getClass();
        aqznVar.getClass();
        fcsuVar49.getClass();
        this.U = context;
        this.V = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.W = fcsuVar4;
        this.f = fcsuVar5;
        this.X = fcsuVar6;
        this.g = fcsuVar7;
        this.h = fcsuVar8;
        this.Y = fcsuVar9;
        this.i = fcsuVar10;
        this.Z = fcsuVar11;
        this.aa = bbdlVar;
        this.ab = bagwVar;
        this.j = cmuqVar;
        this.ac = fcsuVar12;
        this.k = bbhhVar;
        this.l = fcsuVar13;
        this.m = fcsuVar14;
        this.n = crejVar;
        this.o = crmaVar;
        this.ad = cqmrVar;
        this.ae = cmqjVar;
        this.af = optional;
        this.p = cogwVar;
        this.q = aipoVar;
        this.ag = ainsVar;
        this.r = fcsuVar15;
        this.ah = fcsuVar16;
        this.S = axpgVar;
        this.s = bbgyVar;
        this.ai = bbfkVar;
        this.t = bxlcVar;
        this.T = ayeoVar;
        this.u = bvegVar;
        this.v = dqsnVar;
        this.aj = fcsuVar17;
        this.ak = bydbVar;
        this.w = fcsuVar18;
        this.al = alrjVar;
        this.x = fcsuVar19;
        this.y = fcsuVar20;
        this.z = cgdhVar;
        this.A = fcsuVar21;
        this.am = fcsuVar22;
        this.B = fcsuVar23;
        this.an = fcsuVar24;
        this.ao = fcsuVar25;
        this.ap = fcsuVar26;
        this.aq = fcsuVar27;
        this.C = fcsuVar28;
        this.D = fcsuVar29;
        this.ar = fcsuVar30;
        this.E = fcsuVar31;
        this.as = fcsuVar32;
        this.F = fcsuVar33;
        this.G = fcsuVar34;
        this.at = fcsuVar35;
        this.au = fcsuVar36;
        this.av = fcsuVar37;
        this.aw = fcsuVar38;
        this.ax = fcsuVar39;
        this.ay = apqzVar;
        this.az = eoscVar;
        this.H = fdjxVar;
        this.aA = bvufVar;
        this.I = fcsuVar40;
        this.J = fcsuVar41;
        this.K = atomicReference;
        this.aB = fcsuVar42;
        this.aC = fcsuVar43;
        this.L = fcsuVar44;
        this.M = fcsuVar45;
        this.N = fcsuVar46;
        this.aD = aqeeVar;
        this.O = arnvVar;
        this.aE = fcsuVar47;
        this.aF = fcsuVar48;
        this.aG = aqznVar;
        this.aH = fcsuVar49;
        this.P = new LinkedHashMap();
        this.Q = bary.a;
    }

    public static final Collection l(MessageCoreData messageCoreData) {
        ArrayList arrayList = new ArrayList();
        if (((Boolean) cgwx.a.e()).booleanValue()) {
            List listM = messageCoreData.M();
            if (!listM.isEmpty()) {
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    if (((MessagePartCoreData) it.next()).bi()) {
                        arrayList.add(messageCoreData);
                        return arrayList;
                    }
                }
            }
        }
        if (messageCoreData.c() == 1) {
            arrayList.add(messageCoreData);
            return arrayList;
        }
        for (MessagePartCoreData messagePartCoreData : messageCoreData.M()) {
            MessageCoreData messageCoreDataY = messageCoreData.y();
            if (messageCoreData.cX() && messagePartCoreData.o() != 0) {
                messageCoreDataY.bW(messagePartCoreData.o());
            }
            messageCoreDataY.aM(messagePartCoreData);
            ((MessageData) messageCoreDataY).j.n("split_rcs");
            arrayList.add(messageCoreDataY);
        }
        return arrayList;
    }

    private final void m(MessageCoreData messageCoreData, boolean z, long j) throws IOException {
        eieu eieuVarA = eiiy.a("InsertNewMessageProcessor::logMmsOrRcsMessageInserted");
        try {
            String str = messageCoreData.cO() ? z ? "Bugle.UI.ConversationActivity.Send.Duration.Mms.Text" : "Bugle.UI.ConversationActivity.Send.Duration.Mms.Attachment" : z ? "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Text" : "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Attachment";
            if (j != 0) {
                this.q.d(str, messageCoreData.C().b(), j);
            }
            fczl.a(eieuVarA, null);
        } finally {
        }
    }

    private final boolean n(MessageCoreData messageCoreData) {
        return messageCoreData.cl() && messageCoreData.c() <= ((int) ((Number) this.aH.b()).longValue());
    }

    public final Integer a(bajf bajfVar, MessageCoreData messageCoreData, int i, int i2, elny elnyVar) throws IOException {
        axcy axcyVarF;
        String string;
        messageCoreData.getClass();
        elnyVar.getClass();
        eieu eieuVarA = eiiy.a("INMA::getSubscription");
        try {
            if (i != -1) {
                axcyVarF = this.aa.f(i);
                axcyVarF.getClass();
                if (((Boolean) ((cczi) uuj.a.get()).e()).booleanValue()) {
                    ((eksl) b.h()).I("InsertNewMessageProcessor#getSubscription: draftId=%s using subId=%s from param subId=%s", messageCoreData.aI(), Integer.valueOf(axcyVarF.e()), Integer.valueOf(i));
                }
            } else {
                SelfIdentityId selfIdentityIdV = messageCoreData.v();
                if (selfIdentityIdV == null) {
                    selfIdentityIdV = bajfVar.f();
                    if (((Boolean) ((cczi) uuj.a.get()).e()).booleanValue()) {
                        ((eksl) b.h()).D("InsertNewMessageProcessor#getSubscription: draftId=%s had no self, so conversation self subId=%s", messageCoreData.aI(), selfIdentityIdV);
                    }
                }
                bbdl bbdlVar = this.aa;
                axcy axcyVarE = bbdlVar.e(selfIdentityIdV);
                Optional optionalEmpty = i2 == -1 ? Optional.empty() : Optional.of(Integer.valueOf(i2));
                if (axcyVarE != null && axcyVarE.i() && optionalEmpty.isPresent()) {
                    axcyVarF = bbdlVar.f(((Number) optionalEmpty.get()).intValue());
                    axcyVarF.getClass();
                    if (((Boolean) ((cczi) uuj.a.get()).e()).booleanValue()) {
                        ((eksl) b.h()).J("InsertNewMessageProcessor#getSubscription: draftId=%s using subId=%s for lockedDefaultSmsSubId=%s, instead of subId=%s", messageCoreData.aI(), Integer.valueOf(axcyVarF.e()), optionalEmpty.get(), Integer.valueOf(axcyVarE.e()));
                    }
                } else {
                    if (((Boolean) ((cczi) uuj.a.get()).e()).booleanValue()) {
                        eksl ekslVar = (eksl) b.h();
                        UUID uuidAI = messageCoreData.aI();
                        if (axcyVarE == null || (string = Integer.valueOf(axcyVarE.e()).toString()) == null) {
                            string = "(null)";
                        }
                        ekslVar.D("InsertNewMessageProcessor#getSubscription: draftId=%s using subId=%s", uuidAI, string);
                    }
                    axcyVarF = axcyVarE;
                }
            }
            if (axcyVarF == null) {
                fczl.a(eieuVarA, null);
                return null;
            }
            fczl.a(eieuVarA, null);
            SelfIdentityId selfIdentityIdF = axcyVarF.f();
            messageCoreData.aP(selfIdentityIdF);
            messageCoreData.aQ(selfIdentityIdF);
            if (messageCoreData.d() == 3 && messageCoreData.ah().isEmpty()) {
                eieuVarA = eiiy.a("INMA::getSenderMessagingIdentityEmpty");
                try {
                    int iA = ((crny) this.av.b()).h(axcyVarF.e()).a();
                    try {
                        messageCoreData.bP(this.al.b(((chtk) this.as.b()).b(iA)));
                        fczl.a(eieuVarA, null);
                    } catch (chsq unused) {
                        ((eksl) b.j()).J("InsertNewMessageProcessor#setSelfDetailsAndGetSubId: Cannot determine the RCS Self Identity for draftId=%s using SelfParticipant=%s subId=%s, effectiveSubId=%s", messageCoreData.aI(), selfIdentityIdF, Integer.valueOf(axcyVarF.e()), Integer.valueOf(iA));
                        bbdh bbdhVar = (bbdh) this.ah.b();
                        int iE = axcyVarF.e();
                        int iE2 = bajfVar.E();
                        fcsu fcsuVar = bbdhVar.a;
                        if (((ajjp) fcsuVar.b()).b()) {
                            elof elofVar = (elof) elpg.b.createBuilder();
                            elofVar.getClass();
                            eltg eltgVar = (eltg) eltk.a.createBuilder();
                            eltgVar.getClass();
                            eltgVar.copyOnWrite();
                            eltk eltkVar = (eltk) eltgVar.instance;
                            eltkVar.b |= 1;
                            eltkVar.c = iE;
                            evsn evsnVarBuild = eltgVar.build();
                            evsnVarBuild.getClass();
                            elofVar.copyOnWrite();
                            elpg elpgVar = (elpg) elofVar.instance;
                            elpgVar.m = (eltk) evsnVarBuild;
                            elpgVar.c |= 32;
                            elhf.b(((aika) bbdhVar.b.b()).b(messageCoreData.A()), elofVar);
                            elhf.d(messageCoreData.t(), elofVar);
                            elhf.i(ajhe.d(messageCoreData.d()), elofVar);
                            elnu elnuVar = elnu.MISSING_SELF_IDENTITY;
                            elnuVar.getClass();
                            elofVar.copyOnWrite();
                            elpg elpgVar2 = (elpg) elofVar.instance;
                            elpgVar2.w = elnuVar.p;
                            elpgVar2.c |= 524288;
                            elofVar.copyOnWrite();
                            elpg elpgVar3 = (elpg) elofVar.instance;
                            elpgVar3.n = elnyVar.M;
                            elpgVar3.c |= 64;
                            elke elkeVarA = ajhe.a(Integer.valueOf(iE2));
                            elkeVarA.getClass();
                            elofVar.copyOnWrite();
                            elpg elpgVar4 = (elpg) elofVar.instance;
                            elpgVar4.s = elkeVarA.f;
                            elpgVar4.c |= 16384;
                            elho elhoVarB = ((aixn) bbdhVar.c.b()).b(iE);
                            elhoVarB.getClass();
                            elofVar.copyOnWrite();
                            elpg elpgVar5 = (elpg) elofVar.instance;
                            elpgVar5.S = elhoVarB;
                            elpgVar5.d |= 65536;
                            int iC = ajhe.c(messageCoreData);
                            elofVar.copyOnWrite();
                            elpg elpgVar6 = (elpg) elofVar.instance;
                            elpgVar6.Q = iC - 1;
                            elpgVar6.d |= 16384;
                            elpg elpgVarA = elhf.a(elofVar);
                            ellg ellgVar = (ellg) ellh.a.createBuilder();
                            ellf ellfVar = ellf.BUGLE_MESSAGE;
                            ellgVar.copyOnWrite();
                            ellh ellhVar = (ellh) ellgVar.instance;
                            ellhVar.j = ellfVar.f11do;
                            ellhVar.b |= 1;
                            ellgVar.copyOnWrite();
                            ellh ellhVar2 = (ellh) ellgVar.instance;
                            ellhVar2.l = elpgVarA;
                            ellhVar2.b |= 4;
                            bbdhVar.d.a().h(ellgVar, aioj.LOG_SPEC_DSDR_EVENTS);
                        } else {
                            ((ajjp) fcsuVar.b()).a();
                        }
                        fczl.a(eieuVarA, null);
                        return null;
                    }
                } finally {
                }
            }
            ((eksl) b.h()).I("InsertNewMessageProcessor#setSelfDetailsAndGetSubId: draftId=%s using SelfParticipant=%s and subId=%s", messageCoreData.aI(), selfIdentityIdF, Integer.valueOf(axcyVarF.e()));
            return Integer.valueOf(axcyVarF.e());
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r29, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r30, boolean r31, boolean r32, java.util.List r33, java.util.List r34, java.util.List r35, defpackage.fcxy r36) {
        /*
            Method dump skipped, instructions count: 1401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axrj.b(int, java.lang.String, java.lang.String, java.lang.String, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, boolean, boolean, java.util.List, java.util.List, java.util.List, fcxy):java.lang.Object");
    }

    public final void c(MessageCoreData messageCoreData) throws IOException {
        final MessageCoreData messageCoreDataY = messageCoreData.y();
        Iterator it = messageCoreData.M().iterator();
        while (it.hasNext()) {
            messageCoreDataY.aM((MessagePartCoreData) it.next());
        }
        eieu eieuVarA = eiiy.a("InsertNewMessageProcessor::onPendingNewMessage");
        try {
            ((awlc) this.aw.b()).d(new Consumer() { // from class: axqh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    byee byeeVar = (byee) obj;
                    eksp ekspVar = axrj.a;
                    byeeVar.getClass();
                    byeeVar.fW(messageCoreDataY);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            fczl.a(eieuVarA, null);
        } finally {
        }
    }

    public final void d(final axqf axqfVar) {
        this.v.b(new ejxr() { // from class: axqp
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:115:0x02e2 A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #2 {all -> 0x0025, blocks: (B:6:0x0022, B:14:0x0042, B:17:0x0049, B:23:0x005d, B:30:0x008e, B:32:0x009c, B:34:0x00a6, B:41:0x00ee, B:43:0x0109, B:45:0x0116, B:49:0x0135, B:51:0x015f, B:55:0x0181, B:61:0x01a8, B:63:0x01b0, B:70:0x01ef, B:76:0x0206, B:98:0x029b, B:101:0x02b4, B:107:0x02bc, B:108:0x02bf, B:115:0x02e2, B:117:0x02f9, B:121:0x0316, B:123:0x0331, B:125:0x033e, B:144:0x037e, B:110:0x02c1, B:112:0x02ce, B:80:0x0213, B:87:0x0231, B:91:0x023e, B:94:0x0247, B:52:0x016e, B:54:0x017a, B:56:0x0184, B:57:0x0189), top: B:266:0x0022, inners: #4, #8 }] */
            /* JADX WARN: Removed duplicated region for block: B:119:0x0302 A[Catch: all -> 0x070f, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x070f, blocks: (B:3:0x001c, B:11:0x002b, B:20:0x0050, B:28:0x006d, B:38:0x00b9, B:47:0x011e, B:59:0x0194, B:67:0x01c5, B:71:0x01fa, B:96:0x028b, B:113:0x02d9, B:119:0x0302, B:127:0x0347, B:83:0x0226, B:88:0x0234, B:92:0x0241, B:65:0x01b7, B:19:0x004e), top: B:277:0x001c }] */
            /* JADX WARN: Removed duplicated region for block: B:127:0x0347 A[Catch: all -> 0x070f, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x070f, blocks: (B:3:0x001c, B:11:0x002b, B:20:0x0050, B:28:0x006d, B:38:0x00b9, B:47:0x011e, B:59:0x0194, B:67:0x01c5, B:71:0x01fa, B:96:0x028b, B:113:0x02d9, B:119:0x0302, B:127:0x0347, B:83:0x0226, B:88:0x0234, B:92:0x0241, B:65:0x01b7, B:19:0x004e), top: B:277:0x001c }] */
            /* JADX WARN: Removed duplicated region for block: B:269:0x029b A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x011e A[Catch: all -> 0x070f, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x070f, blocks: (B:3:0x001c, B:11:0x002b, B:20:0x0050, B:28:0x006d, B:38:0x00b9, B:47:0x011e, B:59:0x0194, B:67:0x01c5, B:71:0x01fa, B:96:0x028b, B:113:0x02d9, B:119:0x0302, B:127:0x0347, B:83:0x0226, B:88:0x0234, B:92:0x0241, B:65:0x01b7, B:19:0x004e), top: B:277:0x001c }] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x01b7 A[Catch: all -> 0x070f, TRY_ENTER, TryCatch #10 {all -> 0x070f, blocks: (B:3:0x001c, B:11:0x002b, B:20:0x0050, B:28:0x006d, B:38:0x00b9, B:47:0x011e, B:59:0x0194, B:67:0x01c5, B:71:0x01fa, B:96:0x028b, B:113:0x02d9, B:119:0x0302, B:127:0x0347, B:83:0x0226, B:88:0x0234, B:92:0x0241, B:65:0x01b7, B:19:0x004e), top: B:277:0x001c }] */
            /* JADX WARN: Type inference failed for: r14v0, types: [eieu, java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v19 */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v5, types: [fdci] */
            /* JADX WARN: Type inference failed for: r1v6 */
            /* JADX WARN: Type inference failed for: r1v8 */
            /* JADX WARN: Type inference failed for: r1v9 */
            @Override // defpackage.ejxr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 1816
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.axqp.get():java.lang.Object");
            }
        });
    }

    public final void e(MessageCoreData messageCoreData, int i, int i2, long j) {
        MessageCoreData messageCoreData2;
        if (this.R) {
            messageCoreData.bk(j);
        }
        this.ak.g(messageCoreData);
        MessageIdType messageIdTypeA = ((bauh) this.w.b()).a(messageCoreData);
        messageIdTypeA.getClass();
        if (this.aD.a()) {
            ((ajhd) this.r.b()).C(messageCoreData, Integer.valueOf(i), i2, (elng) new axre().fM(((aurx) this.I.b()).C()));
            messageCoreData2 = messageCoreData;
        } else {
            AtomicReference atomicReference = this.K;
            if (atomicReference.get() == feds.UNKNOWN_CLOUD_SYNC_STATUS) {
                messageCoreData2 = messageCoreData;
                auvw.c(this.H, fcyi.a, fdjz.a, new axri(this, messageCoreData2, i, i2, null));
            } else {
                messageCoreData2 = messageCoreData;
                ((ajhd) this.r.b()).C(messageCoreData2, Integer.valueOf(i), i2, (elng) new axre().fM(atomicReference.get()));
            }
        }
        if (messageCoreData2.cX() && messageCoreData2.C().c() && !messageCoreData2.cl()) {
            messageCoreData2.cc(messageIdTypeA);
        }
    }

    public final void f(final bajf bajfVar, final int i, final MessageCoreData messageCoreData, long j, final long j2, final Action action) throws IOException {
        ContentType contentTypeF;
        messageCoreData.getClass();
        final ConversationIdType conversationIdTypeA = messageCoreData.A();
        conversationIdTypeA.getClass();
        int iC = messageCoreData.c();
        eieu eieuVarA = eiiy.a("InsertNewMessageProcessor::processParts");
        try {
            boolean z = true;
            if (iC != 1) {
                z = false;
            }
            boolean zBv = z;
            for (MessagePartCoreData messagePartCoreData : messageCoreData.M()) {
                bbae bbaeVar = (bbae) this.X.b();
                eieu eieuVarK = eiiy.k("MessagePartDatabaseOperations#readMessagePartProcessingFieldsFromDraft");
                try {
                    if (messagePartCoreData.w() != null) {
                        final Uri uriW = messagePartCoreData.w();
                        bhjx bhjxVarA = bhka.a();
                        bhjxVarA.A("readMessagePartProcessingFieldsFromDraft");
                        bhjxVarA.c(new Function() { // from class: bazt
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bhjz bhjzVar = (bhjz) obj;
                                final Uri uri = uriW;
                                Function[] functionArr = {new Function() { // from class: bazu
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bhjz bhjzVar2 = (bhjz) obj2;
                                        int iIntValue = bhka.c().intValue();
                                        if (iIntValue < 4020) {
                                            dqru.x("output_uri", iIntValue);
                                        }
                                        bhjzVar2.ap(new dqpj("draft_parts_view.processing_output_uri_parts", 1, uri));
                                        return bhjzVar2;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }, new Function() { // from class: bazv
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bhjz bhjzVar2 = (bhjz) obj2;
                                        bhjzVar2.ap(new dqpj("draft_parts_view.uri_parts", 1, uri));
                                        return bhjzVar2;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }};
                                bhjz[] bhjzVarArr = new bhjz[2];
                                for (int i2 = 0; i2 < 2; i2++) {
                                    Function function = functionArr[i2];
                                    String[] strArr = bhka.a;
                                    bhjzVarArr[i2] = (bhjz) function.apply(new bhjz());
                                }
                                bhjzVar.aq(bhjzVarArr);
                                return bhjzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bgzy bgzyVar = (bgzy) bhjxVarA.b().l();
                        if (bgzyVar != null) {
                            messagePartCoreData.aQ(((bahv) bbaeVar.a.b()).d(bgzyVar));
                        }
                    }
                    eieuVarK.close();
                    zBv &= messagePartCoreData.bv();
                    if (messagePartCoreData.aR()) {
                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                        Context context = this.U;
                        File file = new File(externalStoragePublicDirectory, context.getResources().getString(R.string.app_name));
                        messagePartCoreData.getClass();
                        Uri uriV = messagePartCoreData.v();
                        uriV.getClass();
                        Uri uriE = cqmz.e(context, uriV, file, messagePartCoreData.R(), null, this.ad);
                        messagePartCoreData.aA(uriE);
                        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                        intent.setData(uriE);
                        context.sendBroadcast(intent);
                    }
                    if (fdbq.f(messagePartCoreData.R(), "video/mpeg") || fdbq.f(messagePartCoreData.R(), "video/mpeg4")) {
                        messagePartCoreData.aq("video/mp4");
                    }
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            fczl.a(eieuVarA, null);
            MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
            athh athhVarZ = messagePartCoreDataH != null ? messagePartCoreDataH.z() : null;
            if (((aptx) this.aC.b()).a() && messageCoreData.cX() && athhVarZ != null) {
                eksl ekslVar = (eksl) b.h();
                ekslVar.X(coie.j, athhVarZ);
                ekslVar.q("InsertNewMessageProcessor: Inserting RCS message with pending file processing.");
                this.ai.b(messageCoreData, i, null, j2);
                this.v.c("InsertNewMessageProcessor#insertSendingRcsMessage", new ejxr() { // from class: axqr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        axrj axrjVar = this.a;
                        MessageCoreData messageCoreData2 = messageCoreData;
                        int iE = bajfVar.E();
                        int i2 = i;
                        long j3 = j2;
                        axrjVar.e(messageCoreData2, iE, i2, j3);
                        if (!messageCoreData2.cF()) {
                            if (((aqti) axrjVar.N.b()).a()) {
                                ((baqi) axrjVar.h.b()).h(messageCoreData2.A(), messageCoreData2.C(), Long.valueOf(j3), bvdk.UNARCHIVED, null, false, -1L, null, messageCoreData2.v());
                            } else {
                                ((baqi) axrjVar.h.b()).e(messageCoreData2.A(), messageCoreData2.C(), Long.valueOf(j3), bvdk.UNARCHIVED, false);
                            }
                        }
                        return fctx.a;
                    }
                });
                m(messageCoreData, zBv, j);
                return;
            }
            final List listB = this.ai.b(messageCoreData, i, null, j2);
            final int iE = bajfVar.E();
            Object objC = this.v.c("InsertNewMessageProcessor#insertSendingMmsOrRcsMessage", new ejxr() { // from class: axqo
                @Override // defpackage.ejxr
                public final Object get() {
                    axrj axrjVar = this.a;
                    MessageCoreData messageCoreData2 = messageCoreData;
                    int i2 = iE;
                    int i3 = i;
                    long j3 = j2;
                    axrjVar.e(messageCoreData2, i2, i3, j3);
                    ArrayList arrayList = new ArrayList();
                    ayqs.a(listB, arrayList);
                    if (!messageCoreData2.cF()) {
                        ConversationIdType conversationIdType = conversationIdTypeA;
                        if (((aqti) axrjVar.N.b()).a()) {
                            ((baqi) axrjVar.h.b()).h(conversationIdType, messageCoreData2.C(), Long.valueOf(j3), bvdk.UNARCHIVED, null, false, -1L, null, messageCoreData2.v());
                            return arrayList;
                        }
                        ((baqi) axrjVar.h.b()).e(conversationIdType, messageCoreData2.C(), Long.valueOf(j3), bvdk.UNARCHIVED, false);
                    }
                    return arrayList;
                }
            });
            objC.getClass();
            this.Q = messageCoreData.C();
            m(messageCoreData, zBv, j);
            for (final MessagePartCoreData messagePartCoreData2 : (List) objC) {
                final bvuf bvufVar = this.aA;
                eieu eieuVarK2 = eiiy.k("MessagePartProcessor#process");
                try {
                    if (messagePartCoreData2.t() != null) {
                        if (messagePartCoreData2.R() != null) {
                            String strR = messagePartCoreData2.R();
                            strR.getClass();
                            contentTypeF = auby.f(strR);
                        } else {
                            contentTypeF = null;
                        }
                        ekrw ekrwVarH = bvuf.a.h();
                        ekrwVarH.X(eksq.a, "BugleEarlyProcessing");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/earlyprocessing/MessagePartProcessor", "processInTrace", 58, "MessagePartProcessor.java")).D("Original content type: %s. Resolved content type: %s", messagePartCoreData2.R(), contentTypeF);
                        bxno bxnoVar = (bxno) bvufVar.b.b();
                        Uri uriT = messagePartCoreData2.t();
                        uriT.getClass();
                        auvh.e(bxnoVar.a(uriT, messagePartCoreData2.p(), contentTypeF).i(new eooz() { // from class: bvue
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                bvdt bvdtVar;
                                bxnx bxnxVar = (bxnx) obj;
                                try {
                                    int iB = bxnw.b(bxnxVar.c);
                                    if (iB == 0) {
                                        iB = 1;
                                    }
                                    int i2 = iB - 2;
                                    if (i2 == 1) {
                                        bvdtVar = bvdt.SUCCEEDED;
                                    } else if (i2 == 2) {
                                        bvdtVar = bvdt.FAILED;
                                    } else if (i2 == 3) {
                                        bvdtVar = bvdt.TOO_LARGE;
                                    } else {
                                        if (i2 != 4) {
                                            throw new IllegalArgumentException("Unspecified ResizingStatus");
                                        }
                                        bvdtVar = bvdt.PENDING;
                                    }
                                } catch (IllegalArgumentException e) {
                                    ekrw ekrwVarJ = bvuf.a.j();
                                    ekrwVarJ.X(eksq.a, "BugleEarlyProcessing");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/earlyprocessing/MessagePartProcessor", "processInTrace", 'N', "MessagePartProcessor.java")).q("Cannot convert to MessageProcessingStatus");
                                    bvdtVar = bvdt.FAILED;
                                }
                                final bvdt bvdtVar2 = bvdtVar;
                                aubx aubxVar = bxnxVar.e;
                                if (aubxVar == null) {
                                    aubxVar = aubx.a;
                                }
                                final ContentType contentTypeE = auby.e(aubxVar);
                                ekrw ekrwVarH2 = bvuf.a.h();
                                ekrz ekrzVar = eksq.a;
                                ekrwVarH2.X(ekrzVar, "BugleEarlyProcessing");
                                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/earlyprocessing/MessagePartProcessor", "processInTrace", 85, "MessagePartProcessor.java");
                                aubx aubxVar2 = bxnxVar.e;
                                if (aubxVar2 == null) {
                                    aubxVar2 = aubx.a;
                                }
                                final Action action2 = action;
                                final MessagePartCoreData messagePartCoreData3 = messagePartCoreData2;
                                bvuf bvufVar2 = bvufVar;
                                ekrdVar.D("Original content type: %s. Resolved content type: %s", aubxVar2, contentTypeE);
                                final bxog bxogVar = (bxog) bvufVar2.d.b();
                                final String str = bxnxVar.d;
                                ekrw ekrwVarH3 = bxog.a.h();
                                ekrwVarH3.X(ekrzVar, "BugleResizing");
                                ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/UpdateMessagePartAfterResizingHelper", "update", 91, "UpdateMessagePartAfterResizingHelper.java")).q("UpdateMessagePartAfterResizingHelper executeInScope");
                                ((dqsn) bxogVar.e.b()).b(new ejxr() { // from class: bxof
                                    @Override // defpackage.ejxr
                                    public final Object get() {
                                        bxogVar.a(messagePartCoreData3, str, contentTypeE, bvdtVar2, action2);
                                        return null;
                                    }
                                });
                                return eorv.a;
                            }
                        }, bvufVar.c));
                    }
                    eieuVarK2.close();
                } finally {
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                fczl.a(eieuVarA, th3);
                throw th4;
            }
        }
    }

    public final void g(final bajf bajfVar, final int i, final MessageCoreData messageCoreData, long j, List list, final bvdk bvdkVar) throws IOException {
        eieu eieuVar;
        Throwable th;
        eieu eieuVar2;
        final axrj axrjVar;
        final int i2;
        MessageCoreData messageCoreData2;
        String str;
        long j2;
        final ConversationIdType conversationIdType;
        boolean z;
        Throwable th2;
        cnqj cnqjVarA;
        ConversationIdType conversationIdType2;
        long j3;
        final axrj axrjVar2;
        final boolean z2;
        ConversationIdType conversationIdTypeD;
        eksp ekspVar;
        ekrz ekrzVar;
        cnqj cnqjVarA2;
        cnqj cnqjVar;
        String strT;
        eieu eieuVarA = eiiy.a("InsertNewMessageProcessor::insertSendingSms");
        try {
            long epochMilli = this.p.f().toEpochMilli();
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            conversationIdTypeA.getClass();
            try {
                if (list.size() > 1) {
                    final long j4 = 1 + epochMilli;
                    try {
                        ekspVar = b;
                        ekrw ekrwVarO = ekspVar.o();
                        ekrzVar = cqnc.a;
                        ekrwVarO.X(ekrzVar, messageCoreData.C().b());
                        ekrwVarO.s("InsertNewMessageProcessor: Inserting broadcast SMS {x-message-id:%d}.", messageCoreData.t());
                        ((cmqf) this.aj.b()).i(j4);
                        if (((Boolean) avos.a.e()).booleanValue()) {
                            cnqjVarA2 = ((avmr) this.an.b()).a(conversationIdTypeA);
                            cnqjVarA2.getClass();
                        } else {
                            cnqjVarA2 = ((bxjh) this.Z.b()).a(conversationIdTypeA);
                            cnqjVarA2.getClass();
                        }
                        cnqjVar = cnqjVarA2;
                        strT = bbbd.t(list);
                        strT.getClass();
                        try {
                            eieuVar = eieuVarA;
                            try {
                                j2 = epochMilli;
                                str = "Bugle.UI.ConversationActivity.Send.Duration.Sms";
                                eieuVar2 = eieuVar;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    fczl.a(eieuVar, th);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            eieuVar2 = eieuVarA;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        eieuVar2 = eieuVarA;
                    }
                    try {
                        final Uri uriAk = this.ae.ak(this.U, Telephony.Sms.CONTENT_URI, i, strT, messageCoreData.at(), j4, 0, 2, cnqjVar, messageCoreData.ae());
                        i2 = i;
                        if (uriAk == null || TextUtils.isEmpty(uriAk.toString())) {
                            messageCoreData2 = messageCoreData;
                            conversationIdType = conversationIdTypeA;
                            axrjVar = this;
                            eksl ekslVar = (eksl) ekspVar.i();
                            ekslVar.X(ekrzVar, messageCoreData2.C().b());
                            ekslVar.q("InsertNewMessageProcessor: No uri for broadcast SMS. Message inserted into telephony DB.");
                        } else {
                            conversationIdType = conversationIdTypeA;
                            try {
                                axrjVar = this;
                                this.v.d("InsertNewMessageProcessor#insertFakeBroadcastSmsMessage", new Runnable() { // from class: axqq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MessageCoreData messageCoreData3 = messageCoreData;
                                        ConversationIdType conversationIdType3 = conversationIdType;
                                        Uri uri = uriAk;
                                        long j5 = j4;
                                        messageCoreData3.ce(conversationIdType3, uri, j5);
                                        messageCoreData3.bl(j5);
                                        axrj axrjVar3 = this;
                                        ((bauh) axrjVar3.w.b()).a(messageCoreData3);
                                        ((baqi) axrjVar3.h.b()).e(conversationIdType3, messageCoreData3.C(), Long.valueOf(j5), bvdk.UNARCHIVED, false);
                                    }
                                });
                                ekrw ekrwVarN = ekspVar.n();
                                ekrwVarN.X(ekrzVar, messageCoreData.C().b());
                                ekrwVarN.C("InsertNewMessageProcessor: Inserted broadcast SMS. (uri=%s) {x-message-id:%d}", messageCoreData.u(), messageCoreData.t());
                                if (j != 0) {
                                    axrjVar.q.d(str, messageCoreData.C().b(), j);
                                }
                                messageCoreData2 = messageCoreData;
                                ((ajhd) axrjVar.r.b()).U(messageCoreData2);
                            } catch (Throwable th7) {
                                th = th7;
                                axrjVar = this;
                                th = th;
                                eieuVar = eieuVar2;
                                throw th;
                            }
                        }
                        z = true;
                    } catch (Throwable th8) {
                        th2 = th8;
                        th = th2;
                        eieuVar = eieuVar2;
                        throw th;
                    }
                } else {
                    i2 = i;
                    messageCoreData2 = messageCoreData;
                    axrjVar = this;
                    eieuVar2 = eieuVarA;
                    str = "Bugle.UI.ConversationActivity.Send.Duration.Sms";
                    j2 = epochMilli;
                    conversationIdType = conversationIdTypeA;
                    z = false;
                }
                try {
                    ConversationIdType conversationIdType3 = list.size() > 1 ? barn.a : conversationIdType;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                            final long j5 = j2;
                            ((cmqf) axrjVar.aj.b()).i(j5);
                            if (conversationIdType3.b()) {
                                if (((Boolean) avos.a.e()).booleanValue()) {
                                    final alqm alqmVarU = axrjVar.al.u(bindData.T(), i2);
                                    final fdae fdaeVar = new fdae() { // from class: axqt
                                        @Override // defpackage.fdae
                                        public final Object invoke() {
                                            cnqt cnqtVar = (cnqt) this.a.B.b();
                                            alqm alqmVar = alqmVarU;
                                            ejyb.e(alqmVar);
                                            return cnqtVar.f(alqmVar, i2);
                                        }
                                    };
                                    conversationIdTypeD = ((avpc) axrjVar.am.b()).a(alqmVarU, new fcsu() { // from class: axqu
                                        @Override // defpackage.fcsu
                                        public final Object b() {
                                            eksp ekspVar2 = axrj.a;
                                            return fdaeVar.invoke();
                                        }
                                    }).C();
                                    conversationIdTypeD.getClass();
                                    cnqjVarA = ((avmr) axrjVar.an.b()).a(conversationIdTypeD);
                                    cnqjVarA.getClass();
                                } else {
                                    long jC = ((cmot) axrjVar.ac.b()).c(bindData);
                                    cnqjVarA = cnqj.b(jC);
                                    conversationIdTypeD = ((baqy) axrjVar.Y.b()).d(jC, bvdkVar, bindData);
                                }
                                conversationIdType2 = conversationIdTypeD;
                            } else {
                                cnqjVarA = ((Boolean) avos.a.e()).booleanValue() ? ((avmr) axrjVar.an.b()).a(conversationIdType3) : ((bxjh) axrjVar.Z.b()).a(conversationIdType3);
                                cnqjVarA.getClass();
                                conversationIdType2 = conversationIdType3;
                            }
                            cnqj cnqjVar2 = cnqjVarA;
                            final String strAt = messageCoreData2.at();
                            messageCoreData2.aI();
                            Optional optionalAe = messageCoreData2.ae();
                            optionalAe.getClass();
                            final ConversationIdType conversationIdType4 = conversationIdType3;
                            boolean z3 = z;
                            final Uri uriAk2 = axrjVar.ae.ak(axrjVar.U, Telephony.Sms.CONTENT_URI, i, bindData.V(), strAt, j5, -1, 2, cnqjVar2, optionalAe);
                            if (uriAk2 == null || TextUtils.isEmpty(uriAk2.toString())) {
                                j3 = j;
                                axrjVar2 = axrjVar;
                                z2 = z3;
                                ((eksl) b.i()).q("InsertNewMessageProcessor: No uri for SMS inserted into telephony DB.");
                                i2 = i;
                                axrjVar = axrjVar2;
                                j2 = j5;
                                conversationIdType3 = conversationIdType4;
                                messageCoreData2 = messageCoreData;
                                z = z2;
                            } else {
                                dqsn dqsnVar = axrjVar.v;
                                axrjVar2 = axrjVar;
                                final ConversationIdType conversationIdType5 = conversationIdType2;
                                z2 = z3;
                                try {
                                    ejxr ejxrVar = new ejxr() { // from class: axqv
                                        @Override // defpackage.ejxr
                                        public final Object get() {
                                            MessageCoreData messageCoreData3 = messageCoreData;
                                            ConversationIdType conversationIdType6 = conversationIdType5;
                                            SelfIdentityId selfIdentityIdV = messageCoreData3.v();
                                            axrj axrjVar3 = this.a;
                                            MessageCoreData messageCoreDataF = axrjVar3.u.f(conversationIdType6, selfIdentityIdV, strAt);
                                            Uri uri = uriAk2;
                                            long j6 = j5;
                                            messageCoreDataF.ce(conversationIdType6, uri, j6);
                                            int iE = bajfVar.E();
                                            ((MessageData) messageCoreDataF).k = messageCoreData3.z();
                                            messageCoreDataF.bZ(messageCoreData3.aF());
                                            messageCoreDataF.bt(messageCoreData3.aI());
                                            messageCoreDataF.bx(messageCoreData3.cF());
                                            messageCoreDataF.bW(messageCoreData3.t());
                                            fhaz fhazVarAJ = messageCoreData3.aJ();
                                            if (fhazVarAJ != null) {
                                                messageCoreDataF.bV(fhazVarAJ);
                                            }
                                            ConversationIdType conversationIdType7 = conversationIdType4;
                                            axrjVar3.e(messageCoreDataF, iE, i, j6);
                                            if (!conversationIdType7.b()) {
                                                bvdk bvdkVar2 = bvdkVar;
                                                boolean z4 = z2;
                                                baqi baqiVar = (baqi) axrjVar3.h.b();
                                                MessageIdType messageIdTypeC = messageCoreDataF.C();
                                                if (true == z4) {
                                                    j6 = 0;
                                                }
                                                baqiVar.h(conversationIdType6, messageIdTypeC, Long.valueOf(j6), bvdkVar2, null, false, -1L, null, messageCoreDataF.v());
                                            }
                                            return messageCoreDataF;
                                        }
                                    };
                                    conversationIdType4 = conversationIdType4;
                                    Object objC = dqsnVar.c("InsertNewMessageProcessor#insertSendingSmsMessage", ejxrVar);
                                    objC.getClass();
                                    MessageCoreData messageCoreData3 = (MessageCoreData) objC;
                                    axrjVar2.h(messageCoreData3);
                                    axrjVar2.Q = messageCoreData3.C();
                                    eksp ekspVar2 = b;
                                    ekrw ekrwVarN2 = ekspVar2.n();
                                    ekrz ekrzVar2 = cqnc.a;
                                    ekrwVarN2.X(ekrzVar2, axrjVar2.Q.b());
                                    ekrwVarN2.q("InsertNewMessageProcessor: inserted.");
                                    eksl ekslVar2 = (eksl) ekspVar2.h();
                                    ekslVar2.X(ekrzVar2, messageCoreData3.C().b());
                                    ekslVar2.X(cqnc.r, messageCoreData3.A().toString());
                                    ekslVar2.I("InsertNewMessageProcessor: Inserted SMS. (uri=%s, receivedTimestamp=%d {x-message-id:%d})", messageCoreData3.u(), Long.valueOf(messageCoreData3.o()), Long.valueOf(messageCoreData3.t()));
                                    if (j != 0) {
                                        j3 = j;
                                        axrjVar2.q.d(str, messageCoreData3.C().b(), j3);
                                        i2 = i;
                                        axrjVar = axrjVar2;
                                        j2 = j5;
                                        conversationIdType3 = conversationIdType4;
                                        messageCoreData2 = messageCoreData;
                                        z = z2;
                                    } else {
                                        i2 = i;
                                        messageCoreData2 = messageCoreData;
                                        axrjVar = axrjVar2;
                                        j2 = j5;
                                        z = z2;
                                        conversationIdType3 = conversationIdType4;
                                    }
                                } catch (Throwable th9) {
                                    th2 = th9;
                                    th = th2;
                                    eieuVar = eieuVar2;
                                    throw th;
                                }
                            }
                        } catch (Throwable th10) {
                            th2 = th10;
                        }
                    }
                    fczl.a(eieuVar2, null);
                } catch (Throwable th11) {
                    th = th11;
                    eieuVar = eieuVar2;
                    th = th;
                    throw th;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Throwable th13) {
            th = th13;
            eieuVar = eieuVarA;
        }
    }

    public final void h(MessageCoreData messageCoreData) {
        if (messageCoreData.C().a == -1) {
            ((eksl) b.h()).q("Not notifying UI about new message because message id is -1");
            return;
        }
        if (((Boolean) ames.c.e()).booleanValue()) {
            Iterator it = ((Set) this.au.b()).iterator();
            while (it.hasNext()) {
                ((axjy) it.next()).d(messageCoreData.C().toString(), messageCoreData.A().toString(), messageCoreData.o());
            }
        }
        this.t.j(messageCoreData.A(), messageCoreData.C());
    }

    public final boolean i(Action action, MessageCoreData messageCoreData) {
        if (((aqyy) this.aF.b()).a() && n(messageCoreData)) {
            MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
            if (messagePartCoreDataH == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (messagePartCoreDataH.z() != null) {
                eksl ekslVar = (eksl) b.h();
                ekslVar.X(cqnc.b, messageCoreData.C());
                ekrz ekrzVar = coie.j;
                MessagePartCoreData messagePartCoreDataH2 = messageCoreData.H();
                if (messagePartCoreDataH2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ekslVar.X(ekrzVar, messagePartCoreDataH2.z());
                ekslVar.q("InsertNewMessageProcessor: Send message directly & bypass pending message queue for file transfer message with processing id.");
                auvh.h(((atgy) this.aE.b()).c(messageCoreData));
                return true;
            }
        }
        Action actionE = ((ayrm) this.ar.b()).e(messageCoreData, 2);
        if (actionE == null) {
            return false;
        }
        actionE.B(action);
        if (((aqbh) this.G.b()).a() && messageCoreData.da()) {
            ((eksl) b.h()).q("InsertNewMessageProcessor: Send message directly & bypass pending message queue for Satellite message.");
            return true;
        }
        ((eksl) b.h()).q("InsertNewMessageProcessor: Send message directly & bypass pending message queue because it's empty.");
        return true;
    }

    public final boolean j(MessageCoreData messageCoreData) {
        if (!this.aG.a()) {
            return false;
        }
        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
        return (messagePartCoreDataH != null ? messagePartCoreDataH.z() : null) != null && n(messageCoreData);
    }

    public final boolean k(final MessageCoreData messageCoreData) throws IOException {
        messageCoreData.getClass();
        if (!messageCoreData.cX() || !messageCoreData.cS() || messageCoreData.db()) {
            return false;
        }
        if ((messageCoreData.cl() && !j(messageCoreData)) || messageCoreData.cF() || messageCoreData.V() != null || messageCoreData.W() != null) {
            return false;
        }
        eieu eieuVarA = eiiy.a("InsertNewMessageProcessor::opportunisticUiUpdateInside");
        try {
            if (messageCoreData.F().i()) {
                messageCoreData.cd(((auau) this.ax.b()).a());
            }
            if (((eoth) ((aovw) this.ay).a.b()).a("bugle.show_rcs_text_in_ui_before_persistence_async")) {
                eijx.f(new Runnable() { // from class: axqn
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        this.a.c(messageCoreData);
                    }
                }, this.az).getClass();
            } else {
                c(messageCoreData);
            }
            fczl.a(eieuVarA, null);
            return true;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarA, th);
                throw th2;
            }
        }
    }
}
