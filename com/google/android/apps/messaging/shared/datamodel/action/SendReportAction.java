package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.ayhq;
import defpackage.aymo;
import defpackage.ayqn;
import defpackage.baiw;
import defpackage.barn;
import defpackage.bary;
import defpackage.bopq;
import defpackage.botb;
import defpackage.botm;
import defpackage.brdr;
import defpackage.cjnr;
import defpackage.cjpo;
import defpackage.cqaz;
import defpackage.cqnc;
import defpackage.dqts;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejxr;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.elgm;
import defpackage.elny;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class SendReportAction extends Action<Void> implements Parcelable {
    private final ayqn e;
    private final cjpo f;
    private final cjnr g;
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction");
    static final long[] a = {TimeUnit.SECONDS.toMillis(1), TimeUnit.SECONDS.toMillis(5), TimeUnit.SECONDS.toMillis(10), TimeUnit.SECONDS.toMillis(20), TimeUnit.SECONDS.toMillis(40), TimeUnit.SECONDS.toMillis(80), TimeUnit.SECONDS.toMillis(160), TimeUnit.SECONDS.toMillis(320), TimeUnit.SECONDS.toMillis(640), TimeUnit.SECONDS.toMillis(1280)};
    private static long c = -1;
    private static final Object d = new Object();
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayhq();

    /* compiled from: PG */
    public interface a {
        ayqn bt();
    }

    public SendReportAction(ayqn ayqnVar, cjpo cjpoVar, cjnr cjnrVar, Parcel parcel) {
        super(parcel, elgm.SEND_REPORT_ACTION);
        this.e = ayqnVar;
        this.f = cjpoVar;
        this.g = cjnrVar;
    }

    static long h() {
        synchronized (d) {
            long[] jArr = a;
            int length = jArr.length;
            for (int i = 0; i < 10; i++) {
                long j = jArr[i];
                if (j > c) {
                    c = j;
                    return j;
                }
            }
            return c;
        }
    }

    public static void m() {
        synchronized (d) {
            c = -1L;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("SendReportAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SendReport.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        int i;
        if (this.f.i().isEmpty()) {
            ekrw ekrwVarF = b.f();
            ekrwVarF.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarF).h("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction", "getPreconditionsResult", 150, "SendReportAction.java")).q("RCS is not enabled on any identity. Cannot send delivery reports.");
            this.e.e(elny.ALL_IDENTITIES_READY_TO_SEND_AND_RECEIVE).x(EnergyProfile.EVCONNECTOR_TYPE_OTHER, h());
            i = 3;
        } else {
            i = 0;
        }
        Bundle bundle = new Bundle(1);
        bundle.putInt("result", i);
        if (i != 0) {
            return bundle;
        }
        aymo aymoVar = this.v;
        int iA = aymoVar.a("action_type");
        final elny elnyVarB = elny.b(aymoVar.b("bugle_message_source", elny.UNKNOWN_BUGLE_MESSAGE_SOURCE.M));
        elnyVarB.getClass();
        ekrw ekrwVarF2 = b.f();
        ekrwVarF2.X(eksq.a, "BugleDataModel");
        ((ekrd) ((ekrd) ekrwVarF2).h("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction", "doBackgroundWork", 193, "SendReportAction.java")).r("Running SendReportAction with actionType %d", iA);
        if (iA == 1) {
            final MessageIdType messageIdTypeB = bary.b(aymoVar.l("message_id"));
            cqaz.k(!messageIdTypeB.c());
            final cjnr cjnrVar = this.g;
            eieu eieuVarK = eiiy.k("SendReportAction#sendMessageReportInternal");
            try {
                ekrd ekrdVar = (ekrd) cjnr.a.e();
                ekrdVar.X(cqnc.b, messageIdTypeB);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessage", 150, "RcsReportSender.java")).q("Try to send DELIVERY/DISPLAY report for message.");
                boolean zBooleanValue = ((Boolean) cjnrVar.c.b(new ejxr() { // from class: cjnn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cjnr cjnrVar2 = cjnrVar;
                        Set setI = cjnrVar2.d.i();
                        bopq[] bopqVarArr = baiw.a;
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("getUnsentMessageQuery");
                        brdrVarD.k(baiw.b);
                        final MessageIdType messageIdType = messageIdTypeB;
                        brdrVarD.h(new Function() { // from class: bair
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                brec brecVar = (brec) obj;
                                bopq[] bopqVarArr2 = baiw.a;
                                brecVar.p(messageIdType);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        baiw.a(setI, brdrVarD);
                        baiw.b(brdrVarD);
                        botb botbVarE = botm.e();
                        botbVarE.c(baiw.a);
                        brdrVarD.E(dqts.i(botbVarE.b(), botm.c.a, MessagesTable.c.b).g());
                        return Boolean.valueOf(cjnrVar2.c(brdrVarD.b().z(), elnyVarB));
                    }
                })).booleanValue();
                eieuVarK.close();
                j(zBooleanValue);
                return bundle;
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (iA != 2) {
            if (iA == 3) {
                m();
                j(this.g.b(elnyVarB));
                return bundle;
            }
            if (iA != 4) {
                throw new IllegalArgumentException(defpackage.a.g(iA, "Unexpected action type: "));
            }
            l(this.g.b(elnyVarB), true);
            return bundle;
        }
        final ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id"));
        cqaz.k(!conversationIdTypeB.b());
        cjnr cjnrVar2 = this.g;
        ekrd ekrdVar2 = (ekrd) cjnr.a.e();
        ekrdVar2.X(cqnc.s, conversationIdTypeB);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForConversation", 135, "RcsReportSender.java")).q("Try to send DELIVERY/DISPLAY reports for conversation.");
        Set setI = cjnrVar2.d.i();
        bopq[] bopqVarArr = baiw.a;
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("getAllUnsentMessagesForConversationQuery");
        brdrVarD.k(baiw.b);
        brdrVarD.h(new Function() { // from class: baiv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                bopq[] bopqVarArr2 = baiw.a;
                brecVar.m(conversationIdTypeB);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        baiw.a(setI, brdrVarD);
        baiw.b(brdrVarD);
        botb botbVarE = botm.e();
        botbVarE.c(baiw.a);
        brdrVarD.E(dqts.i(botbVarE.b(), botm.c.a, MessagesTable.c.b).g());
        j(cjnrVar2.c(brdrVarD.b().z(), elnyVarB));
        return bundle;
    }

    public final void j(boolean z) {
        l(z, false);
    }

    public final void l(boolean z, boolean z2) {
        long j;
        if (z) {
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction", "handleResult", 236, "SendReportAction.java")).q("DELIVERY/DISPLAY report(s) successfully sent.");
            m();
            return;
        }
        if (!z2) {
            synchronized (d) {
                j = c;
            }
            if (j != -1) {
                return;
            }
        }
        this.e.e(elny.REPORT_SEND_FAILURE).x(EnergyProfile.EVCONNECTOR_TYPE_OTHER, h());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SendReportAction(ayqn ayqnVar, cjpo cjpoVar, cjnr cjnrVar, MessageIdType messageIdType, ConversationIdType conversationIdType, int i, elny elnyVar) {
        super(elgm.SEND_REPORT_ACTION);
        this.e = ayqnVar;
        this.f = cjpoVar;
        this.g = cjnrVar;
        this.v.r("bugle_message_source", elnyVar.M);
        if (i == 1) {
            this.v.r("action_type", 1);
            if (messageIdType.c()) {
                return;
            }
            this.v.v("message_id", messageIdType.b());
            return;
        }
        if (i == 2) {
            this.v.r("action_type", 2);
            if (conversationIdType.b()) {
                return;
            }
            this.v.v("conversation_id", conversationIdType.a());
            return;
        }
        if (i == 3) {
            this.v.r("action_type", 3);
        } else {
            if (i != 4) {
                return;
            }
            this.v.r("action_type", 4);
        }
    }
}
