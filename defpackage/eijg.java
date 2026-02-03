package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eijg implements Runnable {
    public final eihg a;
    public final UUID b;
    public final String c;
    public final boolean d;
    public final eiii e;
    public final AtomicReference f;
    public ListenableFuture g;
    private final diep i;
    private final long j;
    private final Set k = new HashSet();
    int h = 0;

    public eijg(eihg eihgVar, UUID uuid, String str, eiii eiiiVar, eije eijeVar, long j, boolean z, diep diepVar) {
        this.a = eihgVar;
        this.b = uuid;
        this.c = str;
        this.e = eiiiVar;
        this.j = j;
        this.d = z;
        this.i = diepVar;
        this.f = new AtomicReference(eijeVar);
    }

    public final long a() {
        return this.i.b() - this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.eiim b() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eijg.b():eiim");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r9 = r9 - r4.g;
        r3 = r4.d.values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r3.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r11 = (defpackage.eijg) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r11.e.g >= r9) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        r6 = ((defpackage.eosd) r4.c.b()).schedule(new defpackage.eihd(), 10, java.util.concurrent.TimeUnit.SECONDS);
        r11.getClass();
        r6.b(new defpackage.eihe(r11), defpackage.eoqg.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        ((defpackage.ekrd) ((defpackage.ekrd) ((defpackage.ekrd) defpackage.eihg.a.i()).g(r0.getCause())).h("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceComplete", 325, "TraceManagerImpl.java")).t("Trace %s failed collection", ((defpackage.eibs) r2).a);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0217  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eijg.run():void");
    }

    public final String toString() {
        return "UnfinishedTrace@" + Integer.toHexString(System.identityHashCode(this)) + "[" + ((eibs) b()).a + "]";
    }
}
