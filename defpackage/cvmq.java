package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvmq implements eyif {
    public static ComposeMessageView a(View view) {
        if (!(view instanceof ComposeMessageView)) {
            throw new IllegalStateException(a.L(view, cvlk.class, "Attempt to inject a View wrapper of type "));
        }
        ComposeMessageView composeMessageView = (ComposeMessageView) view;
        composeMessageView.getClass();
        return composeMessageView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
