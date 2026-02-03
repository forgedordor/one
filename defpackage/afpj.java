package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afpj extends fcyz implements fdat {
    int a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ vvw c;
    final /* synthetic */ afpm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpj(fcxy fcxyVar, ConversationId conversationId, vvw vvwVar, afpm afpmVar) {
        super(2, fcxyVar);
        this.b = conversationId;
        this.c = vvwVar;
        this.d = afpmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afpj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0074, code lost:
    
        if (r8.b(r1, r2, r7) == r0) goto L13;
     */
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
            r2 = 1
            defpackage.fctl.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L67
            goto L77
        Ld:
            java.lang.Object r8 = r7.e
            fdjx r8 = (defpackage.fdjx) r8
            ekrg r8 = defpackage.afpm.a
            ekrw r8 = r8.e()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r3 = "BugleMultiShare"
            r8.X(r1, r3)
            ekrd r8 = (defpackage.ekrd) r8
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r7.b
            ekrz r3 = defpackage.cqnc.t
            r8.X(r3, r1)
            r3 = 55
            java.lang.String r4 = "DraftPersistenceImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/draft/DraftPersistenceImpl$save$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r8 = r8.h(r5, r6, r3, r4)
            ekrd r8 = (defpackage.ekrd) r8
            vvw r3 = r7.c
            java.lang.String r4 = "Persistence saving draft %s"
            r8.t(r4, r3)
            afpm r8 = r7.d
            afpk r4 = new afpk
            r4.<init>(r3, r8, r1)
            java.lang.String[] r8 = defpackage.bpcy.a
            bpbm r8 = new bpbm
            r8.<init>()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = defpackage.ajwb.a(r1)
            r8.c(r1)
            r4.invoke(r8)
            bpbj r8 = r8.a()
            eiju r8 = r8.m()
            r8.getClass()
            r7.a = r2
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 == r0) goto L7a
        L67:
            afpm r8 = r7.d
            vvw r1 = r7.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r7.b
            r3 = 2
            r7.a = r3
            java.lang.Object r8 = r8.b(r1, r2, r7)
            if (r8 != r0) goto L77
            goto L7a
        L77:
            fctx r8 = defpackage.fctx.a
            return r8
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afpj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afpj afpjVar = new afpj(fcxyVar, this.b, this.c, this.d);
        afpjVar.e = obj;
        return afpjVar;
    }
}
