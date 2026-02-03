package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjo implements TextureView.SurfaceTextureListener {
    final /* synthetic */ cjp a;

    public cjo(cjp cjpVar) {
        this.a = cjpVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        bbs.a("TextureViewImpl", a.s(i2, i, "SurfaceTexture available. Size: ", "x"));
        cjp cjpVar = this.a;
        cjpVar.e = surfaceTexture;
        if (cjpVar.f == null) {
            cjpVar.j();
            return;
        }
        lcg.i(cjpVar.g);
        bdp bdpVar = cjpVar.g;
        Objects.toString(bdpVar);
        bbs.a("TextureViewImpl", "Surface invalidated ".concat(String.valueOf(bdpVar)));
        cjpVar.g.j.d();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        cjp cjpVar = this.a;
        cjpVar.e = null;
        ListenableFuture listenableFuture = cjpVar.f;
        if (listenableFuture == null) {
            bbs.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        bqk.i(listenableFuture, new cjn(this, surfaceTexture), kxj.e(cjpVar.d.getContext()));
        cjpVar.i = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        bbs.a("TextureViewImpl", a.s(i2, i, "SurfaceTexture size changed: ", "x"));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        kog kogVar = (kog) this.a.j.getAndSet(null);
        if (kogVar != null) {
            kogVar.b(null);
        }
    }
}
