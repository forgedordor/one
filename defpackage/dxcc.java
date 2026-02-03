package defpackage;

import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxcc implements Runnable {
    final /* synthetic */ TimestampHeaderView a;

    public dxcc(TimestampHeaderView timestampHeaderView) {
        this.a = timestampHeaderView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TimestampHeaderView timestampHeaderView = this.a;
        timestampHeaderView.b.setText(dxcb.a(timestampHeaderView.c, timestampHeaderView.getContext()));
        timestampHeaderView.postDelayed(this, TimestampHeaderView.a);
    }
}
