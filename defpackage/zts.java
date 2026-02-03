package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zts extends fcyz implements fdat {
    int a;
    final /* synthetic */ ztv b;
    final /* synthetic */ Intent c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zts(ztv ztvVar, Intent intent, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ztvVar;
        this.c = intent;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zts) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r1.f(r8, r2, r3, r7) == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.fctl.b(r8)
            if (r1 == r3) goto L33
            if (r1 == r2) goto L5d
            goto L7f
        L10:
            defpackage.fctl.b(r8)
            ztv r8 = r7.b
            fcsu r8 = r8.s
            java.lang.Object r8 = r8.b()
            afzc r8 = (defpackage.afzc) r8
            agau r1 = new agau
            aeo r4 = new aeo
            r4.<init>()
            android.content.Intent r5 = r7.c
            java.lang.String r6 = "CalendarSuggestion"
            r1.<init>(r6, r4, r5)
            r7.a = r3
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 == r0) goto L82
        L33:
            adh r8 = (defpackage.adh) r8
            int r8 = r8.a
            r1 = -1
            if (r8 != r1) goto L7f
            ztv r8 = r7.b
            android.content.Context r1 = r8.g
            r3 = 2132083237(0x7f150225, float:1.980661E38)
            r4 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r3, r4)
            r1.show()
            java.lang.String r1 = r7.d
            if (r1 == 0) goto L7f
            fcsu r8 = r8.t
            java.lang.Object r8 = r8.b()
            crbi r8 = (defpackage.crbi) r8
            r7.a = r2
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 == r0) goto L82
        L5d:
            ztv r8 = r7.b
            fcsu r1 = r8.u
            java.lang.Object r1 = r1.b()
            crif r1 = (defpackage.crif) r1
            com.google.android.apps.messaging.shared.api.messaging.Conversation r8 = r8.h
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r8 = r8.d()
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r8 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r8
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8 = r8.a
            java.lang.String r2 = r7.d
            ezaj r3 = defpackage.ezaj.CONSUMED
            r4 = 3
            r7.a = r4
            java.lang.Object r8 = r1.f(r8, r2, r3, r7)
            if (r8 != r0) goto L7f
            goto L82
        L7f:
            fctx r8 = defpackage.fctx.a
            return r8
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zts.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zts(this.b, this.c, this.d, fcxyVar);
    }
}
