package defpackage;

import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxby implements Runnable {
    final /* synthetic */ MessageCellStatusView a;

    public dxby(MessageCellStatusView messageCellStatusView) {
        this.a = messageCellStatusView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageCellStatusView messageCellStatusView = this.a;
        messageCellStatusView.b(null);
        messageCellStatusView.postDelayed(this, MessageCellStatusView.a);
    }
}
