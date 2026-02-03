package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ljl implements Interpolator {
    final /* synthetic */ ljn a;

    public ljl(ljn ljnVar) {
        this.a = ljnVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.b.getInterpolation(f);
    }
}
