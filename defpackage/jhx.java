package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhx extends fdbr implements fdae {
    final /* synthetic */ AndroidComposeView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhx(AndroidComposeView androidComposeView) {
        super(0);
        this.a = androidComposeView;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        int actionMasked;
        AndroidComposeView androidComposeView = this.a;
        MotionEvent motionEvent = androidComposeView.N;
        if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
            androidComposeView.O = SystemClock.uptimeMillis();
            androidComposeView.post(androidComposeView.Q);
        }
        return fctx.a;
    }
}
