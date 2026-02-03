package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmii implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ cmio b;

    public cmii(fdpm fdpmVar, cmio cmioVar) {
        this.a = fdpmVar;
        this.b = cmioVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r9.fO(r8, r0) != r1) goto L30;
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
            boolean r0 = r9 instanceof defpackage.cmih
            if (r0 == 0) goto L13
            r0 = r9
            cmih r0 = (defpackage.cmih) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cmih r0 = new cmih
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            goto L79
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.c
            defpackage.fctl.b(r9)
            goto L63
        L38:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            evuh r8 = (defpackage.evuh) r8
            cmio r2 = r7.b
            boolean r5 = r2.x()
            if (r5 == 0) goto L69
            if (r8 == 0) goto L4e
            j$.util.Optional r8 = j$.util.Optional.of(r8)
            goto L52
        L4e:
            j$.util.Optional r8 = j$.util.Optional.empty()
        L52:
            eiju r8 = r2.o(r8)
            r0.c = r9
            r0.b = r4
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto L78
            r6 = r9
            r9 = r8
            r8 = r6
        L63:
            evuh r9 = (defpackage.evuh) r9
            r6 = r9
            r9 = r8
            r8 = r6
            goto L6d
        L69:
            if (r8 != 0) goto L6d
            evuh r8 = r2.g
        L6d:
            r2 = 0
            r0.c = r2
            r0.b = r3
            java.lang.Object r8 = r9.fO(r8, r0)
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmii.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
