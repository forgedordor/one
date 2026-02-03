package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anzs extends fcyz implements fdat {
    int a;
    final /* synthetic */ anzt b;
    final /* synthetic */ String c;
    final /* synthetic */ ParticipantsTable.BindData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anzs(anzt anztVar, String str, ParticipantsTable.BindData bindData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = anztVar;
        this.c = str;
        this.d = bindData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anzs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (defpackage.fdin.a((defpackage.fcyh) r2, r4, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
    
        if (r8 == r0) goto L25;
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
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L16
            if (r1 == r3) goto L11
            defpackage.fctl.b(r8)
            goto Le2
        L11:
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L1a
            goto Le2
        L16:
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L1a
            goto L38
        L1a:
            r8 = move-exception
            goto La2
        L1d:
            defpackage.fctl.b(r8)
            anzt r8 = r7.b     // Catch: java.lang.Throwable -> L1a
            fcsu r8 = r8.d     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Throwable -> L1a
            aoap r8 = (defpackage.aoap) r8     // Catch: java.lang.Throwable -> L1a
            r7.a = r2     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r8 = r8.a(r3, r7)     // Catch: java.lang.Throwable -> L1a
            if (r8 == r0) goto L34
            fctx r8 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L1a
        L34:
            if (r8 != r0) goto L38
            goto Le1
        L38:
            java.lang.String r8 = r7.c     // Catch: java.lang.Throwable -> L1a
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r1 = r7.d     // Catch: java.lang.Throwable -> L1a
            anzp r4 = defpackage.anzp.a     // Catch: java.lang.Throwable -> L1a
            evsf r4 = r4.createBuilder()     // Catch: java.lang.Throwable -> L1a
            anzo r4 = (defpackage.anzo) r4     // Catch: java.lang.Throwable -> L1a
            r4.getClass()     // Catch: java.lang.Throwable -> L1a
            r4.copyOnWrite()     // Catch: java.lang.Throwable -> L1a
            MessageType extends evsn<MessageType, BuilderType> r5 = r4.instance     // Catch: java.lang.Throwable -> L1a
            anzp r5 = (defpackage.anzp) r5     // Catch: java.lang.Throwable -> L1a
            int r6 = r5.b     // Catch: java.lang.Throwable -> L1a
            r2 = r2 | r6
            r5.b = r2     // Catch: java.lang.Throwable -> L1a
            r5.c = r8     // Catch: java.lang.Throwable -> L1a
            long r5 = r1.u()     // Catch: java.lang.Throwable -> L1a
            r4.copyOnWrite()     // Catch: java.lang.Throwable -> L1a
            MessageType extends evsn<MessageType, BuilderType> r8 = r4.instance     // Catch: java.lang.Throwable -> L1a
            anzp r8 = (defpackage.anzp) r8     // Catch: java.lang.Throwable -> L1a
            int r2 = r8.b     // Catch: java.lang.Throwable -> L1a
            r2 = r2 | r3
            r8.b = r2     // Catch: java.lang.Throwable -> L1a
            r8.d = r5     // Catch: java.lang.Throwable -> L1a
            java.lang.String r8 = r1.N()     // Catch: java.lang.Throwable -> L1a
            r8.getClass()     // Catch: java.lang.Throwable -> L1a
            r4.copyOnWrite()     // Catch: java.lang.Throwable -> L1a
            MessageType extends evsn<MessageType, BuilderType> r1 = r4.instance     // Catch: java.lang.Throwable -> L1a
            anzp r1 = (defpackage.anzp) r1     // Catch: java.lang.Throwable -> L1a
            int r2 = r1.b     // Catch: java.lang.Throwable -> L1a
            r2 = r2 | 4
            r1.b = r2     // Catch: java.lang.Throwable -> L1a
            r1.e = r8     // Catch: java.lang.Throwable -> L1a
            evsn r8 = r4.build()     // Catch: java.lang.Throwable -> L1a
            r8.getClass()     // Catch: java.lang.Throwable -> L1a
            anzp r8 = (defpackage.anzp) r8     // Catch: java.lang.Throwable -> L1a
            anzt r1 = r7.b     // Catch: java.lang.Throwable -> L1a
            fcsu r2 = r1.b     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L1a
            r2.getClass()     // Catch: java.lang.Throwable -> L1a
            fcyh r2 = (defpackage.fcyh) r2     // Catch: java.lang.Throwable -> L1a
            anzr r4 = new anzr     // Catch: java.lang.Throwable -> L1a
            r5 = 0
            r4.<init>(r1, r8, r5)     // Catch: java.lang.Throwable -> L1a
            r7.a = r3     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r8 = defpackage.fdin.a(r2, r4, r7)     // Catch: java.lang.Throwable -> L1a
            if (r8 != r0) goto Le2
            goto Le1
        La2:
            ekrg r1 = defpackage.anzt.a
            ekrw r1 = r1.i()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r3 = "BugleRecipientSync"
            r1.X(r2, r3)
            ekrd r1 = (defpackage.ekrd) r1
            ekrw r8 = r1.g(r8)
            r1 = 96
            java.lang.String r2 = "ParticipantContactUpdater.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/api/messaging/recipient/sync/ParticipantContactUpdater$queueContactsSyncForCreatedParticipant$1"
            java.lang.String r4 = "invokeSuspend"
            ekrw r8 = r8.h(r3, r4, r1, r2)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r1 = "Failed to queue ParticipantContactSync"
            r8.q(r1)
            anzt r8 = r7.b
            fcsu r8 = r8.d
            java.lang.Object r8 = r8.b()
            aoap r8 = (defpackage.aoap) r8
            r1 = 3
            r7.a = r1
            java.lang.Object r8 = r8.a(r1, r7)
            fcyl r1 = defpackage.fcyl.a
            if (r8 == r1) goto Ldf
            fctx r8 = defpackage.fctx.a
        Ldf:
            if (r8 != r0) goto Le2
        Le1:
            return r0
        Le2:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anzs(this.b, this.c, this.d, fcxyVar);
    }
}
