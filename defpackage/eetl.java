package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eetl extends ljm {
    final /* synthetic */ SideSheetBehavior a;

    public eetl(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.ljm
    public final int a(View view) {
        SideSheetBehavior sideSheetBehavior = this.a;
        return sideSheetBehavior.f + sideSheetBehavior.i;
    }

    @Override // defpackage.ljm
    public final void c(int i) {
        if (i == 1) {
            SideSheetBehavior sideSheetBehavior = this.a;
            if (sideSheetBehavior.b) {
                sideSheetBehavior.w(1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // defpackage.ljm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r4.a
            eetg r1 = r0.a
            boolean r1 = r1.l(r6)
            r2 = 3
            if (r1 == 0) goto Lc
            goto L4d
        Lc:
            eetg r1 = r0.a
            boolean r1 = r1.o(r5, r6)
            r3 = 5
            if (r1 == 0) goto L27
            eetg r1 = r0.a
            boolean r6 = r1.n(r6, r7)
            if (r6 != 0) goto L25
            eetg r6 = r0.a
            boolean r6 = r6.m(r5)
            if (r6 == 0) goto L4d
        L25:
            r2 = r3
            goto L4d
        L27:
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L32
            boolean r6 = defpackage.eeth.a(r6, r7)
            if (r6 != 0) goto L25
        L32:
            int r6 = r5.getLeft()
            int r7 = r0.t()
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            eetg r1 = r0.a
            int r1 = r1.d()
            int r6 = r6 - r1
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L25
        L4d:
            r6 = 1
            r0.y(r5, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eetl.d(android.view.View, float, float):void");
    }

    @Override // defpackage.ljm
    public final boolean e(View view, int i) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.a;
        return (sideSheetBehavior.c == 1 || (weakReference = sideSheetBehavior.j) == null || weakReference.get() != view) ? false : true;
    }

    @Override // defpackage.ljm
    public final int f(View view, int i) {
        SideSheetBehavior sideSheetBehavior = this.a;
        return kzz.b(i, sideSheetBehavior.a.f(), sideSheetBehavior.a.e());
    }

    @Override // defpackage.ljm
    public final int g(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.ljm
    public final void i(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.a;
        View viewU = sideSheetBehavior.u();
        if (viewU != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewU.getLayoutParams()) != null) {
            sideSheetBehavior.a.k(marginLayoutParams, view.getLeft(), view.getRight());
            viewU.setLayoutParams(marginLayoutParams);
        }
        Set set = sideSheetBehavior.k;
        if (set.isEmpty()) {
            return;
        }
        sideSheetBehavior.a.p();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((eetf) it.next()).a();
        }
    }
}
