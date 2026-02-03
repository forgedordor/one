package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aobi extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ anty d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ aobn g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aobi(anty antyVar, List list, List list2, int i, aobn aobnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = antyVar;
        this.e = list;
        this.f = list2;
        this.h = i;
        this.g = aobnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aobi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (r14 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
    
        if (r14 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0100, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d1 -> B:46:0x00f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00eb -> B:43:0x00ee). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aobi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aobi(this.d, this.e, this.f, this.h, this.g, fcxyVar);
    }
}
