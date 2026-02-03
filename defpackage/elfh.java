package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elfh implements Runnable {
    final int a;
    Thread b;
    volatile Thread c;
    elfg d;
    int e;
    long f;
    volatile long g;
    final /* synthetic */ elfi h;
    volatile int i = 2;

    public elfh(elfi elfiVar, int i) {
        this.h = elfiVar;
        this.a = i;
    }

    private final void d() {
        if (this.h.j) {
            long j = this.f + 1;
            this.f = j;
            this.g = j;
        }
    }

    public final void a() {
        if (this.b != null) {
            this.h.f.incrementAndGet();
        }
        this.b = null;
        this.c = null;
        this.i = 3;
        this.h.o.countDown();
    }

    public final void b() {
        this.h.i.newThread(this).start();
    }

    public final void c(elfg elfgVar) {
        int i = this.e;
        if (i < 5) {
            elfgVar.a = this.d;
            elfgVar.b = this.a;
            this.d = elfgVar;
            this.e = i + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r3 = 1;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elfh.run():void");
    }
}
