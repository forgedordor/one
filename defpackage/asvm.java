package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class asvm extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ List e;
    final /* synthetic */ asvn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asvm(List list, asvn asvnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = list;
        this.f = asvnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((asvm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0043 -> B:11:0x0044). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.d
            if (r1 == 0) goto L10
            java.lang.Object r1 = r4.c
            java.lang.Object r2 = r4.b
            java.lang.Object r3 = r4.a
            defpackage.fctl.b(r5)
            goto L44
        L10:
            defpackage.fctl.b(r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.List r1 = r4.e
            java.util.Iterator r1 = r1.iterator()
            r2 = r1
            r1 = r5
        L20:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r2.next()
            java.util.List r5 = (java.util.List) r5
            asvn r3 = r4.f
            asxy r3 = r3.a
            eiju r5 = r3.a(r5)
            r4.a = r1
            r4.b = r2
            r4.c = r1
            r3 = 1
            r4.d = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 == r0) goto L4e
            r3 = r1
        L44:
            r5.getClass()
            java.util.Map r5 = (java.util.Map) r5
            r1.putAll(r5)
            r1 = r3
            goto L20
        L4e:
            return r0
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asvm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new asvm(this.e, this.f, fcxyVar);
    }
}
