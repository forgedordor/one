package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxu extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvxv b;
    final /* synthetic */ DetailsPageE2eeInfoRequest c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvxu(fcxy fcxyVar, cvxv cvxvVar, DetailsPageE2eeInfoRequest detailsPageE2eeInfoRequest) {
        super(2, fcxyVar);
        this.b = cvxvVar;
        this.c = detailsPageE2eeInfoRequest;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvxu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [egyi] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Exception {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto Le
            defpackage.fctl.b(r8)
            goto L93
        Le:
            java.lang.Object r1 = r7.d
            egyi r1 = (defpackage.egyi) r1
            defpackage.fctl.b(r8)     // Catch: java.lang.Exception -> L16
            goto L44
        L16:
            r8 = move-exception
            goto L47
        L18:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.d
            fdjx r8 = (defpackage.fdjx) r8
            cvxv r8 = r7.b
            fcsu r1 = r8.f
            java.lang.Object r1 = r1.b()
            bwuv r1 = (defpackage.bwuv) r1
            com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest r3 = r7.c
            egyi r1 = r1.a(r3)
            egyt r8 = r8.e     // Catch: java.lang.Exception -> L16
            egzr r3 = defpackage.egzr.DONT_CARE     // Catch: java.lang.Exception -> L16
            com.google.common.util.concurrent.ListenableFuture r8 = r8.a(r1, r3)     // Catch: java.lang.Exception -> L16
            r8.getClass()     // Catch: java.lang.Exception -> L16
            r7.d = r1     // Catch: java.lang.Exception -> L16
            r7.a = r2     // Catch: java.lang.Exception -> L16
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)     // Catch: java.lang.Exception -> L16
            if (r8 == r0) goto L92
        L44:
            bwur r8 = (defpackage.bwur) r8     // Catch: java.lang.Exception -> L16
            return r8
        L47:
            ekrg r2 = defpackage.cvxv.a
            ekrw r2 = r2.j()
            ekrz r3 = defpackage.eksq.a
            java.lang.String r4 = "BugleCdp"
            r2.X(r3, r4)
            ekrd r2 = (defpackage.ekrd) r2
            ekrw r2 = r2.g(r8)
            r3 = 222(0xde, float:3.11E-43)
            java.lang.String r4 = "E2eeStatusUiAdapterImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/ui/conversation/details/encryption/e2eestatus/E2eeStatusUiAdapterImpl$getE2eeInfo$$inlined$asyncPropagatingLegacy$default$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r2 = r2.h(r5, r6, r3, r4)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r3 = "Failed to retrieve E2eeInfo as future"
            r2.q(r3)
            boolean r2 = r8 instanceof java.lang.IllegalStateException
            if (r2 != 0) goto L7b
            boolean r2 = r8 instanceof defpackage.bwuw
            if (r2 != 0) goto L7b
            boolean r2 = r8 instanceof java.util.concurrent.ExecutionException
            if (r2 == 0) goto L7a
            goto L7b
        L7a:
            throw r8
        L7b:
            eopy r8 = r1.a()
            eoqt r8 = r8.g()
            r8.getClass()
            r1 = 0
            r7.d = r1
            r1 = 2
            r7.a = r1
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 != r0) goto L93
        L92:
            return r0
        L93:
            egyh r8 = (defpackage.egyh) r8
            java.lang.Object r8 = r8.d()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvxu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cvxu cvxuVar = new cvxu(fcxyVar, this.b, this.c);
        cvxuVar.d = obj;
        return cvxuVar;
    }
}
