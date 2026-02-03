package defpackage;

import android.content.Context;
import android.view.animation.AlphaAnimation;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cpaw extends AlphaAnimation {
    private final Context a;

    public cpaw(Context context, float f, float f2) {
        super(f, f2);
        this.a = context;
    }

    @Override // android.view.animation.Animation
    public final void setDuration(long j) {
        super.setDuration(cpax.a(this.a, j));
    }
}
