package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccqh implements civy {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsMismatchedReportEncryptionProtocolListener");
    public final cbyz a;
    public final ccpm b;
    private final fcsu d;
    private final fdjx e;

    public ccqh(fcsu fcsuVar, cbyz cbyzVar, ccpm ccpmVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        cbyzVar.getClass();
        ccpmVar.getClass();
        fdjxVar.getClass();
        this.d = fcsuVar;
        this.a = cbyzVar;
        this.b = ccpmVar;
        this.e = fdjxVar;
    }

    @Override // defpackage.civy
    public final void a(MessageCoreData messageCoreData, cbqz cbqzVar, ChatSessionMessageEvent chatSessionMessageEvent) {
        cbqzVar.getClass();
        chatSessionMessageEvent.getClass();
        if (fdbq.f(messageCoreData.Q(), cbqzVar)) {
            throw new IllegalStateException("Called `handleMismatchedReportEncryptionProtocol` but the protocols do not mismatch.");
        }
        if (!fdbq.f(messageCoreData.Q(), cbqz.c)) {
            ekrw ekrwVarE = c.e();
            ekrwVarE.X(eksq.a, "BugleE2eeMls");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.e, messageCoreData.F().f());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsMismatchedReportEncryptionProtocolListener", "handleMismatchedReportEncryptionProtocol", 63, "MlsMismatchedReportEncryptionProtocolListener.kt")).t("Message encryption protocol is %s, not MLS.", messageCoreData.Q());
            return;
        }
        ekrg ekrgVar = c;
        ekrw ekrwVarJ = ekrgVar.j();
        ekrz ekrzVar = eksq.a;
        ekrwVarJ.X(ekrzVar, "BugleE2eeMls");
        ekrd ekrdVar2 = (ekrd) ekrwVarJ;
        ekrz ekrzVar2 = cqnc.e;
        ekrdVar2.X(ekrzVar2, messageCoreData.F().f());
        ekrz ekrzVar3 = cqnc.s;
        ekrdVar2.X(ekrzVar3, messageCoreData.A());
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsMismatchedReportEncryptionProtocolListener", "handleMismatchedReportEncryptionProtocol", 71, "MlsMismatchedReportEncryptionProtocolListener.kt")).t("Received a non-MLS delivery report (protocol = %s) for an MLS-encrypted message.", cbqzVar);
        bojh bojhVarR = ((bakt) this.d.b()).r(messageCoreData.A());
        if (bojhVarR == null) {
            ekrw ekrwVarI = ekrgVar.i();
            ekrwVarI.X(ekrzVar, "BugleE2eeMls");
            ekrd ekrdVar3 = (ekrd) ekrwVarI;
            ekrdVar3.X(ekrzVar2, messageCoreData.F().f());
            ekrdVar3.X(ekrzVar3, messageCoreData.A());
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsMismatchedReportEncryptionProtocolListener", "handleMismatchedReportEncryptionProtocol", 86, "MlsMismatchedReportEncryptionProtocolListener.kt")).q("Could not downgrade MLS: Conversation does not exist.");
            return;
        }
        cbqx cbqxVarI = bojhVarR.I();
        String str = cbqxVarI != null ? cbqxVarI.a : null;
        if (str != null) {
            auvw.m(this.e, null, new ccqg(this, new ccep(str), messageCoreData, null), 3);
            return;
        }
        ekrw ekrwVarI2 = ekrgVar.i();
        ekrwVarI2.X(ekrzVar, "BugleE2eeMls");
        ekrd ekrdVar4 = (ekrd) ekrwVarI2;
        ekrdVar4.X(ekrzVar2, messageCoreData.F().f());
        ekrdVar4.X(ekrzVar3, messageCoreData.A());
        ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsMismatchedReportEncryptionProtocolListener", "handleMismatchedReportEncryptionProtocol", 95, "MlsMismatchedReportEncryptionProtocolListener.kt")).q("Could not downgrade MLS: Conversation does not have an encryption ID.");
    }
}
