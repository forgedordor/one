package defpackage;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpt extends jbi implements jbp {
    private final dkh a;
    private final dmc b;
    private RenderNode c;

    public dpt(jbf jbfVar, dkh dkhVar, dmc dmcVar) {
        this.a = dkhVar;
        this.b = dmcVar;
        N(jbfVar);
    }

    private final RenderNode a() {
        RenderNode renderNode = this.c;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.c = renderNode2;
        return renderNode2;
    }

    private static final boolean e(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private static final boolean f(EdgeEffect edgeEffect, Canvas canvas) {
        return e(180.0f, edgeEffect, canvas);
    }

    private static final boolean g(EdgeEffect edgeEffect, Canvas canvas) {
        return e(270.0f, edgeEffect, canvas);
    }

    private static final boolean h(EdgeEffect edgeEffect, Canvas canvas) {
        return e(90.0f, edgeEffect, canvas);
    }

    private static final boolean i(EdgeEffect edgeEffect, Canvas canvas) {
        return e(0.0f, edgeEffect, canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0193 A[PHI: r15
      0x0193: PHI (r15v2 boolean) = (r15v1 boolean), (r15v12 boolean) binds: [B:77:0x0161, B:85:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.jbp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.imw r22) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpt.r(imw):void");
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }
}
