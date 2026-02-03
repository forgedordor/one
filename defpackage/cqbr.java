package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqbr {
    private final long a;
    private int b = 15;
    private final Map c = new csq();

    public cqbr(long j) {
        this.a = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final synchronized void b(long j) {
        Map map = this.c;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((cqbq) ((Map.Entry) it.next()).getValue()).a <= j - this.a) {
                it.remove();
            }
        }
        int i = ((cvw) map).d;
        int iMax = this.b;
        if (iMax < 60 && i >= (iMax * 3) / 4) {
            iMax = Math.min(i + i, 60);
            this.b = iMax;
        }
        if (iMax > 15 && i < (iMax >> 2)) {
            iMax = Math.max(i + i, 15);
            this.b = iMax;
        }
        if (iMax >= 60) {
            map.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final synchronized boolean a(cqds cqdsVar, Object obj) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map map = this.c;
        cqbq cqbqVar = (cqbq) map.get(obj);
        z = true;
        if (cqbqVar == null) {
            map.put(obj, new cqbq(jElapsedRealtime));
        } else {
            if (cqbqVar.a + this.a <= jElapsedRealtime) {
                if (cqbqVar.b > 0) {
                    cqdsVar.I("[Throttled");
                    cqdsVar.G(cqbqVar.b);
                    cqdsVar.I("times]");
                }
                cqbqVar.a = jElapsedRealtime;
            } else {
                cqbqVar.b++;
                z = false;
            }
        }
        if (((cvw) map).d > this.b) {
            b(jElapsedRealtime);
        }
        return z;
    }
}
