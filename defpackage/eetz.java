package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eetz implements Handler.Callback {
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.what
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L70
            if (r0 == r2) goto L9
            return r1
        L9:
            java.lang.Object r0 = r8.obj
            com.google.android.material.snackbar.BaseTransientBottomBar r0 = (com.google.android.material.snackbar.BaseTransientBottomBar) r0
            int r8 = r8.arg1
            boolean r8 = r0.l()
            if (r8 == 0) goto L6c
            eeul r8 = r0.j
            int r3 = r8.getVisibility()
            if (r3 != 0) goto L6c
            int r8 = r8.c
            if (r8 != r2) goto L3d
            r8 = 2
            float[] r8 = new float[r8]
            r8 = {x00c2: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r8 = r0.c(r8)
            int r1 = r0.d
            long r3 = (long) r1
            r8.setDuration(r3)
            eets r1 = new eets
            r1.<init>(r0)
            r8.addListener(r1)
            r8.start()
            goto L6f
        L3d:
            android.animation.ValueAnimator r8 = new android.animation.ValueAnimator
            r8.<init>()
            int r3 = r0.b()
            int[] r1 = new int[]{r1, r3}
            r8.setIntValues(r1)
            android.animation.TimeInterpolator r1 = r0.f
            r8.setInterpolator(r1)
            int r1 = r0.e
            long r3 = (long) r1
            r8.setDuration(r3)
            eetx r1 = new eetx
            r1.<init>(r0)
            r8.addListener(r1)
            eety r1 = new eety
            r1.<init>(r0)
            r8.addUpdateListener(r1)
            r8.start()
            goto L6f
        L6c:
            r0.o()
        L6f:
            return r2
        L70:
            java.lang.Object r8 = r8.obj
            com.google.android.material.snackbar.BaseTransientBottomBar r8 = (com.google.android.material.snackbar.BaseTransientBottomBar) r8
            eeul r0 = r8.j
            android.view.ViewParent r3 = r0.getParent()
            if (r3 != 0) goto Lb5
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r4 = r3 instanceof defpackage.kub
            if (r4 == 0) goto La5
            kub r3 = (defpackage.kub) r3
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r4 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
            r4.<init>()
            eeuj r5 = r4.g
            eeud r6 = r8.t
            r5.a = r6
            eeuf r5 = new eeuf
            r5.<init>(r8)
            r4.f = r5
            r3.b(r4)
            android.view.View r4 = r8.d()
            if (r4 != 0) goto La5
            r4 = 80
            r3.g = r4
        La5:
            android.view.ViewGroup r3 = r8.h
            r0.g = r2
            r3.addView(r0)
            r0.g = r1
            r8.h()
            r1 = 4
            r0.setVisibility(r1)
        Lb5:
            boolean r0 = r0.isLaidOut()
            if (r0 == 0) goto Lbf
            r8.j()
            goto Lc1
        Lbf:
            r8.r = r2
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eetz.handleMessage(android.os.Message):boolean");
    }
}
