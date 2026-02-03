package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyzj extends fcmy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyzj(fbnd fbndVar, fbnc fbncVar) {
        super(fbndVar, fbncVar);
        fbncVar.getClass();
    }

    @Override // defpackage.fcrn
    public final /* bridge */ /* synthetic */ fcrn a(fbnd fbndVar, fbnc fbncVar) {
        return new eyzj(fbndVar, fbncVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ezjt r8, defpackage.fbrg r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.eyzi
            if (r0 == 0) goto L13
            r0 = r10
            eyzi r0 = (defpackage.eyzi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eyzi r0 = new eyzi
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.fctl.b(r10)
            goto L47
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.fctl.b(r10)
            fbnd r1 = r7.a
            fbnc r4 = r7.b
            r10 = r2
            fbrk r2 = defpackage.eyzh.b()
            r6.c = r10
            r3 = r8
            r5 = r9
            java.lang.Object r10 = defpackage.fcnh.b(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L47
            return r0
        L47:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyzj.b(ezjt, fbrg, fcxy):java.lang.Object");
    }

    public /* synthetic */ eyzj(fbnd fbndVar) {
        this(fbndVar, fbnc.a);
    }
}
