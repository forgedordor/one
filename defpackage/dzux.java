package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzux extends ThreadLocal {
    final /* synthetic */ dzuy a;

    public dzux(dzuy dzuyVar) {
        this.a = dzuyVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        long id = Thread.currentThread().getId();
        dzuo dzuoVar = new dzuo(Looper.myLooper() == Looper.getMainLooper() ? "UI Thread" : "Thread: ".concat(String.valueOf(Thread.currentThread().getName())), id, 1);
        ArrayDeque arrayDeque = new ArrayDeque();
        ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceData$1", "initialValue", 62, "TraceData.java")).A("Instantiate thread-data, thread:%d name:%s", id, dzuoVar.b);
        arrayDeque.push(dzuoVar);
        dzuy dzuyVar = this.a;
        dzuyVar.a.incrementAndGet();
        dzuyVar.c.put(dzuoVar, arrayDeque);
        return new WeakReference(arrayDeque);
    }
}
