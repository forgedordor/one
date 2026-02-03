package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class voj extends fcyz implements fdat {
    int a;
    final /* synthetic */ vok b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(vok vokVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vokVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((voj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r6 = (defpackage.anvx) defpackage.fdct.b(r6);
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com/google/android/apps/messaging/conversation2/actions/verifiedbadge/RbmVerificationDialog$showDialog$1"
            fcyl r2 = defpackage.fcyl.a
            int r3 = r5.a
            java.lang.String r4 = "RbmVerificationDialog.kt"
            defpackage.fctl.b(r6)
            if (r3 == 0) goto L10
            goto L1e
        L10:
            vok r6 = r5.b
            r3 = 1
            r5.a = r3
            fdpl r6 = r6.d
            java.lang.Object r6 = defpackage.fdtc.c(r6, r5)
            if (r6 != r2) goto L1e
            return r2
        L1e:
            j$.util.Optional r6 = (j$.util.Optional) r6
            if (r6 == 0) goto L85
            java.lang.Object r6 = defpackage.fdct.b(r6)
            anvx r6 = (defpackage.anvx) r6
            if (r6 != 0) goto L2b
            goto L85
        L2b:
            java.lang.String r2 = r6.e()
            if (r2 == 0) goto L85
            java.lang.String r3 = r6.d()     // Catch: java.lang.Exception -> L64
            android.net.Uri r6 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L64
            boolean r3 = defpackage.cqmz.p(r6)
            if (r3 != 0) goto L55
            ekrg r6 = defpackage.vok.a
            ekrw r6 = r6.j()
            r2 = 60
            ekrw r6 = r6.h(r1, r0, r2, r4)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r0 = "Verifier logo is not a local resource. Not showing verification dialog."
            r6.q(r0)
            fctx r6 = defpackage.fctx.a
            return r6
        L55:
            vok r0 = r5.b
            voi r1 = new voi
            r1.<init>()
            ahax r6 = r0.e
            defpackage.ahaw.b(r6, r1)
            fctx r6 = defpackage.fctx.a
            return r6
        L64:
            r2 = move-exception
            ekrg r3 = defpackage.vok.a
            ekrw r3 = r3.j()
            ekrd r3 = (defpackage.ekrd) r3
            ekrw r2 = r3.g(r2)
            r3 = 50
            ekrw r0 = r2.h(r1, r0, r3, r4)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r6 = r6.d()
            java.lang.String r1 = "Unable to parse verifier logo URI: %s. Not showing verification dialog."
            r0.t(r1, r6)
            fctx r6 = defpackage.fctx.a
            return r6
        L85:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.voj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new voj(this.b, fcxyVar);
    }
}
