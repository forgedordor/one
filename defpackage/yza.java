package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yza extends fcyz implements fdat {
    int a;
    final /* synthetic */ zaa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yza(zaa zaaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zaaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yza) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r1.e(r6, (com.google.android.apps.messaging.shared.api.messaging.MessageId) r2, r3, r5) == r0) goto L17;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L32
            goto L51
        Ld:
            zaa r6 = r5.b
            lwn r1 = r6.k
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "has_pending_emotify_result"
            r1.d(r4, r3)
            fcsu r6 = r6.h
            java.lang.Object r6 = r6.b()
            afzc r6 = (defpackage.afzc) r6
            agfi r1 = new agfi
            java.lang.String r3 = "emotify_result"
            r1.<init>(r3)
            r5.a = r2
            java.lang.Object r6 = r6.f(r1, r5)
            if (r6 == r0) goto L5c
        L32:
            zaa r1 = r5.b
            lwn r2 = r1.k
            adh r6 = (defpackage.adh) r6
            java.lang.String r3 = "emotify_result_message_id"
            java.lang.Object r2 = r2.b(r3)
            if (r2 == 0) goto L54
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = (com.google.android.apps.messaging.shared.api.messaging.MessageId) r2
            yyz r3 = new yyz
            r3.<init>()
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = r1.e(r6, r2, r3, r5)
            if (r6 != r0) goto L51
            goto L5c
        L51:
            fctx r6 = defpackage.fctx.a
            return r6
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r6.<init>(r0)
            throw r6
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yza.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yza(this.b, fcxyVar);
    }
}
