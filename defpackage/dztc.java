package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dztc {
    public static final dztc a = new dztc();
    public volatile dzlw b;
    public volatile dzlw c;
    public volatile dzlw d;
    public volatile dzlw e;
    public volatile dzlw f;
    public volatile dzlw g;
    public volatile dzlw h;
    public volatile dzlw i;
    public volatile dzlw j;
    public volatile dzlw k;
    public volatile dzlw l;
    public volatile dzfh m;
    private volatile int p = Alert.DURATION_SHOW_INDEFINITELY;
    public final dzst n = new dzst();
    public final dzst o = new dzst();

    public static void e(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j - Process.getStartElapsedRealtime());
            Trace.setCounter(str, 0L);
        }
    }

    public final void a(final int i) {
        if (this.n.b != null) {
            this.p = i;
        } else if (i < 4) {
            ecem.e(new Runnable() { // from class: dzsr
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(i + 1);
                }
            });
        }
    }

    public final void b(Activity activity) {
        if (ecem.g() && this.l == null) {
            this.l = dzlw.e();
            e("Primes-tti-end-and-length-ms", ((dzky) this.l).a);
            if (activity != null) {
                try {
                    activity.reportFullyDrawn();
                } catch (RuntimeException e) {
                    Log.d("PrimesStartupMeasure", "Failed to report App usable time.", e);
                }
            }
        }
    }

    public final void c(dzlw dzlwVar) {
        dzlw dzlwVar2 = this.n.b;
        if (!ecem.g() || this.b == null) {
            return;
        }
        long j = ((dzky) dzlwVar).a;
        if (j <= SystemClock.elapsedRealtime()) {
            if ((dzlwVar2 == null || j <= ((dzky) dzlwVar2).a) && this.g == null) {
                this.g = dzlwVar;
            }
        }
    }

    public final void d(dzfh dzfhVar) {
        if (this.m == null) {
            this.m = dzfhVar;
        }
    }

    final boolean f(long j) {
        return ((long) this.p) < j;
    }
}
