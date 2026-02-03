package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkq implements jou {
    private final ViewConfiguration a;

    public jkq(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.jou
    public final float a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }

    @Override // defpackage.jou
    public final float b() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // defpackage.jou
    public final float c() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.jou
    public final float d() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.jou
    public final long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.jou
    public final long f() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.jou
    public final /* synthetic */ long g() {
        return kis.a(48.0f, 48.0f);
    }

    @Override // defpackage.jou
    public final void h() {
    }
}
