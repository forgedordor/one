package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjny extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cjob c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ awjl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjny(cjob cjobVar, ConversationIdType conversationIdType, awjl awjlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cjobVar;
        this.d = conversationIdType;
        this.e = awjlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjny) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r7 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (r7 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        r7 = (defpackage.aubq) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        if (r7 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        r7 = (defpackage.awhp) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        return defpackage.fctx.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r1 != 3) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L14
            defpackage.fctl.b(r7)
            if (r1 == r2) goto Lae
            goto Ld7
        L14:
            java.lang.Object r1 = r6.a
            defpackage.fctl.b(r7)
            goto L9d
        L1b:
            defpackage.fctl.b(r7)
            goto L7e
        L1f:
            defpackage.fctl.b(r7)
            cjob r7 = r6.c
            fcsu r1 = r7.b
            java.lang.Object r1 = r1.b()
            bakt r1 = (defpackage.bakt) r1
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r6.d
            bojh r1 = r1.r(r5)
            if (r1 != 0) goto L5b
            ekrg r7 = defpackage.cjob.a
            ekrw r7 = r7.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "Bugle"
            r7.X(r0, r1)
            r0 = 196(0xc4, float:2.75E-43)
            java.lang.String r1 = "ConversationDraftingUpdater.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/rcs/participant/ConversationDraftingUpdater$refreshNonRcsCapabilities$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r7 = r7.h(r2, r3, r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r0 = r5.a()
            java.lang.String r1 = "Could not get conversation data for conversationId: %s"
            r7.t(r1, r0)
            fctx r7 = defpackage.fctx.a
            return r7
        L5b:
            boolean r1 = defpackage.cjob.f(r1)
            if (r1 != 0) goto L64
            fctx r7 = defpackage.fctx.a
            return r7
        L64:
            aqnx r1 = r7.j
            boolean r1 = r1.a()
            if (r1 == 0) goto L81
            fcsu r7 = r7.e
            java.lang.Object r7 = r7.b()
            awjh r7 = (defpackage.awjh) r7
            awjl r1 = r6.e
            r6.b = r4
            java.lang.Object r7 = r7.i(r1, r6)
            if (r7 == r0) goto Ldc
        L7e:
            aubq r7 = (defpackage.aubq) r7
            goto Lb0
        L81:
            fcsu r1 = r7.f
            java.lang.Object r1 = r1.b()
            awjd r1 = (defpackage.awjd) r1
            fcsu r7 = r7.e
            java.lang.Object r7 = r7.b()
            awjh r7 = (defpackage.awjh) r7
            awjl r4 = r6.e
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r7.e(r4, r6)
            if (r7 == r0) goto Ldc
        L9d:
            awjb r7 = (defpackage.awjb) r7
            awjf r7 = r1.a(r7)
            r1 = 0
            r6.a = r1
            r6.b = r2
            java.lang.Object r7 = r7.a(r6)
            if (r7 == r0) goto Ldc
        Lae:
            aubq r7 = (defpackage.aubq) r7
        Lb0:
            cjob r1 = r6.c
            fcsu r2 = r1.g
            java.lang.Object r2 = r2.b()
            awhr r2 = (defpackage.awhr) r2
            fcsu r1 = r1.d
            java.lang.Object r1 = r1.b()
            alrj r1 = (defpackage.alrj) r1
            alqm r7 = r1.b(r7)
            eiju r7 = r2.c(r7)
            r7.getClass()
            r1 = 4
            r6.b = r1
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 != r0) goto Ld7
            goto Ldc
        Ld7:
            awhp r7 = (defpackage.awhp) r7
            fctx r7 = defpackage.fctx.a
            return r7
        Ldc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjny.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjny(this.c, this.d, this.e, fcxyVar);
    }
}
