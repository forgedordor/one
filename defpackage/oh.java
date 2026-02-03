package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oh extends FrameLayout implements nc {
    final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public oh(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.nc
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.nc
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
