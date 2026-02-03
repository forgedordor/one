package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
class pca extends GestureDetector.SimpleOnGestureListener {
    protected final pcw a;

    public pca(pcw pcwVar) {
        lcg.a(true);
        lcg.a(true);
        lcg.a(true);
        this.a = pcwVar;
    }

    static boolean a(pbw pbwVar) {
        return (pbwVar == null || ((acwz) pbwVar).a == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void b(defpackage.pbw r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            defpackage.lcg.a(r2)
            r2 = -1
            if (r8 == 0) goto L16
            r3 = r8
            acwz r3 = (defpackage.acwz) r3
            int r3 = r3.b
            if (r3 == r2) goto L17
            r3 = r0
            goto L18
        L16:
            r8 = 0
        L17:
            r3 = r1
        L18:
            defpackage.lcg.a(r3)
            boolean r3 = a(r8)
            defpackage.lcg.a(r3)
            pcw r3 = r7.a
            acwz r8 = (defpackage.acwz) r8
            java.lang.String r4 = r8.a
            if (r4 == 0) goto L2c
            r5 = r0
            goto L2d
        L2c:
            r5 = r1
        L2d:
            defpackage.lcg.a(r5)
            pbj r3 = (defpackage.pbj) r3
            pcm r5 = r3.a
            boolean r6 = r5.c(r4)
            if (r6 == 0) goto L3b
            goto L67
        L3b:
            java.util.Set r6 = r5.a
            r6.add(r4)
            r3.d(r4, r0)
            r3.e()
            int r8 = r8.b
            if (r8 == r2) goto L4b
            goto L4c
        L4b:
            r0 = r1
        L4c:
            defpackage.lcg.a(r0)
            pby r0 = r3.b
            acqk r0 = (defpackage.acqk) r0
            java.lang.String r0 = r0.b(r8)
            boolean r0 = r5.c(r0)
            defpackage.lcg.a(r0)
            pbi r0 = r3.c
            pch r1 = new pch
            r1.<init>(r8, r0)
            r3.e = r1
        L67:
            r5.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pca.b(pbw):void");
    }

    final void c(MotionEvent motionEvent) {
        if (pbz.a(motionEvent.getMetaState(), 1)) {
            this.a.j();
        }
    }
}
