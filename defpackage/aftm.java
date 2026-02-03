package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aftm implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ afto b;

    public aftm(fdpm fdpmVar, afto aftoVar) {
        this.a = fdpmVar;
        this.b = aftoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (r9.fO(r4, r2) == r3) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.aftl
            if (r2 == 0) goto L17
            r2 = r1
            aftl r2 = (defpackage.aftl) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            aftl r2 = new aftl
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.b
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            defpackage.fctl.b(r1)
            goto Lb6
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            long r7 = r2.e
            dzub r4 = r2.f
            java.lang.Object r9 = r2.c
            defpackage.fctl.b(r1)
            goto L70
        L41:
            defpackage.fctl.b(r1)
            fdpm r9 = r0.a
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            long r7 = r1.longValue()
            afto r1 = r0.b
            int r4 = (int) r7
            dzuc r10 = r1.j
            dzub r10 = r10.d()
            ajln r1 = r1.d
            anpj r1 = r1.H(r4)
            eiju r1 = r1.b()
            r2.c = r9
            r2.f = r10
            r2.e = r7
            r2.b = r6
            java.lang.Object r1 = defpackage.fdxs.c(r1, r2)
            if (r1 == r3) goto Lb9
            r4 = r10
        L70:
            afto r10 = r0.b
            ekgb r1 = (defpackage.ekgb) r1
            dzfh r11 = defpackage.afxy.d
            dzuc r12 = r10.j
            dzua r13 = defpackage.dzua.SUCCESS
            r14 = 0
            r12.f(r4, r11, r14, r13)
            afti r4 = new afti
            r1.getClass()
            int r11 = r1.size()
            long r11 = (long) r11
            fcsu r10 = r10.b
            java.lang.Object r10 = r10.b()
            java.lang.Number r10 = (java.lang.Number) r10
            long r15 = r10.longValue()
            int r10 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            r11 = 0
            if (r10 < 0) goto L9b
            r10 = r6
            goto L9c
        L9b:
            r10 = r11
        L9c:
            int r12 = r1.size()
            long r12 = (long) r12
            int r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r7 < 0) goto La6
            r11 = r6
        La6:
            r4.<init>(r1, r6, r10, r11)
            r2.c = r14
            r2.f = r14
            r2.b = r5
            java.lang.Object r1 = r9.fO(r4, r2)
            if (r1 != r3) goto Lb6
            goto Lb9
        Lb6:
            fctx r1 = defpackage.fctx.a
            return r1
        Lb9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aftm.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
