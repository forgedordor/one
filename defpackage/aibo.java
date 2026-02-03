package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibo extends fcyz implements fdat {
    int a;
    final /* synthetic */ aice b;
    final /* synthetic */ UUID c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibo(aice aiceVar, UUID uuid, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aiceVar;
        this.c = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aibo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (r10.b(r1, r2, r9) == r0) goto L41;
     */
    /* JADX WARN: Path cross not found for [B:32:0x008e, B:38:0x00c6], limit reached: 40 */
    /* JADX WARN: Path cross not found for [B:38:0x00c6, B:32:0x008e], limit reached: 40 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e7 -> B:12:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aibo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aibo aiboVar = new aibo(this.b, this.c, fcxyVar);
        aiboVar.d = obj;
        return aiboVar;
    }
}
