package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eumb implements View.OnLayoutChangeListener {
    final /* synthetic */ eumz a;
    private final Rect b = new Rect();
    private final Rect c = new Rect();

    public eumb(eumz eumzVar) {
        this.a = eumzVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Resources.NotFoundException {
        Rect rect = this.b;
        rect.set(i, i2, i3, i4);
        Rect rect2 = this.c;
        rect2.set(i5, i6, i7, i8);
        eumz eumzVar = this.a;
        if (!eumzVar.a.s() || rect.width() == rect2.width()) {
            return;
        }
        eumzVar.d = true;
        eumzVar.g();
    }
}
