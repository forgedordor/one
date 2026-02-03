package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxrf extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxrh b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ evfy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxrf(dxrh dxrhVar, List list, String str, evfy evfyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxrhVar;
        this.c = list;
        this.d = str;
        this.e = evfyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxrf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r10 == r0) goto L16;
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
            if (r1 == 0) goto Lf
            if (r1 == r2) goto Ld
            goto L3b
        Ld:
            r6 = r9
            goto L22
        Lf:
            dxrh r3 = r9.b
            java.util.List r4 = r9.c
            java.lang.String r5 = r9.d
            evfy r6 = r9.e
            r9.a = r2
            r7 = 0
            r8 = r9
            java.lang.Object r10 = r3.g(r4, r5, r6, r7, r8)
            r6 = r8
            if (r10 == r0) goto L3e
        L22:
            dxft r10 = (defpackage.dxft) r10
            boolean r1 = r10 instanceof defpackage.dxqm
            if (r1 == 0) goto L3d
            dxrh r1 = r6.b
            java.util.List r2 = r6.c
            java.lang.String r3 = r6.d
            evfy r4 = r6.e
            r10 = 2
            r6.a = r10
            r5 = 1
            java.lang.Object r10 = r1.g(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L3b
            goto L3e
        L3b:
            dxft r10 = (defpackage.dxft) r10
        L3d:
            return r10
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxrf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxrf(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
