package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csxx extends fcyz implements fdat {
    long a;
    Object b;
    int c;
    final /* synthetic */ csya d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csxx(csya csyaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = csyaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csxx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fd, code lost:
    
        if (r14.e.d(r1, r13) != r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csxx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csxx(this.d, fcxyVar);
    }
}
