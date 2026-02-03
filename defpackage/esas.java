package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esas extends esar {
    public esas() {
        super("Message");
    }

    public final void j(String str) {
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, str);
    }

    public final void k(esat esatVar) {
        c("sender", esatVar);
    }
}
