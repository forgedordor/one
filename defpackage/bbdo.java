package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbdo implements alff {
    public final String a;
    public final String b;
    private final alfd c;

    public bbdo(alfd alfdVar, ConversationSuggestion conversationSuggestion) {
        this.c = alfdVar;
        this.a = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER);
        this.b = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_COMPOSE_ACTION_DRAFT_TEXT);
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.c;
    }

    @Override // defpackage.alff
    public final String b() {
        return null;
    }
}
