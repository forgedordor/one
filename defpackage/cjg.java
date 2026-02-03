package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjg extends cir {
    SurfaceView d;
    final cjf e;

    public cjg(FrameLayout frameLayout, cig cigVar) {
        super(frameLayout, cigVar);
        this.e = new cjf(this);
    }

    @Override // defpackage.cir
    public final Bitmap a() {
        SurfaceView surfaceView = this.d;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.d.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.d.getWidth(), this.d.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.d, bitmapCreateBitmap, new PixelCopy$OnPixelCopyFinishedListener() { // from class: cjd
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    bbs.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    bbs.c("SurfaceViewImpl", a.g(i, "PreviewView.SurfaceViewImplementation.getBitmap() failed with error "));
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    bbs.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
                }
            } catch (InterruptedException e) {
                bbs.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            }
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // defpackage.cir
    public final View b() {
        return this.d;
    }

    @Override // defpackage.cir
    public final ListenableFuture c() {
        return bqk.b(null);
    }

    @Override // defpackage.cir
    public final void h(final bdp bdpVar, final cil cilVar) {
        SurfaceView surfaceView = this.d;
        Size size = this.a;
        Size size2 = bdpVar.c;
        boolean zEquals = Objects.equals(size, size2);
        if (surfaceView == null || !zEquals) {
            this.a = size2;
            lcg.i(this.a);
            FrameLayout frameLayout = this.b;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.d = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.d);
            this.d.getHolder().addCallback(this.e);
        }
        bdpVar.a(kxj.e(this.d.getContext()), new Runnable() { // from class: cjb
            @Override // java.lang.Runnable
            public final void run() {
                cilVar.a();
            }
        });
        this.d.post(new Runnable() { // from class: cjc
            @Override // java.lang.Runnable
            public final void run() {
                cjf cjfVar = this.a.e;
                cjfVar.a();
                bdp bdpVar2 = bdpVar;
                if (cjfVar.d) {
                    cjfVar.d = false;
                    bdpVar2.e();
                    return;
                }
                cil cilVar2 = cilVar;
                cjfVar.b = bdpVar2;
                cjfVar.f = cilVar2;
                Size size3 = bdpVar2.c;
                cjfVar.a = size3;
                cjfVar.c = false;
                if (cjfVar.b()) {
                    return;
                }
                bbs.a("SurfaceViewImpl", "Wait for new Surface creation.");
                cjfVar.e.d.getHolder().setFixedSize(size3.getWidth(), size3.getHeight());
            }
        });
    }

    @Override // defpackage.cir
    public final void d() {
    }

    @Override // defpackage.cir
    public final void e() {
    }
}
