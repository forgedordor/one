package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxs extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccxu b;
    final /* synthetic */ alqm c;
    final /* synthetic */ ConversationIdType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxs(ccxu ccxuVar, alqm alqmVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ccxuVar;
        this.c = alqmVar;
        this.d = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r10 == r0) goto L17;
     */
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
            r2 = 1
            defpackage.fctl.b(r10)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            goto L40
        Ld:
            ccxu r10 = r9.b
            alqm r1 = r9.c
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = r9.d
            r9.a = r2
            java.lang.Object r10 = r10.a(r1, r3, r9)
            if (r10 == r0) goto Ld9
        L1b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L26
            fctx r10 = defpackage.fctx.a
            return r10
        L26:
            ccxu r10 = r9.b
            aofc r10 = r10.f
            anpj r10 = r10.a()
            eiju r10 = r10.b()
            r10.getClass()
            r1 = 2
            r9.a = r1
            java.lang.Object r10 = defpackage.fdxs.c(r10, r9)
            if (r10 != r0) goto L40
            goto Ld9
        L40:
            r10.getClass()
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = defpackage.fcva.N(r10)
            aoer r10 = (defpackage.aoer) r10
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r9.d
            java.lang.String[] r0 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.a
            brec r0 = new brec
            r0.<init>()
            r2 = 268(0x10c, float:3.76E-43)
            r0.ae(r2)
            r0.m(r1)
            brdk r2 = new brdk
            r2.<init>()
            java.lang.String r3 = "EmergencyRcsTombstoneInserter::removeQuestionnaireIfExists"
            r2.f(r3)
            brdv r3 = new brdv
            r3.<init>(r0)
            r2.b = r3
            r2.d()
            ccxu r8 = r9.b
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r0 = r10.h()
            java.lang.String r0 = r0.b()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r2 = r10.h()
            cogw r10 = r8.e
            j$.time.Instant r10 = r10.f()
            long r5 = r10.toEpochMilli()
            r3 = r1
            r1 = r0
            bveg r0 = r8.c
            r4 = 268(0x10c, float:3.76E-43)
            r7 = 0
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r10 = r0.k(r1, r2, r3, r4, r5, r7)
            bauh r0 = r8.d
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r2 = r0.a(r10)
            ekrg r0 = defpackage.ccxu.a
            ekrw r0 = r0.g()
            ekrd r0 = (defpackage.ekrd) r0
            ekrz r1 = defpackage.cqnc.s
            r0.X(r1, r3)
            ekrz r1 = defpackage.cqnc.b
            r0.X(r1, r2)
            r1 = 79
            java.lang.String r4 = "EmergencyRcsTombstoneInserterImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/emergency/tombstone/EmergencyRcsTombstoneInserterImpl$deleteAndInsertQuestionnaireTombstone$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r0 = r0.h(r5, r6, r1, r4)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "New emergency questionnaire inserted"
            r0.q(r1)
            fcsu r0 = r8.h
            java.lang.Object r0 = r0.b()
            baqi r0 = (defpackage.baqi) r0
            long r4 = r10.o()
            r1 = r3
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r4)
            bvdk r4 = defpackage.bvdk.UNARCHIVED
            r5 = 0
            r0.e(r1, r2, r3, r4, r5)
            fctx r10 = defpackage.fctx.a
            return r10
        Ld9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccxs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccxs(this.b, this.c, this.d, fcxyVar);
    }
}
