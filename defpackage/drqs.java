package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drqs extends wx {
    final /* synthetic */ drqt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drqs(drqt drqtVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.c = drqtVar;
    }

    @Override // defpackage.lcl
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        drrs drrsVar;
        if (accessibilityEvent.getEventType() == 1 && (drrsVar = this.c.s) != null) {
            drrsVar.b();
        }
        return super.h(viewGroup, view, accessibilityEvent);
    }
}
