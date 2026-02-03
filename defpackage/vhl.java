package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vhl extends fcyz implements fdat {
    int a;
    final /* synthetic */ vhr b;
    final /* synthetic */ List c;
    final /* synthetic */ fdae d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhl(vhr vhrVar, List list, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vhrVar;
        this.c = list;
        this.d = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vhl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        if (r9 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (r9 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        return r0;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 1
            defpackage.fctl.b(r9)
            if (r1 == 0) goto Le
            if (r1 == r2) goto Lc7
            goto Ldb
        Le:
            vhr r9 = r8.b
            int r1 = r9.k
            if (r1 != r2) goto Lcd
            java.util.List r1 = r8.c
            int r3 = r1.size()
            if (r3 != r2) goto Le8
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            ajlt r1 = (defpackage.ajlt) r1
            yrn r3 = r9.j
            long r4 = defpackage.ykm.a(r1)
            com.google.android.apps.messaging.shared.api.messaging.MessageId r6 = r1.b()
            yjr r7 = r3.a
            yjp r7 = r7.d
            java.lang.Object r6 = r7.get(r6)
            yjo r6 = (defpackage.yjo) r6
            r7 = 0
            if (r6 == 0) goto L3d
            yit r6 = r6.b
            goto L3e
        L3d:
            r6 = r7
        L3e:
            if (r6 == 0) goto L45
            auyl r6 = r6.b()
            goto L46
        L45:
            r6 = r7
        L46:
            if (r6 == 0) goto L4e
            java.lang.Object r7 = r6.b()
            yis r7 = (defpackage.yis) r7
        L4e:
            boolean r7 = r7 instanceof defpackage.yki
            if (r7 == 0) goto L74
            java.util.Map r3 = r3.b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            yrj r5 = new yrj
            r5.<init>(r6)
            yrm r7 = new yrm
            r7.<init>(r5)
            java.lang.Object r5 = r6.b()
            r5.getClass()
            yki r5 = (defpackage.yki) r5
            dkgq r5 = r5.b
            auyl r5 = defpackage.auyp.b(r7, r5)
            r3.put(r4, r5)
        L74:
            r8.a = r2
            com.google.android.apps.messaging.shared.api.messaging.MessageId r1 = r1.b()
            ekrg r2 = defpackage.vhr.a
            ekrw r2 = r2.h()
            ekrz r3 = defpackage.eksq.a
            java.lang.String r4 = "Bugle"
            r2.X(r3, r4)
            ekrd r2 = (defpackage.ekrd) r2
            ekrz r3 = defpackage.cqnc.c
            r2.X(r3, r1)
            ajmh r3 = r9.d
            ekrz r4 = defpackage.cqnc.t
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r3.g()
            r2.X(r4, r5)
            r4 = 342(0x156, float:4.79E-43)
            java.lang.String r5 = "DeleteMessageActionPlugin.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/conversation2/actions/deletemessage/DeleteMessageActionPlugin"
            java.lang.String r7 = "deleteRemoteMessage"
            ekrw r2 = r2.h(r6, r7, r4, r5)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r4 = "UI initiated remote message deletion"
            r2.q(r4)
            android.content.Context r9 = r9.b
            fhaz r2 = defpackage.cqdr.a()
            r4 = 2132087112(0x7f151148, float:1.981447E38)
            java.lang.String r9 = r9.getString(r4)
            eiju r9 = r3.C(r1, r9, r2)
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 == r0) goto Lc5
            fctx r9 = defpackage.fctx.a
        Lc5:
            if (r9 == r0) goto Lda
        Lc7:
            fdae r9 = r8.d
            r9.invoke()
            goto Le8
        Lcd:
            r2 = 2
            if (r1 != r2) goto Le8
            java.util.List r1 = r8.c
            r8.a = r2
            java.lang.Object r9 = r9.c(r1, r8)
            if (r9 != r0) goto Ldb
        Lda:
            return r0
        Ldb:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Le8
            fdae r9 = r8.d
            r9.invoke()
        Le8:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vhl(this.b, this.c, this.d, fcxyVar);
    }
}
