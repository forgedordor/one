package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rd extends PopupWindow {
    public rd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        yx yxVarL = yx.l(context, attributeSet, kt.u, i, 0);
        if (yxVarL.q(2)) {
            setOverlapAnchor(yxVarL.p(2, false));
        }
        setBackgroundDrawable(yxVarL.h(0));
        yxVarL.o();
    }
}
