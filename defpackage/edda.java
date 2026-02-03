package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edda extends vx {
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;

    public edda(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        int iC = recyclerView.c(view);
        rect.set(0, 0, 0, 0);
        if (this.d) {
            if (iC == 0) {
                return;
            } else {
                iC--;
            }
        }
        int i = this.b;
        int i2 = this.a;
        float f = i;
        float f2 = i2;
        int iRound = Math.round((((-1.0f) + f) * f2) / f);
        int iRound2 = Math.round(((iC % i) * f2) / f);
        int i3 = iRound - iRound2;
        if (this.c == 1) {
            int[] iArr = ley.a;
            if (recyclerView.getLayoutDirection() == 1) {
                rect.right = iRound2;
                rect.left = i3;
            } else {
                rect.left = iRound2;
                rect.right = i3;
            }
            if (iC >= i) {
                rect.top = i2;
                return;
            }
            return;
        }
        int[] iArr2 = ley.a;
        int layoutDirection = recyclerView.getLayoutDirection();
        rect.top = iRound2;
        rect.bottom = i3;
        if (iC >= i) {
            if (layoutDirection == 1) {
                rect.right = i2;
            } else {
                rect.left = i2;
            }
        }
    }
}
