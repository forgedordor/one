package defpackage;

import android.app.Activity;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyc implements pxs {
    public final ReentrantLock a = new ReentrantLock();
    public final WeakHashMap b = new WeakHashMap();
    private final pxs c;

    public pyc(pxs pxsVar) {
        this.c = pxsVar;
    }

    public final void a(Activity activity, pxc pxcVar) {
        activity.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            WeakHashMap weakHashMap = this.b;
            if (fdbq.f(pxcVar, (pxc) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((pye) this.c).a.c.iterator();
            it.getClass();
            while (it.hasNext()) {
                pyg pygVar = (pyg) it.next();
                if (fdbq.f(pygVar.a, activity)) {
                    pygVar.a(pxcVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
