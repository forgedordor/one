package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xgk extends fcyz implements fdat {
    int a;
    final /* synthetic */ xgm b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgk(xgm xgmVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xgmVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xgk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r9 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r9.c(r1, com.google.android.apps.messaging.R.string.selfie_gif_multi_window_alert_text, r8) != r0) goto L23;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 0
            r3 = 1
            defpackage.fctl.b(r9)
            if (r1 == 0) goto Le
            if (r1 == r3) goto L73
            goto L5c
        Le:
            xgm r9 = r8.b
            zud r1 = r9.k
            boolean r1 = r1.a
            if (r1 == 0) goto L24
            android.content.Context r1 = r9.c
            r8.a = r3
            r3 = 2132087368(0x7f151248, float:1.981499E38)
            java.lang.Object r9 = r9.c(r1, r3, r8)
            if (r9 == r0) goto L5b
            goto L73
        L24:
            ekrg r1 = defpackage.xgm.a
            ekrw r1 = r1.e()
            ekrz r4 = defpackage.eksq.a
            java.lang.String r5 = "BugleSelfieGif"
            r1.X(r4, r5)
            r4 = 58
            java.lang.String r5 = "SelfieGifUiAdapterImpl.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/SelfieGifUiAdapterImpl$showPopup$2"
            java.lang.String r7 = "invokeSuspend"
            ekrw r1 = r1.h(r6, r7, r4, r5)
            ekrd r1 = (defpackage.ekrd) r1
            int r4 = r8.c
            r5 = 2
            if (r4 == r3) goto L4c
            if (r4 == r5) goto L49
            java.lang.String r4 = "SMART_SUGGESTION"
            goto L4e
        L49:
            java.lang.String r4 = "SHORTCUTS_SCREEN"
            goto L4e
        L4c:
            java.lang.String r4 = "CAMERA_GALLERY_BUTTON"
        L4e:
            java.lang.String r6 = "Selfie GIF popup opened from OpeningSource: %s"
            r1.t(r6, r4)
            r8.a = r5
            java.lang.Object r9 = r9.b(r8)
            if (r9 != r0) goto L5c
        L5b:
            return r0
        L5c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L73
            xgm r9 = r8.b
            int r0 = r8.c
            xge r1 = new xge
            r1.<init>()
            ahax r9 = r9.e
            r9.e(r1)
            r2 = r3
        L73:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xgk(this.b, this.c, fcxyVar);
    }
}
