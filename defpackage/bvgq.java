package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvgq implements antx {
    final /* synthetic */ bvgs a;

    public bvgq(bvgs bvgsVar) {
        this.a = bvgsVar;
    }

    @Override // defpackage.cqtk
    public final /* bridge */ /* synthetic */ eiju a(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((cehg) this.a.e.b()).E(barn.a);
        } else {
            bvgs bvgsVar = this.a;
            if (bvgsVar.b != null && bvgsVar.c != null) {
                ((cehg) bvgsVar.e.b()).E(((BugleConversationId) optional.get()).a);
            }
        }
        return eijx.e(null);
    }
}
