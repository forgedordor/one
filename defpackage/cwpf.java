package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaDownloadOverlayView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwpf implements View.OnClickListener {
    final /* synthetic */ RichCardMediaDownloadOverlayView a;

    public cwpf(RichCardMediaDownloadOverlayView richCardMediaDownloadOverlayView) {
        this.a = richCardMediaDownloadOverlayView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RichCardMediaDownloadOverlayView richCardMediaDownloadOverlayView = this.a;
        if (richCardMediaDownloadOverlayView.a == null) {
            cqaz.c("A click event happened, but RichCardMediaTransferHost was not set for this view.");
            return;
        }
        int iD = richCardMediaDownloadOverlayView.d();
        int i = iD - 1;
        if (iD == 0) {
            throw null;
        }
        if (i != 1) {
            if (i == 2) {
                richCardMediaDownloadOverlayView.a.j();
                return;
            } else if (i != 3) {
                return;
            }
        }
        richCardMediaDownloadOverlayView.a.k();
    }
}
