package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgvm {
    public final dopy a;
    private final egej b;

    public cgvm(egej egejVar, dopy dopyVar, fdjx fdjxVar, cden cdenVar) {
        egejVar.getClass();
        fdjxVar.getClass();
        cdenVar.getClass();
        this.b = egejVar;
        this.a = dopyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.efwo r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cgvk
            if (r0 == 0) goto L13
            r0 = r6
            cgvk r0 = (defpackage.cgvk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgvk r0 = new cgvk
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            egej r6 = r4.b
            com.google.common.util.concurrent.ListenableFuture r5 = r6.b(r5)
            eiju r5 = defpackage.eiju.g(r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.String r6 = (java.lang.String) r6
            dlsu r5 = new dlsu
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgvm.a(efwo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.efwo r7, java.util.List r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cgvl
            if (r0 == 0) goto L13
            r0 = r9
            cgvl r0 = (defpackage.cgvl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cgvl r0 = new cgvl
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            dopy r7 = r0.e
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r9)
            goto L4e
        L3a:
            defpackage.fctl.b(r9)
            dopy r9 = r6.a
            r0.a = r8
            r0.e = r9
            r0.d = r4
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 == r1) goto L5f
            r5 = r9
            r9 = r7
            r7 = r5
        L4e:
            dlsu r9 = (defpackage.dlsu) r9
            r2 = 0
            r0.a = r2
            r0.e = r2
            r0.d = r3
            java.lang.Object r7 = r7.c(r9, r8, r0)
            if (r7 != r1) goto L5e
            goto L5f
        L5e:
            return r7
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgvm.b(efwo, java.util.List, fcxy):java.lang.Object");
    }
}
