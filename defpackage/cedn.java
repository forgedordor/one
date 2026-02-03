package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cedn {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/AttachmentUploader");

    public ListenableFuture c(ezns eznsVar, Optional optional, MessagePartCoreData messagePartCoreData) {
        ekrw ekrwVarI = a.i();
        ekrwVarI.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/net/AttachmentUploader", "upload", 52, "AttachmentUploader.java")).q("AttachmentUploader.upload being called on stub class");
        return eijx.e(messagePartCoreData);
    }

    public ListenableFuture d(ezns eznsVar, Optional optional, MessagePartCoreData messagePartCoreData) {
        ekrw ekrwVarI = a.i();
        ekrwVarI.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/net/AttachmentUploader", "uploadDownSizedImage", 60, "AttachmentUploader.java")).q("AttachmentUploader.upload being called on stub class");
        return eijx.e(messagePartCoreData);
    }
}
