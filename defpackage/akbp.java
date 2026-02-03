package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akbp extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ akbq c;
    final /* synthetic */ ConversationId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbp(akbq akbqVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = akbqVar;
        this.d = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akbp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0111, code lost:
    
        if (r8 == r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015e, code lost:
    
        if (r8 == r0) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[LOOP:0: B:44:0x00d3->B:46:0x00d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122 A[PHI: r1 r8
      0x0122: PHI (r1v8 java.util.ArrayList) = (r1v10 java.util.ArrayList), (r1v11 java.util.ArrayList) binds: [B:58:0x011f, B:6:0x0014] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r8v47 java.lang.Object) = (r8v42 java.lang.Object), (r8v0 java.lang.Object) binds: [B:58:0x011f, B:6:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akbp(this.c, this.d, fcxyVar);
    }
}
