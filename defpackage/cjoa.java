package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjoa extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cjob c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ Recipient e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjoa(cjob cjobVar, ConversationIdType conversationIdType, Recipient recipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cjobVar;
        this.d = conversationIdType;
        this.e = recipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjoa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (r10 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjoa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjoa(this.c, this.d, this.e, fcxyVar);
    }
}
