package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctqb implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ ctqd b;

    public ctqb(fdpm fdpmVar, ctqd ctqdVar) {
        this.a = fdpmVar;
        this.b = ctqdVar;
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
            boolean r0 = r13 instanceof defpackage.ctqa
            if (r0 == 0) goto L13
            r0 = r13
            ctqa r0 = (defpackage.ctqa) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ctqa r0 = new ctqa
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r13)
            goto La8
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.fctl.b(r13)
            fdpm r13 = r11.a
            alqm r12 = (defpackage.alqm) r12
            if (r12 != 0) goto L3b
            r12 = 0
            goto L9f
        L3b:
            ctqd r2 = r11.b
            android.content.Context r4 = r2.e
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            int r5 = defpackage.kxj.c(r4, r5)
            r6 = 0
            r7 = 2132085509(0x7f150b05, float:1.9811219E38)
            if (r5 != 0) goto L70
            ctqf r5 = new ctqf
            java.lang.String r8 = r12.l()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r6] = r8
            java.lang.String r4 = r4.getString(r7, r9)
            r4.getClass()
            ctpw r6 = new ctpw
            r6.<init>(r2, r12)
            asgz r12 = r2.h
            ctrb r2 = new ctrb
            boolean r12 = r12.a()
            r2.<init>(r12)
            r5.<init>(r4, r6, r2)
            goto L9e
        L70:
            ctqe r5 = new ctqe
            r8 = 2132083053(0x7f15016d, float:1.9806237E38)
            java.lang.String r8 = r4.getString(r8)
            r8.getClass()
            java.lang.String r9 = r12.l()
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r6] = r9
            java.lang.String r4 = r4.getString(r7, r10)
            r4.getClass()
            ctpx r6 = new ctpx
            r6.<init>(r2, r12)
            asgz r12 = r2.h
            ctrb r2 = new ctrb
            boolean r12 = r12.a()
            r2.<init>(r12)
            r5.<init>(r8, r4, r6, r2)
        L9e:
            r12 = r5
        L9f:
            r0.b = r3
            java.lang.Object r12 = r13.fO(r12, r0)
            if (r12 != r1) goto La8
            return r1
        La8:
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctqb.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
