package defpackage;

import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalc extends fcyz implements fdat {
    int a;
    final /* synthetic */ ConversationViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aalc(ConversationViewModel conversationViewModel, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = conversationViewModel;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aalc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r1.a(r2, r4) == r0) goto L15;
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
            if (r1 == r2) goto L19
            goto L41
        Ld:
            com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel r5 = r4.b
            r4.a = r2
            fdpl r5 = r5.m
            java.lang.Object r5 = defpackage.fdtc.a(r5, r4)
            if (r5 == r0) goto L44
        L19:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L41
            com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel r5 = r4.b
            afza r1 = r5.l
            fdvc r1 = r1.a()
            aalb r3 = new aalb
            r3.<init>(r1)
            fdpl r1 = defpackage.fdsc.b(r3, r2)
            aaky r2 = new aaky
            r2.<init>(r5)
            r5 = 2
            r4.a = r5
            java.lang.Object r5 = r1.a(r2, r4)
            if (r5 != r0) goto L41
            goto L44
        L41:
            fctx r5 = defpackage.fctx.a
            return r5
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aalc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aalc(this.b, fcxyVar);
    }
}
