package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayqx {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels");
    private final fcsu b;
    private final ayqd c;

    public ayqx(fcsu fcsuVar, ayqd ayqdVar) {
        this.b = fcsuVar;
        this.c = ayqdVar;
    }

    public static int b(MessageCoreData messageCoreData) {
        ejwl.a(!messageCoreData.cK());
        if (messageCoreData.dg()) {
            return 0;
        }
        if (messageCoreData.cO()) {
            return 1;
        }
        if (messageCoreData.cw()) {
            return 6;
        }
        if (messageCoreData.cY()) {
            return 4;
        }
        if (messageCoreData.cX()) {
            return 3;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleDataModel");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForSendMessage", 82, "PendingMessageChannels.java")).t("Invalid channel for send msg protocol: %s", new dziu(messageCoreData.Y()));
        throw new IllegalStateException("ProcessingPendingMessagesAction: invalid channel for send msg, protocol = ".concat(String.valueOf(messageCoreData.ax())));
    }

    public static boolean f(int i) {
        return i >= 0 && i < 8;
    }

    public final int a(MessageCoreData messageCoreData, cldb cldbVar) {
        MessageIdType messageIdTypeC = messageCoreData.C();
        ekrg ekrgVar = a;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleDataModel");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrz ekrzVar2 = cqnc.b;
        ekrdVar.X(ekrzVar2, messageIdTypeC);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", 94, "PendingMessageChannels.java")).q("getChannelForDownloadMessage");
        ejwl.a(messageCoreData.cK());
        if (messageCoreData.cQ()) {
            ekrw ekrwVarE2 = ekrgVar.e();
            ekrwVarE2.X(ekrzVar, "BugleDataModel");
            ekrd ekrdVar2 = (ekrd) ekrwVarE2;
            ekrdVar2.X(ekrzVar2, messageIdTypeC);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", 97, "PendingMessageChannels.java")).q("Message is Mms Notification");
            return 2;
        }
        if (messageCoreData.cw()) {
            ekrw ekrwVarE3 = ekrgVar.e();
            ekrwVarE3.X(ekrzVar, "BugleDataModel");
            ekrd ekrdVar3 = (ekrd) ekrwVarE3;
            ekrdVar3.X(ekrzVar2, messageIdTypeC);
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "PendingMessageChannels.java")).q("Message is cloud sync");
            return 7;
        }
        if (messageCoreData.cX()) {
            ekrw ekrwVarE4 = ekrgVar.e();
            ekrwVarE4.X(ekrzVar, "BugleDataModel");
            ekrd ekrdVar4 = (ekrd) ekrwVarE4;
            ekrdVar4.X(ekrzVar2, messageIdTypeC);
            ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", 105, "PendingMessageChannels.java")).q("Message is RCS");
            return 5;
        }
        if (!messageCoreData.cO()) {
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", 119, "PendingMessageChannels.java")).D("Invalid channel for download msg protocol: %s, autoDownload: %b", new dziu(messageCoreData.Y()), new dzir(messageCoreData.cs()));
            throw new IllegalStateException("ProcessingPendingMessagesAction: invalid channel for download msg, protocol = ".concat(String.valueOf(messageCoreData.ax())));
        }
        ekrw ekrwVarJ2 = ekrgVar.j();
        ekrwVarJ2.X(ekrzVar, "BugleDataModel");
        ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", 113, "PendingMessageChannels.java")).t("Message is not an MMS notification but still in pending queue. status: %s", messageCoreData.aD());
        baxe baxeVar = (baxe) this.b.b();
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        MessageIdType messageIdTypeC2 = messageCoreData.C();
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("prepareFailRcsFtOrMmsDownload");
        brduVar.U(106);
        baxeVar.R(conversationIdTypeA, messageIdTypeC2, brduVar);
        ayqc ayqcVar = new ayqc(this.c);
        ayqcVar.b();
        ayqcVar.c();
        ayqcVar.a().q(cldbVar);
        return -1;
    }

    public final int c(MessageCoreData messageCoreData, cldb cldbVar) {
        if (messageCoreData.cW()) {
            return b(messageCoreData);
        }
        if (messageCoreData.cV() || messageCoreData.ct()) {
            return a(messageCoreData, cldbVar);
        }
        return -1;
    }

    public final int d(MessageCoreData messageCoreData, cldb cldbVar) {
        if (messageCoreData.dd()) {
            return b(messageCoreData);
        }
        if (messageCoreData.cz()) {
            return a(messageCoreData, cldbVar);
        }
        return -1;
    }

    public final int e(MessageCoreData messageCoreData, cldb cldbVar) {
        int iD = d(messageCoreData, cldbVar);
        return iD == -1 ? c(messageCoreData, cldbVar) : iD;
    }
}
