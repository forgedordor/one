package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ammo extends fcyz implements fdat {
    Object a;
    Object b;
    boolean c;
    int d;
    final /* synthetic */ ammt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ammo(ammt ammtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = ammtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ammo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ff, code lost:
    
        if (r12 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014c, code lost:
    
        if (r12 != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01db, code lost:
    
        if (r12 != r0) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b6  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ammo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ammo(this.e, fcxyVar);
    }
}
