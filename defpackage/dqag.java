package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqag extends vx {
    private final int a;
    private final int b;

    public dqag() {
        this(0, 3, null);
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        rect.getClass();
        view.getClass();
        wsVar.getClass();
        super.a(rect, view, recyclerView, wsVar);
        if (dphw.g(view)) {
            rect.left = this.a;
        } else {
            rect.right = this.a;
        }
        rect.bottom = this.b;
    }

    public dqag(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dqag(int i, int i2, byte[] bArr) {
        i = 1 == (i2 & 1) ? 0 : i;
        this(i, i);
    }
}
