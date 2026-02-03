package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccqg extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ccqh d;
    final /* synthetic */ ccep e;
    final /* synthetic */ MessageCoreData f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccqg(ccqh ccqhVar, ccep ccepVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = ccqhVar;
        this.e = ccepVar;
        this.f = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccqg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (defpackage.cbyy.a(r2, (defpackage.ccep) r1, r4, r5, r6, r8) == r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r9)
            goto L54
        Ld:
            java.lang.Object r1 = r8.b
            java.lang.Object r2 = r8.a
            defpackage.fctl.b(r9)
            goto L2f
        L15:
            defpackage.fctl.b(r9)
            ccqh r9 = r8.d
            ccep r1 = r8.e
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r3 = r8.f
            cbyz r4 = r9.a
            r8.a = r4
            r8.b = r1
            r8.c = r2
            ccpm r9 = r9.b
            java.lang.Object r9 = r9.e(r3)
            if (r9 == r0) goto L57
            r2 = r4
        L2f:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r3 = r8.f
            r4 = r9
            ccpl r4 = (defpackage.ccpl) r4
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9 = r3.A()
            java.lang.String r5 = r9.a()
            r5.getClass()
            akim r6 = defpackage.akim.f
            r9 = 0
            r8.a = r9
            r8.b = r9
            r9 = 2
            r8.c = r9
            r3 = r1
            ccep r3 = (defpackage.ccep) r3
            r7 = r8
            java.lang.Object r9 = defpackage.cbyy.a(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L54
            goto L57
        L54:
            fctx r9 = defpackage.fctx.a
            return r9
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccqg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccqg(this.d, this.e, this.f, fcxyVar);
    }
}
