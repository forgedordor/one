package defpackage;

import java.io.Closeable;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcp implements Closeable {
    public static final Logger a;
    public final fffb b;
    private final ffco c;
    private final ffbs d;

    static {
        Logger logger = Logger.getLogger(ffbv.class.getName());
        logger.getClass();
        a = logger;
    }

    public ffcp(fffb fffbVar) {
        fffbVar.getClass();
        this.b = fffbVar;
        ffco ffcoVar = new ffco(fffbVar);
        this.c = ffcoVar;
        this.d = new ffbs(ffcoVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        throw new java.io.IOException("Header index too large " + r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List b(int r2, int r3, int r4, int r5) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffcp.b(int, int, int, int):java.util.List");
    }

    private final void c() {
        fffb fffbVar = this.b;
        fffbVar.f();
        fffbVar.d();
        byte[] bArr = fezr.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x024f, code lost:
    
        throw new java.io.IOException(defpackage.a.g(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04cb, code lost:
    
        if (r21 == 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04cd, code lost:
    
        r0.f(defpackage.fezr.b, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r21, defpackage.ffcd r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffcp.a(boolean, ffcd):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
