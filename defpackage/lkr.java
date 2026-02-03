package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkr implements fdpm {
    final /* synthetic */ fdpm a;

    public lkr(fdpm fdpmVar) {
        this.a = fdpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lkq
            if (r0 == 0) goto L13
            r0 = r6
            lkq r0 = (defpackage.lkq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            lkq r0 = new lkq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fdpm r6 = r4.a
            lmv r5 = (defpackage.lmv) r5
            boolean r2 = r5 instanceof defpackage.lmk
            if (r2 != 0) goto L65
            boolean r2 = r5 instanceof defpackage.ljt
            if (r2 == 0) goto L4e
            ljt r5 = (defpackage.ljt) r5
            java.lang.Object r5 = r5.a
            r0.b = r3
            java.lang.Object r5 = r6.fO(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            fctx r5 = defpackage.fctx.a
            return r5
        L4e:
            boolean r6 = r5 instanceof defpackage.lmf
            if (r6 != 0) goto L5d
            boolean r5 = r5 instanceof defpackage.lmz
            if (r5 == 0) goto L57
            goto L5d
        L57:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        L5d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r5.<init>(r6)
            throw r5
        L65:
            lmk r5 = (defpackage.lmk) r5
            java.lang.Throwable r5 = r5.a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkr.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
