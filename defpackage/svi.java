package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class svi extends fcyz implements fdat {
    int a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ svl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svi(MessageId messageId, svl svlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = messageId;
        this.c = svlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((svi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if (r9 != r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        if (r9 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
    
        if (r1.g(r9, r8) == r0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e A[PHI: r9
      0x010e: PHI (r9v44 java.lang.Object) = (r9v39 java.lang.Object), (r9v0 java.lang.Object) binds: [B:49:0x010c, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new svi(this.b, this.c, fcxyVar);
    }
}
