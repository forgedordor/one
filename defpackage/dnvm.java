package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvm implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ dnvp b;

    public dnvm(fdpm fdpmVar, dnvp dnvpVar) {
        this.a = fdpmVar;
        this.b = dnvpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r9.fO(r8, r0) != r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dnvl
            if (r0 == 0) goto L13
            r0 = r9
            dnvl r0 = (defpackage.dnvl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dnvl r0 = new dnvl
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r9)
            goto L73
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.c
            defpackage.fctl.b(r9)
            goto L61
        L39:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            fdev r8 = (defpackage.fdev) r8
            java.lang.Object r8 = defpackage.fdey.f(r8)
            dnes r8 = (defpackage.dnes) r8
            if (r8 == 0) goto L67
            java.lang.Object r8 = r8.a
            dnwt r8 = (defpackage.dnwt) r8
            if (r8 == 0) goto L67
            dnvp r2 = r7.b
            r0.c = r9
            r0.b = r4
            java.lang.String r8 = r8.a
            dnwk r2 = r2.a
            java.lang.Object r8 = r2.c(r8, r0)
            if (r8 == r1) goto L72
            r6 = r9
            r9 = r8
            r8 = r6
        L61:
            dnvg r9 = (defpackage.dnvg) r9
            r6 = r9
            r9 = r8
            r8 = r6
            goto L68
        L67:
            r8 = r5
        L68:
            r0.c = r5
            r0.b = r3
            java.lang.Object r8 = r9.fO(r8, r0)
            if (r8 != r1) goto L73
        L72:
            return r1
        L73:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnvm.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
