package defpackage;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzta implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ dztb a;
    private final AtomicReference b;

    public dzta(dztb dztbVar, View view) {
        this.a = dztbVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            Handler handlerA = ecem.a();
            final dztb dztbVar = this.a;
            handlerA.postAtFrontOfQueue(new Runnable() { // from class: dzsy
                @Override // java.lang.Runnable
                public final void run() {
                    ecem.c();
                    dztc dztcVar = dztbVar.b;
                    if (dztcVar.k != null) {
                        return;
                    }
                    dztcVar.k = dzlw.e();
                }
            });
            ecem.e(new Runnable() { // from class: dzsz
                @Override // java.lang.Runnable
                public final void run() {
                    ecem.c();
                    dztc dztcVar = dztbVar.b;
                    if (dztcVar.j != null) {
                        return;
                    }
                    dztcVar.j = dzlw.e();
                }
            });
            return true;
        } catch (RuntimeException e) {
            Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onPreDraw", e);
            return true;
        }
    }
}
