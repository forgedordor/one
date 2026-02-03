package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class job implements jmk {
    private ikb c;
    private final RenderNode a = new RenderNode("Compose");
    private int b = 0;
    private int d = 3;

    private final ikb O() {
        ikb ikbVar = this.c;
        if (ikbVar != null) {
            return ikbVar;
        }
        iii iiiVar = new iii();
        this.c = iiiVar;
        return iiiVar;
    }

    private final void P(RenderNode renderNode, int i) {
        if (ijk.b(i, 1)) {
            ikb ikbVar = this.c;
            renderNode.setUseCompositingLayer(true, ikbVar != null ? ((iii) ikbVar).a : null);
            renderNode.setHasOverlappingRendering(true);
        } else if (ijk.b(i, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void Q() {
        int i = this.b;
        if (ijk.b(i, 1) || !iis.b(this.d, 3)) {
            P(this.a, 1);
        } else {
            P(this.a, i);
        }
    }

    @Override // defpackage.jmk
    public final void A(float f) {
        this.a.setRotationX(f);
    }

    @Override // defpackage.jmk
    public final void B(float f) {
        this.a.setRotationY(f);
    }

    @Override // defpackage.jmk
    public final void C(float f) {
        this.a.setRotationZ(f);
    }

    @Override // defpackage.jmk
    public final void D(float f) {
        this.a.setScaleX(f);
    }

    @Override // defpackage.jmk
    public final void E(float f) {
        this.a.setScaleY(f);
    }

    @Override // defpackage.jmk
    public final void F(int i) {
        this.a.setSpotShadowColor(i);
    }

    @Override // defpackage.jmk
    public final void G(float f) {
        this.a.setTranslationX(f);
    }

    @Override // defpackage.jmk
    public final void H(float f) {
        this.a.setTranslationY(f);
    }

    @Override // defpackage.jmk
    public final boolean I() {
        return this.a.getClipToBounds();
    }

    @Override // defpackage.jmk
    public final boolean J() {
        return this.a.getClipToOutline();
    }

    @Override // defpackage.jmk
    public final boolean K() {
        return this.a.hasDisplayList();
    }

    @Override // defpackage.jmk
    public final boolean L(int i, int i2, int i3, int i4) {
        return this.a.setPosition(i, i2, i3, i4);
    }

    @Override // defpackage.jmk
    public final void M() {
        this.a.setHasOverlappingRendering(true);
    }

    @Override // defpackage.jmk
    public final void N() {
        O().l(null);
        Q();
    }

    @Override // defpackage.jmk
    public final float a() {
        return this.a.getAlpha();
    }

    @Override // defpackage.jmk
    public final float b() {
        return this.a.getElevation();
    }

    @Override // defpackage.jmk
    public final int c() {
        return this.a.getBottom();
    }

    @Override // defpackage.jmk
    public final int d() {
        return this.a.getHeight();
    }

    @Override // defpackage.jmk
    public final int e() {
        return this.a.getLeft();
    }

    @Override // defpackage.jmk
    public final int f() {
        return this.a.getRight();
    }

    @Override // defpackage.jmk
    public final int g() {
        return this.a.getTop();
    }

    @Override // defpackage.jmk
    public final int h() {
        return this.a.getWidth();
    }

    @Override // defpackage.jmk
    public final void i() {
        this.a.discardDisplayList();
    }

    @Override // defpackage.jmk
    public final void j(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // defpackage.jmk
    public final void k(Matrix matrix) {
        this.a.getMatrix(matrix);
    }

    @Override // defpackage.jmk
    public final void l(int i) {
        this.a.offsetLeftAndRight(i);
    }

    @Override // defpackage.jmk
    public final void m(int i) {
        this.a.offsetTopAndBottom(i);
    }

    @Override // defpackage.jmk
    public final void n(ijc ijcVar, ikd ikdVar, fdap fdapVar) {
        RenderNode renderNode = this.a;
        iic iicVar = ijcVar.a;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        Canvas canvas = iicVar.a;
        iicVar.a = recordingCanvasBeginRecording;
        if (ikdVar != null) {
            iicVar.l();
            iicVar.r(ikdVar);
        }
        fdapVar.invoke(iicVar);
        if (ikdVar != null) {
            iicVar.j();
        }
        iicVar.a = canvas;
        renderNode.endRecording();
    }

    @Override // defpackage.jmk
    public final void o(float f) {
        this.a.setAlpha(f);
    }

    @Override // defpackage.jmk
    public final void p(int i) {
        this.a.setAmbientShadowColor(i);
    }

    @Override // defpackage.jmk
    public final void q(int i) {
        this.d = i;
        O().j(i);
        Q();
    }

    @Override // defpackage.jmk
    public final void r(float f) {
        this.a.setCameraDistance(f);
    }

    @Override // defpackage.jmk
    public final void s(boolean z) {
        this.a.setClipToBounds(z);
    }

    @Override // defpackage.jmk
    public final void t(boolean z) {
        this.a.setClipToOutline(z);
    }

    @Override // defpackage.jmk
    public final void u(int i) {
        this.b = i;
        Q();
    }

    @Override // defpackage.jmk
    public final void v(float f) {
        this.a.setElevation(f);
    }

    @Override // defpackage.jmk
    public final void w(Outline outline) {
        this.a.setOutline(outline);
    }

    @Override // defpackage.jmk
    public final void x(float f) {
        this.a.setPivotX(f);
    }

    @Override // defpackage.jmk
    public final void y(float f) {
        this.a.setPivotY(f);
    }

    @Override // defpackage.jmk
    public final void z(ikk ikkVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.a.setRenderEffect(ikkVar != null ? ikkVar.b() : null);
        }
    }
}
