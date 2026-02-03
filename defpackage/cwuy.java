package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.ui.conversation.typingindicator.ConversationTypingIndicatorView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwuy extends pnz {
    final /* synthetic */ ConversationTypingIndicatorView b;

    public cwuy(ConversationTypingIndicatorView conversationTypingIndicatorView) {
        this.b = conversationTypingIndicatorView;
    }

    @Override // defpackage.pnz
    public final void b(Drawable drawable) {
        ((Animatable) this.b.a).start();
    }
}
