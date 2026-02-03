package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpb implements dxml {
    public static final eksp a = eksp.c("GnpSdk");
    public final dxnp b;
    private final dxni c;
    private final dxrk d;
    private final fcyh e;
    private final dxpk f;
    private final dxtx g;
    private final Context h;
    private final dxpn i;
    private final dxmz j;
    private final dxnh k;
    private final dxmn l;
    private final dxml m;
    private final dxgy n;
    private final String o;
    private final dxpf p;
    private final dxpd q;

    public dxpb(dxni dxniVar, dxrk dxrkVar, fcyh fcyhVar, dxpf dxpfVar, dxpd dxpdVar, dxpk dxpkVar, dxtx dxtxVar, Context context, dxpn dxpnVar, dxmz dxmzVar, dxnh dxnhVar, dxmn dxmnVar, dxml dxmlVar, dxgy dxgyVar, dxnp dxnpVar) {
        dxniVar.getClass();
        dxrkVar.getClass();
        fcyhVar.getClass();
        dxpfVar.getClass();
        dxtxVar.getClass();
        context.getClass();
        dxmzVar.getClass();
        dxnhVar.getClass();
        dxmnVar.getClass();
        this.c = dxniVar;
        this.d = dxrkVar;
        this.e = fcyhVar;
        this.p = dxpfVar;
        this.q = dxpdVar;
        this.f = dxpkVar;
        this.g = dxtxVar;
        this.h = context;
        this.i = dxpnVar;
        this.j = dxmzVar;
        this.k = dxnhVar;
        this.l = dxmnVar;
        this.m = dxmlVar;
        this.n = dxgyVar;
        this.b = dxnpVar;
        this.o = "GNP_REGISTRATION";
    }

    @Override // defpackage.dxml
    public final int a() {
        return 15;
    }

    @Override // defpackage.dxml
    public final long b() {
        return 0L;
    }

    @Override // defpackage.dxml
    public final Long c() {
        return null;
    }

    @Override // defpackage.dxml
    public final Object d(Bundle bundle, fcxy fcxyVar) {
        return fdin.a(this.e, new dxou(this, bundle, null), fcxyVar);
    }

    @Override // defpackage.dxml
    public final String e() {
        return this.o;
    }

    @Override // defpackage.dxml
    public final boolean f() {
        return false;
    }

    @Override // defpackage.dxml
    public final boolean g() {
        return true;
    }

    @Override // defpackage.dxml
    public final int h() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dxov
            if (r0 == 0) goto L13
            r0 = r5
            dxov r0 = (defpackage.dxov) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxov r0 = new dxov
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            dxrk r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L89
        L3c:
            dxft r5 = (defpackage.dxft) r5
            boolean r0 = r5 instanceof defpackage.dxfx
            if (r0 == 0) goto L7c
            dxfx r5 = (defpackage.dxfx) r5
            java.lang.Object r5 = r5.a
            java.util.List r5 = (java.util.List) r5
            r0 = 10
            int r0 = defpackage.fcva.p(r5, r0)
            int r0 = defpackage.fcwa.a(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = 16
            int r0 = defpackage.fddu.f(r0, r2)
            r1.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L61:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r5.next()
            r2 = r0
            dxhe r2 = (defpackage.dxhe) r2
            dxvi r2 = r2.s()
            r1.put(r2, r0)
            goto L61
        L76:
            dxfx r5 = new dxfx
            r5.<init>(r1)
            return r5
        L7c:
            boolean r0 = r5 instanceof defpackage.dxfo
            if (r0 == 0) goto L83
            dxfo r5 = (defpackage.dxfo) r5
            return r5
        L83:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxpb.i(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r9.a(r11, r12, r13, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.dxft r9, java.util.List r10, java.util.Map r11, defpackage.evjz r12, defpackage.dxha r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.dxow
            if (r0 == 0) goto L13
            r0 = r14
            dxow r0 = (defpackage.dxow) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dxow r0 = new dxow
            r0.<init>(r8, r14)
        L18:
            java.lang.Object r14 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r14)
            goto L89
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            dxha r13 = r0.f
            java.lang.Object r11 = r0.b
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r14)
            goto L72
        L3c:
            defpackage.fctl.b(r14)
            dxtx r14 = r8.g
            android.content.Context r2 = r8.h
            java.lang.String r5 = r2.getPackageName()
            java.lang.String r12 = r12.name()
            java.lang.String r6 = r13.name()
            java.lang.String r7 = "FAILURE"
            r14.e(r5, r7, r12, r6)
            int r12 = r10.size()
            java.lang.String r2 = r2.getPackageName()
            r14.f(r12, r2, r7)
            r9.getClass()
            dxfo r9 = (defpackage.dxfo) r9
            r0.a = r10
            r0.b = r11
            r0.f = r13
            r0.e = r4
            java.lang.Object r9 = r8.m(r0)
            if (r9 == r1) goto L8c
        L72:
            dxpf r9 = r8.p
            dxox r12 = new dxox
            r12.<init>(r10)
            r10 = 0
            r0.a = r10
            r0.b = r10
            r0.f = r10
            r0.e = r3
            java.lang.Object r9 = r9.a(r11, r12, r13, r0)
            if (r9 != r1) goto L89
            goto L8c
        L89:
            fctx r9 = defpackage.fctx.a
            return r9
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxpb.j(dxft, java.util.List, java.util.Map, evjz, dxha, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0220 A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v3, types: [dxni] */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v0, types: [dxpb] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [dxni] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v10, types: [dxft] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.List r18, java.util.Map r19, defpackage.evjz r20, defpackage.dxha r21, defpackage.dxnj r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxpb.k(java.util.List, java.util.Map, evjz, dxha, dxnj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r10 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r8.b(17, r6) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.dxft r8, java.util.List r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.dxpa
            if (r0 == 0) goto L13
            r0 = r10
            dxpa r0 = (defpackage.dxpa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxpa r0 = new dxpa
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.fctl.b(r10)
            goto L72
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.fctl.b(r10)
            goto L82
        L37:
            defpackage.fctl.b(r10)
            dxgy r10 = r7.n
            dxgw r10 = (defpackage.dxgw) r10
            int r10 = r10.g
            if (r10 == 0) goto L75
            boolean r10 = r8.i()
            if (r10 == 0) goto L4f
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L4f
            goto L75
        L4f:
            boolean r8 = r8.i()
            if (r8 == 0) goto L82
            dxmn r1 = r7.l
            r8 = r2
            dxml r2 = r7.m
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r9 = r2
            dxob r9 = (defpackage.dxob) r9
            long r9 = r9.a
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r9)
            r6.c = r8
            r3 = 0
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6)
            if (r10 == r0) goto L81
        L72:
            dxft r10 = (defpackage.dxft) r10
            goto L82
        L75:
            dxmn r8 = r7.l
            r6.c = r3
            r9 = 17
            java.lang.Object r8 = defpackage.dxmm.a(r8, r9, r6)
            if (r8 != r0) goto L82
        L81:
            return r0
        L82:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxpb.l(dxft, java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dxoz
            if (r0 == 0) goto L13
            r0 = r5
            dxoz r0 = (defpackage.dxoz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxoz r0 = new dxoz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r0 = r0.c
            if (r0 == 0) goto L3a
            r1 = 1
            if (r0 != r1) goto L32
            defpackage.fctl.b(r5)     // Catch: java.lang.Exception -> L25
            goto L3d
        L25:
            r5 = move-exception
            eksp r0 = defpackage.dxpb.a
            ekrw r0 = r0.j()
            java.lang.String r1 = "Failed to report registration results"
            defpackage.a.N(r0, r1, r5)
            goto L3d
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L3a:
            defpackage.fctl.b(r5)
        L3d:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxpb.m(fcxy):java.lang.Object");
    }
}
