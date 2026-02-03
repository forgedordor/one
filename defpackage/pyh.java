package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.layout.adapter.sidecar.SidecarCompat.TranslatingCallback;
import androidx.window.sidecar.SidecarInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyh implements pxi {
    public static volatile pyh a;
    public static final ReentrantLock b = new ReentrantLock();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final pxt d;

    public pyh(pxt pxtVar) {
        this.d = pxtVar;
        if (pxtVar != null) {
            SidecarCompat sidecarCompat = (SidecarCompat) pxtVar;
            sidecarCompat.e = new pyc(new pye(this));
            SidecarInterface sidecarInterface = sidecarCompat.a;
            if (sidecarInterface != null) {
                sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(sidecarCompat.new TranslatingCallback(), null));
            }
        }
    }

    @Override // defpackage.pxi
    public final void a(Context context, Executor executor, lbz lbzVar) {
        Object next;
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            pxt pxtVar = this.d;
            if (pxtVar == null) {
                lbzVar.accept(new pxc(fcvo.a));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            boolean z = false;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (fdbq.f(((pyg) it.next()).a, context)) {
                        z = true;
                        break;
                    }
                }
            }
            pyg pygVar = new pyg((Activity) context, executor, lbzVar);
            copyOnWriteArrayList.add(pygVar);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (fdbq.f(context, ((pyg) next).a)) {
                            break;
                        }
                    }
                }
                pyg pygVar2 = (pyg) next;
                pxc pxcVar = pygVar2 != null ? pygVar2.c : null;
                if (pxcVar != null) {
                    pygVar.a(pxcVar);
                }
            } else {
                IBinder iBinderA = pyb.a((Activity) context);
                if (iBinderA != null) {
                    ((SidecarCompat) pxtVar).b(iBinderA, (Activity) context);
                } else {
                    ((Activity) context).getWindow().getDecorView().addOnAttachStateChangeListener(new pyd((SidecarCompat) pxtVar, (Activity) context));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.app.Activity, java.lang.Object, kxy] */
    @Override // defpackage.pxi
    public final void b(lbz lbzVar) {
        synchronized (b) {
            pxt pxtVar = this.d;
            if (pxtVar == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            Iterator it = copyOnWriteArrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                pyg pygVar = (pyg) it.next();
                if (pygVar.b == lbzVar) {
                    pygVar.getClass();
                    arrayList.add(pygVar);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ?? r2 = ((pyg) it2.next()).a;
                if (!copyOnWriteArrayList.isEmpty()) {
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        if (fdbq.f(((pyg) it3.next()).a, r2)) {
                            break;
                        }
                    }
                }
                IBinder iBinderA = pyb.a(r2);
                if (iBinderA == null) {
                    continue;
                } else {
                    SidecarInterface sidecarInterface = ((SidecarCompat) pxtVar).a;
                    if (sidecarInterface != null) {
                        sidecarInterface.onWindowLayoutChangeListenerRemoved(iBinderA);
                    }
                    Map map = ((SidecarCompat) pxtVar).d;
                    lbz lbzVar2 = (lbz) map.get(r2);
                    if (lbzVar2 != null) {
                        r2.g(lbzVar2);
                        map.remove(r2);
                    }
                    pyc pycVar = ((SidecarCompat) pxtVar).e;
                    if (pycVar != null) {
                        ReentrantLock reentrantLock = pycVar.a;
                        reentrantLock.lock();
                        try {
                            pycVar.b.put(r2, null);
                            reentrantLock.unlock();
                        } finally {
                        }
                    }
                    Map map2 = ((SidecarCompat) pxtVar).c;
                    int size = map2.size();
                    map2.remove(iBinderA);
                    if (size == 1 && sidecarInterface != null) {
                        sidecarInterface.onDeviceStateListenersChanged(true);
                    }
                }
            }
        }
    }
}
