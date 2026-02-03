package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecrq {
    public static final /* synthetic */ int a = 0;
    private static final Rect b = new Rect();

    public static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        return configuration.smallestScreenWidthDp >= 411 ? f(context, R.dimen.survey_prompt_max_width_sw_411) : configuration.smallestScreenWidthDp >= 380 ? f(context, R.dimen.survey_prompt_max_width_sw_380) : configuration.smallestScreenWidthDp >= 320 ? f(context, R.dimen.survey_prompt_max_width_sw_320) : configuration.smallestScreenWidthDp >= 240 ? f(context, R.dimen.survey_prompt_max_width_sw_240) : f(context, R.dimen.survey_prompt_max_width);
    }

    public static int b(ViewGroup viewGroup, View view, int i, int i2, View view2, View view3, boolean z) throws Resources.NotFoundException {
        if (viewGroup == view) {
            throw new IllegalStateException("contentView should be the single child of containerViewGroup");
        }
        if (viewGroup.getChildCount() == 0) {
            return i2;
        }
        int measuredHeight = 0;
        view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight2 = view.getMeasuredHeight();
        if (z) {
            return View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
        }
        Resources resources = view.getContext().getResources();
        Rect rect = b;
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.survey_answer_min_height_for_scrolling);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.survey_card_vertical_margin);
        if (view3 != null) {
            ecsj ecsjVar = ecrz.c;
            measuredHeight = ecrz.b(fblq.a.get().a(ecrz.b)) ? view3.getMeasuredHeight() : view3.getHeight();
        }
        int height = iHeight - view2.getHeight();
        int i3 = dimensionPixelSize2 + dimensionPixelSize2 + measuredHeight;
        if (measuredHeight2 + i3 > iHeight && height - i3 > dimensionPixelSize) {
            measuredHeight2 = iHeight - i3;
        }
        return View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
    }

    public static void c(ImageView imageView, Integer num) {
        if (num == null || num.intValue() == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(num.intValue());
            imageView.setVisibility(0);
        }
    }

    public static boolean d(Context context) {
        return ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 3;
    }

    public static void e(final View view, final View view2, final int i, final int i2) {
        view.post(new Runnable() { // from class: ecrp
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = ecrq.a;
                Rect rect = new Rect();
                View view3 = view2;
                view3.getHitRect(rect);
                rect.top -= 2131168907;
                rect.left = rect.left;
                rect.right += i;
                rect.bottom += i2;
                view.setTouchDelegate(new TouchDelegate(rect, view3));
            }
        });
    }

    private static int f(Context context, int i) {
        return context.getResources().getDimensionPixelOffset(i);
    }
}
