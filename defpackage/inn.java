package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inn implements inl {
    private static final AtomicBoolean a = new AtomicBoolean(true);
    private boolean A;
    private ikk B;
    private final ijc b;
    private final imu c;
    private final RenderNode d;
    private long e;
    private Paint f;
    private Matrix g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private float l;
    private boolean m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private long s;
    private long t;
    private float u;
    private float v;
    private float w;
    private float x;
    private boolean y;
    private boolean z;

    public inn(View view, ijc ijcVar, imu imuVar) {
        this.b = ijcVar;
        this.c = imuVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (a.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                renderNodeCreate.setAmbientShadowColor(renderNodeCreate.getAmbientShadowColor());
                renderNodeCreate.setSpotShadowColor(renderNodeCreate.getSpotShadowColor());
            }
            O();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        Q(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = ije.a;
        this.s = j;
        this.t = j;
        this.x = 8.0f;
    }

    private final void P() {
        boolean z = this.y;
        boolean z2 = z && !this.h;
        boolean z3 = z && this.h;
        if (z2 != this.z) {
            this.z = z2;
            this.d.setClipToBounds(z2);
        }
        if (z3 != this.A) {
            this.A = z3;
            this.d.setClipToOutline(z3);
        }
    }

    private final void Q(int i) {
        RenderNode renderNode = this.d;
        if (inf.a(i, 1)) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (inf.a(i, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void R() {
        int i = this.j;
        if (inf.a(i, 1) || !iis.b(this.k, 3)) {
            Q(1);
        } else {
            Q(i);
        }
    }

    @Override // defpackage.inl
    public final void A(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            RenderNode renderNode = this.d;
            renderNode.setPivotX(((int) (this.e >> 32)) / 2.0f);
            renderNode.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
            return;
        }
        this.m = false;
        RenderNode renderNode2 = this.d;
        renderNode2.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        renderNode2.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // defpackage.inl
    public final void B(int i, int i2, long j) {
        int i3 = (int) (4294967295L & j);
        int i4 = (int) (j >> 32);
        RenderNode renderNode = this.d;
        renderNode.setLeftTopRightBottom(i, i2, i + i4, i2 + i3);
        if (kjg.e(this.e, j)) {
            return;
        }
        if (this.m) {
            renderNode.setPivotX(i4 / 2.0f);
            renderNode.setPivotY(i3 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.inl
    public final void C(ikk ikkVar) {
        this.B = ikkVar;
    }

    @Override // defpackage.inl
    public final void D(float f) {
        this.u = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.inl
    public final void E(float f) {
        this.v = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.inl
    public final void F(float f) {
        this.w = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.inl
    public final void G(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.inl
    public final void H(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.inl
    public final void I(float f) {
        this.r = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.inl
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.t = j;
            this.d.setSpotShadowColor(ijg.b(j));
        }
    }

    @Override // defpackage.inl
    public final void K(float f) {
        this.p = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.inl
    public final void L(float f) {
        this.q = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.inl
    public final boolean M() {
        return this.d.isValid();
    }

    @Override // defpackage.inl
    public final void N() {
        R();
    }

    public final void O() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.inl
    public final float a() {
        return this.l;
    }

    @Override // defpackage.inl
    public final float b() {
        return this.x;
    }

    @Override // defpackage.inl
    public final float c() {
        return this.u;
    }

    @Override // defpackage.inl
    public final float d() {
        return this.v;
    }

    @Override // defpackage.inl
    public final float e() {
        return this.w;
    }

    @Override // defpackage.inl
    public final float f() {
        return this.n;
    }

    @Override // defpackage.inl
    public final float g() {
        return this.o;
    }

    @Override // defpackage.inl
    public final float h() {
        return this.r;
    }

    @Override // defpackage.inl
    public final float i() {
        return this.p;
    }

    @Override // defpackage.inl
    public final float j() {
        return this.q;
    }

    @Override // defpackage.inl
    public final int k() {
        return this.k;
    }

    @Override // defpackage.inl
    public final int l() {
        return this.j;
    }

    @Override // defpackage.inl
    public final long m() {
        return this.s;
    }

    @Override // defpackage.inl
    public final long n() {
        return this.t;
    }

    @Override // defpackage.inl
    public final Matrix o() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.inl
    public final ikk p() {
        return this.B;
    }

    @Override // defpackage.inl
    public final void q() {
        O();
    }

    @Override // defpackage.inl
    public final void r(ijb ijbVar) {
        DisplayListCanvas displayListCanvasA = iid.a(ijbVar);
        displayListCanvasA.getClass();
        displayListCanvasA.drawRenderNode(this.d);
    }

    @Override // defpackage.inl
    public final void s(kio kioVar, kji kjiVar, ini iniVar, fdap fdapVar) {
        DisplayListCanvas displayListCanvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (4294967295L & this.i)));
        try {
            ijc ijcVar = this.b;
            iic iicVar = ijcVar.a;
            Canvas canvas = iicVar.a;
            iicVar.a = displayListCanvasStart;
            imu imuVar = this.c;
            long jD = kjh.d(this.e);
            imt imtVar = imuVar.b;
            kio kioVarC = imtVar.c();
            kji kjiVarD = imtVar.d();
            ijb ijbVarB = imtVar.b();
            long jA = imtVar.a();
            ini iniVar2 = imtVar.a;
            imtVar.f(kioVar);
            imtVar.g(kjiVar);
            imtVar.e(iicVar);
            imtVar.h(jD);
            imtVar.a = iniVar;
            iicVar.l();
            try {
                fdapVar.invoke(imuVar);
                iicVar.j();
                imt imtVar2 = imuVar.b;
                imtVar2.f(kioVarC);
                imtVar2.g(kjiVarD);
                imtVar2.e(ijbVarB);
                imtVar2.h(jA);
                imtVar2.a = iniVar2;
                ijcVar.a.a = canvas;
            } catch (Throwable th) {
                iicVar.j();
                imt imtVar3 = imuVar.b;
                imtVar3.f(kioVarC);
                imtVar3.g(kjiVarD);
                imtVar3.e(ijbVarB);
                imtVar3.h(jA);
                imtVar3.a = iniVar2;
                throw th;
            }
        } finally {
            this.d.end(displayListCanvasStart);
        }
    }

    @Override // defpackage.inl
    public final void t(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.inl
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.s = j;
            this.d.setAmbientShadowColor(ijg.b(j));
        }
    }

    @Override // defpackage.inl
    public final void v(int i) {
        if (iis.b(this.k, i)) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(iib.b(i)));
        R();
    }

    @Override // defpackage.inl
    public final void w(float f) {
        this.x = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.inl
    public final void x(boolean z) {
        this.y = z;
        P();
    }

    @Override // defpackage.inl
    public final void y(int i) {
        this.j = i;
        R();
    }

    @Override // defpackage.inl
    public final void z(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }
}
