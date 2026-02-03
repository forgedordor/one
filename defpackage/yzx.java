package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzx extends fcyz implements fdat {
    int a;
    final /* synthetic */ zaa b;
    final /* synthetic */ MessageId c;
    final /* synthetic */ agau d;
    final /* synthetic */ boolean e;
    final /* synthetic */ fduf f;
    final /* synthetic */ Long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzx(zaa zaaVar, MessageId messageId, agau agauVar, boolean z, fduf fdufVar, Long l, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zaaVar;
        this.c = messageId;
        this.d = agauVar;
        this.e = z;
        this.f = fdufVar;
        this.g = l;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yzx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
    
        if (r1.e((defpackage.adh) r8, r2, r6, r7) == r0) goto L13;
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
            java.lang.String r2 = "emotify_result_message_id"
            java.lang.String r3 = "has_pending_emotify_result"
            r4 = 1
            defpackage.fctl.b(r8)
            if (r1 == 0) goto L11
            if (r1 == r4) goto L33
            goto L5c
        L11:
            zaa r8 = r7.b
            lwn r1 = r8.k
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r1.d(r3, r5)
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r7.c
            r1.d(r2, r5)
            fcsu r8 = r8.h
            java.lang.Object r8 = r8.b()
            afzc r8 = (defpackage.afzc) r8
            agau r1 = r7.d
            r7.a = r4
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 == r0) goto L5f
        L33:
            zaa r1 = r7.b
            lwn r4 = r1.k
            adh r8 = (defpackage.adh) r8
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.d(r3, r5)
            r3 = 0
            r4.d(r2, r3)
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = r7.c
            boolean r3 = r7.e
            fduf r4 = r7.f
            java.lang.Long r5 = r7.g
            yzw r6 = new yzw
            r6.<init>()
            r3 = 2
            r7.a = r3
            java.lang.Object r8 = r1.e(r8, r2, r6, r7)
            if (r8 != r0) goto L5c
            goto L5f
        L5c:
            fctx r8 = defpackage.fctx.a
            return r8
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yzx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yzx(this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
