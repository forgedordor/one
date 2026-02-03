package defpackage;

import com.google.android.apps.messaging.ui.conversation.suggestions.common.ConversationSuggestionStickerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwsx implements rti {
    final /* synthetic */ ConversationSuggestionStickerView a;

    public cwsx(ConversationSuggestionStickerView conversationSuggestionStickerView) {
        this.a = conversationSuggestionStickerView;
    }

    @Override // defpackage.rti
    public final boolean a(rhs rhsVar, Object obj, rua ruaVar, boolean z) {
        cqbd cqbdVarE = ConversationSuggestionStickerView.a.e();
        cqbdVarE.I("Problem loading sticker suggestion.");
        if (rhsVar == null) {
            cqbdVarE.r();
        } else {
            cqbdVarE.s(rhsVar);
        }
        this.a.setVisibility(8);
        return true;
    }

    @Override // defpackage.rti
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rua ruaVar, reb rebVar, boolean z) {
        ConversationSuggestionStickerView.a.q("Sticker suggestion loaded successfully.");
        return false;
    }
}
