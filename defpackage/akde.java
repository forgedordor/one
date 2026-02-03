package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akde extends fcyz implements fdat {
    int a;
    final /* synthetic */ BugleConversation b;
    final /* synthetic */ akdg c;
    final /* synthetic */ akcy d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akde(fcxy fcxyVar, BugleConversation bugleConversation, akdg akdgVar, akcy akcyVar) {
        super(2, fcxyVar);
        this.b = bugleConversation;
        this.c = akdgVar;
        this.d = akcyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akde) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r5.c(r1, r2, r4) == r0) goto L17;
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
            if (r1 == r2) goto L1d
            goto L35
        Ld:
            java.lang.Object r5 = r4.e
            fdjx r5 = (defpackage.fdjx) r5
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r5 = r4.b
            akdo r1 = defpackage.akdo.a
            r4.a = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 == r0) goto L54
        L1d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L38
            akdg r5 = r4.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r1 = r4.b
            akcy r2 = r4.d
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r5.c(r1, r2, r4)
            if (r5 != r0) goto L35
            goto L54
        L35:
            fctx r5 = defpackage.fctx.a
            return r5
        L38:
            ekrg r5 = defpackage.akdg.a
            ekrw r5 = r5.h()
            r0 = 103(0x67, float:1.44E-43)
            java.lang.String r1 = "RichThemeControllerImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/controller/RichThemeControllerImpl$sendRichTheme$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "Capability check failed. Not sending custom theme selection."
            r5.q(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akde.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        akde akdeVar = new akde(fcxyVar, this.b, this.c, this.d);
        akdeVar.e = obj;
        return akdeVar;
    }
}
