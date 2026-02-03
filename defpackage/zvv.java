package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvv extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ zvx d;
    final /* synthetic */ ajlt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvv(zvx zvxVar, ajlt ajltVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = zvxVar;
        this.e = ajltVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        zvv zvvVar = new zvv(this.d, this.e, (fcxy) obj4);
        zvvVar.a = (aoer) obj;
        zvvVar.b = zBooleanValue;
        zvvVar.c = (dnvg) obj3;
        return zvvVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Type inference failed for: r6v1, types: [aoer, java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.a
            boolean r0 = r5.b
            java.lang.Object r1 = r5.c
            zvx r2 = r5.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r3 = r2.b
            boolean r3 = r3 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId
            r4 = 0
            if (r3 != 0) goto L5b
            if (r0 != 0) goto L15
            goto L5b
        L15:
            fcsu r0 = r2.g
            java.lang.Object r0 = r0.b()
            arxn r0 = (defpackage.arxn) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L34
            if (r6 == 0) goto L32
            ajlt r0 = r5.e
            angr r0 = r0.i()
            if (r0 == 0) goto L32
            anho r6 = r0.c(r6)
            goto L4c
        L32:
            r6 = r4
            goto L4c
        L34:
            if (r6 == 0) goto L43
            ajlt r0 = r5.e
            angr r0 = r0.i()
            if (r0 == 0) goto L43
            anhj r6 = r0.b(r6)
            goto L44
        L43:
            r6 = r4
        L44:
            if (r6 == 0) goto L32
            anho r0 = new anho
            r0.<init>(r6, r4)
            r6 = r0
        L4c:
            ajlt r0 = r5.e
            if (r1 == 0) goto L56
            dnvg r1 = (defpackage.dnvg) r1
            angp r4 = defpackage.anhp.b(r1)
        L56:
            dkzf r6 = r2.a(r0, r6, r4)
            return r6
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvv.b(java.lang.Object):java.lang.Object");
    }
}
