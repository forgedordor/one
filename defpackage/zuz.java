package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zuz extends fcyz implements fdat {
    int a;
    final /* synthetic */ zvc b;
    final /* synthetic */ MessageId c;
    final /* synthetic */ agau d;
    final /* synthetic */ fdae e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zuz(zvc zvcVar, MessageId messageId, agau agauVar, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zvcVar;
        this.c = messageId;
        this.d = agauVar;
        this.e = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zuz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (r1.b((defpackage.adh) r7, r2, r3, r6) == r0) goto L13;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            java.lang.String r2 = "emotify_result_message_id"
            java.lang.String r3 = "has_pending_emotify_result"
            r4 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto L11
            if (r1 == r4) goto L33
            goto L53
        L11:
            zvc r7 = r6.b
            lwn r1 = r7.e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r1.d(r3, r5)
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r6.c
            r1.d(r2, r5)
            fcsu r7 = r7.c
            java.lang.Object r7 = r7.b()
            afzc r7 = (defpackage.afzc) r7
            agau r1 = r6.d
            r6.a = r4
            java.lang.Object r7 = r7.f(r1, r6)
            if (r7 == r0) goto L56
        L33:
            zvc r1 = r6.b
            lwn r4 = r1.e
            adh r7 = (defpackage.adh) r7
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.d(r3, r5)
            r3 = 0
            r4.d(r2, r3)
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = r6.c
            fdae r3 = r6.e
            r4 = 2
            r6.a = r4
            java.lang.Object r7 = r1.b(r7, r2, r3, r6)
            if (r7 != r0) goto L53
            goto L56
        L53:
            fctx r7 = defpackage.fctx.a
            return r7
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zuz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zuz(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
