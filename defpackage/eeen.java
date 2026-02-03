package defpackage;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeen extends ljm {
    final /* synthetic */ BottomSheetBehavior a;

    public eeen(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.ljm
    public final void c(int i) throws Resources.NotFoundException {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.w) {
                bottomSheetBehavior.F(1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // defpackage.ljm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r6, float r7, float r8) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 6
            r3 = 3
            if (r1 >= 0) goto L1d
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r5.a
            boolean r8 = r7.a
            if (r8 == 0) goto L10
        Ld:
            r2 = r3
            goto Ld8
        L10:
            int r8 = r6.getTop()
            android.os.SystemClock.uptimeMillis()
            int r7 = r7.q
            if (r8 <= r7) goto Ld
            goto Ld8
        L1d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r5.a
            boolean r4 = r1.u
            if (r4 == 0) goto L6f
            boolean r4 = r1.K(r6, r8)
            if (r4 == 0) goto L6f
            float r7 = java.lang.Math.abs(r7)
            float r0 = java.lang.Math.abs(r8)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r0 = 5
            if (r7 >= 0) goto L3d
            int r7 = r1.b
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L4c
        L3d:
            int r7 = r6.getTop()
            int r8 = r1.A
            int r4 = r1.t()
            int r8 = r8 + r4
            int r8 = r8 / 2
            if (r7 <= r8) goto L4f
        L4c:
            r2 = r0
            goto Ld8
        L4f:
            boolean r7 = r1.a
            if (r7 == 0) goto L54
            goto Ld
        L54:
            int r7 = r6.getTop()
            int r8 = r1.t()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r0 = r1.q
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Ld8
            goto Ld
        L6f:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r4 = 4
            if (r0 == 0) goto L9c
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L81
            goto L9c
        L81:
            boolean r7 = r1.a
            if (r7 == 0) goto L86
            goto Lb7
        L86:
            int r7 = r6.getTop()
            int r8 = r1.q
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r1.s
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Lb7
            goto Ld8
        L9c:
            int r7 = r6.getTop()
            boolean r8 = r1.a
            if (r8 == 0) goto Lb9
            int r8 = r1.p
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r1.s
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Lb7
            goto Ld
        Lb7:
            r2 = r4
            goto Ld8
        Lb9:
            int r8 = r1.q
            if (r7 >= r8) goto Lc9
            int r8 = r1.s
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Ld8
            goto Ld
        Lc9:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r1.s
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Lb7
        Ld8:
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r5.a
            r8 = 1
            r7.H(r6, r2, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeen.d(android.view.View, float, float):void");
    }

    @Override // defpackage.ljm
    public final boolean e(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.x;
        if (i2 == 1 || bottomSheetBehavior.G) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.F == i) {
            WeakReference weakReference = bottomSheetBehavior.C;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        SystemClock.uptimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.B;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // defpackage.ljm
    public final int f(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.ljm
    public final int g(View view, int i) {
        return kzz.b(i, this.a.t(), h());
    }

    @Override // defpackage.ljm
    public final int h() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.J() ? bottomSheetBehavior.A : bottomSheetBehavior.s;
    }

    @Override // defpackage.ljm
    public final void i(View view, int i, int i2) {
        this.a.y(i2);
    }
}
