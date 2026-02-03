package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coez extends fcyz implements fdat {
    int a;
    final /* synthetic */ ewtf b;
    final /* synthetic */ cofa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coez(ewtf ewtfVar, cofa cofaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ewtfVar;
        this.c = cofaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coez) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
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
            r2 = 3
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateWorkItemHandler$processPendingWorkItemAsync$1"
            java.lang.String r5 = "BugleTelephony"
            r6 = 2
            r7 = 1
            java.lang.String r8 = "TelephonyDatabaseUpdateWorkItemHandler.kt"
            if (r1 == 0) goto L1f
            if (r1 == r7) goto L1b
            defpackage.fctl.b(r10)
            if (r1 == r6) goto L1a
            if (r1 == r2) goto L80
        L1a:
            return r10
        L1b:
            defpackage.fctl.b(r10)
            goto L53
        L1f:
            defpackage.fctl.b(r10)
            ekrg r10 = defpackage.cofa.a
            ekrw r10 = r10.h()
            ekrz r1 = defpackage.eksq.a
            r10.X(r1, r5)
            r1 = 51
            ekrw r10 = r10.h(r4, r3, r1, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r1 = "Initiating Telephony Database update work."
            r10.q(r1)
            ewtf r10 = r9.b
            int r10 = r10.b
            if (r10 != r7) goto L67
            cofa r10 = r9.c
            fcsu r10 = r10.c
            java.lang.Object r10 = r10.b()
            cogm r10 = (defpackage.cogm) r10
            r9.a = r7
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L53
            goto Lab
        L53:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L67
            cofa r10 = r9.c
            r9.a = r6
            java.lang.Object r10 = r10.k(r9)
            if (r10 != r0) goto L66
            goto Lab
        L66:
            return r10
        L67:
            ewtf r10 = r9.b
            int r10 = r10.b
            if (r10 != r6) goto Lad
            cofa r10 = r9.c
            fcsu r10 = r10.c
            java.lang.Object r10 = r10.b()
            cogm r10 = (defpackage.cogm) r10
            r9.a = r2
            java.lang.Object r10 = r10.b(r9)
            if (r10 != r0) goto L80
            goto Lab
        L80:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto Lad
            ekrg r10 = defpackage.cofa.a
            ekrw r10 = r10.h()
            ekrz r1 = defpackage.eksq.a
            r10.X(r1, r5)
            r1 = 65
            ekrw r10 = r10.h(r4, r3, r1, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r1 = "Scheduling message thread Id update for messages in thread zero."
            r10.q(r1)
            cofa r10 = r9.c
            r1 = 4
            r9.a = r1
            java.lang.Object r10 = r10.l(r9)
            if (r10 != r0) goto Lac
        Lab:
            return r0
        Lac:
            return r10
        Lad:
            ekrg r10 = defpackage.cofa.a
            ekrw r10 = r10.j()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r5)
            r0 = 68
            ekrw r10 = r10.h(r4, r3, r0, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "No work scheduled"
            r10.q(r0)
            cbcw r10 = defpackage.cbcw.k()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coez.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new coez(this.b, this.c, fcxyVar);
    }
}
