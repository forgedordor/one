package com.google.android.apps.messaging.shared.datamodel.resizing;

import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingServiceAndroidV;
import defpackage.auwa;
import defpackage.bxmi;
import defpackage.bxmy;
import defpackage.bxna;
import defpackage.cgbe;
import defpackage.cgbn;
import defpackage.ecem;
import defpackage.eieh;
import defpackage.eieu;
import defpackage.eigp;
import defpackage.eiiy;
import defpackage.ejwl;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.ekrz;
import defpackage.eksq;
import defpackage.fcsu;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ResizingServiceAndroidV extends bxmi implements Runnable {
    public fcsu b;
    public fcsu c;
    public fcsu d;
    private ThreadPoolExecutor f;
    private PowerManager.WakeLock g;
    private static final ekrg e = ekrg.c("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV");
    public static final AtomicInteger a = new AtomicInteger();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.bxmi, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MICROSECONDS, new ArrayBlockingQueue(1), new RejectedExecutionHandler() { // from class: bxnc
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                ResizingServiceAndroidV.a.decrementAndGet();
            }
        });
        this.g = ((PowerManager) getSystemService("power")).newWakeLock(1, "image_video_resizing_service");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ThreadPoolExecutor threadPoolExecutor = this.f;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        this.f = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        eieh eiehVarC = ((eigp) this.d.b()).c("ResizingServiceAndroidV#onStartCommand", "com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV", "onStartCommand", 148);
        try {
            if (!this.g.isHeld()) {
                this.g.acquire();
            }
            int intExtra = intent.getIntExtra("op", 0);
            ekrg ekrgVar = e;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "BugleResizing");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV", "onStartCommand", 154, "ResizingServiceAndroidV.java");
            AtomicInteger atomicInteger = a;
            ekrdVar.u("ResizingServiceAndroidV: op= %s , count= %s", intExtra, atomicInteger.get());
            if (intExtra == 0) {
                atomicInteger.incrementAndGet();
                ThreadPoolExecutor threadPoolExecutor = this.f;
                if (threadPoolExecutor != null) {
                    auwa.a(this, threadPoolExecutor);
                } else {
                    ekrw ekrwVarJ = ekrgVar.j();
                    ekrwVarJ.X(ekrzVar, "BugleResizing");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV", "onStartCommand", 161, "ResizingServiceAndroidV.java")).q("Cannot start resizing service, executor is null");
                }
            } else {
                if (intExtra != 1) {
                    throw new IllegalStateException(String.format("ResizingServiceAndroidV.onStartCommand illegal opcode %s", Integer.valueOf(intExtra)));
                }
                if (atomicInteger.get() == 0) {
                    ekrw ekrwVarH2 = ekrgVar.h();
                    ekrwVarH2.X(ekrzVar, "BugleResizing");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV", "onStartCommand", 168, "ResizingServiceAndroidV.java")).q("ResizingServiceAndroidV.stopSelf()");
                    if (this.g.isHeld()) {
                        this.g.release();
                    }
                    stopSelfResult(i2);
                }
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
        eieu eieuVarK = eiiy.k("ResizingServiceAndroidV#run");
        try {
            ecem.b();
            while (true) {
                try {
                    bxmy bxmyVarB = ((bxna) this.c.b()).b();
                    if (bxmyVarB == null) {
                        break;
                    }
                    Notification notificationD = ((cgbn) this.b.b()).d();
                    if (notificationD != null) {
                        ejwl.a(Build.VERSION.SDK_INT >= 35);
                        startForeground(cgbe.MEDIA_RESIZING.G, notificationD, 8192);
                    }
                    bxmyVarB.c();
                } finally {
                    if (a.decrementAndGet() == 0) {
                        Intent intent = new Intent(this, (Class<?>) ResizingServiceAndroidV.class);
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
