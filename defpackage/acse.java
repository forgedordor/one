package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acse extends vx {
    private final int a;
    private final RectF b = new RectF();
    private final float[] c;
    private final boolean d;
    private final float e;
    private final float f;

    public acse(int i, float f, boolean z, float f2, float f3) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.c = fArr;
        this.a = i;
        this.d = z;
        this.e = f2;
        this.f = f3;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        if (this.d) {
            rect.left = Math.round(this.e);
            rect.top = 0;
            rect.right = Math.round(this.f);
            rect.bottom = 0;
        }
    }

    @Override // defpackage.vx
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        canvas.save();
        RectF rectF = this.b;
        rectF.top = 0.0f;
        rectF.bottom = recyclerView.getHeight();
        if (this.d) {
            rectF.left = this.e;
            rectF.right = recyclerView.getWidth() - this.f;
        } else {
            rectF.left = 0.0f;
            rectF.right = recyclerView.getWidth();
        }
        Path path = new Path();
        path.addRoundRect(rectF, this.c, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        canvas.drawColor(this.a);
        canvas.restore();
    }
}
