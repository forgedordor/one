package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjnr {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender");
    public final fcsu b;
    public final dqsn c;
    public final cjpo d;
    private final crqv e;
    private final Context f;
    private final fcsu g;
    private final asrf h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final eosc p;

    public cjnr(crqv crqvVar, Context context, fcsu fcsuVar, fcsu fcsuVar2, asrf asrfVar, dqsn dqsnVar, cjpo cjpoVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, eosc eoscVar) {
        this.e = crqvVar;
        this.f = context;
        this.g = fcsuVar;
        this.b = fcsuVar2;
        this.h = asrfVar;
        this.c = dqsnVar;
        this.d = cjpoVar;
        this.i = fcsuVar3;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
        this.l = fcsuVar6;
        this.m = fcsuVar7;
        this.n = fcsuVar8;
        this.o = fcsuVar9;
        this.p = eoscVar;
    }

    static final void d(MessageIdType messageIdType) {
        e().e(messageIdType);
    }

    private static brdu e() {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("getIncrementReportCounterUpdateBuilder");
        brduVar.ag("report_attempt_acounter", dqxf.a(MessagesTable.c.V));
        return brduVar;
    }

    private final cjnq f(final MessageCoreData messageCoreData, aubq aubqVar, bojh bojhVar, final int i, elny elnyVar) {
        aubq aubqVar2;
        auhk auhkVar;
        if (!((aryp) this.o.b()).a()) {
            ((ajhd) this.b.b()).u(messageCoreData.F(), messageCoreData, i, this.h.a(), elnyVar);
        }
        audu auduVarA = null;
        if (((aryo) this.n.b()).a()) {
            aubqVar2 = null;
        } else {
            if (aubqVar == null) {
                if (!messageCoreData.af().isPresent() || ((alqm) messageCoreData.af().get()).w()) {
                    ParticipantsTable.BindData bindDataB = ((bbca) this.m.b()).b(messageCoreData.J().Z());
                    bindDataB.getClass();
                    asqx asqxVar = (asqx) this.l.b();
                    String strT = bindDataB.T();
                    strT.getClass();
                    aubqVar = asqxVar.a(strT, false);
                } else {
                    aubqVar = (aubq) ((alqm) messageCoreData.af().get()).e().get();
                }
            }
            aubqVar2 = aubqVar;
        }
        bojh bojhVarB = bojhVar == null ? botm.b(messageCoreData.A()) : bojhVar;
        bojhVarB.getClass();
        if (bvdi.d(bojhVarB.k())) {
            String strAe = bojhVarB.ae();
            String strAd = bojhVarB.ad();
            if (strAe == null || strAd == null) {
                ekrd ekrdVar = (ekrd) a.j();
                ekrdVar.X(cqnc.f, messageCoreData.F());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportWithPipeline", 396, "RcsReportSender.java")).q("RCS group does not have valid global identifiers and we are using ChatAPI.");
                enxt enxtVar = (enxt) enxu.a.createBuilder();
                enxv enxvVar = (enxv) enxw.a.createBuilder();
                enxvVar.copyOnWrite();
                enxw enxwVar = (enxw) enxvVar.instance;
                enxwVar.e = 1;
                enxwVar.b |= 4;
                enxi enxiVar = enxi.CHAT_API_INVALID_REMOTE_PARTICIPANT;
                enxvVar.copyOnWrite();
                enxw enxwVar2 = (enxw) enxvVar.instance;
                enxwVar2.f = enxiVar.D;
                enxwVar2.b |= 8;
                enxtVar.copyOnWrite();
                enxu enxuVar = (enxu) enxtVar.instance;
                enxw enxwVar3 = (enxw) enxvVar.build();
                enxwVar3.getClass();
                enxuVar.c = enxwVar3;
                enxuVar.b |= 1;
                ((ajhd) this.b.b()).w(messageCoreData.F(), messageCoreData, i, (enxu) enxtVar.build(), this.h.a());
                return cjnq.FAILED;
            }
            auduVarA = ((asra) this.k.b()).a(strAe, strAd);
        }
        audu auduVar = auduVarA;
        if (i == 1) {
            auhkVar = auhk.DELIVERY;
        } else if (i == 3) {
            auhkVar = auhk.DELIVERY_FAILED;
        } else {
            if (i != 10) {
                throw new IllegalArgumentException(a.g(i, "Unsupported report type: "));
            }
            auhkVar = auhk.DISPLAYED;
        }
        try {
            return (cjnq) ((chgo) this.j.b()).d(messageCoreData, aubqVar2, auhkVar, elnyVar, auduVar, new Bundle()).h(new ejvr() { // from class: cjno
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    chwo chwoVar = (chwo) obj;
                    if (chwoVar.a) {
                        return cjnq.SUCCEEDED;
                    }
                    int i2 = i;
                    MessageCoreData messageCoreData2 = messageCoreData;
                    ((ajhd) this.a.b.b()).w(messageCoreData2.F(), messageCoreData2, i2, chwoVar.b, chwoVar.c);
                    if (chwoVar.b != null) {
                        ekrd ekrdVar2 = (ekrd) cjnr.a.j();
                        ekrdVar2.X(cqnc.f, messageCoreData2.F());
                        ekrd ekrdVar3 = (ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "logSendRcsReportApiResult", 468, "RcsReportSender.java");
                        enxw enxwVar4 = chwoVar.b.c;
                        if (enxwVar4 == null) {
                            enxwVar4 = enxw.a;
                        }
                        Integer numValueOf = Integer.valueOf(enxwVar4.c);
                        enxw enxwVar5 = chwoVar.b.c;
                        if (enxwVar5 == null) {
                            enxwVar5 = enxw.a;
                        }
                        int iA = enxo.a(enxwVar5.d);
                        if (iA == 0) {
                            iA = 1;
                        }
                        Integer numValueOf2 = Integer.valueOf(iA - 1);
                        enxw enxwVar6 = chwoVar.b.c;
                        if (enxwVar6 == null) {
                            enxwVar6 = enxw.a;
                        }
                        int iA2 = enxq.a(enxwVar6.e);
                        if (iA2 == 0) {
                            iA2 = 1;
                        }
                        Integer numValueOf3 = Integer.valueOf(iA2 - 1);
                        enxw enxwVar7 = chwoVar.b.c;
                        if (enxwVar7 == null) {
                            enxwVar7 = enxw.a;
                        }
                        enxi enxiVarB = enxi.b(enxwVar7.f);
                        if (enxiVarB == null) {
                            enxiVarB = enxi.CHAT_API_ERROR_CAUSE_UNKNOWN;
                        }
                        Integer numValueOf4 = Integer.valueOf(enxiVarB.D);
                        enxw enxwVar8 = chwoVar.b.c;
                        if (enxwVar8 == null) {
                            enxwVar8 = enxw.a;
                        }
                        enxk enxkVarB = enxk.b(enxwVar8.g);
                        if (enxkVarB == null) {
                            enxkVarB = enxk.CHAT_API_UNKNOWN;
                        }
                        Integer numValueOf5 = Integer.valueOf(enxkVarB.f);
                        enxw enxwVar9 = chwoVar.b.c;
                        if (enxwVar9 == null) {
                            enxwVar9 = enxw.a;
                        }
                        ekrdVar3.L("Failed to send report: [JibeServiceResultCode:%s, ExceptionType:%s, PointOfFailure:%s, ChatApiSenderError:%s, ChatApiStatus:%s, ChatApiReceiverError:%s]", numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, Integer.valueOf((enxg.a(enxwVar9.h) != 0 ? r10 : 1) - 1));
                    } else {
                        ekrd ekrdVar4 = (ekrd) cjnr.a.j();
                        ekrdVar4.X(cqnc.f, messageCoreData2.F());
                        ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "logSendRcsReportApiResult", 482, "RcsReportSender.java")).q("Failed to send report: and no diagnostics");
                    }
                    return cjnq.FAILED;
                }
            }, this.p).get();
        } catch (InterruptedException | ExecutionException e) {
            asqw asqwVar = new asqw("Failed to get the send message receipt future result.", e);
            auvh.d(asqwVar);
            throw asqwVar;
        }
    }

    public final cjnq a(MessageCoreData messageCoreData, aubq aubqVar, boolean z, bojh bojhVar, elny elnyVar) {
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        MessageIdType messageIdTypeC = messageCoreData.C();
        basd basdVarF = messageCoreData.F();
        bvdx bvdxVarL = messageCoreData.L();
        bvdx bvdxVar = bvdx.NOT_SENT;
        if (bvdxVarL.equals(bvdxVar)) {
            int iK = messageCoreData.k();
            ekrg ekrgVar = a;
            ekrd ekrdVar = (ekrd) ekrgVar.e();
            ekrz ekrzVar = cqnc.f;
            ekrdVar.X(ekrzVar, basdVarF);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 273, "RcsReportSender.java")).q("Try to send delivery report.");
            cjnq cjnqVarF = f(messageCoreData, aubqVar, bojhVar, iK == 116 ? 3 : 1, elnyVar);
            ekrd ekrdVar2 = (ekrd) ekrgVar.h();
            ekrdVar2.X(ekrzVar, basdVarF);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 279, "RcsReportSender.java")).t("Finished queuing delivery report. result: %s", cjnqVarF);
            if (!cjnqVarF.a()) {
                d(messageIdTypeC);
                return cjnqVarF;
            }
            brdu brduVarE = e();
            brduVarE.ap("updateDeliveryReportStatusSent");
            brduVarE.x(bvdx.SENT);
            ((baxe) this.g.b()).R(conversationIdTypeA, messageIdTypeC, brduVarE);
        } else if (bvdxVarL.equals(bvdx.NOT_REQUESTED)) {
            ekrd ekrdVar3 = (ekrd) a.h();
            ekrdVar3.X(cqnc.f, basdVarF);
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 295, "RcsReportSender.java")).q("Delivery report is not requested.");
        }
        bvdx bvdxVarN = messageCoreData.N();
        Context context = this.f;
        crqv crqvVar = this.e;
        Resources resources = context.getResources();
        if (crqvVar.q(resources.getString(R.string.send_seen_report_rcs_pref_key), resources.getBoolean(R.bool.send_seen_report_rcs_pref_default)) && !z && messageCoreData.cN() && bvdxVarN.equals(bvdxVar)) {
            ekrg ekrgVar2 = a;
            ekrd ekrdVar4 = (ekrd) ekrgVar2.e();
            ekrz ekrzVar2 = cqnc.f;
            ekrdVar4.X(ekrzVar2, basdVarF);
            ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 306, "RcsReportSender.java")).q("Try to send display report.");
            cjnq cjnqVarF2 = f(messageCoreData, aubqVar, bojhVar, 10, elnyVar);
            ekrd ekrdVar5 = (ekrd) ekrgVar2.h();
            ekrdVar5.X(ekrzVar2, basdVarF);
            ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 313, "RcsReportSender.java")).t("Finished queuing display report. result: %s", cjnqVarF2);
            if (!cjnqVarF2.a()) {
                d(messageIdTypeC);
                return cjnqVarF2;
            }
            brdu brduVarE2 = e();
            brduVarE2.ap("updateReadReportStatusSent");
            brduVarE2.y(bvdx.SENT);
            ((baxe) this.g.b()).R(conversationIdTypeA, messageIdTypeC, brduVarE2);
        } else if (bvdxVarN.equals(bvdx.NOT_REQUESTED)) {
            ekrd ekrdVar6 = (ekrd) a.h();
            ekrdVar6.X(cqnc.f, basdVarF);
            ((ekrd) ekrdVar6.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 327, "RcsReportSender.java")).q("Read report is not requested.");
        }
        return cjnq.SUCCEEDED;
    }

    public final boolean b(elny elnyVar) {
        ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendAllUnsentReports", 121, "RcsReportSender.java")).q("Try to resend all unsent reports.");
        Set setI = this.d.i();
        bopq[] bopqVarArr = baiw.a;
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("getAllUnsentMessagesQuery");
        brdrVarD.k(baiw.b);
        baiw.a(setI, brdrVarD);
        baiw.b(brdrVarD);
        botb botbVarE = botm.e();
        botbVarE.c(baiw.a);
        brdrVarD.E(dqts.i(botbVarE.b(), botm.c.a, MessagesTable.c.b).g());
        return c(brdrVarD.b().z(), elnyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(ekgb ekgbVar, elny elnyVar) {
        int size = ekgbVar.size();
        boolean zA = true;
        for (int i = 0; i < size; i++) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) ekgbVar.get(i);
            basd basdVarI = bindData.I();
            Optional optionalFlatMap = Optional.ofNullable(bindData.aa()).flatMap(new Function() { // from class: cjnp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ParticipantsTable.h((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (optionalFlatMap.isEmpty()) {
                ekrd ekrdVar = (ekrd) a.j();
                ekrdVar.X(cqnc.f, bindData.I());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "getParticipantData", 536, "RcsReportSender.java")).q("Can't find sender.");
            }
            if (!optionalFlatMap.isEmpty()) {
                boolean zX = ((ParticipantsTable.BindData) optionalFlatMap.get()).X();
                bojh[] bojhVarArr = (bojh[]) bindData.aH("conversations", new bojh[0]);
                if (bojhVarArr.length == 0) {
                    ekrd ekrdVar2 = (ekrd) a.j();
                    ekrdVar2.X(cqnc.f, basdVarI);
                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageListInternal", 214, "RcsReportSender.java")).q("Can't find conversation.");
                } else {
                    bojh bojhVar = bojhVarArr[0];
                    if (bvdi.e(bojhVar.k())) {
                        ekrd ekrdVar3 = (ekrd) a.j();
                        ekrdVar3.X(cqnc.f, basdVarI);
                        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageListInternal", 224, "RcsReportSender.java")).q("Unexpected conversation type");
                    } else {
                        MessageCoreData messageCoreDataA = ((bveg) this.i.b()).a();
                        messageCoreDataA.aN(bindData);
                        cjnq cjnqVarA = a(messageCoreDataA, null, zX, bojhVar, elnyVar);
                        zA &= cjnqVarA.a();
                        if (cjnqVarA == cjnq.FAILED) {
                            return zA;
                        }
                    }
                }
            }
        }
        return zA;
    }
}
