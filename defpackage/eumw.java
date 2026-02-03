package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eumw extends ListView {
    private final eumy a;

    public eumw(eumy eumyVar) {
        super(eumyVar.a);
        this.a = eumyVar;
        setScrollBarDefaultDelayBeforeFade(ViewConfiguration.getScrollDefaultDelay() * 3);
        setScrollIndicators(3);
    }

    @Override // android.view.View
    protected final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.r()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected final void onMeasure(int i, int i2) {
        eumy eumyVar = this.a;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(eumyVar.H.getHeight() - eumyVar.G.getHeight(), 1073741824));
    }
}
