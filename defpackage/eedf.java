package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eedf extends eedh {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public eedf() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    @Override // defpackage.eedh
    protected final void fG(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewV = v(coordinatorLayout.a(view));
        if (viewV == null) {
            coordinatorLayout.j(view, i);
            this.c = 0;
            return;
        }
        kub kubVar = (kub) view.getLayoutParams();
        Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + kubVar.leftMargin, viewV.getBottom() + kubVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - kubVar.rightMargin, ((coordinatorLayout.getHeight() + viewV.getBottom()) - coordinatorLayout.getPaddingBottom()) - kubVar.bottomMargin);
        lgt lgtVar = coordinatorLayout.f;
        if (lgtVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lgtVar.b();
            rect.right -= lgtVar.c();
        }
        Rect rect2 = this.b;
        int i2 = kubVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iX = x(viewV);
        view.layout(rect2.left, rect2.top - iX, rect2.right, rect2.bottom - iX);
        this.c = rect2.top - viewV.getBottom();
    }

    public float t(View view) {
        throw null;
    }

    public int u(View view) {
        throw null;
    }

    public abstract View v(List list);

    public final int x(View view) {
        if (this.d == 0) {
            return 0;
        }
        float fT = t(view);
        int i = this.d;
        return kzz.b((int) (fT * i), 0, i);
    }

    public boolean z() {
        return false;
    }

    public eedf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
