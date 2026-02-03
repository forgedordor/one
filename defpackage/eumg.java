package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eumg extends Animation {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;
    final /* synthetic */ eumy d;

    public eumg(eumy eumyVar, float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = eumyVar;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        eumy eumyVar = this.d;
        float width = eumyVar.q() ? 0.0f : eumyVar.f.getWidth() - this.c;
        float f2 = this.a;
        eumyVar.i.setX(f2 + (f * (this.b - f2)) + width);
    }
}
