package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnm {
    private static final ThreadLocal i = new ThreadLocal();
    public final cvw a = new cvw();
    final ArrayList b = new ArrayList();
    public final lng c = new lng(this);
    public final Runnable d = new Runnable() { // from class: lnf
        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList;
            lnm lnmVar = this.a.c.a;
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            int i2 = 0;
            while (true) {
                arrayList = lnmVar.b;
                if (i2 >= arrayList.size()) {
                    break;
                }
                lnh lnhVar = (lnh) arrayList.get(i2);
                if (lnhVar != null) {
                    cvw cvwVar = lnmVar.a;
                    Long l = (Long) cvwVar.get(lnhVar);
                    if (l == null) {
                        lnhVar.a(jUptimeMillis);
                    } else if (l.longValue() < jUptimeMillis2) {
                        cvwVar.remove(lnhVar);
                        lnhVar.a(jUptimeMillis);
                    }
                }
                i2++;
            }
            if (lnmVar.e) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                    lnj lnjVar = lnmVar.h;
                    ValueAnimator.unregisterDurationScaleChangeListener(lnjVar.a);
                    lnjVar.a = null;
                }
                lnmVar.e = false;
            }
            if (arrayList.size() > 0) {
                lnmVar.g.a(lnmVar.d);
            }
        }
    };
    public boolean e = false;
    public float f = 1.0f;
    public final lnl g;
    public lnj h;

    public lnm(lnl lnlVar) {
        this.g = lnlVar;
    }

    static lnm a() {
        ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new lnm(new lnl()));
        }
        return (lnm) threadLocal.get();
    }

    final boolean b() {
        return Thread.currentThread() == this.g.a.getThread();
    }
}
