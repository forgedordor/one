package defpackage;

import android.graphics.SurfaceTexture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjn implements bpu {
    final /* synthetic */ SurfaceTexture a;
    final /* synthetic */ cjo b;

    public cjn(cjo cjoVar, SurfaceTexture surfaceTexture) {
        this.b = cjoVar;
        this.a = surfaceTexture;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        lcg.d(((bdm) obj).a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
        bbs.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
        this.a.release();
        cjp cjpVar = this.b.a;
        if (cjpVar.i != null) {
            cjpVar.i = null;
        }
    }
}
