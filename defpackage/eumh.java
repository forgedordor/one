package defpackage;

import android.content.Context;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eumh extends LinearLayout {
    final /* synthetic */ eumy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eumh(eumy eumyVar, Context context) {
        super(context);
        this.a = eumyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a.r();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        Size size;
        eumy eumyVar = this.a;
        if (eumyVar.r() && (size = eumyVar.I) != null) {
            i = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
