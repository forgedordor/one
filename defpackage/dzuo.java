package defpackage;

import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuo implements Closeable {
    static final dzuo a = new dzuo("", SystemClock.elapsedRealtime(), -1, Thread.currentThread().getId(), 3);
    String b;
    final long c;
    long d;
    final long e;
    public volatile List f;
    final int g;
    final int h;

    public dzuo(String str, long j, long j2, long j3, int i) {
        this.b = str;
        this.g = 1;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.h = i;
        if (i == 1) {
            this.f = DesugarCollections.synchronizedList(new ArrayList());
        } else {
            this.f = Collections.EMPTY_LIST;
        }
    }

    public final long a() {
        long j = this.d;
        if (j == -1) {
            return -1L;
        }
        return j - this.c;
    }

    final void b(List list) {
        if (this.f == Collections.EMPTY_LIST) {
            this.f = new ArrayList();
        }
        if (this.f != null) {
            this.f.addAll(list);
        }
    }

    final boolean c() {
        return this.h == 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = dzvk.a;
        if (equals(a)) {
            return;
        }
        if (this.d < 0) {
            this.d = SystemClock.elapsedRealtime();
        }
        AtomicReference atomicReference = dzvk.c;
        dzuy dzuyVar = (dzuy) atomicReference.get();
        if (dzuyVar != null) {
            if (this != ((dzuo) dzuyVar.c().poll())) {
                ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "endSpan", 189, "Tracer.java")).q("Incorrect Span passed. Ignore...");
                return;
            }
            if (a() >= dzvk.a) {
                if (dzuyVar.b() >= dzvk.b) {
                    ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "endSpan", 198, "Tracer.java")).r("Dropping trace as max buffer size is hit. Size: %d", dzuyVar.a());
                    atomicReference.set(null);
                    return;
                }
                dzuo dzuoVar = (dzuo) dzuyVar.c().peek();
                if (dzuoVar == null) {
                    ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceData", "linkToParent", 108, "TraceData.java")).t("null Parent for Span: %s", this.b);
                    return;
                }
                if (dzuoVar.f == Collections.EMPTY_LIST) {
                    dzuoVar.f = new ArrayList();
                }
                if (dzuoVar.f != null) {
                    dzuoVar.f.add(this);
                }
            }
        }
    }

    public dzuo(String str, long j, int i) {
        this(str, SystemClock.elapsedRealtime(), -1L, j, i);
    }
}
