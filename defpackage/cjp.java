package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjp extends cir {
    TextureView d;
    SurfaceTexture e;
    ListenableFuture f;
    bdp g;
    boolean h;
    SurfaceTexture i;
    final AtomicReference j;
    cil k;

    public cjp(FrameLayout frameLayout, cig cigVar) {
        super(frameLayout, cigVar);
        this.h = false;
        this.j = new AtomicReference();
    }

    @Override // defpackage.cir
    public final Bitmap a() {
        TextureView textureView = this.d;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.d.getBitmap();
    }

    @Override // defpackage.cir
    public final View b() {
        return this.d;
    }

    @Override // defpackage.cir
    public final ListenableFuture c() {
        return kol.a(new koi() { // from class: cji
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                this.a.j.set(kogVar);
                return "textureViewImpl_waitForNextFrame";
            }
        });
    }

    @Override // defpackage.cir
    public final void d() {
        if (!this.h || this.i == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.d.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.i;
        if (surfaceTexture != surfaceTexture2) {
            this.d.setSurfaceTexture(surfaceTexture2);
            this.i = null;
            this.h = false;
        }
    }

    @Override // defpackage.cir
    public final void e() {
        this.h = true;
    }

    @Override // defpackage.cir
    public final void h(final bdp bdpVar, cil cilVar) {
        this.a = bdpVar.c;
        this.k = cilVar;
        lcg.i(this.a);
        FrameLayout frameLayout = this.b;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.d = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
        this.d.setSurfaceTextureListener(new cjo(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.d);
        bdp bdpVar2 = this.g;
        if (bdpVar2 != null) {
            bdpVar2.f();
        }
        this.g = bdpVar;
        bdpVar.a(kxj.e(this.d.getContext()), new Runnable() { // from class: cjj
            @Override // java.lang.Runnable
            public final void run() {
                cjp cjpVar = this.a;
                bdp bdpVar3 = cjpVar.g;
                if (bdpVar3 != null && bdpVar3 == bdpVar) {
                    cjpVar.g = null;
                    cjpVar.f = null;
                }
                cjpVar.i();
            }
        });
        j();
    }

    public final void i() {
        cil cilVar = this.k;
        if (cilVar != null) {
            cilVar.a();
            this.k = null;
        }
    }

    final void j() {
        SurfaceTexture surfaceTexture;
        Size size = this.a;
        if (size == null || (surfaceTexture = this.e) == null || this.g == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.a.getHeight());
        final Surface surface = new Surface(this.e);
        final bdp bdpVar = this.g;
        final ListenableFuture listenableFutureA = kol.a(new koi() { // from class: cjl
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                bbs.a("TextureViewImpl", "Surface set on Preview.");
                cjp cjpVar = this.a;
                bdp bdpVar2 = cjpVar.g;
                Executor executorA = bpc.a();
                lbz lbzVar = new lbz() { // from class: cjk
                    @Override // defpackage.lbz
                    public final void accept(Object obj) {
                        kogVar.b((bdm) obj);
                    }
                };
                Surface surface2 = surface;
                bdpVar2.b(surface2, executorA, lbzVar);
                return "provideSurface[request=" + cjpVar.g + " surface=" + surface2 + "]";
            }
        });
        this.f = listenableFutureA;
        listenableFutureA.b(new Runnable() { // from class: cjm
            @Override // java.lang.Runnable
            public final void run() {
                bbs.a("TextureViewImpl", "Safe to release surface.");
                cjp cjpVar = this.a;
                cjpVar.i();
                surface.release();
                if (cjpVar.f == listenableFutureA) {
                    cjpVar.f = null;
                }
                if (cjpVar.g == bdpVar) {
                    cjpVar.g = null;
                }
            }
        }, kxj.e(this.d.getContext()));
        f();
    }
}
