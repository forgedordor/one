package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aao {
    public final float a;
    public final float b;
    public final int c;
    private final float d;
    private final long e;

    public aao(BackEvent backEvent) {
        backEvent.getClass();
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        float progress = backEvent.getProgress();
        int swipeEdge = backEvent.getSwipeEdge();
        long frameTimeMillis = Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L;
        this.d = touchX;
        this.a = touchY;
        this.b = progress;
        this.c = swipeEdge;
        this.e = frameTimeMillis;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.d + ", touchY=" + this.a + ", progress=" + this.b + ", swipeEdge=" + this.c + ", frameTimeMillis=" + this.e + '}';
    }
}
