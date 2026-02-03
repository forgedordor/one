package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhy implements Runnable {
    final /* synthetic */ AndroidComposeView a;

    public jhy(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidComposeView androidComposeView = this.a;
        androidComposeView.removeCallbacks(this);
        MotionEvent motionEvent = androidComposeView.N;
        if (motionEvent != null) {
            int toolType = motionEvent.getToolType(0);
            int actionMasked = motionEvent.getActionMasked();
            if (toolType == 3) {
                if (actionMasked == 10 || actionMasked == 1) {
                    return;
                }
            } else if (actionMasked == 1) {
                return;
            }
            int i = 7;
            if (actionMasked != 7 && actionMasked != 9) {
                i = 2;
            }
            androidComposeView.M(motionEvent, i, androidComposeView.O, false);
        }
    }
}
