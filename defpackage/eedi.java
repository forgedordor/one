package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eedi {
    public int a;
    public int b;
    private final View c;
    private int d;

    public eedi(View view) {
        this.c = view;
    }

    final void a() {
        View view = this.c;
        int top = this.b - (view.getTop() - this.a);
        int[] iArr = ley.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(-(view.getLeft() - this.d));
    }

    final void b() {
        View view = this.c;
        this.a = view.getTop();
        this.d = view.getLeft();
    }

    public final boolean c(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        a();
        return true;
    }
}
