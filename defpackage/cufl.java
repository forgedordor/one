package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufl implements cgev {
    private final Context a;
    private final cufk b;

    public cufl(Context context, cufk cufkVar) {
        this.a = context;
        this.b = cufkVar;
    }

    @Override // defpackage.cgev
    public final kvf a(SuggestionData suggestionData, ConversationId conversationId) {
        ejwl.a(bbfa.b(suggestionData) == ezan.DUO_CALL);
        String string = this.a.getString(R.string.p2p_conversation_suggestion_duo_call_action_text);
        String strB = suggestionData.b();
        strB.getClass();
        return this.b.a(conversationId, strB, R.drawable.product_logo_duo_color_24, false, string);
    }
}
