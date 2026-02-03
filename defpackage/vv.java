package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class vv {
    public vw j = null;
    private final ArrayList a = new ArrayList();
    public long h = 120;
    public long i = 120;

    public static final vu s(wv wvVar) {
        vu vuVar = new vu();
        vuVar.a(wvVar);
        return vuVar;
    }

    public static void t(wv wvVar) {
        int i = wvVar.j;
        if (!wvVar.t() && (i & 4) == 0) {
            int i2 = wvVar.d;
            wvVar.fs();
        }
    }

    public abstract void b(wv wvVar);

    public abstract void c();

    public abstract void d();

    public boolean h(wv wvVar, List list) {
        throw null;
    }

    public abstract boolean i();

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.wv r11) {
        /*
            r10 = this;
            vw r0 = r10.j
            if (r0 == 0) goto L93
            r1 = 1
            r11.n(r1)
            wv r2 = r11.h
            r3 = 0
            if (r2 == 0) goto L13
            wv r2 = r11.i
            if (r2 != 0) goto L13
            r11.h = r3
        L13:
            r11.i = r3
            int r2 = r11.j
            r2 = r2 & 16
            if (r2 == 0) goto L1d
            goto L93
        L1d:
            android.view.View r2 = r11.a
            android.support.v7.widget.RecyclerView r3 = r0.a
            r3.au()
            sm r4 = r3.h
            int r5 = r4.c
            r6 = 0
            if (r5 != r1) goto L39
            android.view.View r1 = r4.d
            if (r1 != r2) goto L31
        L2f:
            r1 = r6
            goto L64
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r11.<init>(r0)
            throw r11
        L39:
            r7 = 2
            if (r5 == r7) goto L8b
            r4.c = r7     // Catch: java.lang.Throwable -> L87
            vm r5 = r4.e     // Catch: java.lang.Throwable -> L87
            int r7 = r5.b(r2)     // Catch: java.lang.Throwable -> L87
            r8 = -1
            if (r7 != r8) goto L4d
            r4.l(r2)     // Catch: java.lang.Throwable -> L87
            r4.c = r6
            goto L64
        L4d:
            sl r8 = r4.a     // Catch: java.lang.Throwable -> L87
            boolean r9 = r8.f(r7)     // Catch: java.lang.Throwable -> L87
            if (r9 == 0) goto L61
            r8.g(r7)     // Catch: java.lang.Throwable -> L87
            r4.l(r2)     // Catch: java.lang.Throwable -> L87
            r5.e(r7)     // Catch: java.lang.Throwable -> L87
            r4.c = r6
            goto L64
        L61:
            r4.c = r6
            goto L2f
        L64:
            if (r1 == 0) goto L72
            wv r2 = android.support.v7.widget.RecyclerView.k(r2)
            wj r4 = r3.e
            r4.o(r2)
            r4.m(r2)
        L72:
            r2 = r1 ^ 1
            r3.av(r2)
            if (r1 != 0) goto L93
            boolean r1 = r11.x()
            if (r1 == 0) goto L93
            android.support.v7.widget.RecyclerView r0 = r0.a
            android.view.View r11 = r11.a
            r0.removeDetachedView(r11, r6)
            return
        L87:
            r11 = move-exception
            r4.c = r6
            throw r11
        L8b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r11.<init>(r0)
            throw r11
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv.l(wv):void");
    }

    public final void m() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((vt) arrayList.get(i)).a();
        }
        arrayList.clear();
    }

    public abstract boolean n(wv wvVar, vu vuVar, vu vuVar2);

    public abstract boolean o(wv wvVar, wv wvVar2, vu vuVar, vu vuVar2);

    public abstract boolean p(wv wvVar, vu vuVar, vu vuVar2);

    public abstract boolean q(wv wvVar, vu vuVar, vu vuVar2);

    public boolean r(wv wvVar) {
        throw null;
    }
}
