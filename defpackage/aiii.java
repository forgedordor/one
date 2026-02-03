package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiii extends vx {
    private final float a;
    private final float b;
    private final int c;
    private final int d;
    private final RectF e = new RectF();
    private final float[] f = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    private final Paint g;

    public aiii(int i, float f, float f2, int i2, int i3) {
        Paint paint = new Paint(1);
        this.g = paint;
        this.a = f;
        this.b = f2;
        this.c = i2;
        this.d = i3;
        paint.setColor(i);
    }

    private static boolean c(View view, RecyclerView recyclerView) {
        boolean zD;
        boolean z;
        wv wvVarJ = recyclerView.j(view);
        boolean z2 = wvVarJ instanceof pab ? ((pab) wvVarJ).v : false;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild < recyclerView.getChildCount() - 1) {
            View childAt = recyclerView.getChildAt(iIndexOfChild + 1);
            wv wvVarJ2 = recyclerView.j(childAt);
            z = wvVarJ2 instanceof pab ? ((pab) wvVarJ2).u : true;
            zD = d(childAt);
        } else {
            zD = false;
            z = true;
        }
        return (z2 && z) || zD;
    }

    private static boolean d(View view) {
        Object tag = view.getTag(R.id.preference_category_root_tag);
        if (tag != null && (tag instanceof String)) {
            return ((String) tag).equals("preference_category_root");
        }
        return false;
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        if (c(view, recyclerView)) {
            int i = this.d;
            rect.set(i, 0, i, this.c);
        } else {
            int i2 = this.d;
            rect.set(i2, 0, i2, 0);
        }
    }

    @Override // defpackage.vx
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        vo voVar = recyclerView.n;
        if (voVar == null) {
            return;
        }
        canvas.save();
        int childCount = recyclerView.getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (i2 < childCount) {
            int i4 = i2 + 1;
            View childAt = recyclerView.getChildAt(i2);
            if (d(childAt)) {
                i3 = i4;
            } else {
                if (i2 == i3) {
                    RectF rectF = this.e;
                    rectF.top = childAt.getTop();
                    rectF.left = childAt.getLeft();
                    rectF.right = childAt.getRight();
                } else {
                    RectF rectF2 = this.e;
                    rectF2.left = Math.min(childAt.getLeft(), rectF2.left);
                    rectF2.right = Math.max(childAt.getRight(), rectF2.right);
                }
                if (c(childAt, recyclerView)) {
                    boolean z = true;
                    boolean z2 = recyclerView.c(recyclerView.getChildAt(i3)) == 0 || (i3 > 0 && d(recyclerView.getChildAt(i3 + (-1))));
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 4) {
                            break;
                        }
                        this.f[i5] = z2 ? this.a : this.b;
                        i5++;
                    }
                    int iA = voVar.a();
                    int iC = recyclerView.c(recyclerView.getChildAt(i2));
                    int i6 = iA - 1;
                    boolean z3 = i2 < recyclerView.getChildCount() + (-1) && d(recyclerView.getChildAt(i4));
                    if (iC != i6 && !z3) {
                        z = false;
                    }
                    for (i = 4; i < 8; i++) {
                        this.f[i] = z ? this.a : this.b;
                    }
                    RectF rectF3 = this.e;
                    rectF3.bottom = childAt.getBottom();
                    Path path = new Path();
                    path.addRoundRect(rectF3, this.f, Path.Direction.CW);
                    canvas.drawPath(path, this.g);
                    i3 = i4;
                }
            }
            i2 = i4;
        }
        canvas.restore();
    }
}
