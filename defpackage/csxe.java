package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csxe extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ csxg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csxe(List list, csxg csxgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = list;
        this.c = csxgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csxe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r5 != r0) goto L21;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)     // Catch: java.util.concurrent.TimeoutException -> L11
            goto L54
        Ld:
            defpackage.fctl.b(r5)     // Catch: java.util.concurrent.TimeoutException -> L11
            goto L43
        L11:
            r5 = move-exception
            goto L73
        L13:
            defpackage.fctl.b(r5)
            cczi r5 = defpackage.csym.g     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.Object r5 = r5.e()     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.util.concurrent.TimeoutException -> L11
            boolean r5 = r5.booleanValue()     // Catch: java.util.concurrent.TimeoutException -> L11
            if (r5 == 0) goto L27
            java.util.List r5 = r4.b     // Catch: java.util.concurrent.TimeoutException -> L11
            goto L45
        L27:
            csxg r5 = r4.c     // Catch: java.util.concurrent.TimeoutException -> L11
            fcsu r5 = r5.b     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.Object r5 = r5.b()     // Catch: java.util.concurrent.TimeoutException -> L11
            cszd r5 = (defpackage.cszd) r5     // Catch: java.util.concurrent.TimeoutException -> L11
            java.util.List r1 = r4.b     // Catch: java.util.concurrent.TimeoutException -> L11
            eiju r5 = r5.a(r1)     // Catch: java.util.concurrent.TimeoutException -> L11
            r5.getClass()     // Catch: java.util.concurrent.TimeoutException -> L11
            r4.a = r2     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)     // Catch: java.util.concurrent.TimeoutException -> L11
            if (r5 != r0) goto L43
            goto L53
        L43:
            java.util.List r5 = (java.util.List) r5     // Catch: java.util.concurrent.TimeoutException -> L11
        L45:
            csxg r1 = r4.c     // Catch: java.util.concurrent.TimeoutException -> L11
            r5.getClass()     // Catch: java.util.concurrent.TimeoutException -> L11
            r2 = 2
            r4.a = r2     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.Object r5 = r1.a(r5, r4)     // Catch: java.util.concurrent.TimeoutException -> L11
            if (r5 != r0) goto L54
        L53:
            return r0
        L54:
            java.util.List r5 = (java.util.List) r5     // Catch: java.util.concurrent.TimeoutException -> L11
            bsbs r0 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.f()     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.String r1 = "updateReachabilityOnlyForDuoKitAndViLTE"
            r0.ap(r1)     // Catch: java.util.concurrent.TimeoutException -> L11
            r1 = 6
            r0.S(r1)     // Catch: java.util.concurrent.TimeoutException -> L11
            csxd r1 = new csxd     // Catch: java.util.concurrent.TimeoutException -> L11
            r1.<init>()     // Catch: java.util.concurrent.TimeoutException -> L11
            r0.U(r1)     // Catch: java.util.concurrent.TimeoutException -> L11
            bsbr r5 = r0.b()     // Catch: java.util.concurrent.TimeoutException -> L11
            r5.e()     // Catch: java.util.concurrent.TimeoutException -> L11
            goto L99
        L73:
            ekrg r0 = defpackage.csxg.a
            ekrw r0 = r0.e()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "Bugle"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r5 = r0.g(r5)
            r0 = 100
            java.lang.String r1 = "BugleVideoCallingReachabilityUpdater.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/video/BugleVideoCallingReachabilityUpdater$updateReachability$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "skipping reachability update"
            r5.q(r0)
        L99:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csxe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csxe(this.b, this.c, fcxyVar);
    }
}
