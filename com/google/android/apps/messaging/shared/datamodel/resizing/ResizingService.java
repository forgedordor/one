package com.google.android.apps.messaging.shared.datamodel.resizing;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingService;
import defpackage.a;
import defpackage.auwa;
import defpackage.bxmh;
import defpackage.bxmy;
import defpackage.bxna;
import defpackage.cgbe;
import defpackage.cgbn;
import defpackage.cqaz;
import defpackage.cqca;
import defpackage.ecem;
import defpackage.eieh;
import defpackage.eieu;
import defpackage.eigp;
import defpackage.eiiy;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ResizingService extends bxmh implements Runnable {
    public static final AtomicInteger a = new AtomicInteger();
    public cgbn b;
    public bxna c;
    public eigp d;
    private ThreadPoolExecutor e;
    private PowerManager.WakeLock f;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.bxmh, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.e = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MICROSECONDS, new ArrayBlockingQueue(1), new RejectedExecutionHandler() { // from class: bxnb
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                ResizingService.a.decrementAndGet();
            }
        });
        this.f = ((PowerManager) getSystemService("power")).newWakeLock(1, "image_video_resizing_service");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        this.e = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        eieh eiehVarC = this.d.c("ResizingService#onStartCommand", "com/google/android/apps/messaging/shared/datamodel/resizing/ResizingService", "onStartCommand", 132);
        try {
            if (!this.f.isHeld()) {
                this.f.acquire();
            }
            int intExtra = intent.getIntExtra("op", 0);
            if (cqca.q("Bugle", 3)) {
                cqca.c("Bugle", "ResizingService: op=" + intExtra + ", count=" + a.get());
            }
            if (intExtra == 0) {
                a.incrementAndGet();
                ThreadPoolExecutor threadPoolExecutor = this.e;
                if (threadPoolExecutor != null) {
                    auwa.a(this, threadPoolExecutor);
                } else if (cqca.q("Bugle", 5)) {
                    cqca.n("Bugle", "Cannot start resizing service, executor is null");
                }
            } else if (intExtra != 1) {
                cqaz.c(a.g(intExtra, "ResizingService.onStartCommand illegal opcode"));
            } else if (a.get() == 0) {
                if (cqca.q("Bugle", 3)) {
                    cqca.c("Bugle", "ResizingService.stopSelf()");
                }
                if (this.f.isHeld()) {
                    this.f.release();
                }
                stopSelfResult(i2);
            }
            eiehVarC.close();
            return 2;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        eieu eieuVarK = eiiy.k("ResizingService#run");
        try {
            ecem.b();
            while (true) {
                try {
                    bxmy bxmyVarB = this.c.b();
                    if (bxmyVarB == null) {
                        break;
                    }
                    Notification notificationD = this.b.d();
                    if (notificationD != null) {
                        startForeground(cgbe.MEDIA_RESIZING.G, notificationD);
                    }
                    bxmyVarB.c();
                } finally {
                    if (a.decrementAndGet() == 0) {
                        Intent intent = new Intent(this, (Class<?>) ResizingService.class);
                        intent.putExtra("op", 1);
                        startService(intent);
                    }
                }
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
