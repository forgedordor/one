package defpackage;

import android.animation.Animator;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekj extends eejv {
    final /* synthetic */ ExtendedFloatingActionButton c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eekj(ExtendedFloatingActionButton extendedFloatingActionButton, eejt eejtVar) {
        super(extendedFloatingActionButton, eejtVar);
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.eejv, defpackage.eekt
    public final void f() {
        super.f();
        this.c.o = 0;
    }

    @Override // defpackage.eejv, defpackage.eekt
    public final void g(Animator animator) {
        super.g(animator);
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.o = 2;
    }

    @Override // defpackage.eekt
    public final int h() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.eekt
    public final void i() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // defpackage.eekt
    public final boolean j() {
        return this.c.u();
    }

    @Override // defpackage.eekt
    public final void k() {
    }
}
