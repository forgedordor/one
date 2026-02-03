package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vln implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ vlp b;

    public vln(fdpm fdpmVar, vlp vlpVar) {
        this.a = fdpmVar;
        this.b = vlpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof defpackage.vlm
            if (r2 == 0) goto L17
            r2 = r1
            vlm r2 = (defpackage.vlm) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            vlm r2 = new vlm
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.b
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            defpackage.fctl.b(r1)
            goto L87
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            defpackage.fctl.b(r1)
            fdpm r1 = r0.a
            r4 = r22
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r6 = 0
            if (r4 == 0) goto L7e
            vlp r4 = r0.b
            fcsu r7 = r4.a
            java.lang.Object r8 = r7.b()
            j$.util.Optional r8 = (j$.util.Optional) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L54
            goto L7e
        L54:
            dihq r9 = new dihq
            java.lang.Object r6 = r7.b()
            j$.util.Optional r6 = (j$.util.Optional) r6
            java.lang.Object r6 = r6.get()
            cgsa r6 = (defpackage.cgsa) r6
            java.lang.String r10 = r6.h()
            vll r6 = new vll
            r6.<init>(r4)
            r20 = 998(0x3e6, float:1.398E-42)
            r11 = 0
            r12 = 0
            r13 = 1
            r14 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r6 = r9
        L7e:
            r2.b = r5
            java.lang.Object r1 = r1.fO(r6, r2)
            if (r1 != r3) goto L87
            return r3
        L87:
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vln.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
