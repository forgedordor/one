package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class od implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, oo {
    public final oc a;
    public iv b;
    ny c;

    public od(oc ocVar) {
        this.a = ocVar;
    }

    @Override // defpackage.oo
    public final void a(oc ocVar, boolean z) {
        iv ivVar;
        if ((z || ocVar == this.a) && (ivVar = this.b) != null) {
            ivVar.dismiss();
        }
    }

    @Override // defpackage.oo
    public final boolean b(oc ocVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.z(((nx) this.c.k()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.d(this.a, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // android.content.DialogInterface.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKey(android.content.DialogInterface r3, int r4, android.view.KeyEvent r5) {
        /*
            r2 = this;
            r0 = 82
            if (r4 == r0) goto L8
            r0 = 4
            if (r4 != r0) goto L5c
            r4 = r0
        L8:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != 0) goto L2d
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L2d
            iv r3 = r2.b
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L5c
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L5c
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L5c
            r3.startTracking(r5, r2)
            return r1
        L2d:
            int r0 = r5.getAction()
            if (r0 != r1) goto L5c
            boolean r0 = r5.isCanceled()
            if (r0 != 0) goto L5c
            iv r0 = r2.b
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L5c
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L5c
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            if (r0 == 0) goto L5c
            boolean r0 = r0.isTracking(r5)
            if (r0 == 0) goto L5c
            oc r4 = r2.a
            r4.i(r1)
            r3.dismiss()
            return r1
        L5c:
            oc r3 = r2.a
            r0 = 0
            boolean r3 = r3.performShortcut(r4, r5, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od.onKey(android.content.DialogInterface, int, android.view.KeyEvent):boolean");
    }
}
