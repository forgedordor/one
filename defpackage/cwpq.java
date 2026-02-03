package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwpq extends fcyz implements fdat {
    final /* synthetic */ cwpt a;
    final /* synthetic */ Intent b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwpq(fcxy fcxyVar, cwpt cwptVar, Intent intent) {
        super(2, fcxyVar);
        this.a = cwptVar;
        this.b = intent;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwpq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[PHI: r0
      0x0045: PHI (r0v20 java.lang.String) = (r0v14 java.lang.String), (r0v21 java.lang.String) binds: [B:25:0x006b, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.c
            fdjx r6 = (defpackage.fdjx) r6
            android.content.Intent r6 = r5.b
            r6.getClass()
            android.net.Uri r0 = r6.getData()
            r1 = 0
            if (r0 != 0) goto L15
            r0 = r1
            goto L2a
        L15:
            boolean r2 = r0.isHierarchical()
            if (r2 != 0) goto L2a
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.lang.String r0 = defpackage.fdgn.r(r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L2a:
            if (r0 == 0) goto L33
            java.lang.String r2 = "service_id"
            java.lang.String r0 = r0.getQueryParameter(r2)
            goto L34
        L33:
            r0 = r1
        L34:
            cwpt r2 = r5.a
            if (r0 == 0) goto L47
            cqce r3 = defpackage.cmvy.a
            r3 = 1
            boolean r4 = defpackage.alwh.i(r0)
            if (r3 == r4) goto L42
            r0 = r1
        L42:
            if (r0 != 0) goto L45
            goto L47
        L45:
            r1 = r0
            goto L6d
        L47:
            fcsu r0 = r2.e
            java.lang.Object r0 = r0.b()
            cqti r0 = (defpackage.cqti) r0
            j$.util.Optional r0 = r0.b(r6)
            java.lang.Object r0 = defpackage.fdct.b(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 == 0) goto L62
            java.lang.Object r0 = defpackage.fcur.I(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L63
        L62:
            r0 = r1
        L63:
            if (r0 == 0) goto L6d
            cqce r3 = defpackage.cmvy.a
            boolean r3 = defpackage.alwh.i(r0)
            if (r3 != 0) goto L45
        L6d:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            r0.<init>(r3)
            android.content.Context r2 = r2.b
            if (r1 == 0) goto L7b
            java.lang.String r1 = "com.google.android.apps.messaging.ui.conversation.rbm.OpenRbmDeepLinkActivity"
            goto L7d
        L7b:
            java.lang.String r1 = "com.google.android.apps.messaging.ui.conversation.LaunchConversationActivity"
        L7d:
            android.content.Intent r0 = r0.setClassName(r2, r1)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r0 = r0.setFlags(r1)
            android.net.Uri r6 = r6.getData()
            android.content.Intent r6 = r0.setData(r6)
            r6.getClass()
            ehsj r6 = defpackage.ehsj.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwpq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cwpq cwpqVar = new cwpq(fcxyVar, this.a, this.b);
        cwpqVar.c = obj;
        return cwpqVar;
    }
}
