package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctfk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctfl b;
    final /* synthetic */ ConversationId c;
    final /* synthetic */ ResolvedRecipient d;
    final /* synthetic */ crwz e;
    final /* synthetic */ String f;
    final /* synthetic */ boolean g;
    final /* synthetic */ crvz h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctfk(ctfl ctflVar, ConversationId conversationId, ResolvedRecipient resolvedRecipient, crwz crwzVar, String str, boolean z, crvz crvzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctflVar;
        this.c = conversationId;
        this.d = resolvedRecipient;
        this.e = crwzVar;
        this.f = str;
        this.g = z;
        this.h = crvzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctfk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        if (r1.a(r3, r10) == r0) goto L15;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            r2 = 1
            defpackage.fctl.b(r11)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L33
            goto L73
        Ld:
            ctfl r11 = r10.b
            fcsu r11 = r11.d
            java.lang.Object r11 = r11.b()
            r3 = r11
            ajln r3 = (defpackage.ajln) r3
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = r10.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = r10.d
            crwz r6 = r10.e
            java.lang.String r7 = r10.f
            boolean r8 = r10.g
            crvz r9 = r10.h
            eiju r11 = r3.D(r4, r5, r6, r7, r8, r9)
            r11.getClass()
            r10.a = r2
            java.lang.Object r11 = defpackage.fdxs.c(r11, r10)
            if (r11 == r0) goto L76
        L33:
            boolean r11 = r10.g
            if (r11 == 0) goto L73
            ctfl r11 = r10.b
            fcsu r1 = r11.e
            java.lang.Object r1 = r1.b()
            aaft r1 = (defpackage.aaft) r1
            aafw r3 = new aafw
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r4 = r10.d
            alqm r4 = r4.g()
            alqj r4 = r4.F()
            java.lang.String r4 = r4.a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5 = 0
            r2[r5] = r4
            android.content.Context r11 = r11.a
            r4 = 2132088783(0x7f1517cf, float:1.981786E38)
            java.lang.String r4 = r11.getString(r4, r2)
            r4.getClass()
            r8 = 0
            r9 = 125(0x7d, float:1.75E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11 = 2
            r10.a = r11
            java.lang.Object r11 = r1.a(r3, r10)
            if (r11 != r0) goto L73
            goto L76
        L73:
            fctx r11 = defpackage.fctx.a
            return r11
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctfk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctfk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
