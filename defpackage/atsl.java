package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atsl extends fcyz implements fdat {
    int a;
    final /* synthetic */ atsm b;
    final /* synthetic */ auey c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ audr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atsl(atsm atsmVar, auey aueyVar, ConversationIdType conversationIdType, audr audrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atsmVar;
        this.c = aueyVar;
        this.d = conversationIdType;
        this.e = audrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atsl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r1.b.a(r5, r2, r4) == r0) goto L16;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L2a
            goto L3f
        Ld:
            atsm r5 = r4.b
            auey r1 = r4.c
            aubq r1 = r1.l
            if (r1 != 0) goto L17
            aubq r1 = defpackage.aubq.a
        L17:
            attm r5 = r5.a
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = r4.d
            eiju r5 = r5.i(r1, r3)
            r5.getClass()
            r4.a = r2
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 == r0) goto L44
        L2a:
            atsm r1 = r4.b
            atrj r5 = (defpackage.atrj) r5
            r5.getClass()
            audr r2 = r4.e
            r3 = 2
            r4.a = r3
            atuo r1 = r1.b
            java.lang.Object r5 = r1.a(r5, r2, r4)
            if (r5 != r0) goto L3f
            goto L44
        L3f:
            cbcw r5 = defpackage.cbcw.i()
            return r5
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atsl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atsl(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
