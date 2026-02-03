package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chxl implements chwq {
    private static final ekrg k = ekrg.c("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl");
    private final fcsu A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    private final fcsu F;
    private final fcsu G;
    private final fcsu H;
    private final cuur I;
    private final fcsu J;
    private final fcsu K;
    private final fcsu L;
    private final fcsu M;
    private final dzuc N;
    private final fcsu O;
    private final fcsu P;
    private final fcsu Q;
    private final fcsu R;
    private final aqnw S;
    private final apth T;
    private final area U;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    private final fcsu l;
    private final fcsu m;
    private final Context n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final cqbm t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;
    private final fcsu x;
    private final fcsu y;
    private final fcsu z;

    public chxl(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Context context, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, cqbm cqbmVar, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, cuur cuurVar, fcsu fcsuVar28, fcsu fcsuVar29, dzuc dzucVar, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, fcsu fcsuVar36, fcsu fcsuVar37, fcsu fcsuVar38, aqnw aqnwVar, apth apthVar, area areaVar) {
        this.w = fcsuVar;
        this.x = fcsuVar2;
        this.n = context;
        this.M = fcsuVar3;
        this.l = fcsuVar4;
        this.m = fcsuVar5;
        this.o = fcsuVar6;
        this.p = fcsuVar7;
        this.q = fcsuVar8;
        this.r = fcsuVar9;
        this.s = fcsuVar10;
        this.t = cqbmVar;
        this.u = fcsuVar11;
        this.v = fcsuVar12;
        this.y = fcsuVar13;
        this.z = fcsuVar14;
        this.A = fcsuVar15;
        this.B = fcsuVar16;
        this.C = fcsuVar17;
        this.D = fcsuVar18;
        this.E = fcsuVar19;
        this.b = fcsuVar20;
        this.c = fcsuVar21;
        this.F = fcsuVar22;
        this.G = fcsuVar23;
        this.H = fcsuVar24;
        this.d = fcsuVar25;
        this.e = fcsuVar26;
        this.L = fcsuVar27;
        this.I = cuurVar;
        this.J = fcsuVar28;
        this.K = fcsuVar29;
        this.N = dzucVar;
        this.O = fcsuVar30;
        this.f = fcsuVar31;
        this.P = fcsuVar32;
        this.Q = fcsuVar33;
        this.g = fcsuVar34;
        this.h = fcsuVar35;
        this.i = fcsuVar36;
        this.j = fcsuVar37;
        this.R = fcsuVar38;
        this.S = aqnwVar;
        this.T = apthVar;
        this.U = areaVar;
    }

    private final int L() {
        return ((crny) this.q.b()).k().a();
    }

    private static int M(int i) {
        if (i != 0) {
            return i != 1 ? -1 : 1;
        }
        return 0;
    }

    private final Uri N(MessageCoreData messageCoreData, int i, long j) {
        if (i != 0) {
            return null;
        }
        Uri uriN = ((cmqj) this.D.b()).n((bbdl) this.c.b(), messageCoreData, j);
        if (messageCoreData.cB() && messageCoreData.cl()) {
            messageCoreData.bC();
            messageCoreData.aS();
            Collection.EL.stream(messageCoreData.M()).forEach(new Consumer() { // from class: chwu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((MessagePartCoreData) obj).av(null);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((baxe) this.A.b()).Q(messageCoreData, messageCoreData.M());
        }
        return uriN;
    }

    private final Optional O(int i) {
        String str = (String) this.I.a(i).h().orElse(null);
        if (TextUtils.isEmpty(str)) {
            if (i != -1) {
                Optional optionalI = ((crny) this.q.b()).h(i).i(false);
                R(optionalI, 5);
                return optionalI;
            }
            if (TextUtils.isEmpty(str)) {
                ekrw ekrwVarJ = k.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getMsisdnFromSubscriptionSettings", 780, "RcsUtilsImpl.java")).q("No default number, returning empty msisdn");
                return Optional.empty();
            }
        }
        ekrw ekrwVarE = k.e();
        ekrwVarE.X(eksq.a, "BugleRcs");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getMsisdnFromSubscriptionSettings", 785, "RcsUtilsImpl.java")).r("Using subId %d for msisdn", i);
        Optional optionalOf = Optional.of(((crny) this.q.b()).h(i).h(str));
        R(optionalOf, 6);
        return optionalOf;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [alqm, java.lang.Object] */
    @Deprecated
    private final Optional P() {
        Optional optionalFlatMap = ((dggz) this.f.b()).l().flatMap(new Function() { // from class: chwv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cqej) this.a.d.b()).a((dgiq) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (optionalFlatMap.isEmpty() || ((alqm) optionalFlatMap.get()).e().isEmpty()) {
            ekrw ekrwVarJ = k.j();
            ekrwVarJ.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsMessagingIdentityFromSources", 734, "RcsUtilsImpl.java")).q("Failed to get msisdn from Bugle");
            try {
                optionalFlatMap = Optional.of(((alrj) this.e.b()).r(((RcsProfileService) this.s.b()).getMsisdn()));
                R(optionalFlatMap, 4);
            } catch (efao | NullPointerException e) {
                ekrw ekrwVarJ2 = k.j();
                ekrwVarJ2.X(eksq.a, "BugleRcs");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e)).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsMessagingIdentityFromSources", (char) 743, "RcsUtilsImpl.java")).q("Failed to get msisdn from RcsProfileService");
            }
        }
        if (!optionalFlatMap.isEmpty() && !((alqm) optionalFlatMap.get()).e().isEmpty()) {
            return optionalFlatMap;
        }
        Optional optionalO = O(((chvg) this.K.b()).a(chvn.q));
        return (!optionalO.isPresent() || TextUtils.isEmpty(optionalO.get().j())) ? O(-1) : optionalO;
    }

    private final boolean Q() {
        return ((Boolean) ((dggz) this.f.b()).l().map(new Function() { // from class: chwt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((dgiq) obj).o().mChatRevokeTimer > 0);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [alqm, java.lang.Object] */
    private final void R(Optional optional, int i) {
        if (optional.isPresent() && optional.get().e().isPresent()) {
            ((ains) this.m.b()).e("Bugle.Rcs.PhoneNumber.Invalid.Counts", i);
        }
    }

    private final List S(String str) {
        Uri uriWithAppendedPath = Uri.withAppendedPath(Uri.parse(str), "addr");
        ainv ainvVarB = ((aipo) this.l.b()).b("Bugle.Telephony.Query.Addr.Latency");
        Cursor cursorC = cdzz.c(this.n.getContentResolver(), uriWithAppendedPath, avbn.b(), null, null, null);
        axie.l(cursorC);
        ainvVarB.c();
        if (cursorC == null) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorC.moveToNext()) {
                alqm alqmVarX = ((alrj) this.e.b()).x(((cmnx) this.y.b()).a(cursorC));
                if (!arrayList.contains(alqmVarX) && !((bbdl) this.c.b()).j(alqmVarX)) {
                    arrayList.add(alqmVarX);
                }
            }
            return arrayList;
        } finally {
            cursorC.close();
        }
    }

    @Override // defpackage.chwq
    public final boolean A(ConversationIdType conversationIdType) {
        fcsu fcsuVar = this.z;
        return ((bakt) fcsuVar.b()).ah(conversationIdType) || ((bakt) fcsuVar.b()).ac(conversationIdType);
    }

    @Override // defpackage.chwq
    public final boolean B() {
        enwr enwrVarD = ((chza) ((cqbm) this.C.b()).a()).d();
        cqlb cqlbVar = (cqlb) ((cqjy) this.F.b()).d.b();
        if (((Boolean) dfaq.E().c().a()).booleanValue() && ((crqv) cqlbVar.a.b()).q("bugle_allow_rcs_overrides", false) && enwrVarD != enwr.DISABLED_TERMS_AND_CONDITIONS_REJECTED) {
            return false;
        }
        int iOrdinal = enwrVarD.ordinal();
        if (iOrdinal != 10 && iOrdinal != 16 && iOrdinal != 18) {
            switch (iOrdinal) {
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    break;
                default:
                    ekrw ekrwVarE = k.e();
                    ekrwVarE.X(eksq.a, "BugleRcs");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isReadyForProvisioning", 410, "RcsUtilsImpl.java")).t("isReadyForProvisioning: false, rcsAvailability is %s", enwrVarD);
                    break;
            }
            return false;
        }
        ekrw ekrwVarE2 = k.e();
        ekrwVarE2.X(eksq.a, "BugleRcs");
        ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isReadyForProvisioning", 407, "RcsUtilsImpl.java")).t("isReadyForProvisioning: true, rcsAvailability is %s", enwrVarD);
        return true;
    }

    @Override // defpackage.chwq
    public final synchronized boolean C() {
        return ((crqv) this.p.b()).q("rcs_welcome_message_dismissed", false);
    }

    @Override // defpackage.chwq
    public final boolean D(int i) {
        return ((cjpo) this.H.b()).n(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    @Override // defpackage.chwq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType E(long r17, defpackage.cnqj r19, com.google.android.ims.rcsservice.group.GroupInfo r20, j$.util.Optional r21, int r22, j$.util.Optional r23, boolean r24, int r25, j$.util.Optional r26) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chxl.E(long, cnqj, com.google.android.ims.rcsservice.group.GroupInfo, j$.util.Optional, int, j$.util.Optional, boolean, int, j$.util.Optional):com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType");
    }

    @Override // defpackage.chwq
    public final void F(Bundle bundle) {
        Intent intent = new Intent(RcsIntents.ACTION_PROVISIONING_EVENT);
        intent.putExtra("com.google.android.ims.provisioning.engine.provisioning_event_code_key", 100);
        intent.putExtra("com.google.android.ims.provisioning.engine.provisioning_event_bundle_key", bundle);
        String string = bundle.toString();
        ekrw ekrwVarE = k.e();
        ekrwVarE.X(eksq.a, "BugleRcs");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "broadcastProvisioningEvent", 1502, "RcsUtilsImpl.java")).D("Sending ProvisioningEvent %s, %s", dgic.b(100), cqcv.b(string));
        Context context = this.n;
        intent.putExtra("pending_intent", PendingIntent.getBroadcast(context, 0, intent, 201326592));
        dhka.c(context, intent);
        context.sendBroadcast(intent);
    }

    @Override // defpackage.chwq
    public final boolean G(MessageCoreData messageCoreData, int i, int i2, long j) {
        int i3;
        Uri uri;
        eieu eieuVarK;
        final MessageCoreData messageCoreData2 = messageCoreData;
        int i4 = i != 0 ? 1 : i;
        Uri uriN = N(messageCoreData2, i4, j);
        final ArrayList arrayList = new ArrayList();
        if (messageCoreData2.ah().isEmpty()) {
            ekrw ekrwVarJ = k.j();
            ekrwVarJ.X(eksq.a, "BugleRcs");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cqnc.f, messageCoreData2.F());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "prepareRcsMessageFallback", 1315, "RcsUtilsImpl.java")).q("Message fallback initiated but senderSendDestination is empty. RCS message will not be revoked.");
        }
        final String strA = cdyv.a(messageCoreData2.ac());
        if (i4 == 1 && strA != null) {
            final baxw baxwVar = (baxw) this.R.b();
            ((dqsn) baxwVar.c.b()).d("MessageCaptionOperations#performImageCaptionFallback", new Runnable() { // from class: baxu
                @Override // java.lang.Runnable
                public final void run() {
                    baxw baxwVar2 = baxwVar;
                    fcsu fcsuVar = baxwVar2.a;
                    MessageCoreData messageCoreData3 = messageCoreData2;
                    final MessageIdType messageIdTypeC = messageCoreData3.C();
                    MessagePartData messagePartDataI = ((bahv) fcsuVar.b()).i(strA);
                    messageCoreData3.aM(messagePartDataI);
                    messagePartDataI.aO(messageIdTypeC);
                    ((bauh) baxwVar2.b.b()).b(messagePartDataI, messageCoreData3.A());
                    String[] strArr = MessagesTable.a;
                    brdu brduVar = new brdu();
                    brduVar.p(null);
                    brduVar.e(messageCoreData3.C());
                    messageCoreData3.bs(null);
                    String[] strArr2 = bqbb.a;
                    bqat bqatVar = new bqat();
                    bqatVar.f("performImageCaptionFallback");
                    bqatVar.b = new bqaz((bqba) new Function() { // from class: baxv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bqba bqbaVar = (bqba) obj;
                            bqbaVar.getClass();
                            bqbaVar.ap(new dqpj("message_captions.message_id", 1, Long.valueOf(bary.a(messageIdTypeC))));
                            return bqbaVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }.apply(new bqba()));
                    bqatVar.d();
                }
            });
        }
        if (i4 == 1) {
            fcsu fcsuVar = this.E;
            cmop cmopVar = ((ayqs) fcsuVar.b()).b;
            ArrayList<MessagePartCoreData> arrayList2 = ((MessageData) messageCoreData2).i;
            i3 = i4;
            long jBJ = 0;
            for (MessagePartCoreData messagePartCoreData : arrayList2) {
                fcsu fcsuVar2 = fcsuVar;
                Context context = cmopVar.d;
                jBJ += messagePartCoreData.bJ();
                fcsuVar = fcsuVar2;
            }
            fcsu fcsuVar3 = fcsuVar;
            if (new cmmm(jBJ, cmopVar.b.a(i2).b()).c()) {
                ayqs ayqsVar = (ayqs) fcsuVar3.b();
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((MessagePartCoreData) it.next()).aY()) {
                            break;
                        }
                    } else {
                        cmop cmopVar2 = ayqsVar.b;
                        Iterator it2 = arrayList2.iterator();
                        uri = uriN;
                        long jN = 0;
                        while (it2.hasNext()) {
                            jN += ((MessagePartCoreData) it2.next()).n();
                        }
                        if (!new cmmm(jN, cmopVar2.b.a(i2).b()).c()) {
                            ayqs ayqsVar2 = (ayqs) fcsuVar3.b();
                            ArrayList arrayList3 = new ArrayList();
                            for (MessagePartCoreData messagePartCoreData2 : arrayList2) {
                                if (!((Boolean) cgwx.a.e()).booleanValue() || !messagePartCoreData2.bi()) {
                                    messagePartCoreData2.aH(ayqsVar2.c.a(i2, false));
                                    messagePartCoreData2.aB(bxlf.d(null, ayqsVar2.a));
                                    arrayList3.add(messagePartCoreData2);
                                }
                            }
                            messageCoreData2 = messageCoreData;
                            ayqsVar2.e.d(messageCoreData2, messageCoreData.u(), ayqsVar2.d.f().toEpochMilli(), arrayList3);
                            ArrayList arrayList4 = new ArrayList();
                            ayqs.a(arrayList3, arrayList4);
                            arrayList.addAll(ekgb.n(arrayList4));
                        }
                    }
                }
                ekrw ekrwVarG = k.g();
                ekrwVarG.X(eksq.a, "BugleRcs");
                ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "prepareRcsMessageFallback", 1326, "RcsUtilsImpl.java")).q("Cannot resize message for MMS fallback");
                return false;
            }
            messageCoreData2 = messageCoreData;
        } else {
            i3 = i4;
        }
        uri = uriN;
        if (arrayList.isEmpty()) {
            baxe baxeVar = (baxe) this.A.b();
            eieuVarK = eiiy.k("MessageDatabaseOperations#markMessageForResending");
            try {
                ConversationIdType conversationIdTypeA = messageCoreData2.A();
                MessageIdType messageIdTypeC = messageCoreData2.C();
                brdu brduVarC = baxe.C(messageIdTypeC, i3, j, uri);
                brduVarC.U(4);
                brduVarC.G(j);
                baxeVar.T(brduVarC.b(), conversationIdTypeA, messageIdTypeC);
                eieuVarK.close();
                return true;
            } finally {
            }
        } else {
            baxe baxeVar2 = (baxe) this.A.b();
            ConversationIdType conversationIdTypeA2 = messageCoreData2.A();
            MessageIdType messageIdTypeC2 = messageCoreData2.C();
            eieuVarK = eiiy.k("MessageDatabaseOperations#markMessageForResizeResending");
            try {
                brdu brduVarC2 = baxe.C(messageIdTypeC2, 1, j, null);
                brduVarC2.U(10);
                brduVarC2.G(j);
                baxeVar2.T(brduVarC2.b(), conversationIdTypeA2, messageIdTypeC2);
                eieuVarK.close();
                ((dqsn) this.G.b()).g(new dqsm() { // from class: chwx
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        return eiiy.k("RUI::attachmentsChanged::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: chwy
                    @Override // java.lang.Runnable
                    public final void run() {
                        chxl chxlVar = this.a;
                        ((bxna) chxlVar.b.b()).c(arrayList, ((ajsn) chxlVar.j.b()).a(messageCoreData2.A(), null, false));
                    }
                });
                return true;
            } finally {
            }
        }
    }

    @Override // defpackage.chwq
    public final void H(MessageCoreData messageCoreData, int i, long j) {
        if (i != 0) {
            i = 1;
        }
        ejwl.a(true);
        baxe baxeVar = (baxe) this.A.b();
        Uri uriN = N(messageCoreData, i, j);
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#markMessageAsResent");
        try {
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            MessageIdType messageIdTypeC = messageCoreData.C();
            brdu brduVarC = baxe.C(messageIdTypeC, i, j, uriN);
            brduVarC.U(1);
            baxeVar.T(brduVarC.b(), conversationIdTypeA, messageIdTypeC);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.chwq
    public final int I() {
        ekrg ekrgVar = k;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleRcs");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsMessageTransportTech", 1520, "RcsUtilsImpl.java")).q("Getting the IM tech from RcsConfigurationProvider");
        Optional optionalL = ((dggz) this.f.b()).l();
        if (optionalL.isEmpty()) {
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsMessageTransportTech", 1524, "RcsUtilsImpl.java")).q("Unable to retrieve the RCS Config from RcsConfigurationProvider for getting the IM tech.");
        }
        if (optionalL.isEmpty()) {
            return 1;
        }
        int i = ((dgiq) optionalL.get()).o().mMessageTech;
        if (i == 0) {
            return 2;
        }
        return i == 1 ? 3 : 1;
    }

    public final chwp J(ConversationIdType conversationIdType) {
        return !A(conversationIdType) ? chwp.NONE : chwp.MANUAL;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [alqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [alqm, java.lang.Object] */
    public final String K(Optional optional) {
        Optional optionalOf = Optional.of(((alrj) this.e.b()).h((alqm) optional.get(), (String) ((alqm) optional.get()).c().orElse("")));
        cczv cczvVar = alvx.a;
        return ejwk.b(((Boolean) new alvi().get()).booleanValue() ? ((aubq) optionalOf.get().e().get()).d : optionalOf.get().n());
    }

    @Override // defpackage.ccyz
    public final void a() {
        r();
    }

    @Override // defpackage.cfsd
    public final void c(String str) {
        ekrg ekrgVar = k;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleRcs");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "onRegistrationIdReceived", 1426, "RcsUtilsImpl.java")).t("Tachyon Anonymous Device ID received: %s", str);
        ekrw ekrwVarE2 = ekrgVar.e();
        ekrwVarE2.X(ekrzVar, "BugleRcs");
        ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "broadcastTachyonAnonymousDeviceId", 453, "RcsUtilsImpl.java")).t("Send Tachyon Anonymous Device ID to RCS process: %s", str);
        Intent intent = new Intent(RcsIntents.ACTION_TACHYON_ANONYMOUS_DEVICE_ID);
        Context context = this.n;
        dhka.c(context, intent);
        dhff.c(context, intent);
        intent.putExtra(RcsIntents.EXTRA_TACHYON_ANONYMOUS_DEVICE_ID, str);
        context.sendBroadcast(intent);
    }

    @Override // defpackage.chwq
    public final int d() {
        int iD = ((crqv) this.p.b()).d(this.n.getString(R.string.rcs_default_sharing_method_key), -1);
        int iM = M(iD);
        if (iD != -1) {
            ekrw ekrwVarE = k.e();
            ekrwVarE.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getDefaultSharingMethod", 877, "RcsUtilsImpl.java")).r("obtained sharingMethod from buglePrefs: %d", iM);
            return iM;
        }
        if (((chza) ((cqbm) this.C.b()).a()).d() == enwr.AVAILABLE) {
            iD = ((RcsProfileService) this.s.b()).getDefaultSharingMethod();
            ekrw ekrwVarE2 = k.e();
            ekrwVarE2.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getDefaultSharingMethod", 885, "RcsUtilsImpl.java")).r("obtained sharingMethod from profileService: %d", iD);
        }
        return M(iD);
    }

    @Override // defpackage.chwq
    public final int e(Optional optional) {
        if (optional.isEmpty()) {
            ekrw ekrwVarJ = k.j();
            ekrwVarJ.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsConversationParticipantLimit", 832, "RcsUtilsImpl.java")).q("#getRcsConversationParticipantLimit: selfChatEndpoint is empty");
        }
        return ((Integer) optional.map(new Function() { // from class: chww
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                chxl chxlVar = this.a;
                Optional optionalJ = ((dggz) chxlVar.f.b()).j(((dggl) chxlVar.g.b()).a(((aubq) obj).d));
                int iD = cqej.d(optionalJ);
                if (iD == 0) {
                    iD = Alert.DURATION_SHOW_INDEFINITELY;
                }
                return Integer.valueOf(iD);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue();
    }

    @Override // defpackage.chwq
    public final ln f(MessageCoreData messageCoreData) {
        ln lnVar = new ln();
        Iterator it = messageCoreData.M().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            if (messagePartCoreData.bd()) {
                lnVar.a.clear();
                lt ltVar = new lt();
                String strAb = messagePartCoreData.ab();
                String strR = messagePartCoreData.R();
                if (strAb != null) {
                    ltVar.i(strAb.getBytes(StandardCharsets.UTF_8));
                }
                if (strR != null) {
                    ltVar.h(strR.getBytes(StandardCharsets.UTF_8));
                }
                ltVar.k("attachment".getBytes(StandardCharsets.UTF_8));
                ltVar.d(106);
                lnVar.d(ltVar);
            } else {
                if (!messagePartCoreData.aX()) {
                    lt ltVar2 = new lt();
                    String strAs = messageCoreData.as();
                    ltVar2.i(strAs != null ? strAs.getBytes() : null);
                    ltVar2.h("text/plain".getBytes());
                    ltVar2.k("body".getBytes());
                    lnVar.d(ltVar2);
                } else if (messagePartCoreData.bo()) {
                    lt ltVar3 = new lt();
                    String strAA = messageCoreData.aA();
                    ltVar3.i(strAA != null ? strAA.getBytes() : null);
                    ltVar3.h("text/plain".getBytes());
                    ltVar3.k("body".getBytes());
                    lnVar.d(ltVar3);
                }
            }
        }
        if (this.T.a() && messageCoreData.cX() && messageCoreData.c() == 1 && ((MessagePartCoreData) messageCoreData.M().get(0)).bj()) {
            String strA = cdyv.a(messageCoreData.ac());
            if (!TextUtils.isEmpty(strA)) {
                lt ltVar4 = new lt();
                ltVar4.i(strA.getBytes());
                ltVar4.h("text/plain".getBytes());
                ltVar4.k("body".getBytes());
                lnVar.d(ltVar4);
            }
        }
        return lnVar;
    }

    @Override // defpackage.chwq
    public final axcy g() {
        return ((bbdl) this.c.b()).f(((aqsk) this.w.b()).a() ? L() : ((chvg) this.K.b()).a(chvn.p));
    }

    @Override // defpackage.ccyz
    public final boolean gd() {
        return true;
    }

    @Override // defpackage.chwq
    public final chwp h() {
        return !Q() ? chwp.NONE : chwp.MANUAL;
    }

    @Override // defpackage.chwq
    public final chwp i(basd basdVar) {
        ConversationIdType conversationIdTypeA = barn.a;
        MessageCoreData messageCoreDataX = ((baxe) this.A.b()).x(basdVar);
        if (messageCoreDataX != null) {
            conversationIdTypeA = messageCoreDataX.A();
        }
        return conversationIdTypeA.b() ? !Q() ? chwp.NONE : chwp.MANUAL : J(conversationIdTypeA);
    }

    @Override // defpackage.chwq
    @Deprecated
    public final cmtz j(long j, String str, String str2, Integer num) {
        return k(cnqj.b(j), str, str2, num);
    }

    @Override // defpackage.chwq
    public final cmtz k(cnqj cnqjVar, String str, String str2, Integer num) {
        String strK;
        String str3;
        String strB;
        String strA;
        cqaz.h();
        if (str != null && ((chwl) this.O.b()).f(str)) {
            String strB2 = ejwk.b(((csrx) this.u.b()).c(str));
            int length = strB2.length();
            int i = length - 15;
            int i2 = length - 16;
            int iLastIndexOf = strB2.lastIndexOf(31, i2);
            int iLastIndexOf2 = strB2.lastIndexOf(31, iLastIndexOf - 1);
            if (iLastIndexOf == -1) {
                iLastIndexOf = strB2.lastIndexOf(45, i2);
                iLastIndexOf2 = strB2.lastIndexOf(45, iLastIndexOf - 1);
            }
            return cmtz.a(cnqjVar, S(str2), URLDecoder.decode(strB2.substring(0, iLastIndexOf2)), strB2.substring(iLastIndexOf2 + 1, iLastIndexOf), strB2.substring(iLastIndexOf + 1, i));
        }
        if (str != null) {
            fcsu fcsuVar = this.O;
            if (((chwl) fcsuVar.b()).e(str)) {
                List listS = S(str2);
                cmtu cmtuVarA = ((chwl) fcsuVar.b()).a(str);
                if (cmtuVarA != null) {
                    strB = cmtuVarA.b;
                    if (TextUtils.isEmpty(strB)) {
                        strB = ((chvg) this.K.b()).b();
                    }
                    strA = cmtuVarA.c;
                    if (TextUtils.isEmpty(strA)) {
                        strA = bajp.a();
                    }
                    str3 = cmtuVarA.a;
                } else {
                    String strC = ((csrx) this.u.b()).c(str);
                    cqaz.c(String.format(Locale.US, "The RBM bot thread data in Telephony is invalid: encoded = %s, decoded = %s", cqcv.b(str), cqcv.b(strC)));
                    Iterator it = listS.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strK = null;
                            break;
                        }
                        alqm alqmVar = (alqm) it.next();
                        if (alqmVar.t()) {
                            cczv cczvVar = alvx.a;
                            strK = alqmVar.k(((Boolean) new alvr().get()).booleanValue());
                            break;
                        }
                    }
                    if (strK != null) {
                        str = strK;
                    } else if (true != TextUtils.isEmpty(strC)) {
                        str = strC;
                    }
                    str3 = str;
                    strB = ((chvg) this.K.b()).b();
                    strA = bajp.a();
                }
                cmtu cmtuVar = new cmtu(str3, strB, strA);
                str3.getClass();
                return cmtz.b(cnqjVar, Collections.singletonList(((alrj) this.e.b()).n(str3)), cmtuVar);
            }
        }
        return ((cmqj) this.D.b()).v(cnqjVar, str2, num);
    }

    @Override // defpackage.chwq
    @Deprecated
    public final Optional l() {
        if (!((aqsk) this.w.b()).a()) {
            return P().filter(new Predicate() { // from class: chwz
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((alqm) obj).e().isPresent();
                }
            }).map(new Function() { // from class: chxa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    alqm alqmVar = (alqm) obj;
                    chxl chxlVar = this.a;
                    return ((alrj) chxlVar.e.b()).h(alqmVar, chxlVar.K(Optional.of(alqmVar)));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        int iL = L();
        if (iL < 0) {
            return Optional.empty();
        }
        Optional optionalOfNullable = Optional.ofNullable(((chtk) this.x.b()).a(iL));
        final alrj alrjVar = (alrj) this.e.b();
        alrjVar.getClass();
        return optionalOfNullable.map(new Function() { // from class: chxc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return alrjVar.b((aubq) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.chwq
    public final synchronized Optional m() {
        return Optional.ofNullable(((crqv) this.p.b()).s());
    }

    @Override // defpackage.chwq
    public final String n(String str, String str2) {
        String strC = ((cejp) this.L.b()).c();
        String str3 = (str != null ? URLEncoder.encode(str) : "") + "\u001f" + strC + "\u001f" + str2 + "@rcs.google.com";
        ekrw ekrwVarG = k.g();
        ekrwVarG.X(eksq.a, "BugleRcs");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "buildGroupBackupContactNameHelper", 912, "RcsUtilsImpl.java")).t("Created group backup contact name %s", cqcv.b(str3));
        return ((csrx) this.u.b()).d(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:3:0x0009, B:6:0x001b, B:8:0x0021, B:9:0x0047, B:11:0x0051, B:12:0x0056, B:14:0x0062, B:15:0x006f, B:21:0x009e, B:18:0x0097), top: B:27:0x0009 }] */
    @Override // defpackage.chwq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String o(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9) {
        /*
            r8 = this;
            java.lang.String r0 = "RCS.GetContributionId"
            dzuc r1 = r8.N
            dzub r1 = r1.d()
            r2 = 0
            java.lang.String r3 = "RcsUtilsImpl.java"
            cczi r4 = defpackage.avos.a     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r5 = r4.e()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lb5
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = ""
            if (r5 == 0) goto L56
            bojh r5 = defpackage.botm.b(r9)     // Catch: java.lang.Throwable -> Lb5
            if (r5 != 0) goto L47
            ekrg r4 = defpackage.chxl.k     // Catch: java.lang.Throwable -> Lb5
            ekrw r4 = r4.i()     // Catch: java.lang.Throwable -> Lb5
            ekrz r5 = defpackage.eksq.a     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r7 = "BugleRcs"
            r4.X(r5, r7)     // Catch: java.lang.Throwable -> Lb5
            ekrd r4 = (defpackage.ekrd) r4     // Catch: java.lang.Throwable -> Lb5
            ekrz r5 = defpackage.cqnc.s     // Catch: java.lang.Throwable -> Lb5
            r4.X(r5, r9)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r9 = "com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl"
            java.lang.String r5 = "getContributionIdFromConversationIdInternal"
            r7 = 948(0x3b4, float:1.328E-42)
            ekrw r9 = r4.h(r9, r5, r7, r3)     // Catch: java.lang.Throwable -> Lb5
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = "Conversation was not found"
            r9.q(r3)     // Catch: java.lang.Throwable -> Lb5
            goto La8
        L47:
            java.lang.String r3 = r5.ae()     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lb5
            if (r3 != 0) goto L56
            java.lang.String r6 = r5.ae()     // Catch: java.lang.Throwable -> Lb5
            goto La8
        L56:
            java.lang.Object r3 = r4.e()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto L6f
            fcsu r3 = r8.m     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> Lb5
            ains r3 = (defpackage.ains) r3     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = "Bugle.RcsMigration.ContributionIdFromTelephony"
            r3.c(r4)     // Catch: java.lang.Throwable -> Lb5
        L6f:
            fcsu r3 = r8.B     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> Lb5
            bxjh r3 = (defpackage.bxjh) r3     // Catch: java.lang.Throwable -> Lb5
            cnqj r3 = r3.a(r9)     // Catch: java.lang.Throwable -> Lb5
            fcsu r4 = r8.z     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Lb5
            bakt r4 = (defpackage.bakt) r4     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = r4.I(r9)     // Catch: java.lang.Throwable -> Lb5
            fcsu r5 = r8.A     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Lb5
            baxe r5 = (defpackage.baxe) r5     // Catch: java.lang.Throwable -> Lb5
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9 = r5.o(r9)     // Catch: java.lang.Throwable -> Lb5
            if (r9 != 0) goto L97
            r9 = r2
            goto L9b
        L97:
            android.net.Uri r9 = r9.u()     // Catch: java.lang.Throwable -> Lb5
        L9b:
            if (r9 != 0) goto L9e
            goto La8
        L9e:
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lb5
            cmtz r9 = r8.k(r3, r4, r9, r2)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = r9.e     // Catch: java.lang.Throwable -> Lb5
        La8:
            dzuc r9 = r8.N
            dzfh r3 = new dzfh
            r3.<init>(r0)
            dzua r0 = defpackage.dzua.SUCCESS
            r9.f(r1, r3, r2, r0)
            return r6
        Lb5:
            r9 = move-exception
            dzuc r3 = r8.N
            dzfh r4 = new dzfh
            r4.<init>(r0)
            dzua r0 = defpackage.dzua.SUCCESS
            r3.f(r1, r4, r2, r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chxl.o(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType):java.lang.String");
    }

    @Override // defpackage.chwq
    public final String p() {
        return "empty";
    }

    @Override // defpackage.chwq
    @Deprecated
    public final String q() {
        aubq aubqVarA;
        cqaz.h();
        if (((aqsk) this.w.b()).a()) {
            int iL = L();
            return (iL >= 0 && (aubqVarA = ((chtk) this.x.b()).a(iL)) != null) ? aubqVarA.d : "";
        }
        Optional optionalP = P();
        return (optionalP.isEmpty() || ((alqm) optionalP.get()).e().isEmpty()) ? "" : K(optionalP);
    }

    @Override // defpackage.chwq
    public final void r() {
        Bundle bundle = new Bundle();
        String strF = ((crqv) this.p.b()).f(this.n.getString(R.string.rcs_acs_url_override_key), null);
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_default_sms_app", ((crmx) this.v.b()).G());
        bundle.putLong("com.google.android.ims.provisioning.engine.bugle_version", cswl.a(r1).b);
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_has_required_permission", ((crma) this.o.b()).j());
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_enabled_rcs_from_preference", ((cjzq) this.P.b()).o());
        if (strF != null) {
            bundle.putString("com.google.android.ims.provisioning.engine.bugle_overridden_acs_url", strF);
        }
        F(bundle);
    }

    @Override // defpackage.chwq
    public final void s() {
        Intent intent = new Intent(RcsIntents.ACTION_DEBUG_OPTION_FORCE_CLIENT_TO_UNREGISTER);
        Context context = this.n;
        dhka.c(context, intent);
        dhff.c(context, intent);
        context.sendBroadcast(intent);
    }

    @Override // defpackage.chwq
    public final void t() {
        Intent intent = new Intent(RcsIntents.ACTION_RCS_RECURRING_METRICS_UPLOAD);
        Context context = this.n;
        dhka.c(context, intent);
        dhff.c(context, intent);
        context.sendBroadcast(intent);
    }

    @Override // defpackage.chwq
    public final void u(ewfq ewfqVar) {
        Intent intent = new Intent(RcsIntents.ACTION_RCS_SELF_SERVICE_MESSAGE);
        Context context = this.n;
        dhka.c(context, intent);
        dhff.c(context, intent);
        intent.putExtra(RcsIntents.EXTRA_RCS_SELF_SERVICE_MESSAGE, ewfqVar.toByteArray());
        if (!ewfqVar.c.isEmpty()) {
            intent.putExtra(RcsIntents.EXTRA_RCS_SELF_SERVICE_MESSAGE_ID, ewfqVar.c);
        }
        context.sendBroadcast(intent);
    }

    @Override // defpackage.chwq
    public final void v(long j) {
        ekrw ekrwVarG = k.g();
        ekrwVarG.X(eksq.a, "BugleRcs");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "deleteFileTransfer", 423, "RcsUtilsImpl.java")).s("Deleting file transfer with session id: %s", j);
        cqaz.h();
        cqaz.e(j, -1L);
        try {
            ((FileTransferService) this.r.b()).deleteFileTransfer(j);
        } catch (efao e) {
            ekrw ekrwVarI = k.i();
            ekrwVarI.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "deleteFileTransfer", 432, "RcsUtilsImpl.java")).s("Exception removing file transfer with session id: %s", j);
        }
    }

    @Override // defpackage.chwq
    public final boolean w(ConversationIdType conversationIdType) {
        chwp chwpVarJ = J(conversationIdType);
        if (chwpVarJ == chwp.MANUAL) {
            return true;
        }
        ((ains) this.m.b()).e("Bugle.Fallback.Conversation.Cancelled.Reason", chwpVarJ.ordinal() != 1 ? 2 : 1);
        return false;
    }

    @Override // defpackage.chwq
    public final boolean x(chwp chwpVar) {
        return chwpVar == chwp.AUTOMATIC_NOT_ROAMING || chwpVar == chwp.AUTOMATIC_ALWAYS;
    }

    @Override // defpackage.chwq
    public final boolean y(Intent intent) {
        try {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent == null) {
                ekrw ekrwVarJ = k.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isBroadcastFromAuthorizedSource", 358, "RcsUtilsImpl.java")).q("Pending intent is null. Broadcast not authorized.");
                return false;
            }
            if (((chud) this.J.b()).a(pendingIntent.getCreatorUid())) {
                return true;
            }
            ekrw ekrwVarJ2 = k.j();
            ekrwVarJ2.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isBroadcastFromAuthorizedSource", 365, "RcsUtilsImpl.java")).q("Package not google signed. Broadcast not authorized.");
            return false;
        } catch (RuntimeException e) {
            ekrw ekrwVarJ3 = k.j();
            ekrwVarJ3.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ3).g(e)).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isBroadcastFromAuthorizedSource", (char) 352, "RcsUtilsImpl.java")).q("Unable to retrieve pending intent. Broadcast not authorized.");
            return false;
        }
    }

    @Override // defpackage.chwq
    public final boolean z() {
        return (((cqey) this.t.a()).r() || ((crny) this.q.b()).i().A()) ? false : true;
    }
}
