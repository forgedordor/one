package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgm implements vdy {
    private final vdy a;
    private final vdy b;
    private final ConversationId c;
    private final fdpl d;
    private final Set e;

    public vgm(vdy vdyVar, vdy vdyVar2, ConversationId conversationId) {
        conversationId.getClass();
        this.a = vdyVar;
        this.b = vdyVar2;
        this.c = conversationId;
        boolean z = conversationId instanceof PenpalBotConversationId;
        this.d = z ? ((vgv) vdyVar).k : ((vgl) vdyVar2).j;
        this.e = z ? ((vgv) vdyVar).l : ((vgl) vdyVar2).k;
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.d;
    }
}
