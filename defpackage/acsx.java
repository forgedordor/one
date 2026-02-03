package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsx {
    public static final void a(View view, int i, boolean z) throws Resources.NotFoundException {
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.conversation_list_fab_margin_bottom_end);
        if (z) {
            dimensionPixelSize += i;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize;
    }
}
