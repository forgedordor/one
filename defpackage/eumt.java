package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eumt extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ eumy e;

    public eumt(eumy eumyVar, int i, int i2, float f, float f2) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = eumyVar;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        int i2 = this.b;
        eumy eumyVar = this.e;
        ViewGroup viewGroup = eumyVar.f;
        eumy.m(viewGroup, ((int) (f * (i - i2))) + i2);
        if (eumyVar.q()) {
            viewGroup.setX(this.c);
            eumyVar.g.setX(0.0f);
            eumyVar.h.setX(0.0f);
        } else {
            viewGroup.setX(this.d - viewGroup.getWidth());
            eumyVar.g.setX(viewGroup.getWidth() - i);
            eumyVar.h.setX(viewGroup.getWidth() - i2);
        }
    }
}
