package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlqj {
    public static final Object a(isn isnVar, fdap fdapVar, boolean z, fcxy fcxyVar) {
        Object objA = fdjy.a(new dlqh(isnVar, z, fdapVar, new dlqn(isnVar), null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r14 != r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[PHI: r13 r14
      0x004c: PHI (r13v1 ire) = (r13v10 ire), (r13v11 ire) binds: [B:18:0x0049, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r14v2 java.lang.Object) = (r14v8 java.lang.Object), (r14v1 java.lang.Object) binds: [B:18:0x0049, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0093 -> B:35:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ire r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof defpackage.dlqi
            if (r0 == 0) goto L13
            r0 = r14
            dlqi r0 = (defpackage.dlqi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlqi r0 = new dlqi
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L3c
            if (r2 == r6) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r13 = r0.a
            defpackage.fctl.b(r14)
            goto L95
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            java.lang.Object r13 = r0.a
            defpackage.fctl.b(r14)
            goto L4c
        L3c:
            defpackage.fctl.b(r14)
        L3f:
            iru r14 = defpackage.iru.a
            r0.a = r13
            r0.c = r6
            java.lang.Object r14 = r13.r(r14, r0)
            if (r14 != r1) goto L4c
            goto Lb0
        L4c:
            irs r14 = (defpackage.irs) r14
            java.util.List r14 = r14.a
            int r2 = r14.size()
            r7 = r5
        L55:
            if (r7 >= r2) goto Lb4
            java.lang.Object r8 = r14.get(r7)
            ise r8 = (defpackage.ise) r8
            boolean r8 = defpackage.irt.e(r8)
            if (r8 != 0) goto Lb1
            int r2 = r14.size()
            r7 = r5
        L68:
            if (r7 >= r2) goto L89
            java.lang.Object r8 = r14.get(r7)
            ise r8 = (defpackage.ise) r8
            boolean r9 = r8.c()
            if (r9 != 0) goto L88
            long r9 = r13.b()
            long r11 = r13.a()
            boolean r8 = defpackage.irt.g(r8, r9, r11)
            if (r8 == 0) goto L85
            goto L88
        L85:
            int r7 = r7 + 1
            goto L68
        L88:
            return r3
        L89:
            iru r14 = defpackage.iru.c
            r0.a = r13
            r0.c = r4
            java.lang.Object r14 = r13.r(r14, r0)
            if (r14 == r1) goto Lb0
        L95:
            irs r14 = (defpackage.irs) r14
            java.util.List r14 = r14.a
            int r2 = r14.size()
            r7 = r5
        L9e:
            if (r7 >= r2) goto L3f
            java.lang.Object r8 = r14.get(r7)
            ise r8 = (defpackage.ise) r8
            boolean r8 = r8.c()
            if (r8 == 0) goto Lad
            return r3
        Lad:
            int r7 = r7 + 1
            goto L9e
        Lb0:
            return r1
        Lb1:
            int r7 = r7 + 1
            goto L55
        Lb4:
            java.lang.Object r13 = defpackage.fcva.P(r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlqj.b(ire, fcxy):java.lang.Object");
    }
}
