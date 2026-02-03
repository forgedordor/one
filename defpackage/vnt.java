package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vnt implements vdy {
    private final fdpl a;
    private final Set b;

    public vnt(Context context, fduj fdujVar, vwn vwnVar, ConversationId conversationId) {
        fdpl vnsVar;
        context.getClass();
        fdujVar.getClass();
        vwnVar.getClass();
        conversationId.getClass();
        if (conversationId instanceof PenpalBotConversationId) {
            vnsVar = fdvf.a(null);
        } else {
            vnsVar = new vns(fdqq.a(new fdqz(new vni(null), new vnp(new vnm(fdujVar)))), context, vwnVar);
        }
        this.a = vnsVar;
        this.b = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.b;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.a;
    }
}
