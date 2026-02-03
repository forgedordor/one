package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vob implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ vod b;

    public vob(fdpm fdpmVar, vod vodVar) {
        this.a = fdpmVar;
        this.b = vodVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7.fO(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.voa
            if (r0 == 0) goto L13
            r0 = r8
            voa r0 = (defpackage.voa) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            voa r0 = new voa
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L5a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.c
            defpackage.fctl.b(r8)
            goto L4e
        L38:
            defpackage.fctl.b(r8)
            fdpm r8 = r6.a
            ekgb r7 = (defpackage.ekgb) r7
            vod r2 = r6.b
            r0.c = r8
            r0.b = r4
            java.lang.Object r7 = r2.d(r7, r0)
            if (r7 == r1) goto L5d
            r5 = r8
            r8 = r7
            r7 = r5
        L4e:
            r2 = 0
            r0.c = r2
            r0.b = r3
            java.lang.Object r7 = r7.fO(r8, r0)
            if (r7 != r1) goto L5a
            goto L5d
        L5a:
            fctx r7 = defpackage.fctx.a
            return r7
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vob.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
