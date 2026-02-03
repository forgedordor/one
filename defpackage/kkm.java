package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kkm extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ kkt c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkm(boolean z, kkt kktVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = kktVar;
        this.d = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kkm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r10 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r10 == r0) goto L14;
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
            goto L3d
        Ld:
            r6 = r9
            goto L25
        Lf:
            boolean r10 = r9.b
            if (r10 != 0) goto L2a
            kkt r10 = r9.c
            long r6 = r9.d
            r9.a = r2
            iqt r3 = r10.b
            r4 = 0
            r8 = r9
            java.lang.Object r10 = r3.d(r4, r6, r8)
            r6 = r8
            if (r10 == r0) goto L3c
        L25:
            kjo r10 = (defpackage.kjo) r10
            long r0 = r10.a
            goto L41
        L2a:
            r6 = r9
            kkt r10 = r6.c
            long r2 = r6.d
            r1 = 2
            r6.a = r1
            iqt r1 = r10.b
            r4 = 0
            java.lang.Object r10 = r1.d(r2, r4, r6)
            if (r10 != r0) goto L3d
        L3c:
            return r0
        L3d:
            kjo r10 = (defpackage.kjo) r10
            long r0 = r10.a
        L41:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new kkm(this.b, this.c, this.d, fcxyVar);
    }
}
