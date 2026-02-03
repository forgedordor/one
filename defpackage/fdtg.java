package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdtg {
    public static final fduj a(fdpl fdplVar, fdjx fdjxVar, fdus fdusVar, int i) {
        fduq fduqVarC = c(fdplVar, i);
        int i2 = fduqVarC.b;
        int i3 = fduqVarC.d;
        fcyh fcyhVar = fduqVarC.c;
        fdpl fdplVar2 = fduqVarC.a;
        fdue fdueVarD = fdun.d(i, i2, i3);
        d(fdjxVar, fcyhVar, fdplVar2, fdueVarD, fdusVar, fdun.a);
        return new fdug(fdueVarD);
    }

    public static final fdvc b(fdpl fdplVar, fdjx fdjxVar, fdus fdusVar, Object obj) {
        fduq fduqVarC = c(fdplVar, 1);
        fcyh fcyhVar = fduqVarC.c;
        fdpl fdplVar2 = fduqVarC.a;
        fduf fdufVarA = fdvf.a(obj);
        d(fdjxVar, fcyhVar, fdplVar2, fdufVarA, fdusVar, obj);
        return new fduh(fdufVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.fduq c(defpackage.fdpl r7, int r8) {
        /*
            boolean r0 = defpackage.fdkb.a
            int r0 = defpackage.fdoa.e
            int r0 = defpackage.fdnz.a
            int r0 = defpackage.fddu.f(r8, r0)
            boolean r1 = r7 instanceof defpackage.fdvt
            int r0 = r0 - r8
            r2 = 1
            if (r1 == 0) goto L3c
            r1 = r7
            fdvt r1 = (defpackage.fdvt) r1
            fdpl r3 = r1.f()
            if (r3 == 0) goto L3c
            fduq r7 = new fduq
            int r4 = r1.b
            r5 = -3
            if (r4 == r5) goto L27
            r5 = -2
            if (r4 == r5) goto L27
            if (r4 == 0) goto L27
            r0 = r4
            goto L34
        L27:
            int r5 = r1.c
            r6 = 0
            if (r5 != r2) goto L2f
            if (r4 != 0) goto L34
            goto L33
        L2f:
            if (r8 != 0) goto L33
            r0 = r2
            goto L34
        L33:
            r0 = r6
        L34:
            int r8 = r1.c
            fcyh r1 = r1.a
            r7.<init>(r3, r0, r8, r1)
            return r7
        L3c:
            fduq r8 = new fduq
            fcyi r1 = defpackage.fcyi.a
            r8.<init>(r7, r0, r2, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdtg.c(fdpl, int):fduq");
    }

    private static final void d(fdjx fdjxVar, fcyh fcyhVar, fdpl fdplVar, fdue fdueVar, fdus fdusVar, Object obj) {
        fdin.c(fdjxVar, fcyhVar, fdbq.f(fdusVar, fdur.a) ? fdjz.a : fdjz.d, new fdtf(fdusVar, fdplVar, fdueVar, obj, null));
    }
}
