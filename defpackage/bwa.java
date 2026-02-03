package defpackage;

import android.content.Context;
import android.util.SparseArray;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwa implements bpu {
    final /* synthetic */ bwb a;
    final /* synthetic */ azp b;
    final /* synthetic */ Context c;

    public bwa(bwb bwbVar, azp azpVar, Context context) {
        this.a = bwbVar;
        this.b = azpVar;
        this.c = context;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        ListenableFuture listenableFutureB;
        final bwb bwbVar = this.a;
        final Runnable runnable = new Runnable() { // from class: bvx
            @Override // java.lang.Runnable
            public final void run() {
                bwb bwbVar2 = bwbVar;
                bwbVar2.c();
                HashSet<bwc> hashSet = bwbVar2.h;
                LifecycleCameraRepository lifecycleCameraRepository = bwbVar2.d;
                Object obj = lifecycleCameraRepository.c;
                synchronized (obj) {
                    for (bwc bwcVar : hashSet) {
                        Map map = lifecycleCameraRepository.d;
                        if (map.containsKey(bwcVar)) {
                            LifecycleCamera lifecycleCamera = (LifecycleCamera) map.get(bwcVar);
                            synchronized (obj) {
                                lvj lvjVarA = lifecycleCamera.a();
                                bvw bvwVar = new bvw(lvjVarA, lifecycleCamera.c.b);
                                map.remove(bvwVar);
                                HashSet hashSet2 = new HashSet();
                                Map map2 = lifecycleCameraRepository.e;
                                for (LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : map2.keySet()) {
                                    lvj lvjVar = lifecycleCameraRepositoryObserver.a;
                                    if (lvjVarA.equals(lvjVar)) {
                                        Set set = (Set) map2.get(lifecycleCameraRepositoryObserver);
                                        set.remove(bvwVar);
                                        if (set.isEmpty()) {
                                            hashSet2.add(lvjVar);
                                        }
                                    }
                                }
                                Iterator it = hashSet2.iterator();
                                while (it.hasNext()) {
                                    lifecycleCameraRepository.e((lvj) it.next());
                                }
                            }
                        }
                    }
                }
            }
        };
        if (box.d()) {
            runnable.run();
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            lcg.d(box.a().post(new Runnable() { // from class: bow
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    try {
                        runnable2.run();
                    } finally {
                        countDownLatch2.countDown();
                    }
                }
            }), "Unable to post to main thread");
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e) {
                throw new bok(e);
            }
        }
        azp azpVar = bwbVar.e;
        if (azpVar != null) {
            axw axwVar = (axw) ((amc) azpVar.a()).b;
            axwVar.a.clear();
            axwVar.b.clear();
            axwVar.c.clear();
            axwVar.d.clear();
            axwVar.e = 0;
        }
        final azp azpVar2 = bwbVar.e;
        if (azpVar2 != null) {
            synchronized (azpVar2.d) {
                azpVar2.g.removeCallbacksAndMessages("retry_token");
                int i = azpVar2.p;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    azpVar2.p = 5;
                    listenableFutureB = bqk.b(null);
                } else {
                    if (i2 == 1) {
                        throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                    }
                    if (i2 == 2 || i2 == 3) {
                        azpVar2.p = 5;
                        Integer num = azpVar2.o;
                        synchronized (azp.a) {
                            if (num != null) {
                                SparseArray sparseArray = azp.b;
                                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                                if (iIntValue == 0) {
                                    sparseArray.remove(num.intValue());
                                } else {
                                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                                }
                                azp.d();
                            }
                        }
                        azpVar2.n = kol.a(new koi() { // from class: azo
                            @Override // defpackage.koi
                            public final Object a(final kog kogVar) {
                                ListenableFuture listenableFutureB2;
                                final azp azpVar3 = azpVar2;
                                final bjb bjbVar = azpVar3.c;
                                synchronized (bjbVar.a) {
                                    Map map = bjbVar.b;
                                    if (map.isEmpty()) {
                                        listenableFutureB2 = bjbVar.d;
                                        if (listenableFutureB2 == null) {
                                            listenableFutureB2 = bqk.b(null);
                                        }
                                    } else {
                                        ListenableFuture listenableFutureA = bjbVar.d;
                                        if (listenableFutureA == null) {
                                            listenableFutureA = kol.a(new koi() { // from class: biz
                                                @Override // defpackage.koi
                                                public final Object a(kog kogVar2) {
                                                    bjb bjbVar2 = bjbVar;
                                                    synchronized (bjbVar2.a) {
                                                        bjbVar2.e = kogVar2;
                                                    }
                                                    return "CameraRepository-deinit";
                                                }
                                            });
                                            bjbVar.d = listenableFutureA;
                                        }
                                        bjbVar.c.addAll(map.values());
                                        for (final biu biuVar : map.values()) {
                                            biuVar.h().b(new Runnable() { // from class: bja
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    bjb bjbVar2 = bjbVar;
                                                    Object obj = bjbVar2.a;
                                                    biu biuVar2 = biuVar;
                                                    synchronized (obj) {
                                                        Set set = bjbVar2.c;
                                                        set.remove(biuVar2);
                                                        if (set.isEmpty()) {
                                                            lcg.i(bjbVar2.e);
                                                            bjbVar2.e.b(null);
                                                            bjbVar2.e = null;
                                                            bjbVar2.d = null;
                                                        }
                                                    }
                                                }
                                            }, bpc.a());
                                        }
                                        map.clear();
                                        listenableFutureB2 = listenableFutureA;
                                    }
                                }
                                listenableFutureB2.b(new Runnable() { // from class: azk
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        azp azpVar4 = azpVar3;
                                        if (azpVar4.h != null) {
                                            Executor executor = azpVar4.f;
                                            if (executor instanceof azb) {
                                                azb azbVar = (azb) executor;
                                                synchronized (azbVar.a) {
                                                    if (!azbVar.b.isShutdown()) {
                                                        azbVar.b.shutdown();
                                                    }
                                                }
                                            }
                                            azpVar4.h.quit();
                                        }
                                        kogVar.b(null);
                                    }
                                }, azpVar3.f);
                                return "CameraX shutdownInternal";
                            }
                        });
                    }
                    listenableFutureB = azpVar2.n;
                }
            }
        } else {
            listenableFutureB = bqk.b(null);
        }
        listenableFutureB.getClass();
        synchronized (bwbVar.a) {
            bwbVar.b = null;
            bwbVar.c = listenableFutureB;
            bwbVar.g.clear();
            bwbVar.h.clear();
        }
        bwbVar.e = null;
        bwbVar.f = null;
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bwb bwbVar = this.a;
        bwbVar.e = this.b;
        bwbVar.f = bnw.a(this.c);
    }
}
