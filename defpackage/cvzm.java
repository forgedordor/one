package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvzm extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvzp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvzm(cvzp cvzpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvzpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvzm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if (r7 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r7 != r0) goto L10;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            java.lang.String r2 = "has_pending_profile_photo_picker_result"
            r3 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Lf
            if (r1 == r3) goto L34
            goto L61
        Lf:
            cvzp r7 = r6.b
            lwn r1 = r7.g
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r1.d(r2, r4)
            ardk r1 = r7.j
            boolean r1 = r1.a()
            if (r1 == 0) goto L37
            fcsu r1 = r7.l
            java.lang.Object r1 = r1.b()
            afzc r1 = (defpackage.afzc) r1
            afzx r7 = r7.e
            r6.a = r3
            java.lang.Object r7 = r1.f(r7, r6)
            if (r7 == r0) goto L60
        L34:
            android.net.Uri r7 = (android.net.Uri) r7
            goto L63
        L37:
            fcsu r7 = r7.l
            java.lang.Object r7 = r7.b()
            afzc r7 = (defpackage.afzc) r7
            agau r1 = new agau
            aek r3 = new aek
            r3.<init>()
            aeg r4 = defpackage.aeg.a
            defpackage.aed.a()
            defpackage.aed.a()
            adv r4 = defpackage.adu.a(r4)
            java.lang.String r5 = "com.google.android.apps.messaging.ui.profilephotopicker"
            r1.<init>(r5, r3, r4)
            r3 = 2
            r6.a = r3
            java.lang.Object r7 = r7.f(r1, r6)
            if (r7 != r0) goto L61
        L60:
            return r0
        L61:
            android.net.Uri r7 = (android.net.Uri) r7
        L63:
            cvzp r0 = r6.b
            lwn r1 = r0.g
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.d(r2, r3)
            r0.b(r7)
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvzm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvzm(this.b, fcxyVar);
    }
}
