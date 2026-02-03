package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cviu implements eyif {
    public static VideoAttachmentView a(View view) {
        if (!(view instanceof VideoAttachmentView)) {
            throw new IllegalStateException(a.L(view, cvir.class, "Attempt to inject a View wrapper of type "));
        }
        VideoAttachmentView videoAttachmentView = (VideoAttachmentView) view;
        videoAttachmentView.getClass();
        return videoAttachmentView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
