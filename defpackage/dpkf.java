package defpackage;

import android.view.WindowInsetsAnimation;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpkf implements Runnable {
    final /* synthetic */ KeyboardDetectorViewInsetsListener a;
    final /* synthetic */ dpkb b;
    final /* synthetic */ WindowInsetsAnimation c;

    public dpkf(KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener, dpkb dpkbVar, WindowInsetsAnimation windowInsetsAnimation) {
        this.a = keyboardDetectorViewInsetsListener;
        this.b = dpkbVar;
        this.c = windowInsetsAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this.a;
        if (keyboardDetectorViewInsetsListener.d || keyboardDetectorViewInsetsListener.c != this.b) {
            return;
        }
        keyboardDetectorViewInsetsListener.onEnd(this.c);
    }
}
