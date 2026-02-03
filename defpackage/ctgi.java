package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctgi implements bayb {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/spam/spatula/SpatulaOnRcsMessageReceivedListener");
    private final fcsu b;

    public ctgi(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.b = fcsuVar;
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final void e(MessageCoreData messageCoreData) throws IOException {
        messageCoreData.getClass();
        ((ekrd) a.e().h("com/google/android/apps/messaging/spam/spatula/SpatulaOnRcsMessageReceivedListener", "beforeMessageInserted", 39, "SpatulaOnRcsMessageReceivedListener.kt")).q("Spatula beforeMessageInserted");
        if (crtr.e() && le.m(messageCoreData.am())) {
            ((csme) this.b.b()).a();
        }
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
