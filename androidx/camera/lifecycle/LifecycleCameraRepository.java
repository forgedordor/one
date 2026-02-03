package androidx.camera.lifecycle;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.bwc;
import defpackage.lcg;
import defpackage.lva;
import defpackage.lvb;
import defpackage.lvi;
import defpackage.lvj;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifecycleCameraRepository {
    public static final Object a = new Object();
    public static LifecycleCameraRepository b;
    public final Object c = new Object();
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    private final ArrayDeque f = new ArrayDeque();

    /* compiled from: PG */
    public static class LifecycleCameraRepositoryObserver implements lvi {
        public final lvj a;
        private final LifecycleCameraRepository b;

        public LifecycleCameraRepositoryObserver(lvj lvjVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.a = lvjVar;
            this.b = lifecycleCameraRepository;
        }

        @OnLifecycleEvent(a = lva.ON_DESTROY)
        public void onDestroy(lvj lvjVar) {
            this.b.e(lvjVar);
        }

        @OnLifecycleEvent(a = lva.ON_START)
        public void onStart(lvj lvjVar) {
            this.b.c(lvjVar);
        }

        @OnLifecycleEvent(a = lva.ON_STOP)
        public void onStop(lvj lvjVar) {
            this.b.d(lvjVar);
        }
    }

    private final void f(lvj lvjVar) {
        synchronized (this.c) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverA = a(lvjVar);
            if (lifecycleCameraRepositoryObserverA == null) {
                return;
            }
            Iterator it = ((Set) this.e.get(lifecycleCameraRepositoryObserverA)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.d.get((bwc) it.next());
                lcg.i(lifecycleCamera);
                lifecycleCamera.e();
            }
        }
    }

    private final void g(lvj lvjVar) {
        synchronized (this.c) {
            Iterator it = ((Set) this.e.get(a(lvjVar))).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.d.get((bwc) it.next());
                lcg.i(lifecycleCamera);
                if (!lifecycleCamera.d().isEmpty()) {
                    synchronized (lifecycleCamera.a) {
                        if (lifecycleCamera.d) {
                            lifecycleCamera.d = false;
                            lvj lvjVar2 = lifecycleCamera.b;
                            if (lvjVar2.P().a().a(lvb.d)) {
                                lifecycleCamera.onStart(lvjVar2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final LifecycleCameraRepositoryObserver a(lvj lvjVar) {
        synchronized (this.c) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.e.keySet()) {
                if (lvjVar.equals(lifecycleCameraRepositoryObserver.a)) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    public final Collection b() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.c) {
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(this.d.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final void c(lvj lvjVar) {
        Object obj = this.c;
        synchronized (obj) {
            synchronized (obj) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverA = a(lvjVar);
                if (lifecycleCameraRepositoryObserverA != null) {
                    Iterator it = ((Set) this.e.get(lifecycleCameraRepositoryObserverA)).iterator();
                    while (it.hasNext()) {
                        LifecycleCamera lifecycleCamera = (LifecycleCamera) this.d.get((bwc) it.next());
                        lcg.i(lifecycleCamera);
                        if (!lifecycleCamera.d().isEmpty()) {
                            ArrayDeque arrayDeque = this.f;
                            if (arrayDeque.isEmpty()) {
                                arrayDeque.push(lvjVar);
                            } else {
                                lvj lvjVar2 = (lvj) arrayDeque.peek();
                                if (!lvjVar.equals(lvjVar2)) {
                                    f(lvjVar2);
                                    arrayDeque.remove(lvjVar);
                                    arrayDeque.push(lvjVar);
                                }
                            }
                            g(lvjVar);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void d(lvj lvjVar) {
        synchronized (this.c) {
            ArrayDeque arrayDeque = this.f;
            arrayDeque.remove(lvjVar);
            f(lvjVar);
            if (!arrayDeque.isEmpty()) {
                g((lvj) arrayDeque.peek());
            }
        }
    }

    public final void e(lvj lvjVar) {
        synchronized (this.c) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverA = a(lvjVar);
            if (lifecycleCameraRepositoryObserverA == null) {
                return;
            }
            d(lvjVar);
            Map map = this.e;
            Iterator it = ((Set) map.get(lifecycleCameraRepositoryObserverA)).iterator();
            while (it.hasNext()) {
                this.d.remove((bwc) it.next());
            }
            map.remove(lifecycleCameraRepositoryObserverA);
            lifecycleCameraRepositoryObserverA.a.P().d(lifecycleCameraRepositoryObserverA);
        }
    }
}
