package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acev extends fcyz implements fdat {
    int a;
    final /* synthetic */ acex b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acev(acex acexVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = acexVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acev) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
    
        if (defpackage.fdxs.c(r12, r11) == r0) goto L28;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/gaia/signoutaccount/screen/SignOutAccountScreenUiAdapterImpl$onPositiveClick$1"
            java.lang.String r4 = "BugleAccountSignOut"
            r5 = 1
            r6 = 0
            java.lang.String r7 = "SignOutAccountScreenUiAdapterImpl.kt"
            defpackage.fctl.b(r12)
            if (r1 == 0) goto L17
            if (r1 == r5) goto L44
            goto Ldf
        L17:
            ekrg r12 = defpackage.acex.a
            ekrw r12 = r12.h()
            ekrz r1 = defpackage.eksq.a
            r12.X(r1, r4)
            r1 = 107(0x6b, float:1.5E-43)
            ekrw r12 = r12.h(r3, r2, r1, r7)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r1 = "User clicked positive button on sign out screen"
            r12.q(r1)
            acex r12 = r11.b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            fduf r8 = r12.l
            r8.f(r1)
            r11.a = r5
            accz r12 = r12.d
            java.lang.Object r12 = r12.a(r11)
            if (r12 == r0) goto Leb
        L44:
            accp r12 = (defpackage.accp) r12
            int r1 = r12.b
            accq r1 = defpackage.accq.b(r1)
            if (r1 != 0) goto L50
            accq r1 = defpackage.accq.UNRECOGNIZED
        L50:
            r1.getClass()
            accq r5 = defpackage.accq.PAS_READY_TO_SIGN_OUT
            if (r1 != r5) goto L5a
            acdi r1 = defpackage.acdi.SOAFS_SIGNING_OUT_NO_D13Y_TOGGLE
            goto L5c
        L5a:
            acdi r1 = defpackage.acdi.SOAFS_FAILED_TO_SIGN_OUT_UNKNOWN
        L5c:
            ekrg r8 = defpackage.acex.a
            ekrw r8 = r8.h()
            ekrz r9 = defpackage.eksq.a
            r8.X(r9, r4)
            ekrd r8 = (defpackage.ekrd) r8
            ekrz r4 = new ekrz
            java.lang.String r9 = "sign_out_account_finish_state"
            java.lang.Class<acdi> r10 = defpackage.acdi.class
            r4.<init>(r9, r10, r6, r6)
            r8.X(r4, r1)
            r4 = 120(0x78, float:1.68E-43)
            ekrw r2 = r8.h(r3, r2, r4, r7)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r3 = "Finishing sign out"
            r2.q(r3)
            acex r2 = r11.b
            fcsu r3 = r2.f
            java.lang.Object r3 = r3.b()
            acei r3 = (defpackage.acei) r3
            r1.getClass()
            fcsu r3 = r3.a
            java.lang.Object r3 = r3.b()
            ains r3 = (defpackage.ains) r3
            java.lang.String r4 = "Bugle.SignOutAccount.SignOutClicked.Count"
            int r1 = r1.a()
            r3.e(r4, r1)
            int r12 = r12.b
            accq r12 = defpackage.accq.b(r12)
            if (r12 != 0) goto Laa
            accq r12 = defpackage.accq.UNRECOGNIZED
        Laa:
            if (r12 != r5) goto Le8
            com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountArguments r12 = r2.c
            efwo r12 = r12.a
            if (r12 != 0) goto Lc7
            fcsu r12 = r2.g
            java.lang.Object r12 = r12.b()
            j$.util.Optional r12 = (j$.util.Optional) r12
            acet r1 = new acet
            r1.<init>()
            aceu r3 = new aceu
            r3.<init>()
            r12.ifPresent(r3)
        Lc7:
            fcsu r12 = r2.k
            java.lang.Object r12 = r12.b()
            cdku r12 = (defpackage.cdku) r12
            cdjs r1 = defpackage.cdjs.GSOS_INTENTIONALLY_SIGNED_OUT
            eiju r12 = r12.d(r1)
            r1 = 2
            r11.a = r1
            java.lang.Object r12 = defpackage.fdxs.c(r12, r11)
            if (r12 != r0) goto Ldf
            goto Leb
        Ldf:
            acex r12 = r11.b
            afzc r12 = r12.e
            agfx r0 = defpackage.agfx.a
            r12.h(r0)
        Le8:
            fctx r12 = defpackage.fctx.a
            return r12
        Leb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acev.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new acev(this.b, fcxyVar);
    }
}
