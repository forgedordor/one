package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwb extends fcyz implements fdat {
    int a;
    final /* synthetic */ IncomingDraft b;
    final /* synthetic */ wwd c;
    final /* synthetic */ fdap d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwb(fcxy fcxyVar, IncomingDraft incomingDraft, wwd wwdVar, fdap fdapVar) {
        super(2, fcxyVar);
        this.b = incomingDraft;
        this.c = wwdVar;
        this.d = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wwb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r10 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        if (r10.c.d(r7, r9) != r0) goto L18;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replacer/DraftReplacerImpl$replaceDraft$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "BugleComposeRow2"
            r5 = 1
            java.lang.String r6 = "DraftReplacerImpl.kt"
            if (r1 == 0) goto L20
            if (r1 == r5) goto L16
            defpackage.fctl.b(r10)
            goto Lae
        L16:
            java.lang.Object r1 = r9.e
            java.lang.Object r7 = r9.f
            vvw r7 = (defpackage.vvw) r7
            defpackage.fctl.b(r10)
            goto L4f
        L20:
            defpackage.fctl.b(r10)
            java.lang.Object r10 = r9.f
            fdjx r10 = (defpackage.fdjx) r10
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r10 = r9.b
            wwd r1 = r9.c
            wre r1 = r1.b
            fdvc r1 = r1.a
            r7 = 5
            vvw r7 = defpackage.wrb.c(r10, r7)
            java.lang.Object r10 = r1.c()
            r1 = r10
            vvw r1 = (defpackage.vvw) r1
            boolean r10 = r1.a()
            if (r10 == 0) goto L75
            fdap r10 = r9.d
            r9.f = r7
            r9.e = r1
            r9.a = r5
            java.lang.Object r10 = r10.invoke(r9)
            if (r10 == r0) goto Lad
        L4f:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L75
            ekrg r10 = defpackage.wwd.a
            ekrw r10 = r10.e()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r4)
            r0 = 53
            ekrw r10 = r10.h(r3, r2, r0, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Choosing not to replace existing draft %s"
            r10.t(r0, r1)
            r10 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        L75:
            ekrg r10 = defpackage.wwd.a
            ekrw r10 = r10.e()
            ekrz r8 = defpackage.eksq.a
            r10.X(r8, r4)
            r4 = 58
            ekrw r10 = r10.h(r3, r2, r4, r6)
            ekrd r10 = (defpackage.ekrd) r10
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r2 = r9.b
            java.lang.String r3 = "Replacing draft with incoming %s parsed as %s"
            r10.D(r3, r2, r7)
            wwd r10 = r9.c
            wwc r2 = new wwc
            vvw r1 = (defpackage.vvw) r1
            r2.<init>(r1, r7)
            wre r1 = r10.b
            r1.c(r2)
            r1 = 0
            r9.f = r1
            r9.e = r1
            r1 = 2
            r9.a = r1
            wsb r10 = r10.c
            java.lang.Object r10 = r10.d(r7, r9)
            if (r10 != r0) goto Lae
        Lad:
            return r0
        Lae:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wwb wwbVar = new wwb(fcxyVar, this.b, this.c, this.d);
        wwbVar.f = obj;
        return wwbVar;
    }
}
