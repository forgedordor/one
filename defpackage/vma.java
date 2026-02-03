package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vma extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ List c;
    final /* synthetic */ vmg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vma(List list, vmg vmgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = list;
        this.d = vmgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vma) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r3.c(r1, r6) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r7.d(r1, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Le
            defpackage.fctl.b(r7)
            goto L7f
        Le:
            java.lang.Object r1 = r6.a
            defpackage.fctl.b(r7)
            goto L6a
        L14:
            defpackage.fctl.b(r7)
            java.util.List r7 = r6.c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r7 = r7.iterator()
        L27:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r7.next()
            r5 = r4
            ajlt r5 = (defpackage.ajlt) r5
            amvr r5 = r5.g()
            java.lang.String r5 = r5.b()
            boolean r5 = defpackage.le.t(r5)
            if (r5 == 0) goto L46
            r1.add(r4)
            goto L27
        L46:
            r3.add(r4)
            goto L27
        L4a:
            fcti r7 = new fcti
            r7.<init>(r1, r3)
            java.lang.Object r1 = r7.a
            java.lang.Object r7 = r7.b
            java.util.List r1 = (java.util.List) r1
            java.util.List r7 = (java.util.List) r7
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L69
            vmg r3 = r6.d
            r6.a = r7
            r6.b = r2
            java.lang.Object r1 = r3.c(r1, r6)
            if (r1 == r0) goto L7e
        L69:
            r1 = r7
        L6a:
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L7f
            vmg r7 = r6.d
            r2 = 0
            r6.a = r2
            r2 = 2
            r6.b = r2
            java.lang.Object r7 = r7.d(r1, r6)
            if (r7 != r0) goto L7f
        L7e:
            return r0
        L7f:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vma.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vma(this.c, this.d, fcxyVar);
    }
}
