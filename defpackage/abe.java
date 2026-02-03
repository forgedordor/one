package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abe implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable a;
    final /* synthetic */ abi b;
    private final long c = SystemClock.uptimeMillis() + 10000;
    private boolean d;

    public abe(abi abiVar) {
        this.b = abiVar;
    }

    public final void a(View view) {
        if (this.d) {
            return;
        }
        this.d = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
        View decorView = this.b.getWindow().getDecorView();
        decorView.getClass();
        if (!this.d) {
            decorView.postOnAnimation(new Runnable() { // from class: abd
                @Override // java.lang.Runnable
                public final void run() {
                    abe abeVar = this.a;
                    Runnable runnable2 = abeVar.a;
                    if (runnable2 != null) {
                        runnable2.run();
                        abeVar.a = null;
                    }
                }
            });
        } else if (fdbq.f(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.a;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.c) {
                this.d = false;
                this.b.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.a = null;
        abr abrVarU = this.b.u();
        synchronized (abrVarU.a) {
            z = abrVarU.b;
        }
        if (z) {
            this.d = false;
            this.b.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
