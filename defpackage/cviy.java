package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.attachment.video.inlineplayer.InlinePlayerCornersView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cviy implements eyif {
    public static InlinePlayerCornersView a(View view) {
        if (!(view instanceof InlinePlayerCornersView)) {
            throw new IllegalStateException(a.L(view, cviv.class, "Attempt to inject a View wrapper of type "));
        }
        InlinePlayerCornersView inlinePlayerCornersView = (InlinePlayerCornersView) view;
        inlinePlayerCornersView.getClass();
        return inlinePlayerCornersView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
