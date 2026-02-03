package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxoq implements dxnl {
    public static final eksp a = eksp.c("GnpSdk");
    private final ejwi b;
    private final ejwi c;
    private final dxpk d;
    private final dxnh e;
    private final fcyh f;
    private final dxni g;
    private final dxml h;
    private final dxmn i;
    private final dxpn j;
    private final diep k;
    private final dxgy l;
    private final fcsu m;
    private final dxmz n;
    private final Context o;
    private final dxtx p;
    private final dxnp q;
    private final fcsu r;
    private final fcsu s;
    private final feav t;
    private final dxud u;
    private final dxsc v;
    private final dxpd w;
    private final dxpd x;
    private final dxpf y;

    public dxoq(ejwi ejwiVar, ejwi ejwiVar2, dxud dxudVar, dxsc dxscVar, dxpk dxpkVar, dxnh dxnhVar, fcyh fcyhVar, dxpd dxpdVar, dxpd dxpdVar2, dxni dxniVar, dxml dxmlVar, dxmn dxmnVar, dxpf dxpfVar, dxpn dxpnVar, diep diepVar, dxgy dxgyVar, fcsu fcsuVar, dxmz dxmzVar, Context context, dxtx dxtxVar, dxnp dxnpVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        dxudVar.getClass();
        dxnhVar.getClass();
        fcyhVar.getClass();
        dxniVar.getClass();
        dxmlVar.getClass();
        dxmnVar.getClass();
        dxpfVar.getClass();
        diepVar.getClass();
        fcsuVar.getClass();
        dxmzVar.getClass();
        context.getClass();
        dxtxVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = ejwiVar;
        this.c = ejwiVar2;
        this.u = dxudVar;
        this.v = dxscVar;
        this.d = dxpkVar;
        this.e = dxnhVar;
        this.f = fcyhVar;
        this.w = dxpdVar;
        this.x = dxpdVar2;
        this.g = dxniVar;
        this.h = dxmlVar;
        this.i = dxmnVar;
        this.y = dxpfVar;
        this.j = dxpnVar;
        this.k = diepVar;
        this.l = dxgyVar;
        this.m = fcsuVar;
        this.n = dxmzVar;
        this.o = context;
        this.p = dxtxVar;
        this.q = dxnpVar;
        this.r = fcsuVar2;
        this.s = fcsuVar3;
        this.t = new feaz();
    }

    public static final /* synthetic */ Object h(dxoq dxoqVar, fdjx fdjxVar, evjz evjzVar, boolean z, dxha dxhaVar, fcxy fcxyVar) {
        return fbdf.a.get().e() ? dxoqVar.i(fdjxVar, evjzVar, z, dxhaVar, fcxyVar) : dxoqVar.k(fdjxVar, evjzVar, z, dxhaVar, fcxyVar);
    }

    private static final void l(dxoq dxoqVar, evjz evjzVar, dxha dxhaVar, String str) {
        ((ecoe) dxoqVar.p.g.get()).a(dxoqVar.o.getPackageName(), evjzVar.name(), str, dxhaVar.name());
    }

    private final dxpd m(dxha dxhaVar) {
        if (dxhaVar.a()) {
            return this.w;
        }
        if (dxhaVar.b()) {
            return this.x;
        }
        throw new IllegalStateException("Unsupported targetType for GnpRegistrationHandlerImpl");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dxnl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dxvi r5, defpackage.dxha r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dxof
            if (r0 == 0) goto L13
            r0 = r7
            dxof r0 = (defpackage.dxof) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxof r0 = new dxof
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dxha r6 = r0.d
            defpackage.fctl.b(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            dxsc r7 = r4.v
            dxrk r7 = r7.a(r6)
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r7.b(r5, r0)
            if (r7 == r1) goto L86
        L44:
            dxft r7 = (defpackage.dxft) r7
            boolean r5 = r7 instanceof defpackage.dxfo
            if (r5 == 0) goto L5c
            r5 = r7
            dxfo r5 = (defpackage.dxfo) r5
            java.lang.Throwable r5 = r5.a()
            eksp r0 = defpackage.dxoq.a
            ekrw r0 = r0.j()
            java.lang.String r1 = "Failed to get account from storage."
            defpackage.a.N(r0, r1, r5)
        L5c:
            java.lang.Object r5 = r7.c()
            dxhe r5 = (defpackage.dxhe) r5
            if (r5 != 0) goto L67
            ejud r5 = defpackage.ejud.a
            return r5
        L67:
            dxne r7 = new dxne
            r7.<init>()
            int r5 = r5.b()
            r7.b(r5)
            dxpd r5 = r4.m(r6)
            java.lang.String r5 = r5.c()
            r7.a = r5
            dxnr r5 = r7.a()
            ejwi r5 = defpackage.ejwi.i(r5)
            return r5
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxoq.a(dxvi, dxha, fcxy):java.lang.Object");
    }

    @Override // defpackage.dxnl
    public final Object b(evjz evjzVar, dxha dxhaVar, fcxy fcxyVar) {
        return fdin.a(this.f, new dxog(this, evjzVar, dxhaVar, null), fcxyVar);
    }

    @Override // defpackage.dxnl
    public final Object c(evjz evjzVar, dxha dxhaVar, fcxy fcxyVar) {
        return fdin.a(this.f, new dxop(this, evjzVar, dxhaVar, null), fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        if (r2 != r4) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Map r18, defpackage.dxha r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxoq.d(java.util.Map, dxha, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x015a, code lost:
    
        if (g(r22, r23, r7, r9) == r10) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Type inference failed for: r21v0, types: [dxoq] */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r22, java.util.Map r23, java.lang.String r24, defpackage.dxft r25, int r26, int r27, defpackage.dxvv r28, boolean r29, defpackage.evjz r30, defpackage.dxha r31, java.lang.String r32, defpackage.fcxy r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxoq.e(java.util.List, java.util.Map, java.lang.String, dxft, int, int, dxvv, boolean, evjz, dxha, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [dxni] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r17, java.util.Map r18, java.lang.String r19, defpackage.evfy r20, defpackage.dxha r21, java.util.Map r22, defpackage.evjz r23, java.lang.String r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxoq.f(java.util.List, java.util.Map, java.lang.String, evfy, dxha, java.util.Map, evjz, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r6, java.util.Map r7, defpackage.dxha r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.dxoo
            if (r0 == 0) goto L13
            r0 = r9
            dxoo r0 = (defpackage.dxoo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxoo r0 = new dxoo
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r0 = r0.c
            if (r0 == 0) goto L3c
            r6 = 1
            if (r0 != r6) goto L34
            defpackage.fctl.b(r9)     // Catch: java.lang.Exception -> L26
            goto Lb0
        L26:
            r6 = move-exception
            eksp r7 = defpackage.dxoq.a
            ekrw r7 = r7.j()
            java.lang.String r8 = "Failed to report registration results"
            defpackage.a.N(r7, r8, r6)
            goto Lb0
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            defpackage.fctl.b(r9)
            boolean r8 = r8.a()
            if (r8 != 0) goto L46
            goto Lb0
        L46:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r9 = 10
            int r0 = defpackage.fcva.p(r6, r9)
            int r0 = defpackage.fcwa.a(r0)
            r1 = 16
            int r0 = defpackage.fddu.f(r0, r1)
            r8.<init>(r0)
            java.util.Iterator r0 = r6.iterator()
        L5f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r2 = r0.next()
            r3 = r2
            dxvi r3 = (defpackage.dxvi) r3
            dxfx r3 = new dxfx
            fctx r4 = defpackage.fctx.a
            r3.<init>(r4)
            r8.put(r2, r3)
            goto L5f
        L77:
            java.util.Set r7 = r7.keySet()
            java.util.Set r6 = defpackage.fcva.av(r6)
            java.util.Set r6 = defpackage.fcwm.e(r7, r6)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            int r8 = defpackage.fcva.p(r6, r9)
            int r8 = defpackage.fcwa.a(r8)
            int r8 = defpackage.fddu.f(r8, r1)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L98:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r6.next()
            r9 = r8
            dxvi r9 = (defpackage.dxvi) r9
            dxfx r9 = new dxfx
            fctx r0 = defpackage.fctx.a
            r9.<init>(r0)
            r7.put(r8, r9)
            goto L98
        Lb0:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxoq.g(java.util.List, java.util.Map, dxha, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r12 == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [dxoq] */
    /* JADX WARN: Type inference failed for: r8v0, types: [fdjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4, types: [feav] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.fdjx r8, defpackage.evjz r9, boolean r10, defpackage.dxha r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.dxoj
            if (r0 == 0) goto L13
            r0 = r12
            dxoj r0 = (defpackage.dxoj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dxoj r0 = new dxoj
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.c
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4d
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r8 = r6.a
            feav r8 = (defpackage.feav) r8
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L2f
            goto L80
        L2f:
            r0 = move-exception
            r9 = r0
            goto L84
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            boolean r10 = r6.b
            feaz r8 = r6.h
            dxha r11 = r6.g
            evjz r9 = r6.f
            java.lang.Object r1 = r6.a
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r12)
            r3 = r9
            r9 = r2
            r2 = r1
            goto L6b
        L4d:
            defpackage.fctl.b(r12)
            feav r12 = r7.t
            r6.a = r8
            r6.f = r9
            r6.g = r11
            r1 = r12
            feaz r1 = (defpackage.feaz) r1
            r6.h = r1
            r6.b = r10
            r6.e = r3
            java.lang.Object r1 = r12.b(r6)
            if (r1 == r0) goto L88
            r3 = r9
            r9 = r2
            r2 = r8
            r8 = r12
        L6b:
            r4 = r10
            r5 = r11
            r6.a = r8     // Catch: java.lang.Throwable -> L2f
            r10 = 0
            r6.f = r10     // Catch: java.lang.Throwable -> L2f
            r6.g = r10     // Catch: java.lang.Throwable -> L2f
            r6.h = r10     // Catch: java.lang.Throwable -> L2f
            r6.e = r9     // Catch: java.lang.Throwable -> L2f
            r1 = r7
            java.lang.Object r12 = r1.k(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2f
            if (r12 != r0) goto L80
            goto L88
        L80:
            r8.d()
            return r12
        L84:
            r8.d()
            throw r9
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxoq.i(fdjx, evjz, boolean, dxha, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fdjx r17, defpackage.evjz r18, java.util.List r19, java.util.Map r20, boolean r21, defpackage.dxha r22, defpackage.dxvv r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxoq.j(fdjx, evjz, java.util.List, java.util.Map, boolean, dxha, dxvv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [dxoq] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fdjx r11, defpackage.evjz r12, boolean r13, defpackage.dxha r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxoq.k(fdjx, evjz, boolean, dxha, fcxy):java.lang.Object");
    }
}
