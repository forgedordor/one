package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService;
import j$.time.Duration;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbge {
    public final Context a;
    public final ExecutorService b;

    public dbge(Context context, ExecutorService executorService) {
        this.a = context.getApplicationContext();
        this.b = executorService;
    }

    public final Object a(dbgc dbgcVar, Duration duration) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        Intent intent = new Intent("com.google.android.apps.tycho.psd.api.ACTION_BIND_PSD_SERVICE").setPackage("com.google.android.apps.tycho");
        dbgb dbgbVar = new dbgb(this, dbgcVar, atomicReference, countDownLatch, atomicReference2);
        try {
            if (!this.a.bindService(intent, dbgbVar, 1)) {
                throw new dbgd("Fi product-specific data service is not available");
            }
            if (!countDownLatch.await(duration.toNanos(), TimeUnit.NANOSECONDS)) {
                throw new TimeoutException("Timed out waiting for response from Fi app");
            }
            if (atomicReference2.get() == null) {
                return atomicReference.get();
            }
            throw ((dbgd) atomicReference2.get());
        } finally {
            this.a.unbindService(dbgbVar);
        }
    }

    public final List b(Duration duration) {
        return (List) a(new dbgc() { // from class: dbfv
            @Override // defpackage.dbgc
            public final void a(IBinder iBinder, Consumer consumer, Consumer consumer2) {
                IFiProductSpecificDataService.Stub.asInterface(iBinder).getFiProductSpecificData(this.a.a.getPackageName(), new dbfw(consumer, consumer2));
            }
        }, duration);
    }
}
