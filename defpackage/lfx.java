package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lfx extends lga {
    public static final Interpolator a = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Interpolator b = new luc();
    public static final Interpolator c = new DecelerateInterpolator(1.5f);
    public static final Interpolator d = new AccelerateInterpolator(1.5f);

    public lfx(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    static lfs b(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof lfw) {
            return ((lfw) tag).a;
        }
        return null;
    }

    static void c(View view, lgb lgbVar) {
        lfs lfsVarB = b(view);
        if (lfsVarB != null) {
            lfsVarB.d(lgbVar);
            if (lfsVarB.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                c(viewGroup.getChildAt(i), lgbVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void d(View view, lgb lgbVar, lgt lgtVar, boolean z) {
        lfs lfsVarB = b(view);
        boolean z2 = z;
        if (lfsVarB != null) {
            lfsVarB.b = lgtVar;
            z2 = z;
            if (!z) {
                lfsVarB.e();
                z2 = lfsVarB.c ^ 1;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), lgbVar, lgtVar, true == z2);
            }
        }
    }

    static void e(View view, lgt lgtVar, List list) {
        lfs lfsVarB = b(view);
        if (lfsVarB != null) {
            lgtVar = lfsVarB.c(lgtVar, list);
            if (lfsVarB.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), lgtVar, list);
            }
        }
    }

    static void f(View view, lgb lgbVar, lfr lfrVar) {
        lfs lfsVarB = b(view);
        if (lfsVarB != null) {
            lfsVarB.b(lgbVar, lfrVar);
            if (lfsVarB.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), lgbVar, lfrVar);
            }
        }
    }
}
