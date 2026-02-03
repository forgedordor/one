package com.google.android.libraries.performance.primes.metrics.crash;

import android.os.StrictMode;
import android.util.Pair;
import defpackage.dzfq;
import defpackage.dzne;
import defpackage.dznj;
import defpackage.dznq;
import defpackage.ejwi;
import defpackage.ejwt;
import defpackage.ekrd;
import defpackage.evqz;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtg;
import defpackage.evuq;
import defpackage.exav;
import defpackage.exaw;
import defpackage.exax;
import defpackage.exay;
import defpackage.fcsu;
import defpackage.feho;
import defpackage.fehu;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class NativeCrashHandlerImpl implements dznq {
    final CountDownLatch a = new CountDownLatch(1);
    final CountDownLatch b = new CountDownLatch(1);
    private boolean c;
    private final ejwi d;
    private final fcsu e;

    public NativeCrashHandlerImpl(ejwi ejwiVar, fcsu fcsuVar) {
        this.d = ejwiVar;
        this.e = fcsuVar;
    }

    private static native Pair<ByteBuffer, Thread> awaitSignal();

    private static native boolean initializeSignalHandler(boolean z);

    private static native void unblockSignalHandler();

    @Override // defpackage.dznq
    public final synchronized void a(final dzne dzneVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        Thread thread = new Thread(new Runnable() { // from class: dznr
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(dzneVar);
            }
        }, "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fcsu, java.lang.Object] */
    public final /* synthetic */ void b(dzne dzneVar) {
        exav exavVar;
        if (!((Boolean) ((ejwt) this.d).a.b()).booleanValue()) {
            this.b.countDown();
            return;
        }
        try {
            System.loadLibrary("native_crash_handler_jni");
            if (!initializeSignalHandler(false)) {
                ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 76, "NativeCrashHandlerImpl.java")).q("unable to initialize signal handler");
                return;
            }
            try {
                this.a.countDown();
                Pair<ByteBuffer, Thread> pairAwaitSignal = awaitSignal();
                if (pairAwaitSignal != null) {
                    try {
                        exavVar = (exav) exay.a.createBuilder();
                        evqz evqzVarL = evqz.L((ByteBuffer) pairAwaitSignal.first);
                        evrr evrrVar = evrr.a;
                        evuq evuqVar = evuq.a;
                        exavVar.mergeFrom(evqzVarL, evrr.a);
                    } catch (Throwable unused) {
                        exavVar = null;
                    }
                    try {
                        Thread thread = (Thread) pairAwaitSignal.second;
                        if (exavVar != null && thread != null) {
                            String name = thread.getName();
                            exavVar.copyOnWrite();
                            exay exayVar = (exay) exavVar.instance;
                            exay exayVar2 = exay.a;
                            name.getClass();
                            exayVar.b |= 32;
                            exayVar.d = name;
                            long id = thread.getId();
                            exavVar.copyOnWrite();
                            exay exayVar3 = (exay) exavVar.instance;
                            exayVar3.b |= 16;
                            exayVar3.c = id;
                            for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                                exaw exawVar = (exaw) exax.a.createBuilder();
                                String className = stackTraceElement.getClassName();
                                exawVar.copyOnWrite();
                                exax exaxVar = (exax) exawVar.instance;
                                className.getClass();
                                exaxVar.b |= 1;
                                exaxVar.c = className;
                                String methodName = stackTraceElement.getMethodName();
                                exawVar.copyOnWrite();
                                exax exaxVar2 = (exax) exawVar.instance;
                                methodName.getClass();
                                exaxVar2.b |= 2;
                                exaxVar2.d = methodName;
                                int lineNumber = stackTraceElement.getLineNumber();
                                exawVar.copyOnWrite();
                                exax exaxVar3 = (exax) exawVar.instance;
                                exaxVar3.b |= 8;
                                exaxVar3.f = lineNumber;
                                String fileName = stackTraceElement.getFileName();
                                if (fileName != null) {
                                    exawVar.copyOnWrite();
                                    exax exaxVar4 = (exax) exawVar.instance;
                                    exaxVar4.b |= 4;
                                    exaxVar4.e = fileName;
                                }
                                exavVar.copyOnWrite();
                                exay exayVar4 = (exay) exavVar.instance;
                                exax exaxVar5 = (exax) exawVar.build();
                                exaxVar5.getClass();
                                evtg evtgVar = exayVar4.e;
                                if (!evtgVar.c()) {
                                    exayVar4.e = evsn.mutableCopy(evtgVar);
                                }
                                exayVar4.e.add(exaxVar5);
                            }
                        }
                    } catch (Throwable th) {
                        ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(th)).h("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 111, "NativeCrashHandlerImpl.java")).q("unable to populate java stack frames");
                    }
                } else {
                    exavVar = null;
                }
                if (((Boolean) this.e.b()).booleanValue()) {
                    Thread.getAllStackTraces();
                }
                exay exayVar5 = exavVar != null ? (exay) exavVar.build() : null;
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                feho fehoVarA = ((dznj) dzneVar).g.a(((dznj) dzneVar).a);
                fehoVarA.copyOnWrite();
                fehu fehuVar = (fehu) fehoVarA.instance;
                fehu fehuVar2 = fehu.a;
                fehuVar.g = 5;
                fehuVar.b |= 16;
                if (exayVar5 != null) {
                    fehoVarA.copyOnWrite();
                    fehu fehuVar3 = (fehu) fehoVarA.instance;
                    fehuVar3.j = exayVar5;
                    fehuVar3.b |= 512;
                }
                ((dznj) dzneVar).l((fehu) fehoVarA.build(), null);
            } finally {
                unblockSignalHandler();
            }
        } catch (UnsatisfiedLinkError e) {
            ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 'H', "NativeCrashHandlerImpl.java")).q("unable to load native_crash_handler_jni");
        }
    }
}
