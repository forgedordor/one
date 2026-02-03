package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akdk extends fcyz implements fdat {
    int a;
    final /* synthetic */ akdm b;
    final /* synthetic */ efoi c;
    final /* synthetic */ akdl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akdk(akdm akdmVar, efoi efoiVar, akdl akdlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akdmVar;
        this.c = efoiVar;
        this.d = akdlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akdk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (defpackage.fdxs.c(r5, r4) == r0) goto L13;
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
            if (r1 == r2) goto L21
            goto L43
        Ld:
            akdm r5 = r4.b
            efoi r1 = r4.c
            anty r5 = r5.b
            alqm r1 = r1.c
            eiju r5 = r5.p(r1)
            r4.a = r2
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 == r0) goto L46
        L21:
            akdm r1 = r4.b
            efoi r2 = r4.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r3 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            java.lang.String r2 = r2.a
            r3.<init>(r2)
            akdl r2 = r4.d
            ajln r1 = r1.a
            eiju r5 = r1.q(r3, r2, r5)
            r5.getClass()
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 != r0) goto L43
            goto L46
        L43:
            fctx r5 = defpackage.fctx.a
            return r5
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akdk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akdk(this.b, this.c, this.d, fcxyVar);
    }
}
