package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drpk extends wx {
    final /* synthetic */ drpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drpk(drpl drplVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.c = drplVar;
    }

    @Override // defpackage.lcl
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1) {
            this.c.d.b();
        }
        return super.h(viewGroup, view, accessibilityEvent);
    }
}
