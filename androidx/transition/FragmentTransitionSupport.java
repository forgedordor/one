package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.gp;
import defpackage.lac;
import defpackage.plz;
import defpackage.pma;
import defpackage.pmb;
import defpackage.pmc;
import defpackage.pmd;
import defpackage.pme;
import defpackage.pmh;
import defpackage.pmo;
import defpackage.pmx;
import defpackage.pnb;
import defpackage.pnf;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FragmentTransitionSupport extends gp {
    private static boolean A(pmx pmxVar) {
        return (x(pmxVar.d) && x(null) && x(null)) ? false : true;
    }

    @Override // defpackage.gp
    public final Object a(Object obj) {
        if (obj != null) {
            return ((pmx) obj).clone();
        }
        return null;
    }

    @Override // defpackage.gp
    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        pnf pnfVar = new pnf();
        pnfVar.O((pmx) obj);
        return pnfVar;
    }

    @Override // defpackage.gp
    public final void c(Object obj, View view) {
        ((pmx) obj).G(view);
    }

    @Override // defpackage.gp
    public final void d(Object obj, ArrayList arrayList) {
        pmx pmxVar = (pmx) obj;
        if (pmxVar == null) {
            return;
        }
        int i = 0;
        if (pmxVar instanceof pnf) {
            pnf pnfVar = (pnf) pmxVar;
            int iF = pnfVar.f();
            while (i < iF) {
                d(pnfVar.g(i), arrayList);
                i++;
            }
            return;
        }
        if (A(pmxVar) || !x(pmxVar.e)) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            pmxVar.G((View) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.gp
    public final void e(ViewGroup viewGroup, Object obj) {
        pnb.b(viewGroup, (pmx) obj);
    }

    public final void f(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        pmx pmxVar = (pmx) obj;
        int i = 0;
        if (pmxVar instanceof pnf) {
            pnf pnfVar = (pnf) pmxVar;
            int iF = pnfVar.f();
            while (i < iF) {
                f(pnfVar.g(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(pmxVar)) {
            return;
        }
        ArrayList arrayList3 = pmxVar.e;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            pmxVar.G((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                pmxVar.J((View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.gp
    public final void g(Object obj, View view, ArrayList arrayList) {
        ((pmx) obj).F(new pmb(view, arrayList));
    }

    @Override // defpackage.gp
    public final void h(Object obj, Rect rect) {
        ((pmx) obj).z(new pme());
    }

    @Override // defpackage.gp
    public final void i(Object obj, View view) {
        if (view != null) {
            y(view, new Rect());
            ((pmx) obj).z(new pma());
        }
    }

    @Override // defpackage.gp
    public final void j(Object obj, View view, ArrayList arrayList) {
        pnf pnfVar = (pnf) obj;
        ArrayList arrayList2 = pnfVar.e;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        d(pnfVar, arrayList);
    }

    @Override // defpackage.gp
    public final void k(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        pnf pnfVar = (pnf) obj;
        if (pnfVar != null) {
            ArrayList arrayList3 = pnfVar.e;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            f(pnfVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.gp
    public final boolean l(Object obj) {
        return obj instanceof pmx;
    }

    @Override // defpackage.gp
    public final boolean m() {
        return true;
    }

    @Override // defpackage.gp
    public final boolean n(Object obj) {
        boolean zD = ((pmx) obj).d();
        if (!zD) {
            Log.v("FragmentManager", a.h(obj, "Predictive back not available for AndroidX Transition ", ". Please enable seeking support for the designated transition by overriding isSeekingSupported()."));
        }
        return zD;
    }

    @Override // defpackage.gp
    public final Object o(Object obj, Object obj2) {
        pnf pnfVar = new pnf();
        if (obj != null) {
            pnfVar.O((pmx) obj);
        }
        pnfVar.O((pmx) obj2);
        return pnfVar;
    }

    @Override // defpackage.gp
    public final void p(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((pmx) obj).F(new pmc(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.gp
    public final void q(Object obj, lac lacVar, Runnable runnable) {
        z(obj, lacVar, null, runnable);
    }

    @Override // defpackage.gp
    public final Object r(Object obj, Object obj2) {
        pmx pmxVar = (pmx) obj;
        pmx pmxVar2 = (pmx) obj2;
        if (pmxVar == null) {
            pmxVar = null;
        }
        if (pmxVar2 == null) {
            return pmxVar;
        }
        pnf pnfVar = new pnf();
        if (pmxVar != null) {
            pnfVar.O(pmxVar);
        }
        pnfVar.O(pmxVar2);
        return pnfVar;
    }

    @Override // defpackage.gp
    public final Object s(ViewGroup viewGroup, Object obj) {
        pmx pmxVar = (pmx) obj;
        ArrayList arrayList = pnb.a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!pmxVar.d()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        pmx pmxVarClone = pmxVar.clone();
        pnf pnfVar = new pnf();
        pnfVar.O(pmxVarClone);
        pnb.d(viewGroup, pnfVar);
        pmh.a(viewGroup);
        pnb.c(viewGroup, pnfVar);
        viewGroup.invalidate();
        pnfVar.t = new pmo(pnfVar);
        pnfVar.F(pnfVar.t);
        return pnfVar.t;
    }

    @Override // defpackage.gp
    public final void t(Object obj) {
        ((pmo) obj).i();
    }

    @Override // defpackage.gp
    public final void u(Object obj, Runnable runnable) {
        ((pmo) obj).j(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    @Override // defpackage.gp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.Object r11, float r12) {
        /*
            r10 = this;
            pmo r11 = (defpackage.pmo) r11
            boolean r0 = r11.b
            if (r0 == 0) goto L6c
            long r0 = r11.h()
            float r0 = (float) r0
            float r12 = r12 * r0
            long r0 = (long) r12
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 1
            if (r12 != 0) goto L16
            r0 = r4
        L16:
            long r6 = r11.h()
            int r12 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r6 = -1
            if (r12 != 0) goto L25
            long r0 = r11.h()
            long r0 = r0 + r6
        L25:
            lnz r12 = r11.e
            if (r12 != 0) goto L64
            long r8 = r11.a
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r12 == 0) goto L6c
            boolean r12 = r11.c
            if (r12 != 0) goto L59
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L3c
            int r12 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r12 <= 0) goto L3d
            goto L4d
        L3c:
            r2 = r0
        L3d:
            long r0 = r11.h()
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 != 0) goto L4c
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 >= 0) goto L4c
            long r6 = r0 + r4
            goto L4d
        L4c:
            r6 = r2
        L4d:
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 == 0) goto L58
            pmx r12 = r11.h
            r12.y(r6, r8)
            r11.a = r6
        L58:
            r0 = r6
        L59:
            pnj r11 = r11.f
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r12 = (float) r0
            r11.a(r2, r12)
            return
        L64:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "setCurrentPlayTimeMillis() called after animation has been started"
            r11.<init>(r12)
            throw r11
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.FragmentTransitionSupport.w(java.lang.Object, float):void");
    }

    @Override // defpackage.gp
    public final void z(Object obj, lac lacVar, Runnable runnable, Runnable runnable2) {
        pmx pmxVar = (pmx) obj;
        plz plzVar = new plz(runnable, pmxVar, runnable2);
        synchronized (lacVar) {
            while (lacVar.b) {
                try {
                    lacVar.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (lacVar.c != plzVar) {
                lacVar.c = plzVar;
                if (lacVar.a) {
                    plzVar.a();
                }
            }
        }
        pmxVar.F(new pmd(runnable2));
    }
}
