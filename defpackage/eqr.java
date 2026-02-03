package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqr {
    public final Object[] a;
    public final int b;
    private final cve c;

    public eqr(fddq fddqVar, enm enmVar) {
        eqp eqpVarB = enmVar.b();
        final int i = fddqVar.a;
        if (i < 0) {
            ebs.d("negative nearestRange.first");
        }
        final int iMin = Math.min(fddqVar.b, eqpVarB.b - 1);
        if (iMin < i) {
            this.c = cvf.a();
            this.a = new Object[0];
            this.b = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.a = new Object[i2];
        this.b = i;
        final cuq cuqVar = new cuq(i2);
        fdap fdapVar = new fdap() { // from class: eqq
            /* JADX WARN: Removed duplicated region for block: B:10:0x0043 A[LOOP:0: B:4:0x001f->B:10:0x0043, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[EDGE_INSN: B:13:0x0046->B:11:0x0046 BREAK  A[LOOP:0: B:4:0x001f->B:10:0x0043], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
            @Override // defpackage.fdap
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r7) {
                /*
                    r6 = this;
                    emx r7 = (defpackage.emx) r7
                    java.lang.Object r0 = r7.c
                    enl r0 = (defpackage.enl) r0
                    fdap r0 = r0.a()
                    int r1 = r7.a
                    int r2 = r1
                    int r2 = java.lang.Math.max(r2, r1)
                    int r7 = r7.b
                    int r7 = r7 + r1
                    int r3 = r2
                    int r7 = r7 + (-1)
                    int r7 = java.lang.Math.min(r3, r7)
                    if (r2 > r7) goto L46
                L1f:
                    if (r0 == 0) goto L2d
                    int r3 = r2 - r1
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.Object r3 = r0.invoke(r3)
                    if (r3 != 0) goto L32
                L2d:
                    emv r3 = new emv
                    r3.<init>(r2)
                L32:
                    eqr r4 = r4
                    cuq r5 = r3
                    r5.c(r3, r2)
                    int r5 = r4.b
                    int r5 = r2 - r5
                    java.lang.Object[] r4 = r4.a
                    r4[r5] = r3
                    if (r2 == r7) goto L46
                    int r2 = r2 + 1
                    goto L1f
                L46:
                    fctx r7 = defpackage.fctx.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.eqq.invoke(java.lang.Object):java.lang.Object");
            }
        };
        if (i < 0 || i >= eqpVarB.b) {
            ebs.e("Index " + i + ", size " + eqpVarB.b);
        }
        if (iMin < 0 || iMin >= eqpVarB.b) {
            ebs.e("Index " + iMin + ", size " + eqpVarB.b);
        }
        if (iMin < i) {
            ebs.c("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        hum humVar = eqpVarB.a;
        int iA = emy.a(humVar, i);
        int i3 = ((emx) humVar.a[iA]).a;
        while (i3 <= iMin) {
            emx emxVar = (emx) humVar.a[iA];
            fdapVar.invoke(emxVar);
            i3 += emxVar.b;
            iA++;
        }
        this.c = cuqVar;
    }

    public final int a(Object obj) {
        cve cveVar = this.c;
        int iE = cveVar.e(obj);
        if (iE >= 0) {
            return cveVar.c[iE];
        }
        return -1;
    }

    public final Object b(int i) {
        int i2 = i - this.b;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.a;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }
}
