package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pof {
    public static Interpolator a(Context context, int i) throws Resources.NotFoundException {
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i);
        lca.b(interpolatorLoadInterpolator, "Failed to parse interpolator, no start tag found");
        return interpolatorLoadInterpolator;
    }
}
