package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeow extends eeok {
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final boolean s;

    public eeow(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayA = eemh.a(context, attributeSet, eept.b, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        this.o = typedArrayA.getInt(0, 0);
        int iA = eepy.a(context, typedArrayA, 4, dimensionPixelSize);
        int i = this.a;
        this.p = Math.max(iA, i + i);
        this.q = eepy.a(context, typedArrayA, 3, dimensionPixelSize2);
        this.r = typedArrayA.getInt(2, 0);
        this.s = typedArrayA.getBoolean(1, true);
        typedArrayA.recycle();
        b();
    }
}
