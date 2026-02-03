package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctgf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctgh b;
    final /* synthetic */ Uri c;
    final /* synthetic */ MessagePartCoreData d;
    final /* synthetic */ MessageCoreData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctgf(ctgh ctghVar, Uri uri, MessagePartCoreData messagePartCoreData, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctghVar;
        this.c = uri;
        this.d = messagePartCoreData;
        this.e = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctgf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        if (r13.a(r4, r1, r12) == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/spam/spatula/SpatulaOnImageDownloadedListener$callSafetyCoreAndPersistVerdict$1$1"
            r4 = 1
            java.lang.String r5 = "SpatulaOnImageDownloadedListener.kt"
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L14
            defpackage.fctl.b(r13)     // Catch: java.lang.Exception -> L18
            goto Lbb
        L14:
            defpackage.fctl.b(r13)     // Catch: java.lang.Exception -> L18
            goto L33
        L18:
            r13 = move-exception
            goto La2
        L1b:
            defpackage.fctl.b(r13)
            ctgh r13 = r12.b     // Catch: java.lang.Exception -> L18
            fcsu r13 = r13.b     // Catch: java.lang.Exception -> L18
            java.lang.Object r13 = r13.b()     // Catch: java.lang.Exception -> L18
            cslj r13 = (defpackage.cslj) r13     // Catch: java.lang.Exception -> L18
            android.net.Uri r1 = r12.c     // Catch: java.lang.Exception -> L18
            r12.a = r4     // Catch: java.lang.Exception -> L18
            java.lang.Object r13 = r13.a(r1, r12)     // Catch: java.lang.Exception -> L18
            if (r13 != r0) goto L33
            goto La1
        L33:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Exception -> L18
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Exception -> L18
            if (r13 == 0) goto L3e
            bvdq r1 = defpackage.bvdq.POSITIVE_VERDICT_REQUIRE_SPEEDBUMP     // Catch: java.lang.Exception -> L18
            goto L40
        L3e:
            bvdq r1 = defpackage.bvdq.NEGATIVE_VERDICT_DISPLAY_IMAGE     // Catch: java.lang.Exception -> L18
        L40:
            ctgh r4 = r12.b     // Catch: java.lang.Exception -> L18
            fcsu r4 = r4.c     // Catch: java.lang.Exception -> L18
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Exception -> L18
            bbae r4 = (defpackage.bbae) r4     // Catch: java.lang.Exception -> L18
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r6 = r12.d     // Catch: java.lang.Exception -> L18
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = r6.A()     // Catch: java.lang.Exception -> L18
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8 = r6.B()     // Catch: java.lang.Exception -> L18
            java.lang.String r6 = r6.W()     // Catch: java.lang.Exception -> L18
            boolean r9 = defpackage.crtr.e()     // Catch: java.lang.Exception -> L18
            if (r9 == 0) goto L84
            java.lang.String r9 = "MessagePartDatabaseOperations#updateMessagePartImageDisplayState"
            eieu r9 = defpackage.eiiy.k(r9)     // Catch: java.lang.Exception -> L18
            java.lang.String[] r10 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.a     // Catch: java.lang.Throwable -> L7a
            bsjh r10 = new bsjh     // Catch: java.lang.Throwable -> L7a
            r10.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r11 = "updateMessagePartImageDisplayState"
            r10.ap(r11)     // Catch: java.lang.Throwable -> L7a
            r10.q(r1)     // Catch: java.lang.Throwable -> L7a
            r4.f(r7, r8, r6, r10)     // Catch: java.lang.Throwable -> L7a
            r9.close()     // Catch: java.lang.Exception -> L18
            goto L84
        L7a:
            r13 = move-exception
            r9.close()     // Catch: java.lang.Throwable -> L7f
            goto L83
        L7f:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.lang.Exception -> L18
        L83:
            throw r13     // Catch: java.lang.Exception -> L18
        L84:
            if (r13 == 0) goto Lbb
            ctgh r13 = r12.b     // Catch: java.lang.Exception -> L18
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r1 = r12.e     // Catch: java.lang.Exception -> L18
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r4 = r1.A()     // Catch: java.lang.Exception -> L18
            r4.getClass()     // Catch: java.lang.Exception -> L18
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r1 = r1.C()     // Catch: java.lang.Exception -> L18
            r1.getClass()     // Catch: java.lang.Exception -> L18
            r6 = 2
            r12.a = r6     // Catch: java.lang.Exception -> L18
            java.lang.Object r13 = r13.a(r4, r1, r12)     // Catch: java.lang.Exception -> L18
            if (r13 != r0) goto Lbb
        La1:
            return r0
        La2:
            ekrg r0 = defpackage.ctgh.a
            ekrw r0 = r0.j()
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r13 = r0.g(r13)
            r0 = 101(0x65, float:1.42E-43)
            ekrw r13 = r13.h(r3, r2, r0, r5)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.String r0 = "fail to handle safetyCore verdict"
            r13.q(r0)
        Lbb:
            ctgh r13 = r12.b
            fcsu r13 = r13.c
            java.lang.Object r13 = r13.b()
            bbae r13 = (defpackage.bbae) r13
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r0 = r12.d
            java.lang.String r0 = r0.W()
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r13 = r13.a(r0)
            ekrg r0 = defpackage.ctgh.a
            ekrw r0 = r0.e()
            r1 = 105(0x69, float:1.47E-43)
            ekrw r0 = r0.h(r3, r2, r1, r5)
            ekrd r0 = (defpackage.ekrd) r0
            if (r13 == 0) goto Le4
            bvdq r13 = r13.F()
            goto Le5
        Le4:
            r13 = 0
        Le5:
            java.lang.String r1 = "persisted part: %s"
            r0.t(r1, r13)
            fctx r13 = defpackage.fctx.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctgf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctgf(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
