package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yvn extends fcyz implements fdat {
    int a;
    final /* synthetic */ yvq b;
    final /* synthetic */ Uri c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvn(yvq yvqVar, Uri uri, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yvqVar;
        this.c = uri;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yvn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
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
            defpackage.fctl.b(r10)
            if (r1 == 0) goto La
            goto L36
        La:
            yvq r10 = r9.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r1 = r10.f
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r1.d()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = defpackage.ajwb.a(r1)
            android.content.Context r2 = r10.c
            android.net.Uri r7 = defpackage.bace.a(r2, r1)
            if (r7 == 0) goto L7c
            afzc r10 = r10.i
            android.net.Uri r5 = r9.c
            java.lang.String r6 = r9.d
            agdn r3 = new agdn
            r4 = 2
            r8 = 16
            r3.<init>(r4, r5, r6, r7, r8)
            r1 = 1
            r9.a = r1
            java.lang.Object r10 = r10.f(r3, r9)
            if (r10 != r0) goto L36
            return r0
        L36:
            aggc r10 = (defpackage.aggc) r10
            ekrg r0 = defpackage.yvq.a
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleImage"
            r0.X(r1, r2)
            r1 = 596(0x254, float:8.35E-43)
            java.lang.String r2 = "ImageBubbleUiAdapter.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$openLegacyMediaViewer$1"
            java.lang.String r4 = "invokeSuspend"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Image bubble MediaViewer result: %s"
            r0.t(r1, r10)
            if (r10 == 0) goto L7c
            yvq r0 = r9.b
            dltb r1 = defpackage.yvq.b
            aqhi r2 = r0.s
            boolean r2 = r2.a()
            r3 = 0
            if (r2 == 0) goto L6e
            java.lang.String r2 = r10.a
            doig r2 = defpackage.dohx.a(r2)
            goto L6f
        L6e:
            r2 = r3
        L6f:
            if (r2 == 0) goto L73
            doif r3 = r2.b
        L73:
            vvj r2 = r0.r
            vvl r1 = r2.j(r1, r3)
            r0.b(r10, r1)
        L7c:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yvn(this.b, this.c, this.d, fcxyVar);
    }
}
