package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmi implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ zmc b;
    final /* synthetic */ zmo c;

    public zmi(fdpm fdpmVar, zmc zmcVar, zmo zmoVar) {
        this.a = fdpmVar;
        this.b = zmcVar;
        this.c = zmoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.zmh
            if (r0 == 0) goto L13
            r0 = r15
            zmh r0 = (defpackage.zmh) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            zmh r0 = new zmh
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r15)
            goto Ld1
        L28:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L30:
            defpackage.fctl.b(r15)
            fdpm r15 = r13.a
            aoer r14 = (defpackage.aoer) r14
            zmc r2 = r13.b
            zmo r4 = r13.c
            zmb r5 = new zmb
            amwj r6 = r2.b
            int r6 = r6.a()
            int r6 = r6 + (-1)
            cwuj r7 = r4.a
            r8 = 508(0x1fc, float:7.12E-43)
            r9 = 0
            r10 = 0
            if (r6 == r3) goto L9b
            r11 = 2
            if (r6 == r11) goto L73
            r11 = 4
            if (r6 == r11) goto L54
            goto Lb9
        L54:
            android.content.Context r6 = r7.a
            r11 = 2132087772(0x7f1513dc, float:1.9815809E38)
            java.lang.String r11 = r6.getString(r11)
            r11.getClass()
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r10] = r11
            r10 = 2132087770(0x7f1513da, float:1.9815805E38)
            java.lang.String r6 = r6.getString(r10, r12)
            r6.getClass()
            cwui r9 = defpackage.cwuj.a(r7, r6, r11, r9, r8)
            goto Lb9
        L73:
            android.content.Context r6 = r7.a
            r8 = 2132087260(0x7f1511dc, float:1.981477E38)
            java.lang.String r8 = r6.getString(r8)
            r8.getClass()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r10] = r8
            r10 = 2132087261(0x7f1511dd, float:1.9814772E38)
            java.lang.String r6 = r6.getString(r10, r9)
            r6.getClass()
            r9 = 2131231377(0x7f080291, float:1.8078833E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 496(0x1f0, float:6.95E-43)
            cwui r9 = defpackage.cwuj.a(r7, r6, r8, r9, r10)
            goto Lb9
        L9b:
            android.content.Context r6 = r7.a
            r11 = 2132087948(0x7f15148c, float:1.9816166E38)
            java.lang.String r11 = r6.getString(r11)
            r11.getClass()
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r10] = r11
            r10 = 2132087949(0x7f15148d, float:1.9816168E38)
            java.lang.String r6 = r6.getString(r10, r12)
            r6.getClass()
            cwui r9 = defpackage.cwuj.a(r7, r6, r11, r9, r8)
        Lb9:
            com.google.android.apps.messaging.shared.api.messaging.MessageId r6 = r2.a
            zmk r7 = new zmk
            r7.<init>(r4, r2)
            zml r8 = new zml
            r8.<init>(r4, r2, r14)
            r5.<init>(r6, r9, r7, r8)
            r0.b = r3
            java.lang.Object r14 = r15.fO(r5, r0)
            if (r14 != r1) goto Ld1
            return r1
        Ld1:
            fctx r14 = defpackage.fctx.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmi.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
