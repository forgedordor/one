package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtu implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ wtx b;

    public wtu(fdpm fdpmVar, wtx wtxVar) {
        this.a = fdpmVar;
        this.b = wtxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.wtt
            if (r0 == 0) goto L13
            r0 = r13
            wtt r0 = (defpackage.wtt) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wtt r0 = new wtt
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r13)
            goto L6a
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            defpackage.fctl.b(r13)
            fdpm r13 = r11.a
            ajlt r12 = (defpackage.ajlt) r12
            if (r12 != 0) goto L3f
            wtx r12 = r11.b
            r12.b()
            r12 = 0
            goto L61
        L3f:
            wtx r12 = r11.b
            android.content.Context r2 = r12.a
            r4 = 2132083986(0x7f150512, float:1.980813E38)
            java.lang.String r6 = r2.getString(r4)
            r6.getClass()
            wts r9 = new wts
            r9.<init>(r12)
            r12 = 2132083914(0x7f1504ca, float:1.9807984E38)
            java.lang.String r7 = r2.getString(r12)
            djdh r5 = new djdh
            r8 = 0
            r10 = 4
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = r5
        L61:
            r0.b = r3
            java.lang.Object r12 = r13.fO(r12, r0)
            if (r12 != r1) goto L6a
            return r1
        L6a:
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtu.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
