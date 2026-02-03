package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufm implements cgev {
    private final Context a;
    private final cufk b;

    public cufm(Context context, cufk cufkVar) {
        this.a = context;
        this.b = cufkVar;
    }

    @Override // defpackage.cgev
    public final kvf a(SuggestionData suggestionData, ConversationId conversationId) {
        ejwl.a(suggestionData instanceof SmartSuggestionData);
        ejwl.a(bbfa.b(suggestionData) == ezan.GIF);
        String string = this.a.getString(R.string.p2p_conversation_suggestion_gif_search_display_text, ((SmartSuggestionData) suggestionData).p());
        String strB = suggestionData.b();
        strB.getClass();
        return this.b.a(conversationId, strB, R.drawable.quantum_ic_search_black_24, true, string);
    }
}
