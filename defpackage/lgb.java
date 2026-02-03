package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgb {
    public lga a;

    public lgb(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new lfz(new WindowInsetsAnimation(i, interpolator, j));
        } else {
            this.a = new lfx(i, interpolator, j);
        }
    }

    public static void d(View view, lfs lfsVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(lfsVar != null ? new lfy(lfsVar) : null);
            return;
        }
        Interpolator interpolator = lfx.a;
        View.OnApplyWindowInsetsListener lfwVar = lfsVar != null ? new lfw(view, lfsVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, lfwVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(lfwVar);
        }
    }

    public final float a() {
        return this.a.j();
    }

    public final int b() {
        return this.a.k();
    }

    public final long c() {
        return this.a.l();
    }

    public final void e(float f) {
        this.a.g(f);
    }

    public lgb(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new lfz(windowInsetsAnimation);
        }
    }
}
