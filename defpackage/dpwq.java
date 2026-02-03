package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dpwq {
    static final /* synthetic */ fdeh[] a;
    public static final ekrg b;
    public final dpvi c;
    public final dpux d;
    public final boolean e;
    public dpvh f;
    public dpxo g;
    public final dpvz h;
    public final dngn j;
    private final fr k;
    private final dpir l;
    private boolean m;
    public final View.OnLayoutChangeListener i = new View.OnLayoutChangeListener() { // from class: dpwh
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            dpwq dpwqVar = this.a;
            if (dpwqVar.d.g && dpwqVar.b() == 0) {
                return;
            }
            dpwqVar.j(fddu.f(i4 - i2, ((Number) dpwqVar.j.a()).intValue()));
        }
    };
    private final fdcz n = new dpwp(0, this);

    static {
        fdbv fdbvVar = new fdbv(dpwq.class, "visibleHeight", "getVisibleHeight()I", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
        b = ekrg.c("com/google/android/libraries/compose/ui/rendering/renderer/Renderer");
    }

    public dpwq(final Context context, dpvi dpviVar, fr frVar, dpux dpuxVar, dpir dpirVar, boolean z) {
        this.c = dpviVar;
        this.k = frVar;
        this.d = dpuxVar;
        this.l = dpirVar;
        this.e = z;
        this.h = new dpvz(dpuxVar, new dpwl(this), new dpwm(this), dpwo.a);
        this.j = new dngn(new dpwn(context), new fdap() { // from class: dpwi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.minimum_rendering_height));
            }
        });
    }

    public static /* synthetic */ void m(dpwq dpwqVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = dpwqVar.l.d();
        }
        dpwqVar.k(i, fddu.f(dpwqVar.d.a() - i, 0));
    }

    public final int a() {
        return fddu.f(this.l.c(), ((Number) this.j.a()).intValue());
    }

    public final int b() {
        return ((Number) this.n.c(a[0])).intValue();
    }

    public final dpwu c() {
        ea eaVarG = this.k.g(this.d.c.getId());
        if (eaVarG instanceof dpwu) {
            return (dpwu) eaVarG;
        }
        return null;
    }

    public final dpxo d(dpxe dpxeVar) {
        dpxeVar.getClass();
        dpwu dpwuVarC = c();
        if (dpwuVarC != null) {
            return (dpxo) dpwuVarC.I().h(dpxeVar.name());
        }
        return null;
    }

    public void e() {
        j(0);
        f();
    }

    public final void f() {
        final dpwu dpwuVarC = c();
        if (dpwuVarC != null) {
            dpuy.a(this.d, this.k, true, new fdap() { // from class: dpwg
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    gg ggVar = (gg) obj;
                    ekrg ekrgVar = dpwq.b;
                    ggVar.getClass();
                    ggVar.l(dpwuVarC);
                    return fctx.a;
                }
            });
        }
        if (this.d.h) {
            this.h.b();
        }
    }

    public final void g(final dpxo dpxoVar) {
        this.g = null;
        dpwu dpwuVarC = c();
        if (dpwuVarC != null) {
            dpux dpuxVar = this.d;
            fr frVarI = dpwuVarC.I();
            frVarI.getClass();
            dpuy.a(dpuxVar, frVarI, true, new fdap() { // from class: dpwr
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    gg ggVar = (gg) obj;
                    ggVar.getClass();
                    ggVar.l(dpxoVar);
                    return fctx.a;
                }
            });
        }
    }

    public final void h() {
        fr frVar = this.k;
        if (frVar.ag()) {
            return;
        }
        final dpwu dpwuVarC = c();
        dpux dpuxVar = this.d;
        final int id = dpuxVar.c.getId();
        if (dpwuVarC == null || !dpwuVarC.aF()) {
            if (this.m) {
                return;
            }
            dpuy.a(dpuxVar, frVar, false, new fdap() { // from class: dpwa
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    gg ggVar = (gg) obj;
                    ekrg ekrgVar = dpwq.b;
                    ggVar.getClass();
                    ggVar.s(id, new dpwu());
                    return fctx.a;
                }
            });
            this.m = true;
            return;
        }
        if (dpwuVarC.aJ()) {
            dpuy.a(dpuxVar, frVar, false, new fdap() { // from class: dpwb
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    gg ggVar = (gg) obj;
                    ekrg ekrgVar = dpwq.b;
                    ggVar.getClass();
                    ggVar.D(id, new dpwu());
                    return fctx.a;
                }
            });
        } else {
            if (dpwuVarC.aK()) {
                return;
            }
            dpuy.a(dpuxVar, frVar, false, new fdap() { // from class: dpwc
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    gg ggVar = (gg) obj;
                    ekrg ekrgVar = dpwq.b;
                    ggVar.getClass();
                    ggVar.q(dpwuVarC);
                    return fctx.a;
                }
            });
        }
    }

    public void i(int i, boolean z) {
        j(i);
        dpwu dpwuVarC = c();
        if (dpwuVarC != null) {
            RendererContainer rendererContainer = dpwuVarC.c;
            if (rendererContainer != null) {
                rendererContainer.b(i, z);
            } else {
                dpwuVarC.b = Integer.valueOf(i);
            }
        }
    }

    public final void j(int i) {
        this.n.d(a[0], Integer.valueOf(i));
    }

    public void k(int i, int i2) {
        h();
        i(i2, false);
    }
}
