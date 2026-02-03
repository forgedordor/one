package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhv implements eyif {
    public static AttachmentsContainer a(View view) {
        if (!(view instanceof AttachmentsContainer)) {
            throw new IllegalStateException(a.L(view, cvhs.class, "Attempt to inject a View wrapper of type "));
        }
        AttachmentsContainer attachmentsContainer = (AttachmentsContainer) view;
        attachmentsContainer.getClass();
        return attachmentsContainer;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
