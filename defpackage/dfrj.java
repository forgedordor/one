package defpackage;

import com.google.android.rcs.client.messaging.data.Message;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfrj implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional != null) {
            dhja.k("Message received: %s", optional.isPresent() ? ((Message) optional.get()).h() : "empty message");
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dhja.i(th, "Error while receiving message: %s", th.getMessage());
    }
}
