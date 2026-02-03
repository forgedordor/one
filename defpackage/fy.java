package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class fy extends pou {
    private final fr a;
    private gg b = null;
    private ea c = null;
    private boolean d;

    @Deprecated
    public fy(fr frVar) {
        this.a = frVar;
    }

    private static String m(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // defpackage.pou
    public final Parcelable a() {
        return null;
    }

    public abstract ea b(int i);

    @Override // defpackage.pou
    public final Object c(ViewGroup viewGroup, int i) {
        if (this.b == null) {
            this.b = new cg(this.a);
        }
        long j = i;
        ea eaVarH = this.a.h(m(viewGroup.getId(), j));
        if (eaVarH != null) {
            this.b.r(new gf(7, eaVarH));
        } else {
            eaVarH = b(i);
            this.b.t(viewGroup.getId(), eaVarH, m(viewGroup.getId(), j));
        }
        if (eaVarH != this.c) {
            eaVarH.ax(false);
            eaVarH.aC(false);
        }
        return eaVarH;
    }

    @Override // defpackage.pou
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        ea eaVar = (ea) obj;
        if (this.b == null) {
            this.b = new cg(this.a);
        }
        gg ggVar = this.b;
        fr frVar = eaVar.B;
        if (frVar != null && frVar != ((cg) ggVar).a) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + eaVar.toString() + " is already attached to a FragmentManager.");
        }
        ggVar.r(new gf(6, eaVar));
        if (eaVar.equals(this.c)) {
            this.c = null;
        }
    }

    @Override // defpackage.pou
    public void f(ViewGroup viewGroup, int i, Object obj) {
        ea eaVar = (ea) obj;
        ea eaVar2 = this.c;
        if (eaVar != eaVar2) {
            if (eaVar2 != null) {
                eaVar2.ax(false);
                this.c.aC(false);
            }
            eaVar.ax(true);
            eaVar.aC(true);
            this.c = eaVar;
        }
    }

    @Override // defpackage.pou
    public final void g(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException(a.h(this, "ViewPager with adapter ", " requires a view id"));
        }
    }

    @Override // defpackage.pou
    public final boolean h(View view, Object obj) {
        return ((ea) obj).Q == view;
    }

    @Override // defpackage.pou
    public final void i() {
        gg ggVar = this.b;
        if (ggVar != null) {
            if (!this.d) {
                try {
                    this.d = true;
                    ggVar.d();
                } finally {
                    this.d = false;
                }
            }
            this.b = null;
        }
    }

    @Override // defpackage.pou
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
    }
}
