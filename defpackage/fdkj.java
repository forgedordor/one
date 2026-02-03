package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdkj {
    public static final long a(long j) {
        long j2 = fdhi.a;
        if (j > 0) {
            return fdhi.g(fdhi.j(j, fdhk.g(999999L, fdhl.a)));
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.fcxy r4) throws java.lang.Throwable {
        /*
            boolean r0 = r4 instanceof defpackage.fdki
            if (r0 == 0) goto L13
            r0 = r4
            fdki r0 = (defpackage.fdki) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdki r0 = new fdki
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            defpackage.fctl.b(r4)
            goto L4c
        L2f:
            defpackage.fctl.b(r4)
            r0.b = r3
            fdiu r4 = new fdiu
            fcxy r2 = defpackage.fcym.c(r0)
            r4.<init>(r2, r3)
            r4.B()
            java.lang.Object r4 = r4.m()
            if (r4 != r1) goto L49
            r0.getClass()
        L49:
            if (r4 != r1) goto L4c
            return r1
        L4c:
            fcta r4 = new fcta
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdkj.b(fcxy):java.lang.Object");
    }

    public static final Object c(long j, fcxy fcxyVar) {
        if (j > 0) {
            fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
            fdiuVar.B();
            if (j < Long.MAX_VALUE) {
                e(fdiuVar.b).d(j, fdiuVar);
            }
            Object objM = fdiuVar.m();
            fcyl fcylVar = fcyl.a;
            if (objM == fcylVar) {
                fcxyVar.getClass();
            }
            if (objM == fcylVar) {
                return objM;
            }
        }
        return fctx.a;
    }

    public static final Object d(long j, fcxy fcxyVar) {
        Object objC = c(a(j), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    public static final fdkh e(fcyh fcyhVar) {
        fcyf fcyfVar = fcyhVar.get(fcya.k);
        fdkh fdkhVar = fcyfVar instanceof fdkh ? (fdkh) fcyfVar : null;
        return fdkhVar == null ? fdke.a : fdkhVar;
    }
}
