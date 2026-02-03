package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhm extends vx {
    private final Drawable a;
    private final Rect b = new Rect();
    private final int c;

    public dyhm(Drawable drawable, int i) {
        this.a = drawable;
        this.c = i;
    }

    private final void c(RecyclerView recyclerView, View view, Canvas canvas, int i) {
        Rect rect = this.b;
        RecyclerView.P(view, rect);
        int iRound = rect.top + Math.round(view.getTranslationY());
        Drawable drawable = this.a;
        int intrinsicHeight = drawable.getIntrinsicHeight() + iRound;
        int[] iArr = ley.a;
        int layoutDirection = view.getLayoutDirection();
        int width = recyclerView.getWidth();
        if (layoutDirection == 1) {
            width -= i;
        }
        if (layoutDirection == 1) {
            i = 0;
        }
        drawable.setBounds(i, iRound, width, intrinsicHeight);
        drawable.draw(canvas);
    }

    private static int d(View view, RecyclerView recyclerView) {
        Object obj = recyclerView.n;
        if (obj == null) {
            return 1;
        }
        ejwl.l(obj instanceof dyhl);
        return ((dyhl) obj).G(recyclerView, view);
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        if (d(view, recyclerView) == 1) {
            return;
        }
        rect.set(0, this.a.getIntrinsicHeight(), 0, 0);
    }

    @Override // defpackage.vx
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int iD = d(childAt, recyclerView) - 1;
            if (iD == 1) {
                c(recyclerView, childAt, canvas, 0);
            } else if (iD == 2) {
                c(recyclerView, childAt, canvas, this.c);
            }
        }
    }
}
