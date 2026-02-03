package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdzq {
    private final fdhx a = new fdhx(0, fdia.a);
    public fdzr[] b;

    private final void h(int i, int i2) {
        fdzr[] fdzrVarArr = this.b;
        fdzrVarArr.getClass();
        fdzr fdzrVar = fdzrVarArr[i2];
        fdzrVar.getClass();
        fdzr fdzrVar2 = fdzrVarArr[i];
        fdzrVar2.getClass();
        fdzrVarArr[i] = fdzrVar;
        fdzrVarArr[i2] = fdzrVar2;
        fdzrVar.e(i);
        fdzrVar2.e(i2);
    }

    public final int a() {
        return this.a.c;
    }

    public final fdzr b() {
        fdzr[] fdzrVarArr = this.b;
        if (fdzrVarArr != null) {
            return fdzrVarArr[0];
        }
        return null;
    }

    public final fdzr c() {
        fdzr fdzrVarB;
        synchronized (this) {
            fdzrVarB = b();
        }
        return fdzrVarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fdzr d(int r8) {
        /*
            r7 = this;
            boolean r0 = defpackage.fdkb.a
            fdzr[] r0 = r7.b
            r0.getClass()
            int r1 = r7.a()
            r2 = -1
            int r1 = r1 + r2
            r7.e(r1)
            int r1 = r7.a()
            if (r8 >= r1) goto L7e
            int r1 = r7.a()
            r7.h(r8, r1)
            int r1 = r8 + (-1)
            if (r8 <= 0) goto L3c
            int r1 = r1 / 2
            r3 = r0[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3c
            r7.h(r8, r1)
            r7.f(r1)
            goto L7e
        L3c:
            int r1 = r8 + r8
            int r3 = r1 + 1
            int r4 = r7.a()
            if (r3 >= r4) goto L7e
            fdzr[] r4 = r7.b
            r4.getClass()
            int r1 = r1 + 2
            int r5 = r7.a()
            if (r1 >= r5) goto L66
            r5 = r4[r1]
            r5.getClass()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r4[r3]
            r6.getClass()
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L66
            goto L67
        L66:
            r1 = r3
        L67:
            r3 = r4[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r4[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L7e
            r7.h(r8, r1)
            r8 = r1
            goto L3c
        L7e:
            int r8 = r7.a()
            r8 = r0[r8]
            r8.getClass()
            r1 = 0
            r8.d(r1)
            r8.e(r2)
            int r2 = r7.a()
            r0[r2] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdzq.d(int):fdzr");
    }

    public final void e(int i) {
        this.a.c = i;
    }

    public final void f(int i) {
        while (i > 0) {
            fdzr[] fdzrVarArr = this.b;
            fdzrVarArr.getClass();
            int i2 = (i - 1) >> 1;
            fdzr fdzrVar = fdzrVarArr[i2];
            fdzrVar.getClass();
            fdzr fdzrVar2 = fdzrVarArr[i];
            fdzrVar2.getClass();
            if (((Comparable) fdzrVar).compareTo(fdzrVar2) <= 0) {
                return;
            }
            h(i, i2);
            i = i2;
        }
    }

    public final boolean g() {
        return a() == 0;
    }
}
