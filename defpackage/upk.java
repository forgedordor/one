package defpackage;

import android.view.View;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upk implements eyif {
    public static ConversationScrollToBottomButton a(View view) {
        if (!(view instanceof ConversationScrollToBottomButton)) {
            throw new IllegalStateException(a.L(view, uph.class, "Attempt to inject a View wrapper of type "));
        }
        ConversationScrollToBottomButton conversationScrollToBottomButton = (ConversationScrollToBottomButton) view;
        conversationScrollToBottomButton.getClass();
        return conversationScrollToBottomButton;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
