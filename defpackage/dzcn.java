package defpackage;

import android.util.Property;
import android.view.ViewTreeObserver;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzcn implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ExpandableDialogView a;

    public dzcn(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ExpandableDialogView expandableDialogView = this.a;
        expandableDialogView.getViewTreeObserver().removeOnPreDrawListener(this);
        Property property = dzdb.ag;
        int[] iArr = ley.a;
        expandableDialogView.setPivotX(expandableDialogView.getLayoutDirection() == 1 ? expandableDialogView.a.left : expandableDialogView.a.right);
        expandableDialogView.setPivotY(expandableDialogView.a.top);
        return true;
    }
}
