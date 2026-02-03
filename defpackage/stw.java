package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class stw extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ stx d;
    final /* synthetic */ MessageCoreData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stw(stx stxVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = stxVar;
        this.e = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((stw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if (r11 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r11 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0096 -> B:17:0x0099). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.c
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 == r2) goto L12
            java.lang.Object r1 = r10.b
            java.lang.Object r2 = r10.a
            defpackage.fctl.b(r11)
            goto L99
        L12:
            defpackage.fctl.b(r11)
            goto L27
        L16:
            defpackage.fctl.b(r11)
            stx r11 = r10.d
            eksp r1 = defpackage.stx.a
            r10.c = r2
            sub r11 = r11.b
            java.lang.Object r11 = r11.b(r10)
            if (r11 == r0) goto L9f
        L27:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L9c
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r11 = r10.e
            java.util.List r11 = r11.M()
            fdev r11 = defpackage.fcva.ax(r11)
            stv r1 = new stv
            r1.<init>()
            fdeq r3 = new fdeq
            r3.<init>(r11, r2, r1)
            stx r11 = r10.d
            fdep r1 = new fdep
            r1.<init>(r3)
            r2 = r11
        L4b:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L9c
            java.lang.Object r11 = r1.next()
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r11 = (com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData) r11
            eksp r3 = defpackage.stx.a
            ekrw r3 = r3.h()
            eksl r3 = (defpackage.eksl) r3
            java.lang.String r4 = "Triggering automatic transcription of incoming message part."
            r3.q(r4)
            r3 = r2
            stx r3 = (defpackage.stx) r3
            aoof r3 = r3.c
            aoog r4 = new aoog
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r11.A()
            r5.getClass()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6 = r11.B()
            r6.getClass()
            java.lang.String r7 = r11.W()
            r7.getClass()
            android.net.Uri r8 = r11.t()
            r8.getClass()
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.a = r2
            r10.b = r1
            r11 = 2
            r10.c = r11
            java.lang.Object r11 = r3.b(r4, r10)
            if (r11 != r0) goto L99
            goto L9f
        L99:
            aooe r11 = (defpackage.aooe) r11
            goto L4b
        L9c:
            fctx r11 = defpackage.fctx.a
            return r11
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new stw(this.d, this.e, fcxyVar);
    }
}
