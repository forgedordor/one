package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ony implements Runnable {
    public final AtomicReference a = new AtomicReference(null);
    final /* synthetic */ oog b;

    public ony(oog oogVar) {
        this.b = oogVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        opc opcVar = (opc) this.a.get();
        if (opcVar != null) {
            Iterator it = this.b.l.iterator();
            while (it.hasNext()) {
                ((fdap) it.next()).invoke(opcVar);
            }
        }
    }
}
