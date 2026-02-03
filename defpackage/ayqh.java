package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class ayqh {
    public static Action a(ayqj ayqjVar, MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (!messageCoreData.cY() && !messageCoreData.di()) {
            ekrw ekrwVarE = ayqi.a.e();
            ekrwVarE.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.f, messageCoreData.F());
            ekrdVar.X(cqnc.b, messageCoreData.C());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/actionfactories/ResumeRcsFileTransferActionFactory", "prepareToResume", 46, "ResumeRcsFileTransferActionFactory.java")).q("Message is not a File Transfer.");
            return null;
        }
        if (messageCoreData.cg() || messageCoreData.ci() || messageCoreData.cj()) {
            return ayqjVar.a(messageCoreData.C());
        }
        ekrw ekrwVarE2 = ayqi.a.e();
        ekrwVarE2.X(eksq.a, "BugleDataModel");
        ekrd ekrdVar2 = (ekrd) ekrwVarE2;
        ekrdVar2.X(cqnc.f, messageCoreData.F());
        ekrdVar2.X(cqnc.b, messageCoreData.C());
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/actionfactories/ResumeRcsFileTransferActionFactory", "prepareToResume", 57, "ResumeRcsFileTransferActionFactory.java")).t("Message is not ready to resume. Message status: %s", messageCoreData.aD());
        return null;
    }
}
