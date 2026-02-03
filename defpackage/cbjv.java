package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjv {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdap r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cbju
            if (r0 == 0) goto L13
            r0 = r8
            cbju r0 = (defpackage.cbju) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cbju r0 = new cbju
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.a
            fdci r7 = r0.f
            fdci r0 = r0.e
            defpackage.fctl.b(r8)
            goto L55
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r8)
            fdci r8 = new fdci
            r8.<init>()
            long r4 = defpackage.fdhi.a
            long r4 = java.lang.System.nanoTime()
            r0.e = r8
            r0.f = r8
            r0.a = r4
            r0.d = r3
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 == r1) goto L82
            r0 = r8
            r1 = r4
            r8 = r7
            r7 = r0
        L55:
            r7.a = r8
            long r7 = java.lang.System.nanoTime()
            long r7 = r7 - r1
            fdhl r1 = defpackage.fdhl.a
            long r7 = defpackage.fdhk.g(r7, r1)
            cbjx r1 = new cbjx
            java.lang.Object r0 = r0.a
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = defpackage.fcva.av(r0)
            long r2 = defpackage.fdhi.h(r7)
            int r7 = defpackage.fdhi.d(r7)
            long r7 = (long) r7
            j$.time.Duration r7 = j$.time.Duration.ofSeconds(r2, r7)
            r7.getClass()
            r1.<init>(r0, r7)
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbjv.a(fdap, fcxy):java.lang.Object");
    }
}
