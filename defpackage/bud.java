package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bud implements bpu {
    final /* synthetic */ btv a;
    final /* synthetic */ bug b;

    public bud(bug bugVar, btv btvVar) {
        this.b = bugVar;
        this.a = btvVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        int i = this.a.f;
        if (i == 2) {
            if (th instanceof CancellationException) {
                bbs.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            i = 2;
        }
        bbs.g("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(bul.a(i)), th);
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bcu bcuVar = (bcu) obj;
        lcg.i(bcuVar);
        try {
            this.b.a.b(bcuVar);
        } catch (bci e) {
            bbs.d("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
        }
    }
}
