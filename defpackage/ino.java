package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ino implements inl {
    private final ijc a;
    private final imu b;
    private final RenderNode c;
    private long d;
    private Paint e;
    private Matrix f;
    private boolean g;
    private float h;
    private int i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private long o;
    private long p;
    private float q;
    private float r;
    private float s;
    private float t;
    private boolean u;
    private boolean v;
    private boolean w;
    private ikk x;
    private int y;

    public ino(ijc ijcVar, imu imuVar) {
        this.a = ijcVar;
        this.b = imuVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.c = renderNode;
        this.d = 0L;
        renderNode.setClipToBounds(false);
        Q(renderNode, 0);
        this.h = 1.0f;
        this.i = 3;
        this.j = 1.0f;
        this.k = 1.0f;
        long j = ije.a;
        this.o = j;
        this.p = j;
        this.t = 8.0f;
        this.y = 0;
    }

    private final Paint O() {
        Paint paint = this.e;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.e = paint2;
        return paint2;
    }

    private final void P() {
        boolean z = this.u;
        boolean z2 = z && !this.g;
        boolean z3 = z && this.g;
        if (z2 != this.v) {
            this.v = z2;
            this.c.setClipToBounds(z2);
        }
        if (z3 != this.w) {
            this.w = z3;
            this.c.setClipToOutline(z3);
        }
    }

    private final void Q(RenderNode renderNode, int i) {
        if (inf.a(i, 1)) {
            renderNode.setUseCompositingLayer(true, this.e);
            renderNode.setHasOverlappingRendering(true);
        } else if (inf.a(i, 2)) {
            renderNode.setUseCompositingLayer(false, this.e);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.e);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void R() {
        int i = this.y;
        if (!inf.a(i, 1) && iis.b(this.i, 3) && this.x == null) {
            Q(this.c, i);
        } else {
            Q(this.c, 1);
        }
    }

    @Override // defpackage.inl
    public final void A(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.c.resetPivot();
            return;
        }
        RenderNode renderNode = this.c;
        renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        renderNode.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // defpackage.inl
    public final void B(int i, int i2, long j) {
        this.c.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.d = kjh.d(j);
    }

    @Override // defpackage.inl
    public final void C(ikk ikkVar) {
        this.x = ikkVar;
        if (Build.VERSION.SDK_INT >= 31) {
            this.c.setRenderEffect(ikkVar != null ? ikkVar.b() : null);
        }
    }

    @Override // defpackage.inl
    public final void D(float f) {
        this.q = f;
        this.c.setRotationX(f);
    }

    @Override // defpackage.inl
    public final void E(float f) {
        this.r = f;
        this.c.setRotationY(f);
    }

    @Override // defpackage.inl
    public final void F(float f) {
        this.s = f;
        this.c.setRotationZ(f);
    }

    @Override // defpackage.inl
    public final void G(float f) {
        this.j = f;
        this.c.setScaleX(f);
    }

    @Override // defpackage.inl
    public final void H(float f) {
        this.k = f;
        this.c.setScaleY(f);
    }

    @Override // defpackage.inl
    public final void I(float f) {
        this.n = f;
        this.c.setElevation(f);
    }

    @Override // defpackage.inl
    public final void J(long j) {
        this.p = j;
        this.c.setSpotShadowColor(ijg.b(j));
    }

    @Override // defpackage.inl
    public final void K(float f) {
        this.l = f;
        this.c.setTranslationX(f);
    }

    @Override // defpackage.inl
    public final void L(float f) {
        this.m = f;
        this.c.setTranslationY(f);
    }

    @Override // defpackage.inl
    public final boolean M() {
        return this.c.hasDisplayList();
    }

    @Override // defpackage.inl
    public final void N() {
        O().setColorFilter(null);
        R();
    }

    @Override // defpackage.inl
    public final float a() {
        return this.h;
    }

    @Override // defpackage.inl
    public final float b() {
        return this.t;
    }

    @Override // defpackage.inl
    public final float c() {
        return this.q;
    }

    @Override // defpackage.inl
    public final float d() {
        return this.r;
    }

    @Override // defpackage.inl
    public final float e() {
        return this.s;
    }

    @Override // defpackage.inl
    public final float f() {
        return this.j;
    }

    @Override // defpackage.inl
    public final float g() {
        return this.k;
    }

    @Override // defpackage.inl
    public final float h() {
        return this.n;
    }

    @Override // defpackage.inl
    public final float i() {
        return this.l;
    }

    @Override // defpackage.inl
    public final float j() {
        return this.m;
    }

    @Override // defpackage.inl
    public final int k() {
        return this.i;
    }

    @Override // defpackage.inl
    public final int l() {
        return this.y;
    }

    @Override // defpackage.inl
    public final long m() {
        return this.o;
    }

    @Override // defpackage.inl
    public final long n() {
        return this.p;
    }

    @Override // defpackage.inl
    public final Matrix o() {
        Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        this.c.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.inl
    public final ikk p() {
        return this.x;
    }

    @Override // defpackage.inl
    public final void q() {
        this.c.discardDisplayList();
    }

    @Override // defpackage.inl
    public final void r(ijb ijbVar) {
        iid.a(ijbVar).drawRenderNode(this.c);
    }

    @Override // defpackage.inl
    public final void s(kio kioVar, kji kjiVar, ini iniVar, fdap fdapVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.c.beginRecording();
        try {
            iic iicVar = this.a.a;
            Canvas canvas = iicVar.a;
            iicVar.a = recordingCanvasBeginRecording;
            imu imuVar = this.b;
            imt imtVar = imuVar.b;
            imtVar.f(kioVar);
            imtVar.g(kjiVar);
            imtVar.a = iniVar;
            imtVar.h(this.d);
            imtVar.e(iicVar);
            fdapVar.invoke(imuVar);
            iicVar.a = canvas;
        } finally {
            this.c.endRecording();
        }
    }

    @Override // defpackage.inl
    public final void t(float f) {
        this.h = f;
        this.c.setAlpha(f);
    }

    @Override // defpackage.inl
    public final void u(long j) {
        this.o = j;
        this.c.setAmbientShadowColor(ijg.b(j));
    }

    @Override // defpackage.inl
    public final void v(int i) {
        this.i = i;
        O().setBlendMode(iib.a(i));
        R();
    }

    @Override // defpackage.inl
    public final void w(float f) {
        this.t = f;
        this.c.setCameraDistance(f);
    }

    @Override // defpackage.inl
    public final void x(boolean z) {
        this.u = z;
        P();
    }

    @Override // defpackage.inl
    public final void y(int i) {
        this.y = i;
        R();
    }

    @Override // defpackage.inl
    public final void z(Outline outline, long j) {
        this.c.setOutline(outline);
        this.g = outline != null;
        P();
    }
}
