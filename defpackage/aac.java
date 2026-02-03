package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aac extends aaj {
    final /* synthetic */ int a;
    final /* synthetic */ wv b;
    final /* synthetic */ aam c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aac(aam aamVar, wv wvVar, int i, float f, float f2, float f3, float f4, int i2, wv wvVar2) {
        super(wvVar, i, f, f2, f3, f4);
        this.c = aamVar;
        this.a = i2;
        this.b = wvVar2;
    }

    @Override // defpackage.aaj, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        int i = this.a;
        if (i <= 0) {
            aam aamVar = this.c;
            aamVar.j.n(this.b);
        } else {
            aam aamVar2 = this.c;
            aamVar2.a.add(this.b.a);
            this.k = true;
            aamVar2.m.post(new aad(aamVar2, this, i));
        }
        aam aamVar3 = this.c;
        wv wvVar = this.b;
        View view = aamVar3.p;
        View view2 = wvVar.a;
        if (view == view2) {
            aamVar3.l(view2);
        }
    }
}
