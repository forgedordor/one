package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eejk extends vx {
    public int a;
    private final Drawable b;
    private int c;
    private final int d;
    private final int e;
    private boolean f;
    private final Rect g = new Rect();

    public eejk(Context context) {
        TypedArray typedArrayA = eemh.a(context, null, eejl.a, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.c = eepy.c(context, typedArrayA, 0).getDefaultColor();
        this.a = typedArrayA.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.d = typedArrayA.getDimensionPixelOffset(2, 0);
        this.e = typedArrayA.getDimensionPixelOffset(1, 0);
        this.f = typedArrayA.getBoolean(4, true);
        typedArrayA.recycle();
        this.b = new ShapeDrawable();
        c(this.c);
    }

    private final boolean e(RecyclerView recyclerView, View view) {
        int iC = recyclerView.c(view);
        vo voVar = recyclerView.n;
        return iC != -1 && (!(voVar != null && iC == voVar.a() + (-1)) || this.f);
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        rect.set(0, 0, 0, 0);
        if (e(recyclerView, view)) {
            rect.bottom = this.a;
        }
    }

    @Override // defpackage.vx
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        if (recyclerView.o == null) {
            return;
        }
        canvas.save();
        if (recyclerView.j) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean zK = eemo.k(recyclerView);
        int i = paddingLeft + (zK ? this.e : this.d);
        int i2 = width - (zK ? this.d : this.e);
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (e(recyclerView, childAt)) {
                wb wbVar = recyclerView.o;
                Rect rect = this.g;
                wbVar.aP(childAt, rect);
                int iRound = rect.bottom + Math.round(childAt.getTranslationY());
                int i4 = iRound - this.a;
                Drawable drawable = this.b;
                drawable.setBounds(i, i4, i2, iRound);
                drawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    public final void c(int i) {
        this.c = i;
        this.b.setTint(i);
    }

    public final void d() {
        this.f = false;
    }
}
