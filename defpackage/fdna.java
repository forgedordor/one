package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdna {
    public static final Object a(long j, fdat fdatVar, fcxy fcxyVar) {
        if (j > 0) {
            return d(new fdmy(j, fcxyVar), fdatVar);
        }
        throw new fdmx("Timed out immediately");
    }

    public static final Object b(long j, fdat fdatVar, fcxy fcxyVar) {
        return a(fdkj.a(j), fdatVar, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r7, defpackage.fdat r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.fdmz
            if (r0 == 0) goto L13
            r0 = r10
            fdmz r0 = (defpackage.fdmz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdmz r0 = new fdmz
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            fdci r7 = r0.c
            defpackage.fctl.b(r10)     // Catch: defpackage.fdmx -> L2a
            return r10
        L2a:
            r8 = move-exception
            goto L59
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            fdci r10 = new fdci
            r10.<init>()
            r0.c = r10     // Catch: defpackage.fdmx -> L56
            r0.b = r4     // Catch: defpackage.fdmx -> L56
            fdmy r2 = new fdmy     // Catch: defpackage.fdmx -> L56
            r2.<init>(r7, r0)     // Catch: defpackage.fdmx -> L56
            r10.a = r2     // Catch: defpackage.fdmx -> L56
            java.lang.Object r7 = d(r2, r9)     // Catch: defpackage.fdmx -> L56
            if (r7 != r1) goto L55
            return r1
        L55:
            return r7
        L56:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L59:
            fdlr r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L60
            return r3
        L60:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdna.c(long, fdat, fcxy):java.lang.Object");
    }

    private static final Object d(fdmy fdmyVar, fdat fdatVar) {
        fdlw.b(fdmyVar, true, new fdku(fdkj.e(fdmyVar.e.u()).c(fdmyVar.b, fdmyVar, ((fdic) fdmyVar).a)));
        return fdzv.b(fdmyVar, false, fdmyVar, fdatVar);
    }
}
