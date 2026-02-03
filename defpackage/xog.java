package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xog {
    public final Context a;
    public final fdjx b;
    public final afzc c;
    public final aqum d;
    public final fdpl e;
    public final fdpl f;
    private final ConversationId g;
    private final ajlu h;
    private final fdpl i;

    public xog(Context context, fdjx fdjxVar, afzc afzcVar, ConversationId conversationId, ajlu ajluVar, fdpl fdplVar, aqum aqumVar) {
        fdpl fdpuVar;
        context.getClass();
        fdjxVar.getClass();
        afzcVar.getClass();
        conversationId.getClass();
        ajluVar.getClass();
        fdplVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = afzcVar;
        this.g = conversationId;
        this.h = ajluVar;
        this.i = fdplVar;
        this.d = aqumVar;
        this.e = ajluVar instanceof amob ? anov.a(((amob) ajluVar).n()) : new fdpu(false);
        if (conversationId instanceof EmergencyConversationId) {
            xoc xocVar = new xoc(null, this);
            int i = fdsn.a;
            fdpuVar = new fdwg(xocVar, fdplVar);
        } else {
            fdpuVar = new fdpu(false);
        }
        this.f = fdpuVar;
    }
}
