package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjc extends dziv {
    public final List b = new CopyOnWriteArrayList();

    @Override // defpackage.dziv
    public final void i(dzfh dzfhVar) {
        ((ekrd) ((ekrd) dzfq.a.g()).h("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitBackgroundSignal", 195, "ForegroundTracker.java")).q("App transition to background");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((dzix) it.next()).i(dzfhVar);
        }
    }

    @Override // defpackage.dziv
    public final void j(dzfh dzfhVar) {
        ((ekrd) ((ekrd) dzfq.a.g()).h("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitForegroundSignal", 187, "ForegroundTracker.java")).q("App transition to foreground");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((dzix) it.next()).j(dzfhVar);
        }
    }
}
