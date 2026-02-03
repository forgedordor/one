package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csww extends fcyz implements fdat {
    int a;
    final /* synthetic */ cswx b;
    final /* synthetic */ ResolvedRecipient c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csww(fcxy fcxyVar, cswx cswxVar, ResolvedRecipient resolvedRecipient) {
        super(2, fcxyVar);
        this.b = cswxVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csww) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
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
            r3 = 0
            if (r1 == 0) goto Le
            defpackage.fctl.b(r6)     // Catch: java.lang.Exception -> Lc
            goto L39
        Lc:
            r6 = move-exception
            goto L59
        Le:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.d
            fdjx r6 = (defpackage.fdjx) r6
            com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest r6 = new com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest
            r6.<init>()
            cswx r1 = r5.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r4 = r5.c
            com.google.android.gms.duokit.DuoId r4 = defpackage.cswx.i(r4)
            r6.a = r4
            csyh r4 = defpackage.csyh.a
            java.lang.String r4 = r4.d
            r6.b = r4
            dcsx r1 = r1.b     // Catch: java.lang.Exception -> Lc
            defn r6 = r1.b(r6)     // Catch: java.lang.Exception -> Lc
            r5.a = r2     // Catch: java.lang.Exception -> Lc
            java.lang.Object r6 = defpackage.auwr.a(r6, r5)     // Catch: java.lang.Exception -> Lc
            if (r6 != r0) goto L39
            return r0
        L39:
            com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse r6 = (com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse) r6     // Catch: java.lang.Exception -> Lc
            com.google.android.gms.duokit.RemoteUserReachability r6 = r6.a     // Catch: java.lang.Exception -> Lc
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r0 = r5.c     // Catch: java.lang.Exception -> Lc
            aobr r0 = r0.m()     // Catch: java.lang.Exception -> Lc
            r1 = r0
            aobo r1 = (defpackage.aobo) r1     // Catch: java.lang.Exception -> Lc
            boolean r1 = r1.a     // Catch: java.lang.Exception -> Lc
            if (r1 == 0) goto L7f
            aobo r0 = (defpackage.aobo) r0     // Catch: java.lang.Exception -> Lc
            boolean r0 = r0.b     // Catch: java.lang.Exception -> Lc
            if (r0 != 0) goto L7f
            int r0 = r6.b     // Catch: java.lang.Exception -> Lc
            if (r0 != r2) goto L7f
            int r6 = r6.c     // Catch: java.lang.Exception -> Lc
            if (r6 != r2) goto L7f
            goto L80
        L59:
            ekrg r0 = defpackage.cswx.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "Bugle"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r6 = r0.g(r6)
            r0 = 141(0x8d, float:1.98E-43)
            java.lang.String r1 = "BugleVideoCalling2.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/video/BugleVideoCalling2$shouldSendDuoInviteLink$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "invokeSuspend"
            ekrw r6 = r6.h(r2, r4, r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r0 = "lookupReachability failed"
            r6.q(r0)
        L7f:
            r2 = r3
        L80:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csww.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csww cswwVar = new csww(fcxyVar, this.b, this.c);
        cswwVar.d = obj;
        return cswwVar;
    }
}
