package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvey implements antx {
    final /* synthetic */ bvfa a;

    public bvey(bvfa bvfaVar) {
        this.a = bvfaVar;
    }

    @Override // defpackage.cqtk
    public final /* bridge */ /* synthetic */ eiju a(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            this.a.e.E(barn.a);
        } else {
            bvfa bvfaVar = this.a;
            if (bvfaVar.b != null && bvfaVar.c != null) {
                bvfaVar.e.E(((BugleConversationId) optional.get()).a);
            }
        }
        return eijx.e(null);
    }
}
