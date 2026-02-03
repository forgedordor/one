package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bty implements bcu {
    public final ListenableFuture a;
    public kog b;
    private final Surface d;
    private final int e;
    private final Size f;
    private final bcs g;
    private final float[] i;
    private final float[] j;
    private final float[] k;
    private final float[] l;
    private lbz m;
    private Executor n;
    private final Object c = new Object();
    private boolean o = false;
    private boolean p = false;
    private final bcs h = null;

    public bty(Surface surface, int i, Size size, bcs bcsVar, bcs bcsVar2) {
        float[] fArr = new float[16];
        this.i = fArr;
        float[] fArr2 = new float[16];
        this.j = fArr2;
        float[] fArr3 = new float[16];
        this.k = fArr3;
        float[] fArr4 = new float[16];
        this.l = fArr4;
        this.d = surface;
        this.e = i;
        this.f = size;
        this.g = bcsVar;
        g(fArr, fArr3, bcsVar);
        g(fArr2, fArr4, null);
        this.a = kol.a(new koi() { // from class: btw
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                this.a.b = kogVar;
                return "SurfaceOutputImpl close future complete";
            }
        });
    }

    private static void g(float[] fArr, float[] fArr2, bcs bcsVar) {
        Matrix.setIdentityM(fArr, 0);
        if (bcsVar == null) {
            return;
        }
        bos.b(fArr);
        ayr ayrVar = (ayr) bcsVar;
        int i = ayrVar.d;
        bos.a(fArr, i);
        boolean z = ayrVar.e;
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size size = ayrVar.a;
        Size sizeK = boy.k(size, i);
        android.graphics.Matrix matrixD = boy.d(boy.g(size), boy.g(sizeK), i, z);
        RectF rectF = new RectF(ayrVar.b);
        matrixD.mapRect(rectF);
        float width = rectF.left / sizeK.getWidth();
        float height = (sizeK.getHeight() - rectF.height()) - rectF.top;
        float height2 = sizeK.getHeight();
        float fWidth = rectF.width() / sizeK.getWidth();
        float fHeight = rectF.height() / sizeK.getHeight();
        Matrix.translateM(fArr, 0, width, height / height2, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        biu biuVar = ayrVar.c;
        Matrix.setIdentityM(fArr2, 0);
        bos.b(fArr2);
        if (biuVar != null) {
            lcg.d(biuVar.H(), "Camera has no transform.");
            bos.a(fArr2, biuVar.c().b());
            if (biuVar.I()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // defpackage.bcu
    public final int a() {
        return this.e;
    }

    @Override // defpackage.bcu
    public final Size b() {
        return this.f;
    }

    @Override // defpackage.bcu
    public final Surface c(Executor executor, lbz lbzVar) {
        boolean z;
        synchronized (this.c) {
            this.n = executor;
            this.m = lbzVar;
            z = this.o;
        }
        if (z) {
            e();
        }
        return this.d;
    }

    @Override // defpackage.bcu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            if (!this.p) {
                this.p = true;
            }
        }
        this.b.b(null);
    }

    @Override // defpackage.bcu
    public final void d(float[] fArr, float[] fArr2) {
        f(fArr, fArr2);
    }

    public final void e() {
        Executor executor;
        lbz lbzVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.c) {
            executor = null;
            if (this.n == null || (lbzVar = this.m) == null) {
                this.o = true;
            } else if (!this.p) {
                atomicReference.set(lbzVar);
                executor = this.n;
                this.o = false;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: btx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((lbz) atomicReference.get()).accept(new ays(this.a));
                    }
                });
            } catch (RejectedExecutionException e) {
                bbs.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
            }
        }
    }

    public final void f(float[] fArr, float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.i, 0);
    }
}
