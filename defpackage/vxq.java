package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxq extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ vzk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxq(vzk vzkVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = vzkVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vxq vxqVar = new vxq(this.c, (fcxy) obj3);
        vxqVar.a = (vxg) obj;
        vxqVar.b = (vvw) obj2;
        return vxqVar.b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, vxg] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            defpackage.fctl.b(r10)
            java.lang.Object r10 = r9.a
            java.lang.Object r0 = r9.b
            vzz r2 = r10.b()
            vvw r0 = (defpackage.vvw) r0
            j$.time.Instant r1 = r0.g
            vzk r3 = r9.c
            fcsu r3 = r3.f
            java.lang.Object r4 = r3.b()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L27
            com.google.android.apps.messaging.shared.conversation.draft.EditingData r4 = r0.f
            if (r4 == 0) goto L27
            r4 = r5
            goto L28
        L27:
            r4 = r6
        L28:
            java.util.List r7 = r0.b
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L33
        L30:
            r7 = r5
            r5 = r6
            goto L48
        L33:
            java.util.Iterator r7 = r7.iterator()
        L37:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L30
            java.lang.Object r8 = r7.next()
            vvs r8 = (defpackage.vvs) r8
            boolean r8 = r8 instanceof defpackage.vvp
            if (r8 == 0) goto L37
            r7 = r5
        L48:
            java.lang.Object r3 = r3.b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L67
            com.google.android.apps.messaging.shared.conversation.draft.EditingData r3 = r0.f
            if (r3 == 0) goto L5b
            java.lang.String r3 = r3.b
            goto L5c
        L5b:
            r3 = 0
        L5c:
            java.lang.String r8 = r0.a
            boolean r3 = defpackage.fdgn.o(r3, r8)
            if (r3 != 0) goto L67
            r3 = r6
            r6 = r7
            goto L68
        L67:
            r3 = r6
        L68:
            boolean r0 = r0.b()
            waa r10 = r10.c()
            if (r10 == 0) goto L76
            boolean r10 = r10.c
            r8 = r10
            goto L77
        L76:
            r8 = r3
        L77:
            if (r1 == 0) goto L7a
            r3 = r7
        L7a:
            vzm r1 = new vzm
            r7 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxq.b(java.lang.Object):java.lang.Object");
    }
}
