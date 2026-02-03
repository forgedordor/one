package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afsj implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ oxm b;

    public afsj(fdpm fdpmVar, oxm oxmVar) {
        this.a = fdpmVar;
        this.b = oxmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.afsi
            if (r0 == 0) goto L13
            r0 = r8
            afsi r0 = (defpackage.afsi) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            afsi r0 = new afsi
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L76
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r8)
            fdpm r8 = r6.a
            java.util.List r7 = (java.util.List) r7
            oxm r2 = r6.b
            int r2 = r2.a()
            if (r2 == 0) goto L68
            boolean r2 = r7 instanceof java.util.Collection
            r4 = 0
            if (r2 == 0) goto L4a
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L4a
            goto L69
        L4a:
            java.util.Iterator r7 = r7.iterator()
        L4e:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r7.next()
            eji r2 = (defpackage.eji) r2
            java.lang.Object r2 = r2.d
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "list_"
            boolean r2 = defpackage.fdgn.t(r2, r5)
            if (r2 == 0) goto L4e
        L68:
            r4 = r3
        L69:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r0.b = r3
            java.lang.Object r7 = r8.fO(r7, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afsj.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
