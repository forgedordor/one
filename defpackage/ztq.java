package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ztq extends fcyz implements fdat {
    int a;
    final /* synthetic */ RbmSuggestionData b;
    final /* synthetic */ ztv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztq(RbmSuggestionData rbmSuggestionData, ztv ztvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = rbmSuggestionData;
        this.c = ztvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ztq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r12 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        if (r12 != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        if (r12 != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (r12 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010e, code lost:
    
        if (r12 != r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: ajlf -> 0x0022, PHI: r12
      0x00ef: PHI (r12v33 java.lang.Object) = (r12v28 java.lang.Object), (r12v0 java.lang.Object) binds: [B:36:0x00ec, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {ajlf -> 0x0022, blocks: (B:8:0x0018, B:41:0x0111, B:9:0x001d, B:38:0x00ef, B:35:0x00dc), top: B:46:0x000e }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ztq(this.b, this.c, fcxyVar);
    }
}
