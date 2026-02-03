package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcqx implements Closeable {
    public final fffb a;
    public final fcqs b;
    private final fcqv c;

    public fcqx(fffb fffbVar) {
        this.a = fffbVar;
        fcqv fcqvVar = new fcqv(fffbVar);
        this.c = fcqvVar;
        this.b = new fcqs(fcqvVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        throw new java.io.IOException("Header index too large " + r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(int r2, short r3, byte r4, int r5) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcqx.a(int, short, byte, int):java.util.List");
    }

    public final void b() {
        fffb fffbVar = this.a;
        fffbVar.f();
        fffbVar.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
