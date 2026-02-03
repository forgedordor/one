package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dybz extends vx {
    private final Drawable a;
    private final Rect b = new Rect();
    private final View c;

    public dybz(View view, Drawable drawable) {
        this.c = view;
        this.a = drawable;
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        super.a(rect, view, recyclerView, wsVar);
        if (recyclerView.getChildAt(0) == view) {
            rect.set(0, this.a.getIntrinsicHeight(), 0, 0);
        }
    }

    @Override // defpackage.vx
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        View childAt = recyclerView.getChildAt(0);
        Rect rect = this.b;
        RecyclerView.P(childAt, rect);
        int iRound = rect.top + Math.round(childAt.getTranslationY());
        Drawable drawable = this.a;
        int intrinsicHeight = drawable.getIntrinsicHeight() + iRound;
        View view = this.c;
        int[] iArr = ley.a;
        if (view.getLayoutDirection() == 1) {
            drawable.setBounds(0, iRound, recyclerView.getWidth(), intrinsicHeight);
        } else {
            drawable.setBounds(0, iRound, recyclerView.getWidth(), intrinsicHeight);
        }
        drawable.draw(canvas);
    }
}
