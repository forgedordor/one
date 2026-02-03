package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drih {
    public final Context a;
    public final int b;
    private final int c;
    private final int d;

    public drih(Context context) {
        this.a = context;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.screen_width_360);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.screen_width_411);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.screen_width_480);
    }

    public final int a() {
        return this.a.getResources().getDimensionPixelOffset(R.dimen.hats_lib_container_large_padding);
    }

    public final int b() throws Resources.NotFoundException {
        Context context = this.a;
        if (drij.a(context).x < this.b) {
            return drij.a(context).x;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.hats_lib_prompt_max_width);
        int iA = a();
        return dimensionPixelSize + iA + iA;
    }

    public final RectF c(boolean z) throws Resources.NotFoundException {
        float f;
        float f2;
        float f3;
        Context context = this.a;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.hats_lib_container_small_padding);
        int iA = a();
        if (z) {
            f2 = dimensionPixelOffset;
            f = 0.0f;
            f3 = 0.0f;
        } else {
            int i = drij.a(context).x;
            f = i >= this.c ? dimensionPixelOffset : 0.0f;
            f = f;
            if (i >= this.d) {
                f = iA;
                f2 = f;
                f3 = f;
                f = f;
            } else {
                f2 = f;
                f3 = f;
                f = f;
            }
        }
        return new RectF(f, f2, f, f3);
    }
}
