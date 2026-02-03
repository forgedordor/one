package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrk implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ mrn a;

    public mrk(mrn mrnVar) {
        this.a = mrnVar;
    }

    public final void a(Surface surface) throws CloneNotSupportedException {
        this.a.al(surface);
    }

    public final void b() throws CloneNotSupportedException {
        this.a.al(null);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws CloneNotSupportedException {
        mrn mrnVar = this.a;
        mrnVar.ak(surfaceTexture);
        mrnVar.ag(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) throws CloneNotSupportedException {
        mrn mrnVar = this.a;
        mrnVar.al(null);
        mrnVar.ag(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.ag(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.ag(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) throws CloneNotSupportedException {
        mrn mrnVar = this.a;
        if (mrnVar.u) {
            mrnVar.al(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) throws CloneNotSupportedException {
        mrn mrnVar = this.a;
        if (mrnVar.u) {
            mrnVar.al(null);
        }
        mrnVar.ag(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
