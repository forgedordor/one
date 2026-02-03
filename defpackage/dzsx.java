package defpackage;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzsx implements ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ dztb a;
    private final AtomicReference c;

    public dzsx(dztb dztbVar, View view) {
        this.a = dztbVar;
        this.c = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.c.getAndSet(null);
        if (view != null) {
            try {
                Handler handlerA = ecem.a();
                final dztb dztbVar = this.a;
                handlerA.postAtFrontOfQueue(new Runnable() { // from class: dzsu
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = dzsx.b;
                        ecem.c();
                        dztc dztcVar = dztbVar.b;
                        if (dztcVar.h != null) {
                            return;
                        }
                        dztcVar.h = dzlw.e();
                    }
                });
                ecem.e(new Runnable() { // from class: dzsv
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = dzsx.b;
                        ecem.c();
                        dztb dztbVar2 = dztbVar;
                        dztc dztcVar = dztbVar2.b;
                        if (dztcVar.i != null) {
                            return;
                        }
                        dztcVar.i = dzlw.e();
                        dztc.e("Primes-ttfdd-end-and-length-ms", ((dzky) dztcVar.i).a);
                        dztbVar2.a.unregisterActivityLifecycleCallbacks(dztbVar2);
                    }
                });
                ecem.e(new Runnable() { // from class: dzsw
                    @Override // java.lang.Runnable
                    public final void run() {
                        view.getViewTreeObserver().removeOnDrawListener(this.a);
                    }
                });
            } catch (RuntimeException e) {
                Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onDraw", e);
            }
        }
    }
}
