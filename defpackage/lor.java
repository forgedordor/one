package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lor implements loi {
    public final Context a;
    public final lat b;
    public final Object c = new Object();
    loj d;
    private Handler e;
    private HandlerThread f;

    public lor(Context context, lat latVar) {
        lcg.j(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = latVar;
    }

    @Override // defpackage.loi
    public final void a(loj lojVar) {
        synchronized (this.c) {
            if (this.e == null) {
                HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                this.f = handlerThread;
                handlerThread.start();
                this.e = new Handler(this.f.getLooper());
            }
            this.e.post(new loq(this, lojVar));
        }
    }

    public final void b() {
        this.d = null;
        synchronized (this.c) {
            this.e.removeCallbacks(null);
            HandlerThread handlerThread = this.f;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.e = null;
            this.f = null;
        }
    }
}
