package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtkt implements Interpolator {
    final /* synthetic */ Interpolator a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;

    public dtkt(Interpolator interpolator, float f, float f2) {
        this.a = interpolator;
        this.b = f;
        this.c = f2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.b;
        return dtlq.b((this.a.getInterpolation(f) * f2) / (f2 - this.c));
    }
}
