package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eumu extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ float c;
    final /* synthetic */ eumy d;

    public eumu(eumy eumyVar, int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = eumyVar;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        int i2 = this.b;
        int i3 = (int) (f * (i - i2));
        eumy eumyVar = this.d;
        ViewGroup viewGroup = eumyVar.f;
        eumy.j(viewGroup, i2 + i3);
        if (eumyVar.M) {
            viewGroup.setY(this.c - viewGroup.getHeight());
            eumyVar.f();
        }
    }
}
