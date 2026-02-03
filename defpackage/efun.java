package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efun {
    public static void a(View view) {
        int paddingEnd;
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        efsj efsjVarH = efsj.h(context);
        efsh efshVar = efsh.CONFIG_LAYOUT_MARGIN_START;
        boolean zT = efsjVarH.t(efshVar);
        efsj efsjVarH2 = efsj.h(context);
        efsh efshVar2 = efsh.CONFIG_LAYOUT_MARGIN_END;
        boolean zT2 = efsjVarH2.t(efshVar2);
        if (efuo.c(view)) {
            if (!zT) {
                if (!zT2) {
                    return;
                } else {
                    zT2 = true;
                }
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sudMarginStart, R.attr.sudMarginEnd});
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            int iA = zT ? ((int) efsj.h(context).a(context, efshVar)) - dimensionPixelSize : view.getPaddingStart();
            if (zT2) {
                paddingEnd = ((int) efsj.h(context).a(context, efshVar2)) - dimensionPixelSize2;
                if (view.getId() == R.id.sud_layout_content) {
                    paddingEnd = ((int) efsj.h(context).a(context, efshVar)) - dimensionPixelSize2;
                }
            } else {
                paddingEnd = view.getPaddingEnd();
                if (view.getId() == R.id.sud_layout_content) {
                    paddingEnd = view.getPaddingStart();
                }
            }
            if (iA == view.getPaddingStart() && paddingEnd == view.getPaddingEnd()) {
                return;
            }
            if (view.getId() != R.id.sud_layout_content) {
                view.setPadding(iA, view.getPaddingTop(), paddingEnd, view.getPaddingBottom());
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(layoutParams);
            marginLayoutParams.setMargins(iA, marginLayoutParams.topMargin, paddingEnd, marginLayoutParams.bottomMargin);
        }
    }
}
