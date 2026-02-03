package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbgb implements ServiceConnection {
    final /* synthetic */ dbgc a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ CountDownLatch c;
    final /* synthetic */ AtomicReference d;
    final /* synthetic */ dbge e;
    private boolean f;

    public dbgb(dbge dbgeVar, dbgc dbgcVar, AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
        this.a = dbgcVar;
        this.b = atomicReference;
        this.c = countDownLatch;
        this.d = atomicReference2;
        this.e = dbgeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (this.f) {
            return;
        }
        this.f = true;
        dbge dbgeVar = this.e;
        final dbgc dbgcVar = this.a;
        final AtomicReference atomicReference = this.b;
        final CountDownLatch countDownLatch = this.c;
        final AtomicReference atomicReference2 = this.d;
        dbgeVar.b.submit(new Runnable() { // from class: dbga
            @Override // java.lang.Runnable
            public final void run() {
                dbgc dbgcVar2 = dbgcVar;
                final AtomicReference atomicReference3 = atomicReference;
                IBinder iBinder2 = iBinder;
                final AtomicReference atomicReference4 = atomicReference2;
                final CountDownLatch countDownLatch2 = countDownLatch;
                try {
                    dbgcVar2.a(iBinder2, new Consumer() { // from class: dbfy
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            atomicReference3.set(obj);
                            countDownLatch2.countDown();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new Consumer() { // from class: dbfz
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            atomicReference4.set(new dbgd((String) obj));
                            countDownLatch2.countDown();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } catch (RemoteException e) {
                    atomicReference4.set(new dbgd(e));
                    countDownLatch2.countDown();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
