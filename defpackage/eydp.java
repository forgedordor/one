package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eydp extends UploadDataProvider {
    public eydo b;
    public final long c;
    private final ExecutorService f;
    private final eycb g;
    private final diep h;
    private final boolean j;
    private long l;
    public int d = 0;
    public int e = 0;
    private int k = 0;
    public final AtomicLong a = new AtomicLong(0);
    private final byte[] i = new byte[65536];

    public eydp(ExecutorService executorService, eycb eycbVar, diep diepVar) {
        this.f = executorService;
        this.g = eycbVar;
        this.h = diepVar;
        this.l = diepVar.a();
        boolean z = eycbVar.e() == -1;
        this.j = z;
        this.c = z ? 0L : eycbVar.e() - eycbVar.d();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        if (this.j) {
            return -1L;
        }
        eycb eycbVar = this.g;
        return Math.min(eycbVar.e() - eycbVar.d(), (eycbVar.b() + eycbVar.c()) - eycbVar.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    @Override // org.chromium.net.UploadDataProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void read(org.chromium.net.UploadDataSink r11, java.nio.ByteBuffer r12) {
        /*
            r10 = this;
            r0 = 65536(0x10000, float:9.18355E-41)
            int r1 = r12.capacity()
            int r0 = java.lang.Math.min(r0, r1)
            eycb r1 = r10.g
            byte[] r2 = r10.i
            r3 = 0
            int r0 = r1.a(r2, r3, r0)
            if (r0 <= 0) goto L4b
            r12.put(r2, r3, r0)
            int r12 = r10.k
            int r12 = r12 + r0
            r10.k = r12
            int r0 = r10.d
            if (r12 < r0) goto L4b
            int r12 = r10.e
            if (r12 <= 0) goto L38
            diep r12 = r10.h
            long r4 = r12.a()
            long r6 = r10.l
            long r6 = r4 - r6
            int r12 = r10.e
            long r8 = (long) r12
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 < 0) goto L4b
            r10.l = r4
        L38:
            java.util.concurrent.atomic.AtomicLong r12 = r10.a
            int r0 = r10.k
            long r4 = (long) r0
            r12.getAndAdd(r4)
            eydo r12 = r10.b
            if (r12 == 0) goto L49
            java.util.concurrent.ExecutorService r0 = r10.f
            r0.execute(r12)
        L49:
            r10.k = r3
        L4b:
            boolean r12 = r10.j
            if (r12 == 0) goto L56
            boolean r12 = r1.i()
            if (r12 != 0) goto L56
            r3 = 1
        L56:
            r11.onReadSucceeded(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eydp.read(org.chromium.net.UploadDataSink, java.nio.ByteBuffer):void");
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.g.h();
        uploadDataSink.onRewindSucceeded();
    }
}
