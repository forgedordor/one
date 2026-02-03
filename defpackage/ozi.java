package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozi extends vx {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ ozm d;

    public ozi(ozm ozmVar) {
        this.d = ozmVar;
    }

    private final boolean c(View view, RecyclerView recyclerView) {
        wv wvVarJ = recyclerView.j(view);
        if (!(wvVarJ instanceof pab) || !((pab) wvVarJ).v) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        wv wvVarJ2 = recyclerView.j(recyclerView.getChildAt(iIndexOfChild + 1));
        return (wvVarJ2 instanceof pab) && ((pab) wvVarJ2).u;
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        if (c(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.vx
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (c(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }
}
