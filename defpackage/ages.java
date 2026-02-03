package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ages implements afyy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/targets/ProfilePhotoPickerNavigationHandler");
    public final Context b;
    public final agax c;
    public final efwo d;
    public final egej e;
    private final fcyh f;
    private final fcsu g;
    private final ecyl h;

    public ages(Context context, agax agaxVar, efwo efwoVar, egej egejVar, ecyl ecylVar, fcyh fcyhVar, fcsu fcsuVar) {
        efwoVar.getClass();
        egejVar.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        this.b = context;
        this.c = agaxVar;
        this.d = efwoVar;
        this.e = egejVar;
        this.h = ecylVar;
        this.f = fcyhVar;
        this.g = fcsuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r6, java.lang.String r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.agep
            if (r0 == 0) goto L13
            r0 = r8
            agep r0 = (defpackage.agep) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            agep r0 = new agep
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            java.lang.String r3 = "output"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.String r7 = r0.e
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.fctl.b(r8)
            if (r7 == 0) goto L5e
            r0.a = r6
            r0.e = r7
            r0.d = r4
            java.lang.Object r8 = r5.c(r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5e
            ecyl r8 = r5.h
            android.content.Context r0 = r5.b
            r7.getClass()
            android.content.Intent r7 = r8.a(r0, r7)
            r7.putExtra(r3, r6)
            goto L74
        L5e:
            ecyl r7 = r5.h
            android.content.Context r8 = r5.b
            r0 = 0
            android.content.Intent r7 = r7.a(r8, r0)
            r7.putExtra(r3, r6)
            java.lang.String r6 = "com.google.profile.photopicker.INTENT_SIGNED_OUT"
            r7.putExtra(r6, r4)
            java.lang.String r6 = "skip_google_photos"
            r7.putExtra(r6, r4)
        L74:
            java.lang.String r6 = "com.google.profile.photopicker.SET_PHENOTYPE_CONTEXT"
            r7.putExtra(r6, r4)
            java.lang.String r6 = "hide_photos_of_you"
            r7.putExtra(r6, r4)
            java.lang.String r6 = "photo_accept_button_string"
            r8 = 2132083363(0x7f1502a3, float:1.9806866E38)
            r7.putExtra(r6, r8)
            java.lang.String r6 = "photo_picker_suggestion_tabs_title_string"
            r8 = 2132083361(0x7f1502a1, float:1.9806862E38)
            r7.putExtra(r6, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ages.a(android.net.Uri, java.lang.String, fcxy):java.lang.Object");
    }

    @Override // defpackage.afyy
    public final /* bridge */ /* synthetic */ Object b(afzx afzxVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.f), new ager(null, this, (ageo) afzxVar), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ageq
            if (r0 == 0) goto L13
            r0 = r5
            ageq r0 = (defpackage.ageq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ageq r0 = new ageq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L53
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.g
            java.lang.Object r5 = r5.b()
            r5.getClass()
            j$.util.Optional r5 = (j$.util.Optional) r5
            java.lang.Object r5 = defpackage.fdct.b(r5)
            cdiq r5 = (defpackage.cdiq) r5
            if (r5 == 0) goto L57
            efwo r2 = r4.d
            eiju r5 = r5.a(r2)
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto L56
        L53:
            cdjb r5 = (defpackage.cdjb) r5
            goto L58
        L56:
            return r1
        L57:
            r5 = 0
        L58:
            boolean r5 = r5 instanceof defpackage.cdiz
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ages.c(fcxy):java.lang.Object");
    }
}
