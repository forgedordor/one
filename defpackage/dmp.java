package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmp extends EdgeEffect {
    public final float a;
    public float b;

    public dmp(Context context) {
        super(context);
        this.a = kin.d(kii.a(context), 1.0f);
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = 0.0f;
        super.onPull(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.b = 0.0f;
        super.onPull(f, f2);
    }
}
