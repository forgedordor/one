package defpackage;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lfz extends lga {
    private final WindowInsetsAnimation a;

    public lfz(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.lga
    public final void g(float f) {
        this.a.setFraction(f);
    }

    @Override // defpackage.lga
    public final float h() {
        return this.a.getAlpha();
    }

    @Override // defpackage.lga
    public final float i() {
        return this.a.getFraction();
    }

    @Override // defpackage.lga
    public final float j() {
        return this.a.getInterpolatedFraction();
    }

    @Override // defpackage.lga
    public final int k() {
        return this.a.getTypeMask();
    }

    @Override // defpackage.lga
    public final long l() {
        return this.a.getDurationMillis();
    }

    @Override // defpackage.lga
    public final Interpolator m() {
        return this.a.getInterpolator();
    }
}
