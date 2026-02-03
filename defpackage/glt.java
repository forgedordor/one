package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glt extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ddp d;
    final /* synthetic */ List e;
    final /* synthetic */ hri f;
    final /* synthetic */ hrg g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glt(ddp ddpVar, List list, hri hriVar, hrg hrgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = ddpVar;
        this.e = list;
        this.f = hriVar;
        this.g = hrgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((glt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[PHI: r1 r4 r13
      0x0063: PHI (r1v3 java.lang.Object) = (r1v4 java.lang.Object), (r1v6 java.lang.Object) binds: [B:9:0x0061, B:6:0x0014] A[DONT_GENERATE, DONT_INLINE]
      0x0063: PHI (r4v2 fdjx) = (r4v3 fdjx), (r4v5 fdjx) binds: [B:9:0x0061, B:6:0x0014] A[DONT_GENERATE, DONT_INLINE]
      0x0063: PHI (r13v3 fdkf) = (r13v6 fdkf), (r13v7 fdkf) binds: [B:9:0x0061, B:6:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0070 -> B:8:0x003d). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto L14
            java.lang.Object r1 = r12.a
            java.lang.Object r4 = r12.h
            fdjx r4 = (defpackage.fdjx) r4
            defpackage.fctl.b(r13)
            goto L3d
        L14:
            java.lang.Object r1 = r12.b
            java.lang.Object r4 = r12.a
            java.lang.Object r5 = r12.h
            fdjx r5 = (defpackage.fdjx) r5
            defpackage.fctl.b(r13)
            r13 = r1
            r1 = r4
            r4 = r5
            goto L63
        L23:
            defpackage.fctl.b(r13)
            java.lang.Object r13 = r12.h
            r4 = r13
            fdjx r4 = (defpackage.fdjx) r4
            java.lang.Float r13 = new java.lang.Float
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r13.<init>(r1)
            dgi r1 = new dgi
            r5 = 1058642330(0x3f19999a, float:0.6)
            r6 = 1128792064(0x43480000, float:200.0)
            r1.<init>(r5, r6, r13)
        L3d:
            gls r5 = new gls
            ddp r6 = r12.d
            r7 = r1
            dgi r7 = (defpackage.dgi) r7
            java.util.List r8 = r12.e
            hri r9 = r12.f
            hrg r10 = r12.g
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13 = 3
            fdkf r13 = defpackage.fdil.c(r4, r2, r5, r13)
            r12.h = r4
            r12.a = r1
            r12.b = r13
            r12.c = r3
            r5 = 650(0x28a, double:3.21E-321)
            java.lang.Object r5 = defpackage.fdkj.c(r5, r12)
            if (r5 == r0) goto L73
        L63:
            r12.h = r4
            r12.a = r1
            r12.b = r2
            r5 = 2
            r12.c = r5
            java.lang.Object r13 = r13.c(r12)
            if (r13 == r0) goto L73
            goto L3d
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        glt gltVar = new glt(this.d, this.e, this.f, this.g, fcxyVar);
        gltVar.h = obj;
        return gltVar;
    }
}
