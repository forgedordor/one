package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rjc {
    public final Map a = new HashMap();
    public final rjb b = new rjb();

    final void a(String str) {
        rja rjaVar;
        synchronized (this) {
            Map map = this.a;
            rjaVar = (rja) map.get(str);
            rvi.f(rjaVar);
            int i = rjaVar.b;
            if (i <= 0) {
                throw new IllegalStateException(a.B(i, str, "Cannot release a lock that is not held, safeKey: ", ", interestedThreads: "));
            }
            int i2 = i - 1;
            rjaVar.b = i2;
            if (i2 == 0) {
                rja rjaVar2 = (rja) map.remove(str);
                if (!rjaVar2.equals(rjaVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + rjaVar.toString() + ", but actually removed: " + String.valueOf(rjaVar2) + ", safeKey: " + str);
                }
                Queue queue = this.b.a;
                synchronized (queue) {
                    if (queue.size() < 10) {
                        queue.offer(rjaVar2);
                    }
                }
            }
        }
        rjaVar.a.unlock();
    }
}
