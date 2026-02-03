package defpackage;

import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adhk implements adhd {
    public final fdjx a;
    public final ea b;
    public final dose c;
    public final doqz d;
    public final addt e;
    private final addy f;

    public adhk(fdjx fdjxVar, ea eaVar, dose doseVar, doqz doqzVar, addt addtVar, addy addyVar) {
        fdjxVar.getClass();
        addtVar.getClass();
        this.a = fdjxVar;
        this.b = eaVar;
        this.c = doseVar;
        this.d = doqzVar;
        this.e = addtVar;
        this.f = addyVar;
    }

    @Override // defpackage.adhd
    public final void a(GalleryContent galleryContent, int i) {
        galleryContent.getClass();
        auvw.k(lvk.a(this.b), null, null, new adhh(this, galleryContent, i, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.conversation.draft.model.GalleryContent r11, int r12, defpackage.fcxy r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.adhi
            if (r0 == 0) goto L13
            r0 = r13
            adhi r0 = (defpackage.adhi) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            adhi r0 = new adhi
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r13)
            return r13
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            int r12 = r0.b
            java.lang.Object r11 = r0.a
            defpackage.fctl.b(r13)
            goto L53
        L3a:
            defpackage.fctl.b(r13)
            dose r13 = r10.c
            java.lang.String r2 = r11.b()
            dorb r2 = defpackage.adhe.a(r2)
            r0.a = r11
            r0.b = r12
            r0.e = r4
            java.lang.Object r13 = r13.b(r2, r0)
            if (r13 == r1) goto Ldd
        L53:
            dosh r13 = (defpackage.dosh) r13
            if (r13 != 0) goto Ldc
            r13 = 0
            r0.a = r13
            r0.e = r3
            fdiu r13 = new fdiu
            fcxy r0 = defpackage.fcym.c(r0)
            r13.<init>(r0, r4)
            r13.B()
            ea r0 = r10.b
            fr r2 = r0.I()
            java.lang.String r3 = "photos_sharing_option_tray"
            ea r2 = r2.h(r3)
            if (r2 != 0) goto Ld1
            adgr r2 = new adgr
            r2.<init>()
            defpackage.eyhj.e(r2)
            com.google.android.apps.messaging.conversation.draft.model.GalleryContent r11 = (com.google.android.apps.messaging.conversation.draft.model.GalleryContent) r11
            java.lang.String r5 = r11.b()
            dorb r5 = defpackage.adhe.a(r5)
            r5.getClass()
            r2.an = r5
            dose r5 = r10.c
            addy r6 = r10.f
            java.lang.String r7 = r11.b()
            cczv r8 = defpackage.cgwx.a
            cczv r8 = defpackage.cgwx.e
            java.lang.Object r8 = r8.e()
            java.lang.String r8 = (java.lang.String) r8
            dors r9 = new dors
            r9.<init>(r13)
            r2.ah = r9
            dorn r9 = new dorn
            r9.<init>()
            r2.ai = r9
            r2.aj = r5
            r2.ao = r6
            r2.al = r7
            if (r8 == 0) goto Lb7
            r2.ak = r8
        Lb7:
            dorh r5 = r2.ag
            if (r5 == 0) goto Lbe
            r2.be()
        Lbe:
            r2.am = r4
            fr r0 = r0.I()
            r2.t(r0, r3)
            adgu r0 = r2.H()
            r0.a(r11)
            r0.c = r12
            goto Ld4
        Ld1:
            defpackage.fdir.a(r13)
        Ld4:
            java.lang.Object r11 = r13.m()
            if (r11 != r1) goto Ldb
            goto Ldd
        Ldb:
            return r11
        Ldc:
            return r13
        Ldd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adhk.b(com.google.android.apps.messaging.conversation.draft.model.GalleryContent, int, fcxy):java.lang.Object");
    }
}
