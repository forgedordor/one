package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agyy extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ agzc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agyy(agzc agzcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = agzcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agyy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0115, code lost:
    
        if (r12.l(r1, r11) != r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0109 A[PHI: r1
      0x0109: PHI (r1v6 com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) = 
      (r1v9 com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient)
      (r1v10 com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient)
     binds: [B:25:0x0107, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agyy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agyy(this.c, fcxyVar);
    }
}
