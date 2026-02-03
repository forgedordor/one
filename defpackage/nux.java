package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nux {
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(defpackage.nva r17, defpackage.nvm r18, defpackage.meo r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            long r5 = r1.b
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r9 = 0
            if (r3 != 0) goto L14
            r10 = r9
            goto L2e
        L14:
            int r4 = r0.b(r5)
            r7 = -1
            if (r4 != r7) goto L1f
            int r4 = r0.a()
        L1f:
            if (r4 <= 0) goto L2d
            int r7 = r4 + (-1)
            long r10 = r0.c(r7)
            int r8 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r8 != 0) goto L2d
            r10 = r7
            goto L2e
        L2d:
            r10 = r4
        L2e:
            if (r3 == 0) goto L53
            int r3 = r0.a()
            if (r10 >= r3) goto L53
            java.util.List r4 = r0.e(r5)
            long r7 = r0.c(r10)
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L53
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L53
            long r7 = r7 - r5
            nut r3 = new nut
            r3.<init>(r4, r5, r7)
            r2.a(r3)
            r3 = 1
            goto L54
        L53:
            r3 = r9
        L54:
            r4 = r10
        L55:
            int r7 = r0.a()
            if (r4 >= r7) goto L61
            b(r0, r4, r2)
            int r4 = r4 + 1
            goto L55
        L61:
            boolean r1 = r1.c
            if (r1 == 0) goto L89
            if (r3 == 0) goto L69
            int r10 = r10 + (-1)
        L69:
            if (r9 >= r10) goto L71
            b(r0, r9, r2)
            int r9 = r9 + 1
            goto L69
        L71:
            if (r3 == 0) goto L89
            nut r11 = new nut
            java.util.List r12 = r0.e(r5)
            long r13 = r0.c(r10)
            long r0 = r0.c(r10)
            long r15 = r5 - r0
            r11.<init>(r12, r13, r15)
            r2.a(r11)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nux.a(nva, nvm, meo):void");
    }

    private static void b(nva nvaVar, int i, meo meoVar) {
        long jC = nvaVar.c(i);
        List listE = nvaVar.e(jC);
        if (listE.isEmpty()) {
            return;
        }
        if (i == nvaVar.a() - 1) {
            throw new IllegalStateException();
        }
        long jC2 = nvaVar.c(i + 1) - nvaVar.c(i);
        if (jC2 > 0) {
            meoVar.a(new nut(listE, jC, jC2));
        }
    }
}
