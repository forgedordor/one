package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.conversation.settings.InfoAndOptionsActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdf implements afyw {
    private final Context a;

    public agdf(Context context, uqm uqmVar) {
        uqmVar.getClass();
        this.a = context;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) throws IOException {
        agde agdeVar = (agde) afzvVar;
        Activity activityA = daiy.a(this.a);
        if (activityA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ConversationId conversationId = agdeVar.a;
        String str = agdeVar.b;
        Intent intent = new Intent(activityA, (Class<?>) InfoAndOptionsActivity.class);
        intent.putExtra("conversation_id", conversationId.b());
        intent.putExtra("mapi_conversation_id", conversationId);
        intent.putExtra("mapi_conversation_kind", conversationId.a().a());
        intent.putExtra("is_rcs_conversation", true);
        intent.putExtra("is_group_conversation", false);
        intent.putExtra("rbm_bot_id", str);
        eiid.o(activityA, intent);
        return fctx.a;
    }
}
