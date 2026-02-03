package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctpc implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ ctph b;

    public ctpc(fdpm fdpmVar, ctph ctphVar) {
        this.a = fdpmVar;
        this.b = ctphVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.ctpb
            if (r0 == 0) goto L13
            r0 = r14
            ctpb r0 = (defpackage.ctpb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ctpb r0 = new ctpb
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r14)
            goto La5
        L28:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L30:
            defpackage.fctl.b(r14)
            fdpm r14 = r12.a
            ajou r13 = (defpackage.ajou) r13
            ctph r2 = r12.b
            cudy r4 = r2.c
            cudx r4 = r4.e()
            if (r13 != 0) goto L44
            fcvo r13 = defpackage.fcvo.a
            goto L9c
        L44:
            ekgb r5 = r13.b()
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.fcva.p(r5, r7)
            r6.<init>(r7)
            ekqh r5 = r5.iterator()
        L57:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L9b
            java.lang.Object r7 = r5.next()
            ajpk r7 = (defpackage.ajpk) r7
            alqm r8 = r7.a
            alqj r9 = r8.G(r3)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = defpackage.cssf.c(r9)
            java.lang.String r10 = r7.a()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r10 = " "
            r11.append(r10)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            ctoz r10 = new ctoz
            boolean r8 = r4.b(r8)
            ctpg r11 = new ctpg
            r11.<init>(r2, r13, r7, r4)
            r10.<init>(r9, r8, r11)
            r6.add(r10)
            goto L57
        L9b:
            r13 = r6
        L9c:
            r0.b = r3
            java.lang.Object r13 = r14.fO(r13, r0)
            if (r13 != r1) goto La5
            return r1
        La5:
            fctx r13 = defpackage.fctx.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctpc.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
