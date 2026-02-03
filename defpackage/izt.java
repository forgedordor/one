package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izt {
    public final hox a;
    public final hox b;
    public long c;
    private final hox d;
    private final hrg e;
    private final hrg f;
    private final hrk g;
    private final hrg h;

    public izt() {
        hsi hsiVar = hsi.a;
        this.a = new hpl(true, hsiVar);
        this.b = new hpl(false, hsiVar);
        this.e = new hpf(0.0f);
        this.f = new hpf(0.0f);
        this.d = new hpl(null, hsiVar);
        this.g = new hpj(0L);
        this.h = new hpf(1.0f);
        this.c = 0L;
        ctj ctjVar = ivs.a;
    }

    public final void a(float f) {
        this.h.h(f);
    }

    public final void b(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    public final void c(long j) {
        this.g.h(j);
    }

    public final void d(float f) {
        this.e.h(f);
    }

    public final void e(float f) {
        this.f.h(f);
    }

    public final void f(Interpolator interpolator) {
        this.d.b(interpolator);
    }
}
