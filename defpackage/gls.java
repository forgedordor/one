package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gls extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ dgi c;
    final /* synthetic */ List d;
    final /* synthetic */ hri e;
    final /* synthetic */ hrg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gls(ddp ddpVar, dgi dgiVar, List list, hri hriVar, hrg hrgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = dgiVar;
        this.d = list;
        this.e = hriVar;
        this.f = hrgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gls) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r10.e(r2, r9) == r0) goto L17;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            r2 = 1
            defpackage.fctl.b(r10)
            if (r1 == 0) goto Le
            r7 = r9
            if (r1 == r2) goto L25
            goto L4e
        Le:
            ddp r3 = r9.b
            java.lang.Float r4 = new java.lang.Float
            r10 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r10)
            dgi r5 = r9.c
            r9.a = r2
            r6 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r10 = defpackage.ddp.k(r3, r4, r5, r6, r7, r8)
            if (r10 == r0) goto L60
        L25:
            ddx r10 = (defpackage.ddx) r10
            int r10 = r10.a
            r1 = 2
            if (r10 != r1) goto L5d
            hri r10 = r7.e
            int r3 = r10.c()
            int r3 = r3 + r2
            java.util.List r2 = r7.d
            int r2 = r2.size()
            int r3 = r3 % r2
            r10.i(r3)
            ddp r10 = r7.b
            java.lang.Float r2 = new java.lang.Float
            r3 = 0
            r2.<init>(r3)
            r7.a = r1
            java.lang.Object r10 = r10.e(r2, r9)
            if (r10 != r0) goto L4e
            goto L60
        L4e:
            hrg r10 = r7.f
            float r0 = r10.c()
            r1 = 1119092736(0x42b40000, float:90.0)
            float r0 = r0 + r1
            r1 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 % r1
            r10.h(r0)
        L5d:
            fctx r10 = defpackage.fctx.a
            return r10
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gls.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gls(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
