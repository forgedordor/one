package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doup extends ViewOutlineProvider {
    final /* synthetic */ int a;
    final /* synthetic */ Rect b;
    final /* synthetic */ int c;
    final /* synthetic */ float d;

    public doup(int i, Rect rect, int i2, float f) {
        this.a = i;
        this.b = rect;
        this.c = i2;
        this.d = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        Rect rect = this.b;
        int i = rect.top - this.c;
        int width = view.getWidth();
        int i2 = this.a;
        outline.setRoundRect(-i2, i, width + i2, view.getHeight() - rect.bottom, this.d);
    }
}
