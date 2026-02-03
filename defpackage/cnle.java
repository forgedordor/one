package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnle extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmzw b;
    final /* synthetic */ cnlh c;
    final /* synthetic */ aubq d;
    final /* synthetic */ eqfw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnle(cmzw cmzwVar, cnlh cnlhVar, aubq aubqVar, eqfw eqfwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmzwVar;
        this.c = cnlhVar;
        this.d = aubqVar;
        this.e = eqfwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnle) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r12 != r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
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
            r2 = 1
            defpackage.fctl.b(r12)
            if (r1 == 0) goto Lf
            if (r1 == r2) goto La0
            r9 = r11
            goto Lba
        Lf:
            ejxr r12 = defpackage.crbf.ak
            java.lang.Object r1 = r12.get()
            cczi r1 = (defpackage.cczi) r1
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 0
            if (r1 == 0) goto La6
            cmzw r1 = r11.b
            if (r1 == 0) goto La6
            r11.a = r2
            java.lang.Object r12 = r12.get()
            cczi r12 = (defpackage.cczi) r12
            java.lang.Object r12 = r12.e()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9d
            cnih r1 = (defpackage.cnih) r1
            fcsu r12 = r1.b
            java.lang.Object r2 = r12.b()
            j$.util.Optional r2 = (j$.util.Optional) r2
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L9d
            aubq r2 = r1.d
            java.lang.String r2 = r2.d
            java.lang.Object r12 = r12.b()
            j$.util.Optional r12 = (j$.util.Optional) r12
            java.lang.Object r12 = r12.get()
            cgsa r12 = (defpackage.cgsa) r12
            java.lang.String r12 = r12.r()
            boolean r12 = defpackage.fdbq.f(r2, r12)
            if (r12 != 0) goto L74
            cczi r12 = defpackage.crbf.au
            java.lang.Object r12 = r12.e()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9d
        L74:
            ekrg r12 = defpackage.cnih.a
            ekrw r12 = r12.e()
            r2 = 82
            java.lang.String r4 = "PenpalAdditionalMetadataProvider.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/tachygram/chat/penpal/PenpalAdditionalMetadataProvider"
            java.lang.String r6 = "getPenpalConversationType"
            ekrw r12 = r12.h(r5, r6, r2, r4)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r2 = "Adding metadata for 1:Gemini message"
            r12.q(r2)
            fcyh r12 = r1.c
            fcyh r12 = defpackage.eicg.a(r12)
            cnif r2 = new cnif
            r2.<init>(r3, r1)
            java.lang.Object r12 = defpackage.fdin.a(r12, r2, r11)
            goto L9e
        L9d:
            r12 = r3
        L9e:
            if (r12 == r0) goto La4
        La0:
            r3 = r12
            fbrg r3 = (defpackage.fbrg) r3
            goto La6
        La4:
            r9 = r11
            goto Lb9
        La6:
            r7 = r3
            cnlh r4 = r11.c
            aubq r5 = r11.d
            eqfw r8 = r11.e
            r12 = 2
            r11.a = r12
            r10 = 2
            r6 = 0
            r9 = r11
            java.lang.Object r12 = defpackage.cnlh.i(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto Lba
        Lb9:
            return r0
        Lba:
            cnlh r0 = r9.c
            eqfo r12 = (defpackage.eqfo) r12
            fdjx r0 = r0.a
            cnkx r1 = new cnkx
            r1.<init>(r12, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnle.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnle(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
