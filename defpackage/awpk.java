package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awpk extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    boolean f;
    int g;
    final /* synthetic */ awpo h;
    final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awpk(awpo awpoVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.h = awpoVar;
        this.i = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awpk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
    
        r10 = defpackage.fcvq.a;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r10 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0097 -> B:18:0x0099). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.g
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L1a
            boolean r1 = r9.f
            java.lang.Object r2 = r9.e
            java.lang.Object r3 = r9.d
            java.lang.Object r4 = r9.c
            java.lang.Object r5 = r9.b
            java.lang.Object r6 = r9.a
            defpackage.fctl.b(r10)
            goto L99
        L1a:
            defpackage.fctl.b(r10)
            goto L2d
        L1e:
            defpackage.fctl.b(r10)
            awpo r10 = r9.h
            r9.g = r2
            awzf r10 = r10.g
            java.lang.Object r10 = r10.e(r9)
            if (r10 == r0) goto Laf
        L2d:
            awpo r1 = r9.h
            boolean r2 = r9.i
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r3 = 10
            int r3 = defpackage.fcva.p(r10, r3)
            int r3 = defpackage.fcwa.a(r3)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 16
            int r3 = defpackage.fddu.f(r3, r5)
            r4.<init>(r3)
            java.util.Iterator r10 = r10.iterator()
            r6 = r1
            r1 = r2
            r3 = r4
            r4 = r10
        L50:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto Lae
            java.lang.Object r10 = r4.next()
            awxn r10 = (defpackage.awxn) r10
            r2 = r6
            awpo r2 = (defpackage.awpo) r2
            awyu r5 = r2.h
            awyv r5 = r5.a(r10)
            j$.util.Optional r7 = r5.c()
            r7.getClass()
            java.lang.Object r7 = defpackage.fdct.b(r7)
            java.lang.String r7 = (java.lang.String) r7
            axcm r8 = r10.b()
            boolean r5 = r5.f()
            if (r5 == 0) goto L9d
            if (r7 == 0) goto L9d
            axcm r10 = r10.b()
            r9.a = r6
            r9.b = r3
            r9.c = r4
            r9.d = r3
            r9.e = r8
            r9.f = r1
            r5 = 2
            r9.g = r5
            java.lang.Object r10 = r2.i(r10, r7, r1, r9)
            if (r10 == r0) goto Laf
            r5 = r3
            r2 = r8
        L99:
            java.util.Set r10 = (java.util.Set) r10
            r8 = r2
            goto La0
        L9d:
            fcvq r10 = defpackage.fcvq.a
            r5 = r3
        La0:
            fcti r2 = new fcti
            r2.<init>(r8, r10)
            java.lang.Object r10 = r2.a
            java.lang.Object r2 = r2.b
            r3.put(r10, r2)
            r3 = r5
            goto L50
        Lae:
            return r3
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awpk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awpk(this.h, this.i, fcxyVar);
    }
}
