package defpackage;

import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eidz implements Runnable {
    final /* synthetic */ eiec a;

    public eidz(eiec eiecVar) {
        this.a = eiecVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    eiec eiecVar = this.a;
                    if (eiecVar.c.isShutdown()) {
                        try {
                            this.a.c.execute(this);
                            return;
                        } catch (RejectedExecutionException e) {
                            Iterator it = eiec.a.keySet().iterator();
                            while (it.hasNext()) {
                                ((eieb) it.next()).a.setException(e);
                            }
                            return;
                        }
                    }
                    eiea eieaVar = ((eieb) eiecVar.b.remove()).a;
                    int i = eiea.b;
                    eieaVar.set(null);
                } catch (RejectedExecutionException e2) {
                    Iterator it2 = eiec.a.keySet().iterator();
                    while (it2.hasNext()) {
                        ((eieb) it2.next()).a.setException(e2);
                    }
                    return;
                }
            } catch (InterruptedException unused) {
                this.a.c.execute(this);
                return;
            } catch (Throwable th) {
                try {
                    this.a.c.execute(this);
                } catch (RejectedExecutionException e3) {
                    Iterator it3 = eiec.a.keySet().iterator();
                    while (it3.hasNext()) {
                        ((eieb) it3.next()).a.setException(e3);
                    }
                }
                throw th;
            }
        }
    }
}
