package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dawa extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dawc c;
    final /* synthetic */ Set d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawa(dawc dawcVar, Set set, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dawcVar;
        this.d = set;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dawa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r10 != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (((java.lang.Boolean) r10).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x000f, B:5:0x0014, B:44:0x00d8, B:8:0x001b, B:42:0x00ac, B:11:0x0022, B:36:0x0089, B:38:0x0091, B:40:0x0097, B:47:0x010b, B:14:0x0028, B:32:0x0074, B:34:0x007c, B:17:0x002e, B:30:0x0067, B:18:0x0032, B:26:0x004b, B:23:0x003c), top: B:53:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[Catch: all -> 0x0036, PHI: r1
      0x007c: PHI (r1v11 ekhx) = (r1v9 ekhx), (r1v12 ekhx) binds: [B:29:0x0065, B:33:0x007a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0036, blocks: (B:4:0x000f, B:5:0x0014, B:44:0x00d8, B:8:0x001b, B:42:0x00ac, B:11:0x0022, B:36:0x0089, B:38:0x0091, B:40:0x0097, B:47:0x010b, B:14:0x0028, B:32:0x0074, B:34:0x007c, B:17:0x002e, B:30:0x0067, B:18:0x0032, B:26:0x004b, B:23:0x003c), top: B:53:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x000f, B:5:0x0014, B:44:0x00d8, B:8:0x001b, B:42:0x00ac, B:11:0x0022, B:36:0x0089, B:38:0x0091, B:40:0x0097, B:47:0x010b, B:14:0x0028, B:32:0x0074, B:34:0x007c, B:17:0x002e, B:30:0x0067, B:18:0x0032, B:26:0x004b, B:23:0x003c), top: B:53:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dawa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dawa(this.c, this.d, fcxyVar);
    }
}
