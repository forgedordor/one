package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brg implements bbd {
    public final bbd a;
    public final Object b = new Object();
    public bbe c;
    private boolean d;

    public brg(bbd bbdVar) {
        this.a = bbdVar;
    }

    @Override // defpackage.bbd
    public final void a(long j, bbe bbeVar) {
        bbeVar.getClass();
        synchronized (this.b) {
            this.d = true;
            this.c = bbeVar;
        }
        bbd bbdVar = this.a;
        if (bbdVar != null) {
            bbdVar.a(j, new bbe() { // from class: brf
                @Override // defpackage.bbe
                public final void a() {
                    brg brgVar = this.a;
                    synchronized (brgVar.b) {
                        if (brgVar.c == null) {
                            bbs.f("ScreenFlashWrapper", "apply: pendingListener is null!");
                        }
                        brgVar.d();
                    }
                }
            });
        } else {
            bbs.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            d();
        }
    }

    @Override // defpackage.bbd
    public final void b() {
        c();
    }

    public final void c() {
        synchronized (this.b) {
            if (this.d) {
                bbd bbdVar = this.a;
                if (bbdVar != null) {
                    bbdVar.b();
                } else {
                    bbs.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                }
            } else {
                bbs.f("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
            }
            this.d = false;
        }
    }

    public final void d() {
        synchronized (this.b) {
            bbe bbeVar = this.c;
            if (bbeVar != null) {
                bbeVar.a();
            }
            this.c = null;
        }
    }
}
