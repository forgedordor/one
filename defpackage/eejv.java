package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eejv implements eekt {
    public final ExtendedFloatingActionButton a;
    public eeci b;
    private final Context c;
    private final ArrayList d = new ArrayList();
    private final eejt e;
    private eeci f;

    public eejv(ExtendedFloatingActionButton extendedFloatingActionButton, eejt eejtVar) {
        this.a = extendedFloatingActionButton;
        this.c = extendedFloatingActionButton.getContext();
        this.e = eejtVar;
    }

    @Override // defpackage.eekt
    public AnimatorSet a() {
        return b(c());
    }

    final AnimatorSet b(eeci eeciVar) {
        ArrayList arrayList = new ArrayList();
        if (eeciVar.f("opacity")) {
            arrayList.add(eeciVar.a("opacity", this.a, View.ALPHA));
        }
        if (eeciVar.f("scale")) {
            ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
            arrayList.add(eeciVar.a("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(eeciVar.a("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (eeciVar.f("width")) {
            arrayList.add(eeciVar.a("width", this.a, ExtendedFloatingActionButton.k));
        }
        if (eeciVar.f("height")) {
            arrayList.add(eeciVar.a("height", this.a, ExtendedFloatingActionButton.l));
        }
        if (eeciVar.f("paddingStart")) {
            arrayList.add(eeciVar.a("paddingStart", this.a, ExtendedFloatingActionButton.m));
        }
        if (eeciVar.f("paddingEnd")) {
            arrayList.add(eeciVar.a("paddingEnd", this.a, ExtendedFloatingActionButton.n));
        }
        if (eeciVar.f("labelOpacity")) {
            arrayList.add(eeciVar.a("labelOpacity", this.a, new eeju(this, Float.class)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        eece.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final eeci c() {
        eeci eeciVar = this.b;
        if (eeciVar != null) {
            return eeciVar;
        }
        if (this.f == null) {
            this.f = eeci.c(this.c, h());
        }
        eeci eeciVar2 = this.f;
        lcg.i(eeciVar2);
        return eeciVar2;
    }

    @Override // defpackage.eekt
    public final List d() {
        return this.d;
    }

    @Override // defpackage.eekt
    public void e() {
        this.e.a();
    }

    @Override // defpackage.eekt
    public void f() {
        this.e.a();
    }

    @Override // defpackage.eekt
    public void g(Animator animator) {
        eejt eejtVar = this.e;
        Animator animator2 = eejtVar.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        eejtVar.a = animator;
    }
}
