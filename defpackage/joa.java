package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class joa implements jmk {
    private static boolean a = true;
    private final AndroidComposeView b;
    private final RenderNode c;
    private int d;
    private ikb e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;

    public joa(AndroidComposeView androidComposeView) {
        this.b = androidComposeView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.c = renderNodeCreate;
        this.d = 0;
        if (a) {
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
            Q();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            a = false;
        }
        this.k = 3;
    }

    private final ikb O() {
        ikb ikbVar = this.e;
        if (ikbVar != null) {
            return ikbVar;
        }
        iii iiiVar = new iii();
        this.e = iiiVar;
        return iiiVar;
    }

    private final void P(RenderNode renderNode, int i) {
        if (ijk.b(i, 1)) {
            renderNode.setLayerType(2);
            ikb ikbVar = this.e;
            renderNode.setLayerPaint(ikbVar != null ? ((iii) ikbVar).a : null);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        if (ijk.b(i, 2)) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void Q() {
        this.c.discardDisplayList();
    }

    private final void R() {
        int i = this.d;
        if (ijk.b(i, 1) || !iis.b(this.k, 3)) {
            P(this.c, 1);
        } else {
            P(this.c, i);
        }
    }

    @Override // defpackage.jmk
    public final void A(float f) {
        this.c.setRotationX(f);
    }

    @Override // defpackage.jmk
    public final void B(float f) {
        this.c.setRotationY(f);
    }

    @Override // defpackage.jmk
    public final void C(float f) {
        this.c.setRotation(f);
    }

    @Override // defpackage.jmk
    public final void D(float f) {
        this.c.setScaleX(f);
    }

    @Override // defpackage.jmk
    public final void E(float f) {
        this.c.setScaleY(f);
    }

    @Override // defpackage.jmk
    public final void F(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.c.setSpotShadowColor(i);
        }
    }

    @Override // defpackage.jmk
    public final void G(float f) {
        this.c.setTranslationX(f);
    }

    @Override // defpackage.jmk
    public final void H(float f) {
        this.c.setTranslationY(f);
    }

    @Override // defpackage.jmk
    public final boolean I() {
        return this.j;
    }

    @Override // defpackage.jmk
    public final boolean J() {
        return this.c.getClipToOutline();
    }

    @Override // defpackage.jmk
    public final boolean K() {
        return this.c.isValid();
    }

    @Override // defpackage.jmk
    public final boolean L(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        return this.c.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.jmk
    public final void M() {
        this.c.setHasOverlappingRendering(true);
    }

    @Override // defpackage.jmk
    public final void N() {
        O().l(null);
        R();
    }

    @Override // defpackage.jmk
    public final float a() {
        return this.c.getAlpha();
    }

    @Override // defpackage.jmk
    public final float b() {
        return this.c.getElevation();
    }

    @Override // defpackage.jmk
    public final int c() {
        return this.i;
    }

    @Override // defpackage.jmk
    public final int d() {
        return this.i - this.g;
    }

    @Override // defpackage.jmk
    public final int e() {
        return this.f;
    }

    @Override // defpackage.jmk
    public final int f() {
        return this.h;
    }

    @Override // defpackage.jmk
    public final int g() {
        return this.g;
    }

    @Override // defpackage.jmk
    public final int h() {
        return this.h - this.f;
    }

    @Override // defpackage.jmk
    public final void i() {
        Q();
    }

    @Override // defpackage.jmk
    public final void j(Canvas canvas) {
        canvas.getClass();
        ((DisplayListCanvas) canvas).drawRenderNode(this.c);
    }

    @Override // defpackage.jmk
    public final void k(Matrix matrix) {
        this.c.getMatrix(matrix);
    }

    @Override // defpackage.jmk
    public final void l(int i) {
        this.f += i;
        this.h += i;
        this.c.offsetLeftAndRight(i);
    }

    @Override // defpackage.jmk
    public final void m(int i) {
        this.g += i;
        this.i += i;
        this.c.offsetTopAndBottom(i);
    }

    @Override // defpackage.jmk
    public final void n(ijc ijcVar, ikd ikdVar, fdap fdapVar) {
        RenderNode renderNode = this.c;
        DisplayListCanvas displayListCanvasStart = renderNode.start(h(), d());
        iic iicVar = ijcVar.a;
        Canvas canvas = iicVar.a;
        iicVar.a = displayListCanvasStart;
        if (ikdVar != null) {
            iicVar.l();
            iicVar.r(ikdVar);
        }
        fdapVar.invoke(iicVar);
        if (ikdVar != null) {
            iicVar.j();
        }
        iicVar.a = canvas;
        renderNode.end(displayListCanvasStart);
    }

    @Override // defpackage.jmk
    public final void o(float f) {
        this.c.setAlpha(f);
    }

    @Override // defpackage.jmk
    public final void p(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.c.setAmbientShadowColor(i);
        }
    }

    @Override // defpackage.jmk
    public final void q(int i) {
        this.k = i;
        O().j(i);
        R();
    }

    @Override // defpackage.jmk
    public final void r(float f) {
        this.c.setCameraDistance(-f);
    }

    @Override // defpackage.jmk
    public final void s(boolean z) {
        this.j = z;
        this.c.setClipToBounds(z);
    }

    @Override // defpackage.jmk
    public final void t(boolean z) {
        this.c.setClipToOutline(z);
    }

    @Override // defpackage.jmk
    public final void u(int i) {
        this.d = i;
        R();
    }

    @Override // defpackage.jmk
    public final void v(float f) {
        this.c.setElevation(f);
    }

    @Override // defpackage.jmk
    public final void w(Outline outline) {
        this.c.setOutline(outline);
    }

    @Override // defpackage.jmk
    public final void x(float f) {
        this.c.setPivotX(f);
    }

    @Override // defpackage.jmk
    public final void y(float f) {
        this.c.setPivotY(f);
    }

    @Override // defpackage.jmk
    public final void z(ikk ikkVar) {
    }
}
