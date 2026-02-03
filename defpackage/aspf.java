package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aspf extends fcyz implements fdat {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ asph c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aspf(fcxy fcxyVar, String str, asph asphVar, String str2) {
        super(2, fcxyVar);
        this.b = str;
        this.c = asphVar;
        this.d = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aspf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: ActivityNotFoundException -> 0x0056, TRY_LEAVE, TryCatch #0 {ActivityNotFoundException -> 0x0056, blocks: (B:4:0x0007, B:7:0x0012, B:11:0x001e, B:13:0x0029, B:15:0x002f, B:19:0x003d), top: B:24:0x0005 }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto Lb
            defpackage.fctl.b(r5)     // Catch: android.content.ActivityNotFoundException -> L56
            goto L70
        Lb:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.e
            fdjx r5 = (defpackage.fdjx) r5
            java.lang.String r5 = r4.b     // Catch: android.content.ActivityNotFoundException -> L56
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: android.content.ActivityNotFoundException -> L56
            java.lang.String r3 = "FULL"
            if (r1 != 0) goto L3d
            if (r5 == 0) goto L28
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: android.content.ActivityNotFoundException -> L56
            java.lang.String r1 = r5.toUpperCase(r1)     // Catch: android.content.ActivityNotFoundException -> L56
            r1.getClass()     // Catch: android.content.ActivityNotFoundException -> L56
            goto L29
        L28:
            r1 = 0
        L29:
            boolean r1 = defpackage.fdgn.o(r1, r3)     // Catch: android.content.ActivityNotFoundException -> L56
            if (r1 != 0) goto L3d
            asph r1 = r4.c     // Catch: android.content.ActivityNotFoundException -> L56
            java.lang.String r3 = r4.d     // Catch: android.content.ActivityNotFoundException -> L56
            r4.a = r2     // Catch: android.content.ActivityNotFoundException -> L56
            java.lang.Object r5 = r1.c(r3, r5, r4)     // Catch: android.content.ActivityNotFoundException -> L56
            if (r5 == r0) goto L3c
            goto L70
        L3c:
            return r0
        L3d:
            asph r5 = r4.c     // Catch: android.content.ActivityNotFoundException -> L56
            java.lang.String r0 = r4.d     // Catch: android.content.ActivityNotFoundException -> L56
            akz r1 = r5.b(r3)     // Catch: android.content.ActivityNotFoundException -> L56
            fcsu r5 = r5.b     // Catch: android.content.ActivityNotFoundException -> L56
            java.lang.Object r5 = r5.b()     // Catch: android.content.ActivityNotFoundException -> L56
            afzc r5 = (defpackage.afzc) r5     // Catch: android.content.ActivityNotFoundException -> L56
            agew r3 = new agew     // Catch: android.content.ActivityNotFoundException -> L56
            r3.<init>(r1, r0)     // Catch: android.content.ActivityNotFoundException -> L56
            r5.h(r3)     // Catch: android.content.ActivityNotFoundException -> L56
            goto L70
        L56:
            ekrg r5 = defpackage.asph.a
            ekrw r5 = r5.j()
            r0 = 58
            java.lang.String r1 = "RbmWebviewHelperImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/business/RbmWebviewHelperImpl$launchCustomTabsIntent$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "Could not launch custom tabs for webview suggestion."
            r5.q(r0)
            r2 = 0
        L70:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aspf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aspf aspfVar = new aspf(fcxyVar, this.b, this.c, this.d);
        aspfVar.e = obj;
        return aspfVar;
    }
}
