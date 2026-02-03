package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tf extends vx {
    private static final int[] b = {R.attr.listDivider};
    public Drawable a;
    private final Rect c = new Rect();

    public tf(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(b);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        Drawable drawable = this.a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // defpackage.vx
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        if (recyclerView.o == null || this.a == null) {
            return;
        }
        canvas.save();
        if (recyclerView.j) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            wb wbVar = recyclerView.o;
            Rect rect = this.c;
            wbVar.aP(childAt, rect);
            int iRound = rect.right + Math.round(childAt.getTranslationX());
            this.a.setBounds(iRound - this.a.getIntrinsicWidth(), paddingTop, iRound, height);
            this.a.draw(canvas);
        }
        canvas.restore();
    }
}
