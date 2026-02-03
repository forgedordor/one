package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwv extends fxg implements fwz {
    private fwy i;
    private fxc j;

    public fwv(ebk ebkVar, boolean z, float f, ijh ijhVar, fdae fdaeVar) {
        super(ebkVar, z, f, ijhVar, fdaeVar);
    }

    private final void l(fxc fxcVar) {
        this.j = fxcVar;
        jbq.a(this);
    }

    @Override // defpackage.fxg
    public final void a(ebm ebmVar, long j, float f) {
        fwy fwyVar = this.i;
        if (fwyVar == null) {
            Object obj = (View) jbe.a(this, AndroidCompositionLocals_androidKt.f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(a.h(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    fwy fwyVar2 = new fwy(viewGroup.getContext());
                    viewGroup.addView(fwyVar2);
                    fwyVar = fwyVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof fwy) {
                        fwyVar = (fwy) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.i = fwyVar;
            fwyVar.getClass();
        }
        fxa fxaVar = fwyVar.d;
        fxc fxcVarA = fxaVar.a(this);
        if (fxcVarA == null) {
            List list = fwyVar.c;
            list.getClass();
            fxcVarA = (fxc) (list.isEmpty() ? null : list.remove(0));
            if (fxcVarA == null) {
                int i2 = fwyVar.e;
                List list2 = fwyVar.b;
                if (i2 > fcva.e(list2)) {
                    fxcVarA = new fxc(fwyVar.getContext());
                    fwyVar.addView(fxcVarA);
                    list2.add(fxcVarA);
                } else {
                    fxcVarA = (fxc) list2.get(fwyVar.e);
                    fwz fwzVar = (fwz) fxaVar.b.get(fxcVarA);
                    if (fwzVar != null) {
                        fwzVar.f();
                        fxaVar.b(fwzVar);
                        fxcVarA.a();
                    }
                }
                int i3 = fwyVar.e;
                if (i3 < fwyVar.a - 1) {
                    fwyVar.e = i3 + 1;
                } else {
                    fwyVar.e = 0;
                }
            }
            fxaVar.a.put(this, fxcVarA);
            fxaVar.b.put(fxcVarA, this);
        }
        fxc fxcVar = fxcVarA;
        boolean z = ((fxg) this).a;
        int iB = fdcu.b(f);
        long j2 = j();
        float f2 = ((fwx) ((fxg) this).b.invoke()).d;
        fdae fdaeVar = new fdae() { // from class: fwu
            @Override // defpackage.fdae
            public final Object invoke() {
                jbq.a(this.a);
                return fctx.a;
            }
        };
        if (fxcVar.b == null || !fdbq.f(Boolean.valueOf(z), fxcVar.c)) {
            fxm fxmVar = new fxm(z);
            fxcVar.setBackground(fxmVar);
            fxcVar.b = fxmVar;
            fxcVar.c = Boolean.valueOf(z);
        }
        fxm fxmVar2 = fxcVar.b;
        fxmVar2.getClass();
        fxcVar.e = fdaeVar;
        fxcVar.b(j, iB, j2, f2);
        if (z) {
            long j3 = ebmVar.a;
            fxmVar2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), ihs.b(j3));
        } else {
            fxmVar2.setHotspot(fxmVar2.getBounds().centerX(), fxmVar2.getBounds().centerY());
        }
        fxcVar.c(true);
        l(fxcVar);
    }

    @Override // defpackage.fxg
    public final void e(imz imzVar) {
        ijb ijbVarB = imzVar.t().b();
        fxc fxcVar = this.j;
        if (fxcVar != null) {
            fxcVar.b(this.e, fdcu.b(this.d), j(), ((fwx) ((fxg) this).b.invoke()).d);
            fxcVar.draw(iid.a(ijbVarB));
        }
    }

    @Override // defpackage.fwz
    public final void f() {
        l(null);
    }

    @Override // defpackage.fxg
    public final void g() {
        fxc fxcVar = this.j;
        if (fxcVar != null) {
            fxcVar.c(false);
        }
    }

    @Override // defpackage.icr
    public final void s() {
        fwy fwyVar = this.i;
        if (fwyVar != null) {
            f();
            fxa fxaVar = fwyVar.d;
            fxc fxcVarA = fxaVar.a(this);
            if (fxcVarA != null) {
                fxcVarA.a();
                fxaVar.b(this);
                fwyVar.c.add(fxcVarA);
            }
        }
    }
}
