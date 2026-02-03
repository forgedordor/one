package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asro {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final aqnx d;

    public asro(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, aqnx aqnxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = aqnxVar;
    }

    private final Object g(awjb awjbVar, fcxy fcxyVar) {
        return this.d.a() ? ((awjh) this.a.b()).i(awjbVar.a, fcxyVar) : ((awjd) this.c.b()).a(awjbVar).a(fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.awjl r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.asri
            if (r0 == 0) goto L13
            r0 = r7
            asri r0 = (defpackage.asri) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asri r0 = new asri
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L49
        L36:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.a
            java.lang.Object r7 = r7.b()
            awjh r7 = (defpackage.awjh) r7
            r0.c = r4
            java.lang.Object r7 = r7.e(r6, r0)
            if (r7 == r1) goto L55
        L49:
            awjb r7 = (defpackage.awjb) r7
            r0.c = r3
            java.lang.Object r6 = r5.b(r7, r0)
            if (r6 != r1) goto L54
            goto L55
        L54:
            return r6
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asro.a(awjl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.awjb r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.asrj
            if (r0 == 0) goto L13
            r0 = r6
            asrj r0 = (defpackage.asrj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asrj r0 = new asrj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L6d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            awja r6 = r5.b
            awja r2 = defpackage.awja.a
            if (r6 == r2) goto L64
            awja r2 = defpackage.awja.b
            if (r6 == r2) goto L64
            awja r2 = defpackage.awja.d
            if (r6 != r2) goto L41
            goto L64
        L41:
            awjl r5 = r5.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Creating a one to one RecipientsDescriptor for an unsupported destination type ("
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "). destinationToken="
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = "."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
        L64:
            r0.c = r3
            java.lang.Object r6 = r4.g(r5, r0)
            if (r6 != r1) goto L6d
            return r1
        L6d:
            aubq r6 = (defpackage.aubq) r6
            asrg r5 = new asrg
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asro.b(awjb, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.awjl r6, defpackage.awpx r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.asrk
            if (r0 == 0) goto L13
            r0 = r8
            asrk r0 = (defpackage.asrk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asrk r0 = new asrk
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            awpx r7 = r0.d
            defpackage.fctl.b(r8)
            goto L4d
        L38:
            defpackage.fctl.b(r8)
            fcsu r8 = r5.a
            java.lang.Object r8 = r8.b()
            awjh r8 = (defpackage.awjh) r8
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r8.e(r6, r0)
            if (r8 == r1) goto L5c
        L4d:
            awjb r8 = (defpackage.awjb) r8
            r6 = 0
            r0.d = r6
            r0.c = r3
            java.lang.Object r6 = r5.d(r8, r7, r0)
            if (r6 != r1) goto L5b
            goto L5c
        L5b:
            return r6
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asro.c(awjl, awpx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.awjb r6, defpackage.awpx r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.asrl
            if (r0 == 0) goto L13
            r0 = r8
            asrl r0 = (defpackage.asrl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            asrl r0 = new asrl
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.a
            audu r6 = (defpackage.audu) r6
            defpackage.fctl.b(r8)
            goto L6b
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.a
            awjb r6 = (defpackage.awjb) r6
            defpackage.fctl.b(r8)
            goto L5a
        L3e:
            defpackage.fctl.b(r8)
            awja r8 = r6.b
            awja r2 = defpackage.awja.a
            if (r8 != r2) goto L7a
            fcsu r8 = r5.b
            java.lang.Object r8 = r8.b()
            awnf r8 = (defpackage.awnf) r8
            r0.a = r6
            r0.d = r4
            java.lang.Object r8 = r8.h(r7, r0)
            if (r8 != r1) goto L5a
            goto L79
        L5a:
            awmp r8 = (defpackage.awmp) r8
            audu r7 = r8.a()
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r5.g(r6, r0)
            if (r8 == r1) goto L79
            r6 = r7
        L6b:
            java.util.List r7 = defpackage.fcva.b(r8)
            ekgb r7 = defpackage.ekfv.a(r7)
            asrg r8 = new asrg
            r8.<init>(r6, r7, r4)
            return r8
        L79:
            return r1
        L7a:
            java.lang.String r6 = "Recipient for private message in group must be of type PHONE_E164, not "
            java.lang.String r7 = "."
            java.lang.String r6 = defpackage.a.h(r8, r6, r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asro.d(awjb, awpx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.awjl r10, defpackage.axcm r11, defpackage.awpx r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.asrm
            if (r0 == 0) goto L13
            r0 = r13
            asrm r0 = (defpackage.asrm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            asrm r0 = new asrm
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L58
            if (r2 == r7) goto L4c
            if (r2 == r6) goto L44
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            defpackage.fctl.b(r13)
            return r13
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            defpackage.fctl.b(r13)
            return r13
        L40:
            defpackage.fctl.b(r13)
            return r13
        L44:
            java.lang.Object r10 = r0.a
            axcm r10 = (defpackage.axcm) r10
            defpackage.fctl.b(r13)
            goto L92
        L4c:
            awpx r12 = r0.f
            axcm r11 = r0.e
            java.lang.Object r10 = r0.a
            awjl r10 = (defpackage.awjl) r10
            defpackage.fctl.b(r13)
            goto L72
        L58:
            defpackage.fctl.b(r13)
            fcsu r13 = r9.a
            java.lang.Object r13 = r13.b()
            awjh r13 = (defpackage.awjh) r13
            r0.a = r10
            r0.e = r11
            r0.f = r12
            r0.d = r7
            java.lang.Object r13 = r13.e(r10, r0)
            if (r13 != r1) goto L72
            goto Lc4
        L72:
            awjb r13 = (defpackage.awjb) r13
            awja r2 = r13.b
            awja r7 = defpackage.awja.c
            if (r2 != r7) goto La0
            fcsu r12 = r9.b
            java.lang.Object r12 = r12.b()
            awnf r12 = (defpackage.awnf) r12
            r0.a = r11
            r0.e = r8
            r0.f = r8
            r0.d = r6
            java.lang.Object r13 = r12.k(r10, r0)
            if (r13 != r1) goto L91
            goto Lc4
        L91:
            r10 = r11
        L92:
            awpx r13 = (defpackage.awpx) r13
            r0.a = r8
            r0.d = r5
            java.lang.Object r10 = r9.f(r10, r13, r0)
            if (r10 != r1) goto L9f
            goto Lc4
        L9f:
            return r10
        La0:
            awja r10 = defpackage.awja.a
            if (r2 != r10) goto Lb6
            if (r12 == 0) goto Lb6
            r0.a = r8
            r0.e = r8
            r0.f = r8
            r0.d = r4
            java.lang.Object r10 = r9.d(r13, r12, r0)
            if (r10 != r1) goto Lb5
            goto Lc4
        Lb5:
            return r10
        Lb6:
            r0.a = r8
            r0.e = r8
            r0.f = r8
            r0.d = r3
            java.lang.Object r10 = r9.b(r13, r0)
            if (r10 != r1) goto Lc5
        Lc4:
            return r1
        Lc5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asro.e(awjl, axcm, awpx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0135, code lost:
    
        if (r15 != r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [asro] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0115 -> B:41:0x0116). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.axcm r13, defpackage.awpx r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asro.f(axcm, awpx, fcxy):java.lang.Object");
    }
}
