package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vme implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ vmg b;

    public vme(fdpm fdpmVar, vmg vmgVar) {
        this.a = fdpmVar;
        this.b = vmgVar;
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
            boolean r2 = r1 instanceof defpackage.vmd
            if (r2 == 0) goto L17
            r2 = r1
            vmd r2 = (defpackage.vmd) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            vmd r2 = new vmd
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.b
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            defpackage.fctl.b(r1)
            goto L98
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            defpackage.fctl.b(r1)
            fdpm r1 = r0.a
            r4 = r22
            zqw r4 = (defpackage.zqw) r4
            java.util.List r6 = r4.a
            boolean r7 = r6.isEmpty()
            r8 = 0
            if (r7 == 0) goto L46
            goto L8f
        L46:
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L4d
            goto L66
        L4d:
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L66
            java.lang.Object r7 = r6.next()
            ajlt r7 = (defpackage.ajlt) r7
            amvr r7 = r7.g()
            boolean r7 = r7 instanceof defpackage.amsv
            if (r7 != 0) goto L51
            goto L8f
        L66:
            vmg r6 = r0.b
            android.content.Context r7 = r6.a
            r8 = 2132087266(0x7f1511e2, float:1.9814782E38)
            java.lang.String r10 = r7.getString(r8)
            r10.getClass()
            djrr r11 = defpackage.djrr.aO
            dihq r9 = new dihq
            vlz r7 = new vlz
            r7.<init>(r6, r4)
            r20 = 1012(0x3f4, float:1.418E-42)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r8 = r9
        L8f:
            r2.b = r5
            java.lang.Object r1 = r1.fO(r8, r2)
            if (r1 != r3) goto L98
            return r3
        L98:
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vme.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
