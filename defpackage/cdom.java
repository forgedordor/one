package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdom extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdon b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdom(cdon cdonVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdonVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdom) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r4.c(r1, r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r4.b(r1, r3) == r0) goto L12;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Lb
            goto L2c
        Lb:
            cdon r4 = r3.b
            aptm r1 = r4.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L20
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r3.c
            r3.a = r2
            java.lang.Object r4 = r4.b(r1, r3)
            if (r4 != r0) goto L2c
            goto L2b
        L20:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r3.c
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r4.c(r1, r3)
            if (r4 != r0) goto L2c
        L2b:
            return r0
        L2c:
            fctx r4 = defpackage.fctx.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdom.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdom(this.b, this.c, fcxyVar);
    }
}
