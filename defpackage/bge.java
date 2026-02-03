package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bge {
    public final bgv a;
    public final bgu b;
    public kog d;
    public kog e;
    public ListenableFuture h;
    public boolean f = false;
    public boolean g = false;
    private final ListenableFuture i = kol.a(new koi() { // from class: bgc
        @Override // defpackage.koi
        public final Object a(kog kogVar) {
            this.a.d = kogVar;
            return "CaptureCompleteFuture";
        }
    });
    public final ListenableFuture c = kol.a(new koi() { // from class: bgd
        @Override // defpackage.koi
        public final Object a(kog kogVar) {
            this.a.e = kogVar;
            return "RequestCompleteFuture";
        }
    });

    public bge(bgv bgvVar, bgu bguVar) {
        this.a = bgvVar;
        this.b = bguVar;
    }

    final ListenableFuture a() {
        box.b();
        return this.i;
    }

    public final void b(bbg bbgVar) {
        box.b();
        this.f = true;
        ListenableFuture listenableFuture = this.h;
        listenableFuture.getClass();
        listenableFuture.cancel(true);
        this.d.c(bbgVar);
        this.e.b(null);
    }

    public final void c() {
        lcg.d(this.i.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public final void d() {
        lcg.d(!this.c.isDone(), "The callback can only complete once.");
        this.e.b(null);
    }

    public final void e() {
        box.b();
        if (this.f || this.g) {
            return;
        }
        this.g = true;
    }

    public final void f(bbg bbgVar) {
        box.b();
        this.a.m(bbgVar);
    }
}
