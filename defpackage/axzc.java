package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater");
    public final fcsu b;
    public final fcsu c;
    private final Context d;
    private final cmqj e;
    private final dqsn f;

    public axzc(Context context, fcsu fcsuVar, fcsu fcsuVar2, cmqj cmqjVar, dqsn dqsnVar) {
        this.d = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.e = cmqjVar;
        this.f = dqsnVar;
    }

    public final MessageCoreData a(basd basdVar, String str, final long j) {
        if (basdVar.i()) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateFileTransferMetadata", 57, "RcsFileTransferMetadataUpdater.java")).q("Cannot update RCS File Transfer metadata. RCS message id is not set.");
            return null;
        }
        final MessageCoreData messageCoreDataX = ((baxe) this.b.b()).x(basdVar);
        if (messageCoreDataX == null) {
            ekrw ekrwVarI2 = a.i();
            ekrwVarI2.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarI2).h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateFileTransferMetadata", 63, "RcsFileTransferMetadataUpdater.java")).q("Cannot update RCS File Transfer content uri. Message doesn't exist");
            return null;
        }
        final MessagePartCoreData messagePartCoreDataH = messageCoreDataX.H();
        if (messagePartCoreDataH == null) {
            ekrw ekrwVarI3 = a.i();
            ekrwVarI3.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarI3).h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateFileTransferMetadata", 69, "RcsFileTransferMetadataUpdater.java")).q("Cannot update RCS File Transfer metadata. Message doesn't have any attachments");
            return null;
        }
        Uri uri = TextUtils.isEmpty(str) ? null : Uri.parse(str);
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "BugleDataModel");
        ekrd ekrdVar = (ekrd) ekrwVarG;
        ekrdVar.X(cqnc.f, basdVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateFileTransferMetadata", 82, "RcsFileTransferMetadataUpdater.java")).C("Update RCS File Transfer metadata. fallbackUri: %s, expiry: %s", uri, j);
        final Uri uri2 = uri;
        this.f.d("updateFileTransferMetadata", new Runnable() { // from class: axzb
            @Override // java.lang.Runnable
            public final void run() {
                axzc axzcVar = this.a;
                MessageCoreData messageCoreData = messageCoreDataX;
                if (messageCoreData.u() != null) {
                    long j2 = j;
                    baxe baxeVar = (baxe) axzcVar.b.b();
                    ConversationIdType conversationIdTypeA = messageCoreData.A();
                    MessageIdType messageIdTypeC = messageCoreData.C();
                    String[] strArr = MessagesTable.a;
                    brdu brduVar = new brdu();
                    brduVar.ap("updateExpiryInDb");
                    brduVar.t(j2);
                    boolean zV = baxeVar.V(conversationIdTypeA, messageIdTypeC, brduVar);
                    ekrw ekrwVarG2 = axzc.a.g();
                    ekrwVarG2.X(eksq.a, "BugleDataModel");
                    ekrd ekrdVar2 = (ekrd) ekrwVarG2;
                    ekrdVar2.X(cqnc.f, messageCoreData.F());
                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateExpiryInDb", 122, "RcsFileTransferMetadataUpdater.java")).F("update File Transfer expiry. updated: %s, rcsFtSessionId: %s", zV, messageCoreData.n());
                }
                Uri uri3 = uri2;
                if (uri3 != null) {
                    MessagePartCoreData messagePartCoreData = messagePartCoreDataH;
                    bbae bbaeVar = (bbae) axzcVar.c.b();
                    ConversationIdType conversationIdTypeA2 = messagePartCoreData.A();
                    MessageIdType messageIdTypeB = messagePartCoreData.B();
                    String strW = messagePartCoreData.W();
                    String[] strArr2 = PartsTable.a;
                    bsjh bsjhVar = new bsjh();
                    bsjhVar.ap("updateFallbackUriInDb");
                    bsjhVar.m(uri3);
                    boolean zF = bbaeVar.f(conversationIdTypeA2, messageIdTypeB, strW, bsjhVar);
                    ekrw ekrwVarG3 = axzc.a.g();
                    ekrwVarG3.X(eksq.a, "BugleDataModel");
                    ekrd ekrdVar3 = (ekrd) ekrwVarG3;
                    ekrdVar3.X(cqnc.f, messageCoreData.F());
                    ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateFallbackUriInDb", 142, "RcsFileTransferMetadataUpdater.java")).F("update fallback Uri in DB. updated: %s, rcsFtSessionId: %s", zF, messageCoreData.n());
                    if (zF) {
                        messagePartCoreData.av(uri3);
                    }
                }
            }
        });
        Uri uriU = messageCoreDataX.u();
        if (uriU != null) {
            this.e.Z(this.d, uriU, j);
        }
        return messageCoreDataX;
    }
}
