package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmxl implements baya {
    final cmxn a;

    public cmxl(cmxn cmxnVar) {
        this.a = cmxnVar;
    }

    @Override // defpackage.baya
    public final void c(MessageCoreData messageCoreData) {
        this.a.k(messageCoreData.F().f(), new dzfh("ToFileDownloaded"), cmxm.TACHYGRAM_MESSAGE_ARRIVED);
    }
}
